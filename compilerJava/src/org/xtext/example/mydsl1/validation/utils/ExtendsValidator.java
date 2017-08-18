package org.xtext.example.mydsl1.validation.utils;

import org.xtext.example.mydsl1.javaDsl.ClassDeclaration;

import org.xtext.example.mydsl1.exception.ValidationException;

public class ExtendsValidator extends Validator {

	public ExtendsValidator(ValidatorRepository validator) {
		super(validator);
	}

	public void validate(ClassDeclaration cd) throws ValidationException {
		if (cd.getExtend() != null && validator.interfaces.contains(cd.getExtend())) {
			throw new ValidationException(cd.getExtend() + " is not a class.");
		}
		System.out.println(validator.allClasses.toString());
		if (cd.getExtend() != null && !validator.allClasses.contains(cd.getExtend())) {
			throw new ValidationException(cd.getExtend() + " class does not exist.");
		}
		if (cd.getExtend() != null && validator.extendsClass.get(cd.getClassName()).contains(cd.getExtend())) {
			throw new ValidationException(cd.getExtend() + " is already being extended.");
		}
		
		this.validateImplements(cd);
	}
	
	public void validateImplements(ClassDeclaration cd) throws ValidationException {
		if (cd.getImplements() != null) {
			for (String interfaceName : cd.getImplements().getInterfaces()) {
				this.validateInterface(cd, interfaceName);
			}
		}
	}
	
	public void validateInterface(ClassDeclaration cd, String interfaceName) throws ValidationException {
		if (validator.extendsClass.keySet().contains(interfaceName)) {
			throw new ValidationException(interfaceName + " is not an interface.");
		}
		if (!validator.interfaces.contains(interfaceName)) {
			throw new ValidationException(interfaceName + " interface does not exist.");
		}
		if (validator.implementsClass.get(cd.getClassName()).contains(interfaceName)) {
			throw new ValidationException(interfaceName + " interface is already being implemented.");
		}
	}
}
