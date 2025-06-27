package com.example.strorebooks.catalog.editorial.domain.ports.out;

import com.example.strorebooks.catalog.editorial.infraestructure.adapter.out.model.Editorial;

import java.util.List;
import java.util.Optional;

public interface IEditorialRepository {
    Editorial save(Editorial editorial);
    void deleteById(Long id);
    Optional<Editorial> findById(Long id);
    List<Editorial> findAll();
}

