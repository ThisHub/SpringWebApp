package com.test.springWebApp.repositories;

import com.test.springWebApp.model.Author;
import com.test.springWebApp.model.Book;
import org.springframework.data.repository.CrudRepository;


public interface BookRepository extends CrudRepository<Book, Integer> {
}
