package com.example.strorebooks.user.domain.ports.out;

import com.example.strorebooks.user.infraestructure.adapter.out.model.User;

import java.util.List;
import java.util.Optional;

public interface IUserRepository {
   User save(User user);
   void deleteById(Long id);
   Optional<User> findById(Long id);
   List<User> findAll();
}
