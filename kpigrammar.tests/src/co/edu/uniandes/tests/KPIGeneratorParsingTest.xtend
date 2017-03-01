/*
 * generated by Xtext 2.10.0
 */
package co.edu.uniandes.tests

import co.edu.uniandes.kPIGenerator.Root
import com.google.inject.Inject
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.util.ParseHelper
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(XtextRunner)
@InjectWith(KPIGeneratorInjectorProvider)
class KPIGeneratorParsingTest{

	@Inject
	ParseHelper<Root> parseHelper

	@Test 
	def void loadModel() {
		val result = parseHelper.parse('''
			Hello Xtext!
		''')
		Assert.assertNotNull(result)
	}

}