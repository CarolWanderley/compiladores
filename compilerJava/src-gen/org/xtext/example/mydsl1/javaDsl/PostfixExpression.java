/**
 * generated by Xtext 2.13.0-SNAPSHOT
 */
package org.xtext.example.mydsl1.javaDsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Postfix Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl1.javaDsl.PostfixExpression#getObject <em>Object</em>}</li>
 *   <li>{@link org.xtext.example.mydsl1.javaDsl.PostfixExpression#getReference <em>Reference</em>}</li>
 *   <li>{@link org.xtext.example.mydsl1.javaDsl.PostfixExpression#getOperators <em>Operators</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl1.javaDsl.JavaDslPackage#getPostfixExpression()
 * @model
 * @generated
 */
public interface PostfixExpression extends StatementExpression, NoArrayExpressionWithoutMinus
{
  /**
   * Returns the value of the '<em><b>Object</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Object</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Object</em>' containment reference.
   * @see #setObject(Primary)
   * @see org.xtext.example.mydsl1.javaDsl.JavaDslPackage#getPostfixExpression_Object()
   * @model containment="true"
   * @generated
   */
  Primary getObject();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl1.javaDsl.PostfixExpression#getObject <em>Object</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Object</em>' containment reference.
   * @see #getObject()
   * @generated
   */
  void setObject(Primary value);

  /**
   * Returns the value of the '<em><b>Reference</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Reference</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Reference</em>' attribute.
   * @see #setReference(String)
   * @see org.xtext.example.mydsl1.javaDsl.JavaDslPackage#getPostfixExpression_Reference()
   * @model
   * @generated
   */
  String getReference();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl1.javaDsl.PostfixExpression#getReference <em>Reference</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Reference</em>' attribute.
   * @see #getReference()
   * @generated
   */
  void setReference(String value);

  /**
   * Returns the value of the '<em><b>Operators</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Operators</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Operators</em>' attribute list.
   * @see org.xtext.example.mydsl1.javaDsl.JavaDslPackage#getPostfixExpression_Operators()
   * @model unique="false"
   * @generated
   */
  EList<String> getOperators();

} // PostfixExpression
