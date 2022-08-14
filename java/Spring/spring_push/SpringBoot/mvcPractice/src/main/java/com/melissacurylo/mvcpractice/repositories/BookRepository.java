package com.melissacurylo.mvcpractice.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.melissacurylo.mvcpractice.models.Book;

// Repository is the file for all the queries 
// @Repository tells Spring that this interface is a repository and this will be how the dependencies are managed.
// CrudRepository --> allows for all CRUD operations - creating, reading, and deleting objects
// Book is the model and Long is the primary key type of ID listed in Book.java
@Repository
public interface BookRepository extends CrudRepository<Book, Long>{
	
	// queries can be customized based on certain format
	// queries are created behind the scene based on method signature
	
	// example method to find all books
	// method name = findAll()
	// JPA will create a query that does a 'select all' from the books table (automatically)
	// import for List is imported as import java.util.List;
	// See docs for Query Creation and Query Methods
	// https://docs.spring.io/spring-data/jpa/docs/current/reference/html/#jpa.query-methods.query-creation
	// Methods are used by implementing services
	
    List<Book> findAll();  // this method retrieves all the books from the database -- need to specify return type to JPA documentation
    List<Book> findByDescriptionContaining(String search); // this method finds books with descriptions containing the search string
    Long countByTitleContaining(String search);  // this method counts how many titles contain a certain string
    Long deleteByTitleStartingWith(String search);  // this method deletes a book that starts with a specific title

}
