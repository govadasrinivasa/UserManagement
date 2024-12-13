package com.usermanagement.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="users")
public class Users implements Serializable {

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long userId;
	
	@Column(name="firstname", length=50)
	private String firstName;
	
	@Column(name="lastname", length=50)
	private String lastName;
	
	@Column(name="place", length=50)
	private String place;
	
	@Column(name="gender", length=10)
	private String gender;
	
	@Column(name="username", length=50)
	private String userName;
	
	@Column(name="password", length=50)
	private String password;

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
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

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
}
