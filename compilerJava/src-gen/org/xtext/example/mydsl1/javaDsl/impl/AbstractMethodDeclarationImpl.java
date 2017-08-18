/**
 * generated by Xtext 2.13.0-SNAPSHOT
 */
package org.xtext.example.mydsl1.javaDsl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.example.mydsl1.javaDsl.AbstractMethodDeclaration;
import org.xtext.example.mydsl1.javaDsl.Exceptions;
import org.xtext.example.mydsl1.javaDsl.JavaDslPackage;
import org.xtext.example.mydsl1.javaDsl.MethodDeclarator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Method Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl1.javaDsl.impl.AbstractMethodDeclarationImpl#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link org.xtext.example.mydsl1.javaDsl.impl.AbstractMethodDeclarationImpl#getHeader <em>Header</em>}</li>
 *   <li>{@link org.xtext.example.mydsl1.javaDsl.impl.AbstractMethodDeclarationImpl#getThrows <em>Throws</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AbstractMethodDeclarationImpl extends InterfaceMemberDeclarationImpl implements AbstractMethodDeclaration
{
  /**
   * The default value of the '{@link #getReturnType() <em>Return Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReturnType()
   * @generated
   * @ordered
   */
  protected static final String RETURN_TYPE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getReturnType() <em>Return Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReturnType()
   * @generated
   * @ordered
   */
  protected String returnType = RETURN_TYPE_EDEFAULT;

  /**
   * The cached value of the '{@link #getHeader() <em>Header</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHeader()
   * @generated
   * @ordered
   */
  protected MethodDeclarator header;

  /**
   * The cached value of the '{@link #getThrows() <em>Throws</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getThrows()
   * @generated
   * @ordered
   */
  protected Exceptions throws_;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AbstractMethodDeclarationImpl()
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
    return JavaDslPackage.Literals.ABSTRACT_METHOD_DECLARATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getReturnType()
  {
    return returnType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setReturnType(String newReturnType)
  {
    String oldReturnType = returnType;
    returnType = newReturnType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JavaDslPackage.ABSTRACT_METHOD_DECLARATION__RETURN_TYPE, oldReturnType, returnType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MethodDeclarator getHeader()
  {
    return header;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetHeader(MethodDeclarator newHeader, NotificationChain msgs)
  {
    MethodDeclarator oldHeader = header;
    header = newHeader;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JavaDslPackage.ABSTRACT_METHOD_DECLARATION__HEADER, oldHeader, newHeader);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHeader(MethodDeclarator newHeader)
  {
    if (newHeader != header)
    {
      NotificationChain msgs = null;
      if (header != null)
        msgs = ((InternalEObject)header).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JavaDslPackage.ABSTRACT_METHOD_DECLARATION__HEADER, null, msgs);
      if (newHeader != null)
        msgs = ((InternalEObject)newHeader).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JavaDslPackage.ABSTRACT_METHOD_DECLARATION__HEADER, null, msgs);
      msgs = basicSetHeader(newHeader, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JavaDslPackage.ABSTRACT_METHOD_DECLARATION__HEADER, newHeader, newHeader));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Exceptions getThrows()
  {
    return throws_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetThrows(Exceptions newThrows, NotificationChain msgs)
  {
    Exceptions oldThrows = throws_;
    throws_ = newThrows;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JavaDslPackage.ABSTRACT_METHOD_DECLARATION__THROWS, oldThrows, newThrows);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setThrows(Exceptions newThrows)
  {
    if (newThrows != throws_)
    {
      NotificationChain msgs = null;
      if (throws_ != null)
        msgs = ((InternalEObject)throws_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JavaDslPackage.ABSTRACT_METHOD_DECLARATION__THROWS, null, msgs);
      if (newThrows != null)
        msgs = ((InternalEObject)newThrows).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JavaDslPackage.ABSTRACT_METHOD_DECLARATION__THROWS, null, msgs);
      msgs = basicSetThrows(newThrows, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JavaDslPackage.ABSTRACT_METHOD_DECLARATION__THROWS, newThrows, newThrows));
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
      case JavaDslPackage.ABSTRACT_METHOD_DECLARATION__HEADER:
        return basicSetHeader(null, msgs);
      case JavaDslPackage.ABSTRACT_METHOD_DECLARATION__THROWS:
        return basicSetThrows(null, msgs);
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
      case JavaDslPackage.ABSTRACT_METHOD_DECLARATION__RETURN_TYPE:
        return getReturnType();
      case JavaDslPackage.ABSTRACT_METHOD_DECLARATION__HEADER:
        return getHeader();
      case JavaDslPackage.ABSTRACT_METHOD_DECLARATION__THROWS:
        return getThrows();
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
      case JavaDslPackage.ABSTRACT_METHOD_DECLARATION__RETURN_TYPE:
        setReturnType((String)newValue);
        return;
      case JavaDslPackage.ABSTRACT_METHOD_DECLARATION__HEADER:
        setHeader((MethodDeclarator)newValue);
        return;
      case JavaDslPackage.ABSTRACT_METHOD_DECLARATION__THROWS:
        setThrows((Exceptions)newValue);
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
      case JavaDslPackage.ABSTRACT_METHOD_DECLARATION__RETURN_TYPE:
        setReturnType(RETURN_TYPE_EDEFAULT);
        return;
      case JavaDslPackage.ABSTRACT_METHOD_DECLARATION__HEADER:
        setHeader((MethodDeclarator)null);
        return;
      case JavaDslPackage.ABSTRACT_METHOD_DECLARATION__THROWS:
        setThrows((Exceptions)null);
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
      case JavaDslPackage.ABSTRACT_METHOD_DECLARATION__RETURN_TYPE:
        return RETURN_TYPE_EDEFAULT == null ? returnType != null : !RETURN_TYPE_EDEFAULT.equals(returnType);
      case JavaDslPackage.ABSTRACT_METHOD_DECLARATION__HEADER:
        return header != null;
      case JavaDslPackage.ABSTRACT_METHOD_DECLARATION__THROWS:
        return throws_ != null;
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
    result.append(" (returnType: ");
    result.append(returnType);
    result.append(')');
    return result.toString();
  }

} //AbstractMethodDeclarationImpl
