package com.example.strorebooks.user.admin.domain.ports.in;

import com.example.strorebooks.user.admin.infraestructure.adapter.out.model.Administrator;

import java.util.List;

public interface IAdministratorService {

    Administrator create(Administrator admin);
    Administrator update(Administrator admin);
    void delete(Long id);
    Administrator findById(Long id);
    List<Administrator> findAll();

}
