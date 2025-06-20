package com.example.strorebooks.user.infraestructure.adapter.out;

import com.example.strorebooks.user.domain.ports.out.IUserRepository;
import com.example.strorebooks.user.infraestructure.adapter.out.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class UserRepository implements IUserRepository {

   @Autowired
   private IUserRepositoruPostgresql repository;

   @Override
   public User save(User user) {
      return this.repository.save(user);
   }

   @Override
   public void deleteById(Long id) {
      this.repository.deleteById(id);
   }

   @Override
   public Optional<User> findById(Long id) {
      return this.repository.findById(id);
   }

   @Override
   public List<User> findAll() {
      return this.repository.findAll();
   }
}
