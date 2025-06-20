package com.example.strorebooks.user.infraestructure.adapter.in.dto;

import com.example.strorebooks.user.infraestructure.adapter.out.model.Role;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;

public class UserRequest {


   String name;
   String lastname;
   String phone;
   String address;
   String dateOfBirth;
   String identificationNumber;
   String state;
   String roleName;
}
