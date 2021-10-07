package com.test.springWebApp.controllers;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.test.springWebApp.model.Book;
import com.test.springWebApp.repositories.BookRepository;
import org.junit.jupiter.api.Test;
import org.springframework.ui.ConcurrentModel;

class BookControllerTest {
    @Test
    void testConstructor() {
        // TODO: This test is incomplete.
        //   Reason: R002 Missing observers.
        //   Diffblue Cover was unable to create an assertion.
        //   Add getters for the following fields or make them package-private:
        //     BookController.bookRepository

        new BookController(mock(BookRepository.class));
    }

    @Test
    void testGetBooks() {
        BookRepository bookRepository = mock(BookRepository.class);
        when(bookRepository.findAll()).thenReturn((Iterable<Book>) mock(Iterable.class));
        BookController bookController = new BookController(bookRepository);
        assertEquals("books", bookController.getBooks(new ConcurrentModel()));
        verify(bookRepository).findAll();
    }
}

