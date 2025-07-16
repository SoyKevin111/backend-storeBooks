package com.example.strorebooks.catalog.editorial.infraestructure.adapter.out;

import com.example.strorebooks.catalog.editorial.infraestructure.adapter.out.model.Editorial;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEditorialRepositoryPostgresql extends JpaRepository<Editorial, Long> {
   boolean existsByEmail(String email);
}
