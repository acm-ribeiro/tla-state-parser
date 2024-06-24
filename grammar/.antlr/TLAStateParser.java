// Generated from /Users/acm.ribeiro/Desktop/MAGMA/tla-state-parser/grammar/TLAState.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class TLAStateParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		NONE=18, VERB=19, RTYPE=20, CODE=21, BOOLEAN=22, REC_SEP=23, AND=24, NAT=25, 
		STRING=26, LSTR=27, RSTR=28, LCURL=29, RCURL=30, LPAR=31, RPAR=32, EQ=33, 
		ATTR=34, COMMA=35, NEWLINE=36, WS=37;
	public static final int
		RULE_state = 0, RULE_stateElement = 1, RULE_tagState = 2, RULE_tags = 3, 
		RULE_resState = 4, RULE_responseRecord = 5, RULE_code = 6, RULE_codeID = 7, 
		RULE_entity = 8, RULE_map = 9, RULE_mapElement = 10, RULE_record = 11, 
		RULE_recordElement = 12, RULE_fieldValue = 13, RULE_set = 14, RULE_setElement = 15, 
		RULE_fState = 16, RULE_pcState = 17, RULE_reqState = 18, RULE_requestRecord = 19, 
		RULE_operation = 20, RULE_operationID = 21, RULE_verb = 22, RULE_verbID = 23, 
		RULE_parameters = 24, RULE_body = 25, RULE_paramRecord = 26, RULE_bodyRecord = 27, 
		RULE_bodyType = 28, RULE_bodyInt = 29, RULE_bodyBool = 30, RULE_bodyObject = 31, 
		RULE_objectRecord = 32;
	private static String[] makeRuleNames() {
		return new String[] {
			"state", "stateElement", "tagState", "tags", "resState", "responseRecord", 
			"code", "codeID", "entity", "map", "mapElement", "record", "recordElement", 
			"fieldValue", "set", "setElement", "fState", "pcState", "reqState", "requestRecord", 
			"operation", "operationID", "verb", "verbID", "parameters", "body", "paramRecord", 
			"bodyRecord", "bodyType", "bodyInt", "bodyBool", "bodyObject", "objectRecord"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'tags'", "'res'", "'code'", "':>'", "'f'", "'pc'", "'req'", "'op'", 
			"'verb'", "'params'", "'body'", "'name'", "'value'", "'type'", "'int'", 
			"'bool'", "'obj'", "'None'", null, null, null, null, "'@@'", "'/\\\\'", 
			null, null, "'['", "']'", "'{'", "'}'", "'('", "')'", "'='", "'|->'", 
			"','", null, "' '"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, "NONE", "VERB", "RTYPE", "CODE", 
			"BOOLEAN", "REC_SEP", "AND", "NAT", "STRING", "LSTR", "RSTR", "LCURL", 
			"RCURL", "LPAR", "RPAR", "EQ", "ATTR", "COMMA", "NEWLINE", "WS"
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
	public String getGrammarFileName() { return "TLAState.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public TLAStateParser(TokenStream input) {
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
	}

	public final StateContext state() throws RecognitionException {
		StateContext _localctx = new StateContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_state);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(66);
				stateElement();
				}
				}
				setState(69); 
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
		public List<TerminalNode> AND() { return getTokens(TLAStateParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(TLAStateParser.AND, i);
		}
		public FStateContext fState() {
			return getRuleContext(FStateContext.class,0);
		}
		public PcStateContext pcState() {
			return getRuleContext(PcStateContext.class,0);
		}
		public ReqStateContext reqState() {
			return getRuleContext(ReqStateContext.class,0);
		}
		public ResStateContext resState() {
			return getRuleContext(ResStateContext.class,0);
		}
		public List<EntityContext> entity() {
			return getRuleContexts(EntityContext.class);
		}
		public EntityContext entity(int i) {
			return getRuleContext(EntityContext.class,i);
		}
		public TagStateContext tagState() {
			return getRuleContext(TagStateContext.class,0);
		}
		public StateElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stateElement; }
	}

	public final StateElementContext stateElement() throws RecognitionException {
		StateElementContext _localctx = new StateElementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stateElement);
		try {
			int _alt;
			setState(90);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(71);
				match(AND);
				setState(72);
				fState();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(73);
				match(AND);
				setState(74);
				pcState();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(75);
				match(AND);
				setState(76);
				reqState();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(77);
				match(AND);
				setState(78);
				resState();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(79);
				match(AND);
				setState(80);
				entity();
				setState(85);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(81);
						match(AND);
						setState(82);
						entity();
						}
						} 
					}
					setState(87);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(88);
				match(AND);
				setState(89);
				tagState();
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
	public static class TagStateContext extends ParserRuleContext {
		public TerminalNode EQ() { return getToken(TLAStateParser.EQ, 0); }
		public TerminalNode LCURL() { return getToken(TLAStateParser.LCURL, 0); }
		public TagsContext tags() {
			return getRuleContext(TagsContext.class,0);
		}
		public TerminalNode RCURL() { return getToken(TLAStateParser.RCURL, 0); }
		public TagStateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tagState; }
	}

	public final TagStateContext tagState() throws RecognitionException {
		TagStateContext _localctx = new TagStateContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_tagState);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			match(T__0);
			setState(93);
			match(EQ);
			setState(94);
			match(LCURL);
			setState(95);
			tags();
			setState(96);
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
	public static class TagsContext extends ParserRuleContext {
		public TerminalNode NONE() { return getToken(TLAStateParser.NONE, 0); }
		public List<TerminalNode> STRING() { return getTokens(TLAStateParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(TLAStateParser.STRING, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(TLAStateParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(TLAStateParser.COMMA, i);
		}
		public TagsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tags; }
	}

	public final TagsContext tags() throws RecognitionException {
		TagsContext _localctx = new TagsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_tags);
		int _la;
		try {
			setState(107);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NONE:
				enterOuterAlt(_localctx, 1);
				{
				setState(98);
				match(NONE);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(99);
				match(STRING);
				setState(104);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(100);
					match(COMMA);
					setState(101);
					match(STRING);
					}
					}
					setState(106);
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
	public static class ResStateContext extends ParserRuleContext {
		public TerminalNode EQ() { return getToken(TLAStateParser.EQ, 0); }
		public ResponseRecordContext responseRecord() {
			return getRuleContext(ResponseRecordContext.class,0);
		}
		public ResStateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resState; }
	}

	public final ResStateContext resState() throws RecognitionException {
		ResStateContext _localctx = new ResStateContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_resState);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			match(T__1);
			setState(110);
			match(EQ);
			setState(111);
			responseRecord();
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
	public static class ResponseRecordContext extends ParserRuleContext {
		public TerminalNode LSTR() { return getToken(TLAStateParser.LSTR, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(TLAStateParser.COMMA, 0); }
		public CodeContext code() {
			return getRuleContext(CodeContext.class,0);
		}
		public TerminalNode RSTR() { return getToken(TLAStateParser.RSTR, 0); }
		public ResponseRecordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_responseRecord; }
	}

	public final ResponseRecordContext responseRecord() throws RecognitionException {
		ResponseRecordContext _localctx = new ResponseRecordContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_responseRecord);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			match(LSTR);
			setState(114);
			body();
			setState(115);
			match(COMMA);
			setState(116);
			code();
			setState(117);
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
	public static class CodeContext extends ParserRuleContext {
		public TerminalNode ATTR() { return getToken(TLAStateParser.ATTR, 0); }
		public CodeIDContext codeID() {
			return getRuleContext(CodeIDContext.class,0);
		}
		public CodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_code; }
	}

	public final CodeContext code() throws RecognitionException {
		CodeContext _localctx = new CodeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_code);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			match(T__2);
			setState(120);
			match(ATTR);
			setState(121);
			codeID();
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
	public static class CodeIDContext extends ParserRuleContext {
		public TerminalNode NONE() { return getToken(TLAStateParser.NONE, 0); }
		public TerminalNode CODE() { return getToken(TLAStateParser.CODE, 0); }
		public CodeIDContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_codeID; }
	}

	public final CodeIDContext codeID() throws RecognitionException {
		CodeIDContext _localctx = new CodeIDContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_codeID);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			_la = _input.LA(1);
			if ( !(_la==NONE || _la==CODE) ) {
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
	public static class EntityContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(TLAStateParser.STRING, 0); }
		public TerminalNode EQ() { return getToken(TLAStateParser.EQ, 0); }
		public TerminalNode LPAR() { return getToken(TLAStateParser.LPAR, 0); }
		public MapContext map() {
			return getRuleContext(MapContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(TLAStateParser.RPAR, 0); }
		public EntityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_entity; }
	}

	public final EntityContext entity() throws RecognitionException {
		EntityContext _localctx = new EntityContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_entity);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			match(STRING);
			setState(126);
			match(EQ);
			setState(127);
			match(LPAR);
			setState(128);
			map();
			setState(129);
			match(RPAR);
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
		public List<TerminalNode> REC_SEP() { return getTokens(TLAStateParser.REC_SEP); }
		public TerminalNode REC_SEP(int i) {
			return getToken(TLAStateParser.REC_SEP, i);
		}
		public MapContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_map; }
	}

	public final MapContext map() throws RecognitionException {
		MapContext _localctx = new MapContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_map);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			mapElement();
			setState(136);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==REC_SEP) {
				{
				{
				setState(132);
				match(REC_SEP);
				setState(133);
				mapElement();
				}
				}
				setState(138);
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
		public TerminalNode STRING() { return getToken(TLAStateParser.STRING, 0); }
		public RecordContext record() {
			return getRuleContext(RecordContext.class,0);
		}
		public MapElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mapElement; }
	}

	public final MapElementContext mapElement() throws RecognitionException {
		MapElementContext _localctx = new MapElementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_mapElement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			match(STRING);
			setState(140);
			match(T__3);
			setState(141);
			record();
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
		public TerminalNode LSTR() { return getToken(TLAStateParser.LSTR, 0); }
		public List<RecordElementContext> recordElement() {
			return getRuleContexts(RecordElementContext.class);
		}
		public RecordElementContext recordElement(int i) {
			return getRuleContext(RecordElementContext.class,i);
		}
		public TerminalNode RSTR() { return getToken(TLAStateParser.RSTR, 0); }
		public List<TerminalNode> COMMA() { return getTokens(TLAStateParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(TLAStateParser.COMMA, i);
		}
		public RecordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_record; }
	}

	public final RecordContext record() throws RecognitionException {
		RecordContext _localctx = new RecordContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_record);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			match(LSTR);
			setState(144);
			recordElement();
			setState(149);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(145);
				match(COMMA);
				setState(146);
				recordElement();
				}
				}
				setState(151);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(152);
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
		public TerminalNode STRING() { return getToken(TLAStateParser.STRING, 0); }
		public TerminalNode ATTR() { return getToken(TLAStateParser.ATTR, 0); }
		public FieldValueContext fieldValue() {
			return getRuleContext(FieldValueContext.class,0);
		}
		public RecordElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_recordElement; }
	}

	public final RecordElementContext recordElement() throws RecognitionException {
		RecordElementContext _localctx = new RecordElementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_recordElement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			match(STRING);
			setState(155);
			match(ATTR);
			setState(156);
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
		public TerminalNode STRING() { return getToken(TLAStateParser.STRING, 0); }
		public TerminalNode NAT() { return getToken(TLAStateParser.NAT, 0); }
		public TerminalNode BOOLEAN() { return getToken(TLAStateParser.BOOLEAN, 0); }
		public SetContext set() {
			return getRuleContext(SetContext.class,0);
		}
		public FieldValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldValue; }
	}

	public final FieldValueContext fieldValue() throws RecognitionException {
		FieldValueContext _localctx = new FieldValueContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_fieldValue);
		try {
			setState(162);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(158);
				match(STRING);
				}
				break;
			case NAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(159);
				match(NAT);
				}
				break;
			case BOOLEAN:
				enterOuterAlt(_localctx, 3);
				{
				setState(160);
				match(BOOLEAN);
				}
				break;
			case LCURL:
				enterOuterAlt(_localctx, 4);
				{
				setState(161);
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
		public TerminalNode LCURL() { return getToken(TLAStateParser.LCURL, 0); }
		public TerminalNode RCURL() { return getToken(TLAStateParser.RCURL, 0); }
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
	}

	public final SetContext set() throws RecognitionException {
		SetContext _localctx = new SetContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_set);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			match(LCURL);
			setState(168);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 234881024L) != 0)) {
				{
				{
				setState(165);
				setElement();
				}
				}
				setState(170);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(171);
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
		public List<TerminalNode> STRING() { return getTokens(TLAStateParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(TLAStateParser.STRING, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(TLAStateParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(TLAStateParser.COMMA, i);
		}
		public List<TerminalNode> NAT() { return getTokens(TLAStateParser.NAT); }
		public TerminalNode NAT(int i) {
			return getToken(TLAStateParser.NAT, i);
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
	}

	public final SetElementContext setElement() throws RecognitionException {
		SetElementContext _localctx = new SetElementContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_setElement);
		int _la;
		try {
			setState(197);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(173);
				match(STRING);
				setState(178);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(174);
					match(COMMA);
					setState(175);
					match(STRING);
					}
					}
					setState(180);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case NAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(181);
				match(NAT);
				setState(186);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(182);
					match(COMMA);
					setState(183);
					match(NAT);
					}
					}
					setState(188);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case LSTR:
				enterOuterAlt(_localctx, 3);
				{
				setState(189);
				record();
				setState(194);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(190);
					match(COMMA);
					setState(191);
					record();
					}
					}
					setState(196);
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
	public static class FStateContext extends ParserRuleContext {
		public TerminalNode EQ() { return getToken(TLAStateParser.EQ, 0); }
		public TerminalNode BOOLEAN() { return getToken(TLAStateParser.BOOLEAN, 0); }
		public FStateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fState; }
	}

	public final FStateContext fState() throws RecognitionException {
		FStateContext _localctx = new FStateContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_fState);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			match(T__4);
			setState(200);
			match(EQ);
			setState(201);
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
	public static class PcStateContext extends ParserRuleContext {
		public TerminalNode EQ() { return getToken(TLAStateParser.EQ, 0); }
		public TerminalNode BOOLEAN() { return getToken(TLAStateParser.BOOLEAN, 0); }
		public PcStateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pcState; }
	}

	public final PcStateContext pcState() throws RecognitionException {
		PcStateContext _localctx = new PcStateContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_pcState);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			match(T__5);
			setState(204);
			match(EQ);
			setState(205);
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
	public static class ReqStateContext extends ParserRuleContext {
		public TerminalNode EQ() { return getToken(TLAStateParser.EQ, 0); }
		public RequestRecordContext requestRecord() {
			return getRuleContext(RequestRecordContext.class,0);
		}
		public ReqStateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reqState; }
	}

	public final ReqStateContext reqState() throws RecognitionException {
		ReqStateContext _localctx = new ReqStateContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_reqState);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			match(T__6);
			setState(208);
			match(EQ);
			setState(209);
			requestRecord();
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
	public static class RequestRecordContext extends ParserRuleContext {
		public TerminalNode LSTR() { return getToken(TLAStateParser.LSTR, 0); }
		public OperationContext operation() {
			return getRuleContext(OperationContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(TLAStateParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(TLAStateParser.COMMA, i);
		}
		public VerbContext verb() {
			return getRuleContext(VerbContext.class,0);
		}
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public TerminalNode RSTR() { return getToken(TLAStateParser.RSTR, 0); }
		public RequestRecordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_requestRecord; }
	}

	public final RequestRecordContext requestRecord() throws RecognitionException {
		RequestRecordContext _localctx = new RequestRecordContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_requestRecord);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			match(LSTR);
			setState(212);
			operation();
			setState(213);
			match(COMMA);
			setState(214);
			verb();
			setState(215);
			match(COMMA);
			setState(216);
			parameters();
			setState(217);
			match(COMMA);
			setState(218);
			body();
			setState(219);
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
	public static class OperationContext extends ParserRuleContext {
		public TerminalNode ATTR() { return getToken(TLAStateParser.ATTR, 0); }
		public OperationIDContext operationID() {
			return getRuleContext(OperationIDContext.class,0);
		}
		public OperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operation; }
	}

	public final OperationContext operation() throws RecognitionException {
		OperationContext _localctx = new OperationContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_operation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			match(T__7);
			setState(222);
			match(ATTR);
			setState(223);
			operationID();
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
	public static class OperationIDContext extends ParserRuleContext {
		public TerminalNode NONE() { return getToken(TLAStateParser.NONE, 0); }
		public TerminalNode STRING() { return getToken(TLAStateParser.STRING, 0); }
		public OperationIDContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operationID; }
	}

	public final OperationIDContext operationID() throws RecognitionException {
		OperationIDContext _localctx = new OperationIDContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_operationID);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			_la = _input.LA(1);
			if ( !(_la==NONE || _la==STRING) ) {
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
	public static class VerbContext extends ParserRuleContext {
		public TerminalNode ATTR() { return getToken(TLAStateParser.ATTR, 0); }
		public VerbIDContext verbID() {
			return getRuleContext(VerbIDContext.class,0);
		}
		public VerbContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_verb; }
	}

	public final VerbContext verb() throws RecognitionException {
		VerbContext _localctx = new VerbContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_verb);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			match(T__8);
			setState(228);
			match(ATTR);
			setState(229);
			verbID();
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
	public static class VerbIDContext extends ParserRuleContext {
		public TerminalNode NONE() { return getToken(TLAStateParser.NONE, 0); }
		public TerminalNode VERB() { return getToken(TLAStateParser.VERB, 0); }
		public VerbIDContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_verbID; }
	}

	public final VerbIDContext verbID() throws RecognitionException {
		VerbIDContext _localctx = new VerbIDContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_verbID);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			_la = _input.LA(1);
			if ( !(_la==NONE || _la==VERB) ) {
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
	public static class ParametersContext extends ParserRuleContext {
		public TerminalNode ATTR() { return getToken(TLAStateParser.ATTR, 0); }
		public TerminalNode LCURL() { return getToken(TLAStateParser.LCURL, 0); }
		public List<ParamRecordContext> paramRecord() {
			return getRuleContexts(ParamRecordContext.class);
		}
		public ParamRecordContext paramRecord(int i) {
			return getRuleContext(ParamRecordContext.class,i);
		}
		public TerminalNode RCURL() { return getToken(TLAStateParser.RCURL, 0); }
		public List<TerminalNode> COMMA() { return getTokens(TLAStateParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(TLAStateParser.COMMA, i);
		}
		public ParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameters; }
	}

	public final ParametersContext parameters() throws RecognitionException {
		ParametersContext _localctx = new ParametersContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_parameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(233);
			match(T__9);
			setState(234);
			match(ATTR);
			setState(235);
			match(LCURL);
			setState(236);
			paramRecord();
			setState(241);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(237);
				match(COMMA);
				setState(238);
				paramRecord();
				}
				}
				setState(243);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(244);
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
	public static class BodyContext extends ParserRuleContext {
		public TerminalNode ATTR() { return getToken(TLAStateParser.ATTR, 0); }
		public TerminalNode LCURL() { return getToken(TLAStateParser.LCURL, 0); }
		public List<BodyRecordContext> bodyRecord() {
			return getRuleContexts(BodyRecordContext.class);
		}
		public BodyRecordContext bodyRecord(int i) {
			return getRuleContext(BodyRecordContext.class,i);
		}
		public TerminalNode RCURL() { return getToken(TLAStateParser.RCURL, 0); }
		public List<TerminalNode> COMMA() { return getTokens(TLAStateParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(TLAStateParser.COMMA, i);
		}
		public BodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body; }
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
			match(T__10);
			setState(247);
			match(ATTR);
			setState(248);
			match(LCURL);
			setState(249);
			bodyRecord();
			setState(254);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(250);
				match(COMMA);
				setState(251);
				bodyRecord();
				}
				}
				setState(256);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(257);
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
	public static class ParamRecordContext extends ParserRuleContext {
		public TerminalNode LSTR() { return getToken(TLAStateParser.LSTR, 0); }
		public List<TerminalNode> ATTR() { return getTokens(TLAStateParser.ATTR); }
		public TerminalNode ATTR(int i) {
			return getToken(TLAStateParser.ATTR, i);
		}
		public List<TerminalNode> STRING() { return getTokens(TLAStateParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(TLAStateParser.STRING, i);
		}
		public TerminalNode COMMA() { return getToken(TLAStateParser.COMMA, 0); }
		public TerminalNode RSTR() { return getToken(TLAStateParser.RSTR, 0); }
		public ParamRecordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paramRecord; }
	}

	public final ParamRecordContext paramRecord() throws RecognitionException {
		ParamRecordContext _localctx = new ParamRecordContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_paramRecord);
		try {
			setState(269);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LSTR:
				enterOuterAlt(_localctx, 1);
				{
				setState(259);
				match(LSTR);
				setState(260);
				match(T__11);
				setState(261);
				match(ATTR);
				setState(262);
				match(STRING);
				setState(263);
				match(COMMA);
				setState(264);
				match(T__12);
				setState(265);
				match(ATTR);
				setState(266);
				match(STRING);
				setState(267);
				match(RSTR);
				}
				break;
			case RCURL:
			case COMMA:
				enterOuterAlt(_localctx, 2);
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

	@SuppressWarnings("CheckReturnValue")
	public static class BodyRecordContext extends ParserRuleContext {
		public TerminalNode LSTR() { return getToken(TLAStateParser.LSTR, 0); }
		public BodyTypeContext bodyType() {
			return getRuleContext(BodyTypeContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(TLAStateParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(TLAStateParser.COMMA, i);
		}
		public BodyIntContext bodyInt() {
			return getRuleContext(BodyIntContext.class,0);
		}
		public BodyBoolContext bodyBool() {
			return getRuleContext(BodyBoolContext.class,0);
		}
		public BodyObjectContext bodyObject() {
			return getRuleContext(BodyObjectContext.class,0);
		}
		public TerminalNode RSTR() { return getToken(TLAStateParser.RSTR, 0); }
		public BodyRecordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bodyRecord; }
	}

	public final BodyRecordContext bodyRecord() throws RecognitionException {
		BodyRecordContext _localctx = new BodyRecordContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_bodyRecord);
		try {
			setState(282);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LSTR:
				enterOuterAlt(_localctx, 1);
				{
				setState(271);
				match(LSTR);
				setState(272);
				bodyType();
				setState(273);
				match(COMMA);
				setState(274);
				bodyInt();
				setState(275);
				match(COMMA);
				setState(276);
				bodyBool();
				setState(277);
				match(COMMA);
				setState(278);
				bodyObject();
				setState(279);
				match(RSTR);
				}
				break;
			case RCURL:
			case COMMA:
				enterOuterAlt(_localctx, 2);
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

	@SuppressWarnings("CheckReturnValue")
	public static class BodyTypeContext extends ParserRuleContext {
		public TerminalNode ATTR() { return getToken(TLAStateParser.ATTR, 0); }
		public TerminalNode RTYPE() { return getToken(TLAStateParser.RTYPE, 0); }
		public BodyTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bodyType; }
	}

	public final BodyTypeContext bodyType() throws RecognitionException {
		BodyTypeContext _localctx = new BodyTypeContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_bodyType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(284);
			match(T__13);
			setState(285);
			match(ATTR);
			setState(286);
			match(RTYPE);
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
	public static class BodyIntContext extends ParserRuleContext {
		public TerminalNode ATTR() { return getToken(TLAStateParser.ATTR, 0); }
		public TerminalNode NAT() { return getToken(TLAStateParser.NAT, 0); }
		public BodyIntContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bodyInt; }
	}

	public final BodyIntContext bodyInt() throws RecognitionException {
		BodyIntContext _localctx = new BodyIntContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_bodyInt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(288);
			match(T__14);
			setState(289);
			match(ATTR);
			setState(290);
			match(NAT);
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
	public static class BodyBoolContext extends ParserRuleContext {
		public TerminalNode ATTR() { return getToken(TLAStateParser.ATTR, 0); }
		public TerminalNode BOOLEAN() { return getToken(TLAStateParser.BOOLEAN, 0); }
		public BodyBoolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bodyBool; }
	}

	public final BodyBoolContext bodyBool() throws RecognitionException {
		BodyBoolContext _localctx = new BodyBoolContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_bodyBool);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(292);
			match(T__15);
			setState(293);
			match(ATTR);
			setState(294);
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
	public static class BodyObjectContext extends ParserRuleContext {
		public TerminalNode ATTR() { return getToken(TLAStateParser.ATTR, 0); }
		public TerminalNode LCURL() { return getToken(TLAStateParser.LCURL, 0); }
		public ObjectRecordContext objectRecord() {
			return getRuleContext(ObjectRecordContext.class,0);
		}
		public TerminalNode RCURL() { return getToken(TLAStateParser.RCURL, 0); }
		public BodyObjectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bodyObject; }
	}

	public final BodyObjectContext bodyObject() throws RecognitionException {
		BodyObjectContext _localctx = new BodyObjectContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_bodyObject);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(296);
			match(T__16);
			setState(297);
			match(ATTR);
			setState(298);
			match(LCURL);
			setState(299);
			objectRecord();
			setState(300);
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
	public static class ObjectRecordContext extends ParserRuleContext {
		public List<RecordContext> record() {
			return getRuleContexts(RecordContext.class);
		}
		public RecordContext record(int i) {
			return getRuleContext(RecordContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(TLAStateParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(TLAStateParser.COMMA, i);
		}
		public List<TerminalNode> STRING() { return getTokens(TLAStateParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(TLAStateParser.STRING, i);
		}
		public ObjectRecordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectRecord; }
	}

	public final ObjectRecordContext objectRecord() throws RecognitionException {
		ObjectRecordContext _localctx = new ObjectRecordContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_objectRecord);
		int _la;
		try {
			setState(319);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LSTR:
				enterOuterAlt(_localctx, 1);
				{
				setState(302);
				record();
				setState(307);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(303);
					match(COMMA);
					setState(304);
					record();
					}
					}
					setState(309);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(310);
				match(STRING);
				setState(315);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(311);
					match(COMMA);
					setState(312);
					match(STRING);
					}
					}
					setState(317);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case RCURL:
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
		"\u0004\u0001%\u0142\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0001\u0000\u0004\u0000D\b\u0000"+
		"\u000b\u0000\f\u0000E\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0005\u0001T\b\u0001\n\u0001\f\u0001W\t\u0001"+
		"\u0001\u0001\u0001\u0001\u0003\u0001[\b\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0005\u0003g\b\u0003\n\u0003\f\u0003j\t\u0003"+
		"\u0003\u0003l\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001"+
		"\t\u0005\t\u0087\b\t\n\t\f\t\u008a\t\t\u0001\n\u0001\n\u0001\n\u0001\n"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u0094\b\u000b"+
		"\n\u000b\f\u000b\u0097\t\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f"+
		"\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u00a3\b\r\u0001"+
		"\u000e\u0001\u000e\u0005\u000e\u00a7\b\u000e\n\u000e\f\u000e\u00aa\t\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0005\u000f"+
		"\u00b1\b\u000f\n\u000f\f\u000f\u00b4\t\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0005\u000f\u00b9\b\u000f\n\u000f\f\u000f\u00bc\t\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0005\u000f\u00c1\b\u000f\n\u000f\f\u000f\u00c4"+
		"\t\u000f\u0003\u000f\u00c6\b\u000f\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0015"+
		"\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0017"+
		"\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0005\u0018\u00f0\b\u0018\n\u0018\f\u0018\u00f3\t\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0005\u0019\u00fd\b\u0019\n\u0019\f\u0019\u0100\t\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0003\u001a\u010e\b\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0003\u001b\u011b\b\u001b\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001 \u0005 \u0132"+
		"\b \n \f \u0135\t \u0001 \u0001 \u0001 \u0005 \u013a\b \n \f \u013d\t"+
		" \u0001 \u0003 \u0140\b \u0001 \u0000\u0000!\u0000\u0002\u0004\u0006\b"+
		"\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02"+
		"468:<>@\u0000\u0003\u0002\u0000\u0012\u0012\u0015\u0015\u0002\u0000\u0012"+
		"\u0012\u001a\u001a\u0001\u0000\u0012\u0013\u013c\u0000C\u0001\u0000\u0000"+
		"\u0000\u0002Z\u0001\u0000\u0000\u0000\u0004\\\u0001\u0000\u0000\u0000"+
		"\u0006k\u0001\u0000\u0000\u0000\bm\u0001\u0000\u0000\u0000\nq\u0001\u0000"+
		"\u0000\u0000\fw\u0001\u0000\u0000\u0000\u000e{\u0001\u0000\u0000\u0000"+
		"\u0010}\u0001\u0000\u0000\u0000\u0012\u0083\u0001\u0000\u0000\u0000\u0014"+
		"\u008b\u0001\u0000\u0000\u0000\u0016\u008f\u0001\u0000\u0000\u0000\u0018"+
		"\u009a\u0001\u0000\u0000\u0000\u001a\u00a2\u0001\u0000\u0000\u0000\u001c"+
		"\u00a4\u0001\u0000\u0000\u0000\u001e\u00c5\u0001\u0000\u0000\u0000 \u00c7"+
		"\u0001\u0000\u0000\u0000\"\u00cb\u0001\u0000\u0000\u0000$\u00cf\u0001"+
		"\u0000\u0000\u0000&\u00d3\u0001\u0000\u0000\u0000(\u00dd\u0001\u0000\u0000"+
		"\u0000*\u00e1\u0001\u0000\u0000\u0000,\u00e3\u0001\u0000\u0000\u0000."+
		"\u00e7\u0001\u0000\u0000\u00000\u00e9\u0001\u0000\u0000\u00002\u00f6\u0001"+
		"\u0000\u0000\u00004\u010d\u0001\u0000\u0000\u00006\u011a\u0001\u0000\u0000"+
		"\u00008\u011c\u0001\u0000\u0000\u0000:\u0120\u0001\u0000\u0000\u0000<"+
		"\u0124\u0001\u0000\u0000\u0000>\u0128\u0001\u0000\u0000\u0000@\u013f\u0001"+
		"\u0000\u0000\u0000BD\u0003\u0002\u0001\u0000CB\u0001\u0000\u0000\u0000"+
		"DE\u0001\u0000\u0000\u0000EC\u0001\u0000\u0000\u0000EF\u0001\u0000\u0000"+
		"\u0000F\u0001\u0001\u0000\u0000\u0000GH\u0005\u0018\u0000\u0000H[\u0003"+
		" \u0010\u0000IJ\u0005\u0018\u0000\u0000J[\u0003\"\u0011\u0000KL\u0005"+
		"\u0018\u0000\u0000L[\u0003$\u0012\u0000MN\u0005\u0018\u0000\u0000N[\u0003"+
		"\b\u0004\u0000OP\u0005\u0018\u0000\u0000PU\u0003\u0010\b\u0000QR\u0005"+
		"\u0018\u0000\u0000RT\u0003\u0010\b\u0000SQ\u0001\u0000\u0000\u0000TW\u0001"+
		"\u0000\u0000\u0000US\u0001\u0000\u0000\u0000UV\u0001\u0000\u0000\u0000"+
		"V[\u0001\u0000\u0000\u0000WU\u0001\u0000\u0000\u0000XY\u0005\u0018\u0000"+
		"\u0000Y[\u0003\u0004\u0002\u0000ZG\u0001\u0000\u0000\u0000ZI\u0001\u0000"+
		"\u0000\u0000ZK\u0001\u0000\u0000\u0000ZM\u0001\u0000\u0000\u0000ZO\u0001"+
		"\u0000\u0000\u0000ZX\u0001\u0000\u0000\u0000[\u0003\u0001\u0000\u0000"+
		"\u0000\\]\u0005\u0001\u0000\u0000]^\u0005!\u0000\u0000^_\u0005\u001d\u0000"+
		"\u0000_`\u0003\u0006\u0003\u0000`a\u0005\u001e\u0000\u0000a\u0005\u0001"+
		"\u0000\u0000\u0000bl\u0005\u0012\u0000\u0000ch\u0005\u001a\u0000\u0000"+
		"de\u0005#\u0000\u0000eg\u0005\u001a\u0000\u0000fd\u0001\u0000\u0000\u0000"+
		"gj\u0001\u0000\u0000\u0000hf\u0001\u0000\u0000\u0000hi\u0001\u0000\u0000"+
		"\u0000il\u0001\u0000\u0000\u0000jh\u0001\u0000\u0000\u0000kb\u0001\u0000"+
		"\u0000\u0000kc\u0001\u0000\u0000\u0000l\u0007\u0001\u0000\u0000\u0000"+
		"mn\u0005\u0002\u0000\u0000no\u0005!\u0000\u0000op\u0003\n\u0005\u0000"+
		"p\t\u0001\u0000\u0000\u0000qr\u0005\u001b\u0000\u0000rs\u00032\u0019\u0000"+
		"st\u0005#\u0000\u0000tu\u0003\f\u0006\u0000uv\u0005\u001c\u0000\u0000"+
		"v\u000b\u0001\u0000\u0000\u0000wx\u0005\u0003\u0000\u0000xy\u0005\"\u0000"+
		"\u0000yz\u0003\u000e\u0007\u0000z\r\u0001\u0000\u0000\u0000{|\u0007\u0000"+
		"\u0000\u0000|\u000f\u0001\u0000\u0000\u0000}~\u0005\u001a\u0000\u0000"+
		"~\u007f\u0005!\u0000\u0000\u007f\u0080\u0005\u001f\u0000\u0000\u0080\u0081"+
		"\u0003\u0012\t\u0000\u0081\u0082\u0005 \u0000\u0000\u0082\u0011\u0001"+
		"\u0000\u0000\u0000\u0083\u0088\u0003\u0014\n\u0000\u0084\u0085\u0005\u0017"+
		"\u0000\u0000\u0085\u0087\u0003\u0014\n\u0000\u0086\u0084\u0001\u0000\u0000"+
		"\u0000\u0087\u008a\u0001\u0000\u0000\u0000\u0088\u0086\u0001\u0000\u0000"+
		"\u0000\u0088\u0089\u0001\u0000\u0000\u0000\u0089\u0013\u0001\u0000\u0000"+
		"\u0000\u008a\u0088\u0001\u0000\u0000\u0000\u008b\u008c\u0005\u001a\u0000"+
		"\u0000\u008c\u008d\u0005\u0004\u0000\u0000\u008d\u008e\u0003\u0016\u000b"+
		"\u0000\u008e\u0015\u0001\u0000\u0000\u0000\u008f\u0090\u0005\u001b\u0000"+
		"\u0000\u0090\u0095\u0003\u0018\f\u0000\u0091\u0092\u0005#\u0000\u0000"+
		"\u0092\u0094\u0003\u0018\f\u0000\u0093\u0091\u0001\u0000\u0000\u0000\u0094"+
		"\u0097\u0001\u0000\u0000\u0000\u0095\u0093\u0001\u0000\u0000\u0000\u0095"+
		"\u0096\u0001\u0000\u0000\u0000\u0096\u0098\u0001\u0000\u0000\u0000\u0097"+
		"\u0095\u0001\u0000\u0000\u0000\u0098\u0099\u0005\u001c\u0000\u0000\u0099"+
		"\u0017\u0001\u0000\u0000\u0000\u009a\u009b\u0005\u001a\u0000\u0000\u009b"+
		"\u009c\u0005\"\u0000\u0000\u009c\u009d\u0003\u001a\r\u0000\u009d\u0019"+
		"\u0001\u0000\u0000\u0000\u009e\u00a3\u0005\u001a\u0000\u0000\u009f\u00a3"+
		"\u0005\u0019\u0000\u0000\u00a0\u00a3\u0005\u0016\u0000\u0000\u00a1\u00a3"+
		"\u0003\u001c\u000e\u0000\u00a2\u009e\u0001\u0000\u0000\u0000\u00a2\u009f"+
		"\u0001\u0000\u0000\u0000\u00a2\u00a0\u0001\u0000\u0000\u0000\u00a2\u00a1"+
		"\u0001\u0000\u0000\u0000\u00a3\u001b\u0001\u0000\u0000\u0000\u00a4\u00a8"+
		"\u0005\u001d\u0000\u0000\u00a5\u00a7\u0003\u001e\u000f\u0000\u00a6\u00a5"+
		"\u0001\u0000\u0000\u0000\u00a7\u00aa\u0001\u0000\u0000\u0000\u00a8\u00a6"+
		"\u0001\u0000\u0000\u0000\u00a8\u00a9\u0001\u0000\u0000\u0000\u00a9\u00ab"+
		"\u0001\u0000\u0000\u0000\u00aa\u00a8\u0001\u0000\u0000\u0000\u00ab\u00ac"+
		"\u0005\u001e\u0000\u0000\u00ac\u001d\u0001\u0000\u0000\u0000\u00ad\u00b2"+
		"\u0005\u001a\u0000\u0000\u00ae\u00af\u0005#\u0000\u0000\u00af\u00b1\u0005"+
		"\u001a\u0000\u0000\u00b0\u00ae\u0001\u0000\u0000\u0000\u00b1\u00b4\u0001"+
		"\u0000\u0000\u0000\u00b2\u00b0\u0001\u0000\u0000\u0000\u00b2\u00b3\u0001"+
		"\u0000\u0000\u0000\u00b3\u00c6\u0001\u0000\u0000\u0000\u00b4\u00b2\u0001"+
		"\u0000\u0000\u0000\u00b5\u00ba\u0005\u0019\u0000\u0000\u00b6\u00b7\u0005"+
		"#\u0000\u0000\u00b7\u00b9\u0005\u0019\u0000\u0000\u00b8\u00b6\u0001\u0000"+
		"\u0000\u0000\u00b9\u00bc\u0001\u0000\u0000\u0000\u00ba\u00b8\u0001\u0000"+
		"\u0000\u0000\u00ba\u00bb\u0001\u0000\u0000\u0000\u00bb\u00c6\u0001\u0000"+
		"\u0000\u0000\u00bc\u00ba\u0001\u0000\u0000\u0000\u00bd\u00c2\u0003\u0016"+
		"\u000b\u0000\u00be\u00bf\u0005#\u0000\u0000\u00bf\u00c1\u0003\u0016\u000b"+
		"\u0000\u00c0\u00be\u0001\u0000\u0000\u0000\u00c1\u00c4\u0001\u0000\u0000"+
		"\u0000\u00c2\u00c0\u0001\u0000\u0000\u0000\u00c2\u00c3\u0001\u0000\u0000"+
		"\u0000\u00c3\u00c6\u0001\u0000\u0000\u0000\u00c4\u00c2\u0001\u0000\u0000"+
		"\u0000\u00c5\u00ad\u0001\u0000\u0000\u0000\u00c5\u00b5\u0001\u0000\u0000"+
		"\u0000\u00c5\u00bd\u0001\u0000\u0000\u0000\u00c6\u001f\u0001\u0000\u0000"+
		"\u0000\u00c7\u00c8\u0005\u0005\u0000\u0000\u00c8\u00c9\u0005!\u0000\u0000"+
		"\u00c9\u00ca\u0005\u0016\u0000\u0000\u00ca!\u0001\u0000\u0000\u0000\u00cb"+
		"\u00cc\u0005\u0006\u0000\u0000\u00cc\u00cd\u0005!\u0000\u0000\u00cd\u00ce"+
		"\u0005\u0016\u0000\u0000\u00ce#\u0001\u0000\u0000\u0000\u00cf\u00d0\u0005"+
		"\u0007\u0000\u0000\u00d0\u00d1\u0005!\u0000\u0000\u00d1\u00d2\u0003&\u0013"+
		"\u0000\u00d2%\u0001\u0000\u0000\u0000\u00d3\u00d4\u0005\u001b\u0000\u0000"+
		"\u00d4\u00d5\u0003(\u0014\u0000\u00d5\u00d6\u0005#\u0000\u0000\u00d6\u00d7"+
		"\u0003,\u0016\u0000\u00d7\u00d8\u0005#\u0000\u0000\u00d8\u00d9\u00030"+
		"\u0018\u0000\u00d9\u00da\u0005#\u0000\u0000\u00da\u00db\u00032\u0019\u0000"+
		"\u00db\u00dc\u0005\u001c\u0000\u0000\u00dc\'\u0001\u0000\u0000\u0000\u00dd"+
		"\u00de\u0005\b\u0000\u0000\u00de\u00df\u0005\"\u0000\u0000\u00df\u00e0"+
		"\u0003*\u0015\u0000\u00e0)\u0001\u0000\u0000\u0000\u00e1\u00e2\u0007\u0001"+
		"\u0000\u0000\u00e2+\u0001\u0000\u0000\u0000\u00e3\u00e4\u0005\t\u0000"+
		"\u0000\u00e4\u00e5\u0005\"\u0000\u0000\u00e5\u00e6\u0003.\u0017\u0000"+
		"\u00e6-\u0001\u0000\u0000\u0000\u00e7\u00e8\u0007\u0002\u0000\u0000\u00e8"+
		"/\u0001\u0000\u0000\u0000\u00e9\u00ea\u0005\n\u0000\u0000\u00ea\u00eb"+
		"\u0005\"\u0000\u0000\u00eb\u00ec\u0005\u001d\u0000\u0000\u00ec\u00f1\u0003"+
		"4\u001a\u0000\u00ed\u00ee\u0005#\u0000\u0000\u00ee\u00f0\u00034\u001a"+
		"\u0000\u00ef\u00ed\u0001\u0000\u0000\u0000\u00f0\u00f3\u0001\u0000\u0000"+
		"\u0000\u00f1\u00ef\u0001\u0000\u0000\u0000\u00f1\u00f2\u0001\u0000\u0000"+
		"\u0000\u00f2\u00f4\u0001\u0000\u0000\u0000\u00f3\u00f1\u0001\u0000\u0000"+
		"\u0000\u00f4\u00f5\u0005\u001e\u0000\u0000\u00f51\u0001\u0000\u0000\u0000"+
		"\u00f6\u00f7\u0005\u000b\u0000\u0000\u00f7\u00f8\u0005\"\u0000\u0000\u00f8"+
		"\u00f9\u0005\u001d\u0000\u0000\u00f9\u00fe\u00036\u001b\u0000\u00fa\u00fb"+
		"\u0005#\u0000\u0000\u00fb\u00fd\u00036\u001b\u0000\u00fc\u00fa\u0001\u0000"+
		"\u0000\u0000\u00fd\u0100\u0001\u0000\u0000\u0000\u00fe\u00fc\u0001\u0000"+
		"\u0000\u0000\u00fe\u00ff\u0001\u0000\u0000\u0000\u00ff\u0101\u0001\u0000"+
		"\u0000\u0000\u0100\u00fe\u0001\u0000\u0000\u0000\u0101\u0102\u0005\u001e"+
		"\u0000\u0000\u01023\u0001\u0000\u0000\u0000\u0103\u0104\u0005\u001b\u0000"+
		"\u0000\u0104\u0105\u0005\f\u0000\u0000\u0105\u0106\u0005\"\u0000\u0000"+
		"\u0106\u0107\u0005\u001a\u0000\u0000\u0107\u0108\u0005#\u0000\u0000\u0108"+
		"\u0109\u0005\r\u0000\u0000\u0109\u010a\u0005\"\u0000\u0000\u010a\u010b"+
		"\u0005\u001a\u0000\u0000\u010b\u010e\u0005\u001c\u0000\u0000\u010c\u010e"+
		"\u0001\u0000\u0000\u0000\u010d\u0103\u0001\u0000\u0000\u0000\u010d\u010c"+
		"\u0001\u0000\u0000\u0000\u010e5\u0001\u0000\u0000\u0000\u010f\u0110\u0005"+
		"\u001b\u0000\u0000\u0110\u0111\u00038\u001c\u0000\u0111\u0112\u0005#\u0000"+
		"\u0000\u0112\u0113\u0003:\u001d\u0000\u0113\u0114\u0005#\u0000\u0000\u0114"+
		"\u0115\u0003<\u001e\u0000\u0115\u0116\u0005#\u0000\u0000\u0116\u0117\u0003"+
		">\u001f\u0000\u0117\u0118\u0005\u001c\u0000\u0000\u0118\u011b\u0001\u0000"+
		"\u0000\u0000\u0119\u011b\u0001\u0000\u0000\u0000\u011a\u010f\u0001\u0000"+
		"\u0000\u0000\u011a\u0119\u0001\u0000\u0000\u0000\u011b7\u0001\u0000\u0000"+
		"\u0000\u011c\u011d\u0005\u000e\u0000\u0000\u011d\u011e\u0005\"\u0000\u0000"+
		"\u011e\u011f\u0005\u0014\u0000\u0000\u011f9\u0001\u0000\u0000\u0000\u0120"+
		"\u0121\u0005\u000f\u0000\u0000\u0121\u0122\u0005\"\u0000\u0000\u0122\u0123"+
		"\u0005\u0019\u0000\u0000\u0123;\u0001\u0000\u0000\u0000\u0124\u0125\u0005"+
		"\u0010\u0000\u0000\u0125\u0126\u0005\"\u0000\u0000\u0126\u0127\u0005\u0016"+
		"\u0000\u0000\u0127=\u0001\u0000\u0000\u0000\u0128\u0129\u0005\u0011\u0000"+
		"\u0000\u0129\u012a\u0005\"\u0000\u0000\u012a\u012b\u0005\u001d\u0000\u0000"+
		"\u012b\u012c\u0003@ \u0000\u012c\u012d\u0005\u001e\u0000\u0000\u012d?"+
		"\u0001\u0000\u0000\u0000\u012e\u0133\u0003\u0016\u000b\u0000\u012f\u0130"+
		"\u0005#\u0000\u0000\u0130\u0132\u0003\u0016\u000b\u0000\u0131\u012f\u0001"+
		"\u0000\u0000\u0000\u0132\u0135\u0001\u0000\u0000\u0000\u0133\u0131\u0001"+
		"\u0000\u0000\u0000\u0133\u0134\u0001\u0000\u0000\u0000\u0134\u0140\u0001"+
		"\u0000\u0000\u0000\u0135\u0133\u0001\u0000\u0000\u0000\u0136\u013b\u0005"+
		"\u001a\u0000\u0000\u0137\u0138\u0005#\u0000\u0000\u0138\u013a\u0005\u001a"+
		"\u0000\u0000\u0139\u0137\u0001\u0000\u0000\u0000\u013a\u013d\u0001\u0000"+
		"\u0000\u0000\u013b\u0139\u0001\u0000\u0000\u0000\u013b\u013c\u0001\u0000"+
		"\u0000\u0000\u013c\u0140\u0001\u0000\u0000\u0000\u013d\u013b\u0001\u0000"+
		"\u0000\u0000\u013e\u0140\u0001\u0000\u0000\u0000\u013f\u012e\u0001\u0000"+
		"\u0000\u0000\u013f\u0136\u0001\u0000\u0000\u0000\u013f\u013e\u0001\u0000"+
		"\u0000\u0000\u0140A\u0001\u0000\u0000\u0000\u0014EUZhk\u0088\u0095\u00a2"+
		"\u00a8\u00b2\u00ba\u00c2\u00c5\u00f1\u00fe\u010d\u011a\u0133\u013b\u013f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}