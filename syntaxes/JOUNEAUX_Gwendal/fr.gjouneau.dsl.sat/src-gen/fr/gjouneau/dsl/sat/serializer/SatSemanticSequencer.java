/*
 * generated by Xtext 2.19.0
 */
package fr.gjouneau.dsl.sat.serializer;

import com.google.inject.Inject;
import fr.gjouneau.dsl.sat.sat.And;
import fr.gjouneau.dsl.sat.sat.Equiv;
import fr.gjouneau.dsl.sat.sat.Implies;
import fr.gjouneau.dsl.sat.sat.ModelSAT;
import fr.gjouneau.dsl.sat.sat.Nand;
import fr.gjouneau.dsl.sat.sat.Not;
import fr.gjouneau.dsl.sat.sat.Or;
import fr.gjouneau.dsl.sat.sat.SatPackage;
import fr.gjouneau.dsl.sat.sat.Variable;
import fr.gjouneau.dsl.sat.services.SatGrammarAccess;
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
			case SatPackage.EQUIV:
				sequence_Equiv(context, (Equiv) semanticObject); 
				return; 
			case SatPackage.IMPLIES:
				sequence_Implies(context, (Implies) semanticObject); 
				return; 
			case SatPackage.MODEL_SAT:
				sequence_ModelSAT(context, (ModelSAT) semanticObject); 
				return; 
			case SatPackage.NAND:
				sequence_Nand(context, (Nand) semanticObject); 
				return; 
			case SatPackage.NOT:
				sequence_Primary(context, (Not) semanticObject); 
				return; 
			case SatPackage.OR:
				sequence_Or(context, (Or) semanticObject); 
				return; 
			case SatPackage.VARIABLE:
				sequence_Atomic(context, (Variable) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Expression returns And
	 *     Equiv returns And
	 *     Equiv.Equiv_1_0 returns And
	 *     Implies returns And
	 *     Implies.Implies_1_0 returns And
	 *     Or returns And
	 *     Or.Or_1_0 returns And
	 *     And returns And
	 *     And.And_1_0 returns And
	 *     Nand returns And
	 *     Nand.Nand_1_0 returns And
	 *     Primary returns And
	 *
	 * Constraint:
	 *     (lhs=And_And_1_0 rhs=Nand)
	 */
	protected void sequence_And(ISerializationContext context, And semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SatPackage.Literals.AND__LHS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SatPackage.Literals.AND__LHS));
			if (transientValues.isValueTransient(semanticObject, SatPackage.Literals.AND__RHS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SatPackage.Literals.AND__RHS));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAndAccess().getAndLhsAction_1_0(), semanticObject.getLhs());
		feeder.accept(grammarAccess.getAndAccess().getRhsNandParserRuleCall_1_2_0(), semanticObject.getRhs());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Expression returns Variable
	 *     Equiv returns Variable
	 *     Equiv.Equiv_1_0 returns Variable
	 *     Implies returns Variable
	 *     Implies.Implies_1_0 returns Variable
	 *     Or returns Variable
	 *     Or.Or_1_0 returns Variable
	 *     And returns Variable
	 *     And.And_1_0 returns Variable
	 *     Nand returns Variable
	 *     Nand.Nand_1_0 returns Variable
	 *     Primary returns Variable
	 *     Atomic returns Variable
	 *
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_Atomic(ISerializationContext context, Variable semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SatPackage.Literals.VARIABLE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SatPackage.Literals.VARIABLE__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAtomicAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Expression returns Equiv
	 *     Equiv returns Equiv
	 *     Equiv.Equiv_1_0 returns Equiv
	 *     Implies returns Equiv
	 *     Implies.Implies_1_0 returns Equiv
	 *     Or returns Equiv
	 *     Or.Or_1_0 returns Equiv
	 *     And returns Equiv
	 *     And.And_1_0 returns Equiv
	 *     Nand returns Equiv
	 *     Nand.Nand_1_0 returns Equiv
	 *     Primary returns Equiv
	 *
	 * Constraint:
	 *     (lhs=Equiv_Equiv_1_0 rhs=Implies)
	 */
	protected void sequence_Equiv(ISerializationContext context, Equiv semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SatPackage.Literals.EQUIV__LHS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SatPackage.Literals.EQUIV__LHS));
			if (transientValues.isValueTransient(semanticObject, SatPackage.Literals.EQUIV__RHS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SatPackage.Literals.EQUIV__RHS));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getEquivAccess().getEquivLhsAction_1_0(), semanticObject.getLhs());
		feeder.accept(grammarAccess.getEquivAccess().getRhsImpliesParserRuleCall_1_2_0(), semanticObject.getRhs());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Expression returns Implies
	 *     Equiv returns Implies
	 *     Equiv.Equiv_1_0 returns Implies
	 *     Implies returns Implies
	 *     Implies.Implies_1_0 returns Implies
	 *     Or returns Implies
	 *     Or.Or_1_0 returns Implies
	 *     And returns Implies
	 *     And.And_1_0 returns Implies
	 *     Nand returns Implies
	 *     Nand.Nand_1_0 returns Implies
	 *     Primary returns Implies
	 *
	 * Constraint:
	 *     (lhs=Implies_Implies_1_0 rhs=Or)
	 */
	protected void sequence_Implies(ISerializationContext context, Implies semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SatPackage.Literals.IMPLIES__LHS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SatPackage.Literals.IMPLIES__LHS));
			if (transientValues.isValueTransient(semanticObject, SatPackage.Literals.IMPLIES__RHS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SatPackage.Literals.IMPLIES__RHS));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getImpliesAccess().getImpliesLhsAction_1_0(), semanticObject.getLhs());
		feeder.accept(grammarAccess.getImpliesAccess().getRhsOrParserRuleCall_1_2_0(), semanticObject.getRhs());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ModelSAT returns ModelSAT
	 *
	 * Constraint:
	 *     (expression+=Expression expression+=Expression*)?
	 */
	protected void sequence_ModelSAT(ISerializationContext context, ModelSAT semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Expression returns Nand
	 *     Equiv returns Nand
	 *     Equiv.Equiv_1_0 returns Nand
	 *     Implies returns Nand
	 *     Implies.Implies_1_0 returns Nand
	 *     Or returns Nand
	 *     Or.Or_1_0 returns Nand
	 *     And returns Nand
	 *     And.And_1_0 returns Nand
	 *     Nand returns Nand
	 *     Nand.Nand_1_0 returns Nand
	 *     Primary returns Nand
	 *
	 * Constraint:
	 *     (lhs=Nand_Nand_1_0 rhs=Primary)
	 */
	protected void sequence_Nand(ISerializationContext context, Nand semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SatPackage.Literals.NAND__LHS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SatPackage.Literals.NAND__LHS));
			if (transientValues.isValueTransient(semanticObject, SatPackage.Literals.NAND__RHS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SatPackage.Literals.NAND__RHS));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getNandAccess().getNandLhsAction_1_0(), semanticObject.getLhs());
		feeder.accept(grammarAccess.getNandAccess().getRhsPrimaryParserRuleCall_1_2_0(), semanticObject.getRhs());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Expression returns Or
	 *     Equiv returns Or
	 *     Equiv.Equiv_1_0 returns Or
	 *     Implies returns Or
	 *     Implies.Implies_1_0 returns Or
	 *     Or returns Or
	 *     Or.Or_1_0 returns Or
	 *     And returns Or
	 *     And.And_1_0 returns Or
	 *     Nand returns Or
	 *     Nand.Nand_1_0 returns Or
	 *     Primary returns Or
	 *
	 * Constraint:
	 *     (lhs=Or_Or_1_0 rhs=And)
	 */
	protected void sequence_Or(ISerializationContext context, Or semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SatPackage.Literals.OR__LHS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SatPackage.Literals.OR__LHS));
			if (transientValues.isValueTransient(semanticObject, SatPackage.Literals.OR__RHS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SatPackage.Literals.OR__RHS));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getOrAccess().getOrLhsAction_1_0(), semanticObject.getLhs());
		feeder.accept(grammarAccess.getOrAccess().getRhsAndParserRuleCall_1_2_0(), semanticObject.getRhs());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Expression returns Not
	 *     Equiv returns Not
	 *     Equiv.Equiv_1_0 returns Not
	 *     Implies returns Not
	 *     Implies.Implies_1_0 returns Not
	 *     Or returns Not
	 *     Or.Or_1_0 returns Not
	 *     And returns Not
	 *     And.And_1_0 returns Not
	 *     Nand returns Not
	 *     Nand.Nand_1_0 returns Not
	 *     Primary returns Not
	 *
	 * Constraint:
	 *     expression=Primary
	 */
	protected void sequence_Primary(ISerializationContext context, Not semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SatPackage.Literals.NOT__EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SatPackage.Literals.NOT__EXPRESSION));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getPrimaryAccess().getExpressionPrimaryParserRuleCall_1_2_0(), semanticObject.getExpression());
		feeder.finish();
	}
	
	
}
