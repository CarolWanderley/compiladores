/**
 * generated by Xtext 2.13.0-SNAPSHOT
 */
package org.xtext.example.mydsl1.javaDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class Body Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl1.javaDsl.ClassBodyDeclaration#getMember <em>Member</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl1.javaDsl.JavaDslPackage#getClassBodyDeclaration()
 * @model
 * @generated
 */
public interface ClassBodyDeclaration extends EObject
{
  /**
   * Returns the value of the '<em><b>Member</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Member</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Member</em>' containment reference.
   * @see #setMember(ClassMemberDeclaration)
   * @see org.xtext.example.mydsl1.javaDsl.JavaDslPackage#getClassBodyDeclaration_Member()
   * @model containment="true"
   * @generated
   */
  ClassMemberDeclaration getMember();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl1.javaDsl.ClassBodyDeclaration#getMember <em>Member</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Member</em>' containment reference.
   * @see #getMember()
   * @generated
   */
  void setMember(ClassMemberDeclaration value);

} // ClassBodyDeclaration
