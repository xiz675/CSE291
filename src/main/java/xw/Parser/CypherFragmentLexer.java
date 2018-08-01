package xw.Parser;// Generated from /home/kyliu/IdeaProjects/graphTest/src/main/antlr/CypherFragment.g4 by ANTLR 4.7
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CypherFragmentLexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "StringLiteral", 
		"DecimalInteger", "Digit", "NonZeroDigit", "NonZeroOctDigit", "OctDigit", 
		"ZeroDigit", "RegularDecimalReal", "OR", "NULL", "COUNT", "MATCH", "RETURN", 
		"WHERE", "AND", "NOT", "TRUE", "FALSE", "UnescapedSymbolicName", "IdentifierStart", 
		"IdentifierPart", "SP", "WHITESPACE", "Comment", "FF", "RS", "ID_Continue", 
		"Comment_1", "Comment_3", "Comment_2", "GS", "FS", "CR", "SPACE", "TAB", 
		"StringLiteral_0", "LF", "VT", "US", "ID_Start"
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


	public CypherFragmentLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "CypherFragment.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2*\u0156\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\3\2\3\2\3\3\3\3\3\4\3\4"+
		"\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\f\3"+
		"\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\7\22\u0097"+
		"\n\22\f\22\16\22\u009a\13\22\3\22\3\22\3\23\3\23\3\23\7\23\u00a1\n\23"+
		"\f\23\16\23\u00a4\13\23\5\23\u00a6\n\23\3\24\3\24\5\24\u00aa\n\24\3\25"+
		"\3\25\5\25\u00ae\n\25\3\26\3\26\3\27\3\27\5\27\u00b4\n\27\3\30\3\30\3"+
		"\31\7\31\u00b9\n\31\f\31\16\31\u00bc\13\31\3\31\3\31\6\31\u00c0\n\31\r"+
		"\31\16\31\u00c1\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3!\3!\3!\3!\3\"\3"+
		"\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3$\3$\7$\u00fa\n$\f$\16$\u00fd\13$\3"+
		"%\3%\5%\u0101\n%\3&\3&\3\'\6\'\u0106\n\'\r\'\16\'\u0107\3(\3(\3(\3(\3"+
		"(\3(\3(\3(\3(\3(\3(\3(\5(\u0116\n(\3)\3)\3)\3)\3)\3)\7)\u011e\n)\f)\16"+
		")\u0121\13)\3)\3)\3)\3)\3)\3)\7)\u0129\n)\f)\16)\u012c\13)\3)\5)\u012f"+
		"\n)\3)\3)\5)\u0133\n)\5)\u0135\n)\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/"+
		"\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64\3\65\3\65\3\66\3\66"+
		"\3\67\3\67\38\38\39\39\2\2:\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25"+
		"\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32"+
		"\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S\2U\2W\2Y\2[\2]\2_"+
		"\2a\2c\2e\2g\2i\2k\2m\2o\2q\2\3\2#\4\2QQqq\4\2TTtt\4\2PPpp\4\2WWww\4\2"+
		"NNnn\4\2EEee\4\2VVvv\4\2OOoo\4\2CCcc\4\2JJjj\4\2GGgg\4\2YYyy\4\2FFff\4"+
		"\2HHhh\4\2UUuu\b\2aa\u2041\u2042\u2056\u2056\ufe35\ufe36\ufe4f\ufe51\uff41"+
		"\uff41\n\2\"\"\u1682\u1682\u1810\u1810\u2002\u200c\u202a\u202b\u2031\u2031"+
		"\u2061\u2061\u3002\u3002\3\2\16\16\3\2  \6\2\62;C\\aac|\4\2\2+-\1\5\2"+
		"\2\13\r\16\20\1\4\2\2\60\62\1\3\2\37\37\3\2\36\36\3\2\17\17\3\2\"\"\3"+
		"\2\13\13\5\2\2#%]_\1\3\2\f\f\3\2\r\r\3\2!!\4\2C\\c|\2\u0161\2\3\3\2\2"+
		"\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3"+
		"\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2"+
		"\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2"+
		"\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2"+
		"\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3"+
		"\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2"+
		"\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\3s\3\2\2\2\5u\3\2\2\2\7"+
		"w\3\2\2\2\ty\3\2\2\2\13{\3\2\2\2\r}\3\2\2\2\17\177\3\2\2\2\21\u0081\3"+
		"\2\2\2\23\u0083\3\2\2\2\25\u0085\3\2\2\2\27\u0088\3\2\2\2\31\u008a\3\2"+
		"\2\2\33\u008c\3\2\2\2\35\u008e\3\2\2\2\37\u0090\3\2\2\2!\u0092\3\2\2\2"+
		"#\u0094\3\2\2\2%\u00a5\3\2\2\2\'\u00a9\3\2\2\2)\u00ad\3\2\2\2+\u00af\3"+
		"\2\2\2-\u00b3\3\2\2\2/\u00b5\3\2\2\2\61\u00ba\3\2\2\2\63\u00c3\3\2\2\2"+
		"\65\u00c6\3\2\2\2\67\u00cb\3\2\2\29\u00d1\3\2\2\2;\u00d7\3\2\2\2=\u00de"+
		"\3\2\2\2?\u00e4\3\2\2\2A\u00e8\3\2\2\2C\u00ec\3\2\2\2E\u00f1\3\2\2\2G"+
		"\u00f7\3\2\2\2I\u0100\3\2\2\2K\u0102\3\2\2\2M\u0105\3\2\2\2O\u0115\3\2"+
		"\2\2Q\u0134\3\2\2\2S\u0136\3\2\2\2U\u0138\3\2\2\2W\u013a\3\2\2\2Y\u013c"+
		"\3\2\2\2[\u013e\3\2\2\2]\u0140\3\2\2\2_\u0142\3\2\2\2a\u0144\3\2\2\2c"+
		"\u0146\3\2\2\2e\u0148\3\2\2\2g\u014a\3\2\2\2i\u014c\3\2\2\2k\u014e\3\2"+
		"\2\2m\u0150\3\2\2\2o\u0152\3\2\2\2q\u0154\3\2\2\2st\7.\2\2t\4\3\2\2\2"+
		"uv\7?\2\2v\6\3\2\2\2wx\7*\2\2x\b\3\2\2\2yz\7+\2\2z\n\3\2\2\2{|\7]\2\2"+
		"|\f\3\2\2\2}~\7_\2\2~\16\3\2\2\2\177\u0080\7<\2\2\u0080\20\3\2\2\2\u0081"+
		"\u0082\7~\2\2\u0082\22\3\2\2\2\u0083\u0084\7,\2\2\u0084\24\3\2\2\2\u0085"+
		"\u0086\7\60\2\2\u0086\u0087\7\60\2\2\u0087\26\3\2\2\2\u0088\u0089\7}\2"+
		"\2\u0089\30\3\2\2\2\u008a\u008b\7\177\2\2\u008b\32\3\2\2\2\u008c\u008d"+
		"\7\60\2\2\u008d\34\3\2\2\2\u008e\u008f\7>\2\2\u008f\36\3\2\2\2\u0090\u0091"+
		"\7@\2\2\u0091 \3\2\2\2\u0092\u0093\7/\2\2\u0093\"\3\2\2\2\u0094\u0098"+
		"\7$\2\2\u0095\u0097\5i\65\2\u0096\u0095\3\2\2\2\u0097\u009a\3\2\2\2\u0098"+
		"\u0096\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u009b\3\2\2\2\u009a\u0098\3\2"+
		"\2\2\u009b\u009c\7$\2\2\u009c$\3\2\2\2\u009d\u00a6\5/\30\2\u009e\u00a2"+
		"\5)\25\2\u009f\u00a1\5\'\24\2\u00a0\u009f\3\2\2\2\u00a1\u00a4\3\2\2\2"+
		"\u00a2\u00a0\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a6\3\2\2\2\u00a4\u00a2"+
		"\3\2\2\2\u00a5\u009d\3\2\2\2\u00a5\u009e\3\2\2\2\u00a6&\3\2\2\2\u00a7"+
		"\u00aa\5/\30\2\u00a8\u00aa\5)\25\2\u00a9\u00a7\3\2\2\2\u00a9\u00a8\3\2"+
		"\2\2\u00aa(\3\2\2\2\u00ab\u00ae\5+\26\2\u00ac\u00ae\4:;\2\u00ad\u00ab"+
		"\3\2\2\2\u00ad\u00ac\3\2\2\2\u00ae*\3\2\2\2\u00af\u00b0\4\639\2\u00b0"+
		",\3\2\2\2\u00b1\u00b4\5/\30\2\u00b2\u00b4\5+\26\2\u00b3\u00b1\3\2\2\2"+
		"\u00b3\u00b2\3\2\2\2\u00b4.\3\2\2\2\u00b5\u00b6\7\62\2\2\u00b6\60\3\2"+
		"\2\2\u00b7\u00b9\5\'\24\2\u00b8\u00b7\3\2\2\2\u00b9\u00bc\3\2\2\2\u00ba"+
		"\u00b8\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00bd\3\2\2\2\u00bc\u00ba\3\2"+
		"\2\2\u00bd\u00bf\7\60\2\2\u00be\u00c0\5\'\24\2\u00bf\u00be\3\2\2\2\u00c0"+
		"\u00c1\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\62\3\2\2"+
		"\2\u00c3\u00c4\t\2\2\2\u00c4\u00c5\t\3\2\2\u00c5\64\3\2\2\2\u00c6\u00c7"+
		"\t\4\2\2\u00c7\u00c8\t\5\2\2\u00c8\u00c9\t\6\2\2\u00c9\u00ca\t\6\2\2\u00ca"+
		"\66\3\2\2\2\u00cb\u00cc\t\7\2\2\u00cc\u00cd\t\2\2\2\u00cd\u00ce\t\5\2"+
		"\2\u00ce\u00cf\t\4\2\2\u00cf\u00d0\t\b\2\2\u00d08\3\2\2\2\u00d1\u00d2"+
		"\t\t\2\2\u00d2\u00d3\t\n\2\2\u00d3\u00d4\t\b\2\2\u00d4\u00d5\t\7\2\2\u00d5"+
		"\u00d6\t\13\2\2\u00d6:\3\2\2\2\u00d7\u00d8\t\3\2\2\u00d8\u00d9\t\f\2\2"+
		"\u00d9\u00da\t\b\2\2\u00da\u00db\t\5\2\2\u00db\u00dc\t\3\2\2\u00dc\u00dd"+
		"\t\4\2\2\u00dd<\3\2\2\2\u00de\u00df\t\r\2\2\u00df\u00e0\t\13\2\2\u00e0"+
		"\u00e1\t\f\2\2\u00e1\u00e2\t\3\2\2\u00e2\u00e3\t\f\2\2\u00e3>\3\2\2\2"+
		"\u00e4\u00e5\t\n\2\2\u00e5\u00e6\t\4\2\2\u00e6\u00e7\t\16\2\2\u00e7@\3"+
		"\2\2\2\u00e8\u00e9\t\4\2\2\u00e9\u00ea\t\2\2\2\u00ea\u00eb\t\b\2\2\u00eb"+
		"B\3\2\2\2\u00ec\u00ed\t\b\2\2\u00ed\u00ee\t\3\2\2\u00ee\u00ef\t\5\2\2"+
		"\u00ef\u00f0\t\f\2\2\u00f0D\3\2\2\2\u00f1\u00f2\t\17\2\2\u00f2\u00f3\t"+
		"\n\2\2\u00f3\u00f4\t\6\2\2\u00f4\u00f5\t\20\2\2\u00f5\u00f6\t\f\2\2\u00f6"+
		"F\3\2\2\2\u00f7\u00fb\5I%\2\u00f8\u00fa\5K&\2\u00f9\u00f8\3\2\2\2\u00fa"+
		"\u00fd\3\2\2\2\u00fb\u00f9\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fcH\3\2\2\2"+
		"\u00fd\u00fb\3\2\2\2\u00fe\u0101\5q9\2\u00ff\u0101\t\21\2\2\u0100\u00fe"+
		"\3\2\2\2\u0100\u00ff\3\2\2\2\u0101J\3\2\2\2\u0102\u0103\5W,\2\u0103L\3"+
		"\2\2\2\u0104\u0106\5O(\2\u0105\u0104\3\2\2\2\u0106\u0107\3\2\2\2\u0107"+
		"\u0105\3\2\2\2\u0107\u0108\3\2\2\2\u0108N\3\2\2\2\u0109\u0116\5e\63\2"+
		"\u010a\u0116\5g\64\2\u010b\u0116\5k\66\2\u010c\u0116\5m\67\2\u010d\u0116"+
		"\5S*\2\u010e\u0116\5c\62\2\u010f\u0116\5a\61\2\u0110\u0116\5_\60\2\u0111"+
		"\u0116\5U+\2\u0112\u0116\5o8\2\u0113\u0116\t\22\2\2\u0114\u0116\5Q)\2"+
		"\u0115\u0109\3\2\2\2\u0115\u010a\3\2\2\2\u0115\u010b\3\2\2\2\u0115\u010c"+
		"\3\2\2\2\u0115\u010d\3\2\2\2\u0115\u010e\3\2\2\2\u0115\u010f\3\2\2\2\u0115"+
		"\u0110\3\2\2\2\u0115\u0111\3\2\2\2\u0115\u0112\3\2\2\2\u0115\u0113\3\2"+
		"\2\2\u0115\u0114\3\2\2\2\u0116P\3\2\2\2\u0117\u0118\7\61\2\2\u0118\u0119"+
		"\7,\2\2\u0119\u011f\3\2\2\2\u011a\u011e\5Y-\2\u011b\u011c\7,\2\2\u011c"+
		"\u011e\5]/\2\u011d\u011a\3\2\2\2\u011d\u011b\3\2\2\2\u011e\u0121\3\2\2"+
		"\2\u011f\u011d\3\2\2\2\u011f\u0120\3\2\2\2\u0120\u0122\3\2\2\2\u0121\u011f"+
		"\3\2\2\2\u0122\u0123\7,\2\2\u0123\u0135\7\61\2\2\u0124\u0125\7\61\2\2"+
		"\u0125\u0126\7\61\2\2\u0126\u012a\3\2\2\2\u0127\u0129\5[.\2\u0128\u0127"+
		"\3\2\2\2\u0129\u012c\3\2\2\2\u012a\u0128\3\2\2\2\u012a\u012b\3\2\2\2\u012b"+
		"\u012e\3\2\2\2\u012c\u012a\3\2\2\2\u012d\u012f\5c\62\2\u012e\u012d\3\2"+
		"\2\2\u012e\u012f\3\2\2\2\u012f\u0132\3\2\2\2\u0130\u0133\5k\66\2\u0131"+
		"\u0133\7\2\2\3\u0132\u0130\3\2\2\2\u0132\u0131\3\2\2\2\u0133\u0135\3\2"+
		"\2\2\u0134\u0117\3\2\2\2\u0134\u0124\3\2\2\2\u0135R\3\2\2\2\u0136\u0137"+
		"\t\23\2\2\u0137T\3\2\2\2\u0138\u0139\t\24\2\2\u0139V\3\2\2\2\u013a\u013b"+
		"\t\25\2\2\u013bX\3\2\2\2\u013c\u013d\t\26\2\2\u013dZ\3\2\2\2\u013e\u013f"+
		"\t\27\2\2\u013f\\\3\2\2\2\u0140\u0141\t\30\2\2\u0141^\3\2\2\2\u0142\u0143"+
		"\t\31\2\2\u0143`\3\2\2\2\u0144\u0145\t\32\2\2\u0145b\3\2\2\2\u0146\u0147"+
		"\t\33\2\2\u0147d\3\2\2\2\u0148\u0149\t\34\2\2\u0149f\3\2\2\2\u014a\u014b"+
		"\t\35\2\2\u014bh\3\2\2\2\u014c\u014d\t\36\2\2\u014dj\3\2\2\2\u014e\u014f"+
		"\t\37\2\2\u014fl\3\2\2\2\u0150\u0151\t \2\2\u0151n\3\2\2\2\u0152\u0153"+
		"\t!\2\2\u0153p\3\2\2\2\u0154\u0155\t\"\2\2\u0155r\3\2\2\2\25\2\u0098\u00a2"+
		"\u00a5\u00a9\u00ad\u00b3\u00ba\u00c1\u00fb\u0100\u0107\u0115\u011d\u011f"+
		"\u012a\u012e\u0132\u0134\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}