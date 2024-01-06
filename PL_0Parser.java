// Generated from /Users/jiaoao/Documents/大三上/编译原理/编译原理大作业/PL_0/src/PL_0.g4 by ANTLR 4.13.1
package PL_0;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class PL_0Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
			new PredictionContextCache();
	public static final int
			PROGRAM=1, BEGIN=2, END=3, CONST=4, VAR=5, WHILE=6, DO=7, IF=8, THEN=9,
			IDENTIFIER=10, INTEGER=11, PLUS=12, MINUS=13, STAR=14, SLASH=15, ASSIGN=16,
			EQUAL=17, NOT_EQUAL=18, GT=19, GE=20, LT=21, LE=22, LPAREN=23, RPAREN=24,
			SEMI=25, COMMA=26, WS=27;
	public static final int
			RULE_program = 0, RULE_programHeader = 1, RULE_block = 2, RULE_constDeclaration = 3,
			RULE_constDefinition = 4, RULE_varDeclaration = 5, RULE_statementPart = 6,
			RULE_compoundStatement = 7, RULE_statement = 8, RULE_assignmentStatement = 9,
			RULE_conditionStatement = 10, RULE_loopStatement = 11, RULE_emptyStatement = 12,
			RULE_expression = 13, RULE_term = 14, RULE_factor = 15, RULE_condition = 16;
	private static String[] makeRuleNames() {
		return new String[] {
				"program", "programHeader", "block", "constDeclaration", "constDefinition",
				"varDeclaration", "statementPart", "compoundStatement", "statement",
				"assignmentStatement", "conditionStatement", "loopStatement", "emptyStatement",
				"expression", "term", "factor", "condition"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
				null, "'PROGRAM'", "'BEGIN'", "'END'", "'CONST'", "'VAR'", "'WHILE'",
				"'DO'", "'IF'", "'THEN'", null, null, "'+'", "'-'", "'*'", "'/'", "':='",
				"'='", "'<>'", "'>'", "'>='", "'<'", "'<='", "'('", "')'", "';'", "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
				null, "PROGRAM", "BEGIN", "END", "CONST", "VAR", "WHILE", "DO", "IF",
				"THEN", "IDENTIFIER", "INTEGER", "PLUS", "MINUS", "STAR", "SLASH", "ASSIGN",
				"EQUAL", "NOT_EQUAL", "GT", "GE", "LT", "LE", "LPAREN", "RPAREN", "SEMI",
				"COMMA", "WS"
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
	public String getGrammarFileName() { return "PL_0.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PL_0Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public ProgramHeaderContext programHeader() {
			return getRuleContext(ProgramHeaderContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PL_0Listener ) ((PL_0Listener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PL_0Listener ) ((PL_0Listener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PL_0Visitor ) return ((PL_0Visitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(34);
				programHeader();
				setState(35);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramHeaderContext extends ParserRuleContext {
		public TerminalNode PROGRAM() { return getToken(PL_0Parser.PROGRAM, 0); }
		public TerminalNode IDENTIFIER() { return getToken(PL_0Parser.IDENTIFIER, 0); }
		public ProgramHeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programHeader; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PL_0Listener ) ((PL_0Listener)listener).enterProgramHeader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PL_0Listener ) ((PL_0Listener)listener).exitProgramHeader(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PL_0Visitor ) return ((PL_0Visitor<? extends T>)visitor).visitProgramHeader(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramHeaderContext programHeader() throws RecognitionException {
		ProgramHeaderContext _localctx = new ProgramHeaderContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_programHeader);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(37);
				match(PROGRAM);
				setState(38);
				match(IDENTIFIER);
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
	public static class BlockContext extends ParserRuleContext {
		public StatementPartContext statementPart() {
			return getRuleContext(StatementPartContext.class,0);
		}
		public ConstDeclarationContext constDeclaration() {
			return getRuleContext(ConstDeclarationContext.class,0);
		}
		public VarDeclarationContext varDeclaration() {
			return getRuleContext(VarDeclarationContext.class,0);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PL_0Listener ) ((PL_0Listener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PL_0Listener ) ((PL_0Listener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PL_0Visitor ) return ((PL_0Visitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(41);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CONST) {
					{
						setState(40);
						constDeclaration();
					}
				}

				setState(44);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VAR) {
					{
						setState(43);
						varDeclaration();
					}
				}

				setState(46);
				statementPart();
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
	public static class ConstDeclarationContext extends ParserRuleContext {
		public TerminalNode CONST() { return getToken(PL_0Parser.CONST, 0); }
		public List<ConstDefinitionContext> constDefinition() {
			return getRuleContexts(ConstDefinitionContext.class);
		}
		public ConstDefinitionContext constDefinition(int i) {
			return getRuleContext(ConstDefinitionContext.class,i);
		}
		public TerminalNode SEMI() { return getToken(PL_0Parser.SEMI, 0); }
		public List<TerminalNode> COMMA() { return getTokens(PL_0Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PL_0Parser.COMMA, i);
		}
		public ConstDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PL_0Listener ) ((PL_0Listener)listener).enterConstDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PL_0Listener ) ((PL_0Listener)listener).exitConstDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PL_0Visitor ) return ((PL_0Visitor<? extends T>)visitor).visitConstDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstDeclarationContext constDeclaration() throws RecognitionException {
		ConstDeclarationContext _localctx = new ConstDeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_constDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(48);
				match(CONST);
				setState(49);
				constDefinition();
				setState(54);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
						{
							setState(50);
							match(COMMA);
							setState(51);
							constDefinition();
						}
					}
					setState(56);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(57);
				match(SEMI);
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
	public static class ConstDefinitionContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(PL_0Parser.IDENTIFIER, 0); }
		public TerminalNode ASSIGN() { return getToken(PL_0Parser.ASSIGN, 0); }
		public TerminalNode INTEGER() { return getToken(PL_0Parser.INTEGER, 0); }
		public ConstDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PL_0Listener ) ((PL_0Listener)listener).enterConstDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PL_0Listener ) ((PL_0Listener)listener).exitConstDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PL_0Visitor ) return ((PL_0Visitor<? extends T>)visitor).visitConstDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstDefinitionContext constDefinition() throws RecognitionException {
		ConstDefinitionContext _localctx = new ConstDefinitionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_constDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(59);
				match(IDENTIFIER);
				setState(60);
				match(ASSIGN);
				setState(61);
				match(INTEGER);
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
	public static class VarDeclarationContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(PL_0Parser.VAR, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(PL_0Parser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(PL_0Parser.IDENTIFIER, i);
		}
		public TerminalNode SEMI() { return getToken(PL_0Parser.SEMI, 0); }
		public List<TerminalNode> COMMA() { return getTokens(PL_0Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PL_0Parser.COMMA, i);
		}
		public VarDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PL_0Listener ) ((PL_0Listener)listener).enterVarDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PL_0Listener ) ((PL_0Listener)listener).exitVarDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PL_0Visitor ) return ((PL_0Visitor<? extends T>)visitor).visitVarDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDeclarationContext varDeclaration() throws RecognitionException {
		VarDeclarationContext _localctx = new VarDeclarationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_varDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(63);
				match(VAR);
				setState(64);
				match(IDENTIFIER);
				setState(69);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
						{
							setState(65);
							match(COMMA);
							setState(66);
							match(IDENTIFIER);
						}
					}
					setState(71);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(72);
				match(SEMI);
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
	public static class StatementPartContext extends ParserRuleContext {
		public CompoundStatementContext compoundStatement() {
			return getRuleContext(CompoundStatementContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public StatementPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementPart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PL_0Listener ) ((PL_0Listener)listener).enterStatementPart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PL_0Listener ) ((PL_0Listener)listener).exitStatementPart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PL_0Visitor ) return ((PL_0Visitor<? extends T>)visitor).visitStatementPart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementPartContext statementPart() throws RecognitionException {
		StatementPartContext _localctx = new StatementPartContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_statementPart);
		try {
			setState(76);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					enterOuterAlt(_localctx, 1);
				{
					setState(74);
					compoundStatement();
				}
				break;
				case 2:
					enterOuterAlt(_localctx, 2);
				{
					setState(75);
					statement();
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
	public static class CompoundStatementContext extends ParserRuleContext {
		public TerminalNode BEGIN() { return getToken(PL_0Parser.BEGIN, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode END() { return getToken(PL_0Parser.END, 0); }
		public List<TerminalNode> SEMI() { return getTokens(PL_0Parser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(PL_0Parser.SEMI, i);
		}
		public CompoundStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compoundStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PL_0Listener ) ((PL_0Listener)listener).enterCompoundStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PL_0Listener ) ((PL_0Listener)listener).exitCompoundStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PL_0Visitor ) return ((PL_0Visitor<? extends T>)visitor).visitCompoundStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompoundStatementContext compoundStatement() throws RecognitionException {
		CompoundStatementContext _localctx = new CompoundStatementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_compoundStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(78);
				match(BEGIN);
				setState(79);
				statement();
				setState(84);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SEMI) {
					{
						{
							setState(80);
							match(SEMI);
							setState(81);
							statement();
						}
					}
					setState(86);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(87);
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

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public AssignmentStatementContext assignmentStatement() {
			return getRuleContext(AssignmentStatementContext.class,0);
		}
		public ConditionStatementContext conditionStatement() {
			return getRuleContext(ConditionStatementContext.class,0);
		}
		public LoopStatementContext loopStatement() {
			return getRuleContext(LoopStatementContext.class,0);
		}
		public CompoundStatementContext compoundStatement() {
			return getRuleContext(CompoundStatementContext.class,0);
		}
		public EmptyStatementContext emptyStatement() {
			return getRuleContext(EmptyStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PL_0Listener ) ((PL_0Listener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PL_0Listener ) ((PL_0Listener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PL_0Visitor ) return ((PL_0Visitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_statement);
		try {
			setState(94);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
				case IDENTIFIER:
					enterOuterAlt(_localctx, 1);
				{
					setState(89);
					assignmentStatement();
				}
				break;
				case IF:
					enterOuterAlt(_localctx, 2);
				{
					setState(90);
					conditionStatement();
				}
				break;
				case WHILE:
					enterOuterAlt(_localctx, 3);
				{
					setState(91);
					loopStatement();
				}
				break;
				case BEGIN:
					enterOuterAlt(_localctx, 4);
				{
					setState(92);
					compoundStatement();
				}
				break;
				case EOF:
				case END:
				case SEMI:
					enterOuterAlt(_localctx, 5);
				{
					setState(93);
					emptyStatement();
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
	public static class AssignmentStatementContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(PL_0Parser.IDENTIFIER, 0); }
		public TerminalNode ASSIGN() { return getToken(PL_0Parser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignmentStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PL_0Listener ) ((PL_0Listener)listener).enterAssignmentStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PL_0Listener ) ((PL_0Listener)listener).exitAssignmentStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PL_0Visitor ) return ((PL_0Visitor<? extends T>)visitor).visitAssignmentStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentStatementContext assignmentStatement() throws RecognitionException {
		AssignmentStatementContext _localctx = new AssignmentStatementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_assignmentStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(96);
				match(IDENTIFIER);
				setState(97);
				match(ASSIGN);
				setState(98);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ConditionStatementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(PL_0Parser.IF, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode THEN() { return getToken(PL_0Parser.THEN, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ConditionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PL_0Listener ) ((PL_0Listener)listener).enterConditionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PL_0Listener ) ((PL_0Listener)listener).exitConditionStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PL_0Visitor ) return ((PL_0Visitor<? extends T>)visitor).visitConditionStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionStatementContext conditionStatement() throws RecognitionException {
		ConditionStatementContext _localctx = new ConditionStatementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_conditionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(100);
				match(IF);
				setState(101);
				condition();
				setState(102);
				match(THEN);
				setState(103);
				statement();
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
	public static class LoopStatementContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(PL_0Parser.WHILE, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode DO() { return getToken(PL_0Parser.DO, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public LoopStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PL_0Listener ) ((PL_0Listener)listener).enterLoopStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PL_0Listener ) ((PL_0Listener)listener).exitLoopStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PL_0Visitor ) return ((PL_0Visitor<? extends T>)visitor).visitLoopStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopStatementContext loopStatement() throws RecognitionException {
		LoopStatementContext _localctx = new LoopStatementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_loopStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(105);
				match(WHILE);
				setState(106);
				condition();
				setState(107);
				match(DO);
				setState(108);
				statement();
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
	public static class EmptyStatementContext extends ParserRuleContext {
		public EmptyStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_emptyStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PL_0Listener ) ((PL_0Listener)listener).enterEmptyStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PL_0Listener ) ((PL_0Listener)listener).exitEmptyStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PL_0Visitor ) return ((PL_0Visitor<? extends T>)visitor).visitEmptyStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EmptyStatementContext emptyStatement() throws RecognitionException {
		EmptyStatementContext _localctx = new EmptyStatementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_emptyStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
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
	public static class ExpressionContext extends ParserRuleContext {
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public List<TerminalNode> PLUS() { return getTokens(PL_0Parser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(PL_0Parser.PLUS, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(PL_0Parser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(PL_0Parser.MINUS, i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PL_0Listener ) ((PL_0Listener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PL_0Listener ) ((PL_0Listener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PL_0Visitor ) return ((PL_0Visitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(112);
				term();
				setState(119);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==PLUS || _la==MINUS) {
					{
						setState(117);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
							case PLUS:
							{
								setState(113);
								match(PLUS);
								setState(114);
								term();
							}
							break;
							case MINUS:
							{
								setState(115);
								match(MINUS);
								setState(116);
								term();
							}
							break;
							default:
								throw new NoViableAltException(this);
						}
					}
					setState(121);
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
	public static class TermContext extends ParserRuleContext {
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public List<TerminalNode> STAR() { return getTokens(PL_0Parser.STAR); }
		public TerminalNode STAR(int i) {
			return getToken(PL_0Parser.STAR, i);
		}
		public List<TerminalNode> SLASH() { return getTokens(PL_0Parser.SLASH); }
		public TerminalNode SLASH(int i) {
			return getToken(PL_0Parser.SLASH, i);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PL_0Listener ) ((PL_0Listener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PL_0Listener ) ((PL_0Listener)listener).exitTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PL_0Visitor ) return ((PL_0Visitor<? extends T>)visitor).visitTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(122);
				factor();
				setState(129);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==STAR || _la==SLASH) {
					{
						setState(127);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
							case STAR:
							{
								setState(123);
								match(STAR);
								setState(124);
								factor();
							}
							break;
							case SLASH:
							{
								setState(125);
								match(SLASH);
								setState(126);
								factor();
							}
							break;
							default:
								throw new NoViableAltException(this);
						}
					}
					setState(131);
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
	public static class FactorContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(PL_0Parser.IDENTIFIER, 0); }
		public TerminalNode INTEGER() { return getToken(PL_0Parser.INTEGER, 0); }
		public TerminalNode LPAREN() { return getToken(PL_0Parser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(PL_0Parser.RPAREN, 0); }
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PL_0Listener ) ((PL_0Listener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PL_0Listener ) ((PL_0Listener)listener).exitFactor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PL_0Visitor ) return ((PL_0Visitor<? extends T>)visitor).visitFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_factor);
		try {
			setState(138);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
				case IDENTIFIER:
					enterOuterAlt(_localctx, 1);
				{
					setState(132);
					match(IDENTIFIER);
				}
				break;
				case INTEGER:
					enterOuterAlt(_localctx, 2);
				{
					setState(133);
					match(INTEGER);
				}
				break;
				case LPAREN:
					enterOuterAlt(_localctx, 3);
				{
					setState(134);
					match(LPAREN);
					setState(135);
					expression();
					setState(136);
					match(RPAREN);
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
	public static class ConditionContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode EQUAL() { return getToken(PL_0Parser.EQUAL, 0); }
		public TerminalNode NOT_EQUAL() { return getToken(PL_0Parser.NOT_EQUAL, 0); }
		public TerminalNode LT() { return getToken(PL_0Parser.LT, 0); }
		public TerminalNode LE() { return getToken(PL_0Parser.LE, 0); }
		public TerminalNode GT() { return getToken(PL_0Parser.GT, 0); }
		public TerminalNode GE() { return getToken(PL_0Parser.GE, 0); }
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PL_0Listener ) ((PL_0Listener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PL_0Listener ) ((PL_0Listener)listener).exitCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PL_0Visitor ) return ((PL_0Visitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_condition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(140);
				expression();
				setState(141);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 8257536L) != 0)) ) {
					_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(142);
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

	public static final String _serializedATN =
			"\u0004\u0001\u001b\u0091\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
					"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
					"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
					"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
					"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
					"\u000f\u0002\u0010\u0007\u0010\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
					"\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0003\u0002*\b\u0002\u0001"+
					"\u0002\u0003\u0002-\b\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001"+
					"\u0003\u0001\u0003\u0001\u0003\u0005\u00035\b\u0003\n\u0003\f\u00038\t"+
					"\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
					"\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005D\b"+
					"\u0005\n\u0005\f\u0005G\t\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001"+
					"\u0006\u0003\u0006M\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
					"\u0007\u0005\u0007S\b\u0007\n\u0007\f\u0007V\t\u0007\u0001\u0007\u0001"+
					"\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b_\b\b\u0001\t\u0001"+
					"\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b"+
					"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001"+
					"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0005\rv\b\r\n\r\f\ry\t\r\u0001\u000e"+
					"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0005\u000e\u0080\b\u000e"+
					"\n\u000e\f\u000e\u0083\t\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
					"\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u008b\b\u000f\u0001\u0010\u0001"+
					"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0000\u0000\u0011\u0000\u0002"+
					"\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e"+
					" \u0000\u0001\u0001\u0000\u0011\u0016\u008f\u0000\"\u0001\u0000\u0000"+
					"\u0000\u0002%\u0001\u0000\u0000\u0000\u0004)\u0001\u0000\u0000\u0000\u0006"+
					"0\u0001\u0000\u0000\u0000\b;\u0001\u0000\u0000\u0000\n?\u0001\u0000\u0000"+
					"\u0000\fL\u0001\u0000\u0000\u0000\u000eN\u0001\u0000\u0000\u0000\u0010"+
					"^\u0001\u0000\u0000\u0000\u0012`\u0001\u0000\u0000\u0000\u0014d\u0001"+
					"\u0000\u0000\u0000\u0016i\u0001\u0000\u0000\u0000\u0018n\u0001\u0000\u0000"+
					"\u0000\u001ap\u0001\u0000\u0000\u0000\u001cz\u0001\u0000\u0000\u0000\u001e"+
					"\u008a\u0001\u0000\u0000\u0000 \u008c\u0001\u0000\u0000\u0000\"#\u0003"+
					"\u0002\u0001\u0000#$\u0003\u0004\u0002\u0000$\u0001\u0001\u0000\u0000"+
					"\u0000%&\u0005\u0001\u0000\u0000&\'\u0005\n\u0000\u0000\'\u0003\u0001"+
					"\u0000\u0000\u0000(*\u0003\u0006\u0003\u0000)(\u0001\u0000\u0000\u0000"+
					")*\u0001\u0000\u0000\u0000*,\u0001\u0000\u0000\u0000+-\u0003\n\u0005\u0000"+
					",+\u0001\u0000\u0000\u0000,-\u0001\u0000\u0000\u0000-.\u0001\u0000\u0000"+
					"\u0000./\u0003\f\u0006\u0000/\u0005\u0001\u0000\u0000\u000001\u0005\u0004"+
					"\u0000\u000016\u0003\b\u0004\u000023\u0005\u001a\u0000\u000035\u0003\b"+
					"\u0004\u000042\u0001\u0000\u0000\u000058\u0001\u0000\u0000\u000064\u0001"+
					"\u0000\u0000\u000067\u0001\u0000\u0000\u000079\u0001\u0000\u0000\u0000"+
					"86\u0001\u0000\u0000\u00009:\u0005\u0019\u0000\u0000:\u0007\u0001\u0000"+
					"\u0000\u0000;<\u0005\n\u0000\u0000<=\u0005\u0010\u0000\u0000=>\u0005\u000b"+
					"\u0000\u0000>\t\u0001\u0000\u0000\u0000?@\u0005\u0005\u0000\u0000@E\u0005"+
					"\n\u0000\u0000AB\u0005\u001a\u0000\u0000BD\u0005\n\u0000\u0000CA\u0001"+
					"\u0000\u0000\u0000DG\u0001\u0000\u0000\u0000EC\u0001\u0000\u0000\u0000"+
					"EF\u0001\u0000\u0000\u0000FH\u0001\u0000\u0000\u0000GE\u0001\u0000\u0000"+
					"\u0000HI\u0005\u0019\u0000\u0000I\u000b\u0001\u0000\u0000\u0000JM\u0003"+
					"\u000e\u0007\u0000KM\u0003\u0010\b\u0000LJ\u0001\u0000\u0000\u0000LK\u0001"+
					"\u0000\u0000\u0000M\r\u0001\u0000\u0000\u0000NO\u0005\u0002\u0000\u0000"+
					"OT\u0003\u0010\b\u0000PQ\u0005\u0019\u0000\u0000QS\u0003\u0010\b\u0000"+
					"RP\u0001\u0000\u0000\u0000SV\u0001\u0000\u0000\u0000TR\u0001\u0000\u0000"+
					"\u0000TU\u0001\u0000\u0000\u0000UW\u0001\u0000\u0000\u0000VT\u0001\u0000"+
					"\u0000\u0000WX\u0005\u0003\u0000\u0000X\u000f\u0001\u0000\u0000\u0000"+
					"Y_\u0003\u0012\t\u0000Z_\u0003\u0014\n\u0000[_\u0003\u0016\u000b\u0000"+
					"\\_\u0003\u000e\u0007\u0000]_\u0003\u0018\f\u0000^Y\u0001\u0000\u0000"+
					"\u0000^Z\u0001\u0000\u0000\u0000^[\u0001\u0000\u0000\u0000^\\\u0001\u0000"+
					"\u0000\u0000^]\u0001\u0000\u0000\u0000_\u0011\u0001\u0000\u0000\u0000"+
					"`a\u0005\n\u0000\u0000ab\u0005\u0010\u0000\u0000bc\u0003\u001a\r\u0000"+
					"c\u0013\u0001\u0000\u0000\u0000de\u0005\b\u0000\u0000ef\u0003 \u0010\u0000"+
					"fg\u0005\t\u0000\u0000gh\u0003\u0010\b\u0000h\u0015\u0001\u0000\u0000"+
					"\u0000ij\u0005\u0006\u0000\u0000jk\u0003 \u0010\u0000kl\u0005\u0007\u0000"+
					"\u0000lm\u0003\u0010\b\u0000m\u0017\u0001\u0000\u0000\u0000no\u0001\u0000"+
					"\u0000\u0000o\u0019\u0001\u0000\u0000\u0000pw\u0003\u001c\u000e\u0000"+
					"qr\u0005\f\u0000\u0000rv\u0003\u001c\u000e\u0000st\u0005\r\u0000\u0000"+
					"tv\u0003\u001c\u000e\u0000uq\u0001\u0000\u0000\u0000us\u0001\u0000\u0000"+
					"\u0000vy\u0001\u0000\u0000\u0000wu\u0001\u0000\u0000\u0000wx\u0001\u0000"+
					"\u0000\u0000x\u001b\u0001\u0000\u0000\u0000yw\u0001\u0000\u0000\u0000"+
					"z\u0081\u0003\u001e\u000f\u0000{|\u0005\u000e\u0000\u0000|\u0080\u0003"+
					"\u001e\u000f\u0000}~\u0005\u000f\u0000\u0000~\u0080\u0003\u001e\u000f"+
					"\u0000\u007f{\u0001\u0000\u0000\u0000\u007f}\u0001\u0000\u0000\u0000\u0080"+
					"\u0083\u0001\u0000\u0000\u0000\u0081\u007f\u0001\u0000\u0000\u0000\u0081"+
					"\u0082\u0001\u0000\u0000\u0000\u0082\u001d\u0001\u0000\u0000\u0000\u0083"+
					"\u0081\u0001\u0000\u0000\u0000\u0084\u008b\u0005\n\u0000\u0000\u0085\u008b"+
					"\u0005\u000b\u0000\u0000\u0086\u0087\u0005\u0017\u0000\u0000\u0087\u0088"+
					"\u0003\u001a\r\u0000\u0088\u0089\u0005\u0018\u0000\u0000\u0089\u008b\u0001"+
					"\u0000\u0000\u0000\u008a\u0084\u0001\u0000\u0000\u0000\u008a\u0085\u0001"+
					"\u0000\u0000\u0000\u008a\u0086\u0001\u0000\u0000\u0000\u008b\u001f\u0001"+
					"\u0000\u0000\u0000\u008c\u008d\u0003\u001a\r\u0000\u008d\u008e\u0007\u0000"+
					"\u0000\u0000\u008e\u008f\u0003\u001a\r\u0000\u008f!\u0001\u0000\u0000"+
					"\u0000\f),6ELT^uw\u007f\u0081\u008a";
	public static final ATN _ATN =
			new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}