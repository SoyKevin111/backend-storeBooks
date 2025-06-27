package com.example.strorebooks.user.infraestructure.adapter.out;

import com.example.strorebooks.user.infraestructure.adapter.out.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserRepositoryPostgresql extends JpaRepository<User, Long> {


}
