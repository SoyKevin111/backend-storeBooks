package com.example.strorebooks.catalog.booksauthors.application.mapping;

import com.example.strorebooks.catalog.booksauthors.infraestructure.adapter.in.dto.BookRequest;
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


   public Book createBookMapping(BookRequest bookRequest) {
      return buildBookFromRequest(bookRequest, null, true);
   }

   public Book updateBookMapping(BookRequest bookRequest, Long id) {
      Book existingBook = bookRepository.findById(id)
         .orElseThrow(() -> new ServerInternalError(ErrorType.DB_ERROR.name(), "Book not found with id: " + id));
      return buildBookFromRequest(bookRequest, existingBook, false);
   }

   private Book buildBookFromRequest(BookRequest bookRequest, Book existingBook, boolean isNew) {
      Set<Author> authors = bookRequest.getAuthors().stream()
         .map(authorId -> authorRepository.findById(authorId)
            .orElseThrow(() -> new ServerInternalError(ErrorType.DB_ERROR.name(), "Author not found with id: " + authorId)))
         .collect(Collectors.toSet());

      Editorial editorial = editorialRepository.findById(bookRequest.getEditorialId())
         .orElseThrow(() -> new ServerInternalError(ErrorType.DB_ERROR.name(), "Editorial not found with id: " + bookRequest.getEditorialId()));

      return Book.builder()
         .id(isNew ? null : existingBook.getId())
         .isbn(isNew ? null : existingBook.getIsbn())
         .title(bookRequest.getTitle())
         .description(bookRequest.getDescription())
         .price(bookRequest.getPrice())
         .stock(bookRequest.getStock())
         .dateCreated(isNew ? bookRequest.getDateCreated() : existingBook.getDateCreated())
         .bestSeller(bookRequest.getBestSeller())
         .coverURL(null)
         .category(bookRequest.getCategory())
         .editorial(editorial)
         .authors(authors)
         .build();
   }


}
