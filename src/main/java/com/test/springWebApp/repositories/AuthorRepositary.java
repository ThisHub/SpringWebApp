package com.test.springWebApp.repositories;

import com.test.springWebApp.model.Author;
import org.springframework.data.repository.CrudRepository;


public interface AuthorRepositary extends CrudRepository<Author, Integer> {
}
