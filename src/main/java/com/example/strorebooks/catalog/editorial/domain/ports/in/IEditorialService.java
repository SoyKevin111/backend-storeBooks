package com.example.strorebooks.catalog.editorial.domain.ports.in;

import com.example.strorebooks.catalog.editorial.infraestructure.adapter.out.model.Editorial;

import java.util.List;

public interface IEditorialService {

    Editorial create(Editorial editorial);
    Editorial update(Editorial editorial);
    void delete(Long id);
    Editorial findById(Long id);
    List<Editorial> findAll();
}
