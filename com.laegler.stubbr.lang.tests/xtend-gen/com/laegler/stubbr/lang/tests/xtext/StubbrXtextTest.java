package com.laegler.stubbr.lang.tests.xtext;

import org.junit.runner.RunWith;
import org.xpect.runner.Xpect;
import org.xpect.runner.XpectRunner;
import org.xpect.runner.XpectTestFiles;

@RunWith(XpectRunner.class)
@XpectTestFiles(fileExtensions = "xt")
@SuppressWarnings("all")
public class StubbrXtextTest {
  @Xpect
  public void simple() {
    System.out.println("Hello World");
  }
}
