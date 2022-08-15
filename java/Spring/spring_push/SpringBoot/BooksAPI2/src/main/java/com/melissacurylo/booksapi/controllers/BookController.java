package com.melissacurylo.booksapi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.melissacurylo.booksapi.models.Book;
import com.melissacurylo.booksapi.services.BookService;



@Controller
public class BookController {
	
	@Autowired
	BookService bookService; 
	
	
	
	@GetMapping("/")
	public String bookHome(Model model) {
		return "redirect:/books";
	}
	
	
	
	@GetMapping("/books")
	public String index(Model model) {
		
		List<Book> books = bookService.allBooks();
		
		model.addAttribute("books", books);
		
		return "index.jsp";
	}
	
	
	
	@GetMapping("/books/{id}")
	public String show(@PathVariable("id") Long id, Model model) {
		
		Book book = bookService.findBook(id);
		
		model.addAttribute("book", book);
		
		return "show.jsp";
		
	}

}
