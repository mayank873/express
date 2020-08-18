package com.library.Books.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@Entity
public class Book {
	
	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)
	private long id;
	
	private String title;
	private String author;
	

}
