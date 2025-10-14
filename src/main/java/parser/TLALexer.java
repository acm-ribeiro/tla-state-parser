// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class TLALexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, BOOLEAN=3, REC_SEP=4, EMPTY_MAP=5, AND=6, NAT=7, STRING=8, 
		LSTR=9, RSTR=10, LCURL=11, RCURL=12, LPAR=13, RPAR=14, EQ=15, ATTR=16, 
		COMMA=17, NEWLINE=18, WS=19;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "BOOLEAN", "REC_SEP", "EMPTY_MAP", "AND", "NAT", "STRING", 
			"LSTR", "RSTR", "LCURL", "RCURL", "LPAR", "RPAR", "EQ", "ATTR", "COMMA", 
			"NEWLINE", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'f'", "':>'", null, "'@@'", "'<<>>'", "'/\\\\'", null, null, "'['", 
			"']'", "'{'", "'}'", "'('", "')'", "'='", "'|->'", "','", null, "' '"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "BOOLEAN", "REC_SEP", "EMPTY_MAP", "AND", "NAT", "STRING", 
			"LSTR", "RSTR", "LCURL", "RCURL", "LPAR", "RPAR", "EQ", "ATTR", "COMMA", 
			"NEWLINE", "WS"
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


	public TLALexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "TLA.g4"; }

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
		"\u0004\u0000\u0013}\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002"+
		"\u0012\u0007\u0012\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u00026\b\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0006\u0003\u0006E\b\u0006\u0001\u0006\u0004\u0006H\b\u0006\u000b\u0006"+
		"\f\u0006I\u0001\u0007\u0005\u0007M\b\u0007\n\u0007\f\u0007P\t\u0007\u0001"+
		"\u0007\u0004\u0007S\b\u0007\u000b\u0007\f\u0007T\u0001\u0007\u0005\u0007"+
		"X\b\u0007\n\u0007\f\u0007[\t\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001"+
		"\n\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001"+
		"\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u0010\u0001\u0010\u0001\u0011\u0003\u0011r\b\u0011\u0001\u0011\u0001"+
		"\u0011\u0004\u0011v\b\u0011\u000b\u0011\f\u0011w\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0000\u0000\u0013\u0001\u0001\u0003\u0002\u0005"+
		"\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n"+
		"\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011"+
		"#\u0012%\u0013\u0001\u0000\u0004\u0001\u000009\u0004\u0000--09@@__\u0003"+
		"\u0000@Z__az\u0005\u0000--09@Z__az\u0085\u0000\u0001\u0001\u0000\u0000"+
		"\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000"+
		"\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000"+
		"\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000"+
		"\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000"+
		"\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000"+
		"\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000"+
		"\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000"+
		"\u001f\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001"+
		"\u0000\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0001\'\u0001\u0000"+
		"\u0000\u0000\u0003)\u0001\u0000\u0000\u0000\u00055\u0001\u0000\u0000\u0000"+
		"\u00077\u0001\u0000\u0000\u0000\t:\u0001\u0000\u0000\u0000\u000b?\u0001"+
		"\u0000\u0000\u0000\rD\u0001\u0000\u0000\u0000\u000fN\u0001\u0000\u0000"+
		"\u0000\u0011\\\u0001\u0000\u0000\u0000\u0013^\u0001\u0000\u0000\u0000"+
		"\u0015`\u0001\u0000\u0000\u0000\u0017b\u0001\u0000\u0000\u0000\u0019d"+
		"\u0001\u0000\u0000\u0000\u001bf\u0001\u0000\u0000\u0000\u001dh\u0001\u0000"+
		"\u0000\u0000\u001fj\u0001\u0000\u0000\u0000!n\u0001\u0000\u0000\u0000"+
		"#u\u0001\u0000\u0000\u0000%y\u0001\u0000\u0000\u0000\'(\u0005f\u0000\u0000"+
		"(\u0002\u0001\u0000\u0000\u0000)*\u0005:\u0000\u0000*+\u0005>\u0000\u0000"+
		"+\u0004\u0001\u0000\u0000\u0000,-\u0005T\u0000\u0000-.\u0005R\u0000\u0000"+
		"./\u0005U\u0000\u0000/6\u0005E\u0000\u000001\u0005F\u0000\u000012\u0005"+
		"A\u0000\u000023\u0005L\u0000\u000034\u0005S\u0000\u000046\u0005E\u0000"+
		"\u00005,\u0001\u0000\u0000\u000050\u0001\u0000\u0000\u00006\u0006\u0001"+
		"\u0000\u0000\u000078\u0005@\u0000\u000089\u0005@\u0000\u00009\b\u0001"+
		"\u0000\u0000\u0000:;\u0005<\u0000\u0000;<\u0005<\u0000\u0000<=\u0005>"+
		"\u0000\u0000=>\u0005>\u0000\u0000>\n\u0001\u0000\u0000\u0000?@\u0005/"+
		"\u0000\u0000@A\u0005\\\u0000\u0000AB\u0005\\\u0000\u0000B\f\u0001\u0000"+
		"\u0000\u0000CE\u0005-\u0000\u0000DC\u0001\u0000\u0000\u0000DE\u0001\u0000"+
		"\u0000\u0000EG\u0001\u0000\u0000\u0000FH\u0007\u0000\u0000\u0000GF\u0001"+
		"\u0000\u0000\u0000HI\u0001\u0000\u0000\u0000IG\u0001\u0000\u0000\u0000"+
		"IJ\u0001\u0000\u0000\u0000J\u000e\u0001\u0000\u0000\u0000KM\u0007\u0001"+
		"\u0000\u0000LK\u0001\u0000\u0000\u0000MP\u0001\u0000\u0000\u0000NL\u0001"+
		"\u0000\u0000\u0000NO\u0001\u0000\u0000\u0000OR\u0001\u0000\u0000\u0000"+
		"PN\u0001\u0000\u0000\u0000QS\u0007\u0002\u0000\u0000RQ\u0001\u0000\u0000"+
		"\u0000ST\u0001\u0000\u0000\u0000TR\u0001\u0000\u0000\u0000TU\u0001\u0000"+
		"\u0000\u0000UY\u0001\u0000\u0000\u0000VX\u0007\u0003\u0000\u0000WV\u0001"+
		"\u0000\u0000\u0000X[\u0001\u0000\u0000\u0000YW\u0001\u0000\u0000\u0000"+
		"YZ\u0001\u0000\u0000\u0000Z\u0010\u0001\u0000\u0000\u0000[Y\u0001\u0000"+
		"\u0000\u0000\\]\u0005[\u0000\u0000]\u0012\u0001\u0000\u0000\u0000^_\u0005"+
		"]\u0000\u0000_\u0014\u0001\u0000\u0000\u0000`a\u0005{\u0000\u0000a\u0016"+
		"\u0001\u0000\u0000\u0000bc\u0005}\u0000\u0000c\u0018\u0001\u0000\u0000"+
		"\u0000de\u0005(\u0000\u0000e\u001a\u0001\u0000\u0000\u0000fg\u0005)\u0000"+
		"\u0000g\u001c\u0001\u0000\u0000\u0000hi\u0005=\u0000\u0000i\u001e\u0001"+
		"\u0000\u0000\u0000jk\u0005|\u0000\u0000kl\u0005-\u0000\u0000lm\u0005>"+
		"\u0000\u0000m \u0001\u0000\u0000\u0000no\u0005,\u0000\u0000o\"\u0001\u0000"+
		"\u0000\u0000pr\u0005\r\u0000\u0000qp\u0001\u0000\u0000\u0000qr\u0001\u0000"+
		"\u0000\u0000rs\u0001\u0000\u0000\u0000sv\u0005\n\u0000\u0000tv\u0005\r"+
		"\u0000\u0000uq\u0001\u0000\u0000\u0000ut\u0001\u0000\u0000\u0000vw\u0001"+
		"\u0000\u0000\u0000wu\u0001\u0000\u0000\u0000wx\u0001\u0000\u0000\u0000"+
		"x$\u0001\u0000\u0000\u0000yz\u0005 \u0000\u0000z{\u0001\u0000\u0000\u0000"+
		"{|\u0006\u0012\u0000\u0000|&\u0001\u0000\u0000\u0000\n\u00005DINTYquw"+
		"\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}