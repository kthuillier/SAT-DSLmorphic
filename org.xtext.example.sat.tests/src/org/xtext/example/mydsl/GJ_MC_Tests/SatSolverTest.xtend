/*
 * generated by Xtext 2.19.0
 */
package org.xtext.example.mydsl.GJ_MC_Tests

import com.google.inject.Inject
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.extensions.InjectionExtension
import org.eclipse.xtext.testing.util.ParseHelper
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.^extension.ExtendWith
import org.xtext.example.mydsl.GJ_MC_Process.Sat4jLauncher
import org.xtext.example.mydsl.sat.Expression
import org.xtext.example.mydsl.tests.SatInjectorProvider

@ExtendWith(InjectionExtension)
@InjectWith(SatInjectorProvider)
class SatSolverTest {
	@Inject
	ParseHelper<Expression> parseHelper
	
	@Test
	def void basicNotTest() {
		val result = parseHelper.parse('''
			solver sat4j-java
			!A
		''')
		Sat4jLauncher.launch(result)
		
		Assertions.assertNotNull(result)
		val errors = result.eResource.errors
		Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: «errors.join(", ")»''')

	}
	
	@Test
	def void basicOrTest() {
		val result = parseHelper.parse('''
			solver sat4j-jar
			A v B
		''')
		Sat4jLauncher.launch(result)
		
		Assertions.assertNotNull(result)
		val errors = result.eResource.errors
		Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: «errors.join(", ")»''')
	}
	
	@Test
	def void basicAndTest() {
		val result = parseHelper.parse('''
			solver sat4j-java
			A ^ B
		''')
		Sat4jLauncher.launch(result)
		
		Assertions.assertNotNull(result)
		val errors = result.eResource.errors
		Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: «errors.join(", ")»''')
	}
	
	@Test
	def void basicDNFFormTest() {
		val result = parseHelper.parse('''
			solver sat4j-jar
			A ^ B v C ^ D
		''')
		Sat4jLauncher.launch(result)
		
		Assertions.assertNotNull(result)
		val errors = result.eResource.errors
		Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: «errors.join(", ")»''')
	}
	
	@Test
	def void UnsatisfiableExpressionTest() {
		val result = parseHelper.parse('''
			solver sat4j-java
			A ^ !A
		''')
		Sat4jLauncher.launch(result)
		
		Assertions.assertNotNull(result)
		val errors = result.eResource.errors
		Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: «errors.join(", ")»''')
	}
	
}
