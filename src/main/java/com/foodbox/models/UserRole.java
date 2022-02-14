package com.foodbox.models;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="userRole")
@Setter
@Getter
public class UserRole {
	public Long getUserRoleId() {
		return userRoleId;
	}

	public void setUserRoleId(Long userRoleId) {
		this.userRoleId = userRoleId;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long userRoleId;
	
	public UserRole(Long userRoleId, User user) {
		super();
		this.userRoleId = userRoleId;
		this.user = user;
	}

	public UserRole() {
		
	}

	//user
	@ManyToOne(fetch = FetchType.EAGER)
    private User user;
    
	@ManyToOne
	private Role role;
	

}
