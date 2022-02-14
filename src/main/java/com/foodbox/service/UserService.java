package com.foodbox.service;

import java.util.Set;

import com.foodbox.models.User;
import com.foodbox.models.UserRole;

public interface UserService {
	public User createUser(User user,Set<UserRole> userRoles) throws Exception;
  
	public User getUser(String username);
	
	public void deletUser(Long userId);
}
