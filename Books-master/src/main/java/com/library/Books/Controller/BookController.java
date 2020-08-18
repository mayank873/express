package com.library.Books.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.library.Books.Entity.Book;
import com.library.Books.Service.BookService;

@RestController
@RequestMapping("/v1")
public class BookController {
	
	@Autowired
	BookService bookService;
	
	
	@GetMapping("/books")
	public List<Book> getAllBooks(){
		
		return bookService.getAllBooks();
		
	}

}
