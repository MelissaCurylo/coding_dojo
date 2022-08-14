package com.melissacurylo.mvcpractice.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.melissacurylo.mvcpractice.models.Book;
import com.melissacurylo.mvcpractice.repositories.BookRepository;




 //  The @Service annotation allows for declaring a class as a service 
//     and allows Spring to inject this class as a dependency in any controller
//     to access the database, will need to use dependency injection for the repository.

//  Service layer purpose is to perform any business logic before using repository
//        to perform queries.
//  Service is a controller for the back-end;


// Two ways to import repository (choose only one):
//
//    1. Option 1 is current below: private final BookRepository bookRepository;
//
//    2. Option 2 is with Autowired
//     Annotation inside public class BookService{}: 
//   				@Autowired
//                  private BookRepository bookRepository;
       


@Service 
public class BookService {
	// adding the book repository as a dependency
	// BookRepository will call all methods in the BookRepository.java file
	// bookRepository (the second one with lower-case) can be named anything and does not need be the same as repository
    private final BookRepository bookRepository;  // need this attribute in order to use the interface, will not work without it
    
    
    
    // dependency injection to make the methods available for use
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }
    
    
    // returns all the books -- calls on method  from BookRepository.java
    public List<Book> allBooks() {
        return bookRepository.findAll();  // returns all the books 
    }
    
    
    // creates a book
    // .save() method is called to update a resource, in this case a book
    public Book createBook(Book b) {
        return bookRepository.save(b);  // save saves a book in the database
    }
    
    
    // retrieves a book
    public Book findBook(Long id) {
    	
	// returns an optional and that means it can exist or not; 
	// if there is a book present return the book else return null
    	Optional<Book> optionalBook = bookRepository.findById(id);
    	if(optionalBook.isPresent()) {
            return optionalBook.get(); // using get() method to return object if it exists
        } else {
            return null; // if object does not exist then return will be null
        }
    	
    }
    
    
    // added updateBook 
    // alternate way done by adding 
    public Book updateBook(Book book) {
    	return bookRepository.save(book);
    }
    
    //  added delete a book via id - pass in the data type and the id
    //  void method because there is not return
    public void deleteBook(Long id) {
    	bookRepository.deleteById(id);  // start typing delete and Spring auto-populates based on parameters 
    }
    
    
    

}
