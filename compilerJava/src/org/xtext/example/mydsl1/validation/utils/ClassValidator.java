package org.xtext.example.mydsl1.validation.utils;

import org.xtext.example.mydsl1.validation.utils.Validator;

import java.util.List;

import org.xtext.example.mydsl1.exception.ValidationException;
import org.xtext.example.mydsl1.javaDsl.ClassDeclaration;
import org.xtext.example.mydsl1.javaDsl.MethodDeclaration;

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
		
		if (modifiers.size() > 0 && !modifiers.contains("public") && !modifiers.contains("abstract") && !modifiers.contains("final") && !modifiers.contains("private")) {
			throw new ValidationException("A class can only be public, abstract or final.");
		}
	}
	
	public void validateMethod(MethodDeclaration md) throws ValidationException {
		List<String> modifiers = md.getSignature().getModifiers();
		if (modifiers.size() > 0 && !modifiers.contains("final") && !modifiers.contains("public") && !modifiers.contains("protected") && !modifiers.contains("private")) {
			throw new ValidationException("A method can only be final, public, private, abstract or final.");
		}
		
		String returnType = md.getSignature().getReturnType().getType().getName();
		if (validator.classAttributes.get(returnType) == null && !isPrimitive(returnType)) {
			throw new ValidationException("Invalid return type.");
		}
	}
	
	public boolean isPrimitive(String type) {
		return type.equals("int") || type.equals("boolean") || type.equals("byte") || type.equals("char") ||
				type.equals("short") || type.equals("float") || type.equals("double") || type.equals("long") ||
				type.equals("void");
	}
}
