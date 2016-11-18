package com.laegler.stubbr.lang.tests.generator

import org.junit.runner.RunWith
import org.xpect.runner.Xpect
import org.xpect.runner.XpectRunner
import org.xpect.runner.XpectTestFiles
import org.xpect.xtext.lib.tests.GeneratorTest

@RunWith(XpectRunner)
@XpectTestFiles(fileExtensions='xt')
class StubbrGeneratorTest extends GeneratorTest {

	@Xpect
	public def void simple() {
		System.out.println('Hello World')
	}

}
