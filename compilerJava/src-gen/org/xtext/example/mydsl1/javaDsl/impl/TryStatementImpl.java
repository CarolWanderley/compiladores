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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.example.mydsl1.javaDsl.Block;
import org.xtext.example.mydsl1.javaDsl.FormalParameter;
import org.xtext.example.mydsl1.javaDsl.JavaDslPackage;
import org.xtext.example.mydsl1.javaDsl.TryStatement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Try Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl1.javaDsl.impl.TryStatementImpl#getTryBody <em>Try Body</em>}</li>
 *   <li>{@link org.xtext.example.mydsl1.javaDsl.impl.TryStatementImpl#getParams <em>Params</em>}</li>
 *   <li>{@link org.xtext.example.mydsl1.javaDsl.impl.TryStatementImpl#getCatchesBody <em>Catches Body</em>}</li>
 *   <li>{@link org.xtext.example.mydsl1.javaDsl.impl.TryStatementImpl#getFinallyBody <em>Finally Body</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TryStatementImpl extends StatementImpl implements TryStatement
{
  /**
   * The cached value of the '{@link #getTryBody() <em>Try Body</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTryBody()
   * @generated
   * @ordered
   */
  protected Block tryBody;

  /**
   * The cached value of the '{@link #getParams() <em>Params</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParams()
   * @generated
   * @ordered
   */
  protected EList<FormalParameter> params;

  /**
   * The cached value of the '{@link #getCatchesBody() <em>Catches Body</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCatchesBody()
   * @generated
   * @ordered
   */
  protected EList<Block> catchesBody;

  /**
   * The cached value of the '{@link #getFinallyBody() <em>Finally Body</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFinallyBody()
   * @generated
   * @ordered
   */
  protected Block finallyBody;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TryStatementImpl()
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
    return JavaDslPackage.Literals.TRY_STATEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Block getTryBody()
  {
    return tryBody;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTryBody(Block newTryBody, NotificationChain msgs)
  {
    Block oldTryBody = tryBody;
    tryBody = newTryBody;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JavaDslPackage.TRY_STATEMENT__TRY_BODY, oldTryBody, newTryBody);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTryBody(Block newTryBody)
  {
    if (newTryBody != tryBody)
    {
      NotificationChain msgs = null;
      if (tryBody != null)
        msgs = ((InternalEObject)tryBody).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JavaDslPackage.TRY_STATEMENT__TRY_BODY, null, msgs);
      if (newTryBody != null)
        msgs = ((InternalEObject)newTryBody).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JavaDslPackage.TRY_STATEMENT__TRY_BODY, null, msgs);
      msgs = basicSetTryBody(newTryBody, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JavaDslPackage.TRY_STATEMENT__TRY_BODY, newTryBody, newTryBody));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<FormalParameter> getParams()
  {
    if (params == null)
    {
      params = new EObjectContainmentEList<FormalParameter>(FormalParameter.class, this, JavaDslPackage.TRY_STATEMENT__PARAMS);
    }
    return params;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Block> getCatchesBody()
  {
    if (catchesBody == null)
    {
      catchesBody = new EObjectContainmentEList<Block>(Block.class, this, JavaDslPackage.TRY_STATEMENT__CATCHES_BODY);
    }
    return catchesBody;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Block getFinallyBody()
  {
    return finallyBody;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFinallyBody(Block newFinallyBody, NotificationChain msgs)
  {
    Block oldFinallyBody = finallyBody;
    finallyBody = newFinallyBody;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JavaDslPackage.TRY_STATEMENT__FINALLY_BODY, oldFinallyBody, newFinallyBody);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFinallyBody(Block newFinallyBody)
  {
    if (newFinallyBody != finallyBody)
    {
      NotificationChain msgs = null;
      if (finallyBody != null)
        msgs = ((InternalEObject)finallyBody).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JavaDslPackage.TRY_STATEMENT__FINALLY_BODY, null, msgs);
      if (newFinallyBody != null)
        msgs = ((InternalEObject)newFinallyBody).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JavaDslPackage.TRY_STATEMENT__FINALLY_BODY, null, msgs);
      msgs = basicSetFinallyBody(newFinallyBody, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JavaDslPackage.TRY_STATEMENT__FINALLY_BODY, newFinallyBody, newFinallyBody));
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
      case JavaDslPackage.TRY_STATEMENT__TRY_BODY:
        return basicSetTryBody(null, msgs);
      case JavaDslPackage.TRY_STATEMENT__PARAMS:
        return ((InternalEList<?>)getParams()).basicRemove(otherEnd, msgs);
      case JavaDslPackage.TRY_STATEMENT__CATCHES_BODY:
        return ((InternalEList<?>)getCatchesBody()).basicRemove(otherEnd, msgs);
      case JavaDslPackage.TRY_STATEMENT__FINALLY_BODY:
        return basicSetFinallyBody(null, msgs);
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
      case JavaDslPackage.TRY_STATEMENT__TRY_BODY:
        return getTryBody();
      case JavaDslPackage.TRY_STATEMENT__PARAMS:
        return getParams();
      case JavaDslPackage.TRY_STATEMENT__CATCHES_BODY:
        return getCatchesBody();
      case JavaDslPackage.TRY_STATEMENT__FINALLY_BODY:
        return getFinallyBody();
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
      case JavaDslPackage.TRY_STATEMENT__TRY_BODY:
        setTryBody((Block)newValue);
        return;
      case JavaDslPackage.TRY_STATEMENT__PARAMS:
        getParams().clear();
        getParams().addAll((Collection<? extends FormalParameter>)newValue);
        return;
      case JavaDslPackage.TRY_STATEMENT__CATCHES_BODY:
        getCatchesBody().clear();
        getCatchesBody().addAll((Collection<? extends Block>)newValue);
        return;
      case JavaDslPackage.TRY_STATEMENT__FINALLY_BODY:
        setFinallyBody((Block)newValue);
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
      case JavaDslPackage.TRY_STATEMENT__TRY_BODY:
        setTryBody((Block)null);
        return;
      case JavaDslPackage.TRY_STATEMENT__PARAMS:
        getParams().clear();
        return;
      case JavaDslPackage.TRY_STATEMENT__CATCHES_BODY:
        getCatchesBody().clear();
        return;
      case JavaDslPackage.TRY_STATEMENT__FINALLY_BODY:
        setFinallyBody((Block)null);
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
      case JavaDslPackage.TRY_STATEMENT__TRY_BODY:
        return tryBody != null;
      case JavaDslPackage.TRY_STATEMENT__PARAMS:
        return params != null && !params.isEmpty();
      case JavaDslPackage.TRY_STATEMENT__CATCHES_BODY:
        return catchesBody != null && !catchesBody.isEmpty();
      case JavaDslPackage.TRY_STATEMENT__FINALLY_BODY:
        return finallyBody != null;
    }
    return super.eIsSet(featureID);
  }

} //TryStatementImpl
