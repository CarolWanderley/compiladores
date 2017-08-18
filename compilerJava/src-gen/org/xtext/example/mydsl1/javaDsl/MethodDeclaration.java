/**
 * generated by Xtext 2.13.0-SNAPSHOT
 */
package org.xtext.example.mydsl1.javaDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Method Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl1.javaDsl.MethodDeclaration#getSignature <em>Signature</em>}</li>
 *   <li>{@link org.xtext.example.mydsl1.javaDsl.MethodDeclaration#getBody <em>Body</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl1.javaDsl.JavaDslPackage#getMethodDeclaration()
 * @model
 * @generated
 */
public interface MethodDeclaration extends EObject
{
  /**
   * Returns the value of the '<em><b>Signature</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Signature</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Signature</em>' containment reference.
   * @see #setSignature(MethodHeader)
   * @see org.xtext.example.mydsl1.javaDsl.JavaDslPackage#getMethodDeclaration_Signature()
   * @model containment="true"
   * @generated
   */
  MethodHeader getSignature();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl1.javaDsl.MethodDeclaration#getSignature <em>Signature</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Signature</em>' containment reference.
   * @see #getSignature()
   * @generated
   */
  void setSignature(MethodHeader value);

  /**
   * Returns the value of the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Body</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Body</em>' containment reference.
   * @see #setBody(Block)
   * @see org.xtext.example.mydsl1.javaDsl.JavaDslPackage#getMethodDeclaration_Body()
   * @model containment="true"
   * @generated
   */
  Block getBody();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl1.javaDsl.MethodDeclaration#getBody <em>Body</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Body</em>' containment reference.
   * @see #getBody()
   * @generated
   */
  void setBody(Block value);

} // MethodDeclaration
