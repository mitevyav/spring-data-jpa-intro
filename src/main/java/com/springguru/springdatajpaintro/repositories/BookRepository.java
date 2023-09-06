package com.springguru.springdatajpaintro.repositories;

import com.springguru.springdatajpaintro.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
