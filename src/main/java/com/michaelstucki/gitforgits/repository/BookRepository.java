package com.michaelstucki.gitforgits.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.michaelstucki.gitforgits.model.Book;

/**
 * This repository enables CRUD operations on Book w/o writing SQL queries.
 * Spring Boot creates an implementation of this interface at runtime.
 * A repository manages data operations.
 */
public interface BookRepository extends JpaRepository<Book, Long> {
}
