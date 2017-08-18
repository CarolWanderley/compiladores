/**
 * generated by Xtext 2.13.0-SNAPSHOT
 */
package org.xtext.example.mydsl1.javaDsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Switch Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl1.javaDsl.SwitchStatement#getExpression <em>Expression</em>}</li>
 *   <li>{@link org.xtext.example.mydsl1.javaDsl.SwitchStatement#getConstants <em>Constants</em>}</li>
 *   <li>{@link org.xtext.example.mydsl1.javaDsl.SwitchStatement#getStatements <em>Statements</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl1.javaDsl.JavaDslPackage#getSwitchStatement()
 * @model
 * @generated
 */
public interface SwitchStatement extends Statement
{
  /**
   * Returns the value of the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expression</em>' containment reference.
   * @see #setExpression(Expression)
   * @see org.xtext.example.mydsl1.javaDsl.JavaDslPackage#getSwitchStatement_Expression()
   * @model containment="true"
   * @generated
   */
  Expression getExpression();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl1.javaDsl.SwitchStatement#getExpression <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expression</em>' containment reference.
   * @see #getExpression()
   * @generated
   */
  void setExpression(Expression value);

  /**
   * Returns the value of the '<em><b>Constants</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl1.javaDsl.ConstantExpression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Constants</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Constants</em>' containment reference list.
   * @see org.xtext.example.mydsl1.javaDsl.JavaDslPackage#getSwitchStatement_Constants()
   * @model containment="true"
   * @generated
   */
  EList<ConstantExpression> getConstants();

  /**
   * Returns the value of the '<em><b>Statements</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl1.javaDsl.BlockStatement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Statements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Statements</em>' containment reference list.
   * @see org.xtext.example.mydsl1.javaDsl.JavaDslPackage#getSwitchStatement_Statements()
   * @model containment="true"
   * @generated
   */
  EList<BlockStatement> getStatements();

} // SwitchStatement
