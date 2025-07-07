package com.example.strorebooks.catalog.editorial.application;

import com.example.strorebooks.catalog.editorial.domain.ports.out.IEditorialRepository;
import com.example.strorebooks.catalog.editorial.infraestructure.adapter.in.dto.EditorialRequest;
import com.example.strorebooks.catalog.editorial.infraestructure.adapter.out.model.Editorial;
import com.example.strorebooks.handlerError.application.ServerInternalError;
import com.example.strorebooks.handlerError.infraestructure.model.ErrorType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EditorialMapping {

   @Autowired
   IEditorialRepository editorialRepository;

   public Editorial createEditorialMapping(EditorialRequest editorialRequest) {
      this.validateEmail(editorialRequest.getEmail());
      return Editorial.builder()
         .name(editorialRequest.getName())
         .sitioWeb(editorialRequest.getSitioWeb())
         .email(editorialRequest.getEmail())
         .phone(editorialRequest.getPhone())
         .state(editorialRequest.getState())
         .build();

   }

   public Editorial updateEditorialMapping(EditorialRequest editorialRequest, Long id) {
      Editorial editorial = this.editorialRepository.findById(id)
         .orElseThrow(() -> new ServerInternalError(ErrorType.DB_ERROR.name(), "Editorial not found with id: " + id));

      if (!(editorialRequest.getEmail().equals(editorial.getEmail()))) {
         this.validateEmail(editorialRequest.getEmail());
      }

      return Editorial.builder()
         .id(id)
         .name(editorialRequest.getName())
         .sitioWeb(editorialRequest.getSitioWeb())
         .email(editorialRequest.getEmail())
         .phone(editorialRequest.getPhone())
         .state(editorialRequest.getState())
         .build();

   }

   public void validateEmail(String email) {
      if (this.editorialRepository.existsByEmail(email)) {
         throw new ServerInternalError(ErrorType.DB_ERROR.name(), "Editorial with email " + email + " already exists");
      }
   }

}
