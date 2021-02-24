package com.cursor.bookservice;

import com.cursor.bookservice.model.Book;
import com.cursor.bookservice.repository.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;

@RequiredArgsConstructor
public class BookServiceCLR implements CommandLineRunner {

    private final BookRepository bookRepository;


    @Override
    public void run(String... args) throws Exception {
        Book book1 = Book.builder()
                .name("some book 1 name")
                .releaseDate(2015)
                .numOfPages(159)
                .build();

        Book book2 = Book.builder()
                .name("some book 2 name")
                .releaseDate(2003)
                .numOfPages(234)
                .build();

        Book book3 = Book.builder()
                .name("some book 3 name")
                .releaseDate(1998)
                .numOfPages(541)
                .build();

        bookRepository.save(book1);
        bookRepository.save(book2);
        bookRepository.save(book3);
    }
}
