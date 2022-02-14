package com.foodbox;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.foodbox.models.Role;
import com.foodbox.models.User;
import com.foodbox.models.UserRole;
import com.foodbox.service.UserService;

@SpringBootApplication
public class FoodBoxApplication implements CommandLineRunner{
//	@Autowired
//	private UserService userservice;
//
//	@Autowired
//	private BCryptPasswordEncoder bCryptPasswordEncoder;
	public static void main(String[] args) {
		SpringApplication.run(FoodBoxApplication.class, args);
		
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Starting Code!!");
//		User user = new User();
//		user.setUserName("Admin");
//	
//		user.setFirstName("Admin");
//		user.setLastName("Admin");
//		user.setPassword(this.bCryptPasswordEncoder.encode("admin"));
//		user.setEmail("admin@gmail.com");
//		user.setAddress("Delhi");
//		user.setPhone("");
//		
//		Role role = new Role();
//		role.setRoleId(45L);
//		role.setRoleName("ADMIN");
//		
//		
//		Set<UserRole> userRolesSet = new HashSet<>();
//	UserRole userrole= new UserRole();
//		userrole.setRole(role);
//		userrole.setUser(user);
//		
//		userRolesSet.add(userrole);
//	User user1 = this.userservice.createUser(user, userRolesSet);
//	System.out.println(user1.getUserName());
//		
		
		
	}

}
