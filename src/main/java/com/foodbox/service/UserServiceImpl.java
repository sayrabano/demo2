package com.foodbox.service;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.foodbox.models.User;
import com.foodbox.models.UserRole;
import com.foodbox.repo.RoleRepository;
import com.foodbox.repo.UserRepository;
@Service 
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository repo;
	
	
	@Autowired
	RoleRepository roleRep;
	
	
	@Override
	public User createUser(User user, Set<UserRole> userRoles) throws Exception {
	User local = this.repo.findByUsername(user.getUserName());
	if(local!=null) {
		System.out.println("User is already there!!");
		throw new Exception("User already present!");
	}else {
		for(UserRole ur:userRoles) {
			roleRep.save(ur.getRole());
		}
		
		user.getUserRoles().addAll(userRoles);
		local = this.repo.save(user);
		
	}
		return local;
	}


	@Override
	public User getUser(String username) {
	
		return this.repo.findByUsername(username);
	}


	@Override
	public void deletUser(Long userId) {
		this.repo.deleteById(userId);
		
	}

}
