package org.xtext.example.mydsl1.validation.utils;

import org.xtext.example.mydsl1.exception.ValidationException;
import org.xtext.example.mydsl1.javaDsl.IfStatement;

public class IfThenElseValidator extends Validator {
	public IfThenElseValidator(ValidatorRepository validator) {
		super(validator);
	}
	
	public void validate(IfStatement ifs) throws ValidationException {
		if (!ifs.isCondition()) {
			System.out.println("IS CONDITION");
			throw new ValidationException("If must have a conditional statement");
		}
	}
}
