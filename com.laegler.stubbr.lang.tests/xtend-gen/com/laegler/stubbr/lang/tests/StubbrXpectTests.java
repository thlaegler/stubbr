package com.laegler.stubbr.lang.tests;

import com.laegler.stubbr.lang.tests.generator.StubbrGeneratorTest;
import com.laegler.stubbr.lang.tests.parser.StubbrParserTest;
import com.laegler.stubbr.lang.tests.xtext.StubbrXtextTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@Suite.SuiteClasses({ StubbrParserTest.class, StubbrGeneratorTest.class, StubbrXtextTest.class })
@RunWith(Suite.class)
@SuppressWarnings("all")
public class StubbrXpectTests {
}
