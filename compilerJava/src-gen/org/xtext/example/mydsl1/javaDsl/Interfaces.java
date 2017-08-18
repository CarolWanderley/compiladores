/**
 * generated by Xtext 2.13.0-SNAPSHOT
 */
package org.xtext.example.mydsl1.javaDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interfaces</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl1.javaDsl.Interfaces#getKeyword <em>Keyword</em>}</li>
 *   <li>{@link org.xtext.example.mydsl1.javaDsl.Interfaces#getInterfaces <em>Interfaces</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl1.javaDsl.JavaDslPackage#getInterfaces()
 * @model
 * @generated
 */
public interface Interfaces extends EObject
{
  /**
   * Returns the value of the '<em><b>Keyword</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Keyword</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Keyword</em>' attribute.
   * @see #setKeyword(String)
   * @see org.xtext.example.mydsl1.javaDsl.JavaDslPackage#getInterfaces_Keyword()
   * @model
   * @generated
   */
  String getKeyword();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl1.javaDsl.Interfaces#getKeyword <em>Keyword</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Keyword</em>' attribute.
   * @see #getKeyword()
   * @generated
   */
  void setKeyword(String value);

  /**
   * Returns the value of the '<em><b>Interfaces</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Interfaces</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Interfaces</em>' attribute list.
   * @see org.xtext.example.mydsl1.javaDsl.JavaDslPackage#getInterfaces_Interfaces()
   * @model unique="false"
   * @generated
   */
  EList<String> getInterfaces();

} // Interfaces