package com.example.jpa.publish.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.example.jpa.publish.model.Author;
import com.example.jpa.publish.model.Publication;

public interface PublicationRepository extends PagingAndSortingRepository<Publication, Long> {
	
	@Query("SELECT p FROM Publication p WHERE p.author = ?1")
	Page<Publication> getByAuthor(Author author, Pageable page);

}
