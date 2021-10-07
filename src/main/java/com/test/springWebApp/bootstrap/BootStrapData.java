package com.test.springWebApp.bootstrap;

import com.test.springWebApp.model.Author;
import com.test.springWebApp.model.Book;
import com.test.springWebApp.model.Publisher;
import com.test.springWebApp.repositories.AuthorRepositary;
import com.test.springWebApp.repositories.BookRepository;
import com.test.springWebApp.repositories.PublisherRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner {

    private final AuthorRepositary authorRepositary;
    private final BookRepository bookRepository;
    private final PublisherRepository publisherRepository;

    public BootStrapData(AuthorRepositary authorRepositary, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepositary = authorRepositary;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Author jens = new Author("Jens");
        Book test = new Book("somebook");
        Publisher publisher = new Publisher("TestPublisher");
        publisherRepository.save(publisher);
        jens.getBooks().add(test);
        test.getAuthors().add(jens);

        authorRepositary.save(jens);
        bookRepository.save(test);
        publisherRepository.save(publisher);

        Author someOtherAuthor = new Author("Jens");
        Book someBook = new Book("somebook");
        someOtherAuthor.getBooks().add(someBook);
        someBook.getAuthors().add(someOtherAuthor);
        publisher.getBooks().add(someBook);

        authorRepositary.save(someOtherAuthor);
        bookRepository.save(someBook);
        publisherRepository.save(publisher);

        System.out.println("inBootstrap");
        System.out.println("numberOfBooks " + bookRepository.count());
        System.out.println(publisher.getBooks().size());

    }
}
