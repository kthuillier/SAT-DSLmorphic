/*
 * generated by Xtext 2.19.0
 */
package org.xtext.example.mydsl1.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.xtext.example.mydsl1.ide.contentassist.antlr.internal.InternalMSatParser;
import org.xtext.example.mydsl1.services.MSatGrammarAccess;

public class MSatParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(MSatGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, MSatGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getSATSolverAccess().getSolverAlternatives_0_0(), "rule__SATSolver__SolverAlternatives_0_0");
			builder.put(grammarAccess.getBenchmarkAccess().getAlternatives(), "rule__Benchmark__Alternatives");
			builder.put(grammarAccess.getNandAccess().getAlternatives_1_1(), "rule__Nand__Alternatives_1_1");
			builder.put(grammarAccess.getPrimaryAccess().getAlternatives(), "rule__Primary__Alternatives");
			builder.put(grammarAccess.getNotAccess().getAlternatives_0(), "rule__Not__Alternatives_0");
			builder.put(grammarAccess.getConstAccess().getValAlternatives_0(), "rule__Const__ValAlternatives_0");
			builder.put(grammarAccess.getSat4JVariantAccess().getAlternatives(), "rule__Sat4JVariant__Alternatives");
			builder.put(grammarAccess.getSATMorphicAccess().getGroup(), "rule__SATMorphic__Group__0");
			builder.put(grammarAccess.getSATSolverAccess().getGroup(), "rule__SATSolver__Group__0");
			builder.put(grammarAccess.getSolverVersionAccess().getGroup(), "rule__SolverVersion__Group__0");
			builder.put(grammarAccess.getMiniSATAccess().getGroup(), "rule__MiniSAT__Group__0");
			builder.put(grammarAccess.getMiniSATParameterAccess().getGroup(), "rule__MiniSATParameter__Group__0");
			builder.put(grammarAccess.getBenchmarkDimacsAccess().getGroup(), "rule__BenchmarkDimacs__Group__0");
			builder.put(grammarAccess.getBenchmarkDimacsAccess().getGroup_1(), "rule__BenchmarkDimacs__Group_1__0");
			builder.put(grammarAccess.getBenchmarkDimacsAccess().getGroup_1_1(), "rule__BenchmarkDimacs__Group_1_1__0");
			builder.put(grammarAccess.getBenchmarkFormulaAccess().getGroup(), "rule__BenchmarkFormula__Group__0");
			builder.put(grammarAccess.getBenchmarkFormulaAccess().getGroup_1(), "rule__BenchmarkFormula__Group_1__0");
			builder.put(grammarAccess.getBenchmarkFormulaAccess().getGroup_1_1(), "rule__BenchmarkFormula__Group_1_1__0");
			builder.put(grammarAccess.getBiImplAccess().getGroup(), "rule__BiImpl__Group__0");
			builder.put(grammarAccess.getBiImplAccess().getGroup_1(), "rule__BiImpl__Group_1__0");
			builder.put(grammarAccess.getImplAccess().getGroup(), "rule__Impl__Group__0");
			builder.put(grammarAccess.getImplAccess().getGroup_1(), "rule__Impl__Group_1__0");
			builder.put(grammarAccess.getOrAccess().getGroup(), "rule__Or__Group__0");
			builder.put(grammarAccess.getOrAccess().getGroup_1(), "rule__Or__Group_1__0");
			builder.put(grammarAccess.getAndAccess().getGroup(), "rule__And__Group__0");
			builder.put(grammarAccess.getAndAccess().getGroup_1(), "rule__And__Group_1__0");
			builder.put(grammarAccess.getNandAccess().getGroup(), "rule__Nand__Group__0");
			builder.put(grammarAccess.getNandAccess().getGroup_1(), "rule__Nand__Group_1__0");
			builder.put(grammarAccess.getPrimaryAccess().getGroup_0(), "rule__Primary__Group_0__0");
			builder.put(grammarAccess.getNotAccess().getGroup(), "rule__Not__Group__0");
			builder.put(grammarAccess.getSATMorphicAccess().getSolversAssignment_1(), "rule__SATMorphic__SolversAssignment_1");
			builder.put(grammarAccess.getSATMorphicAccess().getBenchmarkAssignment_2(), "rule__SATMorphic__BenchmarkAssignment_2");
			builder.put(grammarAccess.getSATSolverAccess().getSolverAssignment_0(), "rule__SATSolver__SolverAssignment_0");
			builder.put(grammarAccess.getSATSolverAccess().getVersionAssignment_1(), "rule__SATSolver__VersionAssignment_1");
			builder.put(grammarAccess.getSat4JAccess().getVariantAssignment(), "rule__Sat4J__VariantAssignment");
			builder.put(grammarAccess.getSolverVersionAccess().getVersionAssignment_1(), "rule__SolverVersion__VersionAssignment_1");
			builder.put(grammarAccess.getMiniSATAccess().getVariantAssignment_0(), "rule__MiniSAT__VariantAssignment_0");
			builder.put(grammarAccess.getMiniSATAccess().getParameterAssignment_1(), "rule__MiniSAT__ParameterAssignment_1");
			builder.put(grammarAccess.getCryptoMiniSATAccess().getVariantAssignment(), "rule__CryptoMiniSAT__VariantAssignment");
			builder.put(grammarAccess.getMiniSATParameterAccess().getRndfreqAssignment_1(), "rule__MiniSATParameter__RndfreqAssignment_1");
			builder.put(grammarAccess.getBenchmarkDimacsAccess().getDimacsesAssignment_1_0(), "rule__BenchmarkDimacs__DimacsesAssignment_1_0");
			builder.put(grammarAccess.getBenchmarkDimacsAccess().getDimacsesAssignment_1_1_1(), "rule__BenchmarkDimacs__DimacsesAssignment_1_1_1");
			builder.put(grammarAccess.getBenchmarkFormulaAccess().getExpressionsAssignment_1_0(), "rule__BenchmarkFormula__ExpressionsAssignment_1_0");
			builder.put(grammarAccess.getBenchmarkFormulaAccess().getExpressionsAssignment_1_1_1(), "rule__BenchmarkFormula__ExpressionsAssignment_1_1_1");
			builder.put(grammarAccess.getBiImplAccess().getRightAssignment_1_2(), "rule__BiImpl__RightAssignment_1_2");
			builder.put(grammarAccess.getImplAccess().getRightAssignment_1_2(), "rule__Impl__RightAssignment_1_2");
			builder.put(grammarAccess.getOrAccess().getRightAssignment_1_2(), "rule__Or__RightAssignment_1_2");
			builder.put(grammarAccess.getAndAccess().getRightAssignment_1_2(), "rule__And__RightAssignment_1_2");
			builder.put(grammarAccess.getNandAccess().getRightAssignment_1_2(), "rule__Nand__RightAssignment_1_2");
			builder.put(grammarAccess.getVarAccess().getIdAssignment(), "rule__Var__IdAssignment");
			builder.put(grammarAccess.getConstAccess().getValAssignment(), "rule__Const__ValAssignment");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private MSatGrammarAccess grammarAccess;

	@Override
	protected InternalMSatParser createParser() {
		InternalMSatParser result = new InternalMSatParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public MSatGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(MSatGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
