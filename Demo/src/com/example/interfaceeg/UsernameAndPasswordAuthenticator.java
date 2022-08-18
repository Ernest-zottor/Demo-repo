package com.example.interfaceeg;

public class UsernameAndPasswordAuthenticator implements Authenticate{

	@Override
	public String authenticate(Person person, String password, String name) {
		
		if(person.getUsername().equals(name) && person.getPassword().equals(password)) {
			return "Hello, you have been successfully authenticated using your username";
		}
		return "Wrong username or password";
	}
}
