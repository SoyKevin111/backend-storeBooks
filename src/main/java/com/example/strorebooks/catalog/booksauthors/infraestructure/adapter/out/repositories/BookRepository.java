package com.example.strorebooks.catalog.booksauthors.infraestructure.adapter.out.repositories;

import com.example.strorebooks.catalog.booksauthors.domain.ports.out.IBookRepository;
import com.example.strorebooks.catalog.booksauthors.infraestructure.adapter.out.IBookRepositoryPostgresql;
import com.example.strorebooks.catalog.booksauthors.infraestructure.adapter.out.model.Author;
import com.example.strorebooks.catalog.booksauthors.infraestructure.adapter.out.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


@Repository
public class BookRepository implements IBookRepository {
   @Autowired
   private IBookRepositoryPostgresql repository;

   @Override
   public Book save(Book book) {
      return this.repository.save(book);
   }

   @Override
   public void deleteById(Long id) {
      this.repository.deleteById(id);
   }

   @Override
   public Optional<Book> findById(Long id) {
      return this.repository.findById(id);
   }

   @Override
   public List<Book> findAll() {
      return this.repository.findAll();
   }

   @Override
   public List<Book> findByEditorialId(Long editorialId) {
      return this.repository.findByEditorialId(editorialId);
   }

   @Override
   public List<Author> findAuthorsByBookIsbn(String isbn) {
      return this.repository.findAuthorsByBookIsbn(isbn);
   }

}
