package com.example.strorebooks.catalog.booksauthors.application.mapping;

import com.example.strorebooks.catalog.booksauthors.infraestructure.adapter.in.dto.BookCreateRequest;
import com.example.strorebooks.catalog.booksauthors.infraestructure.adapter.in.dto.BookUpdateRequest;
import com.example.strorebooks.catalog.booksauthors.infraestructure.adapter.out.model.Author;
import com.example.strorebooks.catalog.booksauthors.infraestructure.adapter.out.model.Book;

import com.example.strorebooks.catalog.booksauthors.infraestructure.adapter.out.repositories.AuthorRepository;
import com.example.strorebooks.catalog.booksauthors.infraestructure.adapter.out.repositories.BookRepository;
import com.example.strorebooks.catalog.editorial.infraestructure.adapter.out.repositories.EditorialRepository;
import com.example.strorebooks.catalog.editorial.infraestructure.adapter.out.model.Editorial;

import com.example.strorebooks.handlerError.application.ServerInternalError;
import com.example.strorebooks.handlerError.infraestructure.model.ErrorType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Set;
import java.util.stream.Collectors;

@Component
public class BookMapping {

   @Autowired
   private AuthorRepository authorRepository;
   @Autowired
   private EditorialRepository editorialRepository;
   @Autowired
   private BookRepository bookRepository;


   public Book createBookMapping(BookCreateRequest bookCreateRequest) {
      Set<Author> authors = bookCreateRequest.getAuthors().stream()
         .map(authorId -> authorRepository.findById(authorId)
            .orElseThrow(() -> new ServerInternalError(ErrorType.DB_ERROR.name(), "Author not found with id: " + authorId)))
         .collect(Collectors.toSet());

      Editorial editorial = editorialRepository.findById(bookCreateRequest.getEditorialId())
         .orElseThrow(() -> new ServerInternalError(ErrorType.DB_ERROR.name(), "Editorial not found"));


      return Book.builder()
         .title(bookCreateRequest.getTitle())
         .isbn("")
         .description(bookCreateRequest.getDescription())
         .price(bookCreateRequest.getPrice())
         .stock(bookCreateRequest.getStock())
         .createdAt(bookCreateRequest.getCreatedAt())
         .bestSellers(bookCreateRequest.getBestSellers())
         .coverURL(bookCreateRequest.getCoverURL())
         .category(bookCreateRequest.getCategory())
         .editorial(editorial)
         .authors(authors)
         .build();
   }

   public Book updateBookMapping(BookUpdateRequest bookUpdateRequest, Long id) {
      Set<Author> authors = bookUpdateRequest.getAuthors().stream()
         .map(authorId -> authorRepository.findById(authorId)
            .orElseThrow(() -> new ServerInternalError(ErrorType.DB_ERROR.name(), "Author not found with id: " + authorId)))
         .collect(Collectors.toSet());

      Editorial editorial = editorialRepository.findById(bookUpdateRequest.getEditorialId())
         .orElseThrow(() -> new ServerInternalError(ErrorType.DB_ERROR.name(), "Editorial not found with id: "+bookUpdateRequest.getEditorialId()));

      Book book = this.bookRepository.findById(id)
         .orElseThrow(() -> new ServerInternalError(ErrorType.DB_ERROR.name(), "Book not found with id: " + id));

      return Book.builder()
         .id(book.getId())
         .isbn(book.getIsbn())
         .title(bookUpdateRequest.getTitle())
         .description(bookUpdateRequest.getDescription())
         .price(bookUpdateRequest.getPrice())
         .stock(bookUpdateRequest.getStock())
         .createdAt(book.getCreatedAt())
         .bestSellers(bookUpdateRequest.getBestSellers())
         .coverURL(bookUpdateRequest.getCoverURL())
         .category(bookUpdateRequest.getCategory())
         .editorial(editorial)
         .authors(authors)
         .build();
   }

}
