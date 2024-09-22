// Generated from C:/Users/luisf/IdeaProjects/ConditionalGrammar/src/main/java/org/example/Gramatica.g4 by ANTLR 4.13.1
package org.example.misArchivos;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class GramaticaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		NUMINT=1, NUMDEC=2, BOOL=3, TIPO=4, P_IF=5, P_ELSE=6, WS=7, ID=8, LETRA=9, 
		DIGITO=10, P_COMA=11, IGUAL=12, PUNTO=13, COMA=14, PARENTESIS_A=15, PARENTESIS_c=16, 
		OPERADOR=17, LLAVE_A=18, LLAVE_C=19;
	public static final int
		RULE_prule = 0, RULE_declaraciones = 1, RULE_segunda = 2, RULE_tercera = 3, 
		RULE_valor = 4, RULE_condicional = 5, RULE_condicion = 6, RULE_contraria = 7;
	private static String[] makeRuleNames() {
		return new String[] {
			"prule", "declaraciones", "segunda", "tercera", "valor", "condicional", 
			"condicion", "contraria"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, "'if'", "'else'", null, null, null, null, 
			"';'", "'='", "'.'", "','", "'('", "')'", null, "'{'", "'}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "NUMINT", "NUMDEC", "BOOL", "TIPO", "P_IF", "P_ELSE", "WS", "ID", 
			"LETRA", "DIGITO", "P_COMA", "IGUAL", "PUNTO", "COMA", "PARENTESIS_A", 
			"PARENTESIS_c", "OPERADOR", "LLAVE_A", "LLAVE_C"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Gramatica.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GramaticaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PruleContext extends ParserRuleContext {
		public List<DeclaracionesContext> declaraciones() {
			return getRuleContexts(DeclaracionesContext.class);
		}
		public DeclaracionesContext declaraciones(int i) {
			return getRuleContext(DeclaracionesContext.class,i);
		}
		public PruleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterPrule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitPrule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitPrule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PruleContext prule() throws RecognitionException {
		PruleContext _localctx = new PruleContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(17); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(16);
				declaraciones();
				}
				}
				setState(19); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==TIPO );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DeclaracionesContext extends ParserRuleContext {
		public TerminalNode TIPO() { return getToken(GramaticaParser.TIPO, 0); }
		public TerminalNode ID() { return getToken(GramaticaParser.ID, 0); }
		public SegundaContext segunda() {
			return getRuleContext(SegundaContext.class,0);
		}
		public TerceraContext tercera() {
			return getRuleContext(TerceraContext.class,0);
		}
		public DeclaracionesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaraciones; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterDeclaraciones(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitDeclaraciones(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitDeclaraciones(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracionesContext declaraciones() throws RecognitionException {
		DeclaracionesContext _localctx = new DeclaracionesContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declaraciones);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(21);
			match(TIPO);
			setState(22);
			match(ID);
			setState(23);
			segunda();
			setState(25);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==P_IF) {
				{
				setState(24);
				tercera();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SegundaContext extends ParserRuleContext {
		public TerminalNode COMA() { return getToken(GramaticaParser.COMA, 0); }
		public TerminalNode ID() { return getToken(GramaticaParser.ID, 0); }
		public SegundaContext segunda() {
			return getRuleContext(SegundaContext.class,0);
		}
		public TerminalNode P_COMA() { return getToken(GramaticaParser.P_COMA, 0); }
		public TerminalNode IGUAL() { return getToken(GramaticaParser.IGUAL, 0); }
		public ValorContext valor() {
			return getRuleContext(ValorContext.class,0);
		}
		public SegundaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_segunda; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterSegunda(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitSegunda(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitSegunda(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SegundaContext segunda() throws RecognitionException {
		SegundaContext _localctx = new SegundaContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_segunda);
		try {
			setState(35);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(27);
				match(COMA);
				setState(28);
				match(ID);
				setState(29);
				segunda();
				}
				break;
			case P_COMA:
				enterOuterAlt(_localctx, 2);
				{
				setState(30);
				match(P_COMA);
				}
				break;
			case IGUAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(31);
				match(IGUAL);
				setState(32);
				valor();
				setState(33);
				match(P_COMA);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TerceraContext extends ParserRuleContext {
		public CondicionalContext condicional() {
			return getRuleContext(CondicionalContext.class,0);
		}
		public TerceraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tercera; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterTercera(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitTercera(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitTercera(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TerceraContext tercera() throws RecognitionException {
		TerceraContext _localctx = new TerceraContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_tercera);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
			condicional();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ValorContext extends ParserRuleContext {
		public TerminalNode NUMINT() { return getToken(GramaticaParser.NUMINT, 0); }
		public TerminalNode NUMDEC() { return getToken(GramaticaParser.NUMDEC, 0); }
		public TerminalNode BOOL() { return getToken(GramaticaParser.BOOL, 0); }
		public ValorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterValor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitValor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitValor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValorContext valor() throws RecognitionException {
		ValorContext _localctx = new ValorContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_valor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 14L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CondicionalContext extends ParserRuleContext {
		public TerminalNode P_IF() { return getToken(GramaticaParser.P_IF, 0); }
		public TerminalNode PARENTESIS_A() { return getToken(GramaticaParser.PARENTESIS_A, 0); }
		public CondicionContext condicion() {
			return getRuleContext(CondicionContext.class,0);
		}
		public TerminalNode PARENTESIS_c() { return getToken(GramaticaParser.PARENTESIS_c, 0); }
		public TerminalNode LLAVE_A() { return getToken(GramaticaParser.LLAVE_A, 0); }
		public TerminalNode LLAVE_C() { return getToken(GramaticaParser.LLAVE_C, 0); }
		public ContrariaContext contraria() {
			return getRuleContext(ContrariaContext.class,0);
		}
		public CondicionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterCondicional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitCondicional(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitCondicional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondicionalContext condicional() throws RecognitionException {
		CondicionalContext _localctx = new CondicionalContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_condicional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			match(P_IF);
			setState(42);
			match(PARENTESIS_A);
			setState(43);
			condicion();
			setState(44);
			match(PARENTESIS_c);
			setState(45);
			match(LLAVE_A);
			setState(46);
			match(LLAVE_C);
			setState(48);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==P_ELSE) {
				{
				setState(47);
				contraria();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CondicionContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(GramaticaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(GramaticaParser.ID, i);
		}
		public TerminalNode OPERADOR() { return getToken(GramaticaParser.OPERADOR, 0); }
		public CondicionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterCondicion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitCondicion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitCondicion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondicionContext condicion() throws RecognitionException {
		CondicionContext _localctx = new CondicionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_condicion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			match(ID);
			setState(51);
			match(OPERADOR);
			setState(52);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ContrariaContext extends ParserRuleContext {
		public TerminalNode P_ELSE() { return getToken(GramaticaParser.P_ELSE, 0); }
		public TerminalNode LLAVE_A() { return getToken(GramaticaParser.LLAVE_A, 0); }
		public TerminalNode LLAVE_C() { return getToken(GramaticaParser.LLAVE_C, 0); }
		public ContrariaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_contraria; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterContraria(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitContraria(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitContraria(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContrariaContext contraria() throws RecognitionException {
		ContrariaContext _localctx = new ContrariaContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_contraria);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			match(P_ELSE);
			setState(55);
			match(LLAVE_A);
			setState(56);
			match(LLAVE_C);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u0013;\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0001"+
		"\u0000\u0004\u0000\u0012\b\u0000\u000b\u0000\f\u0000\u0013\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001\u001a\b\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0003\u0002$\b\u0002\u0001\u0003\u0001\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0003\u00051\b\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0000\u0000\b\u0000\u0002\u0004\u0006\b\n\f\u000e\u0000\u0001"+
		"\u0001\u0000\u0001\u00037\u0000\u0011\u0001\u0000\u0000\u0000\u0002\u0015"+
		"\u0001\u0000\u0000\u0000\u0004#\u0001\u0000\u0000\u0000\u0006%\u0001\u0000"+
		"\u0000\u0000\b\'\u0001\u0000\u0000\u0000\n)\u0001\u0000\u0000\u0000\f"+
		"2\u0001\u0000\u0000\u0000\u000e6\u0001\u0000\u0000\u0000\u0010\u0012\u0003"+
		"\u0002\u0001\u0000\u0011\u0010\u0001\u0000\u0000\u0000\u0012\u0013\u0001"+
		"\u0000\u0000\u0000\u0013\u0011\u0001\u0000\u0000\u0000\u0013\u0014\u0001"+
		"\u0000\u0000\u0000\u0014\u0001\u0001\u0000\u0000\u0000\u0015\u0016\u0005"+
		"\u0004\u0000\u0000\u0016\u0017\u0005\b\u0000\u0000\u0017\u0019\u0003\u0004"+
		"\u0002\u0000\u0018\u001a\u0003\u0006\u0003\u0000\u0019\u0018\u0001\u0000"+
		"\u0000\u0000\u0019\u001a\u0001\u0000\u0000\u0000\u001a\u0003\u0001\u0000"+
		"\u0000\u0000\u001b\u001c\u0005\u000e\u0000\u0000\u001c\u001d\u0005\b\u0000"+
		"\u0000\u001d$\u0003\u0004\u0002\u0000\u001e$\u0005\u000b\u0000\u0000\u001f"+
		" \u0005\f\u0000\u0000 !\u0003\b\u0004\u0000!\"\u0005\u000b\u0000\u0000"+
		"\"$\u0001\u0000\u0000\u0000#\u001b\u0001\u0000\u0000\u0000#\u001e\u0001"+
		"\u0000\u0000\u0000#\u001f\u0001\u0000\u0000\u0000$\u0005\u0001\u0000\u0000"+
		"\u0000%&\u0003\n\u0005\u0000&\u0007\u0001\u0000\u0000\u0000\'(\u0007\u0000"+
		"\u0000\u0000(\t\u0001\u0000\u0000\u0000)*\u0005\u0005\u0000\u0000*+\u0005"+
		"\u000f\u0000\u0000+,\u0003\f\u0006\u0000,-\u0005\u0010\u0000\u0000-.\u0005"+
		"\u0012\u0000\u0000.0\u0005\u0013\u0000\u0000/1\u0003\u000e\u0007\u0000"+
		"0/\u0001\u0000\u0000\u000001\u0001\u0000\u0000\u00001\u000b\u0001\u0000"+
		"\u0000\u000023\u0005\b\u0000\u000034\u0005\u0011\u0000\u000045\u0005\b"+
		"\u0000\u00005\r\u0001\u0000\u0000\u000067\u0005\u0006\u0000\u000078\u0005"+
		"\u0012\u0000\u000089\u0005\u0013\u0000\u00009\u000f\u0001\u0000\u0000"+
		"\u0000\u0004\u0013\u0019#0";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}