package com.example.strorebooks.catalog.editorial.application;

import com.example.strorebooks.catalog.booksauthors.domain.ports.out.IBookRepository;
import com.example.strorebooks.catalog.booksauthors.infraestructure.adapter.out.IBookRepositoryPostgresql;
import com.example.strorebooks.catalog.booksauthors.infraestructure.adapter.out.model.Book;
import com.example.strorebooks.catalog.editorial.infraestructure.adapter.out.model.Editorial;
import com.example.strorebooks.catalog.editorial.domain.ports.in.IEditorialService;
import com.example.strorebooks.catalog.editorial.domain.ports.out.IEditorialRepository;
import com.example.strorebooks.handlerError.application.ServerInternalError;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;

@Slf4j
@Service

public class EditorialService implements IEditorialService {

   @Autowired
   IEditorialRepository editorialRepository;
   @Autowired
   IBookRepositoryPostgresql bookRepository;

   @Override
   public Editorial create(Editorial editorial) {
      try {
         editorial.setId(null); // ID es null para nuevos editoriales
         return editorialRepository.save(editorial);
      } catch (Exception e) {
         log.error("Error creating editorial: {}", e.getMessage());
         throw new RuntimeException("Error creating editorial", e);
      }
   }

   @Override
   public Editorial update(Editorial editorial) {
      try {
         return editorialRepository.save(editorial);
      } catch (Exception e) {
         log.error("Error updating editorial: {}", e.getMessage());
         throw new RuntimeException("Error updating editorial", e);
      }
   }


   @Override
   public void delete(Long id) {
      try {
         Editorial editorial = editorialRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("Editorial not found"));
         List<Book> booksWithEditorial = bookRepository.findByEditorialId(id);

         for (Book book : booksWithEditorial) {
            book.setEditorial(null); // ← Rompe la FK
         }
         bookRepository.saveAll(booksWithEditorial);
         editorialRepository.deleteById(id);

      } catch (Exception e) {
         log.error("Error deleting editorial: {}", e.getMessage());
         throw new RuntimeException("Error deleting editorial", e);
      }
   }


   @Override
   public Editorial findById(Long id) {
      try {
         return editorialRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("Editorial not found"));
      } catch (Exception e) {
         log.error("Error finding editorial by id: {}", e.getMessage());
         throw new RuntimeException("Error finding editorial by id", e);
      }
   }

   @Override
   public List<Editorial> findAll() {
      try {
         return editorialRepository.findAll();
      } catch (Exception e) {
         log.error("Error finding all editorials: {}", e.getMessage());
         throw new RuntimeException("Error finding all editorials", e);
      }
   }

}