package com.example.graphql.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.graphql.model.Book;
import com.example.graphql.repository.BookRepo;

@Service
public class BookServiceimpl implements BookService{
	
	@Autowired
	private BookRepo bookRepo;

	@Override
	public List<Book> getAllBook() {
		return bookRepo.findAll();
	}

	@Override
	public Book addBook(Book book) {
		return bookRepo.save(book);
	}

	@Override
	public Book getByBookId(int bookId) {
		return bookRepo.findById(bookId).get();
	}

	@Override
	public void deleteBook(int bookId) {
		bookRepo.deleteById(bookId);
		
	}

	@Override
	public Book editBook(Book book) {
		/*
		 * Book data = bookRepo.findById(book.getId()).get();
		 * data.setTitle(book.getTitle()); data.setDescription(book.getDescription());
		 * data.setAuthor(book.getAuthor()); data.setPrice(book.getPrice());
		 * data.setPages(book.getPages());
		 */
		return bookRepo.save(book);
	}
	
	

}
