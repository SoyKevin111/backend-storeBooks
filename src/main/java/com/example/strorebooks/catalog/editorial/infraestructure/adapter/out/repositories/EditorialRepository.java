package com.example.strorebooks.catalog.editorial.infraestructure.adapter.out.repositories;

import com.example.strorebooks.catalog.editorial.domain.ports.out.IEditorialRepository;
import com.example.strorebooks.catalog.editorial.infraestructure.adapter.out.IEditorialRepositoryPostgresql;
import com.example.strorebooks.catalog.editorial.infraestructure.adapter.out.model.Editorial;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class EditorialRepository implements IEditorialRepository {

    @Autowired
    private IEditorialRepositoryPostgresql repository;

    @Override
    public Editorial save(Editorial editorial) {
        return this.repository.save(editorial);
    }

    @Override
    public void deleteById(Long id) { this.repository.deleteById(id);
    }

    @Override
    public Optional<Editorial> findById(Long id) {return this.repository.findById(id);
    }

    @Override
    public List<Editorial> findAll() { return this.repository.findAll();
    }

    @Override
    public boolean existsByEmail(String email) {
        return this.repository.existsByEmail(email);
    }


}
