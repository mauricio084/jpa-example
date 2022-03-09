package com.example.jpa.publish.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.jpa.publish.model.Publication;
import com.example.jpa.publish.services.IPublicationService;

@Component
@RequestMapping("publication")
public class PublicationRest {
	
	@Autowired
	IPublicationService publicationService;
	
	@GetMapping("byAuthor")
	Page<Publication> getByAuthor(@RequestParam("id") Long id){
		Page<Publication> byAuthor = publicationService.getByAuthor(id, PageRequest.of(0, 10));
		for (Publication publication : byAuthor) {
			publication.getAuthor().getPublicaciones();
		}
		
		return byAuthor;
	}

}
