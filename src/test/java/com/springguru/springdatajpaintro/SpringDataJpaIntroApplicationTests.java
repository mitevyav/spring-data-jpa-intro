package com.springguru.springdatajpaintro;

import com.springguru.springdatajpaintro.repositories.BookRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest
class SpringDataJpaIntroApplicationTests {
	@Autowired
	BookRepository bookRepository;

	@Test
	void testBookRepository() {
		var count = bookRepository.count();

		assertThat(count).isGreaterThan(0);
	}

	@Test
	void contextLoads() {
	}

}
