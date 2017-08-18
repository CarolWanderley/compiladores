package org.xtext.example.mydsl1.validation.utils;

import org.xtext.example.mydsl1.exception.ValidationException;

import org.xtext.example.mydsl1.javaDsl.FieldDeclaration;
import org.xtext.example.mydsl1.javaDsl.ClassDeclaration;
import org.xtext.example.mydsl1.javaDsl.VariableDeclarator;
import org.xtext.example.mydsl1.javaDsl.JavaDslPackage;

import java.util.List;
import java.util.ArrayList;

public class ClassAttributeValidator extends Validator {
	public ClassAttributeValidator(ValidatorRepository validator) {
		super(validator);
	}
	
	public void validate(ClassDeclaration cd, FieldDeclaration fd) throws ValidationException {
		if (validator.classAttributes.get(fd.getType().getName()) == null && !isPrimitive(fd.getType().getName())) {
			throw new ValidationException("This object " + fd.getType().getName() + " does not exist ", fd, JavaDslPackage.FIELD_DECLARATION__TYPE);
		}
		
		List<String> variables = new ArrayList<String>();
		for (VariableDeclarator vd : fd.getVariables()) {
			if (this.validator.hasClassAttribute(cd, vd.getName()) || variables.contains(vd.getName())) {
				throw new ValidationException("Field " + vd.getName() + " duplicated.", vd, JavaDslPackage.VARIABLE_DECLARATOR__NAME);
			}
			variables.add(vd.getName());
		}
	}
	
	public boolean isPrimitive(String type) {
		return type.equals("int") || type.equals("boolean") || type.equals("byte") || type.equals("char") ||
				type.equals("short") || type.equals("float") || type.equals("double") || type.equals("long") ||
				type.equals("void");
	}
	
}
