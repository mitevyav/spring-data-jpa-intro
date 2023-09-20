package com.springguru.springdatajpaintro.bootstrap;

import com.springguru.springdatajpaintro.domain.Book;
import com.springguru.springdatajpaintro.repositories.BookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Profile({"local", "default"})
@Component
public class DataInitializer implements CommandLineRunner {

    private final BookRepository bookRepository;

    public DataInitializer(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        bookRepository.deleteAll();

        Book bookDDD = new Book("Domain Driven Design", "123", "Random House");
        Book savedDDD = bookRepository.save(bookDDD);
        System.out.println("Saved Book: " + savedDDD);


        Book bookSIA = new Book("Spring in Action", "456", "O'Reilly");
        Book savedSIA = bookRepository.save(bookSIA);
        System.out.println("Saved Book: " + savedSIA);

        bookRepository.findAll().forEach(System.out::println);
    }
}
