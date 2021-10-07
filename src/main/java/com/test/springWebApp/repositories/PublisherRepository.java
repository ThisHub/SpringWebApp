package com.test.springWebApp.repositories;

import com.test.springWebApp.model.Book;
import com.test.springWebApp.model.Publisher;
import org.springframework.data.repository.CrudRepository;


public interface PublisherRepository extends CrudRepository<Publisher, Integer> {
}
