package com.example.strorebooks.catalog.editorial.application;

import com.example.strorebooks.catalog.editorial.infraestructure.adapter.in.dto.EditorialRequest;
import com.example.strorebooks.catalog.editorial.infraestructure.adapter.out.model.Editorial;
import org.springframework.stereotype.Component;

@Component
public class EditorialMapping {

    public Editorial saveEditorialMapping(EditorialRequest editorialRequest) {
        return Editorial.builder()
                .id(editorialRequest.getId())
                .name(editorialRequest.getName())
                .sitioWeb(editorialRequest.getSitioWeb())
                .email(editorialRequest.getEmail())
                .phone(editorialRequest.getPhone())
                .state(editorialRequest.getState())
                .build();

    }
}
