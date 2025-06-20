package com.example.strorebooks.user.application;

import com.example.strorebooks.user.domain.ports.in.IUserService;
import com.example.strorebooks.user.domain.ports.out.IUserRepository;
import com.example.strorebooks.user.infraestructure.adapter.out.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserService implements IUserService {

   @Autowired
   IUserRepository userRepository;

   @Override
   public User create(User user) {
      try {
         return userRepository.save(user);
      } catch (Exception e) {
         throw new RuntimeException("Error creating user");
      }
   }

   @Override
   public User update(User user) {
      try {
         return userRepository.save(user);
      } catch (Exception e) {
         throw new RuntimeException("Error updating user");
      }
   }

   @Override
   public void delete(Long id) {
      try {
         userRepository.deleteById(id);
      } catch (Exception e) {
         throw new RuntimeException("Error deleting user");
      }
   }

   @Override
   public User findById(Long id) {
      try {
         return userRepository.findById(id)
               .orElseThrow(() -> new RuntimeException("User not found"));
      } catch (Exception e) {
         throw new RuntimeException("Error finding user by id");
      }
   }

   @Override
   public List<User> findAll() {
      try {
         return userRepository.findAll();
      } catch (Exception e) {
         throw new RuntimeException("Error finding all users");
      }
   }
}
