/**
 * generated by Xtext 2.13.0-SNAPSHOT
 */
package org.xtext.example.mydsl1.javaDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Array Access</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl1.javaDsl.ArrayAccess#getReference <em>Reference</em>}</li>
 *   <li>{@link org.xtext.example.mydsl1.javaDsl.ArrayAccess#getArray <em>Array</em>}</li>
 *   <li>{@link org.xtext.example.mydsl1.javaDsl.ArrayAccess#getField <em>Field</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl1.javaDsl.JavaDslPackage#getArrayAccess()
 * @model
 * @generated
 */
public interface ArrayAccess extends LeftHandSide
{
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
   * @see org.xtext.example.mydsl1.javaDsl.JavaDslPackage#getArrayAccess_Reference()
   * @model
   * @generated
   */
  String getReference();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl1.javaDsl.ArrayAccess#getReference <em>Reference</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Reference</em>' attribute.
   * @see #getReference()
   * @generated
   */
  void setReference(String value);

  /**
   * Returns the value of the '<em><b>Array</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Array</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Array</em>' containment reference.
   * @see #setArray(PrimaryNoNewArray)
   * @see org.xtext.example.mydsl1.javaDsl.JavaDslPackage#getArrayAccess_Array()
   * @model containment="true"
   * @generated
   */
  PrimaryNoNewArray getArray();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl1.javaDsl.ArrayAccess#getArray <em>Array</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Array</em>' containment reference.
   * @see #getArray()
   * @generated
   */
  void setArray(PrimaryNoNewArray value);

  /**
   * Returns the value of the '<em><b>Field</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Field</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Field</em>' containment reference.
   * @see #setField(ArrayExpression)
   * @see org.xtext.example.mydsl1.javaDsl.JavaDslPackage#getArrayAccess_Field()
   * @model containment="true"
   * @generated
   */
  ArrayExpression getField();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl1.javaDsl.ArrayAccess#getField <em>Field</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Field</em>' containment reference.
   * @see #getField()
   * @generated
   */
  void setField(ArrayExpression value);

} // ArrayAccess
