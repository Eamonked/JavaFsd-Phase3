package com.eamontests.springbootcrudoperations.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.eamontests.springbootcrudoperations.model.Books;


public interface BooksRepository extends CrudRepository<Books, Integer> {
	
	
}
