package com.bridgelabz.fundoo.exception;

public class UserDoesNotExistException extends RuntimeException {
	
	
	String massage;
	public UserDoesNotExistException() {
		
	}
	
    public UserDoesNotExistException(String massage) {
             super(massage);		
	}

	
}
