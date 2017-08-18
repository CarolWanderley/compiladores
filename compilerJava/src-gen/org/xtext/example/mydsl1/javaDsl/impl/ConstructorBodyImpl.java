/**
 * generated by Xtext 2.13.0-SNAPSHOT
 */
package org.xtext.example.mydsl1.javaDsl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.example.mydsl1.javaDsl.BlockStatement;
import org.xtext.example.mydsl1.javaDsl.ConstructorBody;
import org.xtext.example.mydsl1.javaDsl.ExplicitConstructorInvocation;
import org.xtext.example.mydsl1.javaDsl.JavaDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Constructor Body</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl1.javaDsl.impl.ConstructorBodyImpl#getInvocation <em>Invocation</em>}</li>
 *   <li>{@link org.xtext.example.mydsl1.javaDsl.impl.ConstructorBodyImpl#getDeclarations <em>Declarations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConstructorBodyImpl extends MinimalEObjectImpl.Container implements ConstructorBody
{
  /**
   * The cached value of the '{@link #getInvocation() <em>Invocation</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInvocation()
   * @generated
   * @ordered
   */
  protected ExplicitConstructorInvocation invocation;

  /**
   * The cached value of the '{@link #getDeclarations() <em>Declarations</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDeclarations()
   * @generated
   * @ordered
   */
  protected EList<BlockStatement> declarations;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ConstructorBodyImpl()
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
    return JavaDslPackage.Literals.CONSTRUCTOR_BODY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExplicitConstructorInvocation getInvocation()
  {
    return invocation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetInvocation(ExplicitConstructorInvocation newInvocation, NotificationChain msgs)
  {
    ExplicitConstructorInvocation oldInvocation = invocation;
    invocation = newInvocation;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JavaDslPackage.CONSTRUCTOR_BODY__INVOCATION, oldInvocation, newInvocation);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInvocation(ExplicitConstructorInvocation newInvocation)
  {
    if (newInvocation != invocation)
    {
      NotificationChain msgs = null;
      if (invocation != null)
        msgs = ((InternalEObject)invocation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JavaDslPackage.CONSTRUCTOR_BODY__INVOCATION, null, msgs);
      if (newInvocation != null)
        msgs = ((InternalEObject)newInvocation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JavaDslPackage.CONSTRUCTOR_BODY__INVOCATION, null, msgs);
      msgs = basicSetInvocation(newInvocation, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JavaDslPackage.CONSTRUCTOR_BODY__INVOCATION, newInvocation, newInvocation));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<BlockStatement> getDeclarations()
  {
    if (declarations == null)
    {
      declarations = new EObjectContainmentEList<BlockStatement>(BlockStatement.class, this, JavaDslPackage.CONSTRUCTOR_BODY__DECLARATIONS);
    }
    return declarations;
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
      case JavaDslPackage.CONSTRUCTOR_BODY__INVOCATION:
        return basicSetInvocation(null, msgs);
      case JavaDslPackage.CONSTRUCTOR_BODY__DECLARATIONS:
        return ((InternalEList<?>)getDeclarations()).basicRemove(otherEnd, msgs);
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
      case JavaDslPackage.CONSTRUCTOR_BODY__INVOCATION:
        return getInvocation();
      case JavaDslPackage.CONSTRUCTOR_BODY__DECLARATIONS:
        return getDeclarations();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case JavaDslPackage.CONSTRUCTOR_BODY__INVOCATION:
        setInvocation((ExplicitConstructorInvocation)newValue);
        return;
      case JavaDslPackage.CONSTRUCTOR_BODY__DECLARATIONS:
        getDeclarations().clear();
        getDeclarations().addAll((Collection<? extends BlockStatement>)newValue);
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
      case JavaDslPackage.CONSTRUCTOR_BODY__INVOCATION:
        setInvocation((ExplicitConstructorInvocation)null);
        return;
      case JavaDslPackage.CONSTRUCTOR_BODY__DECLARATIONS:
        getDeclarations().clear();
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
      case JavaDslPackage.CONSTRUCTOR_BODY__INVOCATION:
        return invocation != null;
      case JavaDslPackage.CONSTRUCTOR_BODY__DECLARATIONS:
        return declarations != null && !declarations.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ConstructorBodyImpl
