package com.laegler.stubbr.lang.tests.parser;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.EcoreUtil2;
import org.junit.runner.RunWith;
import org.xpect.expectation.IStringDiffExpectation;
import org.xpect.expectation.StringDiffExpectation;
import org.xpect.parameter.ParameterParser;
import org.xpect.runner.Xpect;
import org.xpect.runner.XpectRunner;
import org.xpect.runner.XpectTestFiles;
import org.xpect.xtext.lib.util.EObjectFormatter;
import org.xpect.xtext.lib.util.TokenSerializer;

@RunWith(XpectRunner.class)
@XpectTestFiles(fileExtensions = "xt")
@SuppressWarnings("all")
public class StubbrParserTest {
  @Inject
  private TokenSerializer serializer;
  
  @Xpect
  public void simple() {
    System.out.println("Hello World");
  }
  
  @Xpect
  @ParameterParser(syntax = "\'delete\' arg1=OFFSET")
  public void astDiff(@StringDiffExpectation final IStringDiffExpectation expectation, final EObject arg1) {
    final EObject root = EcoreUtil2.getRootContainer(arg1);
    EObjectFormatter _eObjectFormatter = new EObjectFormatter();
    final String beforeDeletion = _eObjectFormatter.apply(root);
    EObjectFormatter _eObjectFormatter_1 = new EObjectFormatter();
    final String afterDeletion = _eObjectFormatter_1.apply(root);
    expectation.assertDiffEquals(beforeDeletion, afterDeletion);
  }
  
  @Xpect
  @ParameterParser(syntax = "arg1=OFFSET")
  public void delete(@StringDiffExpectation final IStringDiffExpectation expectation, final EObject arg1) {
    final EObject root = EcoreUtil2.getRootContainer(arg1);
    final List<TokenSerializer.Token> beforeDeletion = this.serializer.serialize(root);
    final List<TokenSerializer.Token> afterDeletion = this.serializer.serialize(root);
    expectation.<TokenSerializer.Token>assertDiffEquals(beforeDeletion, afterDeletion);
  }
}
