package com.example.strorebooks.catalog.booksauthors.infraestructure.adapter.out;

import com.example.strorebooks.catalog.booksauthors.infraestructure.adapter.out.model.Author;
import com.example.strorebooks.catalog.booksauthors.infraestructure.adapter.out.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IBookRepositoryPostgresql extends JpaRepository<Book, Long> {

   List<Book> findByEditorialId(Long editorialId);

   @Query("SELECT b.authors FROM Book b WHERE b.isbn = :isbn")
   List<Author> findAuthorsByBookIsbn(@Param("isbn") String isbn);

}
