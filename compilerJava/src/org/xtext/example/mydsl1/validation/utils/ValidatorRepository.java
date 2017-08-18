package org.xtext.example.mydsl1.validation.utils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.xtext.example.mydsl1.javaDsl.ClassDeclaration;
import org.xtext.example.mydsl1.javaDsl.InterfaceDeclaration;
import org.xtext.example.mydsl1.javaDsl.MethodDeclaration;
import org.xtext.example.mydsl1.javaDsl.FieldDeclaration;
import org.xtext.example.mydsl1.javaDsl.VariableDeclarator;

public class ValidatorRepository {
	public List<String> interfaces = new ArrayList<String>();
	public List<String> allClasses = new ArrayList<String>();
	public Map<String, List<String>> extendsClass = new HashMap<String, List<String>>();
	public Map<String, List<String>> implementsClass = new HashMap<String, List<String>>();
	public Map<String, List<MethodDeclaration>> classMethods = new HashMap<String, List<MethodDeclaration>>();
	public Map<String, List<FieldDeclaration>> classAttributes = new HashMap<String, List<FieldDeclaration>>();

	public ValidatorRepository() {
		this.allClasses.add("String");
		this.classMethods.put("String", new ArrayList<MethodDeclaration>());
		this.classAttributes.put("String", new ArrayList<FieldDeclaration>());
	}
	
	public void addClass(ClassDeclaration cd) {
		allClasses.add(cd.getClassName());
		extendsClass.put(cd.getClassName(), new ArrayList<String>());
		implementsClass.put(cd.getClassName(), new ArrayList<String>());
		classMethods.put(cd.getClassName(), new ArrayList<MethodDeclaration>());
		classAttributes.put(cd.getClassName(), new ArrayList<FieldDeclaration>());
	}
	
	public void addInterface(InterfaceDeclaration id) {
		interfaces.add(id.getName());
		allClasses.add(id.getName());
		classMethods.put(id.getName(), new ArrayList<MethodDeclaration>());
		classAttributes.put(id.getName(), new ArrayList<FieldDeclaration>());
	}
	
	public void addExtendsndInterfaces(ClassDeclaration cd) {
		this.extendsClass.get(cd.getClassName()).add(cd.getExtend());
		if (cd.getImplements() != null) {
			for (String interfaceName : cd.getImplements().getInterfaces()) {
				this.implementsClass.get(cd.getClassName()).add(interfaceName);
			}
		}
	}
	
	public boolean hasClassAttribute(ClassDeclaration cd, String attribute) {
		for (FieldDeclaration fd : classAttributes.get(cd.getClassName())) {
			for (VariableDeclarator vd : fd.getVariables()) {
				if (vd.getName().equals(attribute)) {
					return true;
				}
			}
		}
		return false;
	}
}
