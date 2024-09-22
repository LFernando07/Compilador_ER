// Generated from C:/Users/luisf/IdeaProjects/ConditionalGrammar/src/main/java/org/example/Gramatica.g4 by ANTLR 4.13.1
package org.example.misArchivos;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class GramaticaLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		NUMINT=1, NUMDEC=2, BOOL=3, TIPO=4, P_IF=5, P_ELSE=6, WS=7, ID=8, LETRA=9, 
		DIGITO=10, P_COMA=11, IGUAL=12, PUNTO=13, COMA=14, PARENTESIS_A=15, PARENTESIS_c=16, 
		OPERADOR=17, LLAVE_A=18, LLAVE_C=19;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"NUMINT", "NUMDEC", "BOOL", "TIPO", "P_IF", "P_ELSE", "WS", "ID", "LETRA", 
			"DIGITO", "P_COMA", "IGUAL", "PUNTO", "COMA", "PARENTESIS_A", "PARENTESIS_c", 
			"OPERADOR", "LLAVE_A", "LLAVE_C"
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


	public GramaticaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Gramatica.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\u0013\u0091\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0001\u0000\u0004\u0000)\b\u0000\u000b\u0000"+
		"\f\u0000*\u0001\u0001\u0004\u0001.\b\u0001\u000b\u0001\f\u0001/\u0001"+
		"\u0001\u0001\u0001\u0004\u00014\b\u0001\u000b\u0001\f\u00015\u0003\u0001"+
		"8\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002C\b\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003Z\b\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0006\u0004\u0006e\b\u0006\u000b\u0006\f\u0006f\u0001"+
		"\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007n\b"+
		"\u0007\n\u0007\f\u0007q\t\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001"+
		"\n\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001"+
		"\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0003\u0010\u008c\b\u0010\u0001\u0011\u0001\u0011\u0001\u0012\u0001"+
		"\u0012\u0000\u0000\u0013\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004"+
		"\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017"+
		"\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013\u0001"+
		"\u0000\u0004\u0001\u000009\u0003\u0000\t\n\r\r  \u0002\u0000AZaz\u0002"+
		"\u0000<<>>\u009f\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001"+
		"\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001"+
		"\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000"+
		"\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000"+
		"\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000"+
		"\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000"+
		"\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000"+
		"\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000"+
		"\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000"+
		"%\u0001\u0000\u0000\u0000\u0001(\u0001\u0000\u0000\u0000\u0003-\u0001"+
		"\u0000\u0000\u0000\u0005B\u0001\u0000\u0000\u0000\u0007Y\u0001\u0000\u0000"+
		"\u0000\t[\u0001\u0000\u0000\u0000\u000b^\u0001\u0000\u0000\u0000\rd\u0001"+
		"\u0000\u0000\u0000\u000fj\u0001\u0000\u0000\u0000\u0011r\u0001\u0000\u0000"+
		"\u0000\u0013t\u0001\u0000\u0000\u0000\u0015v\u0001\u0000\u0000\u0000\u0017"+
		"x\u0001\u0000\u0000\u0000\u0019z\u0001\u0000\u0000\u0000\u001b|\u0001"+
		"\u0000\u0000\u0000\u001d~\u0001\u0000\u0000\u0000\u001f\u0080\u0001\u0000"+
		"\u0000\u0000!\u008b\u0001\u0000\u0000\u0000#\u008d\u0001\u0000\u0000\u0000"+
		"%\u008f\u0001\u0000\u0000\u0000\')\u0007\u0000\u0000\u0000(\'\u0001\u0000"+
		"\u0000\u0000)*\u0001\u0000\u0000\u0000*(\u0001\u0000\u0000\u0000*+\u0001"+
		"\u0000\u0000\u0000+\u0002\u0001\u0000\u0000\u0000,.\u0007\u0000\u0000"+
		"\u0000-,\u0001\u0000\u0000\u0000./\u0001\u0000\u0000\u0000/-\u0001\u0000"+
		"\u0000\u0000/0\u0001\u0000\u0000\u000007\u0001\u0000\u0000\u000013\u0005"+
		".\u0000\u000024\u0007\u0000\u0000\u000032\u0001\u0000\u0000\u000045\u0001"+
		"\u0000\u0000\u000053\u0001\u0000\u0000\u000056\u0001\u0000\u0000\u0000"+
		"68\u0001\u0000\u0000\u000071\u0001\u0000\u0000\u000078\u0001\u0000\u0000"+
		"\u00008\u0004\u0001\u0000\u0000\u00009:\u0005t\u0000\u0000:;\u0005r\u0000"+
		"\u0000;<\u0005u\u0000\u0000<C\u0005e\u0000\u0000=>\u0005f\u0000\u0000"+
		">?\u0005a\u0000\u0000?@\u0005l\u0000\u0000@A\u0005s\u0000\u0000AC\u0005"+
		"e\u0000\u0000B9\u0001\u0000\u0000\u0000B=\u0001\u0000\u0000\u0000C\u0006"+
		"\u0001\u0000\u0000\u0000DE\u0005i\u0000\u0000EF\u0005n\u0000\u0000FZ\u0005"+
		"t\u0000\u0000GH\u0005f\u0000\u0000HI\u0005l\u0000\u0000IJ\u0005o\u0000"+
		"\u0000JK\u0005a\u0000\u0000KZ\u0005t\u0000\u0000LM\u0005d\u0000\u0000"+
		"MN\u0005o\u0000\u0000NO\u0005u\u0000\u0000OP\u0005b\u0000\u0000PQ\u0005"+
		"l\u0000\u0000QZ\u0005e\u0000\u0000RS\u0005b\u0000\u0000ST\u0005o\u0000"+
		"\u0000TU\u0005o\u0000\u0000UV\u0005l\u0000\u0000VW\u0005e\u0000\u0000"+
		"WX\u0005a\u0000\u0000XZ\u0005n\u0000\u0000YD\u0001\u0000\u0000\u0000Y"+
		"G\u0001\u0000\u0000\u0000YL\u0001\u0000\u0000\u0000YR\u0001\u0000\u0000"+
		"\u0000Z\b\u0001\u0000\u0000\u0000[\\\u0005i\u0000\u0000\\]\u0005f\u0000"+
		"\u0000]\n\u0001\u0000\u0000\u0000^_\u0005e\u0000\u0000_`\u0005l\u0000"+
		"\u0000`a\u0005s\u0000\u0000ab\u0005e\u0000\u0000b\f\u0001\u0000\u0000"+
		"\u0000ce\u0007\u0001\u0000\u0000dc\u0001\u0000\u0000\u0000ef\u0001\u0000"+
		"\u0000\u0000fd\u0001\u0000\u0000\u0000fg\u0001\u0000\u0000\u0000gh\u0001"+
		"\u0000\u0000\u0000hi\u0006\u0006\u0000\u0000i\u000e\u0001\u0000\u0000"+
		"\u0000jo\u0003\u0011\b\u0000kn\u0003\u0011\b\u0000ln\u0003\u0013\t\u0000"+
		"mk\u0001\u0000\u0000\u0000ml\u0001\u0000\u0000\u0000nq\u0001\u0000\u0000"+
		"\u0000om\u0001\u0000\u0000\u0000op\u0001\u0000\u0000\u0000p\u0010\u0001"+
		"\u0000\u0000\u0000qo\u0001\u0000\u0000\u0000rs\u0007\u0002\u0000\u0000"+
		"s\u0012\u0001\u0000\u0000\u0000tu\u000209\u0000u\u0014\u0001\u0000\u0000"+
		"\u0000vw\u0005;\u0000\u0000w\u0016\u0001\u0000\u0000\u0000xy\u0005=\u0000"+
		"\u0000y\u0018\u0001\u0000\u0000\u0000z{\u0005.\u0000\u0000{\u001a\u0001"+
		"\u0000\u0000\u0000|}\u0005,\u0000\u0000}\u001c\u0001\u0000\u0000\u0000"+
		"~\u007f\u0005(\u0000\u0000\u007f\u001e\u0001\u0000\u0000\u0000\u0080\u0081"+
		"\u0005)\u0000\u0000\u0081 \u0001\u0000\u0000\u0000\u0082\u008c\u0007\u0003"+
		"\u0000\u0000\u0083\u0084\u0005|\u0000\u0000\u0084\u008c\u0005|\u0000\u0000"+
		"\u0085\u0086\u0005&\u0000\u0000\u0086\u008c\u0005&\u0000\u0000\u0087\u0088"+
		"\u0005=\u0000\u0000\u0088\u008c\u0005=\u0000\u0000\u0089\u008a\u0005!"+
		"\u0000\u0000\u008a\u008c\u0005=\u0000\u0000\u008b\u0082\u0001\u0000\u0000"+
		"\u0000\u008b\u0083\u0001\u0000\u0000\u0000\u008b\u0085\u0001\u0000\u0000"+
		"\u0000\u008b\u0087\u0001\u0000\u0000\u0000\u008b\u0089\u0001\u0000\u0000"+
		"\u0000\u008c\"\u0001\u0000\u0000\u0000\u008d\u008e\u0005{\u0000\u0000"+
		"\u008e$\u0001\u0000\u0000\u0000\u008f\u0090\u0005}\u0000\u0000\u0090&"+
		"\u0001\u0000\u0000\u0000\u000b\u0000*/57BYfmo\u008b\u0001\u0006\u0000"+
		"\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}