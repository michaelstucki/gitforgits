package com.michaelstucki.gitforgits.web;

import com.michaelstucki.gitforgits.model.Book;
import com.michaelstucki.gitforgits.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

/**
 * A controller exposes endpoints and handles HTTP requests and responses.
 */
@RestController
@RequestMapping("/api/books")
public class BookController {
    private final BookService service;

    @Autowired
    public BookController(BookService service) {
        this.service = service;
    }

    @GetMapping("/{id}")
    public Optional<Book> getBookById(@PathVariable Long id) {
        return service.getBook(id);
    }

    @PostMapping
    public Book createBook(@RequestBody Book book) {
        return service.saveBook(book);
    }
}
