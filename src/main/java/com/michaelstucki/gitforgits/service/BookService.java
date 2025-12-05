package com.michaelstucki.gitforgits.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.michaelstucki.gitforgits.repository.BookRepository;
import com.michaelstucki.gitforgits.model.Book;
import java.util.Optional;

/**
 * A service implements business logic.
 */
@Service
public class BookService {
    private final BookRepository bookRepository;

    @Autowired
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public Optional<Book> getBook(Long id) {
        return bookRepository.findById(id);
    }

    public Book saveBook(Book book) {
        return bookRepository.save(book);
    }
}
