package com.example.strorebooks.catalog.booksauthors.domain.ports.in;

import com.example.strorebooks.catalog.booksauthors.infraestructure.adapter.out.model.Book;

import java.util.List;

public interface IBookService {
    Book create(Book book);
    Book update(Book book);
    void delete(Long id);
    Book findById(Long id);
    List<Book> findAll();
}
