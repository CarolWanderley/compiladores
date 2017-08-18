package org.xtext.example.mydsl1.exception;

public class ValidationException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = -4305217627977973376L;

	public ValidationException() {
	}
	
	public ValidationException(String message) {
		super(message);
	}
}
