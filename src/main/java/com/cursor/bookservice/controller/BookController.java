package com.cursor.bookservice.controller;

import com.cursor.bookservice.model.Book;
import com.cursor.bookservice.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/")
@RequiredArgsConstructor
public class BookController {
    private final BookService bookService;

    @GetMapping("/books/add/")
    public Book addBook(@RequestBody Book book) {
        return bookService.addBook(book);
    }

    @GetMapping("/books/delete/{id}")
    public void deleteBook(@PathVariable Long id) {
        bookService.deleteBookById(id);
    }

    @GetMapping("/books/get/{id}")
    public Optional<Book> findBook(@PathVariable Long id) {
        return bookService.findBookById(id);
    }

    @GetMapping("/books")
    public List<Book> findAllBooks() {
        return bookService.findAllBooks();
    }
}
