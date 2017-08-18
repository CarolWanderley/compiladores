/**
 * generated by Xtext 2.13.0-SNAPSHOT
 */
package org.xtext.example.mydsl1.javaDsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Local Variable Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl1.javaDsl.LocalVariableDeclaration#getType <em>Type</em>}</li>
 *   <li>{@link org.xtext.example.mydsl1.javaDsl.LocalVariableDeclaration#getVariables <em>Variables</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl1.javaDsl.JavaDslPackage#getLocalVariableDeclaration()
 * @model
 * @generated
 */
public interface LocalVariableDeclaration extends BlockStatement
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see #setType(String)
   * @see org.xtext.example.mydsl1.javaDsl.JavaDslPackage#getLocalVariableDeclaration_Type()
   * @model
   * @generated
   */
  String getType();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl1.javaDsl.LocalVariableDeclaration#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see #getType()
   * @generated
   */
  void setType(String value);

  /**
   * Returns the value of the '<em><b>Variables</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl1.javaDsl.VariableDeclarator}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Variables</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variables</em>' containment reference list.
   * @see org.xtext.example.mydsl1.javaDsl.JavaDslPackage#getLocalVariableDeclaration_Variables()
   * @model containment="true"
   * @generated
   */
  EList<VariableDeclarator> getVariables();

} // LocalVariableDeclaration
