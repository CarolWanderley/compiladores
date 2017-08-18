/**
 * generated by Xtext 2.13.0-SNAPSHOT
 */
package org.xtext.example.mydsl1.javaDsl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.example.mydsl1.javaDsl.ClassInstanceCreationExpression;
import org.xtext.example.mydsl1.javaDsl.JavaDslPackage;
import org.xtext.example.mydsl1.javaDsl.PrimaryNoNewArray;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Primary No New Array</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl1.javaDsl.impl.PrimaryNoNewArrayImpl#getLiteral <em>Literal</em>}</li>
 *   <li>{@link org.xtext.example.mydsl1.javaDsl.impl.PrimaryNoNewArrayImpl#getKeyword <em>Keyword</em>}</li>
 *   <li>{@link org.xtext.example.mydsl1.javaDsl.impl.PrimaryNoNewArrayImpl#getClass_ <em>Class</em>}</li>
 *   <li>{@link org.xtext.example.mydsl1.javaDsl.impl.PrimaryNoNewArrayImpl#getMethod <em>Method</em>}</li>
 *   <li>{@link org.xtext.example.mydsl1.javaDsl.impl.PrimaryNoNewArrayImpl#getReference <em>Reference</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PrimaryNoNewArrayImpl extends PrimaryImpl implements PrimaryNoNewArray
{
  /**
   * The default value of the '{@link #getLiteral() <em>Literal</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLiteral()
   * @generated
   * @ordered
   */
  protected static final String LITERAL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getLiteral() <em>Literal</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLiteral()
   * @generated
   * @ordered
   */
  protected String literal = LITERAL_EDEFAULT;

  /**
   * The default value of the '{@link #getKeyword() <em>Keyword</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getKeyword()
   * @generated
   * @ordered
   */
  protected static final String KEYWORD_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getKeyword() <em>Keyword</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getKeyword()
   * @generated
   * @ordered
   */
  protected String keyword = KEYWORD_EDEFAULT;

  /**
   * The cached value of the '{@link #getClass_() <em>Class</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getClass_()
   * @generated
   * @ordered
   */
  protected ClassInstanceCreationExpression class_;

  /**
   * The default value of the '{@link #getMethod() <em>Method</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMethod()
   * @generated
   * @ordered
   */
  protected static final String METHOD_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getMethod() <em>Method</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMethod()
   * @generated
   * @ordered
   */
  protected String method = METHOD_EDEFAULT;

  /**
   * The default value of the '{@link #getReference() <em>Reference</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReference()
   * @generated
   * @ordered
   */
  protected static final String REFERENCE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getReference() <em>Reference</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReference()
   * @generated
   * @ordered
   */
  protected String reference = REFERENCE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PrimaryNoNewArrayImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return JavaDslPackage.Literals.PRIMARY_NO_NEW_ARRAY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLiteral()
  {
    return literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLiteral(String newLiteral)
  {
    String oldLiteral = literal;
    literal = newLiteral;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JavaDslPackage.PRIMARY_NO_NEW_ARRAY__LITERAL, oldLiteral, literal));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getKeyword()
  {
    return keyword;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setKeyword(String newKeyword)
  {
    String oldKeyword = keyword;
    keyword = newKeyword;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JavaDslPackage.PRIMARY_NO_NEW_ARRAY__KEYWORD, oldKeyword, keyword));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ClassInstanceCreationExpression getClass_()
  {
    return class_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetClass(ClassInstanceCreationExpression newClass, NotificationChain msgs)
  {
    ClassInstanceCreationExpression oldClass = class_;
    class_ = newClass;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JavaDslPackage.PRIMARY_NO_NEW_ARRAY__CLASS, oldClass, newClass);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setClass(ClassInstanceCreationExpression newClass)
  {
    if (newClass != class_)
    {
      NotificationChain msgs = null;
      if (class_ != null)
        msgs = ((InternalEObject)class_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JavaDslPackage.PRIMARY_NO_NEW_ARRAY__CLASS, null, msgs);
      if (newClass != null)
        msgs = ((InternalEObject)newClass).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JavaDslPackage.PRIMARY_NO_NEW_ARRAY__CLASS, null, msgs);
      msgs = basicSetClass(newClass, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JavaDslPackage.PRIMARY_NO_NEW_ARRAY__CLASS, newClass, newClass));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getMethod()
  {
    return method;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMethod(String newMethod)
  {
    String oldMethod = method;
    method = newMethod;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JavaDslPackage.PRIMARY_NO_NEW_ARRAY__METHOD, oldMethod, method));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getReference()
  {
    return reference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setReference(String newReference)
  {
    String oldReference = reference;
    reference = newReference;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JavaDslPackage.PRIMARY_NO_NEW_ARRAY__REFERENCE, oldReference, reference));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case JavaDslPackage.PRIMARY_NO_NEW_ARRAY__CLASS:
        return basicSetClass(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case JavaDslPackage.PRIMARY_NO_NEW_ARRAY__LITERAL:
        return getLiteral();
      case JavaDslPackage.PRIMARY_NO_NEW_ARRAY__KEYWORD:
        return getKeyword();
      case JavaDslPackage.PRIMARY_NO_NEW_ARRAY__CLASS:
        return getClass_();
      case JavaDslPackage.PRIMARY_NO_NEW_ARRAY__METHOD:
        return getMethod();
      case JavaDslPackage.PRIMARY_NO_NEW_ARRAY__REFERENCE:
        return getReference();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case JavaDslPackage.PRIMARY_NO_NEW_ARRAY__LITERAL:
        setLiteral((String)newValue);
        return;
      case JavaDslPackage.PRIMARY_NO_NEW_ARRAY__KEYWORD:
        setKeyword((String)newValue);
        return;
      case JavaDslPackage.PRIMARY_NO_NEW_ARRAY__CLASS:
        setClass((ClassInstanceCreationExpression)newValue);
        return;
      case JavaDslPackage.PRIMARY_NO_NEW_ARRAY__METHOD:
        setMethod((String)newValue);
        return;
      case JavaDslPackage.PRIMARY_NO_NEW_ARRAY__REFERENCE:
        setReference((String)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case JavaDslPackage.PRIMARY_NO_NEW_ARRAY__LITERAL:
        setLiteral(LITERAL_EDEFAULT);
        return;
      case JavaDslPackage.PRIMARY_NO_NEW_ARRAY__KEYWORD:
        setKeyword(KEYWORD_EDEFAULT);
        return;
      case JavaDslPackage.PRIMARY_NO_NEW_ARRAY__CLASS:
        setClass((ClassInstanceCreationExpression)null);
        return;
      case JavaDslPackage.PRIMARY_NO_NEW_ARRAY__METHOD:
        setMethod(METHOD_EDEFAULT);
        return;
      case JavaDslPackage.PRIMARY_NO_NEW_ARRAY__REFERENCE:
        setReference(REFERENCE_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case JavaDslPackage.PRIMARY_NO_NEW_ARRAY__LITERAL:
        return LITERAL_EDEFAULT == null ? literal != null : !LITERAL_EDEFAULT.equals(literal);
      case JavaDslPackage.PRIMARY_NO_NEW_ARRAY__KEYWORD:
        return KEYWORD_EDEFAULT == null ? keyword != null : !KEYWORD_EDEFAULT.equals(keyword);
      case JavaDslPackage.PRIMARY_NO_NEW_ARRAY__CLASS:
        return class_ != null;
      case JavaDslPackage.PRIMARY_NO_NEW_ARRAY__METHOD:
        return METHOD_EDEFAULT == null ? method != null : !METHOD_EDEFAULT.equals(method);
      case JavaDslPackage.PRIMARY_NO_NEW_ARRAY__REFERENCE:
        return REFERENCE_EDEFAULT == null ? reference != null : !REFERENCE_EDEFAULT.equals(reference);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (literal: ");
    result.append(literal);
    result.append(", keyword: ");
    result.append(keyword);
    result.append(", method: ");
    result.append(method);
    result.append(", reference: ");
    result.append(reference);
    result.append(')');
    return result.toString();
  }

} //PrimaryNoNewArrayImpl