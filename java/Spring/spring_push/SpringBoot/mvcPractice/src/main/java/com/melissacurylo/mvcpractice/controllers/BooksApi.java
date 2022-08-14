package com.melissacurylo.mvcpractice.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.melissacurylo.mvcpractice.models.Book;
import com.melissacurylo.mvcpractice.services.BookService;


// APIs should respond with different error codes/messages
// Errors flow is implemented once views are handled

// RestController is for back-end sending information; not for web application 
// Can use @Autowired here to import the services file (Option 2 for importing) 

@RestController
// Can add below @RestController the @RequestMapping("/api) here which would be the API part 

public class BooksApi {
	// private final BookService bookService tells us that we are going to be
	//     using bookService and it will not be changing; dependency injection
	//     is used to make it available to the controller. 
    private final BookService bookService;  // gives access to use services file; this is option 1 for importing services
    
    //
    public BooksApi(BookService bookService){  // this is
        this.bookService = bookService;
    }
    
    
    
    @RequestMapping("/api/books")
    public List<Book> index() {
        return bookService.allBooks();
    }
    
    
    @RequestMapping("/api/books/{id}")
    public Book show(@PathVariable("id") Long id) {
      Book book = bookService.findBook(id);
      return book;
    }
    
    
    
    @RequestMapping(value="/api/books", method=RequestMethod.POST)
    public Book create(
		  @RequestParam(value="title") String title, 
		  @RequestParam(value="description") String description, 
		  @RequestParam(value="language") String language, 
		  @RequestParam(value="pages") Integer numOfPages) {
      Book book = new Book(title, description, language, numOfPages);
      return bookService.createBook(book);
    }
    
    
    
    
    
    // {id} is the variable being sent through the URL
    //     collecting values in the body of the request
    //     this is a PUT request which is not expecting to get any of the 
    //     values in the URL itself with query parameters instead it will 
    //     send it in the through the body of the request so we can't see it
    //     in the URL -- use postman for testing what is being added
    //     the param value is what is used for postman so value="title", etc
    
    
    
    //RequestMapping 
    @RequestMapping(value="/api/books/{id}", method=RequestMethod.PUT)
    public Book update(
    		@PathVariable("id") Long id, 
    		@RequestParam(value="title") String title, 
    		@RequestParam(value="description") String description, 
    		@RequestParam(value="language") String language,
    		@RequestParam(value="pages") Integer numOfPages) {
    	
    	// can create book instance being sent to the data base either in Controller of in Services
    		//  if in controller (here) would pass in all the information through updateBook  
    		//  as updateBook(id, title, description, language, numOfPages)
    	
    	// did second option and created in controller
    	// Book book = new Book is creating a temporary instance of book and passes in all @RequestParams
    	//  must be passed in the same order as laid out in Book class constructor which is the @Entity file
    	// 	note: desc is a keyword in MySQL, write out description
    	//  When save() method is reached then the temporary instance will overwrite the current book and update it
    			//  Creating a book and using the save() method from repository and checking if the book has an id and 
        Book book = new Book(title, description, language, numOfPages); 
        book.setId(id);  // Since this is setting id to the id that is already in the database, when this is saved it will overwrite the existing book in db
        					// the reason why there should be getters/setters even for id
        book = bookService.updateBook(book);  // always assign to whatever is being returned
        return book;
    }
    
    
    // request method is .DELETE
    // only need to pass through the id and set URL path
    // add delete method to service
    @RequestMapping(value="/api/books/{id}", method=RequestMethod.DELETE)
    public void destroy(@PathVariable("id") Long id) {
        bookService.deleteBook(id);
    }
    
    
    
    
    
    
    
    
}