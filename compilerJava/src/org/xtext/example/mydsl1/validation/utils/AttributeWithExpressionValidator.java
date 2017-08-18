package org.xtext.example.mydsl1.validation.utils;

import org.xtext.example.mydsl1.javaDsl.Expression;
import org.xtext.example.mydsl1.javaDsl.Type;
import org.xtext.example.mydsl1.javaDsl.VariableDeclarator;
import org.xtext.example.mydsl1.javaDsl.VariableInitializer;

import java.util.List;

public class AttributeWithExpressionValidator extends Validator {
	public AttributeWithExpressionValidator(ValidatorRepository validator) {
		super(validator);
	}
	
	public void validate(Type type, List<VariableDeclarator> variables) {
		for (VariableDeclarator vd : variables) {
			if (vd.getValue() == null) {
				return;
			}
			Expression exp = vd.getValue().getExp();
			if (exp == null) {
				//
			}
		}
	}
	
	public void validateVariable(Type type, VariableDeclarator variable) {
		
	}
	
	public void validateExpression(Expression exp) {
		
	}
}
