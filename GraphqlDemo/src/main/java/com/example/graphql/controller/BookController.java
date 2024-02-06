package com.example.graphql.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import com.example.graphql.model.Book;
import com.example.graphql.service.BookService;

@Controller
public class BookController {

	@Autowired
	private BookService bookService;

	@QueryMapping("getAllBook")
	public List<Book> getAllBooks() {
		return bookService.getAllBook();
	}

	@QueryMapping("getBookById")
	public Book getByBookId(@Argument int bookId) {
		return bookService.getByBookId(bookId);
	}

	@MutationMapping("addBook")
	public Book addBook(@Argument("input") Book book) {
		return bookService.addBook(book);
	}
	
	@MutationMapping("deleteBook")
	public String deleteBook(@Argument int bookId) {
		bookService.deleteBook(bookId);
		return "Deleted Successfully";
	}
	
	@MutationMapping("editBook")
	public Book editBook(@Argument("input") Book book) {
		return bookService.editBook(book);
	}

}


