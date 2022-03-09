package com.example.jpa.publish.services;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.example.jpa.publish.model.Publication;

public interface IPublicationService {

	Page<Publication> getByAuthor(Long author, Pageable page);

}
