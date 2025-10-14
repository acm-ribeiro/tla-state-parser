// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class TLAParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, BOOLEAN=3, REC_SEP=4, EMPTY_MAP=5, AND=6, NAT=7, STRING=8, 
		LSTR=9, RSTR=10, LCURL=11, RCURL=12, LPAR=13, RPAR=14, EQ=15, ATTR=16, 
		COMMA=17, NEWLINE=18, WS=19;
	public static final int
		RULE_state = 0, RULE_stateElement = 1, RULE_fState = 2, RULE_entity = 3, 
		RULE_map = 4, RULE_mapElement = 5, RULE_record = 6, RULE_recordElement = 7, 
		RULE_fieldValue = 8, RULE_set = 9, RULE_setElement = 10, RULE_objectRecord = 11;
	private static String[] makeRuleNames() {
		return new String[] {
			"state", "stateElement", "fState", "entity", "map", "mapElement", "record", 
			"recordElement", "fieldValue", "set", "setElement", "objectRecord"
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

	@Override
	public String getGrammarFileName() { return "java-escape"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public TLAParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StateContext extends ParserRuleContext {
		public List<StateElementContext> stateElement() {
			return getRuleContexts(StateElementContext.class);
		}
		public StateElementContext stateElement(int i) {
			return getRuleContext(StateElementContext.class,i);
		}
		public StateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_state; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLAListener ) ((TLAListener)listener).enterState(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLAListener ) ((TLAListener)listener).exitState(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLAVisitor ) return ((TLAVisitor<? extends T>)visitor).visitState(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StateContext state() throws RecognitionException {
		StateContext _localctx = new StateContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_state);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(25); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(24);
				stateElement();
				}
				}
				setState(27); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==AND );
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
	public static class StateElementContext extends ParserRuleContext {
		public List<TerminalNode> AND() { return getTokens(TLAParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(TLAParser.AND, i);
		}
		public FStateContext fState() {
			return getRuleContext(FStateContext.class,0);
		}
		public List<EntityContext> entity() {
			return getRuleContexts(EntityContext.class);
		}
		public EntityContext entity(int i) {
			return getRuleContext(EntityContext.class,i);
		}
		public StateElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stateElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLAListener ) ((TLAListener)listener).enterStateElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLAListener ) ((TLAListener)listener).exitStateElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLAVisitor ) return ((TLAVisitor<? extends T>)visitor).visitStateElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StateElementContext stateElement() throws RecognitionException {
		StateElementContext _localctx = new StateElementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stateElement);
		try {
			int _alt;
			setState(40);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(29);
				match(AND);
				setState(30);
				fState();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(31);
				match(AND);
				setState(32);
				entity();
				setState(37);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(33);
						match(AND);
						setState(34);
						entity();
						}
						} 
					}
					setState(39);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
				}
				}
				break;
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
	public static class FStateContext extends ParserRuleContext {
		public TerminalNode EQ() { return getToken(TLAParser.EQ, 0); }
		public TerminalNode BOOLEAN() { return getToken(TLAParser.BOOLEAN, 0); }
		public FStateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fState; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLAListener ) ((TLAListener)listener).enterFState(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLAListener ) ((TLAListener)listener).exitFState(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLAVisitor ) return ((TLAVisitor<? extends T>)visitor).visitFState(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FStateContext fState() throws RecognitionException {
		FStateContext _localctx = new FStateContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_fState);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			match(T__0);
			setState(43);
			match(EQ);
			setState(44);
			match(BOOLEAN);
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
	public static class EntityContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(TLAParser.STRING, 0); }
		public TerminalNode EQ() { return getToken(TLAParser.EQ, 0); }
		public TerminalNode LPAR() { return getToken(TLAParser.LPAR, 0); }
		public MapContext map() {
			return getRuleContext(MapContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(TLAParser.RPAR, 0); }
		public TerminalNode EMPTY_MAP() { return getToken(TLAParser.EMPTY_MAP, 0); }
		public SetContext set() {
			return getRuleContext(SetContext.class,0);
		}
		public EntityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_entity; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLAListener ) ((TLAListener)listener).enterEntity(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLAListener ) ((TLAListener)listener).exitEntity(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLAVisitor ) return ((TLAVisitor<? extends T>)visitor).visitEntity(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EntityContext entity() throws RecognitionException {
		EntityContext _localctx = new EntityContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_entity);
		try {
			setState(58);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(46);
				match(STRING);
				setState(47);
				match(EQ);
				setState(48);
				match(LPAR);
				setState(49);
				map();
				setState(50);
				match(RPAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(52);
				match(STRING);
				setState(53);
				match(EQ);
				setState(54);
				match(EMPTY_MAP);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(55);
				match(STRING);
				setState(56);
				match(EQ);
				setState(57);
				set();
				}
				break;
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
	public static class MapContext extends ParserRuleContext {
		public List<MapElementContext> mapElement() {
			return getRuleContexts(MapElementContext.class);
		}
		public MapElementContext mapElement(int i) {
			return getRuleContext(MapElementContext.class,i);
		}
		public List<TerminalNode> REC_SEP() { return getTokens(TLAParser.REC_SEP); }
		public TerminalNode REC_SEP(int i) {
			return getToken(TLAParser.REC_SEP, i);
		}
		public MapContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_map; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLAListener ) ((TLAListener)listener).enterMap(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLAListener ) ((TLAListener)listener).exitMap(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLAVisitor ) return ((TLAVisitor<? extends T>)visitor).visitMap(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MapContext map() throws RecognitionException {
		MapContext _localctx = new MapContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_map);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			mapElement();
			setState(65);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==REC_SEP) {
				{
				{
				setState(61);
				match(REC_SEP);
				setState(62);
				mapElement();
				}
				}
				setState(67);
				_errHandler.sync(this);
				_la = _input.LA(1);
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
	public static class MapElementContext extends ParserRuleContext {
		public List<TerminalNode> STRING() { return getTokens(TLAParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(TLAParser.STRING, i);
		}
		public RecordContext record() {
			return getRuleContext(RecordContext.class,0);
		}
		public MapElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mapElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLAListener ) ((TLAListener)listener).enterMapElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLAListener ) ((TLAListener)listener).exitMapElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLAVisitor ) return ((TLAVisitor<? extends T>)visitor).visitMapElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MapElementContext mapElement() throws RecognitionException {
		MapElementContext _localctx = new MapElementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_mapElement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			match(STRING);
			setState(69);
			match(T__1);
			setState(72);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LSTR:
				{
				setState(70);
				record();
				}
				break;
			case STRING:
				{
				setState(71);
				match(STRING);
				}
				break;
			default:
				throw new NoViableAltException(this);
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
	public static class RecordContext extends ParserRuleContext {
		public TerminalNode LSTR() { return getToken(TLAParser.LSTR, 0); }
		public List<RecordElementContext> recordElement() {
			return getRuleContexts(RecordElementContext.class);
		}
		public RecordElementContext recordElement(int i) {
			return getRuleContext(RecordElementContext.class,i);
		}
		public TerminalNode RSTR() { return getToken(TLAParser.RSTR, 0); }
		public List<TerminalNode> COMMA() { return getTokens(TLAParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(TLAParser.COMMA, i);
		}
		public RecordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_record; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLAListener ) ((TLAListener)listener).enterRecord(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLAListener ) ((TLAListener)listener).exitRecord(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLAVisitor ) return ((TLAVisitor<? extends T>)visitor).visitRecord(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RecordContext record() throws RecognitionException {
		RecordContext _localctx = new RecordContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_record);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			match(LSTR);
			setState(75);
			recordElement();
			setState(80);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(76);
				match(COMMA);
				setState(77);
				recordElement();
				}
				}
				setState(82);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(83);
			match(RSTR);
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
	public static class RecordElementContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(TLAParser.STRING, 0); }
		public TerminalNode ATTR() { return getToken(TLAParser.ATTR, 0); }
		public FieldValueContext fieldValue() {
			return getRuleContext(FieldValueContext.class,0);
		}
		public RecordElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_recordElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLAListener ) ((TLAListener)listener).enterRecordElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLAListener ) ((TLAListener)listener).exitRecordElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLAVisitor ) return ((TLAVisitor<? extends T>)visitor).visitRecordElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RecordElementContext recordElement() throws RecognitionException {
		RecordElementContext _localctx = new RecordElementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_recordElement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			match(STRING);
			setState(86);
			match(ATTR);
			setState(87);
			fieldValue();
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
	public static class FieldValueContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(TLAParser.STRING, 0); }
		public TerminalNode NAT() { return getToken(TLAParser.NAT, 0); }
		public TerminalNode BOOLEAN() { return getToken(TLAParser.BOOLEAN, 0); }
		public SetContext set() {
			return getRuleContext(SetContext.class,0);
		}
		public FieldValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLAListener ) ((TLAListener)listener).enterFieldValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLAListener ) ((TLAListener)listener).exitFieldValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLAVisitor ) return ((TLAVisitor<? extends T>)visitor).visitFieldValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldValueContext fieldValue() throws RecognitionException {
		FieldValueContext _localctx = new FieldValueContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_fieldValue);
		try {
			setState(93);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(89);
				match(STRING);
				}
				break;
			case NAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(90);
				match(NAT);
				}
				break;
			case BOOLEAN:
				enterOuterAlt(_localctx, 3);
				{
				setState(91);
				match(BOOLEAN);
				}
				break;
			case LCURL:
				enterOuterAlt(_localctx, 4);
				{
				setState(92);
				set();
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
	public static class SetContext extends ParserRuleContext {
		public TerminalNode LCURL() { return getToken(TLAParser.LCURL, 0); }
		public TerminalNode RCURL() { return getToken(TLAParser.RCURL, 0); }
		public List<SetElementContext> setElement() {
			return getRuleContexts(SetElementContext.class);
		}
		public SetElementContext setElement(int i) {
			return getRuleContext(SetElementContext.class,i);
		}
		public SetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_set; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLAListener ) ((TLAListener)listener).enterSet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLAListener ) ((TLAListener)listener).exitSet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLAVisitor ) return ((TLAVisitor<? extends T>)visitor).visitSet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetContext set() throws RecognitionException {
		SetContext _localctx = new SetContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_set);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			match(LCURL);
			setState(99);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 896L) != 0) {
				{
				{
				setState(96);
				setElement();
				}
				}
				setState(101);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(102);
			match(RCURL);
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
	public static class SetElementContext extends ParserRuleContext {
		public List<TerminalNode> STRING() { return getTokens(TLAParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(TLAParser.STRING, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(TLAParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(TLAParser.COMMA, i);
		}
		public List<TerminalNode> NAT() { return getTokens(TLAParser.NAT); }
		public TerminalNode NAT(int i) {
			return getToken(TLAParser.NAT, i);
		}
		public List<RecordContext> record() {
			return getRuleContexts(RecordContext.class);
		}
		public RecordContext record(int i) {
			return getRuleContext(RecordContext.class,i);
		}
		public SetElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLAListener ) ((TLAListener)listener).enterSetElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLAListener ) ((TLAListener)listener).exitSetElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLAVisitor ) return ((TLAVisitor<? extends T>)visitor).visitSetElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetElementContext setElement() throws RecognitionException {
		SetElementContext _localctx = new SetElementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_setElement);
		int _la;
		try {
			setState(128);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(104);
				match(STRING);
				setState(109);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(105);
					match(COMMA);
					setState(106);
					match(STRING);
					}
					}
					setState(111);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case NAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(112);
				match(NAT);
				setState(117);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(113);
					match(COMMA);
					setState(114);
					match(NAT);
					}
					}
					setState(119);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case LSTR:
				enterOuterAlt(_localctx, 3);
				{
				setState(120);
				record();
				setState(125);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(121);
					match(COMMA);
					setState(122);
					record();
					}
					}
					setState(127);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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
	public static class ObjectRecordContext extends ParserRuleContext {
		public List<RecordContext> record() {
			return getRuleContexts(RecordContext.class);
		}
		public RecordContext record(int i) {
			return getRuleContext(RecordContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(TLAParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(TLAParser.COMMA, i);
		}
		public List<TerminalNode> STRING() { return getTokens(TLAParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(TLAParser.STRING, i);
		}
		public ObjectRecordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectRecord; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLAListener ) ((TLAListener)listener).enterObjectRecord(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLAListener ) ((TLAListener)listener).exitObjectRecord(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLAVisitor ) return ((TLAVisitor<? extends T>)visitor).visitObjectRecord(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectRecordContext objectRecord() throws RecognitionException {
		ObjectRecordContext _localctx = new ObjectRecordContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_objectRecord);
		int _la;
		try {
			setState(147);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LSTR:
				enterOuterAlt(_localctx, 1);
				{
				setState(130);
				record();
				setState(135);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(131);
					match(COMMA);
					setState(132);
					record();
					}
					}
					setState(137);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(138);
				match(STRING);
				setState(143);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(139);
					match(COMMA);
					setState(140);
					match(STRING);
					}
					}
					setState(145);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case EOF:
				enterOuterAlt(_localctx, 3);
				{
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

	public static final String _serializedATN =
		"\u0004\u0001\u0013\u0096\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0001\u0000\u0004\u0000\u001a\b\u0000\u000b\u0000\f\u0000\u001b\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0005"+
		"\u0001$\b\u0001\n\u0001\f\u0001\'\t\u0001\u0003\u0001)\b\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003;\b\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0005\u0004@\b\u0004\n\u0004\f\u0004C\t\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005I\b\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006O\b\u0006"+
		"\n\u0006\f\u0006R\t\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b^\b\b"+
		"\u0001\t\u0001\t\u0005\tb\b\t\n\t\f\te\t\t\u0001\t\u0001\t\u0001\n\u0001"+
		"\n\u0001\n\u0005\nl\b\n\n\n\f\no\t\n\u0001\n\u0001\n\u0001\n\u0005\nt"+
		"\b\n\n\n\f\nw\t\n\u0001\n\u0001\n\u0001\n\u0005\n|\b\n\n\n\f\n\u007f\t"+
		"\n\u0003\n\u0081\b\n\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u0086"+
		"\b\u000b\n\u000b\f\u000b\u0089\t\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0005\u000b\u008e\b\u000b\n\u000b\f\u000b\u0091\t\u000b\u0001\u000b\u0003"+
		"\u000b\u0094\b\u000b\u0001\u000b\u0000\u0000\f\u0000\u0002\u0004\u0006"+
		"\b\n\f\u000e\u0010\u0012\u0014\u0016\u0000\u0000\u009e\u0000\u0019\u0001"+
		"\u0000\u0000\u0000\u0002(\u0001\u0000\u0000\u0000\u0004*\u0001\u0000\u0000"+
		"\u0000\u0006:\u0001\u0000\u0000\u0000\b<\u0001\u0000\u0000\u0000\nD\u0001"+
		"\u0000\u0000\u0000\fJ\u0001\u0000\u0000\u0000\u000eU\u0001\u0000\u0000"+
		"\u0000\u0010]\u0001\u0000\u0000\u0000\u0012_\u0001\u0000\u0000\u0000\u0014"+
		"\u0080\u0001\u0000\u0000\u0000\u0016\u0093\u0001\u0000\u0000\u0000\u0018"+
		"\u001a\u0003\u0002\u0001\u0000\u0019\u0018\u0001\u0000\u0000\u0000\u001a"+
		"\u001b\u0001\u0000\u0000\u0000\u001b\u0019\u0001\u0000\u0000\u0000\u001b"+
		"\u001c\u0001\u0000\u0000\u0000\u001c\u0001\u0001\u0000\u0000\u0000\u001d"+
		"\u001e\u0005\u0006\u0000\u0000\u001e)\u0003\u0004\u0002\u0000\u001f \u0005"+
		"\u0006\u0000\u0000 %\u0003\u0006\u0003\u0000!\"\u0005\u0006\u0000\u0000"+
		"\"$\u0003\u0006\u0003\u0000#!\u0001\u0000\u0000\u0000$\'\u0001\u0000\u0000"+
		"\u0000%#\u0001\u0000\u0000\u0000%&\u0001\u0000\u0000\u0000&)\u0001\u0000"+
		"\u0000\u0000\'%\u0001\u0000\u0000\u0000(\u001d\u0001\u0000\u0000\u0000"+
		"(\u001f\u0001\u0000\u0000\u0000)\u0003\u0001\u0000\u0000\u0000*+\u0005"+
		"\u0001\u0000\u0000+,\u0005\u000f\u0000\u0000,-\u0005\u0003\u0000\u0000"+
		"-\u0005\u0001\u0000\u0000\u0000./\u0005\b\u0000\u0000/0\u0005\u000f\u0000"+
		"\u000001\u0005\r\u0000\u000012\u0003\b\u0004\u000023\u0005\u000e\u0000"+
		"\u00003;\u0001\u0000\u0000\u000045\u0005\b\u0000\u000056\u0005\u000f\u0000"+
		"\u00006;\u0005\u0005\u0000\u000078\u0005\b\u0000\u000089\u0005\u000f\u0000"+
		"\u00009;\u0003\u0012\t\u0000:.\u0001\u0000\u0000\u0000:4\u0001\u0000\u0000"+
		"\u0000:7\u0001\u0000\u0000\u0000;\u0007\u0001\u0000\u0000\u0000<A\u0003"+
		"\n\u0005\u0000=>\u0005\u0004\u0000\u0000>@\u0003\n\u0005\u0000?=\u0001"+
		"\u0000\u0000\u0000@C\u0001\u0000\u0000\u0000A?\u0001\u0000\u0000\u0000"+
		"AB\u0001\u0000\u0000\u0000B\t\u0001\u0000\u0000\u0000CA\u0001\u0000\u0000"+
		"\u0000DE\u0005\b\u0000\u0000EH\u0005\u0002\u0000\u0000FI\u0003\f\u0006"+
		"\u0000GI\u0005\b\u0000\u0000HF\u0001\u0000\u0000\u0000HG\u0001\u0000\u0000"+
		"\u0000I\u000b\u0001\u0000\u0000\u0000JK\u0005\t\u0000\u0000KP\u0003\u000e"+
		"\u0007\u0000LM\u0005\u0011\u0000\u0000MO\u0003\u000e\u0007\u0000NL\u0001"+
		"\u0000\u0000\u0000OR\u0001\u0000\u0000\u0000PN\u0001\u0000\u0000\u0000"+
		"PQ\u0001\u0000\u0000\u0000QS\u0001\u0000\u0000\u0000RP\u0001\u0000\u0000"+
		"\u0000ST\u0005\n\u0000\u0000T\r\u0001\u0000\u0000\u0000UV\u0005\b\u0000"+
		"\u0000VW\u0005\u0010\u0000\u0000WX\u0003\u0010\b\u0000X\u000f\u0001\u0000"+
		"\u0000\u0000Y^\u0005\b\u0000\u0000Z^\u0005\u0007\u0000\u0000[^\u0005\u0003"+
		"\u0000\u0000\\^\u0003\u0012\t\u0000]Y\u0001\u0000\u0000\u0000]Z\u0001"+
		"\u0000\u0000\u0000][\u0001\u0000\u0000\u0000]\\\u0001\u0000\u0000\u0000"+
		"^\u0011\u0001\u0000\u0000\u0000_c\u0005\u000b\u0000\u0000`b\u0003\u0014"+
		"\n\u0000a`\u0001\u0000\u0000\u0000be\u0001\u0000\u0000\u0000ca\u0001\u0000"+
		"\u0000\u0000cd\u0001\u0000\u0000\u0000df\u0001\u0000\u0000\u0000ec\u0001"+
		"\u0000\u0000\u0000fg\u0005\f\u0000\u0000g\u0013\u0001\u0000\u0000\u0000"+
		"hm\u0005\b\u0000\u0000ij\u0005\u0011\u0000\u0000jl\u0005\b\u0000\u0000"+
		"ki\u0001\u0000\u0000\u0000lo\u0001\u0000\u0000\u0000mk\u0001\u0000\u0000"+
		"\u0000mn\u0001\u0000\u0000\u0000n\u0081\u0001\u0000\u0000\u0000om\u0001"+
		"\u0000\u0000\u0000pu\u0005\u0007\u0000\u0000qr\u0005\u0011\u0000\u0000"+
		"rt\u0005\u0007\u0000\u0000sq\u0001\u0000\u0000\u0000tw\u0001\u0000\u0000"+
		"\u0000us\u0001\u0000\u0000\u0000uv\u0001\u0000\u0000\u0000v\u0081\u0001"+
		"\u0000\u0000\u0000wu\u0001\u0000\u0000\u0000x}\u0003\f\u0006\u0000yz\u0005"+
		"\u0011\u0000\u0000z|\u0003\f\u0006\u0000{y\u0001\u0000\u0000\u0000|\u007f"+
		"\u0001\u0000\u0000\u0000}{\u0001\u0000\u0000\u0000}~\u0001\u0000\u0000"+
		"\u0000~\u0081\u0001\u0000\u0000\u0000\u007f}\u0001\u0000\u0000\u0000\u0080"+
		"h\u0001\u0000\u0000\u0000\u0080p\u0001\u0000\u0000\u0000\u0080x\u0001"+
		"\u0000\u0000\u0000\u0081\u0015\u0001\u0000\u0000\u0000\u0082\u0087\u0003"+
		"\f\u0006\u0000\u0083\u0084\u0005\u0011\u0000\u0000\u0084\u0086\u0003\f"+
		"\u0006\u0000\u0085\u0083\u0001\u0000\u0000\u0000\u0086\u0089\u0001\u0000"+
		"\u0000\u0000\u0087\u0085\u0001\u0000\u0000\u0000\u0087\u0088\u0001\u0000"+
		"\u0000\u0000\u0088\u0094\u0001\u0000\u0000\u0000\u0089\u0087\u0001\u0000"+
		"\u0000\u0000\u008a\u008f\u0005\b\u0000\u0000\u008b\u008c\u0005\u0011\u0000"+
		"\u0000\u008c\u008e\u0005\b\u0000\u0000\u008d\u008b\u0001\u0000\u0000\u0000"+
		"\u008e\u0091\u0001\u0000\u0000\u0000\u008f\u008d\u0001\u0000\u0000\u0000"+
		"\u008f\u0090\u0001\u0000\u0000\u0000\u0090\u0094\u0001\u0000\u0000\u0000"+
		"\u0091\u008f\u0001\u0000\u0000\u0000\u0092\u0094\u0001\u0000\u0000\u0000"+
		"\u0093\u0082\u0001\u0000\u0000\u0000\u0093\u008a\u0001\u0000\u0000\u0000"+
		"\u0093\u0092\u0001\u0000\u0000\u0000\u0094\u0017\u0001\u0000\u0000\u0000"+
		"\u0010\u001b%(:AHP]cmu}\u0080\u0087\u008f\u0093";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}