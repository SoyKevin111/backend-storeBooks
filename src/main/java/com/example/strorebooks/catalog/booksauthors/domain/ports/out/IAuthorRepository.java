package com.example.strorebooks.catalog.booksauthors.domain.ports.out;

import com.example.strorebooks.catalog.booksauthors.infraestructure.adapter.out.model.Author;

import java.util.List;
import java.util.Optional;

public interface IAuthorRepository {
    Author save(Author author);
    void deleteById(Long id);
    Optional<Author> findById(Long id);
    List<Author> findAll();
}
