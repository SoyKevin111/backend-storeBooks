package com.example.strorebooks.catalog.booksauthors.application;

import com.example.strorebooks.catalog.booksauthors.infraestructure.adapter.in.dto.BookRequest;
import com.example.strorebooks.catalog.booksauthors.infraestructure.adapter.out.model.Author;
import com.example.strorebooks.catalog.booksauthors.infraestructure.adapter.out.model.Book;

import com.example.strorebooks.catalog.booksauthors.infraestructure.adapter.out.repositories.AuthorRepository;
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


   public Book saveBookMapping(BookRequest bookRequest) {
      Set<Author> authors = bookRequest.getAuthors().stream()
         .map(authorId -> authorRepository.findById(authorId)
            .orElseThrow(() -> new ServerInternalError(ErrorType.DB_ERROR.name(), "Author not found with id: " + authorId)))
         .collect(Collectors.toSet());

      Editorial editorial = editorialRepository.findById(bookRequest.getEditorialId())
         .orElseThrow(() -> new ServerInternalError(ErrorType.DB_ERROR.name(), "Editorial not found"));

      Book book = new Book();
      book.setId(bookRequest.getId());
      book.setIsbn(bookRequest.getIsbn());
      book.setTitle(bookRequest.getTitle());
      book.setDatePublication(bookRequest.getDatePublication());
      book.setPrice(bookRequest.getPrice());
      book.setStock(bookRequest.getStock());
      book.setCoverURL(bookRequest.getCoverURL());
      book.setCategory(bookRequest.getCategory());
      book.setAuthors(authors);
      book.setEditorial(editorial);
      return book;
   }

}
