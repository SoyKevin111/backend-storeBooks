package com.example.strorebooks.catalog.booksauthors.infraestructure.adapter.out;

import com.example.strorebooks.catalog.booksauthors.infraestructure.adapter.out.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAuthorRepositoryPostgresql extends JpaRepository<Author, Long> {
   boolean existsByIdentityNumber(String identityNumber);
}
