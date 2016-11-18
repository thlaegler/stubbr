/*
 * generated by Xtext 2.10.0
 */
package com.laegler.stubbr.lang.parser.antlr;

import com.google.inject.Inject;
import com.laegler.stubbr.lang.parser.antlr.internal.InternalStubbrLangParser;
import com.laegler.stubbr.lang.services.StubbrLangGrammarAccess;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public class StubbrLangParser extends AbstractAntlrParser {

	@Inject
	private StubbrLangGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalStubbrLangParser createParser(XtextTokenStream stream) {
		return new InternalStubbrLangParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "Stubb";
	}

	public StubbrLangGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(StubbrLangGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}