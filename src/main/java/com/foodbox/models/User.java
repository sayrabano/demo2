package com.foodbox.models;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Setter
@Getter
@ToString
public class User  {

@Id
 @GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
    private String username;
	private String firstName;
	private String lastName;
	private String email;
	private String phone;
	private String password;
	private String address;
	private boolean enabled = true;
	
	@OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER,mappedBy = "user")
	@JsonIgnore
	private Set<UserRole> userRoles = new HashSet<>();
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUserName() {
		return username;
	}

	public void setUserName(String username) {
		this.username = username;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public Set<UserRole> getUserRoles() {
		return userRoles;
	}

	public void setUserRoles(Set<UserRole> userRoles) {
		this.userRoles = userRoles;
	}

	public User(Long id, String username, String firstName, String lastName, String email, String phone,
			String password, String address, boolean enabled, Set<UserRole> userRoles) {
		super();
		this.id = id;
		this.username = username;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phone = phone;
		this.password = password;
		this.address = address;
		this.enabled = enabled;
		this.userRoles = userRoles;
	}



	

	public User() {
		super();
		
	}

//	@Override
//	public Collection<? extends GrantedAuthority> getAuthorities() {
//		Set<Authority> set = new HashSet<>();
//		
//		this.userRoles.forEach(userRole->{
//			set.add(new Authority(userRole.getRole().getRoleName()));
//		});
//		return set;
//	}
//	
//
//	@Override
//	public String getUsername() {
//		
//		return username;
//	}
//
//	@Override
//	public boolean isAccountNonExpired() {
//		
//		return true;
//	}
//
//	@Override
//	public boolean isAccountNonLocked() {
//		
//		return true;
//	}
//
//	@Override
//	public boolean isCredentialsNonExpired() {
//		
//		return true;
//	}

	

	

}
