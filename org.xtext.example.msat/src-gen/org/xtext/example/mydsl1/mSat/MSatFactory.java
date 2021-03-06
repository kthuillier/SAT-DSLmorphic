/**
 * generated by Xtext 2.19.0
 */
package org.xtext.example.mydsl1.mSat;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.xtext.example.mydsl1.mSat.MSatPackage
 * @generated
 */
public interface MSatFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  MSatFactory eINSTANCE = org.xtext.example.mydsl1.mSat.impl.MSatFactoryImpl.init();

  /**
   * Returns a new object of class '<em>SAT Morphic</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>SAT Morphic</em>'.
   * @generated
   */
  SATMorphic createSATMorphic();

  /**
   * Returns a new object of class '<em>SAT Solver</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>SAT Solver</em>'.
   * @generated
   */
  SATSolver createSATSolver();

  /**
   * Returns a new object of class '<em>Sat4 J</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Sat4 J</em>'.
   * @generated
   */
  Sat4J createSat4J();

  /**
   * Returns a new object of class '<em>Solver Version</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Solver Version</em>'.
   * @generated
   */
  SolverVersion createSolverVersion();

  /**
   * Returns a new object of class '<em>Mini SAT</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Mini SAT</em>'.
   * @generated
   */
  MiniSAT createMiniSAT();

  /**
   * Returns a new object of class '<em>Crypto Mini SAT</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Crypto Mini SAT</em>'.
   * @generated
   */
  CryptoMiniSAT createCryptoMiniSAT();

  /**
   * Returns a new object of class '<em>Mini SAT Parameter</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Mini SAT Parameter</em>'.
   * @generated
   */
  MiniSATParameter createMiniSATParameter();

  /**
   * Returns a new object of class '<em>Benchmark</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Benchmark</em>'.
   * @generated
   */
  Benchmark createBenchmark();

  /**
   * Returns a new object of class '<em>Benchmark Dimacs</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Benchmark Dimacs</em>'.
   * @generated
   */
  BenchmarkDimacs createBenchmarkDimacs();

  /**
   * Returns a new object of class '<em>Benchmark Formula</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Benchmark Formula</em>'.
   * @generated
   */
  BenchmarkFormula createBenchmarkFormula();

  /**
   * Returns a new object of class '<em>Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Expression</em>'.
   * @generated
   */
  Expression createExpression();

  /**
   * Returns a new object of class '<em>Bi Impl</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Bi Impl</em>'.
   * @generated
   */
  BiImpl createBiImpl();

  /**
   * Returns a new object of class '<em>Impl</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Impl</em>'.
   * @generated
   */
  Impl createImpl();

  /**
   * Returns a new object of class '<em>Or</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Or</em>'.
   * @generated
   */
  Or createOr();

  /**
   * Returns a new object of class '<em>And</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>And</em>'.
   * @generated
   */
  And createAnd();

  /**
   * Returns a new object of class '<em>Nand</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Nand</em>'.
   * @generated
   */
  Nand createNand();

  /**
   * Returns a new object of class '<em>Not</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Not</em>'.
   * @generated
   */
  Not createNot();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  MSatPackage getMSatPackage();

} //MSatFactory
