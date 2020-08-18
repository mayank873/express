package com.library.Books.Entity;

import java.util.List;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor

public class Library {

	private List<Book> books;

}
