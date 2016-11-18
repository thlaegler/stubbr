package com.laegler.stubbr.lang.messages;

import com.laegler.stubbr.lang.stubbrLang.Stubb;
import org.antlr.runtime.MismatchedTokenException;
import org.antlr.runtime.RecognitionException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.nodemodel.SyntaxErrorMessage;
import org.eclipse.xtext.parser.antlr.ISyntaxErrorMessageProvider;
import org.eclipse.xtext.parser.antlr.SyntaxErrorMessageProvider;

@SuppressWarnings("all")
public class StubbrSyntaxErrorMessageProvider extends SyntaxErrorMessageProvider {
  public final static String MISSING_TEST_DESCRIPTION = "missingTestDescription";
  
  /**
   * Customized error message missing test description
   */
  @Override
  public SyntaxErrorMessage getSyntaxErrorMessage(final ISyntaxErrorMessageProvider.IParserErrorContext context) {
    SyntaxErrorMessage _xblockexpression = null;
    {
      if ((this.isMismatchedTokenExceptionExpectingEOF(context.getRecognitionException()) && 
        this.isTestModelWithoutTestStepsYet(context.getCurrentContext()))) {
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("Insert a test description before the actual test context.");
        _builder.newLine();
        _builder.append("E.g. \"* This test will check that the answer will be 42\" ");
        _builder.newLine();
        return new SyntaxErrorMessage(_builder.toString(), StubbrSyntaxErrorMessageProvider.MISSING_TEST_DESCRIPTION);
      }
      _xblockexpression = super.getSyntaxErrorMessage(context);
    }
    return _xblockexpression;
  }
  
  /**
   * exception is a MismatchedTokenException raised because EOF is expected
   */
  private boolean isMismatchedTokenExceptionExpectingEOF(final RecognitionException exception) {
    return ((exception instanceof MismatchedTokenException) && (((MismatchedTokenException) exception).expecting == (-1)));
  }
  
  /**
   * context is a TclModel which has no steps defined yet
   */
  private boolean isTestModelWithoutTestStepsYet(final EObject context) {
    if ((context instanceof Stubb)) {
      String _name = ((Stubb)context).getName();
      boolean _tripleNotEquals = (_name != null);
      if (_tripleNotEquals) {
        String _name_1 = ((Stubb)context).getName();
        return _name_1.isEmpty();
      }
    }
    return false;
  }
}
