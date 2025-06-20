package com.example.strorebooks.user.infraestructure.adapter.out;

import com.example.strorebooks.user.infraestructure.adapter.out.model.Role;

public interface RoleRepositoryPostgresql {
   Role findByName(String name);
}
