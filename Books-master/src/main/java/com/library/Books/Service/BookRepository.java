package com.library.Books.Service;


import org.springframework.data.jpa.repository.JpaRepository;

import com.library.Books.Entity.Book;

public interface BookRepository extends JpaRepository<Book, Long> {

}
