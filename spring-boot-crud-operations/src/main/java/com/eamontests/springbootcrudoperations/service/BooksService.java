package com.eamontests.springbootcrudoperations.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eamontests.springbootcrudoperations.model.Books;
import com.eamontests.springbootcrudoperations.repository.BooksRepository;

@Service
public class BooksService {

	@Autowired
	BooksRepository booksRepository;

	public List<Books> getAllBooks() {

		List<Books> bookList = new ArrayList<>();
		booksRepository.findAll().forEach(book -> bookList.add(book));

		return bookList;
	}

	public Books getBooksById(int id) {
		return booksRepository.findById(id).get();
	}

	public void saveORUpdate(Books books) {
		booksRepository.save(books);
	}

	public void delete(int id) {
		booksRepository.deleteById(id);

	}

	public void update(Books books, int bookId) {
		booksRepository.save(books);
	}

}
