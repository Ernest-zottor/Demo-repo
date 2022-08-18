package com.example.interfaceeg;

public class EmailAndPasswordAuthenticator implements Authenticate {

	@Override
	public String authenticate(Person person, String password, String name) {
		
		if(person.getEmail().equals(name) && person.getPassword().equals(password)) {
			return "Hello, you have been successfully authenticated using your email";
		}
		return "Wrong email or password";
	}

	public void sayHello() {
		System.out.println("hello all");
	}
}
