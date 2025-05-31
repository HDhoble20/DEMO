package com.app.model;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;


public class RequestUserRestDetails {
	
	
	@NotNull(message = "FirstName Required")
	private String firstName;
	@NotNull(message = "LastName Required")
	private String lastName;
	@NotNull(message = "Password Required")
	@Size(min = 8,max = 16,message = "Password should not be less than 8 characters and more than 16")
	private String password;
	@NotNull
	@Email
	private String email;
	
	public RequestUserRestDetails() {}
	
	
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "RequestUserRestDetails [firstName=" + firstName + ", lastName=" + lastName + ", password=" + password
				+ ", email=" + email + "]";
	}
	
	

}
