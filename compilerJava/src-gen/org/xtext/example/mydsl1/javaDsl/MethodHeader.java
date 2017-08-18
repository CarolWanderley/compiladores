/**
 * generated by Xtext 2.13.0-SNAPSHOT
 */
package org.xtext.example.mydsl1.javaDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Method Header</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl1.javaDsl.MethodHeader#getModifiers <em>Modifiers</em>}</li>
 *   <li>{@link org.xtext.example.mydsl1.javaDsl.MethodHeader#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link org.xtext.example.mydsl1.javaDsl.MethodHeader#getHeader <em>Header</em>}</li>
 *   <li>{@link org.xtext.example.mydsl1.javaDsl.MethodHeader#getThrows <em>Throws</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl1.javaDsl.JavaDslPackage#getMethodHeader()
 * @model
 * @generated
 */
public interface MethodHeader extends EObject
{
  /**
   * Returns the value of the '<em><b>Modifiers</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Modifiers</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Modifiers</em>' attribute list.
   * @see org.xtext.example.mydsl1.javaDsl.JavaDslPackage#getMethodHeader_Modifiers()
   * @model unique="false"
   * @generated
   */
  EList<String> getModifiers();

  /**
   * Returns the value of the '<em><b>Return Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Return Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Return Type</em>' containment reference.
   * @see #setReturnType(ResultType)
   * @see org.xtext.example.mydsl1.javaDsl.JavaDslPackage#getMethodHeader_ReturnType()
   * @model containment="true"
   * @generated
   */
  ResultType getReturnType();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl1.javaDsl.MethodHeader#getReturnType <em>Return Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Return Type</em>' containment reference.
   * @see #getReturnType()
   * @generated
   */
  void setReturnType(ResultType value);

  /**
   * Returns the value of the '<em><b>Header</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Header</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Header</em>' containment reference.
   * @see #setHeader(MethodDeclarator)
   * @see org.xtext.example.mydsl1.javaDsl.JavaDslPackage#getMethodHeader_Header()
   * @model containment="true"
   * @generated
   */
  MethodDeclarator getHeader();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl1.javaDsl.MethodHeader#getHeader <em>Header</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Header</em>' containment reference.
   * @see #getHeader()
   * @generated
   */
  void setHeader(MethodDeclarator value);

  /**
   * Returns the value of the '<em><b>Throws</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Throws</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Throws</em>' containment reference.
   * @see #setThrows(Exceptions)
   * @see org.xtext.example.mydsl1.javaDsl.JavaDslPackage#getMethodHeader_Throws()
   * @model containment="true"
   * @generated
   */
  Exceptions getThrows();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl1.javaDsl.MethodHeader#getThrows <em>Throws</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Throws</em>' containment reference.
   * @see #getThrows()
   * @generated
   */
  void setThrows(Exceptions value);

} // MethodHeader
