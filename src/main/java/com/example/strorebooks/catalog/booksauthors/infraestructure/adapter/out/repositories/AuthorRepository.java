package com.example.strorebooks.catalog.booksauthors.infraestructure.adapter.out.repositories;

import com.example.strorebooks.catalog.booksauthors.domain.ports.out.IAuthorRepository;
import com.example.strorebooks.catalog.booksauthors.infraestructure.adapter.out.model.Author;
import com.example.strorebooks.catalog.booksauthors.infraestructure.adapter.out.IAuthorRepositoryPostgresql;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class AuthorRepository implements IAuthorRepository {

    @Autowired
    private IAuthorRepositoryPostgresql repository;

    @Override
    public Author save(Author author) {
        return this.repository.save(author);
    }

    @Override
    public void deleteById(Long id) {
        this.repository.deleteById(id);
    }

    @Override
    public Optional<Author> findById(Long id) {
        return this.repository.findById(id);
    }

    @Override
    public List<Author> findAll() {
        return this.repository.findAll();
    }

}
