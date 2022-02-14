package com.foodbox.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.foodbox.models.Role;

public interface RoleRepository extends JpaRepository<Role, Long>{

}
