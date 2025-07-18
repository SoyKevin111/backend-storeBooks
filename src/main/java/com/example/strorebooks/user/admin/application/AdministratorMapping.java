package com.example.strorebooks.user.admin.application;

import com.example.strorebooks.handlerError.application.ServerInternalError;
import com.example.strorebooks.handlerError.infraestructure.model.ErrorType;
import com.example.strorebooks.user.admin.infraestructure.adapter.in.dto.AdministratorRequest;
import com.example.strorebooks.user.admin.infraestructure.adapter.in.dto.TokenResponse;
import com.example.strorebooks.user.admin.infraestructure.adapter.out.model.Administrator;
import com.example.strorebooks.user.admin.infraestructure.adapter.out.repositories.AdministratorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.Optional;

@Component
public class AdministratorMapping {

   @Autowired
   private AdministratorRepository administratorRepository;


   public TokenResponse loginMapping(String username, String password) {
      Optional<Administrator> adminOpt = administratorRepository.existsByUsernameAndPassword(username, password);
      if (adminOpt.isEmpty()) {
         throw new ServerInternalError("Username or password incorrect");
      }
      LocalDateTime expiresAt = LocalDateTime.now().plusHours(2);
      return TokenResponse.builder()
         .id(adminOpt.get().getId())
         .username(adminOpt.get().getUsername())
         .expiresAt(expiresAt.toString())
         .build();
   }

   // Crear nuevo administrador
   public Administrator createAdministratorMapping(AdministratorRequest request) {
      validateUsername(request.getUsername());
      return Administrator.builder()
         .name(request.getName())
         .lastname(request.getLastname())
         .username(request.getUsername())
         .password(request.getPassword())
         .build();
   }

   // Actualizar administrador
   public Administrator updateAdministratorMapping(AdministratorRequest request, Long id) {
      Administrator existing = administratorRepository.findById(id)
         .orElseThrow(() -> new ServerInternalError(ErrorType.DB_ERROR.name(), "Administrator not found with id: " + id));

      // Validar solo si cambió username
      if (!existing.getUsername().equals(request.getUsername())) {
         validateUsername(request.getUsername());
      }

      return Administrator.builder()
         .id(existing.getId())
         .name(request.getName())
         .lastname(request.getLastname())
         .username(request.getUsername())
         .password(request.getPassword())
         .build();
   }

   // Validación de campos únicos
   private void validateUsername(String username) {
      if (administratorRepository.existsByUsername(username)) {
         throw new ServerInternalError(ErrorType.DB_ERROR.name(),
            "Administrator with username '" + username + "' already exists");
      }
   }

}
