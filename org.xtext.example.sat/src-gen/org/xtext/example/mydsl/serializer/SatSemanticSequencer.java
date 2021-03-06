/*
 * generated by Xtext 2.19.0
 */
package org.xtext.example.mydsl.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.xtext.example.mydsl.sat.And;
import org.xtext.example.mydsl.sat.BiImpl;
import org.xtext.example.mydsl.sat.Expression;
import org.xtext.example.mydsl.sat.File;
import org.xtext.example.mydsl.sat.Impl;
import org.xtext.example.mydsl.sat.Model;
import org.xtext.example.mydsl.sat.Nand;
import org.xtext.example.mydsl.sat.Not;
import org.xtext.example.mydsl.sat.Or;
import org.xtext.example.mydsl.sat.SatPackage;
import org.xtext.example.mydsl.services.SatGrammarAccess;

@SuppressWarnings("all")
public class SatSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private SatGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == SatPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case SatPackage.AND:
				sequence_And(context, (And) semanticObject); 
				return; 
			case SatPackage.BI_IMPL:
				sequence_BiImpl(context, (BiImpl) semanticObject); 
				return; 
			case SatPackage.EXPRESSION:
				if (rule == grammarAccess.getConstRule()) {
					sequence_Const(context, (Expression) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getBiImplRule()
						|| action == grammarAccess.getBiImplAccess().getBiImplLeftAction_1_0()
						|| rule == grammarAccess.getImplRule()
						|| action == grammarAccess.getImplAccess().getImplLeftAction_1_0()
						|| rule == grammarAccess.getOrRule()
						|| action == grammarAccess.getOrAccess().getOrLeftAction_1_0()
						|| rule == grammarAccess.getAndRule()
						|| action == grammarAccess.getAndAccess().getAndLeftAction_1_0()
						|| rule == grammarAccess.getNandRule()
						|| action == grammarAccess.getNandAccess().getNandLeftAction_1_0()
						|| rule == grammarAccess.getPrimaryRule()
						|| action == grammarAccess.getNotAccess().getNotExpressionAction_2()) {
					sequence_Const_Var(context, (Expression) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getVarRule()) {
					sequence_Var(context, (Expression) semanticObject); 
					return; 
				}
				else break;
			case SatPackage.FILE:
				sequence_File(context, (File) semanticObject); 
				return; 
			case SatPackage.IMPL:
				sequence_Impl(context, (Impl) semanticObject); 
				return; 
			case SatPackage.MODEL:
				sequence_Model(context, (Model) semanticObject); 
				return; 
			case SatPackage.NAND:
				sequence_Nand(context, (Nand) semanticObject); 
				return; 
			case SatPackage.NOT:
				sequence_Not(context, (Not) semanticObject); 
				return; 
			case SatPackage.OR:
				sequence_Or(context, (Or) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     BiImpl returns And
	 *     BiImpl.BiImpl_1_0 returns And
	 *     Impl returns And
	 *     Impl.Impl_1_0 returns And
	 *     Or returns And
	 *     Or.Or_1_0 returns And
	 *     And returns And
	 *     And.And_1_0 returns And
	 *     Nand returns And
	 *     Nand.Nand_1_0 returns And
	 *     Primary returns And
	 *     Not.Not_2 returns And
	 *
	 * Constraint:
	 *     (left=And_And_1_0 right=Nand)
	 */
	protected void sequence_And(ISerializationContext context, And semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SatPackage.Literals.AND__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SatPackage.Literals.AND__LEFT));
			if (transientValues.isValueTransient(semanticObject, SatPackage.Literals.AND__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SatPackage.Literals.AND__RIGHT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAndAccess().getAndLeftAction_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getAndAccess().getRightNandParserRuleCall_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     BiImpl returns BiImpl
	 *     BiImpl.BiImpl_1_0 returns BiImpl
	 *     Impl returns BiImpl
	 *     Impl.Impl_1_0 returns BiImpl
	 *     Or returns BiImpl
	 *     Or.Or_1_0 returns BiImpl
	 *     And returns BiImpl
	 *     And.And_1_0 returns BiImpl
	 *     Nand returns BiImpl
	 *     Nand.Nand_1_0 returns BiImpl
	 *     Primary returns BiImpl
	 *     Not.Not_2 returns BiImpl
	 *
	 * Constraint:
	 *     (left=BiImpl_BiImpl_1_0 right=Impl)
	 */
	protected void sequence_BiImpl(ISerializationContext context, BiImpl semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SatPackage.Literals.BI_IMPL__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SatPackage.Literals.BI_IMPL__LEFT));
			if (transientValues.isValueTransient(semanticObject, SatPackage.Literals.BI_IMPL__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SatPackage.Literals.BI_IMPL__RIGHT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getBiImplAccess().getBiImplLeftAction_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getBiImplAccess().getRightImplParserRuleCall_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Const returns Expression
	 *
	 * Constraint:
	 *     (val='true' | val='false')
	 */
	protected void sequence_Const(ISerializationContext context, Expression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     BiImpl returns Expression
	 *     BiImpl.BiImpl_1_0 returns Expression
	 *     Impl returns Expression
	 *     Impl.Impl_1_0 returns Expression
	 *     Or returns Expression
	 *     Or.Or_1_0 returns Expression
	 *     And returns Expression
	 *     And.And_1_0 returns Expression
	 *     Nand returns Expression
	 *     Nand.Nand_1_0 returns Expression
	 *     Primary returns Expression
	 *     Not.Not_2 returns Expression
	 *
	 * Constraint:
	 *     (id=ID | val='true' | val='false')
	 */
	protected void sequence_Const_Var(ISerializationContext context, Expression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     File returns File
	 *
	 * Constraint:
	 *     path=STRING
	 */
	protected void sequence_File(ISerializationContext context, File semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SatPackage.Literals.FILE__PATH) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SatPackage.Literals.FILE__PATH));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getFileAccess().getPathSTRINGTerminalRuleCall_1_0(), semanticObject.getPath());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     BiImpl returns Impl
	 *     BiImpl.BiImpl_1_0 returns Impl
	 *     Impl returns Impl
	 *     Impl.Impl_1_0 returns Impl
	 *     Or returns Impl
	 *     Or.Or_1_0 returns Impl
	 *     And returns Impl
	 *     And.And_1_0 returns Impl
	 *     Nand returns Impl
	 *     Nand.Nand_1_0 returns Impl
	 *     Primary returns Impl
	 *     Not.Not_2 returns Impl
	 *
	 * Constraint:
	 *     (left=Impl_Impl_1_0 right=Or)
	 */
	protected void sequence_Impl(ISerializationContext context, Impl semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SatPackage.Literals.IMPL__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SatPackage.Literals.IMPL__LEFT));
			if (transientValues.isValueTransient(semanticObject, SatPackage.Literals.IMPL__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SatPackage.Literals.IMPL__RIGHT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getImplAccess().getImplLeftAction_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getImplAccess().getRightOrParserRuleCall_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Model returns Model
	 *
	 * Constraint:
	 *     (solver=Solver (expression=BiImpl | file=File))
	 */
	protected void sequence_Model(ISerializationContext context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     BiImpl returns Nand
	 *     BiImpl.BiImpl_1_0 returns Nand
	 *     Impl returns Nand
	 *     Impl.Impl_1_0 returns Nand
	 *     Or returns Nand
	 *     Or.Or_1_0 returns Nand
	 *     And returns Nand
	 *     And.And_1_0 returns Nand
	 *     Nand returns Nand
	 *     Nand.Nand_1_0 returns Nand
	 *     Primary returns Nand
	 *     Not.Not_2 returns Nand
	 *
	 * Constraint:
	 *     (left=Nand_Nand_1_0 right=Primary)
	 */
	protected void sequence_Nand(ISerializationContext context, Nand semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SatPackage.Literals.NAND__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SatPackage.Literals.NAND__LEFT));
			if (transientValues.isValueTransient(semanticObject, SatPackage.Literals.NAND__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SatPackage.Literals.NAND__RIGHT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getNandAccess().getNandLeftAction_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getNandAccess().getRightPrimaryParserRuleCall_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     BiImpl returns Not
	 *     BiImpl.BiImpl_1_0 returns Not
	 *     Impl returns Not
	 *     Impl.Impl_1_0 returns Not
	 *     Or returns Not
	 *     Or.Or_1_0 returns Not
	 *     And returns Not
	 *     And.And_1_0 returns Not
	 *     Nand returns Not
	 *     Nand.Nand_1_0 returns Not
	 *     Primary returns Not
	 *     Not returns Not
	 *     Not.Not_2 returns Not
	 *
	 * Constraint:
	 *     expression=Not_Not_2
	 */
	protected void sequence_Not(ISerializationContext context, Not semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SatPackage.Literals.NOT__EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SatPackage.Literals.NOT__EXPRESSION));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getNotAccess().getNotExpressionAction_2(), semanticObject.getExpression());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     BiImpl returns Or
	 *     BiImpl.BiImpl_1_0 returns Or
	 *     Impl returns Or
	 *     Impl.Impl_1_0 returns Or
	 *     Or returns Or
	 *     Or.Or_1_0 returns Or
	 *     And returns Or
	 *     And.And_1_0 returns Or
	 *     Nand returns Or
	 *     Nand.Nand_1_0 returns Or
	 *     Primary returns Or
	 *     Not.Not_2 returns Or
	 *
	 * Constraint:
	 *     (left=Or_Or_1_0 right=And)
	 */
	protected void sequence_Or(ISerializationContext context, Or semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SatPackage.Literals.OR__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SatPackage.Literals.OR__LEFT));
			if (transientValues.isValueTransient(semanticObject, SatPackage.Literals.OR__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SatPackage.Literals.OR__RIGHT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getOrAccess().getOrLeftAction_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getOrAccess().getRightAndParserRuleCall_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Var returns Expression
	 *
	 * Constraint:
	 *     id=ID
	 */
	protected void sequence_Var(ISerializationContext context, Expression semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SatPackage.Literals.EXPRESSION__ID) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SatPackage.Literals.EXPRESSION__ID));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getVarAccess().getIdIDTerminalRuleCall_0(), semanticObject.getId());
		feeder.finish();
	}
	
	
}
