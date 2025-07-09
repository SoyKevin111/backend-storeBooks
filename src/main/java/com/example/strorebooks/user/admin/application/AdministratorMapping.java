package com.example.strorebooks.user.admin.application;

import com.example.strorebooks.handlerError.application.ServerInternalError;
import com.example.strorebooks.handlerError.infraestructure.model.ErrorType;
import com.example.strorebooks.user.admin.infraestructure.adapter.in.dto.AdministratorRequest;
import com.example.strorebooks.user.admin.infraestructure.adapter.out.model.Administrator;
import com.example.strorebooks.user.admin.infraestructure.adapter.out.repositories.AdministratorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AdministratorMapping {

    @Autowired
    private AdministratorRepository administratorRepository;

    // Crear nuevo administrador
    public Administrator createAdministratorMapping(AdministratorRequest request) {
        validateUsernameAndIdentityNumber(request.getUsername(), request.getIdentityNumber());
        return Administrator.builder()
                .name(request.getName())
                .lastname(request.getLastname())
                .identityNumber(request.getIdentityNumber())
                .username(request.getUsername())
                .password(request.getPassword())
                .build();
    }

    // Actualizar administrador
    public Administrator updateAdministratorMapping(AdministratorRequest request, Long id) {
        Administrator existing = administratorRepository.findById(id)
                .orElseThrow(() -> new ServerInternalError(ErrorType.DB_ERROR.name(), "Administrator not found with id: " + id));

        // Validar solo si cambió username o identityNumber
        if (!existing.getUsername().equals(request.getUsername()) ||
                !existing.getIdentityNumber().equals(request.getIdentityNumber())) {
            validateUsernameAndIdentityNumber(request.getUsername(), request.getIdentityNumber());
        }

        return Administrator.builder()
                .id(existing.getId())
                .name(request.getName())
                .lastname(request.getLastname())
                .identityNumber(request.getIdentityNumber())
                .username(request.getUsername())
                .password(request.getPassword())
                .build();
    }

    // Validación de campos únicos
    private void validateUsernameAndIdentityNumber(String username, String identityNumber) {
        if (administratorRepository.existsByUsername(username)) {
            throw new ServerInternalError(ErrorType.DB_ERROR.name(),
                    "Administrator with username '" + username + "' already exists");
        }
        if (administratorRepository.existsByIdentityNumber(identityNumber)) {
            throw new ServerInternalError(ErrorType.DB_ERROR.name(),
                    "Administrator with identity number '" + identityNumber + "' already exists");
        }
    }
}
