package com.example.jpa.publish.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.example.jpa.publish.model.Publication;
import com.example.jpa.publish.repositories.AuthorRepository;
import com.example.jpa.publish.repositories.PublicationRepository;
import com.example.jpa.publish.services.IPublicationService;

@Service
public class PublicationService implements IPublicationService {

	@Autowired
	PublicationRepository publicationRepository;
	
	@Autowired
	AuthorRepository authorRepository;
	
	@Override
	public Page<Publication> getByAuthor(Long author, Pageable page){
		return publicationRepository.getByAuthor(authorRepository.findById(author).get(), page);
	}
	
	
}
