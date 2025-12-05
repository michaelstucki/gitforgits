package com.michaelstucki.gitforgits.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

/**
 * This entity maps a table named Book
 * Spring Boot (with spring-boot-starter-data-jpa and spring-boot-starter-h2)
 * automatically configures an in-memory H2 database.
 * When app starts up, an in-memory schema is created.
 */

@Entity
public class Book {
    @Id
    private Long id;
    private String title;
    private String author;
    private String description;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
