package com.example.jpa.publish.repositories;

import org.springframework.data.repository.CrudRepository;

import com.example.jpa.publish.model.Author;

public interface AuthorRepository extends CrudRepository<Author, Long> {

}
