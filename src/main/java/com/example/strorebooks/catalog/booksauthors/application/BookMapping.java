package com.example.strorebooks.catalog.booksauthors.application;

import com.example.strorebooks.catalog.booksauthors.infraestructure.adapter.in.dto.BookRequest;
import com.example.strorebooks.catalog.booksauthors.infraestructure.adapter.out.model.Author;
import com.example.strorebooks.catalog.booksauthors.infraestructure.adapter.out.model.Book;

import com.example.strorebooks.catalog.booksauthors.infraestructure.adapter.out.repositories.AuthorRepository;
import org.springframework.stereotype.Component;

import java.util.Set;
import java.util.stream.Collectors;

@Component
public class BookMapping {

    private final AuthorRepository authorRepository;

    public BookMapping(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    public Book saveBookMapping(BookRequest bookRequest) {
        Set<Author> authors = bookRequest.getAuthors().stream()
                .map(authorId -> authorRepository.findById(authorId)
                        .orElseThrow(() -> new RuntimeException("Author not found with id: " + authorId)))
                .collect(Collectors.toSet());

        Book book = new Book();
        book.setId(bookRequest.getId());
        book.setISBN(bookRequest.getISBN());
        book.setTitle(bookRequest.getTitle());
        book.setDatePublication(bookRequest.getDatePublication());
        book.setPrice(bookRequest.getPrice());
        book.setStock(bookRequest.getStock());
        book.setCoverURL(bookRequest.getCoverURL());
        book.setCategory(bookRequest.getCategory());
        book.setAuthors(authors);
        return book;
    }

}
