/*
 * generated by Xtext 2.13.0-SNAPSHOT
 */
package org.xtext.example.mydsl1.validation

import org.xtext.example.mydsl1.javaDsl.CompilationUnit;
import org.xtext.example.mydsl1.javaDsl.TypeDeclaration;
import org.xtext.example.mydsl1.javaDsl.ClassDeclaration;
import org.xtext.example.mydsl1.javaDsl.ClassBodyDeclaration;
import org.xtext.example.mydsl1.javaDsl.FieldDeclaration;
import org.xtext.example.mydsl1.javaDsl.VariableDeclarator;
import org.xtext.example.mydsl1.javaDsl.ClassMemberDeclaration;
import org.xtext.example.mydsl1.javaDsl.InterfaceDeclaration;
import org.xtext.example.mydsl1.javaDsl.JavaDslPackage;

import org.eclipse.xtext.validation.Check;

import org.xtext.example.mydsl1.validation.utils.ValidatorRepository;
import org.xtext.example.mydsl1.validation.utils.ClassValidator;
import org.xtext.example.mydsl1.validation.utils.ExtendsValidator;
import java.util.List
import java.util.ArrayList

/**
 * This class contains custom validation rules. 
 *
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
class MyDslValidator extends AbstractMyDslValidator {
	
	public ValidatorRepository validator = new ValidatorRepository();
	
	@Check
	def validateCompilation(CompilationUnit cmu) {
		validator = new ValidatorRepository();
		for (TypeDeclaration td : cmu.typeDeclarations) {
			mapAndValidateClasses(td);
		}
		
		for (TypeDeclaration td : cmu.typeDeclarations) {
			if (td.name !== null && td.name instanceof ClassDeclaration) {
				var ExtendsValidator extendsValidator = new ExtendsValidator(validator);
				var ClassDeclaration cd = td.name as ClassDeclaration;
				extendsValidator.validate(cd);
			}
		}
	}  
	
	def mapAndValidateClasses(TypeDeclaration td) {
		if (td.name === null) {
			return;
		}
	
		var isInstance = (td.name instanceof ClassDeclaration);
		if (isInstance) {
			var ClassDeclaration cd = td.name as ClassDeclaration;
			validateClass(cd);
			validator.addClass(cd);
		} else {
			var InterfaceDeclaration id = td.name as InterfaceDeclaration;
			validator.addInterface(id);
		}
	}
	
	def validateClass(ClassDeclaration cd) {
		try {
			var ClassValidator classValidator = new ClassValidator(validator);
			classValidator.validate(cd);
		} catch (Exception e) {
			error(e.message, cd, JavaDslPackage.Literals.CLASS_DECLARATION__CLASS_NAME);
		}
	}
	
	def mapAndValidateAttributes(ClassDeclaration cd) {
		for (ClassBodyDeclaration cbd : cd.body.declarations) {
			if (cbd.member !== null && cbd.member instanceof ClassMemberDeclaration) {
				var ClassMemberDeclaration cmd = cbd.member as ClassMemberDeclaration;
				if (cmd.field !== null && cmd.field instanceof FieldDeclaration) {
					var FieldDeclaration fd = cmd.field as FieldDeclaration;
					validateClassAttributes(cd, fd);
					validator.classAttributes.get(cd.className).add(fd);
				}
			}
		}
		
		for (FieldDeclaration fd : validator.classAttributes.get(cd.className)) {
			if (fd.variables !== null) {
				for (VariableDeclarator vd : fd.variables) {
					validateAttributeWithExpression(fd, vd, cd.className);
				}
			}
		}
	}
	
	def validateClassAttributes(ClassDeclaration cd, FieldDeclaration fd) {
		if (validator.classAttributes.get(fd.type) === null && !isPrimitive(fd.type)) {
			error("This object " + fd.type + " does not exist", fd, JavaDslPackage.Literals.FIELD_DECLARATION__TYPE);
		}
		var List<String> variableNames = new ArrayList<String>();
		if (fd.variables !== null) {
			for (VariableDeclarator vd : fd.variables) {
				if (validator.hasClassAttribute(cd, vd.name) || variableNames.contains(vd.name)) {
					error("Field " + vd.name + " duplicated.", vd, JavaDslPackage.Literals.VARIABLE_DECLARATOR__NAME);
				}
				variableNames.add(vd.name);
			}
		}
	}
	
	
	
	def isPrimitive(String type) {
		return type.equals("int") || type.equals("boolean") || type.equals("byte") || type.equals("char") ||
			type.equals("short") || type.equals("float") || type.equals("double") || type.equals("long") ||
			type.equals("void");
	}
}