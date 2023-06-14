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
		RULE_prog = 0, RULE_stat = 1, RULE_idlist = 2, RULE_arglist = 3, RULE_idvarlist = 4, 
		RULE_type = 5, RULE_algorithm = 6, RULE_statement = 7, RULE_fread_statement = 8, 
		RULE_return_statement = 9, RULE_while_statement = 10, RULE_if_statement = 11, 
		RULE_for_statement = 12, RULE_fun_statement = 13, RULE_relexpr = 14, RULE_bexpression = 15, 
		RULE_bterm = 16, RULE_bfactor = 17, RULE_read_statement = 18, RULE_write_statement = 19, 
		RULE_fwrite_statement = 20, RULE_block = 21, RULE_matrix = 22, RULE_array = 23, 
		RULE_assignment_statement = 24, RULE_value = 25, RULE_arrayexpr = 26, 
		RULE_trigFunction = 27, RULE_function = 28, RULE_mathFunction = 29, RULE_probFunction = 30, 
		RULE_randomFunction = 31, RULE_logFunction = 32, RULE_usefunction = 33, 
		RULE_algexpr = 34;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "stat", "idlist", "arglist", "idvarlist", "type", "algorithm", 
			"statement", "fread_statement", "return_statement", "while_statement", 
			"if_statement", "for_statement", "fun_statement", "relexpr", "bexpression", 
			"bterm", "bfactor", "read_statement", "write_statement", "fwrite_statement", 
			"block", "matrix", "array", "assignment_statement", "value", "arrayexpr", 
			"trigFunction", "function", "mathFunction", "probFunction", "randomFunction", 
			"logFunction", "usefunction", "algexpr"
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
			setState(71); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(70);
				stat();
				}
				}
				setState(73); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 7)) & ~0x3f) == 0 && ((1L << (_la - 7)) & 1082164031530205181L) != 0) );
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
			setState(123);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				_localctx = new ProbContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(75);
				randomFunction();
				setState(77);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
				case 1:
					{
					setState(76);
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
				setState(79);
				algorithm();
				}
				break;
			case 3:
				_localctx = new UsefunContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(80);
				usefunction();
				setState(82);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(81);
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
				setState(84);
				arrayexpr();
				setState(86);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(85);
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
				setState(88);
				algexpr(0);
				setState(90);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(89);
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
				setState(92);
				assignment_statement();
				setState(94);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(93);
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
				setState(96);
				bexpression(0);
				}
				break;
			case 8:
				_localctx = new WhileContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(97);
				while_statement();
				}
				break;
			case 9:
				_localctx = new IfContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(98);
				if_statement();
				}
				break;
			case 10:
				_localctx = new ForContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(99);
				for_statement();
				}
				break;
			case 11:
				_localctx = new RelationalexpresionContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(100);
				relexpr();
				}
				break;
			case 12:
				_localctx = new WriteContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(101);
				write_statement();
				setState(103);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(102);
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
				setState(105);
				fwrite_statement();
				setState(107);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					setState(106);
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
				setState(109);
				read_statement();
				}
				break;
			case 15:
				_localctx = new FunctionsContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(110);
				fun_statement();
				setState(112);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					setState(111);
					match(WS);
					}
					break;
				}
				}
				break;
			case 16:
				_localctx = new Return2Context(_localctx);
				enterOuterAlt(_localctx, 16);
				{
				setState(114);
				return_statement();
				setState(116);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
				case 1:
					{
					setState(115);
					match(WS);
					}
					break;
				}
				}
				break;
			case 17:
				_localctx = new TrigContext(_localctx);
				enterOuterAlt(_localctx, 17);
				{
				setState(118);
				trigFunction();
				setState(120);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
				case 1:
					{
					setState(119);
					match(WS);
					}
					break;
				}
				}
				break;
			case 18:
				_localctx = new BlankContext(_localctx);
				enterOuterAlt(_localctx, 18);
				{
				setState(122);
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			match(ID);
			setState(130);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(126);
				match(COMMA);
				setState(127);
				match(ID);
				}
				}
				setState(132);
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
	public static class ArglistContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(StarParser.ID, 0); }
		public TerminalNode COMMA() { return getToken(StarParser.COMMA, 0); }
		public ArglistContext arglist() {
			return getRuleContext(ArglistContext.class,0);
		}
		public ArglistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arglist; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StarVisitor ) return ((StarVisitor<? extends T>)visitor).visitArglist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArglistContext arglist() throws RecognitionException {
		ArglistContext _localctx = new ArglistContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_arglist);
		try {
			setState(137);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(133);
				match(ID);
				setState(134);
				match(COMMA);
				setState(135);
				arglist();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(136);
				match(ID);
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
	public static class IdvarlistContext extends ParserRuleContext {
		public Assignment_statementContext assignment_statement() {
			return getRuleContext(Assignment_statementContext.class,0);
		}
		public TerminalNode ID() { return getToken(StarParser.ID, 0); }
		public List<IdvarlistContext> idvarlist() {
			return getRuleContexts(IdvarlistContext.class);
		}
		public IdvarlistContext idvarlist(int i) {
			return getRuleContext(IdvarlistContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(StarParser.COMMA, 0); }
		public IdvarlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_idvarlist; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StarVisitor ) return ((StarVisitor<? extends T>)visitor).visitIdvarlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdvarlistContext idvarlist() throws RecognitionException {
		return idvarlist(0);
	}

	private IdvarlistContext idvarlist(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		IdvarlistContext _localctx = new IdvarlistContext(_ctx, _parentState);
		IdvarlistContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_idvarlist, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(140);
				assignment_statement();
				}
				break;
			case 2:
				{
				setState(141);
				match(ID);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(149);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new IdvarlistContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_idvarlist);
					setState(144);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(145);
					match(COMMA);
					setState(146);
					idvarlist(4);
					}
					} 
				}
				setState(151);
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
			unrollRecursionContexts(_parentctx);
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
		enterRule(_localctx, 10, RULE_type);
		try {
			setState(159);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				_localctx = new TipoIntContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(152);
				match(INT);
				}
				break;
			case FLOAT:
				_localctx = new TipoFloatContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(153);
				match(FLOAT);
				}
				break;
			case STRING:
				_localctx = new TipoStringContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(154);
				match(STRING);
				}
				break;
			case BOOL:
				_localctx = new TipoBoolContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(155);
				match(BOOL);
				}
				break;
			case MATRIX:
				_localctx = new TipoMatrixContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(156);
				match(MATRIX);
				}
				break;
			case VECTOR:
				_localctx = new TipoVectorContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(157);
				match(VECTOR);
				}
				break;
			case TMW:
				_localctx = new TipoTMWContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(158);
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
		public ArglistContext arglist() {
			return getRuleContext(ArglistContext.class,0);
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
		enterRule(_localctx, 12, RULE_algorithm);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			match(ALGORITHM);
			setState(162);
			match(ID);
			setState(167);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LEFTP) {
				{
				setState(163);
				match(LEFTP);
				setState(164);
				arglist();
				setState(165);
				match(RIGHTP);
				}
			}

			setState(169);
			match(COLON);
			setState(171);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(170);
				match(WS);
				}
			}

			setState(173);
			statement();
			setState(174);
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
		enterRule(_localctx, 14, RULE_statement);
		try {
			setState(190);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(176);
				block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(177);
				read_statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(178);
				fread_statement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(179);
				write_statement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(180);
				fwrite_statement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(181);
				while_statement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(182);
				if_statement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(183);
				for_statement();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(184);
				fun_statement();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(185);
				usefunction();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(186);
				assignment_statement();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(187);
				return_statement();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(188);
				algexpr(0);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(189);
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
		public ArglistContext arglist() {
			return getRuleContext(ArglistContext.class,0);
		}
		public TerminalNode RIGHTP() { return getToken(StarParser.RIGHTP, 0); }
		public TerminalNode CADENA() { return getToken(StarParser.CADENA, 0); }
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
		enterRule(_localctx, 16, RULE_fread_statement);
		try {
			setState(201);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(192);
				match(FREAD);
				setState(193);
				match(LEFTP);
				setState(194);
				arglist();
				setState(195);
				match(RIGHTP);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(197);
				match(FREAD);
				setState(198);
				match(LEFTP);
				setState(199);
				match(CADENA);
				setState(200);
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
		enterRule(_localctx, 18, RULE_return_statement);
		try {
			setState(207);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(203);
				match(RETURN);
				setState(204);
				usefunction();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(205);
				match(RETURN);
				setState(206);
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
		enterRule(_localctx, 20, RULE_while_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			match(WHILE);
			setState(210);
			bexpression(0);
			setState(211);
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
		enterRule(_localctx, 22, RULE_if_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			match(IF);
			setState(214);
			bexpression(0);
			setState(215);
			statement();
			setState(217);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(216);
				match(WS);
				}
				break;
			}
			setState(224);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				setState(219);
				match(ELSE);
				setState(221);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(220);
					match(WS);
					}
				}

				setState(223);
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
		enterRule(_localctx, 24, RULE_for_statement);
		int _la;
		try {
			setState(248);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(226);
				match(FOR);
				setState(227);
				assignment_statement();
				setState(228);
				match(T__0);
				setState(229);
				bexpression(0);
				setState(230);
				match(T__0);
				setState(231);
				assignment_statement();
				setState(232);
				match(T__0);
				setState(234);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(233);
					match(WS);
					}
				}

				setState(236);
				statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(238);
				match(FOR);
				setState(239);
				match(LEFTP);
				setState(240);
				assignment_statement();
				setState(241);
				match(T__0);
				setState(242);
				bexpression(0);
				setState(243);
				match(T__0);
				setState(244);
				assignment_statement();
				setState(245);
				match(RIGHTP);
				setState(246);
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
		enterRule(_localctx, 26, RULE_fun_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
			match(DEF);
			setState(251);
			match(ID);
			setState(252);
			match(LEFTP);
			setState(253);
			idlist();
			setState(254);
			match(RIGHTP);
			setState(255);
			match(COLON);
			setState(257);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(256);
				match(WS);
				}
			}

			setState(259);
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
		enterRule(_localctx, 28, RULE_relexpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(261);
			algexpr(0);
			setState(262);
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
			setState(263);
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
		int _startState = 30;
		enterRecursionRule(_localctx, 30, RULE_bexpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new Bexp2Context(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(266);
			bterm(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(273);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Bexp1Context(new BexpressionContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_bexpression);
					setState(268);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(269);
					match(OR);
					setState(270);
					bterm(0);
					}
					} 
				}
				setState(275);
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
		int _startState = 32;
		enterRecursionRule(_localctx, 32, RULE_bterm, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new Bterm2Context(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(277);
			bfactor();
			}
			_ctx.stop = _input.LT(-1);
			setState(284);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Bterm1Context(new BtermContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_bterm);
					setState(279);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(280);
					match(AND);
					setState(281);
					bfactor();
					}
					} 
				}
				setState(286);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
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
		enterRule(_localctx, 34, RULE_bfactor);
		try {
			setState(301);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				_localctx = new BNegContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(287);
				match(NOT);
				setState(288);
				bfactor();
				}
				break;
			case 2:
				_localctx = new BParenthesisContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(289);
				match(LEFTP);
				setState(290);
				bexpression(0);
				setState(291);
				match(RIGHTP);
				}
				break;
			case 3:
				_localctx = new BIDContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(293);
				match(ID);
				}
				break;
			case 4:
				_localctx = new BTrueContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(294);
				match(TRUE);
				}
				break;
			case 5:
				_localctx = new BFalseContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(295);
				match(FALSE);
				}
				break;
			case 6:
				_localctx = new RelationalsContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(296);
				relexpr();
				}
				break;
			case 7:
				_localctx = new RelParenthesisContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(297);
				match(LEFTP);
				setState(298);
				relexpr();
				setState(299);
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
		public ArglistContext arglist() {
			return getRuleContext(ArglistContext.class,0);
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
		enterRule(_localctx, 36, RULE_read_statement);
		try {
			setState(312);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(303);
				match(READ);
				setState(304);
				match(LEFTP);
				setState(305);
				arglist();
				setState(306);
				match(RIGHTP);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(308);
				match(READ);
				setState(309);
				match(LEFTP);
				setState(310);
				match(CADENA);
				setState(311);
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
		public ArglistContext arglist() {
			return getRuleContext(ArglistContext.class,0);
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
		enterRule(_localctx, 38, RULE_write_statement);
		int _la;
		try {
			setState(358);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(314);
				match(WRITE);
				setState(315);
				match(LEFTP);
				setState(316);
				arglist();
				setState(317);
				match(RIGHTP);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(319);
				match(WRITE);
				setState(320);
				match(LEFTP);
				setState(321);
				algexpr(0);
				setState(322);
				match(RIGHTP);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(324);
				match(WRITE);
				setState(325);
				match(LEFTP);
				setState(326);
				match(CADENA);
				setState(327);
				match(RIGHTP);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(328);
				match(WRITE);
				setState(329);
				match(LEFTP);
				setState(330);
				array();
				setState(331);
				match(T__1);
				setState(332);
				match(INTEGER);
				setState(333);
				match(T__2);
				setState(334);
				match(RIGHTP);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(336);
				match(WRITE);
				setState(337);
				match(LEFTP);
				setState(338);
				usefunction();
				setState(339);
				match(RIGHTP);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(341);
				match(WRITE);
				setState(342);
				match(LEFTP);
				setState(343);
				arrayexpr();
				setState(344);
				match(RIGHTP);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(346);
				match(WRITE);
				setState(347);
				match(LEFTP);
				setState(348);
				matrix();
				setState(352); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(349);
					match(T__1);
					setState(350);
					match(INTEGER);
					setState(351);
					match(T__2);
					}
					}
					setState(354); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__1 );
				setState(356);
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
		public ArglistContext arglist() {
			return getRuleContext(ArglistContext.class,0);
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
		enterRule(_localctx, 40, RULE_fwrite_statement);
		int _la;
		try {
			setState(432);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(360);
				match(FWRITE);
				setState(361);
				match(LEFTP);
				setState(362);
				arglist();
				setState(364);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(363);
					match(COMMA);
					}
				}

				setState(366);
				match(CADENA);
				setState(367);
				match(RIGHTP);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(369);
				match(FWRITE);
				setState(370);
				match(LEFTP);
				setState(371);
				algexpr(0);
				setState(373);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(372);
					match(COMMA);
					}
				}

				setState(375);
				match(CADENA);
				setState(376);
				match(RIGHTP);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(378);
				match(FWRITE);
				setState(379);
				match(LEFTP);
				setState(380);
				match(CADENA);
				setState(382);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(381);
					match(COMMA);
					}
				}

				setState(384);
				match(CADENA);
				setState(385);
				match(RIGHTP);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(386);
				match(FWRITE);
				setState(387);
				match(LEFTP);
				setState(388);
				array();
				setState(390);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(389);
					match(COMMA);
					}
				}

				setState(392);
				match(CADENA);
				setState(393);
				match(T__1);
				setState(394);
				match(INTEGER);
				setState(395);
				match(T__2);
				setState(396);
				match(RIGHTP);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(398);
				match(FWRITE);
				setState(399);
				match(LEFTP);
				setState(400);
				usefunction();
				setState(402);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(401);
					match(COMMA);
					}
				}

				setState(404);
				match(CADENA);
				setState(405);
				match(RIGHTP);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(407);
				match(FWRITE);
				setState(408);
				match(LEFTP);
				setState(409);
				arrayexpr();
				setState(411);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(410);
					match(COMMA);
					}
				}

				setState(413);
				match(CADENA);
				setState(414);
				match(RIGHTP);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(416);
				match(FWRITE);
				setState(417);
				match(LEFTP);
				setState(418);
				matrix();
				setState(422); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(419);
					match(T__1);
					setState(420);
					match(INTEGER);
					setState(421);
					match(T__2);
					}
					}
					setState(424); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__1 );
				setState(427);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(426);
					match(COMMA);
					}
				}

				setState(429);
				match(CADENA);
				setState(430);
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
		enterRule(_localctx, 42, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(434);
			match(T__3);
			setState(436);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(435);
				match(WS);
				}
			}

			setState(445);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 4)) & ~0x3f) == 0 && ((1L << (_la - 4)) & 4045587201151467513L) != 0)) {
				{
				{
				setState(438);
				statement();
				setState(439);
				match(T__0);
				setState(441);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(440);
					match(WS);
					}
				}

				}
				}
				setState(447);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(448);
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
		enterRule(_localctx, 44, RULE_matrix);
		int _la;
		try {
			setState(462);
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
					array();
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
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & -9223372036854745084L) != 0) );
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
		enterRule(_localctx, 46, RULE_array);
		int _la;
		try {
			setState(477);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(464);
				match(T__1);
				setState(469); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(465);
					algexpr(0);
					setState(467);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==COMMA) {
						{
						setState(466);
						match(COMMA);
						}
					}

					}
					}
					setState(471); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 9)) & ~0x3f) == 0 && ((1L << (_la - 9)) & 126417448915206083L) != 0) );
				setState(473);
				match(T__2);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(475);
				match(ID);
				}
				break;
			case ARRAYADD:
			case ARRAYSUBS:
			case ARRAYDOT:
			case ARRAYCROSS:
				enterOuterAlt(_localctx, 3);
				{
				setState(476);
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
		enterRule(_localctx, 48, RULE_assignment_statement);
		try {
			setState(494);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(479);
				match(ID);
				setState(480);
				match(T__5);
				setState(481);
				usefunction();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(482);
				match(ID);
				setState(483);
				match(T__5);
				setState(484);
				algexpr(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(485);
				match(ID);
				setState(486);
				match(T__5);
				setState(487);
				match(CADENA);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(488);
				match(ID);
				setState(489);
				match(T__5);
				setState(490);
				matrix();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(491);
				match(ID);
				setState(492);
				match(T__5);
				setState(493);
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
		enterRule(_localctx, 50, RULE_value);
		try {
			setState(499);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(496);
				algexpr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(497);
				bexpression(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(498);
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
		enterRule(_localctx, 52, RULE_arrayexpr);
		int _la;
		try {
			setState(537);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ARRAYADD:
				enterOuterAlt(_localctx, 1);
				{
				setState(501);
				match(ARRAYADD);
				setState(502);
				match(LEFTP);
				setState(503);
				array();
				setState(505);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(504);
					match(COMMA);
					}
				}

				setState(507);
				array();
				setState(508);
				match(RIGHTP);
				}
				break;
			case ARRAYSUBS:
				enterOuterAlt(_localctx, 2);
				{
				setState(510);
				match(ARRAYSUBS);
				setState(511);
				match(LEFTP);
				setState(512);
				array();
				setState(514);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(513);
					match(COMMA);
					}
				}

				setState(516);
				array();
				setState(517);
				match(RIGHTP);
				}
				break;
			case ARRAYDOT:
				enterOuterAlt(_localctx, 3);
				{
				setState(519);
				match(ARRAYDOT);
				setState(520);
				match(LEFTP);
				setState(521);
				array();
				setState(523);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(522);
					match(COMMA);
					}
				}

				setState(525);
				array();
				setState(526);
				match(RIGHTP);
				}
				break;
			case ARRAYCROSS:
				enterOuterAlt(_localctx, 4);
				{
				setState(528);
				match(ARRAYCROSS);
				setState(529);
				match(LEFTP);
				setState(530);
				array();
				setState(532);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(531);
					match(COMMA);
					}
				}

				setState(534);
				array();
				setState(535);
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
		enterRule(_localctx, 54, RULE_trigFunction);
		try {
			setState(584);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SIN:
				enterOuterAlt(_localctx, 1);
				{
				setState(539);
				match(SIN);
				setState(540);
				match(LEFTP);
				setState(541);
				algexpr(0);
				setState(542);
				match(RIGHTP);
				}
				break;
			case COS:
				enterOuterAlt(_localctx, 2);
				{
				setState(544);
				match(COS);
				setState(545);
				match(LEFTP);
				setState(546);
				algexpr(0);
				setState(547);
				match(RIGHTP);
				}
				break;
			case TAN:
				enterOuterAlt(_localctx, 3);
				{
				setState(549);
				match(TAN);
				setState(550);
				match(LEFTP);
				setState(551);
				algexpr(0);
				setState(552);
				match(RIGHTP);
				}
				break;
			case ARCSIN:
				enterOuterAlt(_localctx, 4);
				{
				setState(554);
				match(ARCSIN);
				setState(555);
				match(LEFTP);
				setState(556);
				algexpr(0);
				setState(557);
				match(RIGHTP);
				}
				break;
			case ACOS:
				enterOuterAlt(_localctx, 5);
				{
				setState(559);
				match(ACOS);
				setState(560);
				match(LEFTP);
				setState(561);
				algexpr(0);
				setState(562);
				match(RIGHTP);
				}
				break;
			case ARCTAN:
				enterOuterAlt(_localctx, 6);
				{
				setState(564);
				match(ARCTAN);
				setState(565);
				match(LEFTP);
				setState(566);
				algexpr(0);
				setState(567);
				match(RIGHTP);
				}
				break;
			case SINH:
				enterOuterAlt(_localctx, 7);
				{
				setState(569);
				match(SINH);
				setState(570);
				match(LEFTP);
				setState(571);
				algexpr(0);
				setState(572);
				match(RIGHTP);
				}
				break;
			case COSH:
				enterOuterAlt(_localctx, 8);
				{
				setState(574);
				match(COSH);
				setState(575);
				match(LEFTP);
				setState(576);
				algexpr(0);
				setState(577);
				match(RIGHTP);
				}
				break;
			case TANH:
				enterOuterAlt(_localctx, 9);
				{
				setState(579);
				match(TANH);
				setState(580);
				match(LEFTP);
				setState(581);
				algexpr(0);
				setState(582);
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
		enterRule(_localctx, 56, RULE_function);
		try {
			setState(588);
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
				setState(586);
				mathFunction();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(587);
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
		enterRule(_localctx, 58, RULE_mathFunction);
		try {
			setState(593);
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
				setState(590);
				trigFunction();
				}
				break;
			case LN:
				enterOuterAlt(_localctx, 2);
				{
				setState(591);
				logFunction();
				}
				break;
			case RANDOM:
				enterOuterAlt(_localctx, 3);
				{
				setState(592);
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
		enterRule(_localctx, 60, RULE_probFunction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(595);
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
		enterRule(_localctx, 62, RULE_randomFunction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(597);
			match(RANDOM);
			setState(598);
			match(LEFTP);
			setState(599);
			match(REALNUMBER);
			setState(600);
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
		enterRule(_localctx, 64, RULE_logFunction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(602);
			match(LN);
			setState(603);
			match(LEFTP);
			setState(604);
			algexpr(0);
			setState(605);
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
		enterRule(_localctx, 66, RULE_usefunction);
		int _la;
		try {
			setState(625);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(607);
				match(ID);
				setState(608);
				match(LEFTP);
				setState(613); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(609);
					algexpr(0);
					setState(611);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==COMMA) {
						{
						setState(610);
						match(COMMA);
						}
					}

					}
					}
					setState(615); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 9)) & ~0x3f) == 0 && ((1L << (_la - 9)) & 126417448915206083L) != 0) );
				setState(617);
				match(RIGHTP);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(619);
				match(ID);
				setState(620);
				match(LEFTP);
				setState(621);
				idlist();
				setState(622);
				match(RIGHTP);
				setState(623);
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
		int _startState = 68;
		enterRecursionRule(_localctx, 68, RULE_algexpr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(643);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
			case 1:
				{
				_localctx = new NegationContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(628);
				match(SUBS);
				setState(629);
				algexpr(6);
				}
				break;
			case 2:
				{
				_localctx = new NumberContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(630);
				match(REALNUMBER);
				}
				break;
			case 3:
				{
				_localctx = new ENTContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(631);
				match(INTEGER);
				}
				break;
			case 4:
				{
				_localctx = new TrigfContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(632);
				function();
				}
				break;
			case 5:
				{
				_localctx = new ParenthesisContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(633);
				match(LEFTP);
				setState(634);
				algexpr(0);
				setState(635);
				match(RIGHTP);
				}
				break;
			case 6:
				{
				_localctx = new IdContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(637);
				match(ID);
				setState(641);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
				case 1:
					{
					setState(638);
					match(T__1);
					setState(639);
					match(INTEGER);
					setState(640);
					match(T__2);
					}
					break;
				}
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(659);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(657);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
					case 1:
						{
						_localctx = new PowerRootContext(new AlgexprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_algexpr);
						setState(645);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(646);
						match(POWER);
						setState(647);
						algexpr(11);
						}
						break;
					case 2:
						{
						_localctx = new MulDivContext(new AlgexprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_algexpr);
						setState(648);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(649);
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
						setState(650);
						algexpr(10);
						}
						break;
					case 3:
						{
						_localctx = new AddSubContext(new AlgexprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_algexpr);
						setState(651);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(652);
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
						setState(653);
						algexpr(9);
						}
						break;
					case 4:
						{
						_localctx = new MdContext(new AlgexprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_algexpr);
						setState(654);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(655);
						match(MOD);
						setState(656);
						algexpr(8);
						}
						break;
					}
					} 
				}
				setState(661);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
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
		case 4:
			return idvarlist_sempred((IdvarlistContext)_localctx, predIndex);
		case 15:
			return bexpression_sempred((BexpressionContext)_localctx, predIndex);
		case 16:
			return bterm_sempred((BtermContext)_localctx, predIndex);
		case 34:
			return algexpr_sempred((AlgexprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean idvarlist_sempred(IdvarlistContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean bexpression_sempred(BexpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean bterm_sempred(BtermContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean algexpr_sempred(AlgexprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 10);
		case 4:
			return precpred(_ctx, 9);
		case 5:
			return precpred(_ctx, 8);
		case 6:
			return precpred(_ctx, 7);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001B\u0297\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0001"+
		"\u0000\u0004\u0000H\b\u0000\u000b\u0000\f\u0000I\u0001\u0001\u0001\u0001"+
		"\u0003\u0001N\b\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001"+
		"S\b\u0001\u0001\u0001\u0001\u0001\u0003\u0001W\b\u0001\u0001\u0001\u0001"+
		"\u0001\u0003\u0001[\b\u0001\u0001\u0001\u0001\u0001\u0003\u0001_\b\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0003\u0001h\b\u0001\u0001\u0001\u0001\u0001\u0003\u0001"+
		"l\b\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001q\b\u0001\u0001"+
		"\u0001\u0001\u0001\u0003\u0001u\b\u0001\u0001\u0001\u0001\u0001\u0003"+
		"\u0001y\b\u0001\u0001\u0001\u0003\u0001|\b\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0005\u0002\u0081\b\u0002\n\u0002\f\u0002\u0084\t\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003\u008a\b\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0003\u0004\u008f\b\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0005\u0004\u0094\b\u0004\n\u0004\f\u0004\u0097\t\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0003\u0005\u00a0\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u00a8\b\u0006\u0001\u0006"+
		"\u0001\u0006\u0003\u0006\u00ac\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0003\u0007\u00bf\b\u0007\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u00ca\b\b\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0003\t\u00d0\b\t\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u00da\b"+
		"\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u00de\b\u000b\u0001\u000b\u0003"+
		"\u000b\u00e1\b\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0003\f\u00eb\b\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u00f9\b\f\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u0102\b\r\u0001"+
		"\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0005\u000f"+
		"\u0110\b\u000f\n\u000f\f\u000f\u0113\t\u000f\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0005\u0010\u011b\b\u0010\n"+
		"\u0010\f\u0010\u011e\t\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u012e"+
		"\b\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u0139\b\u0012\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0004\u0013\u0161\b\u0013\u000b\u0013\f\u0013\u0162"+
		"\u0001\u0013\u0001\u0013\u0003\u0013\u0167\b\u0013\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0003\u0014\u016d\b\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0003\u0014"+
		"\u0176\b\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0003\u0014\u017f\b\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u0187\b\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u0193\b\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0003\u0014\u019c\b\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0004\u0014\u01a7\b\u0014\u000b\u0014\f\u0014\u01a8\u0001\u0014\u0003"+
		"\u0014\u01ac\b\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u01b1"+
		"\b\u0014\u0001\u0015\u0001\u0015\u0003\u0015\u01b5\b\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0003\u0015\u01ba\b\u0015\u0005\u0015\u01bc\b"+
		"\u0015\n\u0015\f\u0015\u01bf\t\u0015\u0001\u0015\u0001\u0015\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0003\u0016\u01c6\b\u0016\u0004\u0016\u01c8\b"+
		"\u0016\u000b\u0016\f\u0016\u01c9\u0001\u0016\u0001\u0016\u0001\u0016\u0003"+
		"\u0016\u01cf\b\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0003\u0017\u01d4"+
		"\b\u0017\u0004\u0017\u01d6\b\u0017\u000b\u0017\f\u0017\u01d7\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0003\u0017\u01de\b\u0017\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0003\u0018\u01ef\b\u0018\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0003\u0019\u01f4\b\u0019\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0003\u001a\u01fa\b\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0003\u001a\u0203\b\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0003\u001a\u020c\b\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0003\u001a\u0215\b\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0003\u001a\u021a\b\u001a\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0003\u001b\u0249\b\u001b\u0001\u001c\u0001\u001c"+
		"\u0003\u001c\u024d\b\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0003\u001d"+
		"\u0252\b\u001d\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001 \u0001 \u0001 \u0001!\u0001"+
		"!\u0001!\u0001!\u0003!\u0264\b!\u0004!\u0266\b!\u000b!\f!\u0267\u0001"+
		"!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0003!\u0272\b!\u0001"+
		"\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001"+
		"\"\u0001\"\u0001\"\u0001\"\u0001\"\u0003\"\u0282\b\"\u0003\"\u0284\b\""+
		"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001"+
		"\"\u0001\"\u0001\"\u0001\"\u0005\"\u0292\b\"\n\"\f\"\u0295\t\"\u0001\""+
		"\u0000\u0004\b\u001e D#\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012"+
		"\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BD\u0000\u0003\u0001"+
		"\u0000#(\u0002\u00005577\u0002\u00004466\u02fd\u0000G\u0001\u0000\u0000"+
		"\u0000\u0002{\u0001\u0000\u0000\u0000\u0004}\u0001\u0000\u0000\u0000\u0006"+
		"\u0089\u0001\u0000\u0000\u0000\b\u008e\u0001\u0000\u0000\u0000\n\u009f"+
		"\u0001\u0000\u0000\u0000\f\u00a1\u0001\u0000\u0000\u0000\u000e\u00be\u0001"+
		"\u0000\u0000\u0000\u0010\u00c9\u0001\u0000\u0000\u0000\u0012\u00cf\u0001"+
		"\u0000\u0000\u0000\u0014\u00d1\u0001\u0000\u0000\u0000\u0016\u00d5\u0001"+
		"\u0000\u0000\u0000\u0018\u00f8\u0001\u0000\u0000\u0000\u001a\u00fa\u0001"+
		"\u0000\u0000\u0000\u001c\u0105\u0001\u0000\u0000\u0000\u001e\u0109\u0001"+
		"\u0000\u0000\u0000 \u0114\u0001\u0000\u0000\u0000\"\u012d\u0001\u0000"+
		"\u0000\u0000$\u0138\u0001\u0000\u0000\u0000&\u0166\u0001\u0000\u0000\u0000"+
		"(\u01b0\u0001\u0000\u0000\u0000*\u01b2\u0001\u0000\u0000\u0000,\u01ce"+
		"\u0001\u0000\u0000\u0000.\u01dd\u0001\u0000\u0000\u00000\u01ee\u0001\u0000"+
		"\u0000\u00002\u01f3\u0001\u0000\u0000\u00004\u0219\u0001\u0000\u0000\u0000"+
		"6\u0248\u0001\u0000\u0000\u00008\u024c\u0001\u0000\u0000\u0000:\u0251"+
		"\u0001\u0000\u0000\u0000<\u0253\u0001\u0000\u0000\u0000>\u0255\u0001\u0000"+
		"\u0000\u0000@\u025a\u0001\u0000\u0000\u0000B\u0271\u0001\u0000\u0000\u0000"+
		"D\u0283\u0001\u0000\u0000\u0000FH\u0003\u0002\u0001\u0000GF\u0001\u0000"+
		"\u0000\u0000HI\u0001\u0000\u0000\u0000IG\u0001\u0000\u0000\u0000IJ\u0001"+
		"\u0000\u0000\u0000J\u0001\u0001\u0000\u0000\u0000KM\u0003>\u001f\u0000"+
		"LN\u0005B\u0000\u0000ML\u0001\u0000\u0000\u0000MN\u0001\u0000\u0000\u0000"+
		"N|\u0001\u0000\u0000\u0000O|\u0003\f\u0006\u0000PR\u0003B!\u0000QS\u0005"+
		"B\u0000\u0000RQ\u0001\u0000\u0000\u0000RS\u0001\u0000\u0000\u0000S|\u0001"+
		"\u0000\u0000\u0000TV\u00034\u001a\u0000UW\u0005B\u0000\u0000VU\u0001\u0000"+
		"\u0000\u0000VW\u0001\u0000\u0000\u0000W|\u0001\u0000\u0000\u0000XZ\u0003"+
		"D\"\u0000Y[\u0005B\u0000\u0000ZY\u0001\u0000\u0000\u0000Z[\u0001\u0000"+
		"\u0000\u0000[|\u0001\u0000\u0000\u0000\\^\u00030\u0018\u0000]_\u0005B"+
		"\u0000\u0000^]\u0001\u0000\u0000\u0000^_\u0001\u0000\u0000\u0000_|\u0001"+
		"\u0000\u0000\u0000`|\u0003\u001e\u000f\u0000a|\u0003\u0014\n\u0000b|\u0003"+
		"\u0016\u000b\u0000c|\u0003\u0018\f\u0000d|\u0003\u001c\u000e\u0000eg\u0003"+
		"&\u0013\u0000fh\u0005B\u0000\u0000gf\u0001\u0000\u0000\u0000gh\u0001\u0000"+
		"\u0000\u0000h|\u0001\u0000\u0000\u0000ik\u0003(\u0014\u0000jl\u0005B\u0000"+
		"\u0000kj\u0001\u0000\u0000\u0000kl\u0001\u0000\u0000\u0000l|\u0001\u0000"+
		"\u0000\u0000m|\u0003$\u0012\u0000np\u0003\u001a\r\u0000oq\u0005B\u0000"+
		"\u0000po\u0001\u0000\u0000\u0000pq\u0001\u0000\u0000\u0000q|\u0001\u0000"+
		"\u0000\u0000rt\u0003\u0012\t\u0000su\u0005B\u0000\u0000ts\u0001\u0000"+
		"\u0000\u0000tu\u0001\u0000\u0000\u0000u|\u0001\u0000\u0000\u0000vx\u0003"+
		"6\u001b\u0000wy\u0005B\u0000\u0000xw\u0001\u0000\u0000\u0000xy\u0001\u0000"+
		"\u0000\u0000y|\u0001\u0000\u0000\u0000z|\u0005B\u0000\u0000{K\u0001\u0000"+
		"\u0000\u0000{O\u0001\u0000\u0000\u0000{P\u0001\u0000\u0000\u0000{T\u0001"+
		"\u0000\u0000\u0000{X\u0001\u0000\u0000\u0000{\\\u0001\u0000\u0000\u0000"+
		"{`\u0001\u0000\u0000\u0000{a\u0001\u0000\u0000\u0000{b\u0001\u0000\u0000"+
		"\u0000{c\u0001\u0000\u0000\u0000{d\u0001\u0000\u0000\u0000{e\u0001\u0000"+
		"\u0000\u0000{i\u0001\u0000\u0000\u0000{m\u0001\u0000\u0000\u0000{n\u0001"+
		"\u0000\u0000\u0000{r\u0001\u0000\u0000\u0000{v\u0001\u0000\u0000\u0000"+
		"{z\u0001\u0000\u0000\u0000|\u0003\u0001\u0000\u0000\u0000}\u0082\u0005"+
		"?\u0000\u0000~\u007f\u0005;\u0000\u0000\u007f\u0081\u0005?\u0000\u0000"+
		"\u0080~\u0001\u0000\u0000\u0000\u0081\u0084\u0001\u0000\u0000\u0000\u0082"+
		"\u0080\u0001\u0000\u0000\u0000\u0082\u0083\u0001\u0000\u0000\u0000\u0083"+
		"\u0005\u0001\u0000\u0000\u0000\u0084\u0082\u0001\u0000\u0000\u0000\u0085"+
		"\u0086\u0005?\u0000\u0000\u0086\u0087\u0005;\u0000\u0000\u0087\u008a\u0003"+
		"\u0006\u0003\u0000\u0088\u008a\u0005?\u0000\u0000\u0089\u0085\u0001\u0000"+
		"\u0000\u0000\u0089\u0088\u0001\u0000\u0000\u0000\u008a\u0007\u0001\u0000"+
		"\u0000\u0000\u008b\u008c\u0006\u0004\uffff\uffff\u0000\u008c\u008f\u0003"+
		"0\u0018\u0000\u008d\u008f\u0005?\u0000\u0000\u008e\u008b\u0001\u0000\u0000"+
		"\u0000\u008e\u008d\u0001\u0000\u0000\u0000\u008f\u0095\u0001\u0000\u0000"+
		"\u0000\u0090\u0091\n\u0003\u0000\u0000\u0091\u0092\u0005;\u0000\u0000"+
		"\u0092\u0094\u0003\b\u0004\u0004\u0093\u0090\u0001\u0000\u0000\u0000\u0094"+
		"\u0097\u0001\u0000\u0000\u0000\u0095\u0093\u0001\u0000\u0000\u0000\u0095"+
		"\u0096\u0001\u0000\u0000\u0000\u0096\t\u0001\u0000\u0000\u0000\u0097\u0095"+
		"\u0001\u0000\u0000\u0000\u0098\u00a0\u0005\u001d\u0000\u0000\u0099\u00a0"+
		"\u0005\u001e\u0000\u0000\u009a\u00a0\u0005\u001f\u0000\u0000\u009b\u00a0"+
		"\u0005!\u0000\u0000\u009c\u00a0\u0005 \u0000\u0000\u009d\u00a0\u0005\u001c"+
		"\u0000\u0000\u009e\u00a0\u0005\"\u0000\u0000\u009f\u0098\u0001\u0000\u0000"+
		"\u0000\u009f\u0099\u0001\u0000\u0000\u0000\u009f\u009a\u0001\u0000\u0000"+
		"\u0000\u009f\u009b\u0001\u0000\u0000\u0000\u009f\u009c\u0001\u0000\u0000"+
		"\u0000\u009f\u009d\u0001\u0000\u0000\u0000\u009f\u009e\u0001\u0000\u0000"+
		"\u0000\u00a0\u000b\u0001\u0000\u0000\u0000\u00a1\u00a2\u00051\u0000\u0000"+
		"\u00a2\u00a7\u0005?\u0000\u0000\u00a3\u00a4\u00059\u0000\u0000\u00a4\u00a5"+
		"\u0003\u0006\u0003\u0000\u00a5\u00a6\u0005:\u0000\u0000\u00a6\u00a8\u0001"+
		"\u0000\u0000\u0000\u00a7\u00a3\u0001\u0000\u0000\u0000\u00a7\u00a8\u0001"+
		"\u0000\u0000\u0000\u00a8\u00a9\u0001\u0000\u0000\u0000\u00a9\u00ab\u0005"+
		"=\u0000\u0000\u00aa\u00ac\u0005B\u0000\u0000\u00ab\u00aa\u0001\u0000\u0000"+
		"\u0000\u00ab\u00ac\u0001\u0000\u0000\u0000\u00ac\u00ad\u0001\u0000\u0000"+
		"\u0000\u00ad\u00ae\u0003\u000e\u0007\u0000\u00ae\u00af\u0005<\u0000\u0000"+
		"\u00af\r\u0001\u0000\u0000\u0000\u00b0\u00bf\u0003*\u0015\u0000\u00b1"+
		"\u00bf\u0003$\u0012\u0000\u00b2\u00bf\u0003\u0010\b\u0000\u00b3\u00bf"+
		"\u0003&\u0013\u0000\u00b4\u00bf\u0003(\u0014\u0000\u00b5\u00bf\u0003\u0014"+
		"\n\u0000\u00b6\u00bf\u0003\u0016\u000b\u0000\u00b7\u00bf\u0003\u0018\f"+
		"\u0000\u00b8\u00bf\u0003\u001a\r\u0000\u00b9\u00bf\u0003B!\u0000\u00ba"+
		"\u00bf\u00030\u0018\u0000\u00bb\u00bf\u0003\u0012\t\u0000\u00bc\u00bf"+
		"\u0003D\"\u0000\u00bd\u00bf\u00034\u001a\u0000\u00be\u00b0\u0001\u0000"+
		"\u0000\u0000\u00be\u00b1\u0001\u0000\u0000\u0000\u00be\u00b2\u0001\u0000"+
		"\u0000\u0000\u00be\u00b3\u0001\u0000\u0000\u0000\u00be\u00b4\u0001\u0000"+
		"\u0000\u0000\u00be\u00b5\u0001\u0000\u0000\u0000\u00be\u00b6\u0001\u0000"+
		"\u0000\u0000\u00be\u00b7\u0001\u0000\u0000\u0000\u00be\u00b8\u0001\u0000"+
		"\u0000\u0000\u00be\u00b9\u0001\u0000\u0000\u0000\u00be\u00ba\u0001\u0000"+
		"\u0000\u0000\u00be\u00bb\u0001\u0000\u0000\u0000\u00be\u00bc\u0001\u0000"+
		"\u0000\u0000\u00be\u00bd\u0001\u0000\u0000\u0000\u00bf\u000f\u0001\u0000"+
		"\u0000\u0000\u00c0\u00c1\u0005\b\u0000\u0000\u00c1\u00c2\u00059\u0000"+
		"\u0000\u00c2\u00c3\u0003\u0006\u0003\u0000\u00c3\u00c4\u0005:\u0000\u0000"+
		"\u00c4\u00ca\u0001\u0000\u0000\u0000\u00c5\u00c6\u0005\b\u0000\u0000\u00c6"+
		"\u00c7\u00059\u0000\u0000\u00c7\u00c8\u0005>\u0000\u0000\u00c8\u00ca\u0005"+
		":\u0000\u0000\u00c9\u00c0\u0001\u0000\u0000\u0000\u00c9\u00c5\u0001\u0000"+
		"\u0000\u0000\u00ca\u0011\u0001\u0000\u0000\u0000\u00cb\u00cc\u0005\u001a"+
		"\u0000\u0000\u00cc\u00d0\u0003B!\u0000\u00cd\u00ce\u0005\u001a\u0000\u0000"+
		"\u00ce\u00d0\u0003D\"\u0000\u00cf\u00cb\u0001\u0000\u0000\u0000\u00cf"+
		"\u00cd\u0001\u0000\u0000\u0000\u00d0\u0013\u0001\u0000\u0000\u0000\u00d1"+
		"\u00d2\u00050\u0000\u0000\u00d2\u00d3\u0003\u001e\u000f\u0000\u00d3\u00d4"+
		"\u0003\u000e\u0007\u0000\u00d4\u0015\u0001\u0000\u0000\u0000\u00d5\u00d6"+
		"\u0005\u0018\u0000\u0000\u00d6\u00d7\u0003\u001e\u000f\u0000\u00d7\u00d9"+
		"\u0003\u000e\u0007\u0000\u00d8\u00da\u0005B\u0000\u0000\u00d9\u00d8\u0001"+
		"\u0000\u0000\u0000\u00d9\u00da\u0001\u0000\u0000\u0000\u00da\u00e0\u0001"+
		"\u0000\u0000\u0000\u00db\u00dd\u0005*\u0000\u0000\u00dc\u00de\u0005B\u0000"+
		"\u0000\u00dd\u00dc\u0001\u0000\u0000\u0000\u00dd\u00de\u0001\u0000\u0000"+
		"\u0000\u00de\u00df\u0001\u0000\u0000\u0000\u00df\u00e1\u0003\u000e\u0007"+
		"\u0000\u00e0\u00db\u0001\u0000\u0000\u0000\u00e0\u00e1\u0001\u0000\u0000"+
		"\u0000\u00e1\u0017\u0001\u0000\u0000\u0000\u00e2\u00e3\u0005)\u0000\u0000"+
		"\u00e3\u00e4\u00030\u0018\u0000\u00e4\u00e5\u0005\u0001\u0000\u0000\u00e5"+
		"\u00e6\u0003\u001e\u000f\u0000\u00e6\u00e7\u0005\u0001\u0000\u0000\u00e7"+
		"\u00e8\u00030\u0018\u0000\u00e8\u00ea\u0005\u0001\u0000\u0000\u00e9\u00eb"+
		"\u0005B\u0000\u0000\u00ea\u00e9\u0001\u0000\u0000\u0000\u00ea\u00eb\u0001"+
		"\u0000\u0000\u0000\u00eb\u00ec\u0001\u0000\u0000\u0000\u00ec\u00ed\u0003"+
		"\u000e\u0007\u0000\u00ed\u00f9\u0001\u0000\u0000\u0000\u00ee\u00ef\u0005"+
		")\u0000\u0000\u00ef\u00f0\u00059\u0000\u0000\u00f0\u00f1\u00030\u0018"+
		"\u0000\u00f1\u00f2\u0005\u0001\u0000\u0000\u00f2\u00f3\u0003\u001e\u000f"+
		"\u0000\u00f3\u00f4\u0005\u0001\u0000\u0000\u00f4\u00f5\u00030\u0018\u0000"+
		"\u00f5\u00f6\u0005:\u0000\u0000\u00f6\u00f7\u0003\u000e\u0007\u0000\u00f7"+
		"\u00f9\u0001\u0000\u0000\u0000\u00f8\u00e2\u0001\u0000\u0000\u0000\u00f8"+
		"\u00ee\u0001\u0000\u0000\u0000\u00f9\u0019\u0001\u0000\u0000\u0000\u00fa"+
		"\u00fb\u0005\u0019\u0000\u0000\u00fb\u00fc\u0005?\u0000\u0000\u00fc\u00fd"+
		"\u00059\u0000\u0000\u00fd\u00fe\u0003\u0004\u0002\u0000\u00fe\u00ff\u0005"+
		":\u0000\u0000\u00ff\u0101\u0005=\u0000\u0000\u0100\u0102\u0005B\u0000"+
		"\u0000\u0101\u0100\u0001\u0000\u0000\u0000\u0101\u0102\u0001\u0000\u0000"+
		"\u0000\u0102\u0103\u0001\u0000\u0000\u0000\u0103\u0104\u0003\u000e\u0007"+
		"\u0000\u0104\u001b\u0001\u0000\u0000\u0000\u0105\u0106\u0003D\"\u0000"+
		"\u0106\u0107\u0007\u0000\u0000\u0000\u0107\u0108\u0003D\"\u0000\u0108"+
		"\u001d\u0001\u0000\u0000\u0000\u0109\u010a\u0006\u000f\uffff\uffff\u0000"+
		"\u010a\u010b\u0003 \u0010\u0000\u010b\u0111\u0001\u0000\u0000\u0000\u010c"+
		"\u010d\n\u0002\u0000\u0000\u010d\u010e\u0005/\u0000\u0000\u010e\u0110"+
		"\u0003 \u0010\u0000\u010f\u010c\u0001\u0000\u0000\u0000\u0110\u0113\u0001"+
		"\u0000\u0000\u0000\u0111\u010f\u0001\u0000\u0000\u0000\u0111\u0112\u0001"+
		"\u0000\u0000\u0000\u0112\u001f\u0001\u0000\u0000\u0000\u0113\u0111\u0001"+
		"\u0000\u0000\u0000\u0114\u0115\u0006\u0010\uffff\uffff\u0000\u0115\u0116"+
		"\u0003\"\u0011\u0000\u0116\u011c\u0001\u0000\u0000\u0000\u0117\u0118\n"+
		"\u0002\u0000\u0000\u0118\u0119\u0005.\u0000\u0000\u0119\u011b\u0003\""+
		"\u0011\u0000\u011a\u0117\u0001\u0000\u0000\u0000\u011b\u011e\u0001\u0000"+
		"\u0000\u0000\u011c\u011a\u0001\u0000\u0000\u0000\u011c\u011d\u0001\u0000"+
		"\u0000\u0000\u011d!\u0001\u0000\u0000\u0000\u011e\u011c\u0001\u0000\u0000"+
		"\u0000\u011f\u0120\u0005+\u0000\u0000\u0120\u012e\u0003\"\u0011\u0000"+
		"\u0121\u0122\u00059\u0000\u0000\u0122\u0123\u0003\u001e\u000f\u0000\u0123"+
		"\u0124\u0005:\u0000\u0000\u0124\u012e\u0001\u0000\u0000\u0000\u0125\u012e"+
		"\u0005?\u0000\u0000\u0126\u012e\u0005,\u0000\u0000\u0127\u012e\u0005-"+
		"\u0000\u0000\u0128\u012e\u0003\u001c\u000e\u0000\u0129\u012a\u00059\u0000"+
		"\u0000\u012a\u012b\u0003\u001c\u000e\u0000\u012b\u012c\u0005:\u0000\u0000"+
		"\u012c\u012e\u0001\u0000\u0000\u0000\u012d\u011f\u0001\u0000\u0000\u0000"+
		"\u012d\u0121\u0001\u0000\u0000\u0000\u012d\u0125\u0001\u0000\u0000\u0000"+
		"\u012d\u0126\u0001\u0000\u0000\u0000\u012d\u0127\u0001\u0000\u0000\u0000"+
		"\u012d\u0128\u0001\u0000\u0000\u0000\u012d\u0129\u0001\u0000\u0000\u0000"+
		"\u012e#\u0001\u0000\u0000\u0000\u012f\u0130\u00052\u0000\u0000\u0130\u0131"+
		"\u00059\u0000\u0000\u0131\u0132\u0003\u0006\u0003\u0000\u0132\u0133\u0005"+
		":\u0000\u0000\u0133\u0139\u0001\u0000\u0000\u0000\u0134\u0135\u00052\u0000"+
		"\u0000\u0135\u0136\u00059\u0000\u0000\u0136\u0137\u0005>\u0000\u0000\u0137"+
		"\u0139\u0005:\u0000\u0000\u0138\u012f\u0001\u0000\u0000\u0000\u0138\u0134"+
		"\u0001\u0000\u0000\u0000\u0139%\u0001\u0000\u0000\u0000\u013a\u013b\u0005"+
		"3\u0000\u0000\u013b\u013c\u00059\u0000\u0000\u013c\u013d\u0003\u0006\u0003"+
		"\u0000\u013d\u013e\u0005:\u0000\u0000\u013e\u0167\u0001\u0000\u0000\u0000"+
		"\u013f\u0140\u00053\u0000\u0000\u0140\u0141\u00059\u0000\u0000\u0141\u0142"+
		"\u0003D\"\u0000\u0142\u0143\u0005:\u0000\u0000\u0143\u0167\u0001\u0000"+
		"\u0000\u0000\u0144\u0145\u00053\u0000\u0000\u0145\u0146\u00059\u0000\u0000"+
		"\u0146\u0147\u0005>\u0000\u0000\u0147\u0167\u0005:\u0000\u0000\u0148\u0149"+
		"\u00053\u0000\u0000\u0149\u014a\u00059\u0000\u0000\u014a\u014b\u0003."+
		"\u0017\u0000\u014b\u014c\u0005\u0002\u0000\u0000\u014c\u014d\u0005@\u0000"+
		"\u0000\u014d\u014e\u0005\u0003\u0000\u0000\u014e\u014f\u0005:\u0000\u0000"+
		"\u014f\u0167\u0001\u0000\u0000\u0000\u0150\u0151\u00053\u0000\u0000\u0151"+
		"\u0152\u00059\u0000\u0000\u0152\u0153\u0003B!\u0000\u0153\u0154\u0005"+
		":\u0000\u0000\u0154\u0167\u0001\u0000\u0000\u0000\u0155\u0156\u00053\u0000"+
		"\u0000\u0156\u0157\u00059\u0000\u0000\u0157\u0158\u00034\u001a\u0000\u0158"+
		"\u0159\u0005:\u0000\u0000\u0159\u0167\u0001\u0000\u0000\u0000\u015a\u015b"+
		"\u00053\u0000\u0000\u015b\u015c\u00059\u0000\u0000\u015c\u0160\u0003,"+
		"\u0016\u0000\u015d\u015e\u0005\u0002\u0000\u0000\u015e\u015f\u0005@\u0000"+
		"\u0000\u015f\u0161\u0005\u0003\u0000\u0000\u0160\u015d\u0001\u0000\u0000"+
		"\u0000\u0161\u0162\u0001\u0000\u0000\u0000\u0162\u0160\u0001\u0000\u0000"+
		"\u0000\u0162\u0163\u0001\u0000\u0000\u0000\u0163\u0164\u0001\u0000\u0000"+
		"\u0000\u0164\u0165\u0005:\u0000\u0000\u0165\u0167\u0001\u0000\u0000\u0000"+
		"\u0166\u013a\u0001\u0000\u0000\u0000\u0166\u013f\u0001\u0000\u0000\u0000"+
		"\u0166\u0144\u0001\u0000\u0000\u0000\u0166\u0148\u0001\u0000\u0000\u0000"+
		"\u0166\u0150\u0001\u0000\u0000\u0000\u0166\u0155\u0001\u0000\u0000\u0000"+
		"\u0166\u015a\u0001\u0000\u0000\u0000\u0167\'\u0001\u0000\u0000\u0000\u0168"+
		"\u0169\u0005\u0007\u0000\u0000\u0169\u016a\u00059\u0000\u0000\u016a\u016c"+
		"\u0003\u0006\u0003\u0000\u016b\u016d\u0005;\u0000\u0000\u016c\u016b\u0001"+
		"\u0000\u0000\u0000\u016c\u016d\u0001\u0000\u0000\u0000\u016d\u016e\u0001"+
		"\u0000\u0000\u0000\u016e\u016f\u0005>\u0000\u0000\u016f\u0170\u0005:\u0000"+
		"\u0000\u0170\u01b1\u0001\u0000\u0000\u0000\u0171\u0172\u0005\u0007\u0000"+
		"\u0000\u0172\u0173\u00059\u0000\u0000\u0173\u0175\u0003D\"\u0000\u0174"+
		"\u0176\u0005;\u0000\u0000\u0175\u0174\u0001\u0000\u0000\u0000\u0175\u0176"+
		"\u0001\u0000\u0000\u0000\u0176\u0177\u0001\u0000\u0000\u0000\u0177\u0178"+
		"\u0005>\u0000\u0000\u0178\u0179\u0005:\u0000\u0000\u0179\u01b1\u0001\u0000"+
		"\u0000\u0000\u017a\u017b\u0005\u0007\u0000\u0000\u017b\u017c\u00059\u0000"+
		"\u0000\u017c\u017e\u0005>\u0000\u0000\u017d\u017f\u0005;\u0000\u0000\u017e"+
		"\u017d\u0001\u0000\u0000\u0000\u017e\u017f\u0001\u0000\u0000\u0000\u017f"+
		"\u0180\u0001\u0000\u0000\u0000\u0180\u0181\u0005>\u0000\u0000\u0181\u01b1"+
		"\u0005:\u0000\u0000\u0182\u0183\u0005\u0007\u0000\u0000\u0183\u0184\u0005"+
		"9\u0000\u0000\u0184\u0186\u0003.\u0017\u0000\u0185\u0187\u0005;\u0000"+
		"\u0000\u0186\u0185\u0001\u0000\u0000\u0000\u0186\u0187\u0001\u0000\u0000"+
		"\u0000\u0187\u0188\u0001\u0000\u0000\u0000\u0188\u0189\u0005>\u0000\u0000"+
		"\u0189\u018a\u0005\u0002\u0000\u0000\u018a\u018b\u0005@\u0000\u0000\u018b"+
		"\u018c\u0005\u0003\u0000\u0000\u018c\u018d\u0005:\u0000\u0000\u018d\u01b1"+
		"\u0001\u0000\u0000\u0000\u018e\u018f\u0005\u0007\u0000\u0000\u018f\u0190"+
		"\u00059\u0000\u0000\u0190\u0192\u0003B!\u0000\u0191\u0193\u0005;\u0000"+
		"\u0000\u0192\u0191\u0001\u0000\u0000\u0000\u0192\u0193\u0001\u0000\u0000"+
		"\u0000\u0193\u0194\u0001\u0000\u0000\u0000\u0194\u0195\u0005>\u0000\u0000"+
		"\u0195\u0196\u0005:\u0000\u0000\u0196\u01b1\u0001\u0000\u0000\u0000\u0197"+
		"\u0198\u0005\u0007\u0000\u0000\u0198\u0199\u00059\u0000\u0000\u0199\u019b"+
		"\u00034\u001a\u0000\u019a\u019c\u0005;\u0000\u0000\u019b\u019a\u0001\u0000"+
		"\u0000\u0000\u019b\u019c\u0001\u0000\u0000\u0000\u019c\u019d\u0001\u0000"+
		"\u0000\u0000\u019d\u019e\u0005>\u0000\u0000\u019e\u019f\u0005:\u0000\u0000"+
		"\u019f\u01b1\u0001\u0000\u0000\u0000\u01a0\u01a1\u0005\u0007\u0000\u0000"+
		"\u01a1\u01a2\u00059\u0000\u0000\u01a2\u01a6\u0003,\u0016\u0000\u01a3\u01a4"+
		"\u0005\u0002\u0000\u0000\u01a4\u01a5\u0005@\u0000\u0000\u01a5\u01a7\u0005"+
		"\u0003\u0000\u0000\u01a6\u01a3\u0001\u0000\u0000\u0000\u01a7\u01a8\u0001"+
		"\u0000\u0000\u0000\u01a8\u01a6\u0001\u0000\u0000\u0000\u01a8\u01a9\u0001"+
		"\u0000\u0000\u0000\u01a9\u01ab\u0001\u0000\u0000\u0000\u01aa\u01ac\u0005"+
		";\u0000\u0000\u01ab\u01aa\u0001\u0000\u0000\u0000\u01ab\u01ac\u0001\u0000"+
		"\u0000\u0000\u01ac\u01ad\u0001\u0000\u0000\u0000\u01ad\u01ae\u0005>\u0000"+
		"\u0000\u01ae\u01af\u0005:\u0000\u0000\u01af\u01b1\u0001\u0000\u0000\u0000"+
		"\u01b0\u0168\u0001\u0000\u0000\u0000\u01b0\u0171\u0001\u0000\u0000\u0000"+
		"\u01b0\u017a\u0001\u0000\u0000\u0000\u01b0\u0182\u0001\u0000\u0000\u0000"+
		"\u01b0\u018e\u0001\u0000\u0000\u0000\u01b0\u0197\u0001\u0000\u0000\u0000"+
		"\u01b0\u01a0\u0001\u0000\u0000\u0000\u01b1)\u0001\u0000\u0000\u0000\u01b2"+
		"\u01b4\u0005\u0004\u0000\u0000\u01b3\u01b5\u0005B\u0000\u0000\u01b4\u01b3"+
		"\u0001\u0000\u0000\u0000\u01b4\u01b5\u0001\u0000\u0000\u0000\u01b5\u01bd"+
		"\u0001\u0000\u0000\u0000\u01b6\u01b7\u0003\u000e\u0007\u0000\u01b7\u01b9"+
		"\u0005\u0001\u0000\u0000\u01b8\u01ba\u0005B\u0000\u0000\u01b9\u01b8\u0001"+
		"\u0000\u0000\u0000\u01b9\u01ba\u0001\u0000\u0000\u0000\u01ba\u01bc\u0001"+
		"\u0000\u0000\u0000\u01bb\u01b6\u0001\u0000\u0000\u0000\u01bc\u01bf\u0001"+
		"\u0000\u0000\u0000\u01bd\u01bb\u0001\u0000\u0000\u0000\u01bd\u01be\u0001"+
		"\u0000\u0000\u0000\u01be\u01c0\u0001\u0000\u0000\u0000\u01bf\u01bd\u0001"+
		"\u0000\u0000\u0000\u01c0\u01c1\u0005\u0005\u0000\u0000\u01c1+\u0001\u0000"+
		"\u0000\u0000\u01c2\u01c7\u0005\u0002\u0000\u0000\u01c3\u01c5\u0003.\u0017"+
		"\u0000\u01c4\u01c6\u0005;\u0000\u0000\u01c5\u01c4\u0001\u0000\u0000\u0000"+
		"\u01c5\u01c6\u0001\u0000\u0000\u0000\u01c6\u01c8\u0001\u0000\u0000\u0000"+
		"\u01c7\u01c3\u0001\u0000\u0000\u0000\u01c8\u01c9\u0001\u0000\u0000\u0000"+
		"\u01c9\u01c7\u0001\u0000\u0000\u0000\u01c9\u01ca\u0001\u0000\u0000\u0000"+
		"\u01ca\u01cb\u0001\u0000\u0000\u0000\u01cb\u01cc\u0005\u0003\u0000\u0000"+
		"\u01cc\u01cf\u0001\u0000\u0000\u0000\u01cd\u01cf\u0005?\u0000\u0000\u01ce"+
		"\u01c2\u0001\u0000\u0000\u0000\u01ce\u01cd\u0001\u0000\u0000\u0000\u01cf"+
		"-\u0001\u0000\u0000\u0000\u01d0\u01d5\u0005\u0002\u0000\u0000\u01d1\u01d3"+
		"\u0003D\"\u0000\u01d2\u01d4\u0005;\u0000\u0000\u01d3\u01d2\u0001\u0000"+
		"\u0000\u0000\u01d3\u01d4\u0001\u0000\u0000\u0000\u01d4\u01d6\u0001\u0000"+
		"\u0000\u0000\u01d5\u01d1\u0001\u0000\u0000\u0000\u01d6\u01d7\u0001\u0000"+
		"\u0000\u0000\u01d7\u01d5\u0001\u0000\u0000\u0000\u01d7\u01d8\u0001\u0000"+
		"\u0000\u0000\u01d8\u01d9\u0001\u0000\u0000\u0000\u01d9\u01da\u0005\u0003"+
		"\u0000\u0000\u01da\u01de\u0001\u0000\u0000\u0000\u01db\u01de\u0005?\u0000"+
		"\u0000\u01dc\u01de\u00034\u001a\u0000\u01dd\u01d0\u0001\u0000\u0000\u0000"+
		"\u01dd\u01db\u0001\u0000\u0000\u0000\u01dd\u01dc\u0001\u0000\u0000\u0000"+
		"\u01de/\u0001\u0000\u0000\u0000\u01df\u01e0\u0005?\u0000\u0000\u01e0\u01e1"+
		"\u0005\u0006\u0000\u0000\u01e1\u01ef\u0003B!\u0000\u01e2\u01e3\u0005?"+
		"\u0000\u0000\u01e3\u01e4\u0005\u0006\u0000\u0000\u01e4\u01ef\u0003D\""+
		"\u0000\u01e5\u01e6\u0005?\u0000\u0000\u01e6\u01e7\u0005\u0006\u0000\u0000"+
		"\u01e7\u01ef\u0005>\u0000\u0000\u01e8\u01e9\u0005?\u0000\u0000\u01e9\u01ea"+
		"\u0005\u0006\u0000\u0000\u01ea\u01ef\u0003,\u0016\u0000\u01eb\u01ec\u0005"+
		"?\u0000\u0000\u01ec\u01ed\u0005\u0006\u0000\u0000\u01ed\u01ef\u0003.\u0017"+
		"\u0000\u01ee\u01df\u0001\u0000\u0000\u0000\u01ee\u01e2\u0001\u0000\u0000"+
		"\u0000\u01ee\u01e5\u0001\u0000\u0000\u0000\u01ee\u01e8\u0001\u0000\u0000"+
		"\u0000\u01ee\u01eb\u0001\u0000\u0000\u0000\u01ef1\u0001\u0000\u0000\u0000"+
		"\u01f0\u01f4\u0003D\"\u0000\u01f1\u01f4\u0003\u001e\u000f\u0000\u01f2"+
		"\u01f4\u0005>\u0000\u0000\u01f3\u01f0\u0001\u0000\u0000\u0000\u01f3\u01f1"+
		"\u0001\u0000\u0000\u0000\u01f3\u01f2\u0001\u0000\u0000\u0000\u01f43\u0001"+
		"\u0000\u0000\u0000\u01f5\u01f6\u0005\u000b\u0000\u0000\u01f6\u01f7\u0005"+
		"9\u0000\u0000\u01f7\u01f9\u0003.\u0017\u0000\u01f8\u01fa\u0005;\u0000"+
		"\u0000\u01f9\u01f8\u0001\u0000\u0000\u0000\u01f9\u01fa\u0001\u0000\u0000"+
		"\u0000\u01fa\u01fb\u0001\u0000\u0000\u0000\u01fb\u01fc\u0003.\u0017\u0000"+
		"\u01fc\u01fd\u0005:\u0000\u0000\u01fd\u021a\u0001\u0000\u0000\u0000\u01fe"+
		"\u01ff\u0005\f\u0000\u0000\u01ff\u0200\u00059\u0000\u0000\u0200\u0202"+
		"\u0003.\u0017\u0000\u0201\u0203\u0005;\u0000\u0000\u0202\u0201\u0001\u0000"+
		"\u0000\u0000\u0202\u0203\u0001\u0000\u0000\u0000\u0203\u0204\u0001\u0000"+
		"\u0000\u0000\u0204\u0205\u0003.\u0017\u0000\u0205\u0206\u0005:\u0000\u0000"+
		"\u0206\u021a\u0001\u0000\u0000\u0000\u0207\u0208\u0005\r\u0000\u0000\u0208"+
		"\u0209\u00059\u0000\u0000\u0209\u020b\u0003.\u0017\u0000\u020a\u020c\u0005"+
		";\u0000\u0000\u020b\u020a\u0001\u0000\u0000\u0000\u020b\u020c\u0001\u0000"+
		"\u0000\u0000\u020c\u020d\u0001\u0000\u0000\u0000\u020d\u020e\u0003.\u0017"+
		"\u0000\u020e\u020f\u0005:\u0000\u0000\u020f\u021a\u0001\u0000\u0000\u0000"+
		"\u0210\u0211\u0005\u000e\u0000\u0000\u0211\u0212\u00059\u0000\u0000\u0212"+
		"\u0214\u0003.\u0017\u0000\u0213\u0215\u0005;\u0000\u0000\u0214\u0213\u0001"+
		"\u0000\u0000\u0000\u0214\u0215\u0001\u0000\u0000\u0000\u0215\u0216\u0001"+
		"\u0000\u0000\u0000\u0216\u0217\u0003.\u0017\u0000\u0217\u0218\u0005:\u0000"+
		"\u0000\u0218\u021a\u0001\u0000\u0000\u0000\u0219\u01f5\u0001\u0000\u0000"+
		"\u0000\u0219\u01fe\u0001\u0000\u0000\u0000\u0219\u0207\u0001\u0000\u0000"+
		"\u0000\u0219\u0210\u0001\u0000\u0000\u0000\u021a5\u0001\u0000\u0000\u0000"+
		"\u021b\u021c\u0005\u000f\u0000\u0000\u021c\u021d\u00059\u0000\u0000\u021d"+
		"\u021e\u0003D\"\u0000\u021e\u021f\u0005:\u0000\u0000\u021f\u0249\u0001"+
		"\u0000\u0000\u0000\u0220\u0221\u0005\u0010\u0000\u0000\u0221\u0222\u0005"+
		"9\u0000\u0000\u0222\u0223\u0003D\"\u0000\u0223\u0224\u0005:\u0000\u0000"+
		"\u0224\u0249\u0001\u0000\u0000\u0000\u0225\u0226\u0005\u0011\u0000\u0000"+
		"\u0226\u0227\u00059\u0000\u0000\u0227\u0228\u0003D\"\u0000\u0228\u0229"+
		"\u0005:\u0000\u0000\u0229\u0249\u0001\u0000\u0000\u0000\u022a\u022b\u0005"+
		"\u0012\u0000\u0000\u022b\u022c\u00059\u0000\u0000\u022c\u022d\u0003D\""+
		"\u0000\u022d\u022e\u0005:\u0000\u0000\u022e\u0249\u0001\u0000\u0000\u0000"+
		"\u022f\u0230\u0005\u0013\u0000\u0000\u0230\u0231\u00059\u0000\u0000\u0231"+
		"\u0232\u0003D\"\u0000\u0232\u0233\u0005:\u0000\u0000\u0233\u0249\u0001"+
		"\u0000\u0000\u0000\u0234\u0235\u0005\u0014\u0000\u0000\u0235\u0236\u0005"+
		"9\u0000\u0000\u0236\u0237\u0003D\"\u0000\u0237\u0238\u0005:\u0000\u0000"+
		"\u0238\u0249\u0001\u0000\u0000\u0000\u0239\u023a\u0005\u0015\u0000\u0000"+
		"\u023a\u023b\u00059\u0000\u0000\u023b\u023c\u0003D\"\u0000\u023c\u023d"+
		"\u0005:\u0000\u0000\u023d\u0249\u0001\u0000\u0000\u0000\u023e\u023f\u0005"+
		"\u0016\u0000\u0000\u023f\u0240\u00059\u0000\u0000\u0240\u0241\u0003D\""+
		"\u0000\u0241\u0242\u0005:\u0000\u0000\u0242\u0249\u0001\u0000\u0000\u0000"+
		"\u0243\u0244\u0005\u0017\u0000\u0000\u0244\u0245\u00059\u0000\u0000\u0245"+
		"\u0246\u0003D\"\u0000\u0246\u0247\u0005:\u0000\u0000\u0247\u0249\u0001"+
		"\u0000\u0000\u0000\u0248\u021b\u0001\u0000\u0000\u0000\u0248\u0220\u0001"+
		"\u0000\u0000\u0000\u0248\u0225\u0001\u0000\u0000\u0000\u0248\u022a\u0001"+
		"\u0000\u0000\u0000\u0248\u022f\u0001\u0000\u0000\u0000\u0248\u0234\u0001"+
		"\u0000\u0000\u0000\u0248\u0239\u0001\u0000\u0000\u0000\u0248\u023e\u0001"+
		"\u0000\u0000\u0000\u0248\u0243\u0001\u0000\u0000\u0000\u02497\u0001\u0000"+
		"\u0000\u0000\u024a\u024d\u0003:\u001d\u0000\u024b\u024d\u0003B!\u0000"+
		"\u024c\u024a\u0001\u0000\u0000\u0000\u024c\u024b\u0001\u0000\u0000\u0000"+
		"\u024d9\u0001\u0000\u0000\u0000\u024e\u0252\u00036\u001b\u0000\u024f\u0252"+
		"\u0003@ \u0000\u0250\u0252\u0003<\u001e\u0000\u0251\u024e\u0001\u0000"+
		"\u0000\u0000\u0251\u024f\u0001\u0000\u0000\u0000\u0251\u0250\u0001\u0000"+
		"\u0000\u0000\u0252;\u0001\u0000\u0000\u0000\u0253\u0254\u0003>\u001f\u0000"+
		"\u0254=\u0001\u0000\u0000\u0000\u0255\u0256\u0005\t\u0000\u0000\u0256"+
		"\u0257\u00059\u0000\u0000\u0257\u0258\u0005A\u0000\u0000\u0258\u0259\u0005"+
		":\u0000\u0000\u0259?\u0001\u0000\u0000\u0000\u025a\u025b\u0005\n\u0000"+
		"\u0000\u025b\u025c\u00059\u0000\u0000\u025c\u025d\u0003D\"\u0000\u025d"+
		"\u025e\u0005:\u0000\u0000\u025eA\u0001\u0000\u0000\u0000\u025f\u0260\u0005"+
		"?\u0000\u0000\u0260\u0265\u00059\u0000\u0000\u0261\u0263\u0003D\"\u0000"+
		"\u0262\u0264\u0005;\u0000\u0000\u0263\u0262\u0001\u0000\u0000\u0000\u0263"+
		"\u0264\u0001\u0000\u0000\u0000\u0264\u0266\u0001\u0000\u0000\u0000\u0265"+
		"\u0261\u0001\u0000\u0000\u0000\u0266\u0267\u0001\u0000\u0000\u0000\u0267"+
		"\u0265\u0001\u0000\u0000\u0000\u0267\u0268\u0001\u0000\u0000\u0000\u0268"+
		"\u0269\u0001\u0000\u0000\u0000\u0269\u026a\u0005:\u0000\u0000\u026a\u0272"+
		"\u0001\u0000\u0000\u0000\u026b\u026c\u0005?\u0000\u0000\u026c\u026d\u0005"+
		"9\u0000\u0000\u026d\u026e\u0003\u0004\u0002\u0000\u026e\u026f\u0005:\u0000"+
		"\u0000\u026f\u0270\u0005\u0001\u0000\u0000\u0270\u0272\u0001\u0000\u0000"+
		"\u0000\u0271\u025f\u0001\u0000\u0000\u0000\u0271\u026b\u0001\u0000\u0000"+
		"\u0000\u0272C\u0001\u0000\u0000\u0000\u0273\u0274\u0006\"\uffff\uffff"+
		"\u0000\u0274\u0275\u00056\u0000\u0000\u0275\u0284\u0003D\"\u0006\u0276"+
		"\u0284\u0005A\u0000\u0000\u0277\u0284\u0005@\u0000\u0000\u0278\u0284\u0003"+
		"8\u001c\u0000\u0279\u027a\u00059\u0000\u0000\u027a\u027b\u0003D\"\u0000"+
		"\u027b\u027c\u0005:\u0000\u0000\u027c\u0284\u0001\u0000\u0000\u0000\u027d"+
		"\u0281\u0005?\u0000\u0000\u027e\u027f\u0005\u0002\u0000\u0000\u027f\u0280"+
		"\u0005@\u0000\u0000\u0280\u0282\u0005\u0003\u0000\u0000\u0281\u027e\u0001"+
		"\u0000\u0000\u0000\u0281\u0282\u0001\u0000\u0000\u0000\u0282\u0284\u0001"+
		"\u0000\u0000\u0000\u0283\u0273\u0001\u0000\u0000\u0000\u0283\u0276\u0001"+
		"\u0000\u0000\u0000\u0283\u0277\u0001\u0000\u0000\u0000\u0283\u0278\u0001"+
		"\u0000\u0000\u0000\u0283\u0279\u0001\u0000\u0000\u0000\u0283\u027d\u0001"+
		"\u0000\u0000\u0000\u0284\u0293\u0001\u0000\u0000\u0000\u0285\u0286\n\n"+
		"\u0000\u0000\u0286\u0287\u00058\u0000\u0000\u0287\u0292\u0003D\"\u000b"+
		"\u0288\u0289\n\t\u0000\u0000\u0289\u028a\u0007\u0001\u0000\u0000\u028a"+
		"\u0292\u0003D\"\n\u028b\u028c\n\b\u0000\u0000\u028c\u028d\u0007\u0002"+
		"\u0000\u0000\u028d\u0292\u0003D\"\t\u028e\u028f\n\u0007\u0000\u0000\u028f"+
		"\u0290\u0005\u001b\u0000\u0000\u0290\u0292\u0003D\"\b\u0291\u0285\u0001"+
		"\u0000\u0000\u0000\u0291\u0288\u0001\u0000\u0000\u0000\u0291\u028b\u0001"+
		"\u0000\u0000\u0000\u0291\u028e\u0001\u0000\u0000\u0000\u0292\u0295\u0001"+
		"\u0000\u0000\u0000\u0293\u0291\u0001\u0000\u0000\u0000\u0293\u0294\u0001"+
		"\u0000\u0000\u0000\u0294E\u0001\u0000\u0000\u0000\u0295\u0293\u0001\u0000"+
		"\u0000\u0000EIMRVZ^gkptx{\u0082\u0089\u008e\u0095\u009f\u00a7\u00ab\u00be"+
		"\u00c9\u00cf\u00d9\u00dd\u00e0\u00ea\u00f8\u0101\u0111\u011c\u012d\u0138"+
		"\u0162\u0166\u016c\u0175\u017e\u0186\u0192\u019b\u01a8\u01ab\u01b0\u01b4"+
		"\u01b9\u01bd\u01c5\u01c9\u01ce\u01d3\u01d7\u01dd\u01ee\u01f3\u01f9\u0202"+
		"\u020b\u0214\u0219\u0248\u024c\u0251\u0263\u0267\u0271\u0281\u0283\u0291"+
		"\u0293";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}