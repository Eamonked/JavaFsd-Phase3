package com.eamontests.springbootcrudoperations.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.eamontests.springbootcrudoperations.model.Books;
import com.eamontests.springbootcrudoperations.service.BooksService;

@RestController
public class BooksController {

	@Autowired
	BooksService booksService;

	//CRUD OPerations
	
	
	
	//Read Operations
	@GetMapping("/books")
	private List<Books> getAllBooks(){
		return booksService.getAllBooks();
		
	}
	
	//Read - GET Operation For a Single Book
	@GetMapping("/books/{bookid}")
	private Books getBooks(@PathVariable("bookid") int bookId) {
		return booksService.getBooksById(bookId);
	}
	
	//Create - POST OPeration
	
	@PostMapping("/books")
	private int saveBook(@RequestBody Books books) {
		booksService.saveORUpdate(books);
		return books.getBookId();
		}
	
	//Update - PUT Operation
	@PutMapping("/books")
	private Books update(@RequestBody Books books) {
		booksService.saveORUpdate(books);
		return books;
		}
	
	//Delete OPeration
	@DeleteMapping("/books/{bookid}")
	private void deletebook(@PathVariable("bookid") int bookId) {
		booksService.delete(bookId);
	}
	
}
