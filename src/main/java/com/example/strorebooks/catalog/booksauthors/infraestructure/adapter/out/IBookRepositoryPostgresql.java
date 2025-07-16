package com.example.strorebooks.catalog.booksauthors.infraestructure.adapter.out;

import com.example.strorebooks.catalog.booksauthors.infraestructure.adapter.out.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IBookRepositoryPostgresql extends JpaRepository<Book, Long> {
   List<Book> findByEditorialId(Long editorialId);

}
