package com.laegler.stubbr.lang.tests.xtext

import org.junit.runner.RunWith
import org.xpect.runner.Xpect
import org.xpect.runner.XpectRunner
import org.xpect.runner.XpectTestFiles

@RunWith(XpectRunner)
@XpectTestFiles(fileExtensions='xt')
class StubbrXtextTest {

	@Xpect
	public def void simple() {
		System.out.println('Hello World')
	}

}
