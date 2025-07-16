package com.example.strorebooks.catalog.booksauthors.application;

import com.example.strorebooks.catalog.booksauthors.domain.ports.in.IAuthorService;
import com.example.strorebooks.catalog.booksauthors.domain.ports.out.IAuthorRepository;
import com.example.strorebooks.catalog.booksauthors.domain.ports.out.IBookRepository;
import com.example.strorebooks.catalog.booksauthors.infraestructure.adapter.out.model.Author;
import com.example.strorebooks.catalog.booksauthors.infraestructure.adapter.out.model.Book;
import com.example.strorebooks.handlerError.application.ServerInternalError;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;

@Slf4j
@Service
public class AuthorService implements IAuthorService {

   @Autowired
   IAuthorRepository authorRepository;
   @Autowired
   IBookRepository bookRepository;

   @Override
   public Author create(Author author) {
      try {
         author.setId(null); // ID is null for new authors
         return authorRepository.save(author);
      } catch (Exception e) {
         log.error("Error creating author: {}", e.getMessage());
         throw new ServerInternalError("Error creating author");
      }
   }

   @Override
   public Author update(Author author) {
      try {
         if (author.getId() == null) {
            throw new ServerInternalError("Author ID must not be null for update");
         }
         return authorRepository.save(author);
      } catch (Exception e) {
         log.error("Error updating author: {}", e.getMessage());
         throw new ServerInternalError("Error updating author");
      }
   }

   @Override
   public void delete(Long id) {
      try {
         Author author = authorRepository.findById(id)
            .orElseThrow(() -> new ServerInternalError("Author not found"));

         for (Book book : new HashSet<>(author.getBooks())) {
            book.getAuthors().remove(author);
         }
         author.getBooks().clear();

         authorRepository.deleteById(author.getId());

      } catch (Exception e) {
         log.error("Error deleting author: {}", e.getMessage(), e);
         throw new ServerInternalError("Error deleting author");
      }
   }


   @Override
   public Author findById(Long id) {
      try {
         return authorRepository.findById(id)
            .orElseThrow(() -> new ServerInternalError("Author not found"));
      } catch (Exception e) {
         log.error("Error finding author by id: {}", e.getMessage());
         throw new ServerInternalError("Error finding author by id");
      }
   }


   @Override
   public List<Author> findAll() {
      try {
         return authorRepository.findAll();
      } catch (Exception e) {
         log.error("Error finding all authors: {}", e.getMessage());
         throw new ServerInternalError("Error finding all authors");
      }
   }
}
