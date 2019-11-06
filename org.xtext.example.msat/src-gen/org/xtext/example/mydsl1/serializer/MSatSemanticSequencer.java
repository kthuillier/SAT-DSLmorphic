/*
 * generated by Xtext 2.19.0
 */
package org.xtext.example.mydsl1.serializer;

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
import org.xtext.example.mydsl1.mSat.And;
import org.xtext.example.mydsl1.mSat.BenchmarkDimacs;
import org.xtext.example.mydsl1.mSat.BenchmarkFormula;
import org.xtext.example.mydsl1.mSat.BiImpl;
import org.xtext.example.mydsl1.mSat.CryptoMiniSAT;
import org.xtext.example.mydsl1.mSat.Expression;
import org.xtext.example.mydsl1.mSat.Impl;
import org.xtext.example.mydsl1.mSat.MSatPackage;
import org.xtext.example.mydsl1.mSat.MiniSAT;
import org.xtext.example.mydsl1.mSat.MiniSATParameter;
import org.xtext.example.mydsl1.mSat.Nand;
import org.xtext.example.mydsl1.mSat.Not;
import org.xtext.example.mydsl1.mSat.Or;
import org.xtext.example.mydsl1.mSat.SATMorphic;
import org.xtext.example.mydsl1.mSat.SATSolver;
import org.xtext.example.mydsl1.mSat.Sat4J;
import org.xtext.example.mydsl1.mSat.SolverVersion;
import org.xtext.example.mydsl1.services.MSatGrammarAccess;

@SuppressWarnings("all")
public class MSatSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private MSatGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == MSatPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case MSatPackage.AND:
				sequence_And(context, (And) semanticObject); 
				return; 
			case MSatPackage.BENCHMARK_DIMACS:
				sequence_BenchmarkDimacs(context, (BenchmarkDimacs) semanticObject); 
				return; 
			case MSatPackage.BENCHMARK_FORMULA:
				sequence_BenchmarkFormula(context, (BenchmarkFormula) semanticObject); 
				return; 
			case MSatPackage.BI_IMPL:
				sequence_BiImpl(context, (BiImpl) semanticObject); 
				return; 
			case MSatPackage.CRYPTO_MINI_SAT:
				sequence_CryptoMiniSAT(context, (CryptoMiniSAT) semanticObject); 
				return; 
			case MSatPackage.EXPRESSION:
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
			case MSatPackage.IMPL:
				sequence_Impl(context, (Impl) semanticObject); 
				return; 
			case MSatPackage.MINI_SAT:
				sequence_MiniSAT(context, (MiniSAT) semanticObject); 
				return; 
			case MSatPackage.MINI_SAT_PARAMETER:
				sequence_MiniSATParameter(context, (MiniSATParameter) semanticObject); 
				return; 
			case MSatPackage.NAND:
				sequence_Nand(context, (Nand) semanticObject); 
				return; 
			case MSatPackage.NOT:
				sequence_Not(context, (Not) semanticObject); 
				return; 
			case MSatPackage.OR:
				sequence_Or(context, (Or) semanticObject); 
				return; 
			case MSatPackage.SAT_MORPHIC:
				sequence_SATMorphic(context, (SATMorphic) semanticObject); 
				return; 
			case MSatPackage.SAT_SOLVER:
				sequence_SATSolver(context, (SATSolver) semanticObject); 
				return; 
			case MSatPackage.SAT4_J:
				sequence_Sat4J(context, (Sat4J) semanticObject); 
				return; 
			case MSatPackage.SOLVER_VERSION:
				sequence_SolverVersion(context, (SolverVersion) semanticObject); 
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
			if (transientValues.isValueTransient(semanticObject, MSatPackage.Literals.AND__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MSatPackage.Literals.AND__LEFT));
			if (transientValues.isValueTransient(semanticObject, MSatPackage.Literals.AND__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MSatPackage.Literals.AND__RIGHT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAndAccess().getAndLeftAction_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getAndAccess().getRightNandParserRuleCall_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Benchmark returns BenchmarkDimacs
	 *     BenchmarkDimacs returns BenchmarkDimacs
	 *
	 * Constraint:
	 *     (dimacses+=STRING dimacses+=STRING*)
	 */
	protected void sequence_BenchmarkDimacs(ISerializationContext context, BenchmarkDimacs semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Benchmark returns BenchmarkFormula
	 *     BenchmarkFormula returns BenchmarkFormula
	 *
	 * Constraint:
	 *     (expressions+=BiImpl expressions+=BiImpl*)
	 */
	protected void sequence_BenchmarkFormula(ISerializationContext context, BenchmarkFormula semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
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
			if (transientValues.isValueTransient(semanticObject, MSatPackage.Literals.BI_IMPL__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MSatPackage.Literals.BI_IMPL__LEFT));
			if (transientValues.isValueTransient(semanticObject, MSatPackage.Literals.BI_IMPL__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MSatPackage.Literals.BI_IMPL__RIGHT));
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
	 *     CryptoMiniSAT returns CryptoMiniSAT
	 *
	 * Constraint:
	 *     variant='cryptominisat'
	 */
	protected void sequence_CryptoMiniSAT(ISerializationContext context, CryptoMiniSAT semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MSatPackage.Literals.CRYPTO_MINI_SAT__VARIANT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MSatPackage.Literals.CRYPTO_MINI_SAT__VARIANT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getCryptoMiniSATAccess().getVariantCryptominisatKeyword_0(), semanticObject.getVariant());
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
			if (transientValues.isValueTransient(semanticObject, MSatPackage.Literals.IMPL__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MSatPackage.Literals.IMPL__LEFT));
			if (transientValues.isValueTransient(semanticObject, MSatPackage.Literals.IMPL__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MSatPackage.Literals.IMPL__RIGHT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getImplAccess().getImplLeftAction_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getImplAccess().getRightOrParserRuleCall_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     MiniSATParameter returns MiniSATParameter
	 *
	 * Constraint:
	 *     rndfreq=PROBA
	 */
	protected void sequence_MiniSATParameter(ISerializationContext context, MiniSATParameter semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MSatPackage.Literals.MINI_SAT_PARAMETER__RNDFREQ) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MSatPackage.Literals.MINI_SAT_PARAMETER__RNDFREQ));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getMiniSATParameterAccess().getRndfreqPROBATerminalRuleCall_1_0(), semanticObject.getRndfreq());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     MiniSAT returns MiniSAT
	 *
	 * Constraint:
	 *     (variant='minisat' parameter=MiniSATParameter?)
	 */
	protected void sequence_MiniSAT(ISerializationContext context, MiniSAT semanticObject) {
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
			if (transientValues.isValueTransient(semanticObject, MSatPackage.Literals.NAND__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MSatPackage.Literals.NAND__LEFT));
			if (transientValues.isValueTransient(semanticObject, MSatPackage.Literals.NAND__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MSatPackage.Literals.NAND__RIGHT));
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
			if (transientValues.isValueTransient(semanticObject, MSatPackage.Literals.NOT__EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MSatPackage.Literals.NOT__EXPRESSION));
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
			if (transientValues.isValueTransient(semanticObject, MSatPackage.Literals.OR__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MSatPackage.Literals.OR__LEFT));
			if (transientValues.isValueTransient(semanticObject, MSatPackage.Literals.OR__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MSatPackage.Literals.OR__RIGHT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getOrAccess().getOrLeftAction_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getOrAccess().getRightAndParserRuleCall_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     SATMorphic returns SATMorphic
	 *
	 * Constraint:
	 *     (solvers+=SATSolver+ benchmark=Benchmark)
	 */
	protected void sequence_SATMorphic(ISerializationContext context, SATMorphic semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     SATSolver returns SATSolver
	 *
	 * Constraint:
	 *     ((solver=Sat4J | solver=CryptoMiniSAT | solver=MiniSAT) version=SolverVersion?)
	 */
	protected void sequence_SATSolver(ISerializationContext context, SATSolver semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Sat4J returns Sat4J
	 *
	 * Constraint:
	 *     variant=Sat4JVariant
	 */
	protected void sequence_Sat4J(ISerializationContext context, Sat4J semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MSatPackage.Literals.SAT4_J__VARIANT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MSatPackage.Literals.SAT4_J__VARIANT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getSat4JAccess().getVariantSat4JVariantEnumRuleCall_0(), semanticObject.getVariant());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     SolverVersion returns SolverVersion
	 *
	 * Constraint:
	 *     version=STRING
	 */
	protected void sequence_SolverVersion(ISerializationContext context, SolverVersion semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MSatPackage.Literals.SOLVER_VERSION__VERSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MSatPackage.Literals.SOLVER_VERSION__VERSION));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getSolverVersionAccess().getVersionSTRINGTerminalRuleCall_1_0(), semanticObject.getVersion());
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
			if (transientValues.isValueTransient(semanticObject, MSatPackage.Literals.EXPRESSION__ID) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MSatPackage.Literals.EXPRESSION__ID));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getVarAccess().getIdIDTerminalRuleCall_0(), semanticObject.getId());
		feeder.finish();
	}
	
	
}
