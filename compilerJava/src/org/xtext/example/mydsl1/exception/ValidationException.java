package org.xtext.example.mydsl1.exception;

public class ValidationException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = -4305217627977973376L;
	public Object argA;
	public Object argB;

	public ValidationException() {
	}
	
	public ValidationException(String message, Object argA, Object argB) {
		super(message);
		this.argA = argA;
		this.argB = argB;
	}
	
	public ValidationException(String message) {
		super(message);
	}
}
