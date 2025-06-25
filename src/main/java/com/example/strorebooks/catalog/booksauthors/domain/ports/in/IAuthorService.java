package com.example.strorebooks.catalog.booksauthors.domain.ports.in;

import com.example.strorebooks.catalog.booksauthors.infraestructure.adapter.out.model.Author;

import java.util.List;

public interface IAuthorService {

    Author create(Author author);
    Author update(Author author);
    Author findById(Long id);
    void delete(Long id);
    List<Author> findAll();
}
