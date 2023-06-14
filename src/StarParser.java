// Generated from Star.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class StarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, FWRITE=7, FREAD=8, RANDOM=9, 
		LN=10, ARRAYADD=11, ARRAYSUBS=12, ARRAYDOT=13, ARRAYCROSS=14, SIN=15, 
		COS=16, TAN=17, ARCSIN=18, ACOS=19, ARCTAN=20, SINH=21, COSH=22, TANH=23, 
		IF=24, DEF=25, RETURN=26, MOD=27, VECTOR=28, INT=29, FLOAT=30, STRING=31, 
		MATRIX=32, BOOL=33, TMW=34, GT=35, LESS=36, EQ=37, GTH=38, LESSTH=39, 
		NOTEQ=40, FOR=41, ELSE=42, NOT=43, TRUE=44, FALSE=45, AND=46, OR=47, WHILE=48, 
		ALGORITHM=49, READ=50, WRITE=51, ADD=52, MULT=53, SUBS=54, DIV=55, POWER=56, 
		LEFTP=57, RIGHTP=58, COMMA=59, END=60, COLON=61, CADENA=62, ID=63, INTEGER=64, 
		REALNUMBER=65, WS=66;
	public static final int
		RULE_prog = 0, RULE_stat = 1, RULE_idlist = 2, RULE_type = 3, RULE_algorithm = 4, 
		RULE_statement = 5, RULE_fread_statement = 6, RULE_return_statement = 7, 
		RULE_while_statement = 8, RULE_if_statement = 9, RULE_for_statement = 10, 
		RULE_fun_statement = 11, RULE_relexpr = 12, RULE_bexpression = 13, RULE_bterm = 14, 
		RULE_bfactor = 15, RULE_read_statement = 16, RULE_write_statement = 17, 
		RULE_fwrite_statement = 18, RULE_block = 19, RULE_matrix = 20, RULE_array = 21, 
		RULE_assignment_statement = 22, RULE_value = 23, RULE_arrayexpr = 24, 
		RULE_trigFunction = 25, RULE_function = 26, RULE_mathFunction = 27, RULE_probFunction = 28, 
		RULE_randomFunction = 29, RULE_logFunction = 30, RULE_usefunction = 31, 
		RULE_algexpr = 32;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "stat", "idlist", "type", "algorithm", "statement", "fread_statement", 
			"return_statement", "while_statement", "if_statement", "for_statement", 
			"fun_statement", "relexpr", "bexpression", "bterm", "bfactor", "read_statement", 
			"write_statement", "fwrite_statement", "block", "matrix", "array", "assignment_statement", 
			"value", "arrayexpr", "trigFunction", "function", "mathFunction", "probFunction", 
			"randomFunction", "logFunction", "usefunction", "algexpr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'['", "']'", "'{'", "'}'", "'='", "'fwrite'", "'fread'", 
			"'random'", "'ln'", "'array.add'", "'array.substract'", "'array.dot'", 
			"'array.cross'", "'sin'", "'cos'", "'tan'", "'arcsin'", "'acos'", "'arctan'", 
			"'sinh'", "'cosh'", "'tanh'", "'if'", "'def'", "'return'", "'%'", "'vector'", 
			"'int'", "'float'", "'string'", "'matrix'", "'bool'", "'TMW'", "'>'", 
			"'<'", "'=='", "'>='", "'<='", "'!='", "'for'", "'else'", "'not'", "'true'", 
			"'false'", "'and'", "'or'", "'while'", "'algorithm'", "'read'", "'write'", 
			"'+'", "'*'", "'-'", "'/'", "'^'", "'('", "')'", "','", "'.'", "':'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, "FWRITE", "FREAD", "RANDOM", 
			"LN", "ARRAYADD", "ARRAYSUBS", "ARRAYDOT", "ARRAYCROSS", "SIN", "COS", 
			"TAN", "ARCSIN", "ACOS", "ARCTAN", "SINH", "COSH", "TANH", "IF", "DEF", 
			"RETURN", "MOD", "VECTOR", "INT", "FLOAT", "STRING", "MATRIX", "BOOL", 
			"TMW", "GT", "LESS", "EQ", "GTH", "LESSTH", "NOTEQ", "FOR", "ELSE", "NOT", 
			"TRUE", "FALSE", "AND", "OR", "WHILE", "ALGORITHM", "READ", "WRITE", 
			"ADD", "MULT", "SUBS", "DIV", "POWER", "LEFTP", "RIGHTP", "COMMA", "END", 
			"COLON", "CADENA", "ID", "INTEGER", "REALNUMBER", "WS"
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
	public String getGrammarFileName() { return "Star.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public StarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgContext extends ParserRuleContext {
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StarVisitor ) return ((StarVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
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
				stat();
				}
				}
				setState(69); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 7)) & ~0x3f) == 0 && ((1L << (_la - 7)) & 1082164031530205183L) != 0) );
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
	public static class StatContext extends ParserRuleContext {
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
	 
		public StatContext() { }
		public void copyFrom(StatContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ProbContext extends StatContext {
		public RandomFunctionContext randomFunction() {
			return getRuleContext(RandomFunctionContext.class,0);
		}
		public TerminalNode WS() { return getToken(StarParser.WS, 0); }
		public ProbContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StarVisitor ) return ((StarVisitor<? extends T>)visitor).visitProb(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BexprContext extends StatContext {
		public BexpressionContext bexpression() {
			return getRuleContext(BexpressionContext.class,0);
		}
		public BexprContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StarVisitor ) return ((StarVisitor<? extends T>)visitor).visitBexpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RelationalexpresionContext extends StatContext {
		public RelexprContext relexpr() {
			return getRuleContext(RelexprContext.class,0);
		}
		public RelationalexpresionContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StarVisitor ) return ((StarVisitor<? extends T>)visitor).visitRelationalexpresion(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ReadContext extends StatContext {
		public Read_statementContext read_statement() {
			return getRuleContext(Read_statementContext.class,0);
		}
		public ReadContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StarVisitor ) return ((StarVisitor<? extends T>)visitor).visitRead(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BlankContext extends StatContext {
		public TerminalNode WS() { return getToken(StarParser.WS, 0); }
		public BlankContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StarVisitor ) return ((StarVisitor<? extends T>)visitor).visitBlank(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunctionsContext extends StatContext {
		public Fun_statementContext fun_statement() {
			return getRuleContext(Fun_statementContext.class,0);
		}
		public TerminalNode WS() { return getToken(StarParser.WS, 0); }
		public FunctionsContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StarVisitor ) return ((StarVisitor<? extends T>)visitor).visitFunctions(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ForContext extends StatContext {
		public For_statementContext for_statement() {
			return getRuleContext(For_statementContext.class,0);
		}
		public ForContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StarVisitor ) return ((StarVisitor<? extends T>)visitor).visitFor(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FwriteContext extends StatContext {
		public Fwrite_statementContext fwrite_statement() {
			return getRuleContext(Fwrite_statementContext.class,0);
		}
		public TerminalNode WS() { return getToken(StarParser.WS, 0); }
		public FwriteContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StarVisitor ) return ((StarVisitor<? extends T>)visitor).visitFwrite(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TrigContext extends StatContext {
		public TrigFunctionContext trigFunction() {
			return getRuleContext(TrigFunctionContext.class,0);
		}
		public TerminalNode WS() { return getToken(StarParser.WS, 0); }
		public TrigContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StarVisitor ) return ((StarVisitor<? extends T>)visitor).visitTrig(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArrayfContext extends StatContext {
		public ArrayexprContext arrayexpr() {
			return getRuleContext(ArrayexprContext.class,0);
		}
		public TerminalNode WS() { return getToken(StarParser.WS, 0); }
		public ArrayfContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StarVisitor ) return ((StarVisitor<? extends T>)visitor).visitArrayf(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class WhileContext extends StatContext {
		public While_statementContext while_statement() {
			return getRuleContext(While_statementContext.class,0);
		}
		public WhileContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StarVisitor ) return ((StarVisitor<? extends T>)visitor).visitWhile(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FreadContext extends StatContext {
		public Fread_statementContext fread_statement() {
			return getRuleContext(Fread_statementContext.class,0);
		}
		public FreadContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StarVisitor ) return ((StarVisitor<? extends T>)visitor).visitFread(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UsefunContext extends StatContext {
		public UsefunctionContext usefunction() {
			return getRuleContext(UsefunctionContext.class,0);
		}
		public TerminalNode WS() { return getToken(StarParser.WS, 0); }
		public UsefunContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StarVisitor ) return ((StarVisitor<? extends T>)visitor).visitUsefun(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Return2Context extends StatContext {
		public Return_statementContext return_statement() {
			return getRuleContext(Return_statementContext.class,0);
		}
		public TerminalNode WS() { return getToken(StarParser.WS, 0); }
		public Return2Context(StatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StarVisitor ) return ((StarVisitor<? extends T>)visitor).visitReturn2(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AlgoritmoContext extends StatContext {
		public AlgorithmContext algorithm() {
			return getRuleContext(AlgorithmContext.class,0);
		}
		public AlgoritmoContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StarVisitor ) return ((StarVisitor<? extends T>)visitor).visitAlgoritmo(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IfContext extends StatContext {
		public If_statementContext if_statement() {
			return getRuleContext(If_statementContext.class,0);
		}
		public IfContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StarVisitor ) return ((StarVisitor<? extends T>)visitor).visitIf(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class WriteContext extends StatContext {
		public Write_statementContext write_statement() {
			return getRuleContext(Write_statementContext.class,0);
		}
		public TerminalNode WS() { return getToken(StarParser.WS, 0); }
		public WriteContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StarVisitor ) return ((StarVisitor<? extends T>)visitor).visitWrite(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PrintExprContext extends StatContext {
		public AlgexprContext algexpr() {
			return getRuleContext(AlgexprContext.class,0);
		}
		public TerminalNode WS() { return getToken(StarParser.WS, 0); }
		public PrintExprContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StarVisitor ) return ((StarVisitor<? extends T>)visitor).visitPrintExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AssignContext extends StatContext {
		public Assignment_statementContext assignment_statement() {
			return getRuleContext(Assignment_statementContext.class,0);
		}
		public TerminalNode WS() { return getToken(StarParser.WS, 0); }
		public AssignContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StarVisitor ) return ((StarVisitor<? extends T>)visitor).visitAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stat);
		try {
			setState(120);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				_localctx = new ProbContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(71);
				randomFunction();
				setState(73);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
				case 1:
					{
					setState(72);
					match(WS);
					}
					break;
				}
				}
				break;
			case 2:
				_localctx = new AlgoritmoContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(75);
				algorithm();
				}
				break;
			case 3:
				_localctx = new UsefunContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(76);
				usefunction();
				setState(78);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(77);
					match(WS);
					}
					break;
				}
				}
				break;
			case 4:
				_localctx = new ArrayfContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(80);
				arrayexpr();
				setState(82);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(81);
					match(WS);
					}
					break;
				}
				}
				break;
			case 5:
				_localctx = new PrintExprContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(84);
				algexpr(0);
				setState(86);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(85);
					match(WS);
					}
					break;
				}
				}
				break;
			case 6:
				_localctx = new AssignContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(88);
				assignment_statement();
				setState(90);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(89);
					match(WS);
					}
					break;
				}
				}
				break;
			case 7:
				_localctx = new BexprContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(92);
				bexpression(0);
				}
				break;
			case 8:
				_localctx = new WhileContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(93);
				while_statement();
				}
				break;
			case 9:
				_localctx = new IfContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(94);
				if_statement();
				}
				break;
			case 10:
				_localctx = new ForContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(95);
				for_statement();
				}
				break;
			case 11:
				_localctx = new RelationalexpresionContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(96);
				relexpr();
				}
				break;
			case 12:
				_localctx = new WriteContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(97);
				write_statement();
				setState(99);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(98);
					match(WS);
					}
					break;
				}
				}
				break;
			case 13:
				_localctx = new FwriteContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(101);
				fwrite_statement();
				setState(103);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					setState(102);
					match(WS);
					}
					break;
				}
				}
				break;
			case 14:
				_localctx = new ReadContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(105);
				read_statement();
				}
				break;
			case 15:
				_localctx = new FreadContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(106);
				fread_statement();
				}
				break;
			case 16:
				_localctx = new FunctionsContext(_localctx);
				enterOuterAlt(_localctx, 16);
				{
				setState(107);
				fun_statement();
				setState(109);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					setState(108);
					match(WS);
					}
					break;
				}
				}
				break;
			case 17:
				_localctx = new Return2Context(_localctx);
				enterOuterAlt(_localctx, 17);
				{
				setState(111);
				return_statement();
				setState(113);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
				case 1:
					{
					setState(112);
					match(WS);
					}
					break;
				}
				}
				break;
			case 18:
				_localctx = new TrigContext(_localctx);
				enterOuterAlt(_localctx, 18);
				{
				setState(115);
				trigFunction();
				setState(117);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
				case 1:
					{
					setState(116);
					match(WS);
					}
					break;
				}
				}
				break;
			case 19:
				_localctx = new BlankContext(_localctx);
				enterOuterAlt(_localctx, 19);
				{
				setState(119);
				match(WS);
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
	public static class IdlistContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(StarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(StarParser.ID, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(StarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(StarParser.COMMA, i);
		}
		public IdlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_idlist; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StarVisitor ) return ((StarVisitor<? extends T>)visitor).visitIdlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdlistContext idlist() throws RecognitionException {
		IdlistContext _localctx = new IdlistContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_idlist);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			match(ID);
			setState(127);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(123);
					match(COMMA);
					setState(124);
					match(ID);
					}
					} 
				}
				setState(129);
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
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeContext extends ParserRuleContext {
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	 
		public TypeContext() { }
		public void copyFrom(TypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TipoIntContext extends TypeContext {
		public TerminalNode INT() { return getToken(StarParser.INT, 0); }
		public TipoIntContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StarVisitor ) return ((StarVisitor<? extends T>)visitor).visitTipoInt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TipoFloatContext extends TypeContext {
		public TerminalNode FLOAT() { return getToken(StarParser.FLOAT, 0); }
		public TipoFloatContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StarVisitor ) return ((StarVisitor<? extends T>)visitor).visitTipoFloat(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TipoMatrixContext extends TypeContext {
		public TerminalNode MATRIX() { return getToken(StarParser.MATRIX, 0); }
		public TipoMatrixContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StarVisitor ) return ((StarVisitor<? extends T>)visitor).visitTipoMatrix(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TipoTMWContext extends TypeContext {
		public TerminalNode TMW() { return getToken(StarParser.TMW, 0); }
		public TipoTMWContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StarVisitor ) return ((StarVisitor<? extends T>)visitor).visitTipoTMW(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TipoVectorContext extends TypeContext {
		public TerminalNode VECTOR() { return getToken(StarParser.VECTOR, 0); }
		public TipoVectorContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StarVisitor ) return ((StarVisitor<? extends T>)visitor).visitTipoVector(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TipoStringContext extends TypeContext {
		public TerminalNode STRING() { return getToken(StarParser.STRING, 0); }
		public TipoStringContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StarVisitor ) return ((StarVisitor<? extends T>)visitor).visitTipoString(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TipoBoolContext extends TypeContext {
		public TerminalNode BOOL() { return getToken(StarParser.BOOL, 0); }
		public TipoBoolContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StarVisitor ) return ((StarVisitor<? extends T>)visitor).visitTipoBool(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_type);
		try {
			setState(137);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				_localctx = new TipoIntContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(130);
				match(INT);
				}
				break;
			case FLOAT:
				_localctx = new TipoFloatContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(131);
				match(FLOAT);
				}
				break;
			case STRING:
				_localctx = new TipoStringContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(132);
				match(STRING);
				}
				break;
			case BOOL:
				_localctx = new TipoBoolContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(133);
				match(BOOL);
				}
				break;
			case MATRIX:
				_localctx = new TipoMatrixContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(134);
				match(MATRIX);
				}
				break;
			case VECTOR:
				_localctx = new TipoVectorContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(135);
				match(VECTOR);
				}
				break;
			case TMW:
				_localctx = new TipoTMWContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(136);
				match(TMW);
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
	public static class AlgorithmContext extends ParserRuleContext {
		public TerminalNode ALGORITHM() { return getToken(StarParser.ALGORITHM, 0); }
		public TerminalNode ID() { return getToken(StarParser.ID, 0); }
		public TerminalNode COLON() { return getToken(StarParser.COLON, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode END() { return getToken(StarParser.END, 0); }
		public TerminalNode LEFTP() { return getToken(StarParser.LEFTP, 0); }
		public IdlistContext idlist() {
			return getRuleContext(IdlistContext.class,0);
		}
		public TerminalNode RIGHTP() { return getToken(StarParser.RIGHTP, 0); }
		public TerminalNode WS() { return getToken(StarParser.WS, 0); }
		public AlgorithmContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_algorithm; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StarVisitor ) return ((StarVisitor<? extends T>)visitor).visitAlgorithm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlgorithmContext algorithm() throws RecognitionException {
		AlgorithmContext _localctx = new AlgorithmContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_algorithm);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			match(ALGORITHM);
			setState(140);
			match(ID);
			setState(145);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LEFTP) {
				{
				setState(141);
				match(LEFTP);
				setState(142);
				idlist();
				setState(143);
				match(RIGHTP);
				}
			}

			setState(147);
			match(COLON);
			setState(149);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(148);
				match(WS);
				}
			}

			setState(151);
			statement();
			setState(152);
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
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Read_statementContext read_statement() {
			return getRuleContext(Read_statementContext.class,0);
		}
		public Fread_statementContext fread_statement() {
			return getRuleContext(Fread_statementContext.class,0);
		}
		public Write_statementContext write_statement() {
			return getRuleContext(Write_statementContext.class,0);
		}
		public Fwrite_statementContext fwrite_statement() {
			return getRuleContext(Fwrite_statementContext.class,0);
		}
		public While_statementContext while_statement() {
			return getRuleContext(While_statementContext.class,0);
		}
		public If_statementContext if_statement() {
			return getRuleContext(If_statementContext.class,0);
		}
		public For_statementContext for_statement() {
			return getRuleContext(For_statementContext.class,0);
		}
		public Fun_statementContext fun_statement() {
			return getRuleContext(Fun_statementContext.class,0);
		}
		public UsefunctionContext usefunction() {
			return getRuleContext(UsefunctionContext.class,0);
		}
		public Assignment_statementContext assignment_statement() {
			return getRuleContext(Assignment_statementContext.class,0);
		}
		public Return_statementContext return_statement() {
			return getRuleContext(Return_statementContext.class,0);
		}
		public AlgexprContext algexpr() {
			return getRuleContext(AlgexprContext.class,0);
		}
		public ArrayexprContext arrayexpr() {
			return getRuleContext(ArrayexprContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StarVisitor ) return ((StarVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_statement);
		try {
			setState(168);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(154);
				block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(155);
				read_statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(156);
				fread_statement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(157);
				write_statement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(158);
				fwrite_statement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(159);
				while_statement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(160);
				if_statement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(161);
				for_statement();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(162);
				fun_statement();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(163);
				usefunction();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(164);
				assignment_statement();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(165);
				return_statement();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(166);
				algexpr(0);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(167);
				arrayexpr();
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
	public static class Fread_statementContext extends ParserRuleContext {
		public TerminalNode FREAD() { return getToken(StarParser.FREAD, 0); }
		public TerminalNode LEFTP() { return getToken(StarParser.LEFTP, 0); }
		public IdlistContext idlist() {
			return getRuleContext(IdlistContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(StarParser.COMMA, 0); }
		public TerminalNode RIGHTP() { return getToken(StarParser.RIGHTP, 0); }
		public List<TerminalNode> CADENA() { return getTokens(StarParser.CADENA); }
		public TerminalNode CADENA(int i) {
			return getToken(StarParser.CADENA, i);
		}
		public Fread_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fread_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StarVisitor ) return ((StarVisitor<? extends T>)visitor).visitFread_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Fread_statementContext fread_statement() throws RecognitionException {
		Fread_statementContext _localctx = new Fread_statementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_fread_statement);
		int _la;
		try {
			setState(187);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(170);
				match(FREAD);
				setState(171);
				match(LEFTP);
				setState(172);
				idlist();
				setState(173);
				match(COMMA);
				setState(175);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CADENA) {
					{
					setState(174);
					match(CADENA);
					}
				}

				setState(177);
				match(RIGHTP);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(179);
				match(FREAD);
				setState(180);
				match(LEFTP);
				setState(181);
				match(CADENA);
				setState(182);
				match(COMMA);
				setState(184);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CADENA) {
					{
					setState(183);
					match(CADENA);
					}
				}

				setState(186);
				match(RIGHTP);
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
	public static class Return_statementContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(StarParser.RETURN, 0); }
		public UsefunctionContext usefunction() {
			return getRuleContext(UsefunctionContext.class,0);
		}
		public AlgexprContext algexpr() {
			return getRuleContext(AlgexprContext.class,0);
		}
		public Return_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StarVisitor ) return ((StarVisitor<? extends T>)visitor).visitReturn_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Return_statementContext return_statement() throws RecognitionException {
		Return_statementContext _localctx = new Return_statementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_return_statement);
		try {
			setState(193);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(189);
				match(RETURN);
				setState(190);
				usefunction();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(191);
				match(RETURN);
				setState(192);
				algexpr(0);
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
	public static class While_statementContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(StarParser.WHILE, 0); }
		public BexpressionContext bexpression() {
			return getRuleContext(BexpressionContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public While_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StarVisitor ) return ((StarVisitor<? extends T>)visitor).visitWhile_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_statementContext while_statement() throws RecognitionException {
		While_statementContext _localctx = new While_statementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_while_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			match(WHILE);
			setState(196);
			bexpression(0);
			setState(197);
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
	public static class If_statementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(StarParser.IF, 0); }
		public BexpressionContext bexpression() {
			return getRuleContext(BexpressionContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<TerminalNode> WS() { return getTokens(StarParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(StarParser.WS, i);
		}
		public TerminalNode ELSE() { return getToken(StarParser.ELSE, 0); }
		public If_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StarVisitor ) return ((StarVisitor<? extends T>)visitor).visitIf_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_statementContext if_statement() throws RecognitionException {
		If_statementContext _localctx = new If_statementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_if_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			match(IF);
			setState(200);
			bexpression(0);
			setState(201);
			statement();
			setState(203);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(202);
				match(WS);
				}
				break;
			}
			setState(210);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				setState(205);
				match(ELSE);
				setState(207);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(206);
					match(WS);
					}
				}

				setState(209);
				statement();
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

	@SuppressWarnings("CheckReturnValue")
	public static class For_statementContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(StarParser.FOR, 0); }
		public List<Assignment_statementContext> assignment_statement() {
			return getRuleContexts(Assignment_statementContext.class);
		}
		public Assignment_statementContext assignment_statement(int i) {
			return getRuleContext(Assignment_statementContext.class,i);
		}
		public BexpressionContext bexpression() {
			return getRuleContext(BexpressionContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode WS() { return getToken(StarParser.WS, 0); }
		public TerminalNode LEFTP() { return getToken(StarParser.LEFTP, 0); }
		public TerminalNode RIGHTP() { return getToken(StarParser.RIGHTP, 0); }
		public For_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StarVisitor ) return ((StarVisitor<? extends T>)visitor).visitFor_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_statementContext for_statement() throws RecognitionException {
		For_statementContext _localctx = new For_statementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_for_statement);
		int _la;
		try {
			setState(234);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(212);
				match(FOR);
				setState(213);
				assignment_statement();
				setState(214);
				match(T__0);
				setState(215);
				bexpression(0);
				setState(216);
				match(T__0);
				setState(217);
				assignment_statement();
				setState(218);
				match(T__0);
				setState(220);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(219);
					match(WS);
					}
				}

				setState(222);
				statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(224);
				match(FOR);
				setState(225);
				match(LEFTP);
				setState(226);
				assignment_statement();
				setState(227);
				match(T__0);
				setState(228);
				bexpression(0);
				setState(229);
				match(T__0);
				setState(230);
				assignment_statement();
				setState(231);
				match(RIGHTP);
				setState(232);
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
	public static class Fun_statementContext extends ParserRuleContext {
		public TerminalNode DEF() { return getToken(StarParser.DEF, 0); }
		public TerminalNode ID() { return getToken(StarParser.ID, 0); }
		public TerminalNode LEFTP() { return getToken(StarParser.LEFTP, 0); }
		public IdlistContext idlist() {
			return getRuleContext(IdlistContext.class,0);
		}
		public TerminalNode RIGHTP() { return getToken(StarParser.RIGHTP, 0); }
		public TerminalNode COLON() { return getToken(StarParser.COLON, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode WS() { return getToken(StarParser.WS, 0); }
		public Fun_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fun_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StarVisitor ) return ((StarVisitor<? extends T>)visitor).visitFun_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Fun_statementContext fun_statement() throws RecognitionException {
		Fun_statementContext _localctx = new Fun_statementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_fun_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
			match(DEF);
			setState(237);
			match(ID);
			setState(238);
			match(LEFTP);
			setState(239);
			idlist();
			setState(240);
			match(RIGHTP);
			setState(241);
			match(COLON);
			setState(243);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(242);
				match(WS);
				}
			}

			setState(245);
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
	public static class RelexprContext extends ParserRuleContext {
		public Token opl;
		public List<AlgexprContext> algexpr() {
			return getRuleContexts(AlgexprContext.class);
		}
		public AlgexprContext algexpr(int i) {
			return getRuleContext(AlgexprContext.class,i);
		}
		public TerminalNode GT() { return getToken(StarParser.GT, 0); }
		public TerminalNode LESS() { return getToken(StarParser.LESS, 0); }
		public TerminalNode EQ() { return getToken(StarParser.EQ, 0); }
		public TerminalNode GTH() { return getToken(StarParser.GTH, 0); }
		public TerminalNode LESSTH() { return getToken(StarParser.LESSTH, 0); }
		public TerminalNode NOTEQ() { return getToken(StarParser.NOTEQ, 0); }
		public RelexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relexpr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StarVisitor ) return ((StarVisitor<? extends T>)visitor).visitRelexpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelexprContext relexpr() throws RecognitionException {
		RelexprContext _localctx = new RelexprContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_relexpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(247);
			algexpr(0);
			setState(248);
			((RelexprContext)_localctx).opl = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 2164663517184L) != 0)) ) {
				((RelexprContext)_localctx).opl = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(249);
			algexpr(0);
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
	public static class BexpressionContext extends ParserRuleContext {
		public BexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bexpression; }
	 
		public BexpressionContext() { }
		public void copyFrom(BexpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Bexp1Context extends BexpressionContext {
		public BexpressionContext bexpression() {
			return getRuleContext(BexpressionContext.class,0);
		}
		public TerminalNode OR() { return getToken(StarParser.OR, 0); }
		public BtermContext bterm() {
			return getRuleContext(BtermContext.class,0);
		}
		public Bexp1Context(BexpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StarVisitor ) return ((StarVisitor<? extends T>)visitor).visitBexp1(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Bexp2Context extends BexpressionContext {
		public BtermContext bterm() {
			return getRuleContext(BtermContext.class,0);
		}
		public Bexp2Context(BexpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StarVisitor ) return ((StarVisitor<? extends T>)visitor).visitBexp2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BexpressionContext bexpression() throws RecognitionException {
		return bexpression(0);
	}

	private BexpressionContext bexpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BexpressionContext _localctx = new BexpressionContext(_ctx, _parentState);
		BexpressionContext _prevctx = _localctx;
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_bexpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new Bexp2Context(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(252);
			bterm(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(259);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Bexp1Context(new BexpressionContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_bexpression);
					setState(254);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(255);
					match(OR);
					setState(256);
					bterm(0);
					}
					} 
				}
				setState(261);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class BtermContext extends ParserRuleContext {
		public BtermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bterm; }
	 
		public BtermContext() { }
		public void copyFrom(BtermContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Bterm2Context extends BtermContext {
		public BfactorContext bfactor() {
			return getRuleContext(BfactorContext.class,0);
		}
		public Bterm2Context(BtermContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StarVisitor ) return ((StarVisitor<? extends T>)visitor).visitBterm2(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Bterm1Context extends BtermContext {
		public BtermContext bterm() {
			return getRuleContext(BtermContext.class,0);
		}
		public TerminalNode AND() { return getToken(StarParser.AND, 0); }
		public BfactorContext bfactor() {
			return getRuleContext(BfactorContext.class,0);
		}
		public Bterm1Context(BtermContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StarVisitor ) return ((StarVisitor<? extends T>)visitor).visitBterm1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BtermContext bterm() throws RecognitionException {
		return bterm(0);
	}

	private BtermContext bterm(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BtermContext _localctx = new BtermContext(_ctx, _parentState);
		BtermContext _prevctx = _localctx;
		int _startState = 28;
		enterRecursionRule(_localctx, 28, RULE_bterm, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new Bterm2Context(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(263);
			bfactor();
			}
			_ctx.stop = _input.LT(-1);
			setState(270);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Bterm1Context(new BtermContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_bterm);
					setState(265);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(266);
					match(AND);
					setState(267);
					bfactor();
					}
					} 
				}
				setState(272);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class BfactorContext extends ParserRuleContext {
		public BfactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bfactor; }
	 
		public BfactorContext() { }
		public void copyFrom(BfactorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BParenthesisContext extends BfactorContext {
		public TerminalNode LEFTP() { return getToken(StarParser.LEFTP, 0); }
		public BexpressionContext bexpression() {
			return getRuleContext(BexpressionContext.class,0);
		}
		public TerminalNode RIGHTP() { return getToken(StarParser.RIGHTP, 0); }
		public BParenthesisContext(BfactorContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StarVisitor ) return ((StarVisitor<? extends T>)visitor).visitBParenthesis(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BFalseContext extends BfactorContext {
		public TerminalNode FALSE() { return getToken(StarParser.FALSE, 0); }
		public BFalseContext(BfactorContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StarVisitor ) return ((StarVisitor<? extends T>)visitor).visitBFalse(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BNegContext extends BfactorContext {
		public TerminalNode NOT() { return getToken(StarParser.NOT, 0); }
		public BfactorContext bfactor() {
			return getRuleContext(BfactorContext.class,0);
		}
		public BNegContext(BfactorContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StarVisitor ) return ((StarVisitor<? extends T>)visitor).visitBNeg(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RelParenthesisContext extends BfactorContext {
		public TerminalNode LEFTP() { return getToken(StarParser.LEFTP, 0); }
		public RelexprContext relexpr() {
			return getRuleContext(RelexprContext.class,0);
		}
		public TerminalNode RIGHTP() { return getToken(StarParser.RIGHTP, 0); }
		public RelParenthesisContext(BfactorContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StarVisitor ) return ((StarVisitor<? extends T>)visitor).visitRelParenthesis(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BIDContext extends BfactorContext {
		public TerminalNode ID() { return getToken(StarParser.ID, 0); }
		public BIDContext(BfactorContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StarVisitor ) return ((StarVisitor<? extends T>)visitor).visitBID(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BTrueContext extends BfactorContext {
		public TerminalNode TRUE() { return getToken(StarParser.TRUE, 0); }
		public BTrueContext(BfactorContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StarVisitor ) return ((StarVisitor<? extends T>)visitor).visitBTrue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RelationalsContext extends BfactorContext {
		public RelexprContext relexpr() {
			return getRuleContext(RelexprContext.class,0);
		}
		public RelationalsContext(BfactorContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StarVisitor ) return ((StarVisitor<? extends T>)visitor).visitRelationals(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BfactorContext bfactor() throws RecognitionException {
		BfactorContext _localctx = new BfactorContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_bfactor);
		try {
			setState(287);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				_localctx = new BNegContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(273);
				match(NOT);
				setState(274);
				bfactor();
				}
				break;
			case 2:
				_localctx = new BParenthesisContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(275);
				match(LEFTP);
				setState(276);
				bexpression(0);
				setState(277);
				match(RIGHTP);
				}
				break;
			case 3:
				_localctx = new BIDContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(279);
				match(ID);
				}
				break;
			case 4:
				_localctx = new BTrueContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(280);
				match(TRUE);
				}
				break;
			case 5:
				_localctx = new BFalseContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(281);
				match(FALSE);
				}
				break;
			case 6:
				_localctx = new RelationalsContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(282);
				relexpr();
				}
				break;
			case 7:
				_localctx = new RelParenthesisContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(283);
				match(LEFTP);
				setState(284);
				relexpr();
				setState(285);
				match(RIGHTP);
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
	public static class Read_statementContext extends ParserRuleContext {
		public TerminalNode READ() { return getToken(StarParser.READ, 0); }
		public TerminalNode LEFTP() { return getToken(StarParser.LEFTP, 0); }
		public IdlistContext idlist() {
			return getRuleContext(IdlistContext.class,0);
		}
		public TerminalNode RIGHTP() { return getToken(StarParser.RIGHTP, 0); }
		public TerminalNode CADENA() { return getToken(StarParser.CADENA, 0); }
		public Read_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_read_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StarVisitor ) return ((StarVisitor<? extends T>)visitor).visitRead_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Read_statementContext read_statement() throws RecognitionException {
		Read_statementContext _localctx = new Read_statementContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_read_statement);
		try {
			setState(298);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(289);
				match(READ);
				setState(290);
				match(LEFTP);
				setState(291);
				idlist();
				setState(292);
				match(RIGHTP);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(294);
				match(READ);
				setState(295);
				match(LEFTP);
				setState(296);
				match(CADENA);
				setState(297);
				match(RIGHTP);
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
	public static class Write_statementContext extends ParserRuleContext {
		public TerminalNode WRITE() { return getToken(StarParser.WRITE, 0); }
		public TerminalNode LEFTP() { return getToken(StarParser.LEFTP, 0); }
		public IdlistContext idlist() {
			return getRuleContext(IdlistContext.class,0);
		}
		public TerminalNode RIGHTP() { return getToken(StarParser.RIGHTP, 0); }
		public AlgexprContext algexpr() {
			return getRuleContext(AlgexprContext.class,0);
		}
		public TerminalNode CADENA() { return getToken(StarParser.CADENA, 0); }
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public List<TerminalNode> INTEGER() { return getTokens(StarParser.INTEGER); }
		public TerminalNode INTEGER(int i) {
			return getToken(StarParser.INTEGER, i);
		}
		public UsefunctionContext usefunction() {
			return getRuleContext(UsefunctionContext.class,0);
		}
		public ArrayexprContext arrayexpr() {
			return getRuleContext(ArrayexprContext.class,0);
		}
		public MatrixContext matrix() {
			return getRuleContext(MatrixContext.class,0);
		}
		public Write_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_write_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StarVisitor ) return ((StarVisitor<? extends T>)visitor).visitWrite_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Write_statementContext write_statement() throws RecognitionException {
		Write_statementContext _localctx = new Write_statementContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_write_statement);
		int _la;
		try {
			setState(344);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(300);
				match(WRITE);
				setState(301);
				match(LEFTP);
				setState(302);
				idlist();
				setState(303);
				match(RIGHTP);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(305);
				match(WRITE);
				setState(306);
				match(LEFTP);
				setState(307);
				algexpr(0);
				setState(308);
				match(RIGHTP);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(310);
				match(WRITE);
				setState(311);
				match(LEFTP);
				setState(312);
				match(CADENA);
				setState(313);
				match(RIGHTP);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(314);
				match(WRITE);
				setState(315);
				match(LEFTP);
				setState(316);
				array();
				setState(317);
				match(T__1);
				setState(318);
				match(INTEGER);
				setState(319);
				match(T__2);
				setState(320);
				match(RIGHTP);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(322);
				match(WRITE);
				setState(323);
				match(LEFTP);
				setState(324);
				usefunction();
				setState(325);
				match(RIGHTP);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(327);
				match(WRITE);
				setState(328);
				match(LEFTP);
				setState(329);
				arrayexpr();
				setState(330);
				match(RIGHTP);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(332);
				match(WRITE);
				setState(333);
				match(LEFTP);
				setState(334);
				matrix();
				setState(338); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(335);
					match(T__1);
					setState(336);
					match(INTEGER);
					setState(337);
					match(T__2);
					}
					}
					setState(340); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__1 );
				setState(342);
				match(RIGHTP);
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
	public static class Fwrite_statementContext extends ParserRuleContext {
		public TerminalNode FWRITE() { return getToken(StarParser.FWRITE, 0); }
		public TerminalNode LEFTP() { return getToken(StarParser.LEFTP, 0); }
		public IdlistContext idlist() {
			return getRuleContext(IdlistContext.class,0);
		}
		public List<TerminalNode> CADENA() { return getTokens(StarParser.CADENA); }
		public TerminalNode CADENA(int i) {
			return getToken(StarParser.CADENA, i);
		}
		public TerminalNode RIGHTP() { return getToken(StarParser.RIGHTP, 0); }
		public TerminalNode COMMA() { return getToken(StarParser.COMMA, 0); }
		public AlgexprContext algexpr() {
			return getRuleContext(AlgexprContext.class,0);
		}
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public List<TerminalNode> INTEGER() { return getTokens(StarParser.INTEGER); }
		public TerminalNode INTEGER(int i) {
			return getToken(StarParser.INTEGER, i);
		}
		public UsefunctionContext usefunction() {
			return getRuleContext(UsefunctionContext.class,0);
		}
		public ArrayexprContext arrayexpr() {
			return getRuleContext(ArrayexprContext.class,0);
		}
		public MatrixContext matrix() {
			return getRuleContext(MatrixContext.class,0);
		}
		public Fwrite_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fwrite_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StarVisitor ) return ((StarVisitor<? extends T>)visitor).visitFwrite_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Fwrite_statementContext fwrite_statement() throws RecognitionException {
		Fwrite_statementContext _localctx = new Fwrite_statementContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_fwrite_statement);
		int _la;
		try {
			setState(418);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(346);
				match(FWRITE);
				setState(347);
				match(LEFTP);
				setState(348);
				idlist();
				setState(350);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(349);
					match(COMMA);
					}
				}

				setState(352);
				match(CADENA);
				setState(353);
				match(RIGHTP);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(355);
				match(FWRITE);
				setState(356);
				match(LEFTP);
				setState(357);
				algexpr(0);
				setState(359);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(358);
					match(COMMA);
					}
				}

				setState(361);
				match(CADENA);
				setState(362);
				match(RIGHTP);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(364);
				match(FWRITE);
				setState(365);
				match(LEFTP);
				setState(366);
				match(CADENA);
				setState(368);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(367);
					match(COMMA);
					}
				}

				setState(370);
				match(CADENA);
				setState(371);
				match(RIGHTP);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(372);
				match(FWRITE);
				setState(373);
				match(LEFTP);
				setState(374);
				array();
				setState(376);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(375);
					match(COMMA);
					}
				}

				setState(378);
				match(CADENA);
				setState(379);
				match(T__1);
				setState(380);
				match(INTEGER);
				setState(381);
				match(T__2);
				setState(382);
				match(RIGHTP);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(384);
				match(FWRITE);
				setState(385);
				match(LEFTP);
				setState(386);
				usefunction();
				setState(388);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(387);
					match(COMMA);
					}
				}

				setState(390);
				match(CADENA);
				setState(391);
				match(RIGHTP);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(393);
				match(FWRITE);
				setState(394);
				match(LEFTP);
				setState(395);
				arrayexpr();
				setState(397);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(396);
					match(COMMA);
					}
				}

				setState(399);
				match(CADENA);
				setState(400);
				match(RIGHTP);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(402);
				match(FWRITE);
				setState(403);
				match(LEFTP);
				setState(404);
				matrix();
				setState(408); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(405);
					match(T__1);
					setState(406);
					match(INTEGER);
					setState(407);
					match(T__2);
					}
					}
					setState(410); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__1 );
				setState(413);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(412);
					match(COMMA);
					}
				}

				setState(415);
				match(CADENA);
				setState(416);
				match(RIGHTP);
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
	public static class BlockContext extends ParserRuleContext {
		public List<TerminalNode> WS() { return getTokens(StarParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(StarParser.WS, i);
		}
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StarVisitor ) return ((StarVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(420);
			match(T__3);
			setState(422);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(421);
				match(WS);
				}
			}

			setState(431);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 4)) & ~0x3f) == 0 && ((1L << (_la - 4)) & 4045587201151467513L) != 0)) {
				{
				{
				setState(424);
				statement();
				setState(425);
				match(T__0);
				setState(427);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(426);
					match(WS);
					}
				}

				}
				}
				setState(433);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(434);
			match(T__4);
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
	public static class MatrixContext extends ParserRuleContext {
		public List<ArrayContext> array() {
			return getRuleContexts(ArrayContext.class);
		}
		public ArrayContext array(int i) {
			return getRuleContext(ArrayContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(StarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(StarParser.COMMA, i);
		}
		public TerminalNode ID() { return getToken(StarParser.ID, 0); }
		public MatrixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matrix; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StarVisitor ) return ((StarVisitor<? extends T>)visitor).visitMatrix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MatrixContext matrix() throws RecognitionException {
		MatrixContext _localctx = new MatrixContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_matrix);
		int _la;
		try {
			setState(448);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(436);
				match(T__1);
				setState(441); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(437);
					array();
					setState(439);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==COMMA) {
						{
						setState(438);
						match(COMMA);
						}
					}

					}
					}
					setState(443); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & -9223372036854745084L) != 0) );
				setState(445);
				match(T__2);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(447);
				match(ID);
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
	public static class ArrayContext extends ParserRuleContext {
		public List<AlgexprContext> algexpr() {
			return getRuleContexts(AlgexprContext.class);
		}
		public AlgexprContext algexpr(int i) {
			return getRuleContext(AlgexprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(StarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(StarParser.COMMA, i);
		}
		public TerminalNode ID() { return getToken(StarParser.ID, 0); }
		public ArrayexprContext arrayexpr() {
			return getRuleContext(ArrayexprContext.class,0);
		}
		public ArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StarVisitor ) return ((StarVisitor<? extends T>)visitor).visitArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayContext array() throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_array);
		int _la;
		try {
			setState(463);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(450);
				match(T__1);
				setState(455); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(451);
					algexpr(0);
					setState(453);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==COMMA) {
						{
						setState(452);
						match(COMMA);
						}
					}

					}
					}
					setState(457); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 9)) & ~0x3f) == 0 && ((1L << (_la - 9)) & 126417448915206083L) != 0) );
				setState(459);
				match(T__2);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(461);
				match(ID);
				}
				break;
			case ARRAYADD:
			case ARRAYSUBS:
			case ARRAYDOT:
			case ARRAYCROSS:
				enterOuterAlt(_localctx, 3);
				{
				setState(462);
				arrayexpr();
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
	public static class Assignment_statementContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(StarParser.ID, 0); }
		public UsefunctionContext usefunction() {
			return getRuleContext(UsefunctionContext.class,0);
		}
		public AlgexprContext algexpr() {
			return getRuleContext(AlgexprContext.class,0);
		}
		public TerminalNode CADENA() { return getToken(StarParser.CADENA, 0); }
		public MatrixContext matrix() {
			return getRuleContext(MatrixContext.class,0);
		}
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public Assignment_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StarVisitor ) return ((StarVisitor<? extends T>)visitor).visitAssignment_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assignment_statementContext assignment_statement() throws RecognitionException {
		Assignment_statementContext _localctx = new Assignment_statementContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_assignment_statement);
		try {
			setState(480);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(465);
				match(ID);
				setState(466);
				match(T__5);
				setState(467);
				usefunction();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(468);
				match(ID);
				setState(469);
				match(T__5);
				setState(470);
				algexpr(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(471);
				match(ID);
				setState(472);
				match(T__5);
				setState(473);
				match(CADENA);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(474);
				match(ID);
				setState(475);
				match(T__5);
				setState(476);
				matrix();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(477);
				match(ID);
				setState(478);
				match(T__5);
				setState(479);
				array();
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
	public static class ValueContext extends ParserRuleContext {
		public AlgexprContext algexpr() {
			return getRuleContext(AlgexprContext.class,0);
		}
		public BexpressionContext bexpression() {
			return getRuleContext(BexpressionContext.class,0);
		}
		public TerminalNode CADENA() { return getToken(StarParser.CADENA, 0); }
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StarVisitor ) return ((StarVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_value);
		try {
			setState(485);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(482);
				algexpr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(483);
				bexpression(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(484);
				match(CADENA);
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
	public static class ArrayexprContext extends ParserRuleContext {
		public TerminalNode ARRAYADD() { return getToken(StarParser.ARRAYADD, 0); }
		public TerminalNode LEFTP() { return getToken(StarParser.LEFTP, 0); }
		public List<ArrayContext> array() {
			return getRuleContexts(ArrayContext.class);
		}
		public ArrayContext array(int i) {
			return getRuleContext(ArrayContext.class,i);
		}
		public TerminalNode RIGHTP() { return getToken(StarParser.RIGHTP, 0); }
		public TerminalNode COMMA() { return getToken(StarParser.COMMA, 0); }
		public TerminalNode ARRAYSUBS() { return getToken(StarParser.ARRAYSUBS, 0); }
		public TerminalNode ARRAYDOT() { return getToken(StarParser.ARRAYDOT, 0); }
		public TerminalNode ARRAYCROSS() { return getToken(StarParser.ARRAYCROSS, 0); }
		public ArrayexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayexpr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StarVisitor ) return ((StarVisitor<? extends T>)visitor).visitArrayexpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayexprContext arrayexpr() throws RecognitionException {
		ArrayexprContext _localctx = new ArrayexprContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_arrayexpr);
		int _la;
		try {
			setState(523);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ARRAYADD:
				enterOuterAlt(_localctx, 1);
				{
				setState(487);
				match(ARRAYADD);
				setState(488);
				match(LEFTP);
				setState(489);
				array();
				setState(491);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(490);
					match(COMMA);
					}
				}

				setState(493);
				array();
				setState(494);
				match(RIGHTP);
				}
				break;
			case ARRAYSUBS:
				enterOuterAlt(_localctx, 2);
				{
				setState(496);
				match(ARRAYSUBS);
				setState(497);
				match(LEFTP);
				setState(498);
				array();
				setState(500);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(499);
					match(COMMA);
					}
				}

				setState(502);
				array();
				setState(503);
				match(RIGHTP);
				}
				break;
			case ARRAYDOT:
				enterOuterAlt(_localctx, 3);
				{
				setState(505);
				match(ARRAYDOT);
				setState(506);
				match(LEFTP);
				setState(507);
				array();
				setState(509);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(508);
					match(COMMA);
					}
				}

				setState(511);
				array();
				setState(512);
				match(RIGHTP);
				}
				break;
			case ARRAYCROSS:
				enterOuterAlt(_localctx, 4);
				{
				setState(514);
				match(ARRAYCROSS);
				setState(515);
				match(LEFTP);
				setState(516);
				array();
				setState(518);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(517);
					match(COMMA);
					}
				}

				setState(520);
				array();
				setState(521);
				match(RIGHTP);
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
	public static class TrigFunctionContext extends ParserRuleContext {
		public TerminalNode SIN() { return getToken(StarParser.SIN, 0); }
		public TerminalNode LEFTP() { return getToken(StarParser.LEFTP, 0); }
		public AlgexprContext algexpr() {
			return getRuleContext(AlgexprContext.class,0);
		}
		public TerminalNode RIGHTP() { return getToken(StarParser.RIGHTP, 0); }
		public TerminalNode COS() { return getToken(StarParser.COS, 0); }
		public TerminalNode TAN() { return getToken(StarParser.TAN, 0); }
		public TerminalNode ARCSIN() { return getToken(StarParser.ARCSIN, 0); }
		public TerminalNode ACOS() { return getToken(StarParser.ACOS, 0); }
		public TerminalNode ARCTAN() { return getToken(StarParser.ARCTAN, 0); }
		public TerminalNode SINH() { return getToken(StarParser.SINH, 0); }
		public TerminalNode COSH() { return getToken(StarParser.COSH, 0); }
		public TerminalNode TANH() { return getToken(StarParser.TANH, 0); }
		public TrigFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trigFunction; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StarVisitor ) return ((StarVisitor<? extends T>)visitor).visitTrigFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TrigFunctionContext trigFunction() throws RecognitionException {
		TrigFunctionContext _localctx = new TrigFunctionContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_trigFunction);
		try {
			setState(570);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SIN:
				enterOuterAlt(_localctx, 1);
				{
				setState(525);
				match(SIN);
				setState(526);
				match(LEFTP);
				setState(527);
				algexpr(0);
				setState(528);
				match(RIGHTP);
				}
				break;
			case COS:
				enterOuterAlt(_localctx, 2);
				{
				setState(530);
				match(COS);
				setState(531);
				match(LEFTP);
				setState(532);
				algexpr(0);
				setState(533);
				match(RIGHTP);
				}
				break;
			case TAN:
				enterOuterAlt(_localctx, 3);
				{
				setState(535);
				match(TAN);
				setState(536);
				match(LEFTP);
				setState(537);
				algexpr(0);
				setState(538);
				match(RIGHTP);
				}
				break;
			case ARCSIN:
				enterOuterAlt(_localctx, 4);
				{
				setState(540);
				match(ARCSIN);
				setState(541);
				match(LEFTP);
				setState(542);
				algexpr(0);
				setState(543);
				match(RIGHTP);
				}
				break;
			case ACOS:
				enterOuterAlt(_localctx, 5);
				{
				setState(545);
				match(ACOS);
				setState(546);
				match(LEFTP);
				setState(547);
				algexpr(0);
				setState(548);
				match(RIGHTP);
				}
				break;
			case ARCTAN:
				enterOuterAlt(_localctx, 6);
				{
				setState(550);
				match(ARCTAN);
				setState(551);
				match(LEFTP);
				setState(552);
				algexpr(0);
				setState(553);
				match(RIGHTP);
				}
				break;
			case SINH:
				enterOuterAlt(_localctx, 7);
				{
				setState(555);
				match(SINH);
				setState(556);
				match(LEFTP);
				setState(557);
				algexpr(0);
				setState(558);
				match(RIGHTP);
				}
				break;
			case COSH:
				enterOuterAlt(_localctx, 8);
				{
				setState(560);
				match(COSH);
				setState(561);
				match(LEFTP);
				setState(562);
				algexpr(0);
				setState(563);
				match(RIGHTP);
				}
				break;
			case TANH:
				enterOuterAlt(_localctx, 9);
				{
				setState(565);
				match(TANH);
				setState(566);
				match(LEFTP);
				setState(567);
				algexpr(0);
				setState(568);
				match(RIGHTP);
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
	public static class FunctionContext extends ParserRuleContext {
		public MathFunctionContext mathFunction() {
			return getRuleContext(MathFunctionContext.class,0);
		}
		public UsefunctionContext usefunction() {
			return getRuleContext(UsefunctionContext.class,0);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StarVisitor ) return ((StarVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_function);
		try {
			setState(574);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RANDOM:
			case LN:
			case SIN:
			case COS:
			case TAN:
			case ARCSIN:
			case ACOS:
			case ARCTAN:
			case SINH:
			case COSH:
			case TANH:
				enterOuterAlt(_localctx, 1);
				{
				setState(572);
				mathFunction();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(573);
				usefunction();
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
	public static class MathFunctionContext extends ParserRuleContext {
		public TrigFunctionContext trigFunction() {
			return getRuleContext(TrigFunctionContext.class,0);
		}
		public LogFunctionContext logFunction() {
			return getRuleContext(LogFunctionContext.class,0);
		}
		public ProbFunctionContext probFunction() {
			return getRuleContext(ProbFunctionContext.class,0);
		}
		public MathFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mathFunction; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StarVisitor ) return ((StarVisitor<? extends T>)visitor).visitMathFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MathFunctionContext mathFunction() throws RecognitionException {
		MathFunctionContext _localctx = new MathFunctionContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_mathFunction);
		try {
			setState(579);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SIN:
			case COS:
			case TAN:
			case ARCSIN:
			case ACOS:
			case ARCTAN:
			case SINH:
			case COSH:
			case TANH:
				enterOuterAlt(_localctx, 1);
				{
				setState(576);
				trigFunction();
				}
				break;
			case LN:
				enterOuterAlt(_localctx, 2);
				{
				setState(577);
				logFunction();
				}
				break;
			case RANDOM:
				enterOuterAlt(_localctx, 3);
				{
				setState(578);
				probFunction();
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
	public static class ProbFunctionContext extends ParserRuleContext {
		public RandomFunctionContext randomFunction() {
			return getRuleContext(RandomFunctionContext.class,0);
		}
		public ProbFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_probFunction; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StarVisitor ) return ((StarVisitor<? extends T>)visitor).visitProbFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProbFunctionContext probFunction() throws RecognitionException {
		ProbFunctionContext _localctx = new ProbFunctionContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_probFunction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(581);
			randomFunction();
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
	public static class RandomFunctionContext extends ParserRuleContext {
		public TerminalNode RANDOM() { return getToken(StarParser.RANDOM, 0); }
		public TerminalNode LEFTP() { return getToken(StarParser.LEFTP, 0); }
		public TerminalNode REALNUMBER() { return getToken(StarParser.REALNUMBER, 0); }
		public TerminalNode RIGHTP() { return getToken(StarParser.RIGHTP, 0); }
		public RandomFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_randomFunction; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StarVisitor ) return ((StarVisitor<? extends T>)visitor).visitRandomFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RandomFunctionContext randomFunction() throws RecognitionException {
		RandomFunctionContext _localctx = new RandomFunctionContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_randomFunction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(583);
			match(RANDOM);
			setState(584);
			match(LEFTP);
			setState(585);
			match(REALNUMBER);
			setState(586);
			match(RIGHTP);
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
	public static class LogFunctionContext extends ParserRuleContext {
		public TerminalNode LN() { return getToken(StarParser.LN, 0); }
		public TerminalNode LEFTP() { return getToken(StarParser.LEFTP, 0); }
		public AlgexprContext algexpr() {
			return getRuleContext(AlgexprContext.class,0);
		}
		public TerminalNode RIGHTP() { return getToken(StarParser.RIGHTP, 0); }
		public LogFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logFunction; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StarVisitor ) return ((StarVisitor<? extends T>)visitor).visitLogFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogFunctionContext logFunction() throws RecognitionException {
		LogFunctionContext _localctx = new LogFunctionContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_logFunction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(588);
			match(LN);
			setState(589);
			match(LEFTP);
			setState(590);
			algexpr(0);
			setState(591);
			match(RIGHTP);
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
	public static class UsefunctionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(StarParser.ID, 0); }
		public TerminalNode LEFTP() { return getToken(StarParser.LEFTP, 0); }
		public TerminalNode RIGHTP() { return getToken(StarParser.RIGHTP, 0); }
		public List<AlgexprContext> algexpr() {
			return getRuleContexts(AlgexprContext.class);
		}
		public AlgexprContext algexpr(int i) {
			return getRuleContext(AlgexprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(StarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(StarParser.COMMA, i);
		}
		public IdlistContext idlist() {
			return getRuleContext(IdlistContext.class,0);
		}
		public UsefunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_usefunction; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StarVisitor ) return ((StarVisitor<? extends T>)visitor).visitUsefunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UsefunctionContext usefunction() throws RecognitionException {
		UsefunctionContext _localctx = new UsefunctionContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_usefunction);
		int _la;
		try {
			setState(611);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(593);
				match(ID);
				setState(594);
				match(LEFTP);
				setState(599); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(595);
					algexpr(0);
					setState(597);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==COMMA) {
						{
						setState(596);
						match(COMMA);
						}
					}

					}
					}
					setState(601); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 9)) & ~0x3f) == 0 && ((1L << (_la - 9)) & 126417448915206083L) != 0) );
				setState(603);
				match(RIGHTP);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(605);
				match(ID);
				setState(606);
				match(LEFTP);
				setState(607);
				idlist();
				setState(608);
				match(RIGHTP);
				setState(609);
				match(T__0);
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
	public static class AlgexprContext extends ParserRuleContext {
		public AlgexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_algexpr; }
	 
		public AlgexprContext() { }
		public void copyFrom(AlgexprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TrigfContext extends AlgexprContext {
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public TrigfContext(AlgexprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StarVisitor ) return ((StarVisitor<? extends T>)visitor).visitTrigf(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParenthesisContext extends AlgexprContext {
		public TerminalNode LEFTP() { return getToken(StarParser.LEFTP, 0); }
		public AlgexprContext algexpr() {
			return getRuleContext(AlgexprContext.class,0);
		}
		public TerminalNode RIGHTP() { return getToken(StarParser.RIGHTP, 0); }
		public ParenthesisContext(AlgexprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StarVisitor ) return ((StarVisitor<? extends T>)visitor).visitParenthesis(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NegationContext extends AlgexprContext {
		public TerminalNode SUBS() { return getToken(StarParser.SUBS, 0); }
		public AlgexprContext algexpr() {
			return getRuleContext(AlgexprContext.class,0);
		}
		public NegationContext(AlgexprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StarVisitor ) return ((StarVisitor<? extends T>)visitor).visitNegation(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NumberContext extends AlgexprContext {
		public TerminalNode REALNUMBER() { return getToken(StarParser.REALNUMBER, 0); }
		public NumberContext(AlgexprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StarVisitor ) return ((StarVisitor<? extends T>)visitor).visitNumber(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MulDivContext extends AlgexprContext {
		public Token op;
		public List<AlgexprContext> algexpr() {
			return getRuleContexts(AlgexprContext.class);
		}
		public AlgexprContext algexpr(int i) {
			return getRuleContext(AlgexprContext.class,i);
		}
		public TerminalNode MULT() { return getToken(StarParser.MULT, 0); }
		public TerminalNode DIV() { return getToken(StarParser.DIV, 0); }
		public MulDivContext(AlgexprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StarVisitor ) return ((StarVisitor<? extends T>)visitor).visitMulDiv(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AddSubContext extends AlgexprContext {
		public Token op;
		public List<AlgexprContext> algexpr() {
			return getRuleContexts(AlgexprContext.class);
		}
		public AlgexprContext algexpr(int i) {
			return getRuleContext(AlgexprContext.class,i);
		}
		public TerminalNode ADD() { return getToken(StarParser.ADD, 0); }
		public TerminalNode SUBS() { return getToken(StarParser.SUBS, 0); }
		public AddSubContext(AlgexprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StarVisitor ) return ((StarVisitor<? extends T>)visitor).visitAddSub(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PowerRootContext extends AlgexprContext {
		public List<AlgexprContext> algexpr() {
			return getRuleContexts(AlgexprContext.class);
		}
		public AlgexprContext algexpr(int i) {
			return getRuleContext(AlgexprContext.class,i);
		}
		public TerminalNode POWER() { return getToken(StarParser.POWER, 0); }
		public PowerRootContext(AlgexprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StarVisitor ) return ((StarVisitor<? extends T>)visitor).visitPowerRoot(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MdContext extends AlgexprContext {
		public List<AlgexprContext> algexpr() {
			return getRuleContexts(AlgexprContext.class);
		}
		public AlgexprContext algexpr(int i) {
			return getRuleContext(AlgexprContext.class,i);
		}
		public TerminalNode MOD() { return getToken(StarParser.MOD, 0); }
		public MdContext(AlgexprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StarVisitor ) return ((StarVisitor<? extends T>)visitor).visitMd(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ENTContext extends AlgexprContext {
		public TerminalNode INTEGER() { return getToken(StarParser.INTEGER, 0); }
		public ENTContext(AlgexprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StarVisitor ) return ((StarVisitor<? extends T>)visitor).visitENT(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdContext extends AlgexprContext {
		public TerminalNode ID() { return getToken(StarParser.ID, 0); }
		public TerminalNode INTEGER() { return getToken(StarParser.INTEGER, 0); }
		public IdContext(AlgexprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StarVisitor ) return ((StarVisitor<? extends T>)visitor).visitId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlgexprContext algexpr() throws RecognitionException {
		return algexpr(0);
	}

	private AlgexprContext algexpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AlgexprContext _localctx = new AlgexprContext(_ctx, _parentState);
		AlgexprContext _prevctx = _localctx;
		int _startState = 64;
		enterRecursionRule(_localctx, 64, RULE_algexpr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(629);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
			case 1:
				{
				_localctx = new NegationContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(614);
				match(SUBS);
				setState(615);
				algexpr(6);
				}
				break;
			case 2:
				{
				_localctx = new NumberContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(616);
				match(REALNUMBER);
				}
				break;
			case 3:
				{
				_localctx = new ENTContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(617);
				match(INTEGER);
				}
				break;
			case 4:
				{
				_localctx = new TrigfContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(618);
				function();
				}
				break;
			case 5:
				{
				_localctx = new ParenthesisContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(619);
				match(LEFTP);
				setState(620);
				algexpr(0);
				setState(621);
				match(RIGHTP);
				}
				break;
			case 6:
				{
				_localctx = new IdContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(623);
				match(ID);
				setState(627);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
				case 1:
					{
					setState(624);
					match(T__1);
					setState(625);
					match(INTEGER);
					setState(626);
					match(T__2);
					}
					break;
				}
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(645);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,67,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(643);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
					case 1:
						{
						_localctx = new PowerRootContext(new AlgexprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_algexpr);
						setState(631);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(632);
						match(POWER);
						setState(633);
						algexpr(11);
						}
						break;
					case 2:
						{
						_localctx = new MulDivContext(new AlgexprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_algexpr);
						setState(634);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(635);
						((MulDivContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==MULT || _la==DIV) ) {
							((MulDivContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(636);
						algexpr(10);
						}
						break;
					case 3:
						{
						_localctx = new AddSubContext(new AlgexprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_algexpr);
						setState(637);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(638);
						((AddSubContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUBS) ) {
							((AddSubContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(639);
						algexpr(9);
						}
						break;
					case 4:
						{
						_localctx = new MdContext(new AlgexprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_algexpr);
						setState(640);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(641);
						match(MOD);
						setState(642);
						algexpr(8);
						}
						break;
					}
					} 
				}
				setState(647);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,67,_ctx);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 13:
			return bexpression_sempred((BexpressionContext)_localctx, predIndex);
		case 14:
			return bterm_sempred((BtermContext)_localctx, predIndex);
		case 32:
			return algexpr_sempred((AlgexprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean bexpression_sempred(BexpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean bterm_sempred(BtermContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean algexpr_sempred(AlgexprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 10);
		case 3:
			return precpred(_ctx, 9);
		case 4:
			return precpred(_ctx, 8);
		case 5:
			return precpred(_ctx, 7);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001B\u0289\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"\u000b\u0000\f\u0000E\u0001\u0001\u0001\u0001\u0003\u0001J\b\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0003\u0001O\b\u0001\u0001\u0001\u0001"+
		"\u0001\u0003\u0001S\b\u0001\u0001\u0001\u0001\u0001\u0003\u0001W\b\u0001"+
		"\u0001\u0001\u0001\u0001\u0003\u0001[\b\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001"+
		"d\b\u0001\u0001\u0001\u0001\u0001\u0003\u0001h\b\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0003\u0001n\b\u0001\u0001\u0001\u0001"+
		"\u0001\u0003\u0001r\b\u0001\u0001\u0001\u0001\u0001\u0003\u0001v\b\u0001"+
		"\u0001\u0001\u0003\u0001y\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0005\u0002~\b\u0002\n\u0002\f\u0002\u0081\t\u0002\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003"+
		"\u0003\u008a\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0003\u0004\u0092\b\u0004\u0001\u0004\u0001\u0004\u0003"+
		"\u0004\u0096\b\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0003\u0005\u00a9\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0003\u0006\u00b0\b\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u00b9"+
		"\b\u0006\u0001\u0006\u0003\u0006\u00bc\b\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0003\u0007\u00c2\b\u0007\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u00cc\b\t\u0001\t\u0001"+
		"\t\u0003\t\u00d0\b\t\u0001\t\u0003\t\u00d3\b\t\u0001\n\u0001\n\u0001\n"+
		"\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u00dd\b\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0003\n\u00eb\b\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u00f4\b\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0005\r\u0102\b\r\n\r\f\r\u0105\t\r\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0005\u000e"+
		"\u010d\b\u000e\n\u000e\f\u000e\u0110\t\u000e\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003"+
		"\u000f\u0120\b\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u012b"+
		"\b\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0004\u0011\u0153\b\u0011\u000b\u0011\f"+
		"\u0011\u0154\u0001\u0011\u0001\u0011\u0003\u0011\u0159\b\u0011\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u015f\b\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0003\u0012\u0168\b\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u0171\b\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012"+
		"\u0179\b\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012"+
		"\u0185\b\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0003\u0012\u018e\b\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0004\u0012\u0199\b\u0012\u000b\u0012\f\u0012\u019a\u0001"+
		"\u0012\u0003\u0012\u019e\b\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003"+
		"\u0012\u01a3\b\u0012\u0001\u0013\u0001\u0013\u0003\u0013\u01a7\b\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u01ac\b\u0013\u0005\u0013"+
		"\u01ae\b\u0013\n\u0013\f\u0013\u01b1\t\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u01b8\b\u0014\u0004\u0014\u01ba"+
		"\b\u0014\u000b\u0014\f\u0014\u01bb\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0003\u0014\u01c1\b\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015"+
		"\u01c6\b\u0015\u0004\u0015\u01c8\b\u0015\u000b\u0015\f\u0015\u01c9\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u01d0\b\u0015\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u01e1\b\u0016\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0003\u0017\u01e6\b\u0017\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0003\u0018\u01ec\b\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0003\u0018\u01f5"+
		"\b\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0003\u0018\u01fe\b\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0003\u0018\u0207"+
		"\b\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0003\u0018\u020c\b\u0018"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0003\u0019\u023b\b\u0019\u0001\u001a"+
		"\u0001\u001a\u0003\u001a\u023f\b\u001a\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0003\u001b\u0244\b\u001b\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0003\u001f\u0256\b\u001f\u0004\u001f\u0258\b\u001f\u000b\u001f\f\u001f"+
		"\u0259\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0003\u001f\u0264\b\u001f\u0001 \u0001"+
		" \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001"+
		" \u0001 \u0001 \u0003 \u0274\b \u0003 \u0276\b \u0001 \u0001 \u0001 \u0001"+
		" \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0005 \u0284"+
		"\b \n \f \u0287\t \u0001 \u0000\u0003\u001a\u001c@!\u0000\u0002\u0004"+
		"\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \""+
		"$&(*,.02468:<>@\u0000\u0003\u0001\u0000#(\u0002\u00005577\u0002\u0000"+
		"4466\u02f1\u0000C\u0001\u0000\u0000\u0000\u0002x\u0001\u0000\u0000\u0000"+
		"\u0004z\u0001\u0000\u0000\u0000\u0006\u0089\u0001\u0000\u0000\u0000\b"+
		"\u008b\u0001\u0000\u0000\u0000\n\u00a8\u0001\u0000\u0000\u0000\f\u00bb"+
		"\u0001\u0000\u0000\u0000\u000e\u00c1\u0001\u0000\u0000\u0000\u0010\u00c3"+
		"\u0001\u0000\u0000\u0000\u0012\u00c7\u0001\u0000\u0000\u0000\u0014\u00ea"+
		"\u0001\u0000\u0000\u0000\u0016\u00ec\u0001\u0000\u0000\u0000\u0018\u00f7"+
		"\u0001\u0000\u0000\u0000\u001a\u00fb\u0001\u0000\u0000\u0000\u001c\u0106"+
		"\u0001\u0000\u0000\u0000\u001e\u011f\u0001\u0000\u0000\u0000 \u012a\u0001"+
		"\u0000\u0000\u0000\"\u0158\u0001\u0000\u0000\u0000$\u01a2\u0001\u0000"+
		"\u0000\u0000&\u01a4\u0001\u0000\u0000\u0000(\u01c0\u0001\u0000\u0000\u0000"+
		"*\u01cf\u0001\u0000\u0000\u0000,\u01e0\u0001\u0000\u0000\u0000.\u01e5"+
		"\u0001\u0000\u0000\u00000\u020b\u0001\u0000\u0000\u00002\u023a\u0001\u0000"+
		"\u0000\u00004\u023e\u0001\u0000\u0000\u00006\u0243\u0001\u0000\u0000\u0000"+
		"8\u0245\u0001\u0000\u0000\u0000:\u0247\u0001\u0000\u0000\u0000<\u024c"+
		"\u0001\u0000\u0000\u0000>\u0263\u0001\u0000\u0000\u0000@\u0275\u0001\u0000"+
		"\u0000\u0000BD\u0003\u0002\u0001\u0000CB\u0001\u0000\u0000\u0000DE\u0001"+
		"\u0000\u0000\u0000EC\u0001\u0000\u0000\u0000EF\u0001\u0000\u0000\u0000"+
		"F\u0001\u0001\u0000\u0000\u0000GI\u0003:\u001d\u0000HJ\u0005B\u0000\u0000"+
		"IH\u0001\u0000\u0000\u0000IJ\u0001\u0000\u0000\u0000Jy\u0001\u0000\u0000"+
		"\u0000Ky\u0003\b\u0004\u0000LN\u0003>\u001f\u0000MO\u0005B\u0000\u0000"+
		"NM\u0001\u0000\u0000\u0000NO\u0001\u0000\u0000\u0000Oy\u0001\u0000\u0000"+
		"\u0000PR\u00030\u0018\u0000QS\u0005B\u0000\u0000RQ\u0001\u0000\u0000\u0000"+
		"RS\u0001\u0000\u0000\u0000Sy\u0001\u0000\u0000\u0000TV\u0003@ \u0000U"+
		"W\u0005B\u0000\u0000VU\u0001\u0000\u0000\u0000VW\u0001\u0000\u0000\u0000"+
		"Wy\u0001\u0000\u0000\u0000XZ\u0003,\u0016\u0000Y[\u0005B\u0000\u0000Z"+
		"Y\u0001\u0000\u0000\u0000Z[\u0001\u0000\u0000\u0000[y\u0001\u0000\u0000"+
		"\u0000\\y\u0003\u001a\r\u0000]y\u0003\u0010\b\u0000^y\u0003\u0012\t\u0000"+
		"_y\u0003\u0014\n\u0000`y\u0003\u0018\f\u0000ac\u0003\"\u0011\u0000bd\u0005"+
		"B\u0000\u0000cb\u0001\u0000\u0000\u0000cd\u0001\u0000\u0000\u0000dy\u0001"+
		"\u0000\u0000\u0000eg\u0003$\u0012\u0000fh\u0005B\u0000\u0000gf\u0001\u0000"+
		"\u0000\u0000gh\u0001\u0000\u0000\u0000hy\u0001\u0000\u0000\u0000iy\u0003"+
		" \u0010\u0000jy\u0003\f\u0006\u0000km\u0003\u0016\u000b\u0000ln\u0005"+
		"B\u0000\u0000ml\u0001\u0000\u0000\u0000mn\u0001\u0000\u0000\u0000ny\u0001"+
		"\u0000\u0000\u0000oq\u0003\u000e\u0007\u0000pr\u0005B\u0000\u0000qp\u0001"+
		"\u0000\u0000\u0000qr\u0001\u0000\u0000\u0000ry\u0001\u0000\u0000\u0000"+
		"su\u00032\u0019\u0000tv\u0005B\u0000\u0000ut\u0001\u0000\u0000\u0000u"+
		"v\u0001\u0000\u0000\u0000vy\u0001\u0000\u0000\u0000wy\u0005B\u0000\u0000"+
		"xG\u0001\u0000\u0000\u0000xK\u0001\u0000\u0000\u0000xL\u0001\u0000\u0000"+
		"\u0000xP\u0001\u0000\u0000\u0000xT\u0001\u0000\u0000\u0000xX\u0001\u0000"+
		"\u0000\u0000x\\\u0001\u0000\u0000\u0000x]\u0001\u0000\u0000\u0000x^\u0001"+
		"\u0000\u0000\u0000x_\u0001\u0000\u0000\u0000x`\u0001\u0000\u0000\u0000"+
		"xa\u0001\u0000\u0000\u0000xe\u0001\u0000\u0000\u0000xi\u0001\u0000\u0000"+
		"\u0000xj\u0001\u0000\u0000\u0000xk\u0001\u0000\u0000\u0000xo\u0001\u0000"+
		"\u0000\u0000xs\u0001\u0000\u0000\u0000xw\u0001\u0000\u0000\u0000y\u0003"+
		"\u0001\u0000\u0000\u0000z\u007f\u0005?\u0000\u0000{|\u0005;\u0000\u0000"+
		"|~\u0005?\u0000\u0000}{\u0001\u0000\u0000\u0000~\u0081\u0001\u0000\u0000"+
		"\u0000\u007f}\u0001\u0000\u0000\u0000\u007f\u0080\u0001\u0000\u0000\u0000"+
		"\u0080\u0005\u0001\u0000\u0000\u0000\u0081\u007f\u0001\u0000\u0000\u0000"+
		"\u0082\u008a\u0005\u001d\u0000\u0000\u0083\u008a\u0005\u001e\u0000\u0000"+
		"\u0084\u008a\u0005\u001f\u0000\u0000\u0085\u008a\u0005!\u0000\u0000\u0086"+
		"\u008a\u0005 \u0000\u0000\u0087\u008a\u0005\u001c\u0000\u0000\u0088\u008a"+
		"\u0005\"\u0000\u0000\u0089\u0082\u0001\u0000\u0000\u0000\u0089\u0083\u0001"+
		"\u0000\u0000\u0000\u0089\u0084\u0001\u0000\u0000\u0000\u0089\u0085\u0001"+
		"\u0000\u0000\u0000\u0089\u0086\u0001\u0000\u0000\u0000\u0089\u0087\u0001"+
		"\u0000\u0000\u0000\u0089\u0088\u0001\u0000\u0000\u0000\u008a\u0007\u0001"+
		"\u0000\u0000\u0000\u008b\u008c\u00051\u0000\u0000\u008c\u0091\u0005?\u0000"+
		"\u0000\u008d\u008e\u00059\u0000\u0000\u008e\u008f\u0003\u0004\u0002\u0000"+
		"\u008f\u0090\u0005:\u0000\u0000\u0090\u0092\u0001\u0000\u0000\u0000\u0091"+
		"\u008d\u0001\u0000\u0000\u0000\u0091\u0092\u0001\u0000\u0000\u0000\u0092"+
		"\u0093\u0001\u0000\u0000\u0000\u0093\u0095\u0005=\u0000\u0000\u0094\u0096"+
		"\u0005B\u0000\u0000\u0095\u0094\u0001\u0000\u0000\u0000\u0095\u0096\u0001"+
		"\u0000\u0000\u0000\u0096\u0097\u0001\u0000\u0000\u0000\u0097\u0098\u0003"+
		"\n\u0005\u0000\u0098\u0099\u0005<\u0000\u0000\u0099\t\u0001\u0000\u0000"+
		"\u0000\u009a\u00a9\u0003&\u0013\u0000\u009b\u00a9\u0003 \u0010\u0000\u009c"+
		"\u00a9\u0003\f\u0006\u0000\u009d\u00a9\u0003\"\u0011\u0000\u009e\u00a9"+
		"\u0003$\u0012\u0000\u009f\u00a9\u0003\u0010\b\u0000\u00a0\u00a9\u0003"+
		"\u0012\t\u0000\u00a1\u00a9\u0003\u0014\n\u0000\u00a2\u00a9\u0003\u0016"+
		"\u000b\u0000\u00a3\u00a9\u0003>\u001f\u0000\u00a4\u00a9\u0003,\u0016\u0000"+
		"\u00a5\u00a9\u0003\u000e\u0007\u0000\u00a6\u00a9\u0003@ \u0000\u00a7\u00a9"+
		"\u00030\u0018\u0000\u00a8\u009a\u0001\u0000\u0000\u0000\u00a8\u009b\u0001"+
		"\u0000\u0000\u0000\u00a8\u009c\u0001\u0000\u0000\u0000\u00a8\u009d\u0001"+
		"\u0000\u0000\u0000\u00a8\u009e\u0001\u0000\u0000\u0000\u00a8\u009f\u0001"+
		"\u0000\u0000\u0000\u00a8\u00a0\u0001\u0000\u0000\u0000\u00a8\u00a1\u0001"+
		"\u0000\u0000\u0000\u00a8\u00a2\u0001\u0000\u0000\u0000\u00a8\u00a3\u0001"+
		"\u0000\u0000\u0000\u00a8\u00a4\u0001\u0000\u0000\u0000\u00a8\u00a5\u0001"+
		"\u0000\u0000\u0000\u00a8\u00a6\u0001\u0000\u0000\u0000\u00a8\u00a7\u0001"+
		"\u0000\u0000\u0000\u00a9\u000b\u0001\u0000\u0000\u0000\u00aa\u00ab\u0005"+
		"\b\u0000\u0000\u00ab\u00ac\u00059\u0000\u0000\u00ac\u00ad\u0003\u0004"+
		"\u0002\u0000\u00ad\u00af\u0005;\u0000\u0000\u00ae\u00b0\u0005>\u0000\u0000"+
		"\u00af\u00ae\u0001\u0000\u0000\u0000\u00af\u00b0\u0001\u0000\u0000\u0000"+
		"\u00b0\u00b1\u0001\u0000\u0000\u0000\u00b1\u00b2\u0005:\u0000\u0000\u00b2"+
		"\u00bc\u0001\u0000\u0000\u0000\u00b3\u00b4\u0005\b\u0000\u0000\u00b4\u00b5"+
		"\u00059\u0000\u0000\u00b5\u00b6\u0005>\u0000\u0000\u00b6\u00b8\u0005;"+
		"\u0000\u0000\u00b7\u00b9\u0005>\u0000\u0000\u00b8\u00b7\u0001\u0000\u0000"+
		"\u0000\u00b8\u00b9\u0001\u0000\u0000\u0000\u00b9\u00ba\u0001\u0000\u0000"+
		"\u0000\u00ba\u00bc\u0005:\u0000\u0000\u00bb\u00aa\u0001\u0000\u0000\u0000"+
		"\u00bb\u00b3\u0001\u0000\u0000\u0000\u00bc\r\u0001\u0000\u0000\u0000\u00bd"+
		"\u00be\u0005\u001a\u0000\u0000\u00be\u00c2\u0003>\u001f\u0000\u00bf\u00c0"+
		"\u0005\u001a\u0000\u0000\u00c0\u00c2\u0003@ \u0000\u00c1\u00bd\u0001\u0000"+
		"\u0000\u0000\u00c1\u00bf\u0001\u0000\u0000\u0000\u00c2\u000f\u0001\u0000"+
		"\u0000\u0000\u00c3\u00c4\u00050\u0000\u0000\u00c4\u00c5\u0003\u001a\r"+
		"\u0000\u00c5\u00c6\u0003\n\u0005\u0000\u00c6\u0011\u0001\u0000\u0000\u0000"+
		"\u00c7\u00c8\u0005\u0018\u0000\u0000\u00c8\u00c9\u0003\u001a\r\u0000\u00c9"+
		"\u00cb\u0003\n\u0005\u0000\u00ca\u00cc\u0005B\u0000\u0000\u00cb\u00ca"+
		"\u0001\u0000\u0000\u0000\u00cb\u00cc\u0001\u0000\u0000\u0000\u00cc\u00d2"+
		"\u0001\u0000\u0000\u0000\u00cd\u00cf\u0005*\u0000\u0000\u00ce\u00d0\u0005"+
		"B\u0000\u0000\u00cf\u00ce\u0001\u0000\u0000\u0000\u00cf\u00d0\u0001\u0000"+
		"\u0000\u0000\u00d0\u00d1\u0001\u0000\u0000\u0000\u00d1\u00d3\u0003\n\u0005"+
		"\u0000\u00d2\u00cd\u0001\u0000\u0000\u0000\u00d2\u00d3\u0001\u0000\u0000"+
		"\u0000\u00d3\u0013\u0001\u0000\u0000\u0000\u00d4\u00d5\u0005)\u0000\u0000"+
		"\u00d5\u00d6\u0003,\u0016\u0000\u00d6\u00d7\u0005\u0001\u0000\u0000\u00d7"+
		"\u00d8\u0003\u001a\r\u0000\u00d8\u00d9\u0005\u0001\u0000\u0000\u00d9\u00da"+
		"\u0003,\u0016\u0000\u00da\u00dc\u0005\u0001\u0000\u0000\u00db\u00dd\u0005"+
		"B\u0000\u0000\u00dc\u00db\u0001\u0000\u0000\u0000\u00dc\u00dd\u0001\u0000"+
		"\u0000\u0000\u00dd\u00de\u0001\u0000\u0000\u0000\u00de\u00df\u0003\n\u0005"+
		"\u0000\u00df\u00eb\u0001\u0000\u0000\u0000\u00e0\u00e1\u0005)\u0000\u0000"+
		"\u00e1\u00e2\u00059\u0000\u0000\u00e2\u00e3\u0003,\u0016\u0000\u00e3\u00e4"+
		"\u0005\u0001\u0000\u0000\u00e4\u00e5\u0003\u001a\r\u0000\u00e5\u00e6\u0005"+
		"\u0001\u0000\u0000\u00e6\u00e7\u0003,\u0016\u0000\u00e7\u00e8\u0005:\u0000"+
		"\u0000\u00e8\u00e9\u0003\n\u0005\u0000\u00e9\u00eb\u0001\u0000\u0000\u0000"+
		"\u00ea\u00d4\u0001\u0000\u0000\u0000\u00ea\u00e0\u0001\u0000\u0000\u0000"+
		"\u00eb\u0015\u0001\u0000\u0000\u0000\u00ec\u00ed\u0005\u0019\u0000\u0000"+
		"\u00ed\u00ee\u0005?\u0000\u0000\u00ee\u00ef\u00059\u0000\u0000\u00ef\u00f0"+
		"\u0003\u0004\u0002\u0000\u00f0\u00f1\u0005:\u0000\u0000\u00f1\u00f3\u0005"+
		"=\u0000\u0000\u00f2\u00f4\u0005B\u0000\u0000\u00f3\u00f2\u0001\u0000\u0000"+
		"\u0000\u00f3\u00f4\u0001\u0000\u0000\u0000\u00f4\u00f5\u0001\u0000\u0000"+
		"\u0000\u00f5\u00f6\u0003\n\u0005\u0000\u00f6\u0017\u0001\u0000\u0000\u0000"+
		"\u00f7\u00f8\u0003@ \u0000\u00f8\u00f9\u0007\u0000\u0000\u0000\u00f9\u00fa"+
		"\u0003@ \u0000\u00fa\u0019\u0001\u0000\u0000\u0000\u00fb\u00fc\u0006\r"+
		"\uffff\uffff\u0000\u00fc\u00fd\u0003\u001c\u000e\u0000\u00fd\u0103\u0001"+
		"\u0000\u0000\u0000\u00fe\u00ff\n\u0002\u0000\u0000\u00ff\u0100\u0005/"+
		"\u0000\u0000\u0100\u0102\u0003\u001c\u000e\u0000\u0101\u00fe\u0001\u0000"+
		"\u0000\u0000\u0102\u0105\u0001\u0000\u0000\u0000\u0103\u0101\u0001\u0000"+
		"\u0000\u0000\u0103\u0104\u0001\u0000\u0000\u0000\u0104\u001b\u0001\u0000"+
		"\u0000\u0000\u0105\u0103\u0001\u0000\u0000\u0000\u0106\u0107\u0006\u000e"+
		"\uffff\uffff\u0000\u0107\u0108\u0003\u001e\u000f\u0000\u0108\u010e\u0001"+
		"\u0000\u0000\u0000\u0109\u010a\n\u0002\u0000\u0000\u010a\u010b\u0005."+
		"\u0000\u0000\u010b\u010d\u0003\u001e\u000f\u0000\u010c\u0109\u0001\u0000"+
		"\u0000\u0000\u010d\u0110\u0001\u0000\u0000\u0000\u010e\u010c\u0001\u0000"+
		"\u0000\u0000\u010e\u010f\u0001\u0000\u0000\u0000\u010f\u001d\u0001\u0000"+
		"\u0000\u0000\u0110\u010e\u0001\u0000\u0000\u0000\u0111\u0112\u0005+\u0000"+
		"\u0000\u0112\u0120\u0003\u001e\u000f\u0000\u0113\u0114\u00059\u0000\u0000"+
		"\u0114\u0115\u0003\u001a\r\u0000\u0115\u0116\u0005:\u0000\u0000\u0116"+
		"\u0120\u0001\u0000\u0000\u0000\u0117\u0120\u0005?\u0000\u0000\u0118\u0120"+
		"\u0005,\u0000\u0000\u0119\u0120\u0005-\u0000\u0000\u011a\u0120\u0003\u0018"+
		"\f\u0000\u011b\u011c\u00059\u0000\u0000\u011c\u011d\u0003\u0018\f\u0000"+
		"\u011d\u011e\u0005:\u0000\u0000\u011e\u0120\u0001\u0000\u0000\u0000\u011f"+
		"\u0111\u0001\u0000\u0000\u0000\u011f\u0113\u0001\u0000\u0000\u0000\u011f"+
		"\u0117\u0001\u0000\u0000\u0000\u011f\u0118\u0001\u0000\u0000\u0000\u011f"+
		"\u0119\u0001\u0000\u0000\u0000\u011f\u011a\u0001\u0000\u0000\u0000\u011f"+
		"\u011b\u0001\u0000\u0000\u0000\u0120\u001f\u0001\u0000\u0000\u0000\u0121"+
		"\u0122\u00052\u0000\u0000\u0122\u0123\u00059\u0000\u0000\u0123\u0124\u0003"+
		"\u0004\u0002\u0000\u0124\u0125\u0005:\u0000\u0000\u0125\u012b\u0001\u0000"+
		"\u0000\u0000\u0126\u0127\u00052\u0000\u0000\u0127\u0128\u00059\u0000\u0000"+
		"\u0128\u0129\u0005>\u0000\u0000\u0129\u012b\u0005:\u0000\u0000\u012a\u0121"+
		"\u0001\u0000\u0000\u0000\u012a\u0126\u0001\u0000\u0000\u0000\u012b!\u0001"+
		"\u0000\u0000\u0000\u012c\u012d\u00053\u0000\u0000\u012d\u012e\u00059\u0000"+
		"\u0000\u012e\u012f\u0003\u0004\u0002\u0000\u012f\u0130\u0005:\u0000\u0000"+
		"\u0130\u0159\u0001\u0000\u0000\u0000\u0131\u0132\u00053\u0000\u0000\u0132"+
		"\u0133\u00059\u0000\u0000\u0133\u0134\u0003@ \u0000\u0134\u0135\u0005"+
		":\u0000\u0000\u0135\u0159\u0001\u0000\u0000\u0000\u0136\u0137\u00053\u0000"+
		"\u0000\u0137\u0138\u00059\u0000\u0000\u0138\u0139\u0005>\u0000\u0000\u0139"+
		"\u0159\u0005:\u0000\u0000\u013a\u013b\u00053\u0000\u0000\u013b\u013c\u0005"+
		"9\u0000\u0000\u013c\u013d\u0003*\u0015\u0000\u013d\u013e\u0005\u0002\u0000"+
		"\u0000\u013e\u013f\u0005@\u0000\u0000\u013f\u0140\u0005\u0003\u0000\u0000"+
		"\u0140\u0141\u0005:\u0000\u0000\u0141\u0159\u0001\u0000\u0000\u0000\u0142"+
		"\u0143\u00053\u0000\u0000\u0143\u0144\u00059\u0000\u0000\u0144\u0145\u0003"+
		">\u001f\u0000\u0145\u0146\u0005:\u0000\u0000\u0146\u0159\u0001\u0000\u0000"+
		"\u0000\u0147\u0148\u00053\u0000\u0000\u0148\u0149\u00059\u0000\u0000\u0149"+
		"\u014a\u00030\u0018\u0000\u014a\u014b\u0005:\u0000\u0000\u014b\u0159\u0001"+
		"\u0000\u0000\u0000\u014c\u014d\u00053\u0000\u0000\u014d\u014e\u00059\u0000"+
		"\u0000\u014e\u0152\u0003(\u0014\u0000\u014f\u0150\u0005\u0002\u0000\u0000"+
		"\u0150\u0151\u0005@\u0000\u0000\u0151\u0153\u0005\u0003\u0000\u0000\u0152"+
		"\u014f\u0001\u0000\u0000\u0000\u0153\u0154\u0001\u0000\u0000\u0000\u0154"+
		"\u0152\u0001\u0000\u0000\u0000\u0154\u0155\u0001\u0000\u0000\u0000\u0155"+
		"\u0156\u0001\u0000\u0000\u0000\u0156\u0157\u0005:\u0000\u0000\u0157\u0159"+
		"\u0001\u0000\u0000\u0000\u0158\u012c\u0001\u0000\u0000\u0000\u0158\u0131"+
		"\u0001\u0000\u0000\u0000\u0158\u0136\u0001\u0000\u0000\u0000\u0158\u013a"+
		"\u0001\u0000\u0000\u0000\u0158\u0142\u0001\u0000\u0000\u0000\u0158\u0147"+
		"\u0001\u0000\u0000\u0000\u0158\u014c\u0001\u0000\u0000\u0000\u0159#\u0001"+
		"\u0000\u0000\u0000\u015a\u015b\u0005\u0007\u0000\u0000\u015b\u015c\u0005"+
		"9\u0000\u0000\u015c\u015e\u0003\u0004\u0002\u0000\u015d\u015f\u0005;\u0000"+
		"\u0000\u015e\u015d\u0001\u0000\u0000\u0000\u015e\u015f\u0001\u0000\u0000"+
		"\u0000\u015f\u0160\u0001\u0000\u0000\u0000\u0160\u0161\u0005>\u0000\u0000"+
		"\u0161\u0162\u0005:\u0000\u0000\u0162\u01a3\u0001\u0000\u0000\u0000\u0163"+
		"\u0164\u0005\u0007\u0000\u0000\u0164\u0165\u00059\u0000\u0000\u0165\u0167"+
		"\u0003@ \u0000\u0166\u0168\u0005;\u0000\u0000\u0167\u0166\u0001\u0000"+
		"\u0000\u0000\u0167\u0168\u0001\u0000\u0000\u0000\u0168\u0169\u0001\u0000"+
		"\u0000\u0000\u0169\u016a\u0005>\u0000\u0000\u016a\u016b\u0005:\u0000\u0000"+
		"\u016b\u01a3\u0001\u0000\u0000\u0000\u016c\u016d\u0005\u0007\u0000\u0000"+
		"\u016d\u016e\u00059\u0000\u0000\u016e\u0170\u0005>\u0000\u0000\u016f\u0171"+
		"\u0005;\u0000\u0000\u0170\u016f\u0001\u0000\u0000\u0000\u0170\u0171\u0001"+
		"\u0000\u0000\u0000\u0171\u0172\u0001\u0000\u0000\u0000\u0172\u0173\u0005"+
		">\u0000\u0000\u0173\u01a3\u0005:\u0000\u0000\u0174\u0175\u0005\u0007\u0000"+
		"\u0000\u0175\u0176\u00059\u0000\u0000\u0176\u0178\u0003*\u0015\u0000\u0177"+
		"\u0179\u0005;\u0000\u0000\u0178\u0177\u0001\u0000\u0000\u0000\u0178\u0179"+
		"\u0001\u0000\u0000\u0000\u0179\u017a\u0001\u0000\u0000\u0000\u017a\u017b"+
		"\u0005>\u0000\u0000\u017b\u017c\u0005\u0002\u0000\u0000\u017c\u017d\u0005"+
		"@\u0000\u0000\u017d\u017e\u0005\u0003\u0000\u0000\u017e\u017f\u0005:\u0000"+
		"\u0000\u017f\u01a3\u0001\u0000\u0000\u0000\u0180\u0181\u0005\u0007\u0000"+
		"\u0000\u0181\u0182\u00059\u0000\u0000\u0182\u0184\u0003>\u001f\u0000\u0183"+
		"\u0185\u0005;\u0000\u0000\u0184\u0183\u0001\u0000\u0000\u0000\u0184\u0185"+
		"\u0001\u0000\u0000\u0000\u0185\u0186\u0001\u0000\u0000\u0000\u0186\u0187"+
		"\u0005>\u0000\u0000\u0187\u0188\u0005:\u0000\u0000\u0188\u01a3\u0001\u0000"+
		"\u0000\u0000\u0189\u018a\u0005\u0007\u0000\u0000\u018a\u018b\u00059\u0000"+
		"\u0000\u018b\u018d\u00030\u0018\u0000\u018c\u018e\u0005;\u0000\u0000\u018d"+
		"\u018c\u0001\u0000\u0000\u0000\u018d\u018e\u0001\u0000\u0000\u0000\u018e"+
		"\u018f\u0001\u0000\u0000\u0000\u018f\u0190\u0005>\u0000\u0000\u0190\u0191"+
		"\u0005:\u0000\u0000\u0191\u01a3\u0001\u0000\u0000\u0000\u0192\u0193\u0005"+
		"\u0007\u0000\u0000\u0193\u0194\u00059\u0000\u0000\u0194\u0198\u0003(\u0014"+
		"\u0000\u0195\u0196\u0005\u0002\u0000\u0000\u0196\u0197\u0005@\u0000\u0000"+
		"\u0197\u0199\u0005\u0003\u0000\u0000\u0198\u0195\u0001\u0000\u0000\u0000"+
		"\u0199\u019a\u0001\u0000\u0000\u0000\u019a\u0198\u0001\u0000\u0000\u0000"+
		"\u019a\u019b\u0001\u0000\u0000\u0000\u019b\u019d\u0001\u0000\u0000\u0000"+
		"\u019c\u019e\u0005;\u0000\u0000\u019d\u019c\u0001\u0000\u0000\u0000\u019d"+
		"\u019e\u0001\u0000\u0000\u0000\u019e\u019f\u0001\u0000\u0000\u0000\u019f"+
		"\u01a0\u0005>\u0000\u0000\u01a0\u01a1\u0005:\u0000\u0000\u01a1\u01a3\u0001"+
		"\u0000\u0000\u0000\u01a2\u015a\u0001\u0000\u0000\u0000\u01a2\u0163\u0001"+
		"\u0000\u0000\u0000\u01a2\u016c\u0001\u0000\u0000\u0000\u01a2\u0174\u0001"+
		"\u0000\u0000\u0000\u01a2\u0180\u0001\u0000\u0000\u0000\u01a2\u0189\u0001"+
		"\u0000\u0000\u0000\u01a2\u0192\u0001\u0000\u0000\u0000\u01a3%\u0001\u0000"+
		"\u0000\u0000\u01a4\u01a6\u0005\u0004\u0000\u0000\u01a5\u01a7\u0005B\u0000"+
		"\u0000\u01a6\u01a5\u0001\u0000\u0000\u0000\u01a6\u01a7\u0001\u0000\u0000"+
		"\u0000\u01a7\u01af\u0001\u0000\u0000\u0000\u01a8\u01a9\u0003\n\u0005\u0000"+
		"\u01a9\u01ab\u0005\u0001\u0000\u0000\u01aa\u01ac\u0005B\u0000\u0000\u01ab"+
		"\u01aa\u0001\u0000\u0000\u0000\u01ab\u01ac\u0001\u0000\u0000\u0000\u01ac"+
		"\u01ae\u0001\u0000\u0000\u0000\u01ad\u01a8\u0001\u0000\u0000\u0000\u01ae"+
		"\u01b1\u0001\u0000\u0000\u0000\u01af\u01ad\u0001\u0000\u0000\u0000\u01af"+
		"\u01b0\u0001\u0000\u0000\u0000\u01b0\u01b2\u0001\u0000\u0000\u0000\u01b1"+
		"\u01af\u0001\u0000\u0000\u0000\u01b2\u01b3\u0005\u0005\u0000\u0000\u01b3"+
		"\'\u0001\u0000\u0000\u0000\u01b4\u01b9\u0005\u0002\u0000\u0000\u01b5\u01b7"+
		"\u0003*\u0015\u0000\u01b6\u01b8\u0005;\u0000\u0000\u01b7\u01b6\u0001\u0000"+
		"\u0000\u0000\u01b7\u01b8\u0001\u0000\u0000\u0000\u01b8\u01ba\u0001\u0000"+
		"\u0000\u0000\u01b9\u01b5\u0001\u0000\u0000\u0000\u01ba\u01bb\u0001\u0000"+
		"\u0000\u0000\u01bb\u01b9\u0001\u0000\u0000\u0000\u01bb\u01bc\u0001\u0000"+
		"\u0000\u0000\u01bc\u01bd\u0001\u0000\u0000\u0000\u01bd\u01be\u0005\u0003"+
		"\u0000\u0000\u01be\u01c1\u0001\u0000\u0000\u0000\u01bf\u01c1\u0005?\u0000"+
		"\u0000\u01c0\u01b4\u0001\u0000\u0000\u0000\u01c0\u01bf\u0001\u0000\u0000"+
		"\u0000\u01c1)\u0001\u0000\u0000\u0000\u01c2\u01c7\u0005\u0002\u0000\u0000"+
		"\u01c3\u01c5\u0003@ \u0000\u01c4\u01c6\u0005;\u0000\u0000\u01c5\u01c4"+
		"\u0001\u0000\u0000\u0000\u01c5\u01c6\u0001\u0000\u0000\u0000\u01c6\u01c8"+
		"\u0001\u0000\u0000\u0000\u01c7\u01c3\u0001\u0000\u0000\u0000\u01c8\u01c9"+
		"\u0001\u0000\u0000\u0000\u01c9\u01c7\u0001\u0000\u0000\u0000\u01c9\u01ca"+
		"\u0001\u0000\u0000\u0000\u01ca\u01cb\u0001\u0000\u0000\u0000\u01cb\u01cc"+
		"\u0005\u0003\u0000\u0000\u01cc\u01d0\u0001\u0000\u0000\u0000\u01cd\u01d0"+
		"\u0005?\u0000\u0000\u01ce\u01d0\u00030\u0018\u0000\u01cf\u01c2\u0001\u0000"+
		"\u0000\u0000\u01cf\u01cd\u0001\u0000\u0000\u0000\u01cf\u01ce\u0001\u0000"+
		"\u0000\u0000\u01d0+\u0001\u0000\u0000\u0000\u01d1\u01d2\u0005?\u0000\u0000"+
		"\u01d2\u01d3\u0005\u0006\u0000\u0000\u01d3\u01e1\u0003>\u001f\u0000\u01d4"+
		"\u01d5\u0005?\u0000\u0000\u01d5\u01d6\u0005\u0006\u0000\u0000\u01d6\u01e1"+
		"\u0003@ \u0000\u01d7\u01d8\u0005?\u0000\u0000\u01d8\u01d9\u0005\u0006"+
		"\u0000\u0000\u01d9\u01e1\u0005>\u0000\u0000\u01da\u01db\u0005?\u0000\u0000"+
		"\u01db\u01dc\u0005\u0006\u0000\u0000\u01dc\u01e1\u0003(\u0014\u0000\u01dd"+
		"\u01de\u0005?\u0000\u0000\u01de\u01df\u0005\u0006\u0000\u0000\u01df\u01e1"+
		"\u0003*\u0015\u0000\u01e0\u01d1\u0001\u0000\u0000\u0000\u01e0\u01d4\u0001"+
		"\u0000\u0000\u0000\u01e0\u01d7\u0001\u0000\u0000\u0000\u01e0\u01da\u0001"+
		"\u0000\u0000\u0000\u01e0\u01dd\u0001\u0000\u0000\u0000\u01e1-\u0001\u0000"+
		"\u0000\u0000\u01e2\u01e6\u0003@ \u0000\u01e3\u01e6\u0003\u001a\r\u0000"+
		"\u01e4\u01e6\u0005>\u0000\u0000\u01e5\u01e2\u0001\u0000\u0000\u0000\u01e5"+
		"\u01e3\u0001\u0000\u0000\u0000\u01e5\u01e4\u0001\u0000\u0000\u0000\u01e6"+
		"/\u0001\u0000\u0000\u0000\u01e7\u01e8\u0005\u000b\u0000\u0000\u01e8\u01e9"+
		"\u00059\u0000\u0000\u01e9\u01eb\u0003*\u0015\u0000\u01ea\u01ec\u0005;"+
		"\u0000\u0000\u01eb\u01ea\u0001\u0000\u0000\u0000\u01eb\u01ec\u0001\u0000"+
		"\u0000\u0000\u01ec\u01ed\u0001\u0000\u0000\u0000\u01ed\u01ee\u0003*\u0015"+
		"\u0000\u01ee\u01ef\u0005:\u0000\u0000\u01ef\u020c\u0001\u0000\u0000\u0000"+
		"\u01f0\u01f1\u0005\f\u0000\u0000\u01f1\u01f2\u00059\u0000\u0000\u01f2"+
		"\u01f4\u0003*\u0015\u0000\u01f3\u01f5\u0005;\u0000\u0000\u01f4\u01f3\u0001"+
		"\u0000\u0000\u0000\u01f4\u01f5\u0001\u0000\u0000\u0000\u01f5\u01f6\u0001"+
		"\u0000\u0000\u0000\u01f6\u01f7\u0003*\u0015\u0000\u01f7\u01f8\u0005:\u0000"+
		"\u0000\u01f8\u020c\u0001\u0000\u0000\u0000\u01f9\u01fa\u0005\r\u0000\u0000"+
		"\u01fa\u01fb\u00059\u0000\u0000\u01fb\u01fd\u0003*\u0015\u0000\u01fc\u01fe"+
		"\u0005;\u0000\u0000\u01fd\u01fc\u0001\u0000\u0000\u0000\u01fd\u01fe\u0001"+
		"\u0000\u0000\u0000\u01fe\u01ff\u0001\u0000\u0000\u0000\u01ff\u0200\u0003"+
		"*\u0015\u0000\u0200\u0201\u0005:\u0000\u0000\u0201\u020c\u0001\u0000\u0000"+
		"\u0000\u0202\u0203\u0005\u000e\u0000\u0000\u0203\u0204\u00059\u0000\u0000"+
		"\u0204\u0206\u0003*\u0015\u0000\u0205\u0207\u0005;\u0000\u0000\u0206\u0205"+
		"\u0001\u0000\u0000\u0000\u0206\u0207\u0001\u0000\u0000\u0000\u0207\u0208"+
		"\u0001\u0000\u0000\u0000\u0208\u0209\u0003*\u0015\u0000\u0209\u020a\u0005"+
		":\u0000\u0000\u020a\u020c\u0001\u0000\u0000\u0000\u020b\u01e7\u0001\u0000"+
		"\u0000\u0000\u020b\u01f0\u0001\u0000\u0000\u0000\u020b\u01f9\u0001\u0000"+
		"\u0000\u0000\u020b\u0202\u0001\u0000\u0000\u0000\u020c1\u0001\u0000\u0000"+
		"\u0000\u020d\u020e\u0005\u000f\u0000\u0000\u020e\u020f\u00059\u0000\u0000"+
		"\u020f\u0210\u0003@ \u0000\u0210\u0211\u0005:\u0000\u0000\u0211\u023b"+
		"\u0001\u0000\u0000\u0000\u0212\u0213\u0005\u0010\u0000\u0000\u0213\u0214"+
		"\u00059\u0000\u0000\u0214\u0215\u0003@ \u0000\u0215\u0216\u0005:\u0000"+
		"\u0000\u0216\u023b\u0001\u0000\u0000\u0000\u0217\u0218\u0005\u0011\u0000"+
		"\u0000\u0218\u0219\u00059\u0000\u0000\u0219\u021a\u0003@ \u0000\u021a"+
		"\u021b\u0005:\u0000\u0000\u021b\u023b\u0001\u0000\u0000\u0000\u021c\u021d"+
		"\u0005\u0012\u0000\u0000\u021d\u021e\u00059\u0000\u0000\u021e\u021f\u0003"+
		"@ \u0000\u021f\u0220\u0005:\u0000\u0000\u0220\u023b\u0001\u0000\u0000"+
		"\u0000\u0221\u0222\u0005\u0013\u0000\u0000\u0222\u0223\u00059\u0000\u0000"+
		"\u0223\u0224\u0003@ \u0000\u0224\u0225\u0005:\u0000\u0000\u0225\u023b"+
		"\u0001\u0000\u0000\u0000\u0226\u0227\u0005\u0014\u0000\u0000\u0227\u0228"+
		"\u00059\u0000\u0000\u0228\u0229\u0003@ \u0000\u0229\u022a\u0005:\u0000"+
		"\u0000\u022a\u023b\u0001\u0000\u0000\u0000\u022b\u022c\u0005\u0015\u0000"+
		"\u0000\u022c\u022d\u00059\u0000\u0000\u022d\u022e\u0003@ \u0000\u022e"+
		"\u022f\u0005:\u0000\u0000\u022f\u023b\u0001\u0000\u0000\u0000\u0230\u0231"+
		"\u0005\u0016\u0000\u0000\u0231\u0232\u00059\u0000\u0000\u0232\u0233\u0003"+
		"@ \u0000\u0233\u0234\u0005:\u0000\u0000\u0234\u023b\u0001\u0000\u0000"+
		"\u0000\u0235\u0236\u0005\u0017\u0000\u0000\u0236\u0237\u00059\u0000\u0000"+
		"\u0237\u0238\u0003@ \u0000\u0238\u0239\u0005:\u0000\u0000\u0239\u023b"+
		"\u0001\u0000\u0000\u0000\u023a\u020d\u0001\u0000\u0000\u0000\u023a\u0212"+
		"\u0001\u0000\u0000\u0000\u023a\u0217\u0001\u0000\u0000\u0000\u023a\u021c"+
		"\u0001\u0000\u0000\u0000\u023a\u0221\u0001\u0000\u0000\u0000\u023a\u0226"+
		"\u0001\u0000\u0000\u0000\u023a\u022b\u0001\u0000\u0000\u0000\u023a\u0230"+
		"\u0001\u0000\u0000\u0000\u023a\u0235\u0001\u0000\u0000\u0000\u023b3\u0001"+
		"\u0000\u0000\u0000\u023c\u023f\u00036\u001b\u0000\u023d\u023f\u0003>\u001f"+
		"\u0000\u023e\u023c\u0001\u0000\u0000\u0000\u023e\u023d\u0001\u0000\u0000"+
		"\u0000\u023f5\u0001\u0000\u0000\u0000\u0240\u0244\u00032\u0019\u0000\u0241"+
		"\u0244\u0003<\u001e\u0000\u0242\u0244\u00038\u001c\u0000\u0243\u0240\u0001"+
		"\u0000\u0000\u0000\u0243\u0241\u0001\u0000\u0000\u0000\u0243\u0242\u0001"+
		"\u0000\u0000\u0000\u02447\u0001\u0000\u0000\u0000\u0245\u0246\u0003:\u001d"+
		"\u0000\u02469\u0001\u0000\u0000\u0000\u0247\u0248\u0005\t\u0000\u0000"+
		"\u0248\u0249\u00059\u0000\u0000\u0249\u024a\u0005A\u0000\u0000\u024a\u024b"+
		"\u0005:\u0000\u0000\u024b;\u0001\u0000\u0000\u0000\u024c\u024d\u0005\n"+
		"\u0000\u0000\u024d\u024e\u00059\u0000\u0000\u024e\u024f\u0003@ \u0000"+
		"\u024f\u0250\u0005:\u0000\u0000\u0250=\u0001\u0000\u0000\u0000\u0251\u0252"+
		"\u0005?\u0000\u0000\u0252\u0257\u00059\u0000\u0000\u0253\u0255\u0003@"+
		" \u0000\u0254\u0256\u0005;\u0000\u0000\u0255\u0254\u0001\u0000\u0000\u0000"+
		"\u0255\u0256\u0001\u0000\u0000\u0000\u0256\u0258\u0001\u0000\u0000\u0000"+
		"\u0257\u0253\u0001\u0000\u0000\u0000\u0258\u0259\u0001\u0000\u0000\u0000"+
		"\u0259\u0257\u0001\u0000\u0000\u0000\u0259\u025a\u0001\u0000\u0000\u0000"+
		"\u025a\u025b\u0001\u0000\u0000\u0000\u025b\u025c\u0005:\u0000\u0000\u025c"+
		"\u0264\u0001\u0000\u0000\u0000\u025d\u025e\u0005?\u0000\u0000\u025e\u025f"+
		"\u00059\u0000\u0000\u025f\u0260\u0003\u0004\u0002\u0000\u0260\u0261\u0005"+
		":\u0000\u0000\u0261\u0262\u0005\u0001\u0000\u0000\u0262\u0264\u0001\u0000"+
		"\u0000\u0000\u0263\u0251\u0001\u0000\u0000\u0000\u0263\u025d\u0001\u0000"+
		"\u0000\u0000\u0264?\u0001\u0000\u0000\u0000\u0265\u0266\u0006 \uffff\uffff"+
		"\u0000\u0266\u0267\u00056\u0000\u0000\u0267\u0276\u0003@ \u0006\u0268"+
		"\u0276\u0005A\u0000\u0000\u0269\u0276\u0005@\u0000\u0000\u026a\u0276\u0003"+
		"4\u001a\u0000\u026b\u026c\u00059\u0000\u0000\u026c\u026d\u0003@ \u0000"+
		"\u026d\u026e\u0005:\u0000\u0000\u026e\u0276\u0001\u0000\u0000\u0000\u026f"+
		"\u0273\u0005?\u0000\u0000\u0270\u0271\u0005\u0002\u0000\u0000\u0271\u0272"+
		"\u0005@\u0000\u0000\u0272\u0274\u0005\u0003\u0000\u0000\u0273\u0270\u0001"+
		"\u0000\u0000\u0000\u0273\u0274\u0001\u0000\u0000\u0000\u0274\u0276\u0001"+
		"\u0000\u0000\u0000\u0275\u0265\u0001\u0000\u0000\u0000\u0275\u0268\u0001"+
		"\u0000\u0000\u0000\u0275\u0269\u0001\u0000\u0000\u0000\u0275\u026a\u0001"+
		"\u0000\u0000\u0000\u0275\u026b\u0001\u0000\u0000\u0000\u0275\u026f\u0001"+
		"\u0000\u0000\u0000\u0276\u0285\u0001\u0000\u0000\u0000\u0277\u0278\n\n"+
		"\u0000\u0000\u0278\u0279\u00058\u0000\u0000\u0279\u0284\u0003@ \u000b"+
		"\u027a\u027b\n\t\u0000\u0000\u027b\u027c\u0007\u0001\u0000\u0000\u027c"+
		"\u0284\u0003@ \n\u027d\u027e\n\b\u0000\u0000\u027e\u027f\u0007\u0002\u0000"+
		"\u0000\u027f\u0284\u0003@ \t\u0280\u0281\n\u0007\u0000\u0000\u0281\u0282"+
		"\u0005\u001b\u0000\u0000\u0282\u0284\u0003@ \b\u0283\u0277\u0001\u0000"+
		"\u0000\u0000\u0283\u027a\u0001\u0000\u0000\u0000\u0283\u027d\u0001\u0000"+
		"\u0000\u0000\u0283\u0280\u0001\u0000\u0000\u0000\u0284\u0287\u0001\u0000"+
		"\u0000\u0000\u0285\u0283\u0001\u0000\u0000\u0000\u0285\u0286\u0001\u0000"+
		"\u0000\u0000\u0286A\u0001\u0000\u0000\u0000\u0287\u0285\u0001\u0000\u0000"+
		"\u0000DEINRVZcgmqux\u007f\u0089\u0091\u0095\u00a8\u00af\u00b8\u00bb\u00c1"+
		"\u00cb\u00cf\u00d2\u00dc\u00ea\u00f3\u0103\u010e\u011f\u012a\u0154\u0158"+
		"\u015e\u0167\u0170\u0178\u0184\u018d\u019a\u019d\u01a2\u01a6\u01ab\u01af"+
		"\u01b7\u01bb\u01c0\u01c5\u01c9\u01cf\u01e0\u01e5\u01eb\u01f4\u01fd\u0206"+
		"\u020b\u023a\u023e\u0243\u0255\u0259\u0263\u0273\u0275\u0283\u0285";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}