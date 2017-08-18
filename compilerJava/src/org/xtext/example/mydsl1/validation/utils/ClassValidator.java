package org.xtext.example.mydsl1.validation.utils;

import org.xtext.example.mydsl1.validation.utils.Validator;

import java.util.List;

import org.xtext.example.mydsl1.exception.ValidationException;

import org.xtext.example.mydsl1.javaDsl.ClassDeclaration;

public class ClassValidator extends Validator {
	public ClassValidator(ValidatorRepository validator) {
		super(validator);
	}

	public void validate(ClassDeclaration cd) throws ValidationException {
		if (this.validator.allClasses.contains(cd.getClassName())) {
			throw new ValidationException("The class " + cd.getClassName() + " already exists.");
		}
		List<String> modifiers = cd.getModifiers();
		
		if (modifiers.contains("abstract") && modifiers.contains("final")) {
			throw new ValidationException("A class can not be final and abstract at the same time.");
		}
		
		if (modifiers.size() > 0 && !modifiers.contains("public") && !modifiers.contains("abstract") && !modifiers.contains("final")) {
			throw new ValidationException("A class can only be public, abstract or final.");
		}
	}
}
