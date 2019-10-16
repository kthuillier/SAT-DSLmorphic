/*
 * generated by Xtext 2.17.0
 */
grammar InternalSat;

options {
	superClass=AbstractInternalContentAssistParser;
}

@lexer::header {
package org.xtext.example.mydsl.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package org.xtext.example.mydsl.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.example.mydsl.services.SatGrammarAccess;

}
@parser::members {
	private SatGrammarAccess grammarAccess;

	public void setGrammarAccess(SatGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}

	@Override
	protected Grammar getGrammar() {
		return grammarAccess.getGrammar();
	}

	@Override
	protected String getValueForTokenName(String tokenName) {
		return tokenName;
	}
}

// Entry rule entryRuleFormula
entryRuleFormula
:
{ before(grammarAccess.getFormulaRule()); }
	 ruleFormula
{ after(grammarAccess.getFormulaRule()); } 
	 EOF 
;

// Rule Formula
ruleFormula 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getFormulaAccess().getAlternatives()); }
		(rule__Formula__Alternatives)
		{ after(grammarAccess.getFormulaAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleInstruction
entryRuleInstruction
:
{ before(grammarAccess.getInstructionRule()); }
	 ruleInstruction
{ after(grammarAccess.getInstructionRule()); } 
	 EOF 
;

// Rule Instruction
ruleInstruction 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getInstructionAccess().getGroup()); }
		(rule__Instruction__Group__0)
		{ after(grammarAccess.getInstructionAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleSolver
entryRuleSolver
:
{ before(grammarAccess.getSolverRule()); }
	 ruleSolver
{ after(grammarAccess.getSolverRule()); } 
	 EOF 
;

// Rule Solver
ruleSolver 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getSolverAccess().getStrAssignment()); }
		(rule__Solver__StrAssignment)
		{ after(grammarAccess.getSolverAccess().getStrAssignment()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleModel
entryRuleModel
:
{ before(grammarAccess.getModelRule()); }
	 ruleModel
{ after(grammarAccess.getModelRule()); } 
	 EOF 
;

// Rule Model
ruleModel 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getModelAccess().getBiImplParserRuleCall()); }
		ruleBiImpl
		{ after(grammarAccess.getModelAccess().getBiImplParserRuleCall()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleBiImpl
entryRuleBiImpl
:
{ before(grammarAccess.getBiImplRule()); }
	 ruleBiImpl
{ after(grammarAccess.getBiImplRule()); } 
	 EOF 
;

// Rule BiImpl
ruleBiImpl 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getBiImplAccess().getGroup()); }
		(rule__BiImpl__Group__0)
		{ after(grammarAccess.getBiImplAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleImpl
entryRuleImpl
:
{ before(grammarAccess.getImplRule()); }
	 ruleImpl
{ after(grammarAccess.getImplRule()); } 
	 EOF 
;

// Rule Impl
ruleImpl 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getImplAccess().getGroup()); }
		(rule__Impl__Group__0)
		{ after(grammarAccess.getImplAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleOr
entryRuleOr
:
{ before(grammarAccess.getOrRule()); }
	 ruleOr
{ after(grammarAccess.getOrRule()); } 
	 EOF 
;

// Rule Or
ruleOr 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getOrAccess().getGroup()); }
		(rule__Or__Group__0)
		{ after(grammarAccess.getOrAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleAnd
entryRuleAnd
:
{ before(grammarAccess.getAndRule()); }
	 ruleAnd
{ after(grammarAccess.getAndRule()); } 
	 EOF 
;

// Rule And
ruleAnd 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getAndAccess().getGroup()); }
		(rule__And__Group__0)
		{ after(grammarAccess.getAndAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleNand
entryRuleNand
:
{ before(grammarAccess.getNandRule()); }
	 ruleNand
{ after(grammarAccess.getNandRule()); } 
	 EOF 
;

// Rule Nand
ruleNand 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getNandAccess().getGroup()); }
		(rule__Nand__Group__0)
		{ after(grammarAccess.getNandAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRulePrimary
entryRulePrimary
:
{ before(grammarAccess.getPrimaryRule()); }
	 rulePrimary
{ after(grammarAccess.getPrimaryRule()); } 
	 EOF 
;

// Rule Primary
rulePrimary 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getPrimaryAccess().getAlternatives()); }
		(rule__Primary__Alternatives)
		{ after(grammarAccess.getPrimaryAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleNot
entryRuleNot
:
{ before(grammarAccess.getNotRule()); }
	 ruleNot
{ after(grammarAccess.getNotRule()); } 
	 EOF 
;

// Rule Not
ruleNot 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getNotAccess().getGroup()); }
		(rule__Not__Group__0)
		{ after(grammarAccess.getNotAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleVar
entryRuleVar
:
{ before(grammarAccess.getVarRule()); }
	 ruleVar
{ after(grammarAccess.getVarRule()); } 
	 EOF 
;

// Rule Var
ruleVar 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getVarAccess().getIdAssignment()); }
		(rule__Var__IdAssignment)
		{ after(grammarAccess.getVarAccess().getIdAssignment()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleConst
entryRuleConst
:
{ before(grammarAccess.getConstRule()); }
	 ruleConst
{ after(grammarAccess.getConstRule()); } 
	 EOF 
;

// Rule Const
ruleConst 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getConstAccess().getValAssignment()); }
		(rule__Const__ValAssignment)
		{ after(grammarAccess.getConstAccess().getValAssignment()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Formula__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFormulaAccess().getModelParserRuleCall_0()); }
		ruleModel
		{ after(grammarAccess.getFormulaAccess().getModelParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getFormulaAccess().getInstructionParserRuleCall_1()); }
		ruleInstruction
		{ after(grammarAccess.getFormulaAccess().getInstructionParserRuleCall_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Instruction__Alternatives_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getInstructionAccess().getGroup_1_0()); }
		(rule__Instruction__Group_1_0__0)
		{ after(grammarAccess.getInstructionAccess().getGroup_1_0()); }
	)
	|
	(
		{ before(grammarAccess.getInstructionAccess().getGroup_1_1()); }
		(rule__Instruction__Group_1_1__0)
		{ after(grammarAccess.getInstructionAccess().getGroup_1_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Solver__StrAlternatives_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSolverAccess().getStrSat4jJavaKeyword_0_0()); }
		'sat4j-java'
		{ after(grammarAccess.getSolverAccess().getStrSat4jJavaKeyword_0_0()); }
	)
	|
	(
		{ before(grammarAccess.getSolverAccess().getStrSat4jJarKeyword_0_1()); }
		'sat4j-jar'
		{ after(grammarAccess.getSolverAccess().getStrSat4jJarKeyword_0_1()); }
	)
	|
	(
		{ before(grammarAccess.getSolverAccess().getStrSat4jMavenKeyword_0_2()); }
		'sat4j-maven'
		{ after(grammarAccess.getSolverAccess().getStrSat4jMavenKeyword_0_2()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Nand__Alternatives_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getNandAccess().getVerticalLineKeyword_1_1_0()); }
		'|'
		{ after(grammarAccess.getNandAccess().getVerticalLineKeyword_1_1_0()); }
	)
	|
	(
		{ before(grammarAccess.getNandAccess().getUpwardsArrowKeyword_1_1_1()); }
		'\u2191'
		{ after(grammarAccess.getNandAccess().getUpwardsArrowKeyword_1_1_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Primary__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPrimaryAccess().getGroup_0()); }
		(rule__Primary__Group_0__0)
		{ after(grammarAccess.getPrimaryAccess().getGroup_0()); }
	)
	|
	(
		{ before(grammarAccess.getPrimaryAccess().getNotParserRuleCall_1()); }
		ruleNot
		{ after(grammarAccess.getPrimaryAccess().getNotParserRuleCall_1()); }
	)
	|
	(
		{ before(grammarAccess.getPrimaryAccess().getConstParserRuleCall_2()); }
		ruleConst
		{ after(grammarAccess.getPrimaryAccess().getConstParserRuleCall_2()); }
	)
	|
	(
		{ before(grammarAccess.getPrimaryAccess().getVarParserRuleCall_3()); }
		ruleVar
		{ after(grammarAccess.getPrimaryAccess().getVarParserRuleCall_3()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Not__Alternatives_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getNotAccess().getExclamationMarkKeyword_0_0()); }
		'!'
		{ after(grammarAccess.getNotAccess().getExclamationMarkKeyword_0_0()); }
	)
	|
	(
		{ before(grammarAccess.getNotAccess().getTildeKeyword_0_1()); }
		'~'
		{ after(grammarAccess.getNotAccess().getTildeKeyword_0_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Const__ValAlternatives_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getConstAccess().getValTrueKeyword_0_0()); }
		'true'
		{ after(grammarAccess.getConstAccess().getValTrueKeyword_0_0()); }
	)
	|
	(
		{ before(grammarAccess.getConstAccess().getValFalseKeyword_0_1()); }
		'false'
		{ after(grammarAccess.getConstAccess().getValFalseKeyword_0_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Instruction__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Instruction__Group__0__Impl
	rule__Instruction__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Instruction__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInstructionAccess().getSolverAssignment_0()); }
	(rule__Instruction__SolverAssignment_0)?
	{ after(grammarAccess.getInstructionAccess().getSolverAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Instruction__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Instruction__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Instruction__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInstructionAccess().getAlternatives_1()); }
	(rule__Instruction__Alternatives_1)
	{ after(grammarAccess.getInstructionAccess().getAlternatives_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Instruction__Group_1_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Instruction__Group_1_0__0__Impl
	rule__Instruction__Group_1_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Instruction__Group_1_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInstructionAccess().getSatKeyword_1_0_0()); }
	'sat'
	{ after(grammarAccess.getInstructionAccess().getSatKeyword_1_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Instruction__Group_1_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Instruction__Group_1_0__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Instruction__Group_1_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInstructionAccess().getExprAssignment_1_0_1()); }
	(rule__Instruction__ExprAssignment_1_0_1)
	{ after(grammarAccess.getInstructionAccess().getExprAssignment_1_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Instruction__Group_1_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Instruction__Group_1_1__0__Impl
	rule__Instruction__Group_1_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Instruction__Group_1_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInstructionAccess().getLoadKeyword_1_1_0()); }
	'load'
	{ after(grammarAccess.getInstructionAccess().getLoadKeyword_1_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Instruction__Group_1_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Instruction__Group_1_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Instruction__Group_1_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInstructionAccess().getPathAssignment_1_1_1()); }
	(rule__Instruction__PathAssignment_1_1_1)
	{ after(grammarAccess.getInstructionAccess().getPathAssignment_1_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__BiImpl__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__BiImpl__Group__0__Impl
	rule__BiImpl__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__BiImpl__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getBiImplAccess().getImplParserRuleCall_0()); }
	ruleImpl
	{ after(grammarAccess.getBiImplAccess().getImplParserRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__BiImpl__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__BiImpl__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__BiImpl__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getBiImplAccess().getGroup_1()); }
	(rule__BiImpl__Group_1__0)*
	{ after(grammarAccess.getBiImplAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__BiImpl__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__BiImpl__Group_1__0__Impl
	rule__BiImpl__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__BiImpl__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getBiImplAccess().getBiImplLeftAction_1_0()); }
	()
	{ after(grammarAccess.getBiImplAccess().getBiImplLeftAction_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__BiImpl__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__BiImpl__Group_1__1__Impl
	rule__BiImpl__Group_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__BiImpl__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getBiImplAccess().getLessThanSignEqualsSignGreaterThanSignKeyword_1_1()); }
	'<=>'
	{ after(grammarAccess.getBiImplAccess().getLessThanSignEqualsSignGreaterThanSignKeyword_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__BiImpl__Group_1__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__BiImpl__Group_1__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__BiImpl__Group_1__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getBiImplAccess().getRightAssignment_1_2()); }
	(rule__BiImpl__RightAssignment_1_2)
	{ after(grammarAccess.getBiImplAccess().getRightAssignment_1_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Impl__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Impl__Group__0__Impl
	rule__Impl__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Impl__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getImplAccess().getOrParserRuleCall_0()); }
	ruleOr
	{ after(grammarAccess.getImplAccess().getOrParserRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Impl__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Impl__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Impl__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getImplAccess().getGroup_1()); }
	(rule__Impl__Group_1__0)*
	{ after(grammarAccess.getImplAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Impl__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Impl__Group_1__0__Impl
	rule__Impl__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Impl__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getImplAccess().getImplLeftAction_1_0()); }
	()
	{ after(grammarAccess.getImplAccess().getImplLeftAction_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Impl__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Impl__Group_1__1__Impl
	rule__Impl__Group_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Impl__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getImplAccess().getEqualsSignGreaterThanSignKeyword_1_1()); }
	'=>'
	{ after(grammarAccess.getImplAccess().getEqualsSignGreaterThanSignKeyword_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Impl__Group_1__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Impl__Group_1__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Impl__Group_1__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getImplAccess().getRightAssignment_1_2()); }
	(rule__Impl__RightAssignment_1_2)
	{ after(grammarAccess.getImplAccess().getRightAssignment_1_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Or__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Or__Group__0__Impl
	rule__Or__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Or__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getOrAccess().getAndParserRuleCall_0()); }
	ruleAnd
	{ after(grammarAccess.getOrAccess().getAndParserRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Or__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Or__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Or__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getOrAccess().getGroup_1()); }
	(rule__Or__Group_1__0)*
	{ after(grammarAccess.getOrAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Or__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Or__Group_1__0__Impl
	rule__Or__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Or__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getOrAccess().getOrLeftAction_1_0()); }
	()
	{ after(grammarAccess.getOrAccess().getOrLeftAction_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Or__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Or__Group_1__1__Impl
	rule__Or__Group_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Or__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getOrAccess().getVKeyword_1_1()); }
	'v'
	{ after(grammarAccess.getOrAccess().getVKeyword_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Or__Group_1__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Or__Group_1__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Or__Group_1__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getOrAccess().getRightAssignment_1_2()); }
	(rule__Or__RightAssignment_1_2)
	{ after(grammarAccess.getOrAccess().getRightAssignment_1_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__And__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__And__Group__0__Impl
	rule__And__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__And__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAndAccess().getNandParserRuleCall_0()); }
	ruleNand
	{ after(grammarAccess.getAndAccess().getNandParserRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__And__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__And__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__And__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAndAccess().getGroup_1()); }
	(rule__And__Group_1__0)*
	{ after(grammarAccess.getAndAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__And__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__And__Group_1__0__Impl
	rule__And__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__And__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAndAccess().getAndLeftAction_1_0()); }
	()
	{ after(grammarAccess.getAndAccess().getAndLeftAction_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__And__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__And__Group_1__1__Impl
	rule__And__Group_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__And__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAndAccess().getCircumflexAccentKeyword_1_1()); }
	'^'
	{ after(grammarAccess.getAndAccess().getCircumflexAccentKeyword_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__And__Group_1__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__And__Group_1__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__And__Group_1__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAndAccess().getRightAssignment_1_2()); }
	(rule__And__RightAssignment_1_2)
	{ after(grammarAccess.getAndAccess().getRightAssignment_1_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Nand__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Nand__Group__0__Impl
	rule__Nand__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Nand__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNandAccess().getPrimaryParserRuleCall_0()); }
	rulePrimary
	{ after(grammarAccess.getNandAccess().getPrimaryParserRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Nand__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Nand__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Nand__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNandAccess().getGroup_1()); }
	(rule__Nand__Group_1__0)*
	{ after(grammarAccess.getNandAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Nand__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Nand__Group_1__0__Impl
	rule__Nand__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Nand__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNandAccess().getNandLeftAction_1_0()); }
	()
	{ after(grammarAccess.getNandAccess().getNandLeftAction_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Nand__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Nand__Group_1__1__Impl
	rule__Nand__Group_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Nand__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNandAccess().getAlternatives_1_1()); }
	(rule__Nand__Alternatives_1_1)
	{ after(grammarAccess.getNandAccess().getAlternatives_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Nand__Group_1__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Nand__Group_1__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Nand__Group_1__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNandAccess().getRightAssignment_1_2()); }
	(rule__Nand__RightAssignment_1_2)
	{ after(grammarAccess.getNandAccess().getRightAssignment_1_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Primary__Group_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Primary__Group_0__0__Impl
	rule__Primary__Group_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Primary__Group_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_0_0()); }
	'('
	{ after(grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Primary__Group_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Primary__Group_0__1__Impl
	rule__Primary__Group_0__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Primary__Group_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPrimaryAccess().getModelParserRuleCall_0_1()); }
	ruleModel
	{ after(grammarAccess.getPrimaryAccess().getModelParserRuleCall_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Primary__Group_0__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Primary__Group_0__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Primary__Group_0__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_0_2()); }
	')'
	{ after(grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_0_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Not__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Not__Group__0__Impl
	rule__Not__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Not__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNotAccess().getAlternatives_0()); }
	(rule__Not__Alternatives_0)
	{ after(grammarAccess.getNotAccess().getAlternatives_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Not__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Not__Group__1__Impl
	rule__Not__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Not__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNotAccess().getPrimaryParserRuleCall_1()); }
	rulePrimary
	{ after(grammarAccess.getNotAccess().getPrimaryParserRuleCall_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Not__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Not__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Not__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNotAccess().getNotExpressionAction_2()); }
	()
	{ after(grammarAccess.getNotAccess().getNotExpressionAction_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Instruction__SolverAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getInstructionAccess().getSolverSolverParserRuleCall_0_0()); }
		ruleSolver
		{ after(grammarAccess.getInstructionAccess().getSolverSolverParserRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Instruction__ExprAssignment_1_0_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getInstructionAccess().getExprModelParserRuleCall_1_0_1_0()); }
		ruleModel
		{ after(grammarAccess.getInstructionAccess().getExprModelParserRuleCall_1_0_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Instruction__PathAssignment_1_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getInstructionAccess().getPathSTRINGTerminalRuleCall_1_1_1_0()); }
		RULE_STRING
		{ after(grammarAccess.getInstructionAccess().getPathSTRINGTerminalRuleCall_1_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Solver__StrAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSolverAccess().getStrAlternatives_0()); }
		(rule__Solver__StrAlternatives_0)
		{ after(grammarAccess.getSolverAccess().getStrAlternatives_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__BiImpl__RightAssignment_1_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getBiImplAccess().getRightImplParserRuleCall_1_2_0()); }
		ruleImpl
		{ after(grammarAccess.getBiImplAccess().getRightImplParserRuleCall_1_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Impl__RightAssignment_1_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getImplAccess().getRightOrParserRuleCall_1_2_0()); }
		ruleOr
		{ after(grammarAccess.getImplAccess().getRightOrParserRuleCall_1_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Or__RightAssignment_1_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getOrAccess().getRightAndParserRuleCall_1_2_0()); }
		ruleAnd
		{ after(grammarAccess.getOrAccess().getRightAndParserRuleCall_1_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__And__RightAssignment_1_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAndAccess().getRightNandParserRuleCall_1_2_0()); }
		ruleNand
		{ after(grammarAccess.getAndAccess().getRightNandParserRuleCall_1_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Nand__RightAssignment_1_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getNandAccess().getRightPrimaryParserRuleCall_1_2_0()); }
		rulePrimary
		{ after(grammarAccess.getNandAccess().getRightPrimaryParserRuleCall_1_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Var__IdAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVarAccess().getIdIDTerminalRuleCall_0()); }
		RULE_ID
		{ after(grammarAccess.getVarAccess().getIdIDTerminalRuleCall_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Const__ValAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getConstAccess().getValAlternatives_0()); }
		(rule__Const__ValAlternatives_0)
		{ after(grammarAccess.getConstAccess().getValAlternatives_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
