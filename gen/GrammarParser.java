// Generated from C:/Users/Александр/IdeaProjects/Yapis_lab_1/src/main/java\Grammar.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, BEGIN=3, END=4, PRINT=5, INT=6, IF=7, ELSE=8, FOR=9, WHILE=10, 
		VECTOR=11, MATRIX=12, RETURN=13, ID=14, NUMBER=15, WS=16, OPEN_BRACKET=17, 
		CLOSE_BRACKET=18, OPEN_SQUARE_BRACKET=19, CLOSE_SQUARE_BRACKET=20, OPEN_CURLY_BRACKET=21, 
		CLOSE_CURLY_BRACKET=22, COMMA=23, PLUS=24, MINUS=25, MULTIPLY=26, DIVIDE=27, 
		ASSIGN=28, NEGATION=29, EQUAL=30, NON_EQUAL=31, LESS=32, GREATER=33, VECTOR_EXPR=34, 
		MATRIX_EXPR=35;
	public static final int
		RULE_program = 0, RULE_block = 1, RULE_statement = 2, RULE_type = 3, RULE_print_number = 4, 
		RULE_print_id = 5, RULE_print_string = 6, RULE_print_mat_row = 7, RULE_simple_compare = 8, 
		RULE_hard_compare = 9, RULE_else_compare = 10, RULE_compare = 11, RULE_digit_expression = 12, 
		RULE_expression = 13, RULE_input_signature = 14, RULE_assign_int = 15, 
		RULE_assign_int_by_subprogram = 16, RULE_program_call = 17, RULE_assign_vec = 18, 
		RULE_assign_vec_by_subprogram = 19, RULE_set_vec_expr = 20, RULE_set_vec_expr_by_mat = 21, 
		RULE_assign_mat = 22, RULE_set_mat = 23, RULE_set_mat_expr = 24, RULE_get_mat_row_by_id = 25;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "block", "statement", "type", "print_number", "print_id", 
			"print_string", "print_mat_row", "simple_compare", "hard_compare", "else_compare", 
			"compare", "digit_expression", "expression", "input_signature", "assign_int", 
			"assign_int_by_subprogram", "program_call", "assign_vec", "assign_vec_by_subprogram", 
			"set_vec_expr", "set_vec_expr_by_mat", "assign_mat", "set_mat", "set_mat_expr", 
			"get_mat_row_by_id"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'main_program'", "'\"'", "'begin'", "'end'", "'print'", "'int'", 
			"'if'", "'else'", "'for'", "'while'", "'vector'", "'matrix'", "'return'", 
			null, null, null, "'('", "')'", "'['", "']'", "'{'", "'}'", "','", "'+'", 
			"'-'", "'*'", "'/'", "'='", "'!'", "'=='", "'!='", "'<'", "'>'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "BEGIN", "END", "PRINT", "INT", "IF", "ELSE", "FOR", 
			"WHILE", "VECTOR", "MATRIX", "RETURN", "ID", "NUMBER", "WS", "OPEN_BRACKET", 
			"CLOSE_BRACKET", "OPEN_SQUARE_BRACKET", "CLOSE_SQUARE_BRACKET", "OPEN_CURLY_BRACKET", 
			"CLOSE_CURLY_BRACKET", "COMMA", "PLUS", "MINUS", "MULTIPLY", "DIVIDE", 
			"ASSIGN", "NEGATION", "EQUAL", "NON_EQUAL", "LESS", "GREATER", "VECTOR_EXPR", 
			"MATRIX_EXPR"
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
	public String getGrammarFileName() { return "Grammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			match(T__0);
			setState(53);
			block();
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

	public static class BlockContext extends ParserRuleContext {
		public TerminalNode BEGIN() { return getToken(GrammarParser.BEGIN, 0); }
		public TerminalNode END() { return getToken(GrammarParser.END, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			match(BEGIN);
			setState(57); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(56);
				statement();
				}
				}
				setState(59); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINT) | (1L << INT) | (1L << IF) | (1L << VECTOR) | (1L << MATRIX) | (1L << ID))) != 0) );
			setState(61);
			match(END);
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

	public static class StatementContext extends ParserRuleContext {
		public Assign_intContext assign_int() {
			return getRuleContext(Assign_intContext.class,0);
		}
		public Assign_int_by_subprogramContext assign_int_by_subprogram() {
			return getRuleContext(Assign_int_by_subprogramContext.class,0);
		}
		public Program_callContext program_call() {
			return getRuleContext(Program_callContext.class,0);
		}
		public Assign_vecContext assign_vec() {
			return getRuleContext(Assign_vecContext.class,0);
		}
		public Set_vec_exprContext set_vec_expr() {
			return getRuleContext(Set_vec_exprContext.class,0);
		}
		public Set_vec_expr_by_matContext set_vec_expr_by_mat() {
			return getRuleContext(Set_vec_expr_by_matContext.class,0);
		}
		public Assign_vec_by_subprogramContext assign_vec_by_subprogram() {
			return getRuleContext(Assign_vec_by_subprogramContext.class,0);
		}
		public Assign_matContext assign_mat() {
			return getRuleContext(Assign_matContext.class,0);
		}
		public Set_mat_exprContext set_mat_expr() {
			return getRuleContext(Set_mat_exprContext.class,0);
		}
		public CompareContext compare() {
			return getRuleContext(CompareContext.class,0);
		}
		public Print_idContext print_id() {
			return getRuleContext(Print_idContext.class,0);
		}
		public Print_mat_rowContext print_mat_row() {
			return getRuleContext(Print_mat_rowContext.class,0);
		}
		public Print_stringContext print_string() {
			return getRuleContext(Print_stringContext.class,0);
		}
		public Print_numberContext print_number() {
			return getRuleContext(Print_numberContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statement);
		try {
			setState(77);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(63);
				assign_int();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(64);
				assign_int_by_subprogram();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(65);
				program_call();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(66);
				assign_vec();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(67);
				set_vec_expr();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(68);
				set_vec_expr_by_mat();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(69);
				assign_vec_by_subprogram();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(70);
				assign_mat();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(71);
				set_mat_expr();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(72);
				compare();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(73);
				print_id();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(74);
				print_mat_row();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(75);
				print_string();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(76);
				print_number();
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

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode VECTOR() { return getToken(GrammarParser.VECTOR, 0); }
		public TerminalNode MATRIX() { return getToken(GrammarParser.MATRIX, 0); }
		public TerminalNode INT() { return getToken(GrammarParser.INT, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << VECTOR) | (1L << MATRIX))) != 0)) ) {
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

	public static class Print_numberContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(GrammarParser.PRINT, 0); }
		public TerminalNode OPEN_BRACKET() { return getToken(GrammarParser.OPEN_BRACKET, 0); }
		public TerminalNode CLOSE_BRACKET() { return getToken(GrammarParser.CLOSE_BRACKET, 0); }
		public TerminalNode NUMBER() { return getToken(GrammarParser.NUMBER, 0); }
		public Print_numberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterPrint_number(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitPrint_number(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitPrint_number(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Print_numberContext print_number() throws RecognitionException {
		Print_numberContext _localctx = new Print_numberContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_print_number);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			match(PRINT);
			setState(82);
			match(OPEN_BRACKET);
			{
			setState(83);
			match(NUMBER);
			}
			setState(84);
			match(CLOSE_BRACKET);
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

	public static class Print_idContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(GrammarParser.PRINT, 0); }
		public TerminalNode OPEN_BRACKET() { return getToken(GrammarParser.OPEN_BRACKET, 0); }
		public TerminalNode CLOSE_BRACKET() { return getToken(GrammarParser.CLOSE_BRACKET, 0); }
		public TerminalNode ID() { return getToken(GrammarParser.ID, 0); }
		public Print_idContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterPrint_id(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitPrint_id(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitPrint_id(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Print_idContext print_id() throws RecognitionException {
		Print_idContext _localctx = new Print_idContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_print_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			match(PRINT);
			setState(87);
			match(OPEN_BRACKET);
			{
			setState(88);
			match(ID);
			}
			setState(89);
			match(CLOSE_BRACKET);
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

	public static class Print_stringContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(GrammarParser.PRINT, 0); }
		public TerminalNode OPEN_BRACKET() { return getToken(GrammarParser.OPEN_BRACKET, 0); }
		public TerminalNode CLOSE_BRACKET() { return getToken(GrammarParser.CLOSE_BRACKET, 0); }
		public TerminalNode ID() { return getToken(GrammarParser.ID, 0); }
		public Print_stringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterPrint_string(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitPrint_string(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitPrint_string(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Print_stringContext print_string() throws RecognitionException {
		Print_stringContext _localctx = new Print_stringContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_print_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			match(PRINT);
			setState(92);
			match(OPEN_BRACKET);
			{
			{
			setState(93);
			match(T__1);
			}
			{
			setState(94);
			match(ID);
			}
			{
			setState(95);
			match(T__1);
			}
			}
			setState(97);
			match(CLOSE_BRACKET);
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

	public static class Print_mat_rowContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(GrammarParser.PRINT, 0); }
		public TerminalNode OPEN_BRACKET() { return getToken(GrammarParser.OPEN_BRACKET, 0); }
		public Get_mat_row_by_idContext get_mat_row_by_id() {
			return getRuleContext(Get_mat_row_by_idContext.class,0);
		}
		public TerminalNode CLOSE_BRACKET() { return getToken(GrammarParser.CLOSE_BRACKET, 0); }
		public Print_mat_rowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print_mat_row; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterPrint_mat_row(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitPrint_mat_row(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitPrint_mat_row(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Print_mat_rowContext print_mat_row() throws RecognitionException {
		Print_mat_rowContext _localctx = new Print_mat_rowContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_print_mat_row);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			match(PRINT);
			setState(100);
			match(OPEN_BRACKET);
			setState(101);
			get_mat_row_by_id();
			setState(102);
			match(CLOSE_BRACKET);
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

	public static class Simple_compareContext extends ParserRuleContext {
		public TerminalNode EQUAL() { return getToken(GrammarParser.EQUAL, 0); }
		public TerminalNode NON_EQUAL() { return getToken(GrammarParser.NON_EQUAL, 0); }
		public TerminalNode LESS() { return getToken(GrammarParser.LESS, 0); }
		public TerminalNode GREATER() { return getToken(GrammarParser.GREATER, 0); }
		public List<TerminalNode> ID() { return getTokens(GrammarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(GrammarParser.ID, i);
		}
		public List<Digit_expressionContext> digit_expression() {
			return getRuleContexts(Digit_expressionContext.class);
		}
		public Digit_expressionContext digit_expression(int i) {
			return getRuleContext(Digit_expressionContext.class,i);
		}
		public Simple_compareContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_compare; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterSimple_compare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitSimple_compare(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitSimple_compare(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Simple_compareContext simple_compare() throws RecognitionException {
		Simple_compareContext _localctx = new Simple_compareContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_simple_compare);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(104);
				match(ID);
				}
				break;
			case 2:
				{
				setState(105);
				digit_expression(0);
				}
				break;
			}
			setState(108);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQUAL) | (1L << NON_EQUAL) | (1L << LESS) | (1L << GREATER))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(111);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(109);
				match(ID);
				}
				break;
			case 2:
				{
				setState(110);
				digit_expression(0);
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

	public static class Hard_compareContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACKET() { return getToken(GrammarParser.OPEN_BRACKET, 0); }
		public Simple_compareContext simple_compare() {
			return getRuleContext(Simple_compareContext.class,0);
		}
		public TerminalNode CLOSE_BRACKET() { return getToken(GrammarParser.CLOSE_BRACKET, 0); }
		public TerminalNode NEGATION() { return getToken(GrammarParser.NEGATION, 0); }
		public Hard_compareContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hard_compare; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterHard_compare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitHard_compare(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitHard_compare(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Hard_compareContext hard_compare() throws RecognitionException {
		Hard_compareContext _localctx = new Hard_compareContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_hard_compare);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEGATION) {
				{
				setState(113);
				match(NEGATION);
				}
			}

			setState(116);
			match(OPEN_BRACKET);
			setState(117);
			simple_compare();
			setState(118);
			match(CLOSE_BRACKET);
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

	public static class Else_compareContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(GrammarParser.ELSE, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Else_compareContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_compare; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterElse_compare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitElse_compare(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitElse_compare(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Else_compareContext else_compare() throws RecognitionException {
		Else_compareContext _localctx = new Else_compareContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_else_compare);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			match(ELSE);
			setState(121);
			block();
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

	public static class CompareContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(GrammarParser.IF, 0); }
		public TerminalNode OPEN_BRACKET() { return getToken(GrammarParser.OPEN_BRACKET, 0); }
		public TerminalNode CLOSE_BRACKET() { return getToken(GrammarParser.CLOSE_BRACKET, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Simple_compareContext simple_compare() {
			return getRuleContext(Simple_compareContext.class,0);
		}
		public Hard_compareContext hard_compare() {
			return getRuleContext(Hard_compareContext.class,0);
		}
		public Else_compareContext else_compare() {
			return getRuleContext(Else_compareContext.class,0);
		}
		public CompareContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compare; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterCompare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitCompare(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitCompare(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompareContext compare() throws RecognitionException {
		CompareContext _localctx = new CompareContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_compare);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			match(IF);
			setState(124);
			match(OPEN_BRACKET);
			setState(127);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(125);
				simple_compare();
				}
				break;
			case 2:
				{
				setState(126);
				hard_compare();
				}
				break;
			}
			setState(129);
			match(CLOSE_BRACKET);
			setState(130);
			block();
			setState(132);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(131);
				else_compare();
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

	public static class Digit_expressionContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(GrammarParser.NUMBER, 0); }
		public TerminalNode ID() { return getToken(GrammarParser.ID, 0); }
		public TerminalNode OPEN_BRACKET() { return getToken(GrammarParser.OPEN_BRACKET, 0); }
		public List<Digit_expressionContext> digit_expression() {
			return getRuleContexts(Digit_expressionContext.class);
		}
		public Digit_expressionContext digit_expression(int i) {
			return getRuleContext(Digit_expressionContext.class,i);
		}
		public TerminalNode CLOSE_BRACKET() { return getToken(GrammarParser.CLOSE_BRACKET, 0); }
		public TerminalNode MULTIPLY() { return getToken(GrammarParser.MULTIPLY, 0); }
		public TerminalNode DIVIDE() { return getToken(GrammarParser.DIVIDE, 0); }
		public TerminalNode PLUS() { return getToken(GrammarParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(GrammarParser.MINUS, 0); }
		public Digit_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_digit_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterDigit_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitDigit_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitDigit_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Digit_expressionContext digit_expression() throws RecognitionException {
		return digit_expression(0);
	}

	private Digit_expressionContext digit_expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Digit_expressionContext _localctx = new Digit_expressionContext(_ctx, _parentState);
		Digit_expressionContext _prevctx = _localctx;
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_digit_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				{
				setState(135);
				match(NUMBER);
				}
				break;
			case ID:
				{
				setState(136);
				match(ID);
				}
				break;
			case OPEN_BRACKET:
				{
				setState(137);
				match(OPEN_BRACKET);
				setState(138);
				digit_expression(0);
				setState(139);
				match(CLOSE_BRACKET);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(151);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(149);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
					case 1:
						{
						_localctx = new Digit_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_digit_expression);
						setState(143);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(144);
						_la = _input.LA(1);
						if ( !(_la==MULTIPLY || _la==DIVIDE) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(145);
						digit_expression(6);
						}
						break;
					case 2:
						{
						_localctx = new Digit_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_digit_expression);
						setState(146);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(147);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(148);
						digit_expression(5);
						}
						break;
					}
					} 
				}
				setState(153);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(GrammarParser.ID, 0); }
		public TerminalNode OPEN_BRACKET() { return getToken(GrammarParser.OPEN_BRACKET, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode CLOSE_BRACKET() { return getToken(GrammarParser.CLOSE_BRACKET, 0); }
		public TerminalNode MULTIPLY() { return getToken(GrammarParser.MULTIPLY, 0); }
		public TerminalNode PLUS() { return getToken(GrammarParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(GrammarParser.MINUS, 0); }
		public Digit_expressionContext digit_expression() {
			return getRuleContext(Digit_expressionContext.class,0);
		}
		public TerminalNode DIVIDE() { return getToken(GrammarParser.DIVIDE, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(155);
				match(ID);
				}
				break;
			case OPEN_BRACKET:
				{
				setState(156);
				match(OPEN_BRACKET);
				setState(157);
				expression(0);
				setState(158);
				match(CLOSE_BRACKET);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(173);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(171);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(162);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						{
						setState(163);
						match(MULTIPLY);
						}
						setState(164);
						expression(6);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(165);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(166);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(167);
						expression(5);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(168);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(169);
						_la = _input.LA(1);
						if ( !(_la==MULTIPLY || _la==DIVIDE) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(170);
						digit_expression(0);
						}
						break;
					}
					} 
				}
				setState(175);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Input_signatureContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACKET() { return getToken(GrammarParser.OPEN_BRACKET, 0); }
		public TerminalNode CLOSE_BRACKET() { return getToken(GrammarParser.CLOSE_BRACKET, 0); }
		public List<TerminalNode> ID() { return getTokens(GrammarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(GrammarParser.ID, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(GrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GrammarParser.COMMA, i);
		}
		public Input_signatureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_input_signature; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterInput_signature(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitInput_signature(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitInput_signature(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Input_signatureContext input_signature() throws RecognitionException {
		Input_signatureContext _localctx = new Input_signatureContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_input_signature);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(176);
			match(OPEN_BRACKET);
			setState(181);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(177);
					match(ID);
					setState(178);
					match(COMMA);
					}
					} 
				}
				setState(183);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			}
			{
			setState(184);
			match(ID);
			}
			setState(185);
			match(CLOSE_BRACKET);
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

	public static class Assign_intContext extends ParserRuleContext {
		public List<TerminalNode> INT() { return getTokens(GrammarParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(GrammarParser.INT, i);
		}
		public TerminalNode ID() { return getToken(GrammarParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(GrammarParser.ASSIGN, 0); }
		public TerminalNode OPEN_BRACKET() { return getToken(GrammarParser.OPEN_BRACKET, 0); }
		public TerminalNode CLOSE_BRACKET() { return getToken(GrammarParser.CLOSE_BRACKET, 0); }
		public Digit_expressionContext digit_expression() {
			return getRuleContext(Digit_expressionContext.class,0);
		}
		public Assign_intContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_int; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterAssign_int(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitAssign_int(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitAssign_int(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assign_intContext assign_int() throws RecognitionException {
		Assign_intContext _localctx = new Assign_intContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_assign_int);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				{
				{
				setState(187);
				match(INT);
				setState(188);
				match(ID);
				setState(189);
				match(ASSIGN);
				{
				setState(190);
				match(OPEN_BRACKET);
				setState(191);
				match(INT);
				setState(192);
				match(CLOSE_BRACKET);
				}
				{
				setState(194);
				digit_expression(0);
				}
				}
				}
				break;
			case ID:
				{
				{
				setState(195);
				match(ID);
				setState(196);
				match(ASSIGN);
				{
				setState(197);
				match(OPEN_BRACKET);
				setState(198);
				match(INT);
				setState(199);
				match(CLOSE_BRACKET);
				}
				{
				setState(201);
				digit_expression(0);
				}
				}
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

	public static class Assign_int_by_subprogramContext extends ParserRuleContext {
		public List<TerminalNode> INT() { return getTokens(GrammarParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(GrammarParser.INT, i);
		}
		public List<TerminalNode> ID() { return getTokens(GrammarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(GrammarParser.ID, i);
		}
		public TerminalNode ASSIGN() { return getToken(GrammarParser.ASSIGN, 0); }
		public List<TerminalNode> OPEN_BRACKET() { return getTokens(GrammarParser.OPEN_BRACKET); }
		public TerminalNode OPEN_BRACKET(int i) {
			return getToken(GrammarParser.OPEN_BRACKET, i);
		}
		public List<TerminalNode> CLOSE_BRACKET() { return getTokens(GrammarParser.CLOSE_BRACKET); }
		public TerminalNode CLOSE_BRACKET(int i) {
			return getToken(GrammarParser.CLOSE_BRACKET, i);
		}
		public Input_signatureContext input_signature() {
			return getRuleContext(Input_signatureContext.class,0);
		}
		public Assign_int_by_subprogramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_int_by_subprogram; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterAssign_int_by_subprogram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitAssign_int_by_subprogram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitAssign_int_by_subprogram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assign_int_by_subprogramContext assign_int_by_subprogram() throws RecognitionException {
		Assign_int_by_subprogramContext _localctx = new Assign_int_by_subprogramContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_assign_int_by_subprogram);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				{
				{
				setState(204);
				match(INT);
				setState(205);
				match(ID);
				setState(206);
				match(ASSIGN);
				{
				setState(207);
				match(OPEN_BRACKET);
				setState(208);
				match(INT);
				setState(209);
				match(CLOSE_BRACKET);
				}
				{
				setState(211);
				match(ID);
				setState(215);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
				case 1:
					{
					setState(212);
					input_signature();
					}
					break;
				case 2:
					{
					{
					setState(213);
					match(OPEN_BRACKET);
					setState(214);
					match(CLOSE_BRACKET);
					}
					}
					break;
				}
				}
				}
				}
				break;
			case ID:
				{
				{
				setState(217);
				match(ID);
				setState(218);
				match(ASSIGN);
				{
				setState(219);
				match(OPEN_BRACKET);
				setState(220);
				match(INT);
				setState(221);
				match(CLOSE_BRACKET);
				}
				{
				setState(223);
				match(ID);
				setState(227);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
				case 1:
					{
					setState(224);
					input_signature();
					}
					break;
				case 2:
					{
					{
					setState(225);
					match(OPEN_BRACKET);
					setState(226);
					match(CLOSE_BRACKET);
					}
					}
					break;
				}
				}
				}
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

	public static class Program_callContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(GrammarParser.ID, 0); }
		public Input_signatureContext input_signature() {
			return getRuleContext(Input_signatureContext.class,0);
		}
		public TerminalNode OPEN_BRACKET() { return getToken(GrammarParser.OPEN_BRACKET, 0); }
		public TerminalNode CLOSE_BRACKET() { return getToken(GrammarParser.CLOSE_BRACKET, 0); }
		public Program_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterProgram_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitProgram_call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitProgram_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Program_callContext program_call() throws RecognitionException {
		Program_callContext _localctx = new Program_callContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_program_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(231);
			match(ID);
			setState(235);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(232);
				input_signature();
				}
				break;
			case 2:
				{
				{
				setState(233);
				match(OPEN_BRACKET);
				setState(234);
				match(CLOSE_BRACKET);
				}
				}
				break;
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

	public static class Assign_vecContext extends ParserRuleContext {
		public TerminalNode VECTOR() { return getToken(GrammarParser.VECTOR, 0); }
		public TerminalNode ID() { return getToken(GrammarParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(GrammarParser.ASSIGN, 0); }
		public TerminalNode VECTOR_EXPR() { return getToken(GrammarParser.VECTOR_EXPR, 0); }
		public Assign_vecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_vec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterAssign_vec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitAssign_vec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitAssign_vec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assign_vecContext assign_vec() throws RecognitionException {
		Assign_vecContext _localctx = new Assign_vecContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_assign_vec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(244);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VECTOR:
				{
				{
				setState(237);
				match(VECTOR);
				setState(238);
				match(ID);
				setState(239);
				match(ASSIGN);
				{
				setState(240);
				match(VECTOR_EXPR);
				}
				}
				}
				break;
			case ID:
				{
				{
				setState(241);
				match(ID);
				setState(242);
				match(ASSIGN);
				{
				setState(243);
				match(VECTOR_EXPR);
				}
				}
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

	public static class Assign_vec_by_subprogramContext extends ParserRuleContext {
		public List<TerminalNode> VECTOR() { return getTokens(GrammarParser.VECTOR); }
		public TerminalNode VECTOR(int i) {
			return getToken(GrammarParser.VECTOR, i);
		}
		public List<TerminalNode> ID() { return getTokens(GrammarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(GrammarParser.ID, i);
		}
		public TerminalNode ASSIGN() { return getToken(GrammarParser.ASSIGN, 0); }
		public List<TerminalNode> OPEN_BRACKET() { return getTokens(GrammarParser.OPEN_BRACKET); }
		public TerminalNode OPEN_BRACKET(int i) {
			return getToken(GrammarParser.OPEN_BRACKET, i);
		}
		public List<TerminalNode> CLOSE_BRACKET() { return getTokens(GrammarParser.CLOSE_BRACKET); }
		public TerminalNode CLOSE_BRACKET(int i) {
			return getToken(GrammarParser.CLOSE_BRACKET, i);
		}
		public Input_signatureContext input_signature() {
			return getRuleContext(Input_signatureContext.class,0);
		}
		public Assign_vec_by_subprogramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_vec_by_subprogram; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterAssign_vec_by_subprogram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitAssign_vec_by_subprogram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitAssign_vec_by_subprogram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assign_vec_by_subprogramContext assign_vec_by_subprogram() throws RecognitionException {
		Assign_vec_by_subprogramContext _localctx = new Assign_vec_by_subprogramContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_assign_vec_by_subprogram);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VECTOR:
				{
				{
				setState(246);
				match(VECTOR);
				setState(247);
				match(ID);
				setState(248);
				match(ASSIGN);
				{
				setState(249);
				match(OPEN_BRACKET);
				setState(250);
				match(VECTOR);
				setState(251);
				match(CLOSE_BRACKET);
				}
				{
				setState(253);
				match(ID);
				setState(257);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
				case 1:
					{
					setState(254);
					input_signature();
					}
					break;
				case 2:
					{
					{
					setState(255);
					match(OPEN_BRACKET);
					setState(256);
					match(CLOSE_BRACKET);
					}
					}
					break;
				}
				}
				}
				}
				break;
			case ID:
				{
				{
				setState(259);
				match(ID);
				setState(260);
				match(ASSIGN);
				{
				setState(261);
				match(OPEN_BRACKET);
				setState(262);
				match(VECTOR);
				setState(263);
				match(CLOSE_BRACKET);
				}
				{
				setState(265);
				match(ID);
				setState(269);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
				case 1:
					{
					setState(266);
					input_signature();
					}
					break;
				case 2:
					{
					{
					setState(267);
					match(OPEN_BRACKET);
					setState(268);
					match(CLOSE_BRACKET);
					}
					}
					break;
				}
				}
				}
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

	public static class Set_vec_exprContext extends ParserRuleContext {
		public List<TerminalNode> VECTOR() { return getTokens(GrammarParser.VECTOR); }
		public TerminalNode VECTOR(int i) {
			return getToken(GrammarParser.VECTOR, i);
		}
		public TerminalNode ID() { return getToken(GrammarParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(GrammarParser.ASSIGN, 0); }
		public TerminalNode OPEN_BRACKET() { return getToken(GrammarParser.OPEN_BRACKET, 0); }
		public TerminalNode CLOSE_BRACKET() { return getToken(GrammarParser.CLOSE_BRACKET, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Set_vec_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_set_vec_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterSet_vec_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitSet_vec_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitSet_vec_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Set_vec_exprContext set_vec_expr() throws RecognitionException {
		Set_vec_exprContext _localctx = new Set_vec_exprContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_set_vec_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(288);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VECTOR:
				{
				{
				setState(273);
				match(VECTOR);
				setState(274);
				match(ID);
				setState(275);
				match(ASSIGN);
				{
				setState(276);
				match(OPEN_BRACKET);
				setState(277);
				match(VECTOR);
				setState(278);
				match(CLOSE_BRACKET);
				}
				{
				setState(280);
				expression(0);
				}
				}
				}
				break;
			case ID:
				{
				{
				setState(281);
				match(ID);
				setState(282);
				match(ASSIGN);
				{
				setState(283);
				match(OPEN_BRACKET);
				setState(284);
				match(VECTOR);
				setState(285);
				match(CLOSE_BRACKET);
				}
				{
				setState(287);
				expression(0);
				}
				}
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

	public static class Set_vec_expr_by_matContext extends ParserRuleContext {
		public TerminalNode VECTOR() { return getToken(GrammarParser.VECTOR, 0); }
		public TerminalNode ID() { return getToken(GrammarParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(GrammarParser.ASSIGN, 0); }
		public Get_mat_row_by_idContext get_mat_row_by_id() {
			return getRuleContext(Get_mat_row_by_idContext.class,0);
		}
		public Set_vec_expr_by_matContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_set_vec_expr_by_mat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterSet_vec_expr_by_mat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitSet_vec_expr_by_mat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitSet_vec_expr_by_mat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Set_vec_expr_by_matContext set_vec_expr_by_mat() throws RecognitionException {
		Set_vec_expr_by_matContext _localctx = new Set_vec_expr_by_matContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_set_vec_expr_by_mat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(297);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VECTOR:
				{
				{
				setState(290);
				match(VECTOR);
				setState(291);
				match(ID);
				setState(292);
				match(ASSIGN);
				setState(293);
				get_mat_row_by_id();
				}
				}
				break;
			case ID:
				{
				{
				setState(294);
				match(ID);
				setState(295);
				match(ASSIGN);
				setState(296);
				get_mat_row_by_id();
				}
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

	public static class Assign_matContext extends ParserRuleContext {
		public TerminalNode MATRIX() { return getToken(GrammarParser.MATRIX, 0); }
		public TerminalNode ID() { return getToken(GrammarParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(GrammarParser.ASSIGN, 0); }
		public TerminalNode MATRIX_EXPR() { return getToken(GrammarParser.MATRIX_EXPR, 0); }
		public Assign_matContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_mat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterAssign_mat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitAssign_mat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitAssign_mat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assign_matContext assign_mat() throws RecognitionException {
		Assign_matContext _localctx = new Assign_matContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_assign_mat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(306);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MATRIX:
				{
				{
				setState(299);
				match(MATRIX);
				setState(300);
				match(ID);
				setState(301);
				match(ASSIGN);
				{
				setState(302);
				match(MATRIX_EXPR);
				}
				}
				}
				break;
			case ID:
				{
				{
				setState(303);
				match(ID);
				setState(304);
				match(ASSIGN);
				{
				setState(305);
				match(MATRIX_EXPR);
				}
				}
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

	public static class Set_matContext extends ParserRuleContext {
		public List<TerminalNode> MATRIX() { return getTokens(GrammarParser.MATRIX); }
		public TerminalNode MATRIX(int i) {
			return getToken(GrammarParser.MATRIX, i);
		}
		public List<TerminalNode> ID() { return getTokens(GrammarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(GrammarParser.ID, i);
		}
		public TerminalNode ASSIGN() { return getToken(GrammarParser.ASSIGN, 0); }
		public TerminalNode OPEN_BRACKET() { return getToken(GrammarParser.OPEN_BRACKET, 0); }
		public TerminalNode CLOSE_BRACKET() { return getToken(GrammarParser.CLOSE_BRACKET, 0); }
		public Set_matContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_set_mat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterSet_mat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitSet_mat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitSet_mat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Set_matContext set_mat() throws RecognitionException {
		Set_matContext _localctx = new Set_matContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_set_mat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(323);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MATRIX:
				{
				{
				setState(308);
				match(MATRIX);
				setState(309);
				match(ID);
				setState(310);
				match(ASSIGN);
				{
				setState(311);
				match(OPEN_BRACKET);
				setState(312);
				match(MATRIX);
				setState(313);
				match(CLOSE_BRACKET);
				}
				{
				setState(315);
				match(ID);
				}
				}
				}
				break;
			case ID:
				{
				{
				setState(316);
				match(ID);
				setState(317);
				match(ASSIGN);
				{
				setState(318);
				match(OPEN_BRACKET);
				setState(319);
				match(MATRIX);
				setState(320);
				match(CLOSE_BRACKET);
				}
				{
				setState(322);
				match(ID);
				}
				}
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

	public static class Set_mat_exprContext extends ParserRuleContext {
		public List<TerminalNode> MATRIX() { return getTokens(GrammarParser.MATRIX); }
		public TerminalNode MATRIX(int i) {
			return getToken(GrammarParser.MATRIX, i);
		}
		public TerminalNode ID() { return getToken(GrammarParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(GrammarParser.ASSIGN, 0); }
		public TerminalNode OPEN_BRACKET() { return getToken(GrammarParser.OPEN_BRACKET, 0); }
		public TerminalNode CLOSE_BRACKET() { return getToken(GrammarParser.CLOSE_BRACKET, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Set_mat_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_set_mat_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterSet_mat_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitSet_mat_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitSet_mat_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Set_mat_exprContext set_mat_expr() throws RecognitionException {
		Set_mat_exprContext _localctx = new Set_mat_exprContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_set_mat_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(340);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MATRIX:
				{
				{
				setState(325);
				match(MATRIX);
				setState(326);
				match(ID);
				setState(327);
				match(ASSIGN);
				{
				setState(328);
				match(OPEN_BRACKET);
				setState(329);
				match(MATRIX);
				setState(330);
				match(CLOSE_BRACKET);
				}
				{
				setState(332);
				expression(0);
				}
				}
				}
				break;
			case ID:
				{
				{
				setState(333);
				match(ID);
				setState(334);
				match(ASSIGN);
				{
				setState(335);
				match(OPEN_BRACKET);
				setState(336);
				match(MATRIX);
				setState(337);
				match(CLOSE_BRACKET);
				}
				{
				setState(339);
				expression(0);
				}
				}
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

	public static class Get_mat_row_by_idContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(GrammarParser.ID, 0); }
		public TerminalNode OPEN_SQUARE_BRACKET() { return getToken(GrammarParser.OPEN_SQUARE_BRACKET, 0); }
		public Digit_expressionContext digit_expression() {
			return getRuleContext(Digit_expressionContext.class,0);
		}
		public TerminalNode CLOSE_SQUARE_BRACKET() { return getToken(GrammarParser.CLOSE_SQUARE_BRACKET, 0); }
		public Get_mat_row_by_idContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_get_mat_row_by_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterGet_mat_row_by_id(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitGet_mat_row_by_id(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitGet_mat_row_by_id(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Get_mat_row_by_idContext get_mat_row_by_id() throws RecognitionException {
		Get_mat_row_by_idContext _localctx = new Get_mat_row_by_idContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_get_mat_row_by_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(342);
			match(ID);
			setState(343);
			match(OPEN_SQUARE_BRACKET);
			setState(344);
			digit_expression(0);
			setState(345);
			match(CLOSE_SQUARE_BRACKET);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 12:
			return digit_expression_sempred((Digit_expressionContext)_localctx, predIndex);
		case 13:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean digit_expression_sempred(Digit_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 5);
		case 1:
			return precpred(_ctx, 4);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 5);
		case 3:
			return precpred(_ctx, 4);
		case 4:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3%\u015e\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\3\2\3\2\3\2\3\3\3\3\6\3<\n\3\r\3\16\3=\3\3\3\3\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4P\n\4\3\5\3"+
		"\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\5\nm\n\n\3\n\3\n\3\n\5\nr\n\n\3\13\5"+
		"\13u\n\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\r\5\r\u0082\n"+
		"\r\3\r\3\r\3\r\5\r\u0087\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u0090"+
		"\n\16\3\16\3\16\3\16\3\16\3\16\3\16\7\16\u0098\n\16\f\16\16\16\u009b\13"+
		"\16\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00a3\n\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\7\17\u00ae\n\17\f\17\16\17\u00b1\13\17\3\20"+
		"\3\20\3\20\7\20\u00b6\n\20\f\20\16\20\u00b9\13\20\3\20\3\20\3\20\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\5\21\u00cd\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\5\22\u00da\n\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22"+
		"\u00e6\n\22\5\22\u00e8\n\22\3\23\3\23\3\23\3\23\5\23\u00ee\n\23\3\24\3"+
		"\24\3\24\3\24\3\24\3\24\3\24\5\24\u00f7\n\24\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u0104\n\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\5\25\u0110\n\25\5\25\u0112\n\25\3\26\3\26\3"+
		"\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u0123"+
		"\n\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u012c\n\27\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\5\30\u0135\n\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u0146\n\31\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u0157"+
		"\n\32\3\33\3\33\3\33\3\33\3\33\3\33\2\4\32\34\34\2\4\6\b\n\f\16\20\22"+
		"\24\26\30\32\34\36 \"$&(*,.\60\62\64\2\6\4\2\b\b\r\16\3\2 #\3\2\34\35"+
		"\3\2\32\33\2\u016d\2\66\3\2\2\2\49\3\2\2\2\6O\3\2\2\2\bQ\3\2\2\2\nS\3"+
		"\2\2\2\fX\3\2\2\2\16]\3\2\2\2\20e\3\2\2\2\22l\3\2\2\2\24t\3\2\2\2\26z"+
		"\3\2\2\2\30}\3\2\2\2\32\u008f\3\2\2\2\34\u00a2\3\2\2\2\36\u00b2\3\2\2"+
		"\2 \u00cc\3\2\2\2\"\u00e7\3\2\2\2$\u00e9\3\2\2\2&\u00f6\3\2\2\2(\u0111"+
		"\3\2\2\2*\u0122\3\2\2\2,\u012b\3\2\2\2.\u0134\3\2\2\2\60\u0145\3\2\2\2"+
		"\62\u0156\3\2\2\2\64\u0158\3\2\2\2\66\67\7\3\2\2\678\5\4\3\28\3\3\2\2"+
		"\29;\7\5\2\2:<\5\6\4\2;:\3\2\2\2<=\3\2\2\2=;\3\2\2\2=>\3\2\2\2>?\3\2\2"+
		"\2?@\7\6\2\2@\5\3\2\2\2AP\5 \21\2BP\5\"\22\2CP\5$\23\2DP\5&\24\2EP\5*"+
		"\26\2FP\5,\27\2GP\5(\25\2HP\5.\30\2IP\5\62\32\2JP\5\30\r\2KP\5\f\7\2L"+
		"P\5\20\t\2MP\5\16\b\2NP\5\n\6\2OA\3\2\2\2OB\3\2\2\2OC\3\2\2\2OD\3\2\2"+
		"\2OE\3\2\2\2OF\3\2\2\2OG\3\2\2\2OH\3\2\2\2OI\3\2\2\2OJ\3\2\2\2OK\3\2\2"+
		"\2OL\3\2\2\2OM\3\2\2\2ON\3\2\2\2P\7\3\2\2\2QR\t\2\2\2R\t\3\2\2\2ST\7\7"+
		"\2\2TU\7\23\2\2UV\7\21\2\2VW\7\24\2\2W\13\3\2\2\2XY\7\7\2\2YZ\7\23\2\2"+
		"Z[\7\20\2\2[\\\7\24\2\2\\\r\3\2\2\2]^\7\7\2\2^_\7\23\2\2_`\7\4\2\2`a\7"+
		"\20\2\2ab\7\4\2\2bc\3\2\2\2cd\7\24\2\2d\17\3\2\2\2ef\7\7\2\2fg\7\23\2"+
		"\2gh\5\64\33\2hi\7\24\2\2i\21\3\2\2\2jm\7\20\2\2km\5\32\16\2lj\3\2\2\2"+
		"lk\3\2\2\2mn\3\2\2\2nq\t\3\2\2or\7\20\2\2pr\5\32\16\2qo\3\2\2\2qp\3\2"+
		"\2\2r\23\3\2\2\2su\7\37\2\2ts\3\2\2\2tu\3\2\2\2uv\3\2\2\2vw\7\23\2\2w"+
		"x\5\22\n\2xy\7\24\2\2y\25\3\2\2\2z{\7\n\2\2{|\5\4\3\2|\27\3\2\2\2}~\7"+
		"\t\2\2~\u0081\7\23\2\2\177\u0082\5\22\n\2\u0080\u0082\5\24\13\2\u0081"+
		"\177\3\2\2\2\u0081\u0080\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0084\7\24"+
		"\2\2\u0084\u0086\5\4\3\2\u0085\u0087\5\26\f\2\u0086\u0085\3\2\2\2\u0086"+
		"\u0087\3\2\2\2\u0087\31\3\2\2\2\u0088\u0089\b\16\1\2\u0089\u0090\7\21"+
		"\2\2\u008a\u0090\7\20\2\2\u008b\u008c\7\23\2\2\u008c\u008d\5\32\16\2\u008d"+
		"\u008e\7\24\2\2\u008e\u0090\3\2\2\2\u008f\u0088\3\2\2\2\u008f\u008a\3"+
		"\2\2\2\u008f\u008b\3\2\2\2\u0090\u0099\3\2\2\2\u0091\u0092\f\7\2\2\u0092"+
		"\u0093\t\4\2\2\u0093\u0098\5\32\16\b\u0094\u0095\f\6\2\2\u0095\u0096\t"+
		"\5\2\2\u0096\u0098\5\32\16\7\u0097\u0091\3\2\2\2\u0097\u0094\3\2\2\2\u0098"+
		"\u009b\3\2\2\2\u0099\u0097\3\2\2\2\u0099\u009a\3\2\2\2\u009a\33\3\2\2"+
		"\2\u009b\u0099\3\2\2\2\u009c\u009d\b\17\1\2\u009d\u00a3\7\20\2\2\u009e"+
		"\u009f\7\23\2\2\u009f\u00a0\5\34\17\2\u00a0\u00a1\7\24\2\2\u00a1\u00a3"+
		"\3\2\2\2\u00a2\u009c\3\2\2\2\u00a2\u009e\3\2\2\2\u00a3\u00af\3\2\2\2\u00a4"+
		"\u00a5\f\7\2\2\u00a5\u00a6\7\34\2\2\u00a6\u00ae\5\34\17\b\u00a7\u00a8"+
		"\f\6\2\2\u00a8\u00a9\t\5\2\2\u00a9\u00ae\5\34\17\7\u00aa\u00ab\f\4\2\2"+
		"\u00ab\u00ac\t\4\2\2\u00ac\u00ae\5\32\16\2\u00ad\u00a4\3\2\2\2\u00ad\u00a7"+
		"\3\2\2\2\u00ad\u00aa\3\2\2\2\u00ae\u00b1\3\2\2\2\u00af\u00ad\3\2\2\2\u00af"+
		"\u00b0\3\2\2\2\u00b0\35\3\2\2\2\u00b1\u00af\3\2\2\2\u00b2\u00b7\7\23\2"+
		"\2\u00b3\u00b4\7\20\2\2\u00b4\u00b6\7\31\2\2\u00b5\u00b3\3\2\2\2\u00b6"+
		"\u00b9\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00ba\3\2"+
		"\2\2\u00b9\u00b7\3\2\2\2\u00ba\u00bb\7\20\2\2\u00bb\u00bc\7\24\2\2\u00bc"+
		"\37\3\2\2\2\u00bd\u00be\7\b\2\2\u00be\u00bf\7\20\2\2\u00bf\u00c0\7\36"+
		"\2\2\u00c0\u00c1\7\23\2\2\u00c1\u00c2\7\b\2\2\u00c2\u00c3\7\24\2\2\u00c3"+
		"\u00c4\3\2\2\2\u00c4\u00cd\5\32\16\2\u00c5\u00c6\7\20\2\2\u00c6\u00c7"+
		"\7\36\2\2\u00c7\u00c8\7\23\2\2\u00c8\u00c9\7\b\2\2\u00c9\u00ca\7\24\2"+
		"\2\u00ca\u00cb\3\2\2\2\u00cb\u00cd\5\32\16\2\u00cc\u00bd\3\2\2\2\u00cc"+
		"\u00c5\3\2\2\2\u00cd!\3\2\2\2\u00ce\u00cf\7\b\2\2\u00cf\u00d0\7\20\2\2"+
		"\u00d0\u00d1\7\36\2\2\u00d1\u00d2\7\23\2\2\u00d2\u00d3\7\b\2\2\u00d3\u00d4"+
		"\7\24\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00d9\7\20\2\2\u00d6\u00da\5\36\20"+
		"\2\u00d7\u00d8\7\23\2\2\u00d8\u00da\7\24\2\2\u00d9\u00d6\3\2\2\2\u00d9"+
		"\u00d7\3\2\2\2\u00da\u00e8\3\2\2\2\u00db\u00dc\7\20\2\2\u00dc\u00dd\7"+
		"\36\2\2\u00dd\u00de\7\23\2\2\u00de\u00df\7\b\2\2\u00df\u00e0\7\24\2\2"+
		"\u00e0\u00e1\3\2\2\2\u00e1\u00e5\7\20\2\2\u00e2\u00e6\5\36\20\2\u00e3"+
		"\u00e4\7\23\2\2\u00e4\u00e6\7\24\2\2\u00e5\u00e2\3\2\2\2\u00e5\u00e3\3"+
		"\2\2\2\u00e6\u00e8\3\2\2\2\u00e7\u00ce\3\2\2\2\u00e7\u00db\3\2\2\2\u00e8"+
		"#\3\2\2\2\u00e9\u00ed\7\20\2\2\u00ea\u00ee\5\36\20\2\u00eb\u00ec\7\23"+
		"\2\2\u00ec\u00ee\7\24\2\2\u00ed\u00ea\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ee"+
		"%\3\2\2\2\u00ef\u00f0\7\r\2\2\u00f0\u00f1\7\20\2\2\u00f1\u00f2\7\36\2"+
		"\2\u00f2\u00f7\7$\2\2\u00f3\u00f4\7\20\2\2\u00f4\u00f5\7\36\2\2\u00f5"+
		"\u00f7\7$\2\2\u00f6\u00ef\3\2\2\2\u00f6\u00f3\3\2\2\2\u00f7\'\3\2\2\2"+
		"\u00f8\u00f9\7\r\2\2\u00f9\u00fa\7\20\2\2\u00fa\u00fb\7\36\2\2\u00fb\u00fc"+
		"\7\23\2\2\u00fc\u00fd\7\r\2\2\u00fd\u00fe\7\24\2\2\u00fe\u00ff\3\2\2\2"+
		"\u00ff\u0103\7\20\2\2\u0100\u0104\5\36\20\2\u0101\u0102\7\23\2\2\u0102"+
		"\u0104\7\24\2\2\u0103\u0100\3\2\2\2\u0103\u0101\3\2\2\2\u0104\u0112\3"+
		"\2\2\2\u0105\u0106\7\20\2\2\u0106\u0107\7\36\2\2\u0107\u0108\7\23\2\2"+
		"\u0108\u0109\7\r\2\2\u0109\u010a\7\24\2\2\u010a\u010b\3\2\2\2\u010b\u010f"+
		"\7\20\2\2\u010c\u0110\5\36\20\2\u010d\u010e\7\23\2\2\u010e\u0110\7\24"+
		"\2\2\u010f\u010c\3\2\2\2\u010f\u010d\3\2\2\2\u0110\u0112\3\2\2\2\u0111"+
		"\u00f8\3\2\2\2\u0111\u0105\3\2\2\2\u0112)\3\2\2\2\u0113\u0114\7\r\2\2"+
		"\u0114\u0115\7\20\2\2\u0115\u0116\7\36\2\2\u0116\u0117\7\23\2\2\u0117"+
		"\u0118\7\r\2\2\u0118\u0119\7\24\2\2\u0119\u011a\3\2\2\2\u011a\u0123\5"+
		"\34\17\2\u011b\u011c\7\20\2\2\u011c\u011d\7\36\2\2\u011d\u011e\7\23\2"+
		"\2\u011e\u011f\7\r\2\2\u011f\u0120\7\24\2\2\u0120\u0121\3\2\2\2\u0121"+
		"\u0123\5\34\17\2\u0122\u0113\3\2\2\2\u0122\u011b\3\2\2\2\u0123+\3\2\2"+
		"\2\u0124\u0125\7\r\2\2\u0125\u0126\7\20\2\2\u0126\u0127\7\36\2\2\u0127"+
		"\u012c\5\64\33\2\u0128\u0129\7\20\2\2\u0129\u012a\7\36\2\2\u012a\u012c"+
		"\5\64\33\2\u012b\u0124\3\2\2\2\u012b\u0128\3\2\2\2\u012c-\3\2\2\2\u012d"+
		"\u012e\7\16\2\2\u012e\u012f\7\20\2\2\u012f\u0130\7\36\2\2\u0130\u0135"+
		"\7%\2\2\u0131\u0132\7\20\2\2\u0132\u0133\7\36\2\2\u0133\u0135\7%\2\2\u0134"+
		"\u012d\3\2\2\2\u0134\u0131\3\2\2\2\u0135/\3\2\2\2\u0136\u0137\7\16\2\2"+
		"\u0137\u0138\7\20\2\2\u0138\u0139\7\36\2\2\u0139\u013a\7\23\2\2\u013a"+
		"\u013b\7\16\2\2\u013b\u013c\7\24\2\2\u013c\u013d\3\2\2\2\u013d\u0146\7"+
		"\20\2\2\u013e\u013f\7\20\2\2\u013f\u0140\7\36\2\2\u0140\u0141\7\23\2\2"+
		"\u0141\u0142\7\16\2\2\u0142\u0143\7\24\2\2\u0143\u0144\3\2\2\2\u0144\u0146"+
		"\7\20\2\2\u0145\u0136\3\2\2\2\u0145\u013e\3\2\2\2\u0146\61\3\2\2\2\u0147"+
		"\u0148\7\16\2\2\u0148\u0149\7\20\2\2\u0149\u014a\7\36\2\2\u014a\u014b"+
		"\7\23\2\2\u014b\u014c\7\16\2\2\u014c\u014d\7\24\2\2\u014d\u014e\3\2\2"+
		"\2\u014e\u0157\5\34\17\2\u014f\u0150\7\20\2\2\u0150\u0151\7\36\2\2\u0151"+
		"\u0152\7\23\2\2\u0152\u0153\7\16\2\2\u0153\u0154\7\24\2\2\u0154\u0155"+
		"\3\2\2\2\u0155\u0157\5\34\17\2\u0156\u0147\3\2\2\2\u0156\u014f\3\2\2\2"+
		"\u0157\63\3\2\2\2\u0158\u0159\7\20\2\2\u0159\u015a\7\25\2\2\u015a\u015b"+
		"\5\32\16\2\u015b\u015c\7\26\2\2\u015c\65\3\2\2\2\36=Olqt\u0081\u0086\u008f"+
		"\u0097\u0099\u00a2\u00ad\u00af\u00b7\u00cc\u00d9\u00e5\u00e7\u00ed\u00f6"+
		"\u0103\u010f\u0111\u0122\u012b\u0134\u0145\u0156";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}