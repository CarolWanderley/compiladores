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

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.example.mydsl1.javaDsl.ArgumentList;
import org.xtext.example.mydsl1.javaDsl.ArrayExpression;
import org.xtext.example.mydsl1.javaDsl.Assignment;
import org.xtext.example.mydsl1.javaDsl.AssignmentExpression;
import org.xtext.example.mydsl1.javaDsl.ClassInstanceCreationExpression;
import org.xtext.example.mydsl1.javaDsl.ConstantExpression;
import org.xtext.example.mydsl1.javaDsl.Expression;
import org.xtext.example.mydsl1.javaDsl.JavaDslPackage;
import org.xtext.example.mydsl1.javaDsl.LeftHandSide;
import org.xtext.example.mydsl1.javaDsl.Primary;
import org.xtext.example.mydsl1.javaDsl.PrimaryNoNewArray;
import org.xtext.example.mydsl1.javaDsl.VariableInitializer;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Assignment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl1.javaDsl.impl.AssignmentImpl#getArgs <em>Args</em>}</li>
 *   <li>{@link org.xtext.example.mydsl1.javaDsl.impl.AssignmentImpl#getDimensions <em>Dimensions</em>}</li>
 *   <li>{@link org.xtext.example.mydsl1.javaDsl.impl.AssignmentImpl#getFields <em>Fields</em>}</li>
 *   <li>{@link org.xtext.example.mydsl1.javaDsl.impl.AssignmentImpl#getLiteral <em>Literal</em>}</li>
 *   <li>{@link org.xtext.example.mydsl1.javaDsl.impl.AssignmentImpl#getKeyword <em>Keyword</em>}</li>
 *   <li>{@link org.xtext.example.mydsl1.javaDsl.impl.AssignmentImpl#getClass_ <em>Class</em>}</li>
 *   <li>{@link org.xtext.example.mydsl1.javaDsl.impl.AssignmentImpl#getMethod <em>Method</em>}</li>
 *   <li>{@link org.xtext.example.mydsl1.javaDsl.impl.AssignmentImpl#getReference <em>Reference</em>}</li>
 *   <li>{@link org.xtext.example.mydsl1.javaDsl.impl.AssignmentImpl#getObject <em>Object</em>}</li>
 *   <li>{@link org.xtext.example.mydsl1.javaDsl.impl.AssignmentImpl#getOperator <em>Operator</em>}</li>
 *   <li>{@link org.xtext.example.mydsl1.javaDsl.impl.AssignmentImpl#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AssignmentImpl extends StatementExpressionImpl implements Assignment
{
  /**
   * The cached value of the '{@link #getArgs() <em>Args</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArgs()
   * @generated
   * @ordered
   */
  protected EList<ArgumentList> args;

  /**
   * The cached value of the '{@link #getDimensions() <em>Dimensions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDimensions()
   * @generated
   * @ordered
   */
  protected EList<ArrayExpression> dimensions;

  /**
   * The cached value of the '{@link #getFields() <em>Fields</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFields()
   * @generated
   * @ordered
   */
  protected EList<String> fields;

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
   * The cached value of the '{@link #getObject() <em>Object</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getObject()
   * @generated
   * @ordered
   */
  protected LeftHandSide object;

  /**
   * The default value of the '{@link #getOperator() <em>Operator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOperator()
   * @generated
   * @ordered
   */
  protected static final String OPERATOR_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getOperator() <em>Operator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOperator()
   * @generated
   * @ordered
   */
  protected String operator = OPERATOR_EDEFAULT;

  /**
   * The cached value of the '{@link #getValue() <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected AssignmentExpression value;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AssignmentImpl()
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
    return JavaDslPackage.Literals.ASSIGNMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ArgumentList> getArgs()
  {
    if (args == null)
    {
      args = new EObjectContainmentEList<ArgumentList>(ArgumentList.class, this, JavaDslPackage.ASSIGNMENT__ARGS);
    }
    return args;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ArrayExpression> getDimensions()
  {
    if (dimensions == null)
    {
      dimensions = new EObjectContainmentEList<ArrayExpression>(ArrayExpression.class, this, JavaDslPackage.ASSIGNMENT__DIMENSIONS);
    }
    return dimensions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getFields()
  {
    if (fields == null)
    {
      fields = new EDataTypeEList<String>(String.class, this, JavaDslPackage.ASSIGNMENT__FIELDS);
    }
    return fields;
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
      eNotify(new ENotificationImpl(this, Notification.SET, JavaDslPackage.ASSIGNMENT__LITERAL, oldLiteral, literal));
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
      eNotify(new ENotificationImpl(this, Notification.SET, JavaDslPackage.ASSIGNMENT__KEYWORD, oldKeyword, keyword));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JavaDslPackage.ASSIGNMENT__CLASS, oldClass, newClass);
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
        msgs = ((InternalEObject)class_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JavaDslPackage.ASSIGNMENT__CLASS, null, msgs);
      if (newClass != null)
        msgs = ((InternalEObject)newClass).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JavaDslPackage.ASSIGNMENT__CLASS, null, msgs);
      msgs = basicSetClass(newClass, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JavaDslPackage.ASSIGNMENT__CLASS, newClass, newClass));
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
      eNotify(new ENotificationImpl(this, Notification.SET, JavaDslPackage.ASSIGNMENT__METHOD, oldMethod, method));
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
      eNotify(new ENotificationImpl(this, Notification.SET, JavaDslPackage.ASSIGNMENT__REFERENCE, oldReference, reference));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LeftHandSide getObject()
  {
    return object;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetObject(LeftHandSide newObject, NotificationChain msgs)
  {
    LeftHandSide oldObject = object;
    object = newObject;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JavaDslPackage.ASSIGNMENT__OBJECT, oldObject, newObject);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setObject(LeftHandSide newObject)
  {
    if (newObject != object)
    {
      NotificationChain msgs = null;
      if (object != null)
        msgs = ((InternalEObject)object).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JavaDslPackage.ASSIGNMENT__OBJECT, null, msgs);
      if (newObject != null)
        msgs = ((InternalEObject)newObject).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JavaDslPackage.ASSIGNMENT__OBJECT, null, msgs);
      msgs = basicSetObject(newObject, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JavaDslPackage.ASSIGNMENT__OBJECT, newObject, newObject));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getOperator()
  {
    return operator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOperator(String newOperator)
  {
    String oldOperator = operator;
    operator = newOperator;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JavaDslPackage.ASSIGNMENT__OPERATOR, oldOperator, operator));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AssignmentExpression getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetValue(AssignmentExpression newValue, NotificationChain msgs)
  {
    AssignmentExpression oldValue = value;
    value = newValue;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JavaDslPackage.ASSIGNMENT__VALUE, oldValue, newValue);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValue(AssignmentExpression newValue)
  {
    if (newValue != value)
    {
      NotificationChain msgs = null;
      if (value != null)
        msgs = ((InternalEObject)value).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JavaDslPackage.ASSIGNMENT__VALUE, null, msgs);
      if (newValue != null)
        msgs = ((InternalEObject)newValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JavaDslPackage.ASSIGNMENT__VALUE, null, msgs);
      msgs = basicSetValue(newValue, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JavaDslPackage.ASSIGNMENT__VALUE, newValue, newValue));
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
      case JavaDslPackage.ASSIGNMENT__ARGS:
        return ((InternalEList<?>)getArgs()).basicRemove(otherEnd, msgs);
      case JavaDslPackage.ASSIGNMENT__DIMENSIONS:
        return ((InternalEList<?>)getDimensions()).basicRemove(otherEnd, msgs);
      case JavaDslPackage.ASSIGNMENT__CLASS:
        return basicSetClass(null, msgs);
      case JavaDslPackage.ASSIGNMENT__OBJECT:
        return basicSetObject(null, msgs);
      case JavaDslPackage.ASSIGNMENT__VALUE:
        return basicSetValue(null, msgs);
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
      case JavaDslPackage.ASSIGNMENT__ARGS:
        return getArgs();
      case JavaDslPackage.ASSIGNMENT__DIMENSIONS:
        return getDimensions();
      case JavaDslPackage.ASSIGNMENT__FIELDS:
        return getFields();
      case JavaDslPackage.ASSIGNMENT__LITERAL:
        return getLiteral();
      case JavaDslPackage.ASSIGNMENT__KEYWORD:
        return getKeyword();
      case JavaDslPackage.ASSIGNMENT__CLASS:
        return getClass_();
      case JavaDslPackage.ASSIGNMENT__METHOD:
        return getMethod();
      case JavaDslPackage.ASSIGNMENT__REFERENCE:
        return getReference();
      case JavaDslPackage.ASSIGNMENT__OBJECT:
        return getObject();
      case JavaDslPackage.ASSIGNMENT__OPERATOR:
        return getOperator();
      case JavaDslPackage.ASSIGNMENT__VALUE:
        return getValue();
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
      case JavaDslPackage.ASSIGNMENT__ARGS:
        getArgs().clear();
        getArgs().addAll((Collection<? extends ArgumentList>)newValue);
        return;
      case JavaDslPackage.ASSIGNMENT__DIMENSIONS:
        getDimensions().clear();
        getDimensions().addAll((Collection<? extends ArrayExpression>)newValue);
        return;
      case JavaDslPackage.ASSIGNMENT__FIELDS:
        getFields().clear();
        getFields().addAll((Collection<? extends String>)newValue);
        return;
      case JavaDslPackage.ASSIGNMENT__LITERAL:
        setLiteral((String)newValue);
        return;
      case JavaDslPackage.ASSIGNMENT__KEYWORD:
        setKeyword((String)newValue);
        return;
      case JavaDslPackage.ASSIGNMENT__CLASS:
        setClass((ClassInstanceCreationExpression)newValue);
        return;
      case JavaDslPackage.ASSIGNMENT__METHOD:
        setMethod((String)newValue);
        return;
      case JavaDslPackage.ASSIGNMENT__REFERENCE:
        setReference((String)newValue);
        return;
      case JavaDslPackage.ASSIGNMENT__OBJECT:
        setObject((LeftHandSide)newValue);
        return;
      case JavaDslPackage.ASSIGNMENT__OPERATOR:
        setOperator((String)newValue);
        return;
      case JavaDslPackage.ASSIGNMENT__VALUE:
        setValue((AssignmentExpression)newValue);
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
      case JavaDslPackage.ASSIGNMENT__ARGS:
        getArgs().clear();
        return;
      case JavaDslPackage.ASSIGNMENT__DIMENSIONS:
        getDimensions().clear();
        return;
      case JavaDslPackage.ASSIGNMENT__FIELDS:
        getFields().clear();
        return;
      case JavaDslPackage.ASSIGNMENT__LITERAL:
        setLiteral(LITERAL_EDEFAULT);
        return;
      case JavaDslPackage.ASSIGNMENT__KEYWORD:
        setKeyword(KEYWORD_EDEFAULT);
        return;
      case JavaDslPackage.ASSIGNMENT__CLASS:
        setClass((ClassInstanceCreationExpression)null);
        return;
      case JavaDslPackage.ASSIGNMENT__METHOD:
        setMethod(METHOD_EDEFAULT);
        return;
      case JavaDslPackage.ASSIGNMENT__REFERENCE:
        setReference(REFERENCE_EDEFAULT);
        return;
      case JavaDslPackage.ASSIGNMENT__OBJECT:
        setObject((LeftHandSide)null);
        return;
      case JavaDslPackage.ASSIGNMENT__OPERATOR:
        setOperator(OPERATOR_EDEFAULT);
        return;
      case JavaDslPackage.ASSIGNMENT__VALUE:
        setValue((AssignmentExpression)null);
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
      case JavaDslPackage.ASSIGNMENT__ARGS:
        return args != null && !args.isEmpty();
      case JavaDslPackage.ASSIGNMENT__DIMENSIONS:
        return dimensions != null && !dimensions.isEmpty();
      case JavaDslPackage.ASSIGNMENT__FIELDS:
        return fields != null && !fields.isEmpty();
      case JavaDslPackage.ASSIGNMENT__LITERAL:
        return LITERAL_EDEFAULT == null ? literal != null : !LITERAL_EDEFAULT.equals(literal);
      case JavaDslPackage.ASSIGNMENT__KEYWORD:
        return KEYWORD_EDEFAULT == null ? keyword != null : !KEYWORD_EDEFAULT.equals(keyword);
      case JavaDslPackage.ASSIGNMENT__CLASS:
        return class_ != null;
      case JavaDslPackage.ASSIGNMENT__METHOD:
        return METHOD_EDEFAULT == null ? method != null : !METHOD_EDEFAULT.equals(method);
      case JavaDslPackage.ASSIGNMENT__REFERENCE:
        return REFERENCE_EDEFAULT == null ? reference != null : !REFERENCE_EDEFAULT.equals(reference);
      case JavaDslPackage.ASSIGNMENT__OBJECT:
        return object != null;
      case JavaDslPackage.ASSIGNMENT__OPERATOR:
        return OPERATOR_EDEFAULT == null ? operator != null : !OPERATOR_EDEFAULT.equals(operator);
      case JavaDslPackage.ASSIGNMENT__VALUE:
        return value != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass)
  {
    if (baseClass == VariableInitializer.class)
    {
      switch (derivedFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == ConstantExpression.class)
    {
      switch (derivedFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == Primary.class)
    {
      switch (derivedFeatureID)
      {
        case JavaDslPackage.ASSIGNMENT__ARGS: return JavaDslPackage.PRIMARY__ARGS;
        case JavaDslPackage.ASSIGNMENT__DIMENSIONS: return JavaDslPackage.PRIMARY__DIMENSIONS;
        case JavaDslPackage.ASSIGNMENT__FIELDS: return JavaDslPackage.PRIMARY__FIELDS;
        default: return -1;
      }
    }
    if (baseClass == PrimaryNoNewArray.class)
    {
      switch (derivedFeatureID)
      {
        case JavaDslPackage.ASSIGNMENT__LITERAL: return JavaDslPackage.PRIMARY_NO_NEW_ARRAY__LITERAL;
        case JavaDslPackage.ASSIGNMENT__KEYWORD: return JavaDslPackage.PRIMARY_NO_NEW_ARRAY__KEYWORD;
        case JavaDslPackage.ASSIGNMENT__CLASS: return JavaDslPackage.PRIMARY_NO_NEW_ARRAY__CLASS;
        case JavaDslPackage.ASSIGNMENT__METHOD: return JavaDslPackage.PRIMARY_NO_NEW_ARRAY__METHOD;
        case JavaDslPackage.ASSIGNMENT__REFERENCE: return JavaDslPackage.PRIMARY_NO_NEW_ARRAY__REFERENCE;
        default: return -1;
      }
    }
    if (baseClass == Expression.class)
    {
      switch (derivedFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == AssignmentExpression.class)
    {
      switch (derivedFeatureID)
      {
        default: return -1;
      }
    }
    return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass)
  {
    if (baseClass == VariableInitializer.class)
    {
      switch (baseFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == ConstantExpression.class)
    {
      switch (baseFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == Primary.class)
    {
      switch (baseFeatureID)
      {
        case JavaDslPackage.PRIMARY__ARGS: return JavaDslPackage.ASSIGNMENT__ARGS;
        case JavaDslPackage.PRIMARY__DIMENSIONS: return JavaDslPackage.ASSIGNMENT__DIMENSIONS;
        case JavaDslPackage.PRIMARY__FIELDS: return JavaDslPackage.ASSIGNMENT__FIELDS;
        default: return -1;
      }
    }
    if (baseClass == PrimaryNoNewArray.class)
    {
      switch (baseFeatureID)
      {
        case JavaDslPackage.PRIMARY_NO_NEW_ARRAY__LITERAL: return JavaDslPackage.ASSIGNMENT__LITERAL;
        case JavaDslPackage.PRIMARY_NO_NEW_ARRAY__KEYWORD: return JavaDslPackage.ASSIGNMENT__KEYWORD;
        case JavaDslPackage.PRIMARY_NO_NEW_ARRAY__CLASS: return JavaDslPackage.ASSIGNMENT__CLASS;
        case JavaDslPackage.PRIMARY_NO_NEW_ARRAY__METHOD: return JavaDslPackage.ASSIGNMENT__METHOD;
        case JavaDslPackage.PRIMARY_NO_NEW_ARRAY__REFERENCE: return JavaDslPackage.ASSIGNMENT__REFERENCE;
        default: return -1;
      }
    }
    if (baseClass == Expression.class)
    {
      switch (baseFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == AssignmentExpression.class)
    {
      switch (baseFeatureID)
      {
        default: return -1;
      }
    }
    return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
    result.append(" (fields: ");
    result.append(fields);
    result.append(", literal: ");
    result.append(literal);
    result.append(", keyword: ");
    result.append(keyword);
    result.append(", method: ");
    result.append(method);
    result.append(", reference: ");
    result.append(reference);
    result.append(", operator: ");
    result.append(operator);
    result.append(')');
    return result.toString();
  }

} //AssignmentImpl
