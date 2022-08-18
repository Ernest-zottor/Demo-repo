package com.example.interfaceeg;

public class Person {

	private String username;
	private String password;
	private String email;
	private boolean authenticatedByEmail;
	
	
	
	
	public Person(String username, String password, String email, boolean authenticatedByEmail) {
		this.username = username;
		this.password = password;
		this.email = email;
		this.authenticatedByEmail = authenticatedByEmail;
	}
	
	
	
	
	public boolean isAuthenticatedByEmail() {
		return authenticatedByEmail;
	}

	public void setAuthenticatedByEmail(boolean authenticatedByEmail) {
		this.authenticatedByEmail = authenticatedByEmail;
	}

	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
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
	
	
}
