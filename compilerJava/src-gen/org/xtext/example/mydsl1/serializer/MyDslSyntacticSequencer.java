/*
 * generated by Xtext 2.13.0-SNAPSHOT
 */
package org.xtext.example.mydsl1.serializer;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AlternativeAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;
import org.xtext.example.mydsl1.services.MyDslGrammarAccess;

@SuppressWarnings("all")
public class MyDslSyntacticSequencer extends AbstractSyntacticSequencer {

	protected MyDslGrammarAccess grammarAccess;
	protected AbstractElementAlias match_ArrayInitializer_CommaKeyword_2_q;
	protected AbstractElementAlias match_Block_BreakStatement_ContinueStatement_ReturnStatement_Statement_EmptyStatementParserRuleCall_0_or___BREAKTerminalRuleCall_0_SemicolonKeyword_2___or___CONTINUETerminalRuleCall_0_SemicolonKeyword_2___or___LeftCurlyBracketKeyword_0_RightCurlyBracketKeyword_2___or___RETURNTerminalRuleCall_0_SemicolonKeyword_2__;
	protected AbstractElementAlias match_PrimaryNewArray___LeftParenthesisKeyword_1_0_0_2_0_RightParenthesisKeyword_1_0_0_2_2__q;
	protected AbstractElementAlias match_PrimaryNoNewArray___LeftParenthesisKeyword_1_0_0_2_0_RightParenthesisKeyword_1_0_0_2_2__q;
	protected AbstractElementAlias match_SwitchStatement___DEFAULTTerminalRuleCall_5_1_0_ColonKeyword_5_1_1__a;
	protected AbstractElementAlias match_Type_ArrayTypeParserRuleCall_1_a;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (MyDslGrammarAccess) access;
		match_ArrayInitializer_CommaKeyword_2_q = new TokenAlias(false, true, grammarAccess.getArrayInitializerAccess().getCommaKeyword_2());
		match_Block_BreakStatement_ContinueStatement_ReturnStatement_Statement_EmptyStatementParserRuleCall_0_or___BREAKTerminalRuleCall_0_SemicolonKeyword_2___or___CONTINUETerminalRuleCall_0_SemicolonKeyword_2___or___LeftCurlyBracketKeyword_0_RightCurlyBracketKeyword_2___or___RETURNTerminalRuleCall_0_SemicolonKeyword_2__ = new AlternativeAlias(false, false, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getBlockAccess().getLeftCurlyBracketKeyword_0()), new TokenAlias(false, false, grammarAccess.getBlockAccess().getRightCurlyBracketKeyword_2())), new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getBreakStatementAccess().getBREAKTerminalRuleCall_0()), new TokenAlias(false, false, grammarAccess.getBreakStatementAccess().getSemicolonKeyword_2())), new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getContinueStatementAccess().getCONTINUETerminalRuleCall_0()), new TokenAlias(false, false, grammarAccess.getContinueStatementAccess().getSemicolonKeyword_2())), new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getReturnStatementAccess().getRETURNTerminalRuleCall_0()), new TokenAlias(false, false, grammarAccess.getReturnStatementAccess().getSemicolonKeyword_2())), new TokenAlias(false, false, grammarAccess.getStatementAccess().getEmptyStatementParserRuleCall_0()));
		match_PrimaryNewArray___LeftParenthesisKeyword_1_0_0_2_0_RightParenthesisKeyword_1_0_0_2_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getPrimaryNewArrayAccess().getLeftParenthesisKeyword_1_0_0_2_0()), new TokenAlias(false, false, grammarAccess.getPrimaryNewArrayAccess().getRightParenthesisKeyword_1_0_0_2_2()));
		match_PrimaryNoNewArray___LeftParenthesisKeyword_1_0_0_2_0_RightParenthesisKeyword_1_0_0_2_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getPrimaryNoNewArrayAccess().getLeftParenthesisKeyword_1_0_0_2_0()), new TokenAlias(false, false, grammarAccess.getPrimaryNoNewArrayAccess().getRightParenthesisKeyword_1_0_0_2_2()));
		match_SwitchStatement___DEFAULTTerminalRuleCall_5_1_0_ColonKeyword_5_1_1__a = new GroupAlias(true, true, new TokenAlias(false, false, grammarAccess.getSwitchStatementAccess().getDEFAULTTerminalRuleCall_5_1_0()), new TokenAlias(false, false, grammarAccess.getSwitchStatementAccess().getColonKeyword_5_1_1()));
		match_Type_ArrayTypeParserRuleCall_1_a = new TokenAlias(true, true, grammarAccess.getTypeAccess().getArrayTypeParserRuleCall_1());
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (ruleCall.getRule() == grammarAccess.getArrayTypeRule())
			return getArrayTypeToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getBREAKRule())
			return getBREAKToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getCASERule())
			return getCASEToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getCATCHRule())
			return getCATCHToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getCLASSRule())
			return getCLASSToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getCONTINUERule())
			return getCONTINUEToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getDEFAULTRule())
			return getDEFAULTToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getDORule())
			return getDOToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getELSERule())
			return getELSEToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getEXTENDSRule())
			return getEXTENDSToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getEmptyStatementRule())
			return getEmptyStatementToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getExpressionNameRule())
			return getExpressionNameToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getFINALLYRule())
			return getFINALLYToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getFORRule())
			return getFORToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getIFRule())
			return getIFToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getIMPORTRule())
			return getIMPORTToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getINTERFACERule())
			return getINTERFACEToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getNEWRule())
			return getNEWToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getPACKAGERule())
			return getPACKAGEToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getRETURNRule())
			return getRETURNToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getSTATICRule())
			return getSTATICToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getSWITCHRule())
			return getSWITCHToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getSYNCHRONIZEDRule())
			return getSYNCHRONIZEDToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getTHROWRule())
			return getTHROWToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getTHROWSRule())
			return getTHROWSToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getTRYRule())
			return getTRYToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getVOIDRule())
			return getVOIDToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getWHILERule())
			return getWHILEToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * ArrayType:
	 * 	"[]"
	 * ;
	 */
	protected String getArrayTypeToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "[]";
	}
	
	/**
	 * terminal BREAK:
	 * 	"break"
	 * ;
	 */
	protected String getBREAKToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "break";
	}
	
	/**
	 * terminal CASE:
	 * 	"case"
	 * ;
	 */
	protected String getCASEToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "case";
	}
	
	/**
	 * terminal CATCH:
	 * 	"catch"
	 * ;
	 */
	protected String getCATCHToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "catch";
	}
	
	/**
	 * terminal CLASS:
	 * 	"class"
	 * ;
	 */
	protected String getCLASSToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "class";
	}
	
	/**
	 * terminal CONTINUE:
	 * 	"continue"
	 * ;
	 */
	protected String getCONTINUEToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "continue";
	}
	
	/**
	 * terminal DEFAULT:
	 * 	"default"
	 * ;
	 */
	protected String getDEFAULTToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "default";
	}
	
	/**
	 * terminal DO:
	 * 	"do"
	 * ;
	 */
	protected String getDOToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "do";
	}
	
	/**
	 * terminal ELSE:
	 * 	"else"
	 * ;
	 */
	protected String getELSEToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "else";
	}
	
	/**
	 * terminal EXTENDS:
	 * 	"extends"
	 * ;
	 */
	protected String getEXTENDSToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "extends";
	}
	
	/**
	 * EmptyStatement:
	 * 	";"
	 * ;
	 */
	protected String getEmptyStatementToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return ";";
	}
	
	/**
	 * ExpressionName:
	 * 	ID
	 * 	(=> "." ID )*
	 * ;
	 */
	protected String getExpressionNameToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "";
	}
	
	/**
	 * terminal FINALLY:
	 * 	"finally"
	 * ;
	 */
	protected String getFINALLYToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "finally";
	}
	
	/**
	 * terminal FOR:
	 * 	"for"
	 * ;
	 */
	protected String getFORToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "for";
	}
	
	/**
	 * terminal IF:
	 * 	"if"
	 * ;
	 */
	protected String getIFToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "if";
	}
	
	/**
	 * terminal IMPORT:
	 * 	"import"
	 * ;
	 */
	protected String getIMPORTToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "import";
	}
	
	/**
	 * terminal INTERFACE:
	 * 	"interface"
	 * ;
	 */
	protected String getINTERFACEToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "interface";
	}
	
	/**
	 * terminal NEW:
	 * 	"new"
	 * ;
	 */
	protected String getNEWToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "new";
	}
	
	/**
	 * terminal PACKAGE:
	 * 	"package"
	 * ;
	 */
	protected String getPACKAGEToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "package";
	}
	
	/**
	 * terminal RETURN:
	 * 	"return"
	 * ;
	 */
	protected String getRETURNToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "return";
	}
	
	/**
	 * terminal STATIC:
	 * 	"static"
	 * ;
	 */
	protected String getSTATICToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "static";
	}
	
	/**
	 * terminal SWITCH:
	 * 	"switch"
	 * ;
	 */
	protected String getSWITCHToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "switch";
	}
	
	/**
	 * terminal SYNCHRONIZED:
	 * 	"synchronized"
	 * ;
	 */
	protected String getSYNCHRONIZEDToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "synchronized";
	}
	
	/**
	 * terminal THROW:
	 * 	"throw"
	 * ;
	 */
	protected String getTHROWToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "throw";
	}
	
	/**
	 * terminal THROWS:
	 * 	"throws"
	 * ;
	 */
	protected String getTHROWSToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "throws";
	}
	
	/**
	 * terminal TRY:
	 * 	"try"
	 * ;
	 */
	protected String getTRYToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "try";
	}
	
	/**
	 * terminal VOID:
	 * 	"void"
	 * ;
	 */
	protected String getVOIDToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "void";
	}
	
	/**
	 * terminal WHILE:
	 * 	"while"
	 * ;
	 */
	protected String getWHILEToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "while";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if (match_ArrayInitializer_CommaKeyword_2_q.equals(syntax))
				emit_ArrayInitializer_CommaKeyword_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Block_BreakStatement_ContinueStatement_ReturnStatement_Statement_EmptyStatementParserRuleCall_0_or___BREAKTerminalRuleCall_0_SemicolonKeyword_2___or___CONTINUETerminalRuleCall_0_SemicolonKeyword_2___or___LeftCurlyBracketKeyword_0_RightCurlyBracketKeyword_2___or___RETURNTerminalRuleCall_0_SemicolonKeyword_2__.equals(syntax))
				emit_Block_BreakStatement_ContinueStatement_ReturnStatement_Statement_EmptyStatementParserRuleCall_0_or___BREAKTerminalRuleCall_0_SemicolonKeyword_2___or___CONTINUETerminalRuleCall_0_SemicolonKeyword_2___or___LeftCurlyBracketKeyword_0_RightCurlyBracketKeyword_2___or___RETURNTerminalRuleCall_0_SemicolonKeyword_2__(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_PrimaryNewArray___LeftParenthesisKeyword_1_0_0_2_0_RightParenthesisKeyword_1_0_0_2_2__q.equals(syntax))
				emit_PrimaryNewArray___LeftParenthesisKeyword_1_0_0_2_0_RightParenthesisKeyword_1_0_0_2_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_PrimaryNoNewArray___LeftParenthesisKeyword_1_0_0_2_0_RightParenthesisKeyword_1_0_0_2_2__q.equals(syntax))
				emit_PrimaryNoNewArray___LeftParenthesisKeyword_1_0_0_2_0_RightParenthesisKeyword_1_0_0_2_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_SwitchStatement___DEFAULTTerminalRuleCall_5_1_0_ColonKeyword_5_1_1__a.equals(syntax))
				emit_SwitchStatement___DEFAULTTerminalRuleCall_5_1_0_ColonKeyword_5_1_1__a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Type_ArrayTypeParserRuleCall_1_a.equals(syntax))
				emit_Type_ArrayTypeParserRuleCall_1_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Ambiguous syntax:
	 *     ','?
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) '{' (ambiguity) '}' (rule start)
	 *     values+=VariableInitializer (ambiguity) '}' (rule end)
	 */
	protected void emit_ArrayInitializer_CommaKeyword_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     EmptyStatement | (BREAK ';') | (CONTINUE ';') | (RETURN ';') | ('{' '}')
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) (rule start)
	 */
	protected void emit_Block_BreakStatement_ContinueStatement_ReturnStatement_Statement_EmptyStatementParserRuleCall_0_or___BREAKTerminalRuleCall_0_SemicolonKeyword_2___or___CONTINUETerminalRuleCall_0_SemicolonKeyword_2___or___LeftCurlyBracketKeyword_0_RightCurlyBracketKeyword_2___or___RETURNTerminalRuleCall_0_SemicolonKeyword_2__(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ('(' ')')?
	 *
	 * This ambiguous syntax occurs at:
	 *     fields+=ID (ambiguity) '.' fields+=ID
	 *     fields+=ID (ambiguity) (rule end)
	 *     fields+=ID (ambiguity) dimensions+=ArrayExpression
	 */
	protected void emit_PrimaryNewArray___LeftParenthesisKeyword_1_0_0_2_0_RightParenthesisKeyword_1_0_0_2_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ('(' ')')?
	 *
	 * This ambiguous syntax occurs at:
	 *     fields+=ID (ambiguity) '.' fields+=ID
	 *     fields+=ID (ambiguity) (rule end)
	 *     fields+=ID (ambiguity) dimensions+=ArrayExpression
	 */
	protected void emit_PrimaryNoNewArray___LeftParenthesisKeyword_1_0_0_2_0_RightParenthesisKeyword_1_0_0_2_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     (DEFAULT ':')*
	 *
	 * This ambiguous syntax occurs at:
	 *     constants+=ConstantExpression ':' (ambiguity) '}' (rule end)
	 *     constants+=ConstantExpression ':' (ambiguity) CASE constants+=ConstantExpression
	 *     constants+=ConstantExpression ':' (ambiguity) statements+=BlockStatement
	 *     expression=Expression ')' '{' (ambiguity) '}' (rule end)
	 *     expression=Expression ')' '{' (ambiguity) CASE constants+=ConstantExpression
	 *     expression=Expression ')' '{' (ambiguity) statements+=BlockStatement
	 *     statements+=BlockStatement (ambiguity) '}' (rule end)
	 *     statements+=BlockStatement (ambiguity) CASE constants+=ConstantExpression
	 *     statements+=BlockStatement (ambiguity) statements+=BlockStatement
	 */
	protected void emit_SwitchStatement___DEFAULTTerminalRuleCall_5_1_0_ColonKeyword_5_1_1__a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ArrayType*
	 *
	 * This ambiguous syntax occurs at:
	 *     name=PrimitiveType (ambiguity) (rule end)
	 *     name=ReferenceType (ambiguity) (rule end)
	 */
	protected void emit_Type_ArrayTypeParserRuleCall_1_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
