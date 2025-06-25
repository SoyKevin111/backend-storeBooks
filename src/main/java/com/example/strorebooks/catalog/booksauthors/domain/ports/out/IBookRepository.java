package com.example.strorebooks.catalog.booksauthors.domain.ports.out;

import com.example.strorebooks.catalog.booksauthors.infraestructure.adapter.out.model.Book;

import java.util.List;
import java.util.Optional;

public interface IBookRepository {
    Book save(Book book);
    void deleteById(Long id);
    Optional<Book> findById(Long id);
    List<Book> findAll();
}
