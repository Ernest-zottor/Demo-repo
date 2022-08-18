package com.example.interfaceeg;

public class Solution {

	public static void main(String[] args) {
		EmailAndPasswordAuthenticator emailAndPasswordAuthenticator = new EmailAndPasswordAuthenticator();
		UsernameAndPasswordAuthenticator usernameAndPasswordAuthenticator = new UsernameAndPasswordAuthenticator();
		
		Person person1 = new Person("eclipse22", "password1", "eclipse.art@gmail.com", true);

		Person person2 = new Person("ernesto123", "password2", "ernesto.art@gmail.com", false);
		
		String validateByEmail = authenticate(emailAndPasswordAuthenticator, person1, "password", "eclipse.art@gmail.com");
		String validateByUsername = authenticate(usernameAndPasswordAuthenticator, person2, "password", "ernesto123");
		System.out.println(validateByEmail);
		System.out.println(validateByUsername);
		
		EmailAndPasswordAuthenticator auth = (EmailAndPasswordAuthenticator)authObj();

		System.out.println(auth.authenticate(person1, "password1", "eclipse.art@gmail.com"));
		auth.sayHello();
	}
	
	public static String authenticate(Authenticate auth, Person person, String password, String name) {
		
		if(person.isAuthenticatedByEmail()) {
			auth=  new EmailAndPasswordAuthenticator();
			return auth.authenticate(person, password, name);
		}
		else {
			auth=  new UsernameAndPasswordAuthenticator();
			return auth.authenticate(person, password, name);
		}
	}
	
	public static Authenticate authObj() {
		return new EmailAndPasswordAuthenticator();
	}

}
