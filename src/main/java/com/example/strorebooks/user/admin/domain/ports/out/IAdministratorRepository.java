package com.example.strorebooks.user.admin.domain.ports.out;

import com.example.strorebooks.user.admin.infraestructure.adapter.out.model.Administrator;

import java.util.List;
import java.util.Optional;

public interface IAdministratorRepository {
    Administrator save(Administrator admin);
    void deleteById(Long id);
    Optional<Administrator> findById(Long id);
    List<Administrator> findAll();
    boolean existsByUsername(String username);
    boolean existsByIdentityNumber(String identityNumber);
}
