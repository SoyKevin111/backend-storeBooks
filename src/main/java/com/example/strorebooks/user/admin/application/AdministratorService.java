package com.example.strorebooks.user.admin.application;

import com.example.strorebooks.handlerError.application.ServerInternalError;
import com.example.strorebooks.user.admin.domain.ports.in.IAdministratorService;
import com.example.strorebooks.user.admin.domain.ports.out.IAdministratorRepository;
import com.example.strorebooks.user.admin.infraestructure.adapter.out.model.Administrator;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class AdministratorService implements IAdministratorService {

    @Autowired
    private IAdministratorRepository administratorRepository;

    @Override
    public Administrator create(Administrator admin) {
        try {
            return administratorRepository.save(admin);
        } catch (Exception e) {
            log.error("Error creating administrator: {}", e.getMessage());
            throw new ServerInternalError("Error creating administrator");
        }
    }

    @Override
    public Administrator update(Administrator admin) {
        try {
            return administratorRepository.save(admin);
        } catch (Exception e) {
            log.error("Error updating administrator: {}", e.getMessage());
            throw new ServerInternalError("Error updating administrator");
        }
    }

    @Override
    public void delete(Long id) {
        if (administratorRepository.findById(id).isEmpty()) {
            throw new ServerInternalError("Error deleting administrator: administrator not found");
        }
        try {
            administratorRepository.deleteById(id);
        } catch (Exception e) {
            log.error("Error deleting administrator: {}", e.getMessage());
            throw new ServerInternalError("Error deleting administrator");
        }
    }

    @Override
    public Administrator findById(Long id) {
        try {
            return administratorRepository.findById(id)
                    .orElseThrow(() -> new ServerInternalError("Administrator not found"));
        } catch (Exception e) {
            log.error("Error finding administrator by id: {}", e.getMessage());
            throw new ServerInternalError("Error finding administrator by id");
        }
    }

    @Override
    public List<Administrator> findAll() {
        try {
            return administratorRepository.findAll();
        } catch (Exception e) {
            log.error("Error finding all administrators: {}", e.getMessage());
            throw new ServerInternalError("Error finding all administrators");
        }
    }
}
