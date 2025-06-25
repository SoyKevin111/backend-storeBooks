package com.example.strorebooks.catalog.booksauthors.application;

import com.example.strorebooks.catalog.booksauthors.domain.ports.in.IAuthorService;
import com.example.strorebooks.catalog.booksauthors.domain.ports.in.IBookService;
import com.example.strorebooks.catalog.booksauthors.domain.ports.out.IBookRepository;
import com.example.strorebooks.catalog.booksauthors.infraestructure.adapter.out.model.Author;
import com.example.strorebooks.catalog.booksauthors.infraestructure.adapter.out.model.Book;
import com.example.strorebooks.handlerError.application.ServerInternalError;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class BookService implements IBookService {
    
    @Autowired
    private IBookRepository bookRepository;
    
    @Override
    public Book create(Book book) {
        try {
            book.setId(null); // Ensure ID is null for new books
            return bookRepository.save(book);
        } catch (Exception e) {
            log.error("Error creating book: {}", e.getMessage());
            throw new ServerInternalError("Error creating book");
        }
    }

    @Override
    public Book update(Book book) {
        try {
            if (book.getId() == null) {
                throw new ServerInternalError("Book ID must not be null for update");
            }
            return bookRepository.save(book);
        } catch (Exception e) {
            log.error("Error updating book: {}", e.getMessage());
            throw new ServerInternalError("Error updating book");
        }
    }

    @Override
    public void delete(Long id) {
        try {
                bookRepository.deleteById(id);
            } catch (Exception e) {
                log.error("Error deleting book: {}", e.getMessage());
                throw new ServerInternalError("Error deleting book");
            }
    }

    @Override
    public Book findById(Long id) {
        try {
            return bookRepository.findById(id)
                .orElseThrow(() -> new ServerInternalError("Book not found"));
        } catch (Exception e) {
            log.error("Error finding book by ID: {}", e.getMessage());
            throw new ServerInternalError("Error finding book by ID");
        }
    }

    @Override
    public List<Book> findAll() {
        try {
            return bookRepository.findAll();
        } catch (Exception e) {
            log.error("Error finding all books: {}", e.getMessage());
            throw new ServerInternalError("Error finding all books");
        }
    }
}
