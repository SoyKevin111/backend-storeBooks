package com.example.strorebooks.user.admin.infraestructure.adapter.out;

import com.example.strorebooks.user.admin.infraestructure.adapter.out.model.Administrator;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface IAdministratorRepositoryPostgresql extends JpaRepository<Administrator, Long> {
    boolean existsByUsername(String username);
    @Query("SELECT a FROM Administrator a WHERE a.username = :username AND a.password = :password")
    Optional<Administrator> findByUsernameAndPassword(@Param("username") String username, @Param("password") String password);

}