package com.example.strorebooks.user.domain.ports.in;

import com.example.strorebooks.user.infraestructure.adapter.out.model.User;

import java.util.List;

public interface IUserService {

   User create(User user);
   User update(User user);
   void delete(Long id);
   User findById(Long id);
   List<User> findAll();


}
