package com.example.strorebooks.user.admin.infraestructure.adapter.out;

import com.example.strorebooks.user.admin.infraestructure.adapter.out.model.Administrator;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAdministratorRepositoryPostgresql extends JpaRepository<Administrator, Long> {
    boolean existsByUsername(String username);
    boolean existsByIdentityNumber(String identityNumber);
}