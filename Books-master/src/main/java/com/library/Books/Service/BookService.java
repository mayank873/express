package com.library.Books.Service;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import com.library.Books.Entity.Book;
import com.library.Books.Entity.Library;

@Service
public class BookService {

	@Autowired
	BookRepository bookRepo;
	@Autowired
    ResourceLoader resourceLoader;


	public List<Book> getAllBooks() {
		
		ArrayList<Book> books = new ArrayList<Book>();

		ObjectMapper mapper = new ObjectMapper(new YAMLFactory());
		try {
			//File file = new File("Books.yaml");


			File file = resourceLoader.getResource("classpath:library.yaml").getFile();
			Library library = mapper.readValue(file, Library.class);
			books.addAll(library.getBooks());

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return books;
	}

}
