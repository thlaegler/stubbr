package com.laegler.stubbr.lang.tests.parser

import org.junit.runner.RunWith
import org.xpect.runner.Xpect
import org.xpect.runner.XpectRunner
import org.xpect.runner.XpectTestFiles
import org.xpect.xtext.lib.tests.GeneratorTest
import org.xpect.parameter.ParameterParser
import com.google.inject.Inject
import org.eclipse.emf.ecore.EObject
import org.xpect.expectation.StringDiffExpectation
import org.xpect.expectation.IStringDiffExpectation
import org.eclipse.xtext.EcoreUtil2
import org.xpect.xtext.lib.util.EObjectFormatter
import com.laegler.stubbr.lang.stubbrLang.Entity
import java.util.List
import org.xpect.xtext.lib.util.TokenSerializer.Token
import org.xpect.xtext.lib.util.TokenSerializer

@RunWith(XpectRunner)
@XpectTestFiles(fileExtensions='xt')
class StubbrParserTest {

	@Inject
	private TokenSerializer serializer;

//	@Inject
//	private DeleteUtil deleteUtil;

	@Xpect
	public def void simple() {
		System.out.println('Hello World')
	}

	@Xpect
	@ParameterParser(syntax="'delete' arg1=OFFSET")
	public def void astDiff(@StringDiffExpectation IStringDiffExpectation expectation, EObject arg1) {
		val EObject root = EcoreUtil2.getRootContainer(arg1);
		val String beforeDeletion = new EObjectFormatter().apply(root);

//		deleteUtil.deleteEntity((Entity) arg1);

		val String afterDeletion = new EObjectFormatter().apply(root);
		expectation.assertDiffEquals(beforeDeletion, afterDeletion);
	}

	@Xpect
	@ParameterParser(syntax="arg1=OFFSET")
	public def void delete(@StringDiffExpectation IStringDiffExpectation expectation, EObject arg1) {
		val EObject root = EcoreUtil2.getRootContainer(arg1);
		val List<Token> beforeDeletion = serializer.serialize(root);

//		deleteUtil.deleteEntity((Entity) arg1);

		val List<Token> afterDeletion = serializer.serialize(root);
		expectation.assertDiffEquals(beforeDeletion, afterDeletion);
	}

}
