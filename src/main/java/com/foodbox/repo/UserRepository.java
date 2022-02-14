package com.foodbox.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.foodbox.models.User;

public interface UserRepository extends JpaRepository<User, Long>{

	User findByUsername(String username);

	void deleteByUsername(String username);

}
