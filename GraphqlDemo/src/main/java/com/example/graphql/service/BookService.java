package com.example.graphql.service;

import java.util.List;

import com.example.graphql.model.Book;

public interface BookService {
	
	List<Book> getAllBook();
	
	Book addBook(Book book);
	
	Book getByBookId(int bookId);
	
	void deleteBook(int bookId);
	
	Book editBook(Book book);

}
