/**
 * generated by Xtext 2.13.0-SNAPSHOT
 */
package org.xtext.example.mydsl1.javaDsl.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.xtext.example.mydsl1.javaDsl.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class JavaDslFactoryImpl extends EFactoryImpl implements JavaDslFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static JavaDslFactory init()
  {
    try
    {
      JavaDslFactory theJavaDslFactory = (JavaDslFactory)EPackage.Registry.INSTANCE.getEFactory(JavaDslPackage.eNS_URI);
      if (theJavaDslFactory != null)
      {
        return theJavaDslFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new JavaDslFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JavaDslFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case JavaDslPackage.HEAD: return createHead();
      case JavaDslPackage.COMPILATION_UNIT: return createCompilationUnit();
      case JavaDslPackage.PACKAGE_STATEMENT: return createPackageStatement();
      case JavaDslPackage.IMPORT_STATEMENT: return createImportStatement();
      case JavaDslPackage.TYPE_DECLARATION: return createTypeDeclaration();
      case JavaDslPackage.CLASS_DECLARATION: return createClassDeclaration();
      case JavaDslPackage.INTERFACES: return createInterfaces();
      case JavaDslPackage.CLASS_BODY: return createClassBody();
      case JavaDslPackage.CLASS_BODY_DECLARATION: return createClassBodyDeclaration();
      case JavaDslPackage.CLASS_MEMBER_DECLARATION: return createClassMemberDeclaration();
      case JavaDslPackage.STATIC_INITIALIZER: return createStaticInitializer();
      case JavaDslPackage.CONSTRUCTOR_DECLARATION: return createConstructorDeclaration();
      case JavaDslPackage.CONSTRUCTOR_DECLARATOR: return createConstructorDeclarator();
      case JavaDslPackage.FORMAL_PARAMETER: return createFormalParameter();
      case JavaDslPackage.EXCEPTIONS: return createExceptions();
      case JavaDslPackage.CONSTRUCTOR_BODY: return createConstructorBody();
      case JavaDslPackage.EXPLICIT_CONSTRUCTOR_INVOCATION: return createExplicitConstructorInvocation();
      case JavaDslPackage.FIELD_DECLARATION: return createFieldDeclaration();
      case JavaDslPackage.VARIABLE_DECLARATOR: return createVariableDeclarator();
      case JavaDslPackage.VARIABLE_INITIALIZER: return createVariableInitializer();
      case JavaDslPackage.METHOD_DECLARATION: return createMethodDeclaration();
      case JavaDslPackage.METHOD_HEADER: return createMethodHeader();
      case JavaDslPackage.RESULT_TYPE: return createResultType();
      case JavaDslPackage.METHOD_DECLARATOR: return createMethodDeclarator();
      case JavaDslPackage.INTERFACE_DECLARATION: return createInterfaceDeclaration();
      case JavaDslPackage.EXTENDS_INTERFACES: return createExtendsInterfaces();
      case JavaDslPackage.INTERFACE_BODY: return createInterfaceBody();
      case JavaDslPackage.INTERFACE_MEMBER_DECLARATION: return createInterfaceMemberDeclaration();
      case JavaDslPackage.CONSTANT_DECLARATION: return createConstantDeclaration();
      case JavaDslPackage.ABSTRACT_METHOD_DECLARATION: return createAbstractMethodDeclaration();
      case JavaDslPackage.ARRAY_INITIALIZER: return createArrayInitializer();
      case JavaDslPackage.TYPE: return createType();
      case JavaDslPackage.BLOCK: return createBlock();
      case JavaDslPackage.BLOCK_STATEMENT: return createBlockStatement();
      case JavaDslPackage.LOCAL_VARIABLE_DECLARATION: return createLocalVariableDeclaration();
      case JavaDslPackage.STATEMENT: return createStatement();
      case JavaDslPackage.LABELED_STATEMENT: return createLabeledStatement();
      case JavaDslPackage.STATEMENT_EXPRESSION: return createStatementExpression();
      case JavaDslPackage.IF_STATEMENT: return createIfStatement();
      case JavaDslPackage.SWITCH_STATEMENT: return createSwitchStatement();
      case JavaDslPackage.WHILE_STATEMENT: return createWhileStatement();
      case JavaDslPackage.DO_STATEMENT: return createDoStatement();
      case JavaDslPackage.FOR_STATEMENT: return createForStatement();
      case JavaDslPackage.FOR_INIT: return createForInit();
      case JavaDslPackage.FOR_UPDATE: return createForUpdate();
      case JavaDslPackage.BREAK_STATEMENT: return createBreakStatement();
      case JavaDslPackage.CONTINUE_STATEMENT: return createContinueStatement();
      case JavaDslPackage.RETURN_STATEMENT: return createReturnStatement();
      case JavaDslPackage.THROWS_STATEMENT: return createThrowsStatement();
      case JavaDslPackage.SYNCHRONIZED_STATEMENT: return createSynchronizedStatement();
      case JavaDslPackage.TRY_STATEMENT: return createTryStatement();
      case JavaDslPackage.CONSTANT_EXPRESSION: return createConstantExpression();
      case JavaDslPackage.EXPRESSION: return createExpression();
      case JavaDslPackage.ASSIGNMENT_EXPRESSION: return createAssignmentExpression();
      case JavaDslPackage.ASSIGNMENT: return createAssignment();
      case JavaDslPackage.LEFT_HAND_SIDE: return createLeftHandSide();
      case JavaDslPackage.CONDITIONAL_EXPRESSION: return createConditionalExpression();
      case JavaDslPackage.CONDITIONAL_OR_EXPRESSION: return createConditionalOrExpression();
      case JavaDslPackage.CONDITIONAL_AND_EXPRESSION: return createConditionalAndExpression();
      case JavaDslPackage.INCLUSIVE_OR_EXPRESSION: return createInclusiveOrExpression();
      case JavaDslPackage.EXCLUSIVE_OR_EXPRESSION: return createExclusiveOrExpression();
      case JavaDslPackage.AND_EXPRESSION: return createAndExpression();
      case JavaDslPackage.EQUALITY_EXPRESSION: return createEqualityExpression();
      case JavaDslPackage.RELATIONAL_EXPRESSION: return createRelationalExpression();
      case JavaDslPackage.SHIFT_EXPRESSION: return createShiftExpression();
      case JavaDslPackage.ADDITIVE_EXPRESSION: return createAdditiveExpression();
      case JavaDslPackage.MULTIPLICATIVE_EXPRESSION: return createMultiplicativeExpression();
      case JavaDslPackage.CAST_EXPRESSION: return createCastExpression();
      case JavaDslPackage.NO_ARRAY_EXPRESSION: return createNoArrayExpression();
      case JavaDslPackage.PRE_DECREMENT_EXPRESSION: return createPreDecrementExpression();
      case JavaDslPackage.PRE_INCREMENT_EXPRESSION: return createPreIncrementExpression();
      case JavaDslPackage.NO_ARRAY_EXPRESSION_WITHOUT_MINUS: return createNoArrayExpressionWithoutMinus();
      case JavaDslPackage.POSTFIX_EXPRESSION: return createPostfixExpression();
      case JavaDslPackage.METHOD_INVOCATION: return createMethodInvocation();
      case JavaDslPackage.FIELD_ACCESS: return createFieldAccess();
      case JavaDslPackage.PRIMARY: return createPrimary();
      case JavaDslPackage.PRIMARY_NO_NEW_ARRAY: return createPrimaryNoNewArray();
      case JavaDslPackage.PRIMARY_NEW_ARRAY: return createPrimaryNewArray();
      case JavaDslPackage.CLASS_INSTANCE_CREATION_EXPRESSION: return createClassInstanceCreationExpression();
      case JavaDslPackage.ARGUMENT_LIST: return createArgumentList();
      case JavaDslPackage.ARRAY_CREATION_EXPRESSION: return createArrayCreationExpression();
      case JavaDslPackage.ARRAY_EXPRESSION: return createArrayExpression();
      case JavaDslPackage.ARRAY_ACCESS: return createArrayAccess();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Head createHead()
  {
    HeadImpl head = new HeadImpl();
    return head;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CompilationUnit createCompilationUnit()
  {
    CompilationUnitImpl compilationUnit = new CompilationUnitImpl();
    return compilationUnit;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PackageStatement createPackageStatement()
  {
    PackageStatementImpl packageStatement = new PackageStatementImpl();
    return packageStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ImportStatement createImportStatement()
  {
    ImportStatementImpl importStatement = new ImportStatementImpl();
    return importStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeDeclaration createTypeDeclaration()
  {
    TypeDeclarationImpl typeDeclaration = new TypeDeclarationImpl();
    return typeDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ClassDeclaration createClassDeclaration()
  {
    ClassDeclarationImpl classDeclaration = new ClassDeclarationImpl();
    return classDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Interfaces createInterfaces()
  {
    InterfacesImpl interfaces = new InterfacesImpl();
    return interfaces;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ClassBody createClassBody()
  {
    ClassBodyImpl classBody = new ClassBodyImpl();
    return classBody;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ClassBodyDeclaration createClassBodyDeclaration()
  {
    ClassBodyDeclarationImpl classBodyDeclaration = new ClassBodyDeclarationImpl();
    return classBodyDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ClassMemberDeclaration createClassMemberDeclaration()
  {
    ClassMemberDeclarationImpl classMemberDeclaration = new ClassMemberDeclarationImpl();
    return classMemberDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StaticInitializer createStaticInitializer()
  {
    StaticInitializerImpl staticInitializer = new StaticInitializerImpl();
    return staticInitializer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConstructorDeclaration createConstructorDeclaration()
  {
    ConstructorDeclarationImpl constructorDeclaration = new ConstructorDeclarationImpl();
    return constructorDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConstructorDeclarator createConstructorDeclarator()
  {
    ConstructorDeclaratorImpl constructorDeclarator = new ConstructorDeclaratorImpl();
    return constructorDeclarator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FormalParameter createFormalParameter()
  {
    FormalParameterImpl formalParameter = new FormalParameterImpl();
    return formalParameter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Exceptions createExceptions()
  {
    ExceptionsImpl exceptions = new ExceptionsImpl();
    return exceptions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConstructorBody createConstructorBody()
  {
    ConstructorBodyImpl constructorBody = new ConstructorBodyImpl();
    return constructorBody;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExplicitConstructorInvocation createExplicitConstructorInvocation()
  {
    ExplicitConstructorInvocationImpl explicitConstructorInvocation = new ExplicitConstructorInvocationImpl();
    return explicitConstructorInvocation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FieldDeclaration createFieldDeclaration()
  {
    FieldDeclarationImpl fieldDeclaration = new FieldDeclarationImpl();
    return fieldDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VariableDeclarator createVariableDeclarator()
  {
    VariableDeclaratorImpl variableDeclarator = new VariableDeclaratorImpl();
    return variableDeclarator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VariableInitializer createVariableInitializer()
  {
    VariableInitializerImpl variableInitializer = new VariableInitializerImpl();
    return variableInitializer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MethodDeclaration createMethodDeclaration()
  {
    MethodDeclarationImpl methodDeclaration = new MethodDeclarationImpl();
    return methodDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MethodHeader createMethodHeader()
  {
    MethodHeaderImpl methodHeader = new MethodHeaderImpl();
    return methodHeader;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ResultType createResultType()
  {
    ResultTypeImpl resultType = new ResultTypeImpl();
    return resultType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MethodDeclarator createMethodDeclarator()
  {
    MethodDeclaratorImpl methodDeclarator = new MethodDeclaratorImpl();
    return methodDeclarator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InterfaceDeclaration createInterfaceDeclaration()
  {
    InterfaceDeclarationImpl interfaceDeclaration = new InterfaceDeclarationImpl();
    return interfaceDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExtendsInterfaces createExtendsInterfaces()
  {
    ExtendsInterfacesImpl extendsInterfaces = new ExtendsInterfacesImpl();
    return extendsInterfaces;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InterfaceBody createInterfaceBody()
  {
    InterfaceBodyImpl interfaceBody = new InterfaceBodyImpl();
    return interfaceBody;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InterfaceMemberDeclaration createInterfaceMemberDeclaration()
  {
    InterfaceMemberDeclarationImpl interfaceMemberDeclaration = new InterfaceMemberDeclarationImpl();
    return interfaceMemberDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConstantDeclaration createConstantDeclaration()
  {
    ConstantDeclarationImpl constantDeclaration = new ConstantDeclarationImpl();
    return constantDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AbstractMethodDeclaration createAbstractMethodDeclaration()
  {
    AbstractMethodDeclarationImpl abstractMethodDeclaration = new AbstractMethodDeclarationImpl();
    return abstractMethodDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ArrayInitializer createArrayInitializer()
  {
    ArrayInitializerImpl arrayInitializer = new ArrayInitializerImpl();
    return arrayInitializer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Type createType()
  {
    TypeImpl type = new TypeImpl();
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Block createBlock()
  {
    BlockImpl block = new BlockImpl();
    return block;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BlockStatement createBlockStatement()
  {
    BlockStatementImpl blockStatement = new BlockStatementImpl();
    return blockStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LocalVariableDeclaration createLocalVariableDeclaration()
  {
    LocalVariableDeclarationImpl localVariableDeclaration = new LocalVariableDeclarationImpl();
    return localVariableDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Statement createStatement()
  {
    StatementImpl statement = new StatementImpl();
    return statement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LabeledStatement createLabeledStatement()
  {
    LabeledStatementImpl labeledStatement = new LabeledStatementImpl();
    return labeledStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StatementExpression createStatementExpression()
  {
    StatementExpressionImpl statementExpression = new StatementExpressionImpl();
    return statementExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IfStatement createIfStatement()
  {
    IfStatementImpl ifStatement = new IfStatementImpl();
    return ifStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SwitchStatement createSwitchStatement()
  {
    SwitchStatementImpl switchStatement = new SwitchStatementImpl();
    return switchStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WhileStatement createWhileStatement()
  {
    WhileStatementImpl whileStatement = new WhileStatementImpl();
    return whileStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DoStatement createDoStatement()
  {
    DoStatementImpl doStatement = new DoStatementImpl();
    return doStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ForStatement createForStatement()
  {
    ForStatementImpl forStatement = new ForStatementImpl();
    return forStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ForInit createForInit()
  {
    ForInitImpl forInit = new ForInitImpl();
    return forInit;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ForUpdate createForUpdate()
  {
    ForUpdateImpl forUpdate = new ForUpdateImpl();
    return forUpdate;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BreakStatement createBreakStatement()
  {
    BreakStatementImpl breakStatement = new BreakStatementImpl();
    return breakStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ContinueStatement createContinueStatement()
  {
    ContinueStatementImpl continueStatement = new ContinueStatementImpl();
    return continueStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ReturnStatement createReturnStatement()
  {
    ReturnStatementImpl returnStatement = new ReturnStatementImpl();
    return returnStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ThrowsStatement createThrowsStatement()
  {
    ThrowsStatementImpl throwsStatement = new ThrowsStatementImpl();
    return throwsStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SynchronizedStatement createSynchronizedStatement()
  {
    SynchronizedStatementImpl synchronizedStatement = new SynchronizedStatementImpl();
    return synchronizedStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TryStatement createTryStatement()
  {
    TryStatementImpl tryStatement = new TryStatementImpl();
    return tryStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConstantExpression createConstantExpression()
  {
    ConstantExpressionImpl constantExpression = new ConstantExpressionImpl();
    return constantExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression createExpression()
  {
    ExpressionImpl expression = new ExpressionImpl();
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AssignmentExpression createAssignmentExpression()
  {
    AssignmentExpressionImpl assignmentExpression = new AssignmentExpressionImpl();
    return assignmentExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Assignment createAssignment()
  {
    AssignmentImpl assignment = new AssignmentImpl();
    return assignment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LeftHandSide createLeftHandSide()
  {
    LeftHandSideImpl leftHandSide = new LeftHandSideImpl();
    return leftHandSide;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConditionalExpression createConditionalExpression()
  {
    ConditionalExpressionImpl conditionalExpression = new ConditionalExpressionImpl();
    return conditionalExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConditionalOrExpression createConditionalOrExpression()
  {
    ConditionalOrExpressionImpl conditionalOrExpression = new ConditionalOrExpressionImpl();
    return conditionalOrExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConditionalAndExpression createConditionalAndExpression()
  {
    ConditionalAndExpressionImpl conditionalAndExpression = new ConditionalAndExpressionImpl();
    return conditionalAndExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InclusiveOrExpression createInclusiveOrExpression()
  {
    InclusiveOrExpressionImpl inclusiveOrExpression = new InclusiveOrExpressionImpl();
    return inclusiveOrExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExclusiveOrExpression createExclusiveOrExpression()
  {
    ExclusiveOrExpressionImpl exclusiveOrExpression = new ExclusiveOrExpressionImpl();
    return exclusiveOrExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AndExpression createAndExpression()
  {
    AndExpressionImpl andExpression = new AndExpressionImpl();
    return andExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EqualityExpression createEqualityExpression()
  {
    EqualityExpressionImpl equalityExpression = new EqualityExpressionImpl();
    return equalityExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RelationalExpression createRelationalExpression()
  {
    RelationalExpressionImpl relationalExpression = new RelationalExpressionImpl();
    return relationalExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ShiftExpression createShiftExpression()
  {
    ShiftExpressionImpl shiftExpression = new ShiftExpressionImpl();
    return shiftExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AdditiveExpression createAdditiveExpression()
  {
    AdditiveExpressionImpl additiveExpression = new AdditiveExpressionImpl();
    return additiveExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MultiplicativeExpression createMultiplicativeExpression()
  {
    MultiplicativeExpressionImpl multiplicativeExpression = new MultiplicativeExpressionImpl();
    return multiplicativeExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CastExpression createCastExpression()
  {
    CastExpressionImpl castExpression = new CastExpressionImpl();
    return castExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NoArrayExpression createNoArrayExpression()
  {
    NoArrayExpressionImpl noArrayExpression = new NoArrayExpressionImpl();
    return noArrayExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PreDecrementExpression createPreDecrementExpression()
  {
    PreDecrementExpressionImpl preDecrementExpression = new PreDecrementExpressionImpl();
    return preDecrementExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PreIncrementExpression createPreIncrementExpression()
  {
    PreIncrementExpressionImpl preIncrementExpression = new PreIncrementExpressionImpl();
    return preIncrementExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NoArrayExpressionWithoutMinus createNoArrayExpressionWithoutMinus()
  {
    NoArrayExpressionWithoutMinusImpl noArrayExpressionWithoutMinus = new NoArrayExpressionWithoutMinusImpl();
    return noArrayExpressionWithoutMinus;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PostfixExpression createPostfixExpression()
  {
    PostfixExpressionImpl postfixExpression = new PostfixExpressionImpl();
    return postfixExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MethodInvocation createMethodInvocation()
  {
    MethodInvocationImpl methodInvocation = new MethodInvocationImpl();
    return methodInvocation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FieldAccess createFieldAccess()
  {
    FieldAccessImpl fieldAccess = new FieldAccessImpl();
    return fieldAccess;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Primary createPrimary()
  {
    PrimaryImpl primary = new PrimaryImpl();
    return primary;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PrimaryNoNewArray createPrimaryNoNewArray()
  {
    PrimaryNoNewArrayImpl primaryNoNewArray = new PrimaryNoNewArrayImpl();
    return primaryNoNewArray;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PrimaryNewArray createPrimaryNewArray()
  {
    PrimaryNewArrayImpl primaryNewArray = new PrimaryNewArrayImpl();
    return primaryNewArray;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ClassInstanceCreationExpression createClassInstanceCreationExpression()
  {
    ClassInstanceCreationExpressionImpl classInstanceCreationExpression = new ClassInstanceCreationExpressionImpl();
    return classInstanceCreationExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ArgumentList createArgumentList()
  {
    ArgumentListImpl argumentList = new ArgumentListImpl();
    return argumentList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ArrayCreationExpression createArrayCreationExpression()
  {
    ArrayCreationExpressionImpl arrayCreationExpression = new ArrayCreationExpressionImpl();
    return arrayCreationExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ArrayExpression createArrayExpression()
  {
    ArrayExpressionImpl arrayExpression = new ArrayExpressionImpl();
    return arrayExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ArrayAccess createArrayAccess()
  {
    ArrayAccessImpl arrayAccess = new ArrayAccessImpl();
    return arrayAccess;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JavaDslPackage getJavaDslPackage()
  {
    return (JavaDslPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static JavaDslPackage getPackage()
  {
    return JavaDslPackage.eINSTANCE;
  }

} //JavaDslFactoryImpl
