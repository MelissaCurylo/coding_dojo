package com.melissacurylo.booksapi.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.melissacurylo.booksapi.models.Book;
import com.melissacurylo.booksapi.repositories.BookRepository;

@Service
public class BookService {

	// attribute to use interface
	private final BookRepository bookRepository;
	
	
	// dependency injection
	public BookService(BookRepository bookRepository) {
		this.bookRepository = bookRepository;
	}
	
	
	// methods from Repository
	public List<Book> allBooks(){
		return bookRepository.findAll();
	}

	
	public Book createBook(Book b) {
		return bookRepository.save(b);
	}
	
	
	// optional for if book exists - will return book or null
	public Book findBook(Long id) {
		Optional<Book> optionalBook = bookRepository.findById(id);
		
		if(optionalBook.isPresent()) {
			return optionalBook.get(); // returns an object if book exists
		} else {
			return null; 
		}
	}
	
	
	public Book updateBook(Book book) {
		return bookRepository.save(book);
	}
	
	
	public void deleteBook(Long id) {
		Optional<Book> optionalBook= bookRepository.findById(id);
		if(optionalBook.isPresent()) {
			bookRepository.deleteById(id);
		}	
	}
	
	
}
