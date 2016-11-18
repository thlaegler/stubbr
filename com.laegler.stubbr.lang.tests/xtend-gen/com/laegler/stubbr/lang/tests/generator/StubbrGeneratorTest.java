package com.laegler.stubbr.lang.tests.generator;

import org.junit.runner.RunWith;
import org.xpect.runner.Xpect;
import org.xpect.runner.XpectRunner;
import org.xpect.runner.XpectTestFiles;
import org.xpect.xtext.lib.tests.GeneratorTest;

@RunWith(XpectRunner.class)
@XpectTestFiles(fileExtensions = "xt")
@SuppressWarnings("all")
public class StubbrGeneratorTest extends GeneratorTest {
  @Xpect
  public void simple() {
    System.out.println("Hello World");
  }
}
