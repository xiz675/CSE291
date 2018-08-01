package xw.Parser;// Generated from /home/kyliu/IdeaProjects/graphTest/src/main/antlr/CypherFragment.g4 by ANTLR 4.7
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CypherFragmentParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, StringLiteral=17, 
		DecimalInteger=18, Digit=19, NonZeroDigit=20, NonZeroOctDigit=21, OctDigit=22, 
		ZeroDigit=23, RegularDecimalReal=24, OR=25, NULL=26, COUNT=27, MATCH=28, 
		RETURN=29, WHERE=30, AND=31, NOT=32, TRUE=33, FALSE=34, UnescapedSymbolicName=35, 
		IdentifierStart=36, IdentifierPart=37, SP=38, WHITESPACE=39, Comment=40;
	public static final int
		RULE_cypher = 0, RULE_singleQuery = 1, RULE_clause = 2, RULE_match = 3, 
		RULE_returnStatement = 4, RULE_returnItem = 5, RULE_where = 6, RULE_pattern = 7, 
		RULE_patternPart = 8, RULE_anonymousPatternPart = 9, RULE_patternElement = 10, 
		RULE_nodePattern = 11, RULE_patternElementChain = 12, RULE_relationshipPattern = 13, 
		RULE_relationshipDetail = 14, RULE_properties = 15, RULE_relationshipTypes = 16, 
		RULE_nodeLabels = 17, RULE_nodeLabel = 18, RULE_rangeLiteral = 19, RULE_labelName = 20, 
		RULE_relTypeName = 21, RULE_expression = 22, RULE_expression9 = 23, RULE_expression7 = 24, 
		RULE_atom = 25, RULE_literal = 26, RULE_numberLiteral = 27, RULE_booleanLiteral = 28, 
		RULE_mapLiteral = 29, RULE_parenthesizedExpression = 30, RULE_propertyLookup = 31, 
		RULE_labelLookup = 32, RULE_variable = 33, RULE_integerLiteral = 34, RULE_propertyKeyName = 35, 
		RULE_schemaName = 36, RULE_reservedWord = 37, RULE_doubleLiteral = 38, 
		RULE_symbolicName = 39, RULE_leftArrowHead = 40, RULE_rightArrowHead = 41, 
		RULE_dash = 42;
	public static final String[] ruleNames = {
		"cypher", "singleQuery", "clause", "match", "returnStatement", "returnItem", 
		"where", "pattern", "patternPart", "anonymousPatternPart", "patternElement", 
		"nodePattern", "patternElementChain", "relationshipPattern", "relationshipDetail", 
		"properties", "relationshipTypes", "nodeLabels", "nodeLabel", "rangeLiteral", 
		"labelName", "relTypeName", "expression", "expression9", "expression7", 
		"atom", "literal", "numberLiteral", "booleanLiteral", "mapLiteral", "parenthesizedExpression", 
		"propertyLookup", "labelLookup", "variable", "integerLiteral", "propertyKeyName", 
		"schemaName", "reservedWord", "doubleLiteral", "symbolicName", "leftArrowHead", 
		"rightArrowHead", "dash"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "','", "'='", "'('", "')'", "'['", "']'", "':'", "'|'", "'*'", "'..'", 
		"'{'", "'}'", "'.'", "'<'", "'>'", "'-'", null, null, null, null, null, 
		null, "'0'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, "StringLiteral", "DecimalInteger", "Digit", 
		"NonZeroDigit", "NonZeroOctDigit", "OctDigit", "ZeroDigit", "RegularDecimalReal", 
		"OR", "NULL", "COUNT", "MATCH", "RETURN", "WHERE", "AND", "NOT", "TRUE", 
		"FALSE", "UnescapedSymbolicName", "IdentifierStart", "IdentifierPart", 
		"SP", "WHITESPACE", "Comment"
	};
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
	public String getGrammarFileName() { return "CypherFragment.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CypherFragmentParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class CypherContext extends ParserRuleContext {
		public SingleQueryContext singleQuery() {
			return getRuleContext(SingleQueryContext.class,0);
		}
		public CypherContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cypher; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CypherFragmentListener ) ((CypherFragmentListener)listener).enterCypher(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CypherFragmentListener ) ((CypherFragmentListener)listener).exitCypher(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CypherFragmentVisitor ) return ((CypherFragmentVisitor<? extends T>)visitor).visitCypher(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CypherContext cypher() throws RecognitionException {
		CypherContext _localctx = new CypherContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_cypher);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			singleQuery();
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

	public static class SingleQueryContext extends ParserRuleContext {
		public List<ClauseContext> clause() {
			return getRuleContexts(ClauseContext.class);
		}
		public ClauseContext clause(int i) {
			return getRuleContext(ClauseContext.class,i);
		}
		public List<TerminalNode> SP() { return getTokens(CypherFragmentParser.SP); }
		public TerminalNode SP(int i) {
			return getToken(CypherFragmentParser.SP, i);
		}
		public SingleQueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleQuery; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CypherFragmentListener ) ((CypherFragmentListener)listener).enterSingleQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CypherFragmentListener ) ((CypherFragmentListener)listener).exitSingleQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CypherFragmentVisitor ) return ((CypherFragmentVisitor<? extends T>)visitor).visitSingleQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleQueryContext singleQuery() throws RecognitionException {
		SingleQueryContext _localctx = new SingleQueryContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_singleQuery);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			clause();
			setState(95);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << StringLiteral) | (1L << DecimalInteger) | (1L << RegularDecimalReal) | (1L << OR) | (1L << NULL) | (1L << MATCH) | (1L << RETURN) | (1L << WHERE) | (1L << AND) | (1L << NOT) | (1L << TRUE) | (1L << FALSE) | (1L << UnescapedSymbolicName) | (1L << SP))) != 0)) {
				{
				{
				setState(90);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SP) {
					{
					setState(89);
					match(SP);
					}
				}

				setState(92);
				clause();
				}
				}
				setState(97);
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

	public static class ClauseContext extends ParserRuleContext {
		public MatchContext match() {
			return getRuleContext(MatchContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public ClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CypherFragmentListener ) ((CypherFragmentListener)listener).enterClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CypherFragmentListener ) ((CypherFragmentListener)listener).exitClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CypherFragmentVisitor ) return ((CypherFragmentVisitor<? extends T>)visitor).visitClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClauseContext clause() throws RecognitionException {
		ClauseContext _localctx = new ClauseContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_clause);
		try {
			setState(100);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(98);
				match();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(99);
				returnStatement();
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

	public static class MatchContext extends ParserRuleContext {
		public TerminalNode MATCH() { return getToken(CypherFragmentParser.MATCH, 0); }
		public PatternContext pattern() {
			return getRuleContext(PatternContext.class,0);
		}
		public List<TerminalNode> SP() { return getTokens(CypherFragmentParser.SP); }
		public TerminalNode SP(int i) {
			return getToken(CypherFragmentParser.SP, i);
		}
		public WhereContext where() {
			return getRuleContext(WhereContext.class,0);
		}
		public MatchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_match; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CypherFragmentListener ) ((CypherFragmentListener)listener).enterMatch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CypherFragmentListener ) ((CypherFragmentListener)listener).exitMatch(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CypherFragmentVisitor ) return ((CypherFragmentVisitor<? extends T>)visitor).visitMatch(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MatchContext match() throws RecognitionException {
		MatchContext _localctx = new MatchContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_match);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			match(MATCH);
			setState(104);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SP) {
				{
				setState(103);
				match(SP);
				}
			}

			setState(106);
			pattern();
			setState(111);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(108);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SP) {
					{
					setState(107);
					match(SP);
					}
				}

				setState(110);
				where();
				}
				break;
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

	public static class ReturnStatementContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(CypherFragmentParser.RETURN, 0); }
		public List<TerminalNode> SP() { return getTokens(CypherFragmentParser.SP); }
		public TerminalNode SP(int i) {
			return getToken(CypherFragmentParser.SP, i);
		}
		public List<ReturnItemContext> returnItem() {
			return getRuleContexts(ReturnItemContext.class);
		}
		public ReturnItemContext returnItem(int i) {
			return getRuleContext(ReturnItemContext.class,i);
		}
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CypherFragmentListener ) ((CypherFragmentListener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CypherFragmentListener ) ((CypherFragmentListener)listener).exitReturnStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CypherFragmentVisitor ) return ((CypherFragmentVisitor<? extends T>)visitor).visitReturnStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_returnStatement);
		int _la;
		try {
			int _alt;
			setState(142);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(113);
				match(RETURN);
				setState(114);
				match(SP);
				{
				setState(125);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
				while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(116);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==SP) {
							{
							setState(115);
							match(SP);
							}
						}

						setState(118);
						match(T__0);
						setState(120);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==SP) {
							{
							setState(119);
							match(SP);
							}
						}

						setState(122);
						returnItem();
						}
						} 
					}
					setState(127);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
				}
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(128);
				returnItem();
				setState(139);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(130);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==SP) {
							{
							setState(129);
							match(SP);
							}
						}

						setState(132);
						match(T__0);
						setState(134);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==SP) {
							{
							setState(133);
							match(SP);
							}
						}

						setState(136);
						returnItem();
						}
						} 
					}
					setState(141);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				}
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

	public static class ReturnItemContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CypherFragmentListener ) ((CypherFragmentListener)listener).enterReturnItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CypherFragmentListener ) ((CypherFragmentListener)listener).exitReturnItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CypherFragmentVisitor ) return ((CypherFragmentVisitor<? extends T>)visitor).visitReturnItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnItemContext returnItem() throws RecognitionException {
		ReturnItemContext _localctx = new ReturnItemContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_returnItem);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			expression();
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

	public static class WhereContext extends ParserRuleContext {
		public TerminalNode WHERE() { return getToken(CypherFragmentParser.WHERE, 0); }
		public TerminalNode SP() { return getToken(CypherFragmentParser.SP, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public WhereContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_where; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CypherFragmentListener ) ((CypherFragmentListener)listener).enterWhere(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CypherFragmentListener ) ((CypherFragmentListener)listener).exitWhere(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CypherFragmentVisitor ) return ((CypherFragmentVisitor<? extends T>)visitor).visitWhere(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhereContext where() throws RecognitionException {
		WhereContext _localctx = new WhereContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_where);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			match(WHERE);
			setState(147);
			match(SP);
			setState(148);
			expression();
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

	public static class PatternContext extends ParserRuleContext {
		public List<PatternPartContext> patternPart() {
			return getRuleContexts(PatternPartContext.class);
		}
		public PatternPartContext patternPart(int i) {
			return getRuleContext(PatternPartContext.class,i);
		}
		public List<TerminalNode> SP() { return getTokens(CypherFragmentParser.SP); }
		public TerminalNode SP(int i) {
			return getToken(CypherFragmentParser.SP, i);
		}
		public PatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CypherFragmentListener ) ((CypherFragmentListener)listener).enterPattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CypherFragmentListener ) ((CypherFragmentListener)listener).exitPattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CypherFragmentVisitor ) return ((CypherFragmentVisitor<? extends T>)visitor).visitPattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PatternContext pattern() throws RecognitionException {
		PatternContext _localctx = new PatternContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_pattern);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			patternPart();
			setState(161);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(152);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SP) {
						{
						setState(151);
						match(SP);
						}
					}

					setState(154);
					match(T__0);
					setState(156);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SP) {
						{
						setState(155);
						match(SP);
						}
					}

					setState(158);
					patternPart();
					}
					} 
				}
				setState(163);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
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

	public static class PatternPartContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public AnonymousPatternPartContext anonymousPatternPart() {
			return getRuleContext(AnonymousPatternPartContext.class,0);
		}
		public List<TerminalNode> SP() { return getTokens(CypherFragmentParser.SP); }
		public TerminalNode SP(int i) {
			return getToken(CypherFragmentParser.SP, i);
		}
		public PatternPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_patternPart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CypherFragmentListener ) ((CypherFragmentListener)listener).enterPatternPart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CypherFragmentListener ) ((CypherFragmentListener)listener).exitPatternPart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CypherFragmentVisitor ) return ((CypherFragmentVisitor<? extends T>)visitor).visitPatternPart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PatternPartContext patternPart() throws RecognitionException {
		PatternPartContext _localctx = new PatternPartContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_patternPart);
		int _la;
		try {
			setState(175);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OR:
			case MATCH:
			case RETURN:
			case WHERE:
			case AND:
			case NOT:
			case TRUE:
			case FALSE:
			case UnescapedSymbolicName:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(164);
				variable();
				setState(166);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SP) {
					{
					setState(165);
					match(SP);
					}
				}

				setState(168);
				match(T__1);
				setState(170);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SP) {
					{
					setState(169);
					match(SP);
					}
				}

				setState(172);
				anonymousPatternPart();
				}
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				setState(174);
				anonymousPatternPart();
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

	public static class AnonymousPatternPartContext extends ParserRuleContext {
		public PatternElementContext patternElement() {
			return getRuleContext(PatternElementContext.class,0);
		}
		public AnonymousPatternPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_anonymousPatternPart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CypherFragmentListener ) ((CypherFragmentListener)listener).enterAnonymousPatternPart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CypherFragmentListener ) ((CypherFragmentListener)listener).exitAnonymousPatternPart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CypherFragmentVisitor ) return ((CypherFragmentVisitor<? extends T>)visitor).visitAnonymousPatternPart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnonymousPatternPartContext anonymousPatternPart() throws RecognitionException {
		AnonymousPatternPartContext _localctx = new AnonymousPatternPartContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_anonymousPatternPart);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			patternElement();
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

	public static class PatternElementContext extends ParserRuleContext {
		public NodePatternContext nodePattern() {
			return getRuleContext(NodePatternContext.class,0);
		}
		public List<PatternElementChainContext> patternElementChain() {
			return getRuleContexts(PatternElementChainContext.class);
		}
		public PatternElementChainContext patternElementChain(int i) {
			return getRuleContext(PatternElementChainContext.class,i);
		}
		public List<TerminalNode> SP() { return getTokens(CypherFragmentParser.SP); }
		public TerminalNode SP(int i) {
			return getToken(CypherFragmentParser.SP, i);
		}
		public PatternElementContext patternElement() {
			return getRuleContext(PatternElementContext.class,0);
		}
		public PatternElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_patternElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CypherFragmentListener ) ((CypherFragmentListener)listener).enterPatternElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CypherFragmentListener ) ((CypherFragmentListener)listener).exitPatternElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CypherFragmentVisitor ) return ((CypherFragmentVisitor<? extends T>)visitor).visitPatternElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PatternElementContext patternElement() throws RecognitionException {
		PatternElementContext _localctx = new PatternElementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_patternElement);
		int _la;
		try {
			int _alt;
			setState(193);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(179);
				nodePattern();
				setState(186);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
				while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(181);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==SP) {
							{
							setState(180);
							match(SP);
							}
						}

						setState(183);
						patternElementChain();
						}
						} 
					}
					setState(188);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
				}
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(189);
				match(T__2);
				setState(190);
				patternElement();
				setState(191);
				match(T__3);
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

	public static class NodePatternContext extends ParserRuleContext {
		public List<TerminalNode> SP() { return getTokens(CypherFragmentParser.SP); }
		public TerminalNode SP(int i) {
			return getToken(CypherFragmentParser.SP, i);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public NodeLabelsContext nodeLabels() {
			return getRuleContext(NodeLabelsContext.class,0);
		}
		public PropertiesContext properties() {
			return getRuleContext(PropertiesContext.class,0);
		}
		public NodePatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nodePattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CypherFragmentListener ) ((CypherFragmentListener)listener).enterNodePattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CypherFragmentListener ) ((CypherFragmentListener)listener).exitNodePattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CypherFragmentVisitor ) return ((CypherFragmentVisitor<? extends T>)visitor).visitNodePattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NodePatternContext nodePattern() throws RecognitionException {
		NodePatternContext _localctx = new NodePatternContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_nodePattern);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			match(T__2);
			setState(197);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SP) {
				{
				setState(196);
				match(SP);
				}
			}

			setState(203);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OR) | (1L << MATCH) | (1L << RETURN) | (1L << WHERE) | (1L << AND) | (1L << NOT) | (1L << TRUE) | (1L << FALSE) | (1L << UnescapedSymbolicName))) != 0)) {
				{
				setState(199);
				variable();
				setState(201);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SP) {
					{
					setState(200);
					match(SP);
					}
				}

				}
			}

			setState(209);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__6) {
				{
				setState(205);
				nodeLabels();
				setState(207);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SP) {
					{
					setState(206);
					match(SP);
					}
				}

				}
			}

			setState(215);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__10) {
				{
				setState(211);
				properties();
				setState(213);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SP) {
					{
					setState(212);
					match(SP);
					}
				}

				}
			}

			setState(217);
			match(T__3);
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

	public static class PatternElementChainContext extends ParserRuleContext {
		public RelationshipPatternContext relationshipPattern() {
			return getRuleContext(RelationshipPatternContext.class,0);
		}
		public NodePatternContext nodePattern() {
			return getRuleContext(NodePatternContext.class,0);
		}
		public TerminalNode SP() { return getToken(CypherFragmentParser.SP, 0); }
		public PatternElementChainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_patternElementChain; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CypherFragmentListener ) ((CypherFragmentListener)listener).enterPatternElementChain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CypherFragmentListener ) ((CypherFragmentListener)listener).exitPatternElementChain(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CypherFragmentVisitor ) return ((CypherFragmentVisitor<? extends T>)visitor).visitPatternElementChain(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PatternElementChainContext patternElementChain() throws RecognitionException {
		PatternElementChainContext _localctx = new PatternElementChainContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_patternElementChain);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(219);
			relationshipPattern();
			setState(221);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SP) {
				{
				setState(220);
				match(SP);
				}
			}

			setState(223);
			nodePattern();
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

	public static class RelationshipPatternContext extends ParserRuleContext {
		public LeftArrowHeadContext leftArrowHead() {
			return getRuleContext(LeftArrowHeadContext.class,0);
		}
		public List<DashContext> dash() {
			return getRuleContexts(DashContext.class);
		}
		public DashContext dash(int i) {
			return getRuleContext(DashContext.class,i);
		}
		public RightArrowHeadContext rightArrowHead() {
			return getRuleContext(RightArrowHeadContext.class,0);
		}
		public List<TerminalNode> SP() { return getTokens(CypherFragmentParser.SP); }
		public TerminalNode SP(int i) {
			return getToken(CypherFragmentParser.SP, i);
		}
		public RelationshipDetailContext relationshipDetail() {
			return getRuleContext(RelationshipDetailContext.class,0);
		}
		public RelationshipPatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationshipPattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CypherFragmentListener ) ((CypherFragmentListener)listener).enterRelationshipPattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CypherFragmentListener ) ((CypherFragmentListener)listener).exitRelationshipPattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CypherFragmentVisitor ) return ((CypherFragmentVisitor<? extends T>)visitor).visitRelationshipPattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationshipPatternContext relationshipPattern() throws RecognitionException {
		RelationshipPatternContext _localctx = new RelationshipPatternContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_relationshipPattern);
		int _la;
		try {
			setState(289);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(225);
				leftArrowHead();
				setState(227);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SP) {
					{
					setState(226);
					match(SP);
					}
				}

				setState(229);
				dash();
				setState(231);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
				case 1:
					{
					setState(230);
					match(SP);
					}
					break;
				}
				setState(234);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__4) {
					{
					setState(233);
					relationshipDetail();
					}
				}

				setState(237);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SP) {
					{
					setState(236);
					match(SP);
					}
				}

				setState(239);
				dash();
				setState(241);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SP) {
					{
					setState(240);
					match(SP);
					}
				}

				setState(243);
				rightArrowHead();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(245);
				leftArrowHead();
				setState(247);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SP) {
					{
					setState(246);
					match(SP);
					}
				}

				setState(249);
				dash();
				setState(251);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
				case 1:
					{
					setState(250);
					match(SP);
					}
					break;
				}
				setState(254);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__4) {
					{
					setState(253);
					relationshipDetail();
					}
				}

				setState(257);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SP) {
					{
					setState(256);
					match(SP);
					}
				}

				setState(259);
				dash();
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(261);
				dash();
				setState(263);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
				case 1:
					{
					setState(262);
					match(SP);
					}
					break;
				}
				setState(266);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__4) {
					{
					setState(265);
					relationshipDetail();
					}
				}

				setState(269);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SP) {
					{
					setState(268);
					match(SP);
					}
				}

				setState(271);
				dash();
				setState(273);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SP) {
					{
					setState(272);
					match(SP);
					}
				}

				setState(275);
				rightArrowHead();
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(277);
				dash();
				setState(279);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
				case 1:
					{
					setState(278);
					match(SP);
					}
					break;
				}
				setState(282);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__4) {
					{
					setState(281);
					relationshipDetail();
					}
				}

				setState(285);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SP) {
					{
					setState(284);
					match(SP);
					}
				}

				setState(287);
				dash();
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

	public static class RelationshipDetailContext extends ParserRuleContext {
		public List<TerminalNode> SP() { return getTokens(CypherFragmentParser.SP); }
		public TerminalNode SP(int i) {
			return getToken(CypherFragmentParser.SP, i);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public RelationshipTypesContext relationshipTypes() {
			return getRuleContext(RelationshipTypesContext.class,0);
		}
		public RangeLiteralContext rangeLiteral() {
			return getRuleContext(RangeLiteralContext.class,0);
		}
		public PropertiesContext properties() {
			return getRuleContext(PropertiesContext.class,0);
		}
		public RelationshipDetailContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationshipDetail; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CypherFragmentListener ) ((CypherFragmentListener)listener).enterRelationshipDetail(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CypherFragmentListener ) ((CypherFragmentListener)listener).exitRelationshipDetail(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CypherFragmentVisitor ) return ((CypherFragmentVisitor<? extends T>)visitor).visitRelationshipDetail(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationshipDetailContext relationshipDetail() throws RecognitionException {
		RelationshipDetailContext _localctx = new RelationshipDetailContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_relationshipDetail);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(291);
			match(T__4);
			setState(293);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SP) {
				{
				setState(292);
				match(SP);
				}
			}

			setState(299);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OR) | (1L << MATCH) | (1L << RETURN) | (1L << WHERE) | (1L << AND) | (1L << NOT) | (1L << TRUE) | (1L << FALSE) | (1L << UnescapedSymbolicName))) != 0)) {
				{
				setState(295);
				variable();
				setState(297);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SP) {
					{
					setState(296);
					match(SP);
					}
				}

				}
			}

			setState(305);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__6) {
				{
				setState(301);
				relationshipTypes();
				setState(303);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SP) {
					{
					setState(302);
					match(SP);
					}
				}

				}
			}

			setState(308);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__8) {
				{
				setState(307);
				rangeLiteral();
				}
			}

			setState(314);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__10) {
				{
				setState(310);
				properties();
				setState(312);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SP) {
					{
					setState(311);
					match(SP);
					}
				}

				}
			}

			setState(316);
			match(T__5);
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

	public static class PropertiesContext extends ParserRuleContext {
		public MapLiteralContext mapLiteral() {
			return getRuleContext(MapLiteralContext.class,0);
		}
		public PropertiesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_properties; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CypherFragmentListener ) ((CypherFragmentListener)listener).enterProperties(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CypherFragmentListener ) ((CypherFragmentListener)listener).exitProperties(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CypherFragmentVisitor ) return ((CypherFragmentVisitor<? extends T>)visitor).visitProperties(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertiesContext properties() throws RecognitionException {
		PropertiesContext _localctx = new PropertiesContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_properties);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(318);
			mapLiteral();
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

	public static class RelationshipTypesContext extends ParserRuleContext {
		public List<RelTypeNameContext> relTypeName() {
			return getRuleContexts(RelTypeNameContext.class);
		}
		public RelTypeNameContext relTypeName(int i) {
			return getRuleContext(RelTypeNameContext.class,i);
		}
		public List<TerminalNode> SP() { return getTokens(CypherFragmentParser.SP); }
		public TerminalNode SP(int i) {
			return getToken(CypherFragmentParser.SP, i);
		}
		public RelationshipTypesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationshipTypes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CypherFragmentListener ) ((CypherFragmentListener)listener).enterRelationshipTypes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CypherFragmentListener ) ((CypherFragmentListener)listener).exitRelationshipTypes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CypherFragmentVisitor ) return ((CypherFragmentVisitor<? extends T>)visitor).visitRelationshipTypes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationshipTypesContext relationshipTypes() throws RecognitionException {
		RelationshipTypesContext _localctx = new RelationshipTypesContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_relationshipTypes);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(320);
			match(T__6);
			setState(322);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SP) {
				{
				setState(321);
				match(SP);
				}
			}

			setState(324);
			relTypeName();
			setState(338);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(326);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SP) {
						{
						setState(325);
						match(SP);
						}
					}

					setState(328);
					match(T__7);
					setState(330);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__6) {
						{
						setState(329);
						match(T__6);
						}
					}

					setState(333);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SP) {
						{
						setState(332);
						match(SP);
						}
					}

					setState(335);
					relTypeName();
					}
					} 
				}
				setState(340);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
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

	public static class NodeLabelsContext extends ParserRuleContext {
		public List<NodeLabelContext> nodeLabel() {
			return getRuleContexts(NodeLabelContext.class);
		}
		public NodeLabelContext nodeLabel(int i) {
			return getRuleContext(NodeLabelContext.class,i);
		}
		public List<TerminalNode> SP() { return getTokens(CypherFragmentParser.SP); }
		public TerminalNode SP(int i) {
			return getToken(CypherFragmentParser.SP, i);
		}
		public NodeLabelsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nodeLabels; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CypherFragmentListener ) ((CypherFragmentListener)listener).enterNodeLabels(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CypherFragmentListener ) ((CypherFragmentListener)listener).exitNodeLabels(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CypherFragmentVisitor ) return ((CypherFragmentVisitor<? extends T>)visitor).visitNodeLabels(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NodeLabelsContext nodeLabels() throws RecognitionException {
		NodeLabelsContext _localctx = new NodeLabelsContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_nodeLabels);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(341);
			nodeLabel();
			setState(348);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(343);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SP) {
						{
						setState(342);
						match(SP);
						}
					}

					setState(345);
					nodeLabel();
					}
					} 
				}
				setState(350);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
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

	public static class NodeLabelContext extends ParserRuleContext {
		public LabelNameContext labelName() {
			return getRuleContext(LabelNameContext.class,0);
		}
		public TerminalNode SP() { return getToken(CypherFragmentParser.SP, 0); }
		public NodeLabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nodeLabel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CypherFragmentListener ) ((CypherFragmentListener)listener).enterNodeLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CypherFragmentListener ) ((CypherFragmentListener)listener).exitNodeLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CypherFragmentVisitor ) return ((CypherFragmentVisitor<? extends T>)visitor).visitNodeLabel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NodeLabelContext nodeLabel() throws RecognitionException {
		NodeLabelContext _localctx = new NodeLabelContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_nodeLabel);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(351);
			match(T__6);
			setState(353);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SP) {
				{
				setState(352);
				match(SP);
				}
			}

			setState(355);
			labelName();
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

	public static class RangeLiteralContext extends ParserRuleContext {
		public List<TerminalNode> SP() { return getTokens(CypherFragmentParser.SP); }
		public TerminalNode SP(int i) {
			return getToken(CypherFragmentParser.SP, i);
		}
		public List<IntegerLiteralContext> integerLiteral() {
			return getRuleContexts(IntegerLiteralContext.class);
		}
		public IntegerLiteralContext integerLiteral(int i) {
			return getRuleContext(IntegerLiteralContext.class,i);
		}
		public RangeLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rangeLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CypherFragmentListener ) ((CypherFragmentListener)listener).enterRangeLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CypherFragmentListener ) ((CypherFragmentListener)listener).exitRangeLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CypherFragmentVisitor ) return ((CypherFragmentVisitor<? extends T>)visitor).visitRangeLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RangeLiteralContext rangeLiteral() throws RecognitionException {
		RangeLiteralContext _localctx = new RangeLiteralContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_rangeLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(357);
			match(T__8);
			setState(359);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SP) {
				{
				setState(358);
				match(SP);
				}
			}

			setState(365);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DecimalInteger) {
				{
				setState(361);
				integerLiteral();
				setState(363);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SP) {
					{
					setState(362);
					match(SP);
					}
				}

				}
			}

			setState(377);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__9) {
				{
				setState(367);
				match(T__9);
				setState(369);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SP) {
					{
					setState(368);
					match(SP);
					}
				}

				setState(375);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DecimalInteger) {
					{
					setState(371);
					integerLiteral();
					setState(373);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SP) {
						{
						setState(372);
						match(SP);
						}
					}

					}
				}

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

	public static class LabelNameContext extends ParserRuleContext {
		public SymbolicNameContext symbolicName() {
			return getRuleContext(SymbolicNameContext.class,0);
		}
		public LabelNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labelName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CypherFragmentListener ) ((CypherFragmentListener)listener).enterLabelName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CypherFragmentListener ) ((CypherFragmentListener)listener).exitLabelName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CypherFragmentVisitor ) return ((CypherFragmentVisitor<? extends T>)visitor).visitLabelName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LabelNameContext labelName() throws RecognitionException {
		LabelNameContext _localctx = new LabelNameContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_labelName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(379);
			symbolicName();
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

	public static class RelTypeNameContext extends ParserRuleContext {
		public SymbolicNameContext symbolicName() {
			return getRuleContext(SymbolicNameContext.class,0);
		}
		public RelTypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relTypeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CypherFragmentListener ) ((CypherFragmentListener)listener).enterRelTypeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CypherFragmentListener ) ((CypherFragmentListener)listener).exitRelTypeName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CypherFragmentVisitor ) return ((CypherFragmentVisitor<? extends T>)visitor).visitRelTypeName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelTypeNameContext relTypeName() throws RecognitionException {
		RelTypeNameContext _localctx = new RelTypeNameContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_relTypeName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(381);
			symbolicName();
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

	public static class ExpressionContext extends ParserRuleContext {
		public List<Expression9Context> expression9() {
			return getRuleContexts(Expression9Context.class);
		}
		public Expression9Context expression9(int i) {
			return getRuleContext(Expression9Context.class,i);
		}
		public List<TerminalNode> SP() { return getTokens(CypherFragmentParser.SP); }
		public TerminalNode SP(int i) {
			return getToken(CypherFragmentParser.SP, i);
		}
		public List<TerminalNode> AND() { return getTokens(CypherFragmentParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(CypherFragmentParser.AND, i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CypherFragmentListener ) ((CypherFragmentListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CypherFragmentListener ) ((CypherFragmentListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CypherFragmentVisitor ) return ((CypherFragmentVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_expression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(383);
			expression9();
			setState(390);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(384);
					match(SP);
					setState(385);
					match(AND);
					setState(386);
					match(SP);
					setState(387);
					expression9();
					}
					} 
				}
				setState(392);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
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

	public static class Expression9Context extends ParserRuleContext {
		public Expression7Context expression7() {
			return getRuleContext(Expression7Context.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public List<TerminalNode> SP() { return getTokens(CypherFragmentParser.SP); }
		public TerminalNode SP(int i) {
			return getToken(CypherFragmentParser.SP, i);
		}
		public Expression9Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression9; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CypherFragmentListener ) ((CypherFragmentListener)listener).enterExpression9(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CypherFragmentListener ) ((CypherFragmentListener)listener).exitExpression9(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CypherFragmentVisitor ) return ((CypherFragmentVisitor<? extends T>)visitor).visitExpression9(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expression9Context expression9() throws RecognitionException {
		Expression9Context _localctx = new Expression9Context(_ctx, getState());
		enterRule(_localctx, 46, RULE_expression9);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(393);
			expression7();
			setState(402);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
			case 1:
				{
				setState(395);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SP) {
					{
					setState(394);
					match(SP);
					}
				}

				{
				setState(397);
				match(T__1);
				setState(399);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SP) {
					{
					setState(398);
					match(SP);
					}
				}

				setState(401);
				literal();
				}
				}
				break;
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

	public static class Expression7Context extends ParserRuleContext {
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public PropertyLookupContext propertyLookup() {
			return getRuleContext(PropertyLookupContext.class,0);
		}
		public LabelLookupContext labelLookup() {
			return getRuleContext(LabelLookupContext.class,0);
		}
		public TerminalNode SP() { return getToken(CypherFragmentParser.SP, 0); }
		public Expression7Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression7; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CypherFragmentListener ) ((CypherFragmentListener)listener).enterExpression7(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CypherFragmentListener ) ((CypherFragmentListener)listener).exitExpression7(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CypherFragmentVisitor ) return ((CypherFragmentVisitor<? extends T>)visitor).visitExpression7(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expression7Context expression7() throws RecognitionException {
		Expression7Context _localctx = new Expression7Context(_ctx, getState());
		enterRule(_localctx, 48, RULE_expression7);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(404);
			atom();
			setState(412);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
			case 1:
				{
				setState(406);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SP) {
					{
					setState(405);
					match(SP);
					}
				}

				setState(410);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__12:
					{
					setState(408);
					propertyLookup();
					}
					break;
				case T__6:
					{
					setState(409);
					labelLookup();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
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

	public static class AtomContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public ParenthesizedExpressionContext parenthesizedExpression() {
			return getRuleContext(ParenthesizedExpressionContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CypherFragmentListener ) ((CypherFragmentListener)listener).enterAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CypherFragmentListener ) ((CypherFragmentListener)listener).exitAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CypherFragmentVisitor ) return ((CypherFragmentVisitor<? extends T>)visitor).visitAtom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_atom);
		try {
			setState(417);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(414);
				literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(415);
				parenthesizedExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(416);
				variable();
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

	public static class LiteralContext extends ParserRuleContext {
		public NumberLiteralContext numberLiteral() {
			return getRuleContext(NumberLiteralContext.class,0);
		}
		public TerminalNode StringLiteral() { return getToken(CypherFragmentParser.StringLiteral, 0); }
		public BooleanLiteralContext booleanLiteral() {
			return getRuleContext(BooleanLiteralContext.class,0);
		}
		public TerminalNode NULL() { return getToken(CypherFragmentParser.NULL, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CypherFragmentListener ) ((CypherFragmentListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CypherFragmentListener ) ((CypherFragmentListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CypherFragmentVisitor ) return ((CypherFragmentVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_literal);
		try {
			setState(423);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DecimalInteger:
			case RegularDecimalReal:
				enterOuterAlt(_localctx, 1);
				{
				setState(419);
				numberLiteral();
				}
				break;
			case StringLiteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(420);
				match(StringLiteral);
				}
				break;
			case TRUE:
			case FALSE:
				enterOuterAlt(_localctx, 3);
				{
				setState(421);
				booleanLiteral();
				}
				break;
			case NULL:
				enterOuterAlt(_localctx, 4);
				{
				setState(422);
				match(NULL);
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

	public static class NumberLiteralContext extends ParserRuleContext {
		public DoubleLiteralContext doubleLiteral() {
			return getRuleContext(DoubleLiteralContext.class,0);
		}
		public IntegerLiteralContext integerLiteral() {
			return getRuleContext(IntegerLiteralContext.class,0);
		}
		public NumberLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numberLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CypherFragmentListener ) ((CypherFragmentListener)listener).enterNumberLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CypherFragmentListener ) ((CypherFragmentListener)listener).exitNumberLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CypherFragmentVisitor ) return ((CypherFragmentVisitor<? extends T>)visitor).visitNumberLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberLiteralContext numberLiteral() throws RecognitionException {
		NumberLiteralContext _localctx = new NumberLiteralContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_numberLiteral);
		try {
			setState(427);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RegularDecimalReal:
				enterOuterAlt(_localctx, 1);
				{
				setState(425);
				doubleLiteral();
				}
				break;
			case DecimalInteger:
				enterOuterAlt(_localctx, 2);
				{
				setState(426);
				integerLiteral();
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

	public static class BooleanLiteralContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(CypherFragmentParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(CypherFragmentParser.FALSE, 0); }
		public BooleanLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CypherFragmentListener ) ((CypherFragmentListener)listener).enterBooleanLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CypherFragmentListener ) ((CypherFragmentListener)listener).exitBooleanLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CypherFragmentVisitor ) return ((CypherFragmentVisitor<? extends T>)visitor).visitBooleanLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanLiteralContext booleanLiteral() throws RecognitionException {
		BooleanLiteralContext _localctx = new BooleanLiteralContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_booleanLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(429);
			_la = _input.LA(1);
			if ( !(_la==TRUE || _la==FALSE) ) {
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

	public static class MapLiteralContext extends ParserRuleContext {
		public List<TerminalNode> SP() { return getTokens(CypherFragmentParser.SP); }
		public TerminalNode SP(int i) {
			return getToken(CypherFragmentParser.SP, i);
		}
		public List<PropertyKeyNameContext> propertyKeyName() {
			return getRuleContexts(PropertyKeyNameContext.class);
		}
		public PropertyKeyNameContext propertyKeyName(int i) {
			return getRuleContext(PropertyKeyNameContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public MapLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mapLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CypherFragmentListener ) ((CypherFragmentListener)listener).enterMapLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CypherFragmentListener ) ((CypherFragmentListener)listener).exitMapLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CypherFragmentVisitor ) return ((CypherFragmentVisitor<? extends T>)visitor).visitMapLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MapLiteralContext mapLiteral() throws RecognitionException {
		MapLiteralContext _localctx = new MapLiteralContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_mapLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(431);
			match(T__10);
			setState(433);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SP) {
				{
				setState(432);
				match(SP);
				}
			}

			setState(468);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OR) | (1L << NULL) | (1L << MATCH) | (1L << RETURN) | (1L << WHERE) | (1L << AND) | (1L << NOT) | (1L << TRUE) | (1L << FALSE) | (1L << UnescapedSymbolicName))) != 0)) {
				{
				setState(435);
				propertyKeyName();
				setState(437);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SP) {
					{
					setState(436);
					match(SP);
					}
				}

				setState(439);
				match(T__6);
				setState(441);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SP) {
					{
					setState(440);
					match(SP);
					}
				}

				setState(443);
				expression();
				setState(445);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SP) {
					{
					setState(444);
					match(SP);
					}
				}

				setState(465);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(447);
					match(T__0);
					setState(449);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SP) {
						{
						setState(448);
						match(SP);
						}
					}

					setState(451);
					propertyKeyName();
					setState(453);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SP) {
						{
						setState(452);
						match(SP);
						}
					}

					setState(455);
					match(T__6);
					setState(457);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SP) {
						{
						setState(456);
						match(SP);
						}
					}

					setState(459);
					expression();
					setState(461);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SP) {
						{
						setState(460);
						match(SP);
						}
					}

					}
					}
					setState(467);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(470);
			match(T__11);
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

	public static class ParenthesizedExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<TerminalNode> SP() { return getTokens(CypherFragmentParser.SP); }
		public TerminalNode SP(int i) {
			return getToken(CypherFragmentParser.SP, i);
		}
		public ParenthesizedExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parenthesizedExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CypherFragmentListener ) ((CypherFragmentListener)listener).enterParenthesizedExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CypherFragmentListener ) ((CypherFragmentListener)listener).exitParenthesizedExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CypherFragmentVisitor ) return ((CypherFragmentVisitor<? extends T>)visitor).visitParenthesizedExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParenthesizedExpressionContext parenthesizedExpression() throws RecognitionException {
		ParenthesizedExpressionContext _localctx = new ParenthesizedExpressionContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_parenthesizedExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(472);
			match(T__2);
			setState(474);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SP) {
				{
				setState(473);
				match(SP);
				}
			}

			setState(476);
			expression();
			setState(478);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SP) {
				{
				setState(477);
				match(SP);
				}
			}

			setState(480);
			match(T__3);
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

	public static class PropertyLookupContext extends ParserRuleContext {
		public PropertyKeyNameContext propertyKeyName() {
			return getRuleContext(PropertyKeyNameContext.class,0);
		}
		public TerminalNode SP() { return getToken(CypherFragmentParser.SP, 0); }
		public PropertyLookupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyLookup; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CypherFragmentListener ) ((CypherFragmentListener)listener).enterPropertyLookup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CypherFragmentListener ) ((CypherFragmentListener)listener).exitPropertyLookup(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CypherFragmentVisitor ) return ((CypherFragmentVisitor<? extends T>)visitor).visitPropertyLookup(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyLookupContext propertyLookup() throws RecognitionException {
		PropertyLookupContext _localctx = new PropertyLookupContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_propertyLookup);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(482);
			match(T__12);
			setState(484);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SP) {
				{
				setState(483);
				match(SP);
				}
			}

			{
			setState(486);
			propertyKeyName();
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

	public static class LabelLookupContext extends ParserRuleContext {
		public SymbolicNameContext symbolicName() {
			return getRuleContext(SymbolicNameContext.class,0);
		}
		public TerminalNode SP() { return getToken(CypherFragmentParser.SP, 0); }
		public LabelLookupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labelLookup; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CypherFragmentListener ) ((CypherFragmentListener)listener).enterLabelLookup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CypherFragmentListener ) ((CypherFragmentListener)listener).exitLabelLookup(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CypherFragmentVisitor ) return ((CypherFragmentVisitor<? extends T>)visitor).visitLabelLookup(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LabelLookupContext labelLookup() throws RecognitionException {
		LabelLookupContext _localctx = new LabelLookupContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_labelLookup);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(488);
			match(T__6);
			setState(490);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SP) {
				{
				setState(489);
				match(SP);
				}
			}

			setState(492);
			symbolicName();
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

	public static class VariableContext extends ParserRuleContext {
		public SymbolicNameContext symbolicName() {
			return getRuleContext(SymbolicNameContext.class,0);
		}
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CypherFragmentListener ) ((CypherFragmentListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CypherFragmentListener ) ((CypherFragmentListener)listener).exitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CypherFragmentVisitor ) return ((CypherFragmentVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(494);
			symbolicName();
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

	public static class IntegerLiteralContext extends ParserRuleContext {
		public TerminalNode DecimalInteger() { return getToken(CypherFragmentParser.DecimalInteger, 0); }
		public IntegerLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integerLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CypherFragmentListener ) ((CypherFragmentListener)listener).enterIntegerLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CypherFragmentListener ) ((CypherFragmentListener)listener).exitIntegerLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CypherFragmentVisitor ) return ((CypherFragmentVisitor<? extends T>)visitor).visitIntegerLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntegerLiteralContext integerLiteral() throws RecognitionException {
		IntegerLiteralContext _localctx = new IntegerLiteralContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_integerLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(496);
			match(DecimalInteger);
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

	public static class PropertyKeyNameContext extends ParserRuleContext {
		public SchemaNameContext schemaName() {
			return getRuleContext(SchemaNameContext.class,0);
		}
		public PropertyKeyNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyKeyName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CypherFragmentListener ) ((CypherFragmentListener)listener).enterPropertyKeyName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CypherFragmentListener ) ((CypherFragmentListener)listener).exitPropertyKeyName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CypherFragmentVisitor ) return ((CypherFragmentVisitor<? extends T>)visitor).visitPropertyKeyName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyKeyNameContext propertyKeyName() throws RecognitionException {
		PropertyKeyNameContext _localctx = new PropertyKeyNameContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_propertyKeyName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(498);
			schemaName();
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

	public static class SchemaNameContext extends ParserRuleContext {
		public SymbolicNameContext symbolicName() {
			return getRuleContext(SymbolicNameContext.class,0);
		}
		public ReservedWordContext reservedWord() {
			return getRuleContext(ReservedWordContext.class,0);
		}
		public SchemaNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_schemaName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CypherFragmentListener ) ((CypherFragmentListener)listener).enterSchemaName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CypherFragmentListener ) ((CypherFragmentListener)listener).exitSchemaName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CypherFragmentVisitor ) return ((CypherFragmentVisitor<? extends T>)visitor).visitSchemaName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SchemaNameContext schemaName() throws RecognitionException {
		SchemaNameContext _localctx = new SchemaNameContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_schemaName);
		try {
			setState(502);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,94,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(500);
				symbolicName();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(501);
				reservedWord();
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

	public static class ReservedWordContext extends ParserRuleContext {
		public TerminalNode MATCH() { return getToken(CypherFragmentParser.MATCH, 0); }
		public TerminalNode RETURN() { return getToken(CypherFragmentParser.RETURN, 0); }
		public TerminalNode WHERE() { return getToken(CypherFragmentParser.WHERE, 0); }
		public TerminalNode AND() { return getToken(CypherFragmentParser.AND, 0); }
		public TerminalNode NOT() { return getToken(CypherFragmentParser.NOT, 0); }
		public TerminalNode FALSE() { return getToken(CypherFragmentParser.FALSE, 0); }
		public TerminalNode TRUE() { return getToken(CypherFragmentParser.TRUE, 0); }
		public TerminalNode NULL() { return getToken(CypherFragmentParser.NULL, 0); }
		public TerminalNode OR() { return getToken(CypherFragmentParser.OR, 0); }
		public ReservedWordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reservedWord; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CypherFragmentListener ) ((CypherFragmentListener)listener).enterReservedWord(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CypherFragmentListener ) ((CypherFragmentListener)listener).exitReservedWord(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CypherFragmentVisitor ) return ((CypherFragmentVisitor<? extends T>)visitor).visitReservedWord(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReservedWordContext reservedWord() throws RecognitionException {
		ReservedWordContext _localctx = new ReservedWordContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_reservedWord);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(504);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OR) | (1L << NULL) | (1L << MATCH) | (1L << RETURN) | (1L << WHERE) | (1L << AND) | (1L << NOT) | (1L << TRUE) | (1L << FALSE))) != 0)) ) {
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

	public static class DoubleLiteralContext extends ParserRuleContext {
		public TerminalNode RegularDecimalReal() { return getToken(CypherFragmentParser.RegularDecimalReal, 0); }
		public DoubleLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doubleLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CypherFragmentListener ) ((CypherFragmentListener)listener).enterDoubleLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CypherFragmentListener ) ((CypherFragmentListener)listener).exitDoubleLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CypherFragmentVisitor ) return ((CypherFragmentVisitor<? extends T>)visitor).visitDoubleLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DoubleLiteralContext doubleLiteral() throws RecognitionException {
		DoubleLiteralContext _localctx = new DoubleLiteralContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_doubleLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(506);
			match(RegularDecimalReal);
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

	public static class SymbolicNameContext extends ParserRuleContext {
		public TerminalNode UnescapedSymbolicName() { return getToken(CypherFragmentParser.UnescapedSymbolicName, 0); }
		public TerminalNode MATCH() { return getToken(CypherFragmentParser.MATCH, 0); }
		public TerminalNode RETURN() { return getToken(CypherFragmentParser.RETURN, 0); }
		public TerminalNode WHERE() { return getToken(CypherFragmentParser.WHERE, 0); }
		public TerminalNode OR() { return getToken(CypherFragmentParser.OR, 0); }
		public TerminalNode AND() { return getToken(CypherFragmentParser.AND, 0); }
		public TerminalNode NOT() { return getToken(CypherFragmentParser.NOT, 0); }
		public TerminalNode TRUE() { return getToken(CypherFragmentParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(CypherFragmentParser.FALSE, 0); }
		public SymbolicNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_symbolicName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CypherFragmentListener ) ((CypherFragmentListener)listener).enterSymbolicName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CypherFragmentListener ) ((CypherFragmentListener)listener).exitSymbolicName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CypherFragmentVisitor ) return ((CypherFragmentVisitor<? extends T>)visitor).visitSymbolicName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SymbolicNameContext symbolicName() throws RecognitionException {
		SymbolicNameContext _localctx = new SymbolicNameContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_symbolicName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(508);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OR) | (1L << MATCH) | (1L << RETURN) | (1L << WHERE) | (1L << AND) | (1L << NOT) | (1L << TRUE) | (1L << FALSE) | (1L << UnescapedSymbolicName))) != 0)) ) {
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

	public static class LeftArrowHeadContext extends ParserRuleContext {
		public LeftArrowHeadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_leftArrowHead; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CypherFragmentListener ) ((CypherFragmentListener)listener).enterLeftArrowHead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CypherFragmentListener ) ((CypherFragmentListener)listener).exitLeftArrowHead(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CypherFragmentVisitor ) return ((CypherFragmentVisitor<? extends T>)visitor).visitLeftArrowHead(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LeftArrowHeadContext leftArrowHead() throws RecognitionException {
		LeftArrowHeadContext _localctx = new LeftArrowHeadContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_leftArrowHead);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(510);
			match(T__13);
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

	public static class RightArrowHeadContext extends ParserRuleContext {
		public RightArrowHeadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rightArrowHead; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CypherFragmentListener ) ((CypherFragmentListener)listener).enterRightArrowHead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CypherFragmentListener ) ((CypherFragmentListener)listener).exitRightArrowHead(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CypherFragmentVisitor ) return ((CypherFragmentVisitor<? extends T>)visitor).visitRightArrowHead(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RightArrowHeadContext rightArrowHead() throws RecognitionException {
		RightArrowHeadContext _localctx = new RightArrowHeadContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_rightArrowHead);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(512);
			match(T__14);
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

	public static class DashContext extends ParserRuleContext {
		public DashContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dash; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CypherFragmentListener ) ((CypherFragmentListener)listener).enterDash(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CypherFragmentListener ) ((CypherFragmentListener)listener).exitDash(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CypherFragmentVisitor ) return ((CypherFragmentVisitor<? extends T>)visitor).visitDash(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DashContext dash() throws RecognitionException {
		DashContext _localctx = new DashContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_dash);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(514);
			match(T__15);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3*\u0207\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\3\2\3\2\3\3\3\3\5\3]\n\3\3\3\7\3`\n\3\f\3\16\3c\13\3\3\4\3\4\5\4"+
		"g\n\4\3\5\3\5\5\5k\n\5\3\5\3\5\5\5o\n\5\3\5\5\5r\n\5\3\6\3\6\3\6\5\6w"+
		"\n\6\3\6\3\6\5\6{\n\6\3\6\7\6~\n\6\f\6\16\6\u0081\13\6\3\6\3\6\5\6\u0085"+
		"\n\6\3\6\3\6\5\6\u0089\n\6\3\6\7\6\u008c\n\6\f\6\16\6\u008f\13\6\5\6\u0091"+
		"\n\6\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\5\t\u009b\n\t\3\t\3\t\5\t\u009f\n"+
		"\t\3\t\7\t\u00a2\n\t\f\t\16\t\u00a5\13\t\3\n\3\n\5\n\u00a9\n\n\3\n\3\n"+
		"\5\n\u00ad\n\n\3\n\3\n\3\n\5\n\u00b2\n\n\3\13\3\13\3\f\3\f\5\f\u00b8\n"+
		"\f\3\f\7\f\u00bb\n\f\f\f\16\f\u00be\13\f\3\f\3\f\3\f\3\f\5\f\u00c4\n\f"+
		"\3\r\3\r\5\r\u00c8\n\r\3\r\3\r\5\r\u00cc\n\r\5\r\u00ce\n\r\3\r\3\r\5\r"+
		"\u00d2\n\r\5\r\u00d4\n\r\3\r\3\r\5\r\u00d8\n\r\5\r\u00da\n\r\3\r\3\r\3"+
		"\16\3\16\5\16\u00e0\n\16\3\16\3\16\3\17\3\17\5\17\u00e6\n\17\3\17\3\17"+
		"\5\17\u00ea\n\17\3\17\5\17\u00ed\n\17\3\17\5\17\u00f0\n\17\3\17\3\17\5"+
		"\17\u00f4\n\17\3\17\3\17\3\17\3\17\5\17\u00fa\n\17\3\17\3\17\5\17\u00fe"+
		"\n\17\3\17\5\17\u0101\n\17\3\17\5\17\u0104\n\17\3\17\3\17\3\17\3\17\5"+
		"\17\u010a\n\17\3\17\5\17\u010d\n\17\3\17\5\17\u0110\n\17\3\17\3\17\5\17"+
		"\u0114\n\17\3\17\3\17\3\17\3\17\5\17\u011a\n\17\3\17\5\17\u011d\n\17\3"+
		"\17\5\17\u0120\n\17\3\17\3\17\5\17\u0124\n\17\3\20\3\20\5\20\u0128\n\20"+
		"\3\20\3\20\5\20\u012c\n\20\5\20\u012e\n\20\3\20\3\20\5\20\u0132\n\20\5"+
		"\20\u0134\n\20\3\20\5\20\u0137\n\20\3\20\3\20\5\20\u013b\n\20\5\20\u013d"+
		"\n\20\3\20\3\20\3\21\3\21\3\22\3\22\5\22\u0145\n\22\3\22\3\22\5\22\u0149"+
		"\n\22\3\22\3\22\5\22\u014d\n\22\3\22\5\22\u0150\n\22\3\22\7\22\u0153\n"+
		"\22\f\22\16\22\u0156\13\22\3\23\3\23\5\23\u015a\n\23\3\23\7\23\u015d\n"+
		"\23\f\23\16\23\u0160\13\23\3\24\3\24\5\24\u0164\n\24\3\24\3\24\3\25\3"+
		"\25\5\25\u016a\n\25\3\25\3\25\5\25\u016e\n\25\5\25\u0170\n\25\3\25\3\25"+
		"\5\25\u0174\n\25\3\25\3\25\5\25\u0178\n\25\5\25\u017a\n\25\5\25\u017c"+
		"\n\25\3\26\3\26\3\27\3\27\3\30\3\30\3\30\3\30\3\30\7\30\u0187\n\30\f\30"+
		"\16\30\u018a\13\30\3\31\3\31\5\31\u018e\n\31\3\31\3\31\5\31\u0192\n\31"+
		"\3\31\5\31\u0195\n\31\3\32\3\32\5\32\u0199\n\32\3\32\3\32\5\32\u019d\n"+
		"\32\5\32\u019f\n\32\3\33\3\33\3\33\5\33\u01a4\n\33\3\34\3\34\3\34\3\34"+
		"\5\34\u01aa\n\34\3\35\3\35\5\35\u01ae\n\35\3\36\3\36\3\37\3\37\5\37\u01b4"+
		"\n\37\3\37\3\37\5\37\u01b8\n\37\3\37\3\37\5\37\u01bc\n\37\3\37\3\37\5"+
		"\37\u01c0\n\37\3\37\3\37\5\37\u01c4\n\37\3\37\3\37\5\37\u01c8\n\37\3\37"+
		"\3\37\5\37\u01cc\n\37\3\37\3\37\5\37\u01d0\n\37\7\37\u01d2\n\37\f\37\16"+
		"\37\u01d5\13\37\5\37\u01d7\n\37\3\37\3\37\3 \3 \5 \u01dd\n \3 \3 \5 \u01e1"+
		"\n \3 \3 \3!\3!\5!\u01e7\n!\3!\3!\3\"\3\"\5\"\u01ed\n\"\3\"\3\"\3#\3#"+
		"\3$\3$\3%\3%\3&\3&\5&\u01f9\n&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3"+
		",\2\2-\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<"+
		">@BDFHJLNPRTV\2\5\3\2#$\4\2\33\34\36$\4\2\33\33\36%\2\u023f\2X\3\2\2\2"+
		"\4Z\3\2\2\2\6f\3\2\2\2\bh\3\2\2\2\n\u0090\3\2\2\2\f\u0092\3\2\2\2\16\u0094"+
		"\3\2\2\2\20\u0098\3\2\2\2\22\u00b1\3\2\2\2\24\u00b3\3\2\2\2\26\u00c3\3"+
		"\2\2\2\30\u00c5\3\2\2\2\32\u00dd\3\2\2\2\34\u0123\3\2\2\2\36\u0125\3\2"+
		"\2\2 \u0140\3\2\2\2\"\u0142\3\2\2\2$\u0157\3\2\2\2&\u0161\3\2\2\2(\u0167"+
		"\3\2\2\2*\u017d\3\2\2\2,\u017f\3\2\2\2.\u0181\3\2\2\2\60\u018b\3\2\2\2"+
		"\62\u0196\3\2\2\2\64\u01a3\3\2\2\2\66\u01a9\3\2\2\28\u01ad\3\2\2\2:\u01af"+
		"\3\2\2\2<\u01b1\3\2\2\2>\u01da\3\2\2\2@\u01e4\3\2\2\2B\u01ea\3\2\2\2D"+
		"\u01f0\3\2\2\2F\u01f2\3\2\2\2H\u01f4\3\2\2\2J\u01f8\3\2\2\2L\u01fa\3\2"+
		"\2\2N\u01fc\3\2\2\2P\u01fe\3\2\2\2R\u0200\3\2\2\2T\u0202\3\2\2\2V\u0204"+
		"\3\2\2\2XY\5\4\3\2Y\3\3\2\2\2Za\5\6\4\2[]\7(\2\2\\[\3\2\2\2\\]\3\2\2\2"+
		"]^\3\2\2\2^`\5\6\4\2_\\\3\2\2\2`c\3\2\2\2a_\3\2\2\2ab\3\2\2\2b\5\3\2\2"+
		"\2ca\3\2\2\2dg\5\b\5\2eg\5\n\6\2fd\3\2\2\2fe\3\2\2\2g\7\3\2\2\2hj\7\36"+
		"\2\2ik\7(\2\2ji\3\2\2\2jk\3\2\2\2kl\3\2\2\2lq\5\20\t\2mo\7(\2\2nm\3\2"+
		"\2\2no\3\2\2\2op\3\2\2\2pr\5\16\b\2qn\3\2\2\2qr\3\2\2\2r\t\3\2\2\2st\7"+
		"\37\2\2t\177\7(\2\2uw\7(\2\2vu\3\2\2\2vw\3\2\2\2wx\3\2\2\2xz\7\3\2\2y"+
		"{\7(\2\2zy\3\2\2\2z{\3\2\2\2{|\3\2\2\2|~\5\f\7\2}v\3\2\2\2~\u0081\3\2"+
		"\2\2\177}\3\2\2\2\177\u0080\3\2\2\2\u0080\u0091\3\2\2\2\u0081\177\3\2"+
		"\2\2\u0082\u008d\5\f\7\2\u0083\u0085\7(\2\2\u0084\u0083\3\2\2\2\u0084"+
		"\u0085\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0088\7\3\2\2\u0087\u0089\7("+
		"\2\2\u0088\u0087\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u008a\3\2\2\2\u008a"+
		"\u008c\5\f\7\2\u008b\u0084\3\2\2\2\u008c\u008f\3\2\2\2\u008d\u008b\3\2"+
		"\2\2\u008d\u008e\3\2\2\2\u008e\u0091\3\2\2\2\u008f\u008d\3\2\2\2\u0090"+
		"s\3\2\2\2\u0090\u0082\3\2\2\2\u0091\13\3\2\2\2\u0092\u0093\5.\30\2\u0093"+
		"\r\3\2\2\2\u0094\u0095\7 \2\2\u0095\u0096\7(\2\2\u0096\u0097\5.\30\2\u0097"+
		"\17\3\2\2\2\u0098\u00a3\5\22\n\2\u0099\u009b\7(\2\2\u009a\u0099\3\2\2"+
		"\2\u009a\u009b\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u009e\7\3\2\2\u009d\u009f"+
		"\7(\2\2\u009e\u009d\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0"+
		"\u00a2\5\22\n\2\u00a1\u009a\3\2\2\2\u00a2\u00a5\3\2\2\2\u00a3\u00a1\3"+
		"\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\21\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a6"+
		"\u00a8\5D#\2\u00a7\u00a9\7(\2\2\u00a8\u00a7\3\2\2\2\u00a8\u00a9\3\2\2"+
		"\2\u00a9\u00aa\3\2\2\2\u00aa\u00ac\7\4\2\2\u00ab\u00ad\7(\2\2\u00ac\u00ab"+
		"\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00af\5\24\13\2"+
		"\u00af\u00b2\3\2\2\2\u00b0\u00b2\5\24\13\2\u00b1\u00a6\3\2\2\2\u00b1\u00b0"+
		"\3\2\2\2\u00b2\23\3\2\2\2\u00b3\u00b4\5\26\f\2\u00b4\25\3\2\2\2\u00b5"+
		"\u00bc\5\30\r\2\u00b6\u00b8\7(\2\2\u00b7\u00b6\3\2\2\2\u00b7\u00b8\3\2"+
		"\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00bb\5\32\16\2\u00ba\u00b7\3\2\2\2\u00bb"+
		"\u00be\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00c4\3\2"+
		"\2\2\u00be\u00bc\3\2\2\2\u00bf\u00c0\7\5\2\2\u00c0\u00c1\5\26\f\2\u00c1"+
		"\u00c2\7\6\2\2\u00c2\u00c4\3\2\2\2\u00c3\u00b5\3\2\2\2\u00c3\u00bf\3\2"+
		"\2\2\u00c4\27\3\2\2\2\u00c5\u00c7\7\5\2\2\u00c6\u00c8\7(\2\2\u00c7\u00c6"+
		"\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00cd\3\2\2\2\u00c9\u00cb\5D#\2\u00ca"+
		"\u00cc\7(\2\2\u00cb\u00ca\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00ce\3\2"+
		"\2\2\u00cd\u00c9\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00d3\3\2\2\2\u00cf"+
		"\u00d1\5$\23\2\u00d0\u00d2\7(\2\2\u00d1\u00d0\3\2\2\2\u00d1\u00d2\3\2"+
		"\2\2\u00d2\u00d4\3\2\2\2\u00d3\u00cf\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4"+
		"\u00d9\3\2\2\2\u00d5\u00d7\5 \21\2\u00d6\u00d8\7(\2\2\u00d7\u00d6\3\2"+
		"\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00da\3\2\2\2\u00d9\u00d5\3\2\2\2\u00d9"+
		"\u00da\3\2\2\2\u00da\u00db\3\2\2\2\u00db\u00dc\7\6\2\2\u00dc\31\3\2\2"+
		"\2\u00dd\u00df\5\34\17\2\u00de\u00e0\7(\2\2\u00df\u00de\3\2\2\2\u00df"+
		"\u00e0\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\u00e2\5\30\r\2\u00e2\33\3\2\2"+
		"\2\u00e3\u00e5\5R*\2\u00e4\u00e6\7(\2\2\u00e5\u00e4\3\2\2\2\u00e5\u00e6"+
		"\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7\u00e9\5V,\2\u00e8\u00ea\7(\2\2\u00e9"+
		"\u00e8\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00ec\3\2\2\2\u00eb\u00ed\5\36"+
		"\20\2\u00ec\u00eb\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed\u00ef\3\2\2\2\u00ee"+
		"\u00f0\7(\2\2\u00ef\u00ee\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0\u00f1\3\2"+
		"\2\2\u00f1\u00f3\5V,\2\u00f2\u00f4\7(\2\2\u00f3\u00f2\3\2\2\2\u00f3\u00f4"+
		"\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5\u00f6\5T+\2\u00f6\u0124\3\2\2\2\u00f7"+
		"\u00f9\5R*\2\u00f8\u00fa\7(\2\2\u00f9\u00f8\3\2\2\2\u00f9\u00fa\3\2\2"+
		"\2\u00fa\u00fb\3\2\2\2\u00fb\u00fd\5V,\2\u00fc\u00fe\7(\2\2\u00fd\u00fc"+
		"\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe\u0100\3\2\2\2\u00ff\u0101\5\36\20\2"+
		"\u0100\u00ff\3\2\2\2\u0100\u0101\3\2\2\2\u0101\u0103\3\2\2\2\u0102\u0104"+
		"\7(\2\2\u0103\u0102\3\2\2\2\u0103\u0104\3\2\2\2\u0104\u0105\3\2\2\2\u0105"+
		"\u0106\5V,\2\u0106\u0124\3\2\2\2\u0107\u0109\5V,\2\u0108\u010a\7(\2\2"+
		"\u0109\u0108\3\2\2\2\u0109\u010a\3\2\2\2\u010a\u010c\3\2\2\2\u010b\u010d"+
		"\5\36\20\2\u010c\u010b\3\2\2\2\u010c\u010d\3\2\2\2\u010d\u010f\3\2\2\2"+
		"\u010e\u0110\7(\2\2\u010f\u010e\3\2\2\2\u010f\u0110\3\2\2\2\u0110\u0111"+
		"\3\2\2\2\u0111\u0113\5V,\2\u0112\u0114\7(\2\2\u0113\u0112\3\2\2\2\u0113"+
		"\u0114\3\2\2\2\u0114\u0115\3\2\2\2\u0115\u0116\5T+\2\u0116\u0124\3\2\2"+
		"\2\u0117\u0119\5V,\2\u0118\u011a\7(\2\2\u0119\u0118\3\2\2\2\u0119\u011a"+
		"\3\2\2\2\u011a\u011c\3\2\2\2\u011b\u011d\5\36\20\2\u011c\u011b\3\2\2\2"+
		"\u011c\u011d\3\2\2\2\u011d\u011f\3\2\2\2\u011e\u0120\7(\2\2\u011f\u011e"+
		"\3\2\2\2\u011f\u0120\3\2\2\2\u0120\u0121\3\2\2\2\u0121\u0122\5V,\2\u0122"+
		"\u0124\3\2\2\2\u0123\u00e3\3\2\2\2\u0123\u00f7\3\2\2\2\u0123\u0107\3\2"+
		"\2\2\u0123\u0117\3\2\2\2\u0124\35\3\2\2\2\u0125\u0127\7\7\2\2\u0126\u0128"+
		"\7(\2\2\u0127\u0126\3\2\2\2\u0127\u0128\3\2\2\2\u0128\u012d\3\2\2\2\u0129"+
		"\u012b\5D#\2\u012a\u012c\7(\2\2\u012b\u012a\3\2\2\2\u012b\u012c\3\2\2"+
		"\2\u012c\u012e\3\2\2\2\u012d\u0129\3\2\2\2\u012d\u012e\3\2\2\2\u012e\u0133"+
		"\3\2\2\2\u012f\u0131\5\"\22\2\u0130\u0132\7(\2\2\u0131\u0130\3\2\2\2\u0131"+
		"\u0132\3\2\2\2\u0132\u0134\3\2\2\2\u0133\u012f\3\2\2\2\u0133\u0134\3\2"+
		"\2\2\u0134\u0136\3\2\2\2\u0135\u0137\5(\25\2\u0136\u0135\3\2\2\2\u0136"+
		"\u0137\3\2\2\2\u0137\u013c\3\2\2\2\u0138\u013a\5 \21\2\u0139\u013b\7("+
		"\2\2\u013a\u0139\3\2\2\2\u013a\u013b\3\2\2\2\u013b\u013d\3\2\2\2\u013c"+
		"\u0138\3\2\2\2\u013c\u013d\3\2\2\2\u013d\u013e\3\2\2\2\u013e\u013f\7\b"+
		"\2\2\u013f\37\3\2\2\2\u0140\u0141\5<\37\2\u0141!\3\2\2\2\u0142\u0144\7"+
		"\t\2\2\u0143\u0145\7(\2\2\u0144\u0143\3\2\2\2\u0144\u0145\3\2\2\2\u0145"+
		"\u0146\3\2\2\2\u0146\u0154\5,\27\2\u0147\u0149\7(\2\2\u0148\u0147\3\2"+
		"\2\2\u0148\u0149\3\2\2\2\u0149\u014a\3\2\2\2\u014a\u014c\7\n\2\2\u014b"+
		"\u014d\7\t\2\2\u014c\u014b\3\2\2\2\u014c\u014d\3\2\2\2\u014d\u014f\3\2"+
		"\2\2\u014e\u0150\7(\2\2\u014f\u014e\3\2\2\2\u014f\u0150\3\2\2\2\u0150"+
		"\u0151\3\2\2\2\u0151\u0153\5,\27\2\u0152\u0148\3\2\2\2\u0153\u0156\3\2"+
		"\2\2\u0154\u0152\3\2\2\2\u0154\u0155\3\2\2\2\u0155#\3\2\2\2\u0156\u0154"+
		"\3\2\2\2\u0157\u015e\5&\24\2\u0158\u015a\7(\2\2\u0159\u0158\3\2\2\2\u0159"+
		"\u015a\3\2\2\2\u015a\u015b\3\2\2\2\u015b\u015d\5&\24\2\u015c\u0159\3\2"+
		"\2\2\u015d\u0160\3\2\2\2\u015e\u015c\3\2\2\2\u015e\u015f\3\2\2\2\u015f"+
		"%\3\2\2\2\u0160\u015e\3\2\2\2\u0161\u0163\7\t\2\2\u0162\u0164\7(\2\2\u0163"+
		"\u0162\3\2\2\2\u0163\u0164\3\2\2\2\u0164\u0165\3\2\2\2\u0165\u0166\5*"+
		"\26\2\u0166\'\3\2\2\2\u0167\u0169\7\13\2\2\u0168\u016a\7(\2\2\u0169\u0168"+
		"\3\2\2\2\u0169\u016a\3\2\2\2\u016a\u016f\3\2\2\2\u016b\u016d\5F$\2\u016c"+
		"\u016e\7(\2\2\u016d\u016c\3\2\2\2\u016d\u016e\3\2\2\2\u016e\u0170\3\2"+
		"\2\2\u016f\u016b\3\2\2\2\u016f\u0170\3\2\2\2\u0170\u017b\3\2\2\2\u0171"+
		"\u0173\7\f\2\2\u0172\u0174\7(\2\2\u0173\u0172\3\2\2\2\u0173\u0174\3\2"+
		"\2\2\u0174\u0179\3\2\2\2\u0175\u0177\5F$\2\u0176\u0178\7(\2\2\u0177\u0176"+
		"\3\2\2\2\u0177\u0178\3\2\2\2\u0178\u017a\3\2\2\2\u0179\u0175\3\2\2\2\u0179"+
		"\u017a\3\2\2\2\u017a\u017c\3\2\2\2\u017b\u0171\3\2\2\2\u017b\u017c\3\2"+
		"\2\2\u017c)\3\2\2\2\u017d\u017e\5P)\2\u017e+\3\2\2\2\u017f\u0180\5P)\2"+
		"\u0180-\3\2\2\2\u0181\u0188\5\60\31\2\u0182\u0183\7(\2\2\u0183\u0184\7"+
		"!\2\2\u0184\u0185\7(\2\2\u0185\u0187\5\60\31\2\u0186\u0182\3\2\2\2\u0187"+
		"\u018a\3\2\2\2\u0188\u0186\3\2\2\2\u0188\u0189\3\2\2\2\u0189/\3\2\2\2"+
		"\u018a\u0188\3\2\2\2\u018b\u0194\5\62\32\2\u018c\u018e\7(\2\2\u018d\u018c"+
		"\3\2\2\2\u018d\u018e\3\2\2\2\u018e\u018f\3\2\2\2\u018f\u0191\7\4\2\2\u0190"+
		"\u0192\7(\2\2\u0191\u0190\3\2\2\2\u0191\u0192\3\2\2\2\u0192\u0193\3\2"+
		"\2\2\u0193\u0195\5\66\34\2\u0194\u018d\3\2\2\2\u0194\u0195\3\2\2\2\u0195"+
		"\61\3\2\2\2\u0196\u019e\5\64\33\2\u0197\u0199\7(\2\2\u0198\u0197\3\2\2"+
		"\2\u0198\u0199\3\2\2\2\u0199\u019c\3\2\2\2\u019a\u019d\5@!\2\u019b\u019d"+
		"\5B\"\2\u019c\u019a\3\2\2\2\u019c\u019b\3\2\2\2\u019d\u019f\3\2\2\2\u019e"+
		"\u0198\3\2\2\2\u019e\u019f\3\2\2\2\u019f\63\3\2\2\2\u01a0\u01a4\5\66\34"+
		"\2\u01a1\u01a4\5> \2\u01a2\u01a4\5D#\2\u01a3\u01a0\3\2\2\2\u01a3\u01a1"+
		"\3\2\2\2\u01a3\u01a2\3\2\2\2\u01a4\65\3\2\2\2\u01a5\u01aa\58\35\2\u01a6"+
		"\u01aa\7\23\2\2\u01a7\u01aa\5:\36\2\u01a8\u01aa\7\34\2\2\u01a9\u01a5\3"+
		"\2\2\2\u01a9\u01a6\3\2\2\2\u01a9\u01a7\3\2\2\2\u01a9\u01a8\3\2\2\2\u01aa"+
		"\67\3\2\2\2\u01ab\u01ae\5N(\2\u01ac\u01ae\5F$\2\u01ad\u01ab\3\2\2\2\u01ad"+
		"\u01ac\3\2\2\2\u01ae9\3\2\2\2\u01af\u01b0\t\2\2\2\u01b0;\3\2\2\2\u01b1"+
		"\u01b3\7\r\2\2\u01b2\u01b4\7(\2\2\u01b3\u01b2\3\2\2\2\u01b3\u01b4\3\2"+
		"\2\2\u01b4\u01d6\3\2\2\2\u01b5\u01b7\5H%\2\u01b6\u01b8\7(\2\2\u01b7\u01b6"+
		"\3\2\2\2\u01b7\u01b8\3\2\2\2\u01b8\u01b9\3\2\2\2\u01b9\u01bb\7\t\2\2\u01ba"+
		"\u01bc\7(\2\2\u01bb\u01ba\3\2\2\2\u01bb\u01bc\3\2\2\2\u01bc\u01bd\3\2"+
		"\2\2\u01bd\u01bf\5.\30\2\u01be\u01c0\7(\2\2\u01bf\u01be\3\2\2\2\u01bf"+
		"\u01c0\3\2\2\2\u01c0\u01d3\3\2\2\2\u01c1\u01c3\7\3\2\2\u01c2\u01c4\7("+
		"\2\2\u01c3\u01c2\3\2\2\2\u01c3\u01c4\3\2\2\2\u01c4\u01c5\3\2\2\2\u01c5"+
		"\u01c7\5H%\2\u01c6\u01c8\7(\2\2\u01c7\u01c6\3\2\2\2\u01c7\u01c8\3\2\2"+
		"\2\u01c8\u01c9\3\2\2\2\u01c9\u01cb\7\t\2\2\u01ca\u01cc\7(\2\2\u01cb\u01ca"+
		"\3\2\2\2\u01cb\u01cc\3\2\2\2\u01cc\u01cd\3\2\2\2\u01cd\u01cf\5.\30\2\u01ce"+
		"\u01d0\7(\2\2\u01cf\u01ce\3\2\2\2\u01cf\u01d0\3\2\2\2\u01d0\u01d2\3\2"+
		"\2\2\u01d1\u01c1\3\2\2\2\u01d2\u01d5\3\2\2\2\u01d3\u01d1\3\2\2\2\u01d3"+
		"\u01d4\3\2\2\2\u01d4\u01d7\3\2\2\2\u01d5\u01d3\3\2\2\2\u01d6\u01b5\3\2"+
		"\2\2\u01d6\u01d7\3\2\2\2\u01d7\u01d8\3\2\2\2\u01d8\u01d9\7\16\2\2\u01d9"+
		"=\3\2\2\2\u01da\u01dc\7\5\2\2\u01db\u01dd\7(\2\2\u01dc\u01db\3\2\2\2\u01dc"+
		"\u01dd\3\2\2\2\u01dd\u01de\3\2\2\2\u01de\u01e0\5.\30\2\u01df\u01e1\7("+
		"\2\2\u01e0\u01df\3\2\2\2\u01e0\u01e1\3\2\2\2\u01e1\u01e2\3\2\2\2\u01e2"+
		"\u01e3\7\6\2\2\u01e3?\3\2\2\2\u01e4\u01e6\7\17\2\2\u01e5\u01e7\7(\2\2"+
		"\u01e6\u01e5\3\2\2\2\u01e6\u01e7\3\2\2\2\u01e7\u01e8\3\2\2\2\u01e8\u01e9"+
		"\5H%\2\u01e9A\3\2\2\2\u01ea\u01ec\7\t\2\2\u01eb\u01ed\7(\2\2\u01ec\u01eb"+
		"\3\2\2\2\u01ec\u01ed\3\2\2\2\u01ed\u01ee\3\2\2\2\u01ee\u01ef\5P)\2\u01ef"+
		"C\3\2\2\2\u01f0\u01f1\5P)\2\u01f1E\3\2\2\2\u01f2\u01f3\7\24\2\2\u01f3"+
		"G\3\2\2\2\u01f4\u01f5\5J&\2\u01f5I\3\2\2\2\u01f6\u01f9\5P)\2\u01f7\u01f9"+
		"\5L\'\2\u01f8\u01f6\3\2\2\2\u01f8\u01f7\3\2\2\2\u01f9K\3\2\2\2\u01fa\u01fb"+
		"\t\3\2\2\u01fbM\3\2\2\2\u01fc\u01fd\7\32\2\2\u01fdO\3\2\2\2\u01fe\u01ff"+
		"\t\4\2\2\u01ffQ\3\2\2\2\u0200\u0201\7\20\2\2\u0201S\3\2\2\2\u0202\u0203"+
		"\7\21\2\2\u0203U\3\2\2\2\u0204\u0205\7\22\2\2\u0205W\3\2\2\2a\\afjnqv"+
		"z\177\u0084\u0088\u008d\u0090\u009a\u009e\u00a3\u00a8\u00ac\u00b1\u00b7"+
		"\u00bc\u00c3\u00c7\u00cb\u00cd\u00d1\u00d3\u00d7\u00d9\u00df\u00e5\u00e9"+
		"\u00ec\u00ef\u00f3\u00f9\u00fd\u0100\u0103\u0109\u010c\u010f\u0113\u0119"+
		"\u011c\u011f\u0123\u0127\u012b\u012d\u0131\u0133\u0136\u013a\u013c\u0144"+
		"\u0148\u014c\u014f\u0154\u0159\u015e\u0163\u0169\u016d\u016f\u0173\u0177"+
		"\u0179\u017b\u0188\u018d\u0191\u0194\u0198\u019c\u019e\u01a3\u01a9\u01ad"+
		"\u01b3\u01b7\u01bb\u01bf\u01c3\u01c7\u01cb\u01cf\u01d3\u01d6\u01dc\u01e0"+
		"\u01e6\u01ec\u01f8";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}