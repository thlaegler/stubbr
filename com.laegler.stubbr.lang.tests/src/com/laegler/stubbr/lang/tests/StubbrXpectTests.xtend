package com.laegler.stubbr.lang.tests

import org.junit.runners.Suite.SuiteClasses
import org.junit.runners.Suite
import org.junit.runner.RunWith
import com.laegler.stubbr.lang.tests.xtext.StubbrXtextTest
import com.laegler.stubbr.lang.tests.generator.StubbrGeneratorTest
import com.laegler.stubbr.lang.tests.parser.StubbrParserTest

@SuiteClasses(#[
	StubbrParserTest,
	StubbrGeneratorTest,
	StubbrXtextTest
])
@RunWith(Suite)
class StubbrXpectTests {
}
