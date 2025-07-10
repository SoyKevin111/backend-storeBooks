package com.example.strorebooks.user.admin.infraestructure.adapter.out.repositories;

import com.example.strorebooks.user.admin.domain.ports.out.IAdministratorRepository;
import com.example.strorebooks.user.admin.infraestructure.adapter.out.IAdministratorRepositoryPostgresql;
import com.example.strorebooks.user.admin.infraestructure.adapter.out.model.Administrator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class AdministratorRepository implements IAdministratorRepository {

    @Autowired
    private IAdministratorRepositoryPostgresql repository;

    @Override
    public Administrator save(Administrator admin) {
        return this.repository.save(admin);
    }

    @Override
    public void deleteById(Long id) {
        this.repository.deleteById(id);
    }

    @Override
    public Optional<Administrator> findById(Long id) {
        return this.repository.findById(id);
    }

    @Override
    public List<Administrator> findAll() {
        return repository.findAll();
    }

    @Override
    public boolean existsByUsername(String username) {
        return this.repository.existsByUsername(username);
    }

    @Override
    public boolean existsByIdentityNumber(String identityNumber) {
        return this.repository.existsByIdentityNumber(identityNumber);
    }



}
