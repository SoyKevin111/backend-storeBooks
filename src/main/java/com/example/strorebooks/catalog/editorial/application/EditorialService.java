package com.example.strorebooks.catalog.editorial.application;

import com.example.strorebooks.catalog.editorial.infraestructure.adapter.out.model.Editorial;
import com.example.strorebooks.catalog.editorial.domain.ports.in.IEditorialService;
import com.example.strorebooks.catalog.editorial.domain.ports.out.IEditorialRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service

public class EditorialService implements IEditorialService {
    // Aquí irían las implementaciones de los métodos definidos en IEditorialService
    // Por ejemplo, podrías inyectar un repositorio y usarlo para manejar las operaciones CRUD
    @Autowired
    IEditorialRepository editorialRepository;

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
            if (editorial.getId() == null) {
                throw new RuntimeException("Editorial ID must not be null for update");
            }
            return editorialRepository.save(editorial);
        } catch (Exception e) {
            log.error("Error updating editorial: {}", e.getMessage());
            throw new RuntimeException("Error updating editorial", e);
        }
    }


    @Override
    public void delete(Long id) {
        try {
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