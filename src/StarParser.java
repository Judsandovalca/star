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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, X=7, N=8, DOTJ=9, IDOT=10, 
		DOTDOT=11, LSIZE=12, ARRAYLIST=13, LADD=14, LGET=15, LDELETE=16, LCONTAINS=17, 
		MGF=18, DISTRIBUTION=19, DENSITY=20, PERCENTIL=21, GAMMADISTRIBUTION=22, 
		GEOMETRICDISTRIBUTION=23, CHISQUAREDDISTRIBUTION=24, TDISTRIBUTION=25, 
		POISSONDISTRIBUTION=26, NORMALDISTRIBUTION=27, ARRAYSIZE=28, FWRITE=29, 
		FREAD=30, RANDOM=31, LN=32, ARRAYADD=33, ARRAYSUBS=34, ARRAYDOT=35, ARRAYCROSS=36, 
		SIN=37, COS=38, TAN=39, ARCSIN=40, ACOS=41, ARCTAN=42, SINH=43, COSH=44, 
		TANH=45, IF=46, DEF=47, RETURN=48, MOD=49, VECTOR=50, INT=51, FLOAT=52, 
		STRING=53, MATRIX=54, BOOL=55, TWM=56, GT=57, LESS=58, EQ=59, GTH=60, 
		LESSTH=61, NOTEQ=62, FOR=63, ELSE=64, NOT=65, TRUE=66, FALSE=67, AND=68, 
		OR=69, WHILE=70, ALGORITHM=71, READ=72, WRITE=73, ADD=74, MULT=75, SUBS=76, 
		DIV=77, POWER=78, LEFTP=79, RIGHTP=80, COMMA=81, END=82, COLON=83, CADENA=84, 
		ID=85, INTEGER=86, REALNUMBER=87, WS=88;
	public static final int
		RULE_prog = 0, RULE_stat = 1, RULE_idlist = 2, RULE_type = 3, RULE_algorithm = 4, 
		RULE_statement = 5, RULE_return_statement = 6, RULE_recursiveCall = 7, 
		RULE_while_statement = 8, RULE_if_statement = 9, RULE_for_statement = 10, 
		RULE_fun_statement = 11, RULE_relexpr = 12, RULE_bexpression = 13, RULE_bterm = 14, 
		RULE_bfactor = 15, RULE_read_statement = 16, RULE_write_statement = 17, 
		RULE_fwrite_statement = 18, RULE_fread_statement = 19, RULE_block = 20, 
		RULE_matrix = 21, RULE_array = 22, RULE_assignment_statement = 23, RULE_value = 24, 
		RULE_arrayexpr = 25, RULE_arraylist = 26, RULE_arraylistop = 27, RULE_trigFunction = 28, 
		RULE_function = 29, RULE_mathFunction = 30, RULE_probFunction = 31, RULE_twoWaysModel = 32, 
		RULE_twoWaysModelop = 33, RULE_densityFunction = 34, RULE_momentumGenerationFunction = 35, 
		RULE_distributionFunction = 36, RULE_percentilFunction = 37, RULE_randomFunction = 38, 
		RULE_logFunction = 39, RULE_usefunction = 40, RULE_algexpr = 41;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "stat", "idlist", "type", "algorithm", "statement", "return_statement", 
			"recursiveCall", "while_statement", "if_statement", "for_statement", 
			"fun_statement", "relexpr", "bexpression", "bterm", "bfactor", "read_statement", 
			"write_statement", "fwrite_statement", "fread_statement", "block", "matrix", 
			"array", "assignment_statement", "value", "arrayexpr", "arraylist", "arraylistop", 
			"trigFunction", "function", "mathFunction", "probFunction", "twoWaysModel", 
			"twoWaysModelop", "densityFunction", "momentumGenerationFunction", "distributionFunction", 
			"percentilFunction", "randomFunction", "logFunction", "usefunction", 
			"algexpr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'['", "']'", "'{'", "'}'", "'='", "'.x'", "'.n'", "'.,'", 
			"',.'", "'..'", "'.size'", "'arraylist'", "'.add'", "'.get'", "'.delete'", 
			"'.contains'", "'.MGF'", "'.distribution'", "'.density'", "'.percentil'", 
			"'gammaDistribution'", "'geometricDistribution'", "'chiSquaredDistribution'", 
			"'TDistribution'", "'poissonDistribution'", "'normalDistribution'", "'array.size'", 
			"'fwrite'", "'fread'", "'random'", "'ln'", "'array.add'", "'array.substract'", 
			"'array.dot'", "'array.cross'", "'sin'", "'cos'", "'tan'", "'arcsin'", 
			"'acos'", "'arctan'", "'sinh'", "'cosh'", "'tanh'", "'if'", "'def'", 
			"'return'", "'%'", "'vector'", "'int'", "'float'", "'string'", "'matrix'", 
			"'bool'", "'TWM'", "'>'", "'<'", "'=='", "'>='", "'<='", "'!='", "'for'", 
			"'else'", "'not'", "'true'", "'false'", "'and'", "'or'", "'while'", "'algorithm'", 
			"'read'", "'write'", "'+'", "'*'", "'-'", "'/'", "'^'", "'('", "')'", 
			"','", "'.'", "':'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, "X", "N", "DOTJ", "IDOT", "DOTDOT", 
			"LSIZE", "ARRAYLIST", "LADD", "LGET", "LDELETE", "LCONTAINS", "MGF", 
			"DISTRIBUTION", "DENSITY", "PERCENTIL", "GAMMADISTRIBUTION", "GEOMETRICDISTRIBUTION", 
			"CHISQUAREDDISTRIBUTION", "TDISTRIBUTION", "POISSONDISTRIBUTION", "NORMALDISTRIBUTION", 
			"ARRAYSIZE", "FWRITE", "FREAD", "RANDOM", "LN", "ARRAYADD", "ARRAYSUBS", 
			"ARRAYDOT", "ARRAYCROSS", "SIN", "COS", "TAN", "ARCSIN", "ACOS", "ARCTAN", 
			"SINH", "COSH", "TANH", "IF", "DEF", "RETURN", "MOD", "VECTOR", "INT", 
			"FLOAT", "STRING", "MATRIX", "BOOL", "TWM", "GT", "LESS", "EQ", "GTH", 
			"LESSTH", "NOTEQ", "FOR", "ELSE", "NOT", "TRUE", "FALSE", "AND", "OR", 
			"WHILE", "ALGORITHM", "READ", "WRITE", "ADD", "MULT", "SUBS", "DIV", 
			"POWER", "LEFTP", "RIGHTP", "COMMA", "END", "COLON", "CADENA", "ID", 
			"INTEGER", "REALNUMBER", "WS"
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
			setState(85); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(84);
				stat();
				}
				}
				setState(87); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & -9150751492867612672L) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 15747559L) != 0) );
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
		public ProbFunctionContext probFunction() {
			return getRuleContext(ProbFunctionContext.class,0);
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
	public static class ArraylopContext extends StatContext {
		public ArraylistopContext arraylistop() {
			return getRuleContext(ArraylistopContext.class,0);
		}
		public TerminalNode WS() { return getToken(StarParser.WS, 0); }
		public ArraylopContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StarVisitor ) return ((StarVisitor<? extends T>)visitor).visitArraylop(this);
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
		public TerminalNode WS() { return getToken(StarParser.WS, 0); }
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
	public static class TwmContext extends StatContext {
		public TwoWaysModelContext twoWaysModel() {
			return getRuleContext(TwoWaysModelContext.class,0);
		}
		public TerminalNode WS() { return getToken(StarParser.WS, 0); }
		public TwmContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StarVisitor ) return ((StarVisitor<? extends T>)visitor).visitTwm(this);
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
		public TerminalNode WS() { return getToken(StarParser.WS, 0); }
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
	public static class TwmopContext extends StatContext {
		public TwoWaysModelopContext twoWaysModelop() {
			return getRuleContext(TwoWaysModelopContext.class,0);
		}
		public TerminalNode WS() { return getToken(StarParser.WS, 0); }
		public TwmopContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StarVisitor ) return ((StarVisitor<? extends T>)visitor).visitTwmop(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArraylContext extends StatContext {
		public ArraylistContext arraylist() {
			return getRuleContext(ArraylistContext.class,0);
		}
		public TerminalNode WS() { return getToken(StarParser.WS, 0); }
		public ArraylContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StarVisitor ) return ((StarVisitor<? extends T>)visitor).visitArrayl(this);
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
		public TerminalNode WS() { return getToken(StarParser.WS, 0); }
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
			setState(163);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				_localctx = new ProbContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(89);
				probFunction();
				setState(91);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
				case 1:
					{
					setState(90);
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
				setState(93);
				algorithm();
				}
				break;
			case 3:
				_localctx = new UsefunContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(94);
				usefunction();
				setState(96);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(95);
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
				setState(98);
				arrayexpr();
				setState(100);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(99);
					match(WS);
					}
					break;
				}
				}
				break;
			case 5:
				_localctx = new ArraylContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(102);
				arraylist();
				setState(104);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(103);
					match(WS);
					}
					break;
				}
				}
				break;
			case 6:
				_localctx = new TwmContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(106);
				twoWaysModel();
				setState(108);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(107);
					match(WS);
					}
					break;
				}
				}
				break;
			case 7:
				_localctx = new TwmopContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(110);
				twoWaysModelop();
				setState(112);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(111);
					match(WS);
					}
					break;
				}
				}
				break;
			case 8:
				_localctx = new ArraylopContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(114);
				arraylistop();
				setState(116);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					setState(115);
					match(WS);
					}
					break;
				}
				}
				break;
			case 9:
				_localctx = new PrintExprContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(118);
				algexpr(0);
				setState(120);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					setState(119);
					match(WS);
					}
					break;
				}
				}
				break;
			case 10:
				_localctx = new AssignContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(122);
				assignment_statement();
				setState(124);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
				case 1:
					{
					setState(123);
					match(WS);
					}
					break;
				}
				}
				break;
			case 11:
				_localctx = new BexprContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(126);
				bexpression(0);
				}
				break;
			case 12:
				_localctx = new WhileContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(127);
				while_statement();
				setState(129);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
				case 1:
					{
					setState(128);
					match(WS);
					}
					break;
				}
				}
				break;
			case 13:
				_localctx = new IfContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(131);
				if_statement();
				setState(133);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
				case 1:
					{
					setState(132);
					match(WS);
					}
					break;
				}
				}
				break;
			case 14:
				_localctx = new ForContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(135);
				for_statement();
				setState(137);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
				case 1:
					{
					setState(136);
					match(WS);
					}
					break;
				}
				}
				break;
			case 15:
				_localctx = new RelationalexpresionContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(139);
				relexpr();
				}
				break;
			case 16:
				_localctx = new WriteContext(_localctx);
				enterOuterAlt(_localctx, 16);
				{
				setState(140);
				write_statement();
				setState(142);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
				case 1:
					{
					setState(141);
					match(WS);
					}
					break;
				}
				}
				break;
			case 17:
				_localctx = new FwriteContext(_localctx);
				enterOuterAlt(_localctx, 17);
				{
				setState(144);
				fwrite_statement();
				setState(146);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
				case 1:
					{
					setState(145);
					match(WS);
					}
					break;
				}
				}
				break;
			case 18:
				_localctx = new ReadContext(_localctx);
				enterOuterAlt(_localctx, 18);
				{
				setState(148);
				read_statement();
				}
				break;
			case 19:
				_localctx = new FreadContext(_localctx);
				enterOuterAlt(_localctx, 19);
				{
				setState(149);
				fread_statement();
				}
				break;
			case 20:
				_localctx = new FunctionsContext(_localctx);
				enterOuterAlt(_localctx, 20);
				{
				setState(150);
				fun_statement();
				setState(152);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
				case 1:
					{
					setState(151);
					match(WS);
					}
					break;
				}
				}
				break;
			case 21:
				_localctx = new Return2Context(_localctx);
				enterOuterAlt(_localctx, 21);
				{
				setState(154);
				return_statement();
				setState(156);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
				case 1:
					{
					setState(155);
					match(WS);
					}
					break;
				}
				}
				break;
			case 22:
				_localctx = new TrigContext(_localctx);
				enterOuterAlt(_localctx, 22);
				{
				setState(158);
				trigFunction();
				setState(160);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
				case 1:
					{
					setState(159);
					match(WS);
					}
					break;
				}
				}
				break;
			case 23:
				_localctx = new BlankContext(_localctx);
				enterOuterAlt(_localctx, 23);
				{
				setState(162);
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
			setState(165);
			match(ID);
			setState(170);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(166);
					match(COMMA);
					setState(167);
					match(ID);
					}
					} 
				}
				setState(172);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
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
		public TerminalNode TWM() { return getToken(StarParser.TWM, 0); }
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
			setState(180);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				_localctx = new TipoIntContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(173);
				match(INT);
				}
				break;
			case FLOAT:
				_localctx = new TipoFloatContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(174);
				match(FLOAT);
				}
				break;
			case STRING:
				_localctx = new TipoStringContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(175);
				match(STRING);
				}
				break;
			case BOOL:
				_localctx = new TipoBoolContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(176);
				match(BOOL);
				}
				break;
			case MATRIX:
				_localctx = new TipoMatrixContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(177);
				match(MATRIX);
				}
				break;
			case VECTOR:
				_localctx = new TipoVectorContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(178);
				match(VECTOR);
				}
				break;
			case TWM:
				_localctx = new TipoTMWContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(179);
				match(TWM);
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
			setState(182);
			match(ALGORITHM);
			setState(183);
			match(ID);
			setState(188);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LEFTP) {
				{
				setState(184);
				match(LEFTP);
				setState(185);
				idlist();
				setState(186);
				match(RIGHTP);
				}
			}

			setState(190);
			match(COLON);
			setState(192);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(191);
				match(WS);
				}
			}

			setState(194);
			statement();
			setState(195);
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
			setState(211);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(197);
				block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(198);
				read_statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(199);
				fread_statement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(200);
				write_statement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(201);
				fwrite_statement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(202);
				while_statement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(203);
				if_statement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(204);
				for_statement();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(205);
				fun_statement();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(206);
				usefunction();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(207);
				assignment_statement();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(208);
				return_statement();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(209);
				algexpr(0);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(210);
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
	public static class Return_statementContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(StarParser.RETURN, 0); }
		public RecursiveCallContext recursiveCall() {
			return getRuleContext(RecursiveCallContext.class,0);
		}
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
		enterRule(_localctx, 12, RULE_return_statement);
		try {
			setState(219);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(213);
				match(RETURN);
				setState(214);
				recursiveCall();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(215);
				match(RETURN);
				setState(216);
				usefunction();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(217);
				match(RETURN);
				setState(218);
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
	public static class RecursiveCallContext extends ParserRuleContext {
		public RecursiveCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_recursiveCall; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StarVisitor ) return ((StarVisitor<? extends T>)visitor).visitRecursiveCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RecursiveCallContext recursiveCall() throws RecognitionException {
		RecursiveCallContext _localctx = new RecursiveCallContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_recursiveCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			match(T__0);
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
			setState(223);
			match(WHILE);
			setState(224);
			bexpression(0);
			setState(225);
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
			setState(227);
			match(IF);
			setState(228);
			bexpression(0);
			setState(229);
			statement();
			setState(231);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				setState(230);
				match(WS);
				}
				break;
			}
			setState(238);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(233);
				match(ELSE);
				setState(235);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(234);
					match(WS);
					}
				}

				setState(237);
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
			setState(262);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(240);
				match(FOR);
				setState(241);
				assignment_statement();
				setState(242);
				match(T__0);
				setState(243);
				bexpression(0);
				setState(244);
				match(T__0);
				setState(245);
				assignment_statement();
				setState(246);
				match(T__0);
				setState(248);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(247);
					match(WS);
					}
				}

				setState(250);
				statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(252);
				match(FOR);
				setState(253);
				match(LEFTP);
				setState(254);
				assignment_statement();
				setState(255);
				match(T__0);
				setState(256);
				bexpression(0);
				setState(257);
				match(T__0);
				setState(258);
				assignment_statement();
				setState(259);
				match(RIGHTP);
				setState(260);
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
			setState(264);
			match(DEF);
			setState(265);
			match(ID);
			setState(266);
			match(LEFTP);
			setState(267);
			idlist();
			setState(268);
			match(RIGHTP);
			setState(269);
			match(COLON);
			setState(271);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(270);
				match(WS);
				}
			}

			setState(273);
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
			setState(275);
			algexpr(0);
			setState(276);
			((RelexprContext)_localctx).opl = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 9079256848778919936L) != 0)) ) {
				((RelexprContext)_localctx).opl = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(277);
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

			setState(280);
			bterm(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(287);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Bexp1Context(new BexpressionContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_bexpression);
					setState(282);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(283);
					match(OR);
					setState(284);
					bterm(0);
					}
					} 
				}
				setState(289);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
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

			setState(291);
			bfactor();
			}
			_ctx.stop = _input.LT(-1);
			setState(298);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Bterm1Context(new BtermContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_bterm);
					setState(293);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(294);
					match(AND);
					setState(295);
					bfactor();
					}
					} 
				}
				setState(300);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
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
			setState(315);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				_localctx = new BNegContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(301);
				match(NOT);
				setState(302);
				bfactor();
				}
				break;
			case 2:
				_localctx = new BParenthesisContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(303);
				match(LEFTP);
				setState(304);
				bexpression(0);
				setState(305);
				match(RIGHTP);
				}
				break;
			case 3:
				_localctx = new BIDContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(307);
				match(ID);
				}
				break;
			case 4:
				_localctx = new BTrueContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(308);
				match(TRUE);
				}
				break;
			case 5:
				_localctx = new BFalseContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(309);
				match(FALSE);
				}
				break;
			case 6:
				_localctx = new RelationalsContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(310);
				relexpr();
				}
				break;
			case 7:
				_localctx = new RelParenthesisContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(311);
				match(LEFTP);
				setState(312);
				relexpr();
				setState(313);
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
			setState(326);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(317);
				match(READ);
				setState(318);
				match(LEFTP);
				setState(319);
				idlist();
				setState(320);
				match(RIGHTP);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(322);
				match(READ);
				setState(323);
				match(LEFTP);
				setState(324);
				match(CADENA);
				setState(325);
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
			setState(372);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(328);
				match(WRITE);
				setState(329);
				match(LEFTP);
				setState(330);
				idlist();
				setState(331);
				match(RIGHTP);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(333);
				match(WRITE);
				setState(334);
				match(LEFTP);
				setState(335);
				algexpr(0);
				setState(336);
				match(RIGHTP);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(338);
				match(WRITE);
				setState(339);
				match(LEFTP);
				setState(340);
				match(CADENA);
				setState(341);
				match(RIGHTP);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(342);
				match(WRITE);
				setState(343);
				match(LEFTP);
				setState(344);
				array();
				setState(345);
				match(T__1);
				setState(346);
				match(INTEGER);
				setState(347);
				match(T__2);
				setState(348);
				match(RIGHTP);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(350);
				match(WRITE);
				setState(351);
				match(LEFTP);
				setState(352);
				usefunction();
				setState(353);
				match(RIGHTP);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(355);
				match(WRITE);
				setState(356);
				match(LEFTP);
				setState(357);
				arrayexpr();
				setState(358);
				match(RIGHTP);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(360);
				match(WRITE);
				setState(361);
				match(LEFTP);
				setState(362);
				matrix();
				setState(366); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(363);
					match(T__1);
					setState(364);
					match(INTEGER);
					setState(365);
					match(T__2);
					}
					}
					setState(368); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__1 );
				setState(370);
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
			setState(446);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(374);
				match(FWRITE);
				setState(375);
				match(LEFTP);
				setState(376);
				idlist();
				setState(378);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(377);
					match(COMMA);
					}
				}

				setState(380);
				match(CADENA);
				setState(381);
				match(RIGHTP);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(383);
				match(FWRITE);
				setState(384);
				match(LEFTP);
				setState(385);
				algexpr(0);
				setState(387);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(386);
					match(COMMA);
					}
				}

				setState(389);
				match(CADENA);
				setState(390);
				match(RIGHTP);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(392);
				match(FWRITE);
				setState(393);
				match(LEFTP);
				setState(394);
				match(CADENA);
				setState(396);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(395);
					match(COMMA);
					}
				}

				setState(398);
				match(CADENA);
				setState(399);
				match(RIGHTP);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(400);
				match(FWRITE);
				setState(401);
				match(LEFTP);
				setState(402);
				array();
				setState(404);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(403);
					match(COMMA);
					}
				}

				setState(406);
				match(CADENA);
				setState(407);
				match(T__1);
				setState(408);
				match(INTEGER);
				setState(409);
				match(T__2);
				setState(410);
				match(RIGHTP);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(412);
				match(FWRITE);
				setState(413);
				match(LEFTP);
				setState(414);
				usefunction();
				setState(416);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(415);
					match(COMMA);
					}
				}

				setState(418);
				match(CADENA);
				setState(419);
				match(RIGHTP);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(421);
				match(FWRITE);
				setState(422);
				match(LEFTP);
				setState(423);
				arrayexpr();
				setState(425);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(424);
					match(COMMA);
					}
				}

				setState(427);
				match(CADENA);
				setState(428);
				match(RIGHTP);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(430);
				match(FWRITE);
				setState(431);
				match(LEFTP);
				setState(432);
				matrix();
				setState(436); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(433);
					match(T__1);
					setState(434);
					match(INTEGER);
					setState(435);
					match(T__2);
					}
					}
					setState(438); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__1 );
				setState(441);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(440);
					match(COMMA);
					}
				}

				setState(443);
				match(CADENA);
				setState(444);
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
		enterRule(_localctx, 38, RULE_fread_statement);
		int _la;
		try {
			setState(465);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(448);
				match(FREAD);
				setState(449);
				match(LEFTP);
				setState(450);
				idlist();
				setState(451);
				match(COMMA);
				setState(453);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CADENA) {
					{
					setState(452);
					match(CADENA);
					}
				}

				setState(455);
				match(RIGHTP);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(457);
				match(FREAD);
				setState(458);
				match(LEFTP);
				setState(459);
				match(CADENA);
				setState(460);
				match(COMMA);
				setState(462);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CADENA) {
					{
					setState(461);
					match(CADENA);
					}
				}

				setState(464);
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
		enterRule(_localctx, 40, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(467);
			match(T__3);
			setState(469);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(468);
				match(WS);
				}
			}

			setState(478);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -9222809086905548784L) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & 229965L) != 0)) {
				{
				{
				setState(471);
				statement();
				setState(472);
				match(T__0);
				setState(474);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(473);
					match(WS);
					}
				}

				}
				}
				setState(480);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(481);
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
		enterRule(_localctx, 42, RULE_matrix);
		int _la;
		try {
			setState(495);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(483);
				match(T__1);
				setState(488); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(484);
					array();
					setState(486);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==COMMA) {
						{
						setState(485);
						match(COMMA);
						}
					}

					}
					}
					setState(490); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 129117454340L) != 0) || _la==ID );
				setState(492);
				match(T__2);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(494);
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
		enterRule(_localctx, 44, RULE_array);
		int _la;
		try {
			setState(510);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(497);
				match(T__1);
				setState(502); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(498);
					algexpr(0);
					setState(500);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==COMMA) {
						{
						setState(499);
						match(COMMA);
						}
					}

					}
					}
					setState(504); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 70238011916288L) != 0) || ((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & 3593L) != 0) );
				setState(506);
				match(T__2);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(508);
				match(ID);
				}
				break;
			case ARRAYSIZE:
			case ARRAYADD:
			case ARRAYSUBS:
			case ARRAYDOT:
			case ARRAYCROSS:
				enterOuterAlt(_localctx, 3);
				{
				setState(509);
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
		enterRule(_localctx, 46, RULE_assignment_statement);
		try {
			setState(527);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(512);
				match(ID);
				setState(513);
				match(T__5);
				setState(514);
				usefunction();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(515);
				match(ID);
				setState(516);
				match(T__5);
				setState(517);
				algexpr(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(518);
				match(ID);
				setState(519);
				match(T__5);
				setState(520);
				match(CADENA);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(521);
				match(ID);
				setState(522);
				match(T__5);
				setState(523);
				matrix();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(524);
				match(ID);
				setState(525);
				match(T__5);
				setState(526);
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
		enterRule(_localctx, 48, RULE_value);
		try {
			setState(532);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(529);
				algexpr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(530);
				bexpression(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(531);
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
		public TerminalNode ARRAYSIZE() { return getToken(StarParser.ARRAYSIZE, 0); }
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
		enterRule(_localctx, 50, RULE_arrayexpr);
		int _la;
		try {
			setState(575);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ARRAYADD:
				enterOuterAlt(_localctx, 1);
				{
				setState(534);
				match(ARRAYADD);
				setState(535);
				match(LEFTP);
				setState(536);
				array();
				setState(538);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(537);
					match(COMMA);
					}
				}

				setState(540);
				array();
				setState(541);
				match(RIGHTP);
				}
				break;
			case ARRAYSIZE:
				enterOuterAlt(_localctx, 2);
				{
				setState(543);
				match(ARRAYSIZE);
				setState(544);
				match(LEFTP);
				setState(545);
				array();
				setState(546);
				match(RIGHTP);
				}
				break;
			case ARRAYSUBS:
				enterOuterAlt(_localctx, 3);
				{
				setState(548);
				match(ARRAYSUBS);
				setState(549);
				match(LEFTP);
				setState(550);
				array();
				setState(552);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(551);
					match(COMMA);
					}
				}

				setState(554);
				array();
				setState(555);
				match(RIGHTP);
				}
				break;
			case ARRAYDOT:
				enterOuterAlt(_localctx, 4);
				{
				setState(557);
				match(ARRAYDOT);
				setState(558);
				match(LEFTP);
				setState(559);
				array();
				setState(561);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(560);
					match(COMMA);
					}
				}

				setState(563);
				array();
				setState(564);
				match(RIGHTP);
				}
				break;
			case ARRAYCROSS:
				enterOuterAlt(_localctx, 5);
				{
				setState(566);
				match(ARRAYCROSS);
				setState(567);
				match(LEFTP);
				setState(568);
				array();
				setState(570);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(569);
					match(COMMA);
					}
				}

				setState(572);
				array();
				setState(573);
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
	public static class ArraylistContext extends ParserRuleContext {
		public TerminalNode ARRAYLIST() { return getToken(StarParser.ARRAYLIST, 0); }
		public TerminalNode ID() { return getToken(StarParser.ID, 0); }
		public ArraylistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arraylist; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StarVisitor ) return ((StarVisitor<? extends T>)visitor).visitArraylist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArraylistContext arraylist() throws RecognitionException {
		ArraylistContext _localctx = new ArraylistContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_arraylist);
		try {
			setState(580);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ARRAYLIST:
				enterOuterAlt(_localctx, 1);
				{
				setState(577);
				match(ARRAYLIST);
				setState(578);
				match(ID);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(579);
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
	public static class ArraylistopContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(StarParser.ID, 0); }
		public TerminalNode LADD() { return getToken(StarParser.LADD, 0); }
		public TerminalNode LEFTP() { return getToken(StarParser.LEFTP, 0); }
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public TerminalNode RIGHTP() { return getToken(StarParser.RIGHTP, 0); }
		public TerminalNode LDELETE() { return getToken(StarParser.LDELETE, 0); }
		public TerminalNode LGET() { return getToken(StarParser.LGET, 0); }
		public TerminalNode INTEGER() { return getToken(StarParser.INTEGER, 0); }
		public TerminalNode LCONTAINS() { return getToken(StarParser.LCONTAINS, 0); }
		public TerminalNode LSIZE() { return getToken(StarParser.LSIZE, 0); }
		public ArraylistopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arraylistop; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StarVisitor ) return ((StarVisitor<? extends T>)visitor).visitArraylistop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArraylistopContext arraylistop() throws RecognitionException {
		ArraylistopContext _localctx = new ArraylistopContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_arraylistop);
		try {
			setState(609);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(582);
				match(ID);
				setState(583);
				match(LADD);
				setState(584);
				match(LEFTP);
				setState(585);
				array();
				setState(586);
				match(RIGHTP);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(588);
				match(ID);
				setState(589);
				match(LDELETE);
				setState(590);
				match(LEFTP);
				setState(591);
				array();
				setState(592);
				match(RIGHTP);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(594);
				match(ID);
				setState(595);
				match(LGET);
				setState(596);
				match(LEFTP);
				setState(597);
				match(INTEGER);
				setState(598);
				match(RIGHTP);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(599);
				match(ID);
				setState(600);
				match(LCONTAINS);
				setState(601);
				match(LEFTP);
				setState(602);
				array();
				setState(603);
				match(RIGHTP);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(605);
				match(ID);
				setState(606);
				match(LSIZE);
				setState(607);
				match(LEFTP);
				setState(608);
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
		enterRule(_localctx, 56, RULE_trigFunction);
		try {
			setState(656);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SIN:
				enterOuterAlt(_localctx, 1);
				{
				setState(611);
				match(SIN);
				setState(612);
				match(LEFTP);
				setState(613);
				algexpr(0);
				setState(614);
				match(RIGHTP);
				}
				break;
			case COS:
				enterOuterAlt(_localctx, 2);
				{
				setState(616);
				match(COS);
				setState(617);
				match(LEFTP);
				setState(618);
				algexpr(0);
				setState(619);
				match(RIGHTP);
				}
				break;
			case TAN:
				enterOuterAlt(_localctx, 3);
				{
				setState(621);
				match(TAN);
				setState(622);
				match(LEFTP);
				setState(623);
				algexpr(0);
				setState(624);
				match(RIGHTP);
				}
				break;
			case ARCSIN:
				enterOuterAlt(_localctx, 4);
				{
				setState(626);
				match(ARCSIN);
				setState(627);
				match(LEFTP);
				setState(628);
				algexpr(0);
				setState(629);
				match(RIGHTP);
				}
				break;
			case ACOS:
				enterOuterAlt(_localctx, 5);
				{
				setState(631);
				match(ACOS);
				setState(632);
				match(LEFTP);
				setState(633);
				algexpr(0);
				setState(634);
				match(RIGHTP);
				}
				break;
			case ARCTAN:
				enterOuterAlt(_localctx, 6);
				{
				setState(636);
				match(ARCTAN);
				setState(637);
				match(LEFTP);
				setState(638);
				algexpr(0);
				setState(639);
				match(RIGHTP);
				}
				break;
			case SINH:
				enterOuterAlt(_localctx, 7);
				{
				setState(641);
				match(SINH);
				setState(642);
				match(LEFTP);
				setState(643);
				algexpr(0);
				setState(644);
				match(RIGHTP);
				}
				break;
			case COSH:
				enterOuterAlt(_localctx, 8);
				{
				setState(646);
				match(COSH);
				setState(647);
				match(LEFTP);
				setState(648);
				algexpr(0);
				setState(649);
				match(RIGHTP);
				}
				break;
			case TANH:
				enterOuterAlt(_localctx, 9);
				{
				setState(651);
				match(TANH);
				setState(652);
				match(LEFTP);
				setState(653);
				algexpr(0);
				setState(654);
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
		enterRule(_localctx, 58, RULE_function);
		try {
			setState(660);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case GAMMADISTRIBUTION:
			case GEOMETRICDISTRIBUTION:
			case CHISQUAREDDISTRIBUTION:
			case TDISTRIBUTION:
			case POISSONDISTRIBUTION:
			case NORMALDISTRIBUTION:
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
				setState(658);
				mathFunction();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(659);
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
		enterRule(_localctx, 60, RULE_mathFunction);
		try {
			setState(665);
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
				setState(662);
				trigFunction();
				}
				break;
			case LN:
				enterOuterAlt(_localctx, 2);
				{
				setState(663);
				logFunction();
				}
				break;
			case GAMMADISTRIBUTION:
			case GEOMETRICDISTRIBUTION:
			case CHISQUAREDDISTRIBUTION:
			case TDISTRIBUTION:
			case POISSONDISTRIBUTION:
			case NORMALDISTRIBUTION:
			case RANDOM:
				enterOuterAlt(_localctx, 3);
				{
				setState(664);
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
		public DensityFunctionContext densityFunction() {
			return getRuleContext(DensityFunctionContext.class,0);
		}
		public DistributionFunctionContext distributionFunction() {
			return getRuleContext(DistributionFunctionContext.class,0);
		}
		public PercentilFunctionContext percentilFunction() {
			return getRuleContext(PercentilFunctionContext.class,0);
		}
		public MomentumGenerationFunctionContext momentumGenerationFunction() {
			return getRuleContext(MomentumGenerationFunctionContext.class,0);
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
		enterRule(_localctx, 62, RULE_probFunction);
		try {
			setState(672);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(667);
				randomFunction();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(668);
				densityFunction();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(669);
				distributionFunction();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(670);
				percentilFunction();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(671);
				momentumGenerationFunction();
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
	public static class TwoWaysModelContext extends ParserRuleContext {
		public TerminalNode TWM() { return getToken(StarParser.TWM, 0); }
		public TerminalNode ID() { return getToken(StarParser.ID, 0); }
		public TerminalNode LEFTP() { return getToken(StarParser.LEFTP, 0); }
		public TerminalNode REALNUMBER() { return getToken(StarParser.REALNUMBER, 0); }
		public List<ArrayContext> array() {
			return getRuleContexts(ArrayContext.class);
		}
		public ArrayContext array(int i) {
			return getRuleContext(ArrayContext.class,i);
		}
		public ArraylistContext arraylist() {
			return getRuleContext(ArraylistContext.class,0);
		}
		public TerminalNode RIGHTP() { return getToken(StarParser.RIGHTP, 0); }
		public List<TerminalNode> COMMA() { return getTokens(StarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(StarParser.COMMA, i);
		}
		public TwoWaysModelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_twoWaysModel; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StarVisitor ) return ((StarVisitor<? extends T>)visitor).visitTwoWaysModel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TwoWaysModelContext twoWaysModel() throws RecognitionException {
		TwoWaysModelContext _localctx = new TwoWaysModelContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_twoWaysModel);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(674);
			match(TWM);
			setState(675);
			match(ID);
			setState(676);
			match(LEFTP);
			setState(677);
			match(REALNUMBER);
			setState(679);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(678);
				match(COMMA);
				}
			}

			setState(681);
			array();
			setState(683);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(682);
				match(COMMA);
				}
			}

			setState(685);
			array();
			setState(687);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(686);
				match(COMMA);
				}
			}

			setState(689);
			arraylist();
			setState(690);
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
	public static class TwoWaysModelopContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(StarParser.ID, 0); }
		public TerminalNode N() { return getToken(StarParser.N, 0); }
		public TerminalNode LEFTP() { return getToken(StarParser.LEFTP, 0); }
		public TerminalNode DOTDOT() { return getToken(StarParser.DOTDOT, 0); }
		public TerminalNode RIGHTP() { return getToken(StarParser.RIGHTP, 0); }
		public TerminalNode INTEGER() { return getToken(StarParser.INTEGER, 0); }
		public TerminalNode IDOT() { return getToken(StarParser.IDOT, 0); }
		public TerminalNode DOTJ() { return getToken(StarParser.DOTJ, 0); }
		public TerminalNode X() { return getToken(StarParser.X, 0); }
		public TwoWaysModelopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_twoWaysModelop; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StarVisitor ) return ((StarVisitor<? extends T>)visitor).visitTwoWaysModelop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TwoWaysModelopContext twoWaysModelop() throws RecognitionException {
		TwoWaysModelopContext _localctx = new TwoWaysModelopContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_twoWaysModelop);
		try {
			setState(726);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(692);
				match(ID);
				setState(693);
				match(N);
				setState(694);
				match(LEFTP);
				setState(695);
				match(DOTDOT);
				setState(696);
				match(RIGHTP);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(697);
				match(ID);
				setState(698);
				match(N);
				setState(699);
				match(LEFTP);
				setState(700);
				match(INTEGER);
				setState(701);
				match(IDOT);
				setState(702);
				match(RIGHTP);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(703);
				match(ID);
				setState(704);
				match(N);
				setState(705);
				match(LEFTP);
				setState(706);
				match(DOTJ);
				setState(707);
				match(INTEGER);
				setState(708);
				match(RIGHTP);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(709);
				match(ID);
				setState(710);
				match(X);
				setState(711);
				match(LEFTP);
				setState(712);
				match(DOTDOT);
				setState(713);
				match(RIGHTP);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(714);
				match(ID);
				setState(715);
				match(X);
				setState(716);
				match(LEFTP);
				setState(717);
				match(INTEGER);
				setState(718);
				match(IDOT);
				setState(719);
				match(RIGHTP);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(720);
				match(ID);
				setState(721);
				match(X);
				setState(722);
				match(LEFTP);
				setState(723);
				match(DOTJ);
				setState(724);
				match(INTEGER);
				setState(725);
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
	public static class DensityFunctionContext extends ParserRuleContext {
		public TerminalNode NORMALDISTRIBUTION() { return getToken(StarParser.NORMALDISTRIBUTION, 0); }
		public List<TerminalNode> LEFTP() { return getTokens(StarParser.LEFTP); }
		public TerminalNode LEFTP(int i) {
			return getToken(StarParser.LEFTP, i);
		}
		public List<TerminalNode> REALNUMBER() { return getTokens(StarParser.REALNUMBER); }
		public TerminalNode REALNUMBER(int i) {
			return getToken(StarParser.REALNUMBER, i);
		}
		public List<TerminalNode> RIGHTP() { return getTokens(StarParser.RIGHTP); }
		public TerminalNode RIGHTP(int i) {
			return getToken(StarParser.RIGHTP, i);
		}
		public TerminalNode DENSITY() { return getToken(StarParser.DENSITY, 0); }
		public TerminalNode COMMA() { return getToken(StarParser.COMMA, 0); }
		public TerminalNode TDISTRIBUTION() { return getToken(StarParser.TDISTRIBUTION, 0); }
		public TerminalNode INTEGER() { return getToken(StarParser.INTEGER, 0); }
		public TerminalNode POISSONDISTRIBUTION() { return getToken(StarParser.POISSONDISTRIBUTION, 0); }
		public TerminalNode CHISQUAREDDISTRIBUTION() { return getToken(StarParser.CHISQUAREDDISTRIBUTION, 0); }
		public TerminalNode GEOMETRICDISTRIBUTION() { return getToken(StarParser.GEOMETRICDISTRIBUTION, 0); }
		public TerminalNode GAMMADISTRIBUTION() { return getToken(StarParser.GAMMADISTRIBUTION, 0); }
		public DensityFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_densityFunction; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StarVisitor ) return ((StarVisitor<? extends T>)visitor).visitDensityFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DensityFunctionContext densityFunction() throws RecognitionException {
		DensityFunctionContext _localctx = new DensityFunctionContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_densityFunction);
		int _la;
		try {
			setState(784);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NORMALDISTRIBUTION:
				enterOuterAlt(_localctx, 1);
				{
				setState(728);
				match(NORMALDISTRIBUTION);
				setState(729);
				match(LEFTP);
				setState(730);
				match(REALNUMBER);
				setState(732);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(731);
					match(COMMA);
					}
				}

				setState(734);
				match(REALNUMBER);
				setState(735);
				match(RIGHTP);
				setState(736);
				match(DENSITY);
				setState(737);
				match(LEFTP);
				setState(738);
				match(REALNUMBER);
				setState(739);
				match(RIGHTP);
				}
				break;
			case TDISTRIBUTION:
				enterOuterAlt(_localctx, 2);
				{
				setState(740);
				match(TDISTRIBUTION);
				setState(741);
				match(LEFTP);
				setState(742);
				match(INTEGER);
				setState(743);
				match(RIGHTP);
				setState(744);
				match(DENSITY);
				setState(745);
				match(LEFTP);
				setState(746);
				match(REALNUMBER);
				setState(747);
				match(RIGHTP);
				}
				break;
			case POISSONDISTRIBUTION:
				enterOuterAlt(_localctx, 3);
				{
				setState(748);
				match(POISSONDISTRIBUTION);
				setState(749);
				match(LEFTP);
				setState(750);
				match(REALNUMBER);
				setState(751);
				match(RIGHTP);
				setState(752);
				match(DENSITY);
				setState(753);
				match(LEFTP);
				setState(754);
				match(REALNUMBER);
				setState(755);
				match(RIGHTP);
				}
				break;
			case CHISQUAREDDISTRIBUTION:
				enterOuterAlt(_localctx, 4);
				{
				setState(756);
				match(CHISQUAREDDISTRIBUTION);
				setState(757);
				match(LEFTP);
				setState(758);
				match(INTEGER);
				setState(759);
				match(RIGHTP);
				setState(760);
				match(DENSITY);
				setState(761);
				match(LEFTP);
				setState(762);
				match(REALNUMBER);
				setState(763);
				match(RIGHTP);
				}
				break;
			case GEOMETRICDISTRIBUTION:
				enterOuterAlt(_localctx, 5);
				{
				setState(764);
				match(GEOMETRICDISTRIBUTION);
				setState(765);
				match(LEFTP);
				setState(766);
				match(REALNUMBER);
				setState(767);
				match(RIGHTP);
				setState(768);
				match(DENSITY);
				setState(769);
				match(LEFTP);
				setState(770);
				match(REALNUMBER);
				setState(771);
				match(RIGHTP);
				}
				break;
			case GAMMADISTRIBUTION:
				enterOuterAlt(_localctx, 6);
				{
				setState(772);
				match(GAMMADISTRIBUTION);
				setState(773);
				match(LEFTP);
				setState(774);
				match(REALNUMBER);
				setState(776);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(775);
					match(COMMA);
					}
				}

				setState(778);
				match(REALNUMBER);
				setState(779);
				match(RIGHTP);
				setState(780);
				match(DENSITY);
				setState(781);
				match(LEFTP);
				setState(782);
				match(REALNUMBER);
				setState(783);
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
	public static class MomentumGenerationFunctionContext extends ParserRuleContext {
		public TerminalNode NORMALDISTRIBUTION() { return getToken(StarParser.NORMALDISTRIBUTION, 0); }
		public List<TerminalNode> LEFTP() { return getTokens(StarParser.LEFTP); }
		public TerminalNode LEFTP(int i) {
			return getToken(StarParser.LEFTP, i);
		}
		public List<TerminalNode> REALNUMBER() { return getTokens(StarParser.REALNUMBER); }
		public TerminalNode REALNUMBER(int i) {
			return getToken(StarParser.REALNUMBER, i);
		}
		public List<TerminalNode> RIGHTP() { return getTokens(StarParser.RIGHTP); }
		public TerminalNode RIGHTP(int i) {
			return getToken(StarParser.RIGHTP, i);
		}
		public TerminalNode MGF() { return getToken(StarParser.MGF, 0); }
		public TerminalNode COMMA() { return getToken(StarParser.COMMA, 0); }
		public TerminalNode TDISTRIBUTION() { return getToken(StarParser.TDISTRIBUTION, 0); }
		public TerminalNode INTEGER() { return getToken(StarParser.INTEGER, 0); }
		public TerminalNode POISSONDISTRIBUTION() { return getToken(StarParser.POISSONDISTRIBUTION, 0); }
		public TerminalNode CHISQUAREDDISTRIBUTION() { return getToken(StarParser.CHISQUAREDDISTRIBUTION, 0); }
		public TerminalNode GEOMETRICDISTRIBUTION() { return getToken(StarParser.GEOMETRICDISTRIBUTION, 0); }
		public TerminalNode GAMMADISTRIBUTION() { return getToken(StarParser.GAMMADISTRIBUTION, 0); }
		public MomentumGenerationFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_momentumGenerationFunction; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StarVisitor ) return ((StarVisitor<? extends T>)visitor).visitMomentumGenerationFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MomentumGenerationFunctionContext momentumGenerationFunction() throws RecognitionException {
		MomentumGenerationFunctionContext _localctx = new MomentumGenerationFunctionContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_momentumGenerationFunction);
		int _la;
		try {
			setState(842);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NORMALDISTRIBUTION:
				enterOuterAlt(_localctx, 1);
				{
				setState(786);
				match(NORMALDISTRIBUTION);
				setState(787);
				match(LEFTP);
				setState(788);
				match(REALNUMBER);
				setState(790);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(789);
					match(COMMA);
					}
				}

				setState(792);
				match(REALNUMBER);
				setState(793);
				match(RIGHTP);
				setState(794);
				match(MGF);
				setState(795);
				match(LEFTP);
				setState(796);
				match(REALNUMBER);
				setState(797);
				match(RIGHTP);
				}
				break;
			case TDISTRIBUTION:
				enterOuterAlt(_localctx, 2);
				{
				setState(798);
				match(TDISTRIBUTION);
				setState(799);
				match(LEFTP);
				setState(800);
				match(INTEGER);
				setState(801);
				match(RIGHTP);
				setState(802);
				match(MGF);
				setState(803);
				match(LEFTP);
				setState(804);
				match(REALNUMBER);
				setState(805);
				match(RIGHTP);
				}
				break;
			case POISSONDISTRIBUTION:
				enterOuterAlt(_localctx, 3);
				{
				setState(806);
				match(POISSONDISTRIBUTION);
				setState(807);
				match(LEFTP);
				setState(808);
				match(REALNUMBER);
				setState(809);
				match(RIGHTP);
				setState(810);
				match(MGF);
				setState(811);
				match(LEFTP);
				setState(812);
				match(REALNUMBER);
				setState(813);
				match(RIGHTP);
				}
				break;
			case CHISQUAREDDISTRIBUTION:
				enterOuterAlt(_localctx, 4);
				{
				setState(814);
				match(CHISQUAREDDISTRIBUTION);
				setState(815);
				match(LEFTP);
				setState(816);
				match(INTEGER);
				setState(817);
				match(RIGHTP);
				setState(818);
				match(MGF);
				setState(819);
				match(LEFTP);
				setState(820);
				match(REALNUMBER);
				setState(821);
				match(RIGHTP);
				}
				break;
			case GEOMETRICDISTRIBUTION:
				enterOuterAlt(_localctx, 5);
				{
				setState(822);
				match(GEOMETRICDISTRIBUTION);
				setState(823);
				match(LEFTP);
				setState(824);
				match(REALNUMBER);
				setState(825);
				match(RIGHTP);
				setState(826);
				match(MGF);
				setState(827);
				match(LEFTP);
				setState(828);
				match(REALNUMBER);
				setState(829);
				match(RIGHTP);
				}
				break;
			case GAMMADISTRIBUTION:
				enterOuterAlt(_localctx, 6);
				{
				setState(830);
				match(GAMMADISTRIBUTION);
				setState(831);
				match(LEFTP);
				setState(832);
				match(REALNUMBER);
				setState(834);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(833);
					match(COMMA);
					}
				}

				setState(836);
				match(REALNUMBER);
				setState(837);
				match(RIGHTP);
				setState(838);
				match(MGF);
				setState(839);
				match(LEFTP);
				setState(840);
				match(REALNUMBER);
				setState(841);
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
	public static class DistributionFunctionContext extends ParserRuleContext {
		public TerminalNode NORMALDISTRIBUTION() { return getToken(StarParser.NORMALDISTRIBUTION, 0); }
		public List<TerminalNode> LEFTP() { return getTokens(StarParser.LEFTP); }
		public TerminalNode LEFTP(int i) {
			return getToken(StarParser.LEFTP, i);
		}
		public List<TerminalNode> REALNUMBER() { return getTokens(StarParser.REALNUMBER); }
		public TerminalNode REALNUMBER(int i) {
			return getToken(StarParser.REALNUMBER, i);
		}
		public List<TerminalNode> RIGHTP() { return getTokens(StarParser.RIGHTP); }
		public TerminalNode RIGHTP(int i) {
			return getToken(StarParser.RIGHTP, i);
		}
		public TerminalNode DISTRIBUTION() { return getToken(StarParser.DISTRIBUTION, 0); }
		public TerminalNode COMMA() { return getToken(StarParser.COMMA, 0); }
		public TerminalNode TDISTRIBUTION() { return getToken(StarParser.TDISTRIBUTION, 0); }
		public TerminalNode INTEGER() { return getToken(StarParser.INTEGER, 0); }
		public TerminalNode POISSONDISTRIBUTION() { return getToken(StarParser.POISSONDISTRIBUTION, 0); }
		public TerminalNode CHISQUAREDDISTRIBUTION() { return getToken(StarParser.CHISQUAREDDISTRIBUTION, 0); }
		public TerminalNode GEOMETRICDISTRIBUTION() { return getToken(StarParser.GEOMETRICDISTRIBUTION, 0); }
		public TerminalNode GAMMADISTRIBUTION() { return getToken(StarParser.GAMMADISTRIBUTION, 0); }
		public DistributionFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_distributionFunction; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StarVisitor ) return ((StarVisitor<? extends T>)visitor).visitDistributionFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DistributionFunctionContext distributionFunction() throws RecognitionException {
		DistributionFunctionContext _localctx = new DistributionFunctionContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_distributionFunction);
		int _la;
		try {
			setState(900);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NORMALDISTRIBUTION:
				enterOuterAlt(_localctx, 1);
				{
				setState(844);
				match(NORMALDISTRIBUTION);
				setState(845);
				match(LEFTP);
				setState(846);
				match(REALNUMBER);
				setState(848);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(847);
					match(COMMA);
					}
				}

				setState(850);
				match(REALNUMBER);
				setState(851);
				match(RIGHTP);
				setState(852);
				match(DISTRIBUTION);
				setState(853);
				match(LEFTP);
				setState(854);
				match(REALNUMBER);
				setState(855);
				match(RIGHTP);
				}
				break;
			case TDISTRIBUTION:
				enterOuterAlt(_localctx, 2);
				{
				setState(856);
				match(TDISTRIBUTION);
				setState(857);
				match(LEFTP);
				setState(858);
				match(INTEGER);
				setState(859);
				match(RIGHTP);
				setState(860);
				match(DISTRIBUTION);
				setState(861);
				match(LEFTP);
				setState(862);
				match(REALNUMBER);
				setState(863);
				match(RIGHTP);
				}
				break;
			case POISSONDISTRIBUTION:
				enterOuterAlt(_localctx, 3);
				{
				setState(864);
				match(POISSONDISTRIBUTION);
				setState(865);
				match(LEFTP);
				setState(866);
				match(REALNUMBER);
				setState(867);
				match(RIGHTP);
				setState(868);
				match(DISTRIBUTION);
				setState(869);
				match(LEFTP);
				setState(870);
				match(INTEGER);
				setState(871);
				match(RIGHTP);
				}
				break;
			case CHISQUAREDDISTRIBUTION:
				enterOuterAlt(_localctx, 4);
				{
				setState(872);
				match(CHISQUAREDDISTRIBUTION);
				setState(873);
				match(LEFTP);
				setState(874);
				match(INTEGER);
				setState(875);
				match(RIGHTP);
				setState(876);
				match(DISTRIBUTION);
				setState(877);
				match(LEFTP);
				setState(878);
				match(REALNUMBER);
				setState(879);
				match(RIGHTP);
				}
				break;
			case GEOMETRICDISTRIBUTION:
				enterOuterAlt(_localctx, 5);
				{
				setState(880);
				match(GEOMETRICDISTRIBUTION);
				setState(881);
				match(LEFTP);
				setState(882);
				match(REALNUMBER);
				setState(883);
				match(RIGHTP);
				setState(884);
				match(DISTRIBUTION);
				setState(885);
				match(LEFTP);
				setState(886);
				match(INTEGER);
				setState(887);
				match(RIGHTP);
				}
				break;
			case GAMMADISTRIBUTION:
				enterOuterAlt(_localctx, 6);
				{
				setState(888);
				match(GAMMADISTRIBUTION);
				setState(889);
				match(LEFTP);
				setState(890);
				match(REALNUMBER);
				setState(892);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(891);
					match(COMMA);
					}
				}

				setState(894);
				match(REALNUMBER);
				setState(895);
				match(RIGHTP);
				setState(896);
				match(DISTRIBUTION);
				setState(897);
				match(LEFTP);
				setState(898);
				match(REALNUMBER);
				setState(899);
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
	public static class PercentilFunctionContext extends ParserRuleContext {
		public TerminalNode NORMALDISTRIBUTION() { return getToken(StarParser.NORMALDISTRIBUTION, 0); }
		public List<TerminalNode> LEFTP() { return getTokens(StarParser.LEFTP); }
		public TerminalNode LEFTP(int i) {
			return getToken(StarParser.LEFTP, i);
		}
		public List<TerminalNode> REALNUMBER() { return getTokens(StarParser.REALNUMBER); }
		public TerminalNode REALNUMBER(int i) {
			return getToken(StarParser.REALNUMBER, i);
		}
		public List<TerminalNode> RIGHTP() { return getTokens(StarParser.RIGHTP); }
		public TerminalNode RIGHTP(int i) {
			return getToken(StarParser.RIGHTP, i);
		}
		public TerminalNode PERCENTIL() { return getToken(StarParser.PERCENTIL, 0); }
		public TerminalNode COMMA() { return getToken(StarParser.COMMA, 0); }
		public TerminalNode TDISTRIBUTION() { return getToken(StarParser.TDISTRIBUTION, 0); }
		public TerminalNode INTEGER() { return getToken(StarParser.INTEGER, 0); }
		public TerminalNode POISSONDISTRIBUTION() { return getToken(StarParser.POISSONDISTRIBUTION, 0); }
		public TerminalNode CHISQUAREDDISTRIBUTION() { return getToken(StarParser.CHISQUAREDDISTRIBUTION, 0); }
		public TerminalNode GEOMETRICDISTRIBUTION() { return getToken(StarParser.GEOMETRICDISTRIBUTION, 0); }
		public TerminalNode GAMMADISTRIBUTION() { return getToken(StarParser.GAMMADISTRIBUTION, 0); }
		public PercentilFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_percentilFunction; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StarVisitor ) return ((StarVisitor<? extends T>)visitor).visitPercentilFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PercentilFunctionContext percentilFunction() throws RecognitionException {
		PercentilFunctionContext _localctx = new PercentilFunctionContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_percentilFunction);
		int _la;
		try {
			setState(958);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NORMALDISTRIBUTION:
				enterOuterAlt(_localctx, 1);
				{
				setState(902);
				match(NORMALDISTRIBUTION);
				setState(903);
				match(LEFTP);
				setState(904);
				match(REALNUMBER);
				setState(906);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(905);
					match(COMMA);
					}
				}

				setState(908);
				match(REALNUMBER);
				setState(909);
				match(RIGHTP);
				setState(910);
				match(PERCENTIL);
				setState(911);
				match(LEFTP);
				setState(912);
				match(REALNUMBER);
				setState(913);
				match(RIGHTP);
				}
				break;
			case TDISTRIBUTION:
				enterOuterAlt(_localctx, 2);
				{
				setState(914);
				match(TDISTRIBUTION);
				setState(915);
				match(LEFTP);
				setState(916);
				match(INTEGER);
				setState(917);
				match(RIGHTP);
				setState(918);
				match(PERCENTIL);
				setState(919);
				match(LEFTP);
				setState(920);
				match(REALNUMBER);
				setState(921);
				match(RIGHTP);
				}
				break;
			case POISSONDISTRIBUTION:
				enterOuterAlt(_localctx, 3);
				{
				setState(922);
				match(POISSONDISTRIBUTION);
				setState(923);
				match(LEFTP);
				setState(924);
				match(REALNUMBER);
				setState(925);
				match(RIGHTP);
				setState(926);
				match(PERCENTIL);
				setState(927);
				match(LEFTP);
				setState(928);
				match(REALNUMBER);
				setState(929);
				match(RIGHTP);
				}
				break;
			case CHISQUAREDDISTRIBUTION:
				enterOuterAlt(_localctx, 4);
				{
				setState(930);
				match(CHISQUAREDDISTRIBUTION);
				setState(931);
				match(LEFTP);
				setState(932);
				match(INTEGER);
				setState(933);
				match(RIGHTP);
				setState(934);
				match(PERCENTIL);
				setState(935);
				match(LEFTP);
				setState(936);
				match(REALNUMBER);
				setState(937);
				match(RIGHTP);
				}
				break;
			case GEOMETRICDISTRIBUTION:
				enterOuterAlt(_localctx, 5);
				{
				setState(938);
				match(GEOMETRICDISTRIBUTION);
				setState(939);
				match(LEFTP);
				setState(940);
				match(REALNUMBER);
				setState(941);
				match(RIGHTP);
				setState(942);
				match(PERCENTIL);
				setState(943);
				match(LEFTP);
				setState(944);
				match(REALNUMBER);
				setState(945);
				match(RIGHTP);
				}
				break;
			case GAMMADISTRIBUTION:
				enterOuterAlt(_localctx, 6);
				{
				setState(946);
				match(GAMMADISTRIBUTION);
				setState(947);
				match(LEFTP);
				setState(948);
				match(REALNUMBER);
				setState(950);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(949);
					match(COMMA);
					}
				}

				setState(952);
				match(REALNUMBER);
				setState(953);
				match(RIGHTP);
				setState(954);
				match(PERCENTIL);
				setState(955);
				match(LEFTP);
				setState(956);
				match(REALNUMBER);
				setState(957);
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
		enterRule(_localctx, 76, RULE_randomFunction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(960);
			match(RANDOM);
			setState(961);
			match(LEFTP);
			setState(962);
			match(REALNUMBER);
			setState(963);
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
		enterRule(_localctx, 78, RULE_logFunction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(965);
			match(LN);
			setState(966);
			match(LEFTP);
			setState(967);
			algexpr(0);
			setState(968);
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
		enterRule(_localctx, 80, RULE_usefunction);
		int _la;
		try {
			setState(988);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,89,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(970);
				match(ID);
				setState(971);
				match(LEFTP);
				setState(976); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(972);
					algexpr(0);
					setState(974);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==COMMA) {
						{
						setState(973);
						match(COMMA);
						}
					}

					}
					}
					setState(978); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 70238011916288L) != 0) || ((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & 3593L) != 0) );
				setState(980);
				match(RIGHTP);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(982);
				match(ID);
				setState(983);
				match(LEFTP);
				setState(984);
				idlist();
				setState(985);
				match(RIGHTP);
				setState(986);
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
		int _startState = 82;
		enterRecursionRule(_localctx, 82, RULE_algexpr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1006);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,91,_ctx) ) {
			case 1:
				{
				_localctx = new NegationContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(991);
				match(SUBS);
				setState(992);
				algexpr(6);
				}
				break;
			case 2:
				{
				_localctx = new NumberContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(993);
				match(REALNUMBER);
				}
				break;
			case 3:
				{
				_localctx = new ENTContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(994);
				match(INTEGER);
				}
				break;
			case 4:
				{
				_localctx = new TrigfContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(995);
				function();
				}
				break;
			case 5:
				{
				_localctx = new ParenthesisContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(996);
				match(LEFTP);
				setState(997);
				algexpr(0);
				setState(998);
				match(RIGHTP);
				}
				break;
			case 6:
				{
				_localctx = new IdContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1000);
				match(ID);
				setState(1004);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,90,_ctx) ) {
				case 1:
					{
					setState(1001);
					match(T__1);
					setState(1002);
					match(INTEGER);
					setState(1003);
					match(T__2);
					}
					break;
				}
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1022);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,93,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1020);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,92,_ctx) ) {
					case 1:
						{
						_localctx = new PowerRootContext(new AlgexprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_algexpr);
						setState(1008);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(1009);
						match(POWER);
						setState(1010);
						algexpr(11);
						}
						break;
					case 2:
						{
						_localctx = new MulDivContext(new AlgexprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_algexpr);
						setState(1011);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(1012);
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
						setState(1013);
						algexpr(10);
						}
						break;
					case 3:
						{
						_localctx = new AddSubContext(new AlgexprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_algexpr);
						setState(1014);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(1015);
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
						setState(1016);
						algexpr(9);
						}
						break;
					case 4:
						{
						_localctx = new MdContext(new AlgexprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_algexpr);
						setState(1017);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(1018);
						match(MOD);
						setState(1019);
						algexpr(8);
						}
						break;
					}
					} 
				}
				setState(1024);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,93,_ctx);
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
		case 41:
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
		"\u0004\u0001X\u0402\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0002"+
		"(\u0007(\u0002)\u0007)\u0001\u0000\u0004\u0000V\b\u0000\u000b\u0000\f"+
		"\u0000W\u0001\u0001\u0001\u0001\u0003\u0001\\\b\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0003\u0001a\b\u0001\u0001\u0001\u0001\u0001\u0003"+
		"\u0001e\b\u0001\u0001\u0001\u0001\u0001\u0003\u0001i\b\u0001\u0001\u0001"+
		"\u0001\u0001\u0003\u0001m\b\u0001\u0001\u0001\u0001\u0001\u0003\u0001"+
		"q\b\u0001\u0001\u0001\u0001\u0001\u0003\u0001u\b\u0001\u0001\u0001\u0001"+
		"\u0001\u0003\u0001y\b\u0001\u0001\u0001\u0001\u0001\u0003\u0001}\b\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001\u0082\b\u0001\u0001\u0001"+
		"\u0001\u0001\u0003\u0001\u0086\b\u0001\u0001\u0001\u0001\u0001\u0003\u0001"+
		"\u008a\b\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001\u008f\b"+
		"\u0001\u0001\u0001\u0001\u0001\u0003\u0001\u0093\b\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0003\u0001\u0099\b\u0001\u0001\u0001\u0001"+
		"\u0001\u0003\u0001\u009d\b\u0001\u0001\u0001\u0001\u0001\u0003\u0001\u00a1"+
		"\b\u0001\u0001\u0001\u0003\u0001\u00a4\b\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0005\u0002\u00a9\b\u0002\n\u0002\f\u0002\u00ac\t\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0003\u0003\u00b5\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0003\u0004\u00bd\b\u0004\u0001\u0004\u0001"+
		"\u0004\u0003\u0004\u00c1\b\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0003\u0005\u00d4\b\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u00dc\b\u0006\u0001"+
		"\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0003\t\u00e8\b\t\u0001\t\u0001\t\u0003\t\u00ec\b\t\u0001\t"+
		"\u0003\t\u00ef\b\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0003\n\u00f9\b\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u0107\b\n\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0003\u000b\u0110\b\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0005"+
		"\r\u011e\b\r\n\r\f\r\u0121\t\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0005\u000e\u0129\b\u000e\n\u000e\f\u000e"+
		"\u012c\t\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u013c\b\u000f\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0003\u0010\u0147\b\u0010\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0004\u0011\u016f\b\u0011\u000b\u0011\f\u0011\u0170\u0001\u0011\u0001"+
		"\u0011\u0003\u0011\u0175\b\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0003\u0012\u017b\b\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u0184\b\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0003\u0012\u018d\b\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u0195\b\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u01a1\b\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003"+
		"\u0012\u01aa\b\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0004\u0012\u01b5"+
		"\b\u0012\u000b\u0012\f\u0012\u01b6\u0001\u0012\u0003\u0012\u01ba\b\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u01bf\b\u0012\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u01c6\b\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0003\u0013\u01cf\b\u0013\u0001\u0013\u0003\u0013\u01d2\b"+
		"\u0013\u0001\u0014\u0001\u0014\u0003\u0014\u01d6\b\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0003\u0014\u01db\b\u0014\u0005\u0014\u01dd\b\u0014"+
		"\n\u0014\f\u0014\u01e0\t\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0003\u0015\u01e7\b\u0015\u0004\u0015\u01e9\b\u0015"+
		"\u000b\u0015\f\u0015\u01ea\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015"+
		"\u01f0\b\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u01f5\b"+
		"\u0016\u0004\u0016\u01f7\b\u0016\u000b\u0016\f\u0016\u01f8\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u01ff\b\u0016\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0003\u0017\u0210\b\u0017\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0003\u0018\u0215\b\u0018\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0003\u0019\u021b\b\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0003\u0019\u0229\b\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0003\u0019\u0232\b\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0003\u0019\u023b\b\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0003\u0019\u0240\b\u0019\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0003\u001a\u0245\b\u001a\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0003\u001b\u0262\b\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0003\u001c"+
		"\u0291\b\u001c\u0001\u001d\u0001\u001d\u0003\u001d\u0295\b\u001d\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0003\u001e\u029a\b\u001e\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0003\u001f\u02a1\b\u001f\u0001"+
		" \u0001 \u0001 \u0001 \u0001 \u0003 \u02a8\b \u0001 \u0001 \u0003 \u02ac"+
		"\b \u0001 \u0001 \u0003 \u02b0\b \u0001 \u0001 \u0001 \u0001!\u0001!\u0001"+
		"!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001"+
		"!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001"+
		"!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001"+
		"!\u0001!\u0003!\u02d7\b!\u0001\"\u0001\"\u0001\"\u0001\"\u0003\"\u02dd"+
		"\b\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001"+
		"\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001"+
		"\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001"+
		"\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001"+
		"\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0003\"\u0309\b\"\u0001"+
		"\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0003\"\u0311\b\"\u0001#\u0001"+
		"#\u0001#\u0001#\u0003#\u0317\b#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001"+
		"#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001"+
		"#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001"+
		"#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001"+
		"#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0003#\u0343\b#\u0001#\u0001"+
		"#\u0001#\u0001#\u0001#\u0001#\u0003#\u034b\b#\u0001$\u0001$\u0001$\u0001"+
		"$\u0003$\u0351\b$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001"+
		"$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001"+
		"$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001"+
		"$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001"+
		"$\u0001$\u0001$\u0001$\u0001$\u0003$\u037d\b$\u0001$\u0001$\u0001$\u0001"+
		"$\u0001$\u0001$\u0003$\u0385\b$\u0001%\u0001%\u0001%\u0001%\u0003%\u038b"+
		"\b%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001"+
		"%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001"+
		"%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001"+
		"%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001"+
		"%\u0001%\u0001%\u0003%\u03b7\b%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001"+
		"%\u0003%\u03bf\b%\u0001&\u0001&\u0001&\u0001&\u0001&\u0001\'\u0001\'\u0001"+
		"\'\u0001\'\u0001\'\u0001(\u0001(\u0001(\u0001(\u0003(\u03cf\b(\u0004("+
		"\u03d1\b(\u000b(\f(\u03d2\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001"+
		"(\u0001(\u0003(\u03dd\b(\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001"+
		")\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0003)\u03ed\b)\u0003"+
		")\u03ef\b)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001"+
		")\u0001)\u0001)\u0001)\u0005)\u03fd\b)\n)\f)\u0400\t)\u0001)\u0000\u0003"+
		"\u001a\u001cR*\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016"+
		"\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPR\u0000\u0003\u0001"+
		"\u00009>\u0002\u0000KKMM\u0002\u0000JJLL\u049b\u0000U\u0001\u0000\u0000"+
		"\u0000\u0002\u00a3\u0001\u0000\u0000\u0000\u0004\u00a5\u0001\u0000\u0000"+
		"\u0000\u0006\u00b4\u0001\u0000\u0000\u0000\b\u00b6\u0001\u0000\u0000\u0000"+
		"\n\u00d3\u0001\u0000\u0000\u0000\f\u00db\u0001\u0000\u0000\u0000\u000e"+
		"\u00dd\u0001\u0000\u0000\u0000\u0010\u00df\u0001\u0000\u0000\u0000\u0012"+
		"\u00e3\u0001\u0000\u0000\u0000\u0014\u0106\u0001\u0000\u0000\u0000\u0016"+
		"\u0108\u0001\u0000\u0000\u0000\u0018\u0113\u0001\u0000\u0000\u0000\u001a"+
		"\u0117\u0001\u0000\u0000\u0000\u001c\u0122\u0001\u0000\u0000\u0000\u001e"+
		"\u013b\u0001\u0000\u0000\u0000 \u0146\u0001\u0000\u0000\u0000\"\u0174"+
		"\u0001\u0000\u0000\u0000$\u01be\u0001\u0000\u0000\u0000&\u01d1\u0001\u0000"+
		"\u0000\u0000(\u01d3\u0001\u0000\u0000\u0000*\u01ef\u0001\u0000\u0000\u0000"+
		",\u01fe\u0001\u0000\u0000\u0000.\u020f\u0001\u0000\u0000\u00000\u0214"+
		"\u0001\u0000\u0000\u00002\u023f\u0001\u0000\u0000\u00004\u0244\u0001\u0000"+
		"\u0000\u00006\u0261\u0001\u0000\u0000\u00008\u0290\u0001\u0000\u0000\u0000"+
		":\u0294\u0001\u0000\u0000\u0000<\u0299\u0001\u0000\u0000\u0000>\u02a0"+
		"\u0001\u0000\u0000\u0000@\u02a2\u0001\u0000\u0000\u0000B\u02d6\u0001\u0000"+
		"\u0000\u0000D\u0310\u0001\u0000\u0000\u0000F\u034a\u0001\u0000\u0000\u0000"+
		"H\u0384\u0001\u0000\u0000\u0000J\u03be\u0001\u0000\u0000\u0000L\u03c0"+
		"\u0001\u0000\u0000\u0000N\u03c5\u0001\u0000\u0000\u0000P\u03dc\u0001\u0000"+
		"\u0000\u0000R\u03ee\u0001\u0000\u0000\u0000TV\u0003\u0002\u0001\u0000"+
		"UT\u0001\u0000\u0000\u0000VW\u0001\u0000\u0000\u0000WU\u0001\u0000\u0000"+
		"\u0000WX\u0001\u0000\u0000\u0000X\u0001\u0001\u0000\u0000\u0000Y[\u0003"+
		">\u001f\u0000Z\\\u0005X\u0000\u0000[Z\u0001\u0000\u0000\u0000[\\\u0001"+
		"\u0000\u0000\u0000\\\u00a4\u0001\u0000\u0000\u0000]\u00a4\u0003\b\u0004"+
		"\u0000^`\u0003P(\u0000_a\u0005X\u0000\u0000`_\u0001\u0000\u0000\u0000"+
		"`a\u0001\u0000\u0000\u0000a\u00a4\u0001\u0000\u0000\u0000bd\u00032\u0019"+
		"\u0000ce\u0005X\u0000\u0000dc\u0001\u0000\u0000\u0000de\u0001\u0000\u0000"+
		"\u0000e\u00a4\u0001\u0000\u0000\u0000fh\u00034\u001a\u0000gi\u0005X\u0000"+
		"\u0000hg\u0001\u0000\u0000\u0000hi\u0001\u0000\u0000\u0000i\u00a4\u0001"+
		"\u0000\u0000\u0000jl\u0003@ \u0000km\u0005X\u0000\u0000lk\u0001\u0000"+
		"\u0000\u0000lm\u0001\u0000\u0000\u0000m\u00a4\u0001\u0000\u0000\u0000"+
		"np\u0003B!\u0000oq\u0005X\u0000\u0000po\u0001\u0000\u0000\u0000pq\u0001"+
		"\u0000\u0000\u0000q\u00a4\u0001\u0000\u0000\u0000rt\u00036\u001b\u0000"+
		"su\u0005X\u0000\u0000ts\u0001\u0000\u0000\u0000tu\u0001\u0000\u0000\u0000"+
		"u\u00a4\u0001\u0000\u0000\u0000vx\u0003R)\u0000wy\u0005X\u0000\u0000x"+
		"w\u0001\u0000\u0000\u0000xy\u0001\u0000\u0000\u0000y\u00a4\u0001\u0000"+
		"\u0000\u0000z|\u0003.\u0017\u0000{}\u0005X\u0000\u0000|{\u0001\u0000\u0000"+
		"\u0000|}\u0001\u0000\u0000\u0000}\u00a4\u0001\u0000\u0000\u0000~\u00a4"+
		"\u0003\u001a\r\u0000\u007f\u0081\u0003\u0010\b\u0000\u0080\u0082\u0005"+
		"X\u0000\u0000\u0081\u0080\u0001\u0000\u0000\u0000\u0081\u0082\u0001\u0000"+
		"\u0000\u0000\u0082\u00a4\u0001\u0000\u0000\u0000\u0083\u0085\u0003\u0012"+
		"\t\u0000\u0084\u0086\u0005X\u0000\u0000\u0085\u0084\u0001\u0000\u0000"+
		"\u0000\u0085\u0086\u0001\u0000\u0000\u0000\u0086\u00a4\u0001\u0000\u0000"+
		"\u0000\u0087\u0089\u0003\u0014\n\u0000\u0088\u008a\u0005X\u0000\u0000"+
		"\u0089\u0088\u0001\u0000\u0000\u0000\u0089\u008a\u0001\u0000\u0000\u0000"+
		"\u008a\u00a4\u0001\u0000\u0000\u0000\u008b\u00a4\u0003\u0018\f\u0000\u008c"+
		"\u008e\u0003\"\u0011\u0000\u008d\u008f\u0005X\u0000\u0000\u008e\u008d"+
		"\u0001\u0000\u0000\u0000\u008e\u008f\u0001\u0000\u0000\u0000\u008f\u00a4"+
		"\u0001\u0000\u0000\u0000\u0090\u0092\u0003$\u0012\u0000\u0091\u0093\u0005"+
		"X\u0000\u0000\u0092\u0091\u0001\u0000\u0000\u0000\u0092\u0093\u0001\u0000"+
		"\u0000\u0000\u0093\u00a4\u0001\u0000\u0000\u0000\u0094\u00a4\u0003 \u0010"+
		"\u0000\u0095\u00a4\u0003&\u0013\u0000\u0096\u0098\u0003\u0016\u000b\u0000"+
		"\u0097\u0099\u0005X\u0000\u0000\u0098\u0097\u0001\u0000\u0000\u0000\u0098"+
		"\u0099\u0001\u0000\u0000\u0000\u0099\u00a4\u0001\u0000\u0000\u0000\u009a"+
		"\u009c\u0003\f\u0006\u0000\u009b\u009d\u0005X\u0000\u0000\u009c\u009b"+
		"\u0001\u0000\u0000\u0000\u009c\u009d\u0001\u0000\u0000\u0000\u009d\u00a4"+
		"\u0001\u0000\u0000\u0000\u009e\u00a0\u00038\u001c\u0000\u009f\u00a1\u0005"+
		"X\u0000\u0000\u00a0\u009f\u0001\u0000\u0000\u0000\u00a0\u00a1\u0001\u0000"+
		"\u0000\u0000\u00a1\u00a4\u0001\u0000\u0000\u0000\u00a2\u00a4\u0005X\u0000"+
		"\u0000\u00a3Y\u0001\u0000\u0000\u0000\u00a3]\u0001\u0000\u0000\u0000\u00a3"+
		"^\u0001\u0000\u0000\u0000\u00a3b\u0001\u0000\u0000\u0000\u00a3f\u0001"+
		"\u0000\u0000\u0000\u00a3j\u0001\u0000\u0000\u0000\u00a3n\u0001\u0000\u0000"+
		"\u0000\u00a3r\u0001\u0000\u0000\u0000\u00a3v\u0001\u0000\u0000\u0000\u00a3"+
		"z\u0001\u0000\u0000\u0000\u00a3~\u0001\u0000\u0000\u0000\u00a3\u007f\u0001"+
		"\u0000\u0000\u0000\u00a3\u0083\u0001\u0000\u0000\u0000\u00a3\u0087\u0001"+
		"\u0000\u0000\u0000\u00a3\u008b\u0001\u0000\u0000\u0000\u00a3\u008c\u0001"+
		"\u0000\u0000\u0000\u00a3\u0090\u0001\u0000\u0000\u0000\u00a3\u0094\u0001"+
		"\u0000\u0000\u0000\u00a3\u0095\u0001\u0000\u0000\u0000\u00a3\u0096\u0001"+
		"\u0000\u0000\u0000\u00a3\u009a\u0001\u0000\u0000\u0000\u00a3\u009e\u0001"+
		"\u0000\u0000\u0000\u00a3\u00a2\u0001\u0000\u0000\u0000\u00a4\u0003\u0001"+
		"\u0000\u0000\u0000\u00a5\u00aa\u0005U\u0000\u0000\u00a6\u00a7\u0005Q\u0000"+
		"\u0000\u00a7\u00a9\u0005U\u0000\u0000\u00a8\u00a6\u0001\u0000\u0000\u0000"+
		"\u00a9\u00ac\u0001\u0000\u0000\u0000\u00aa\u00a8\u0001\u0000\u0000\u0000"+
		"\u00aa\u00ab\u0001\u0000\u0000\u0000\u00ab\u0005\u0001\u0000\u0000\u0000"+
		"\u00ac\u00aa\u0001\u0000\u0000\u0000\u00ad\u00b5\u00053\u0000\u0000\u00ae"+
		"\u00b5\u00054\u0000\u0000\u00af\u00b5\u00055\u0000\u0000\u00b0\u00b5\u0005"+
		"7\u0000\u0000\u00b1\u00b5\u00056\u0000\u0000\u00b2\u00b5\u00052\u0000"+
		"\u0000\u00b3\u00b5\u00058\u0000\u0000\u00b4\u00ad\u0001\u0000\u0000\u0000"+
		"\u00b4\u00ae\u0001\u0000\u0000\u0000\u00b4\u00af\u0001\u0000\u0000\u0000"+
		"\u00b4\u00b0\u0001\u0000\u0000\u0000\u00b4\u00b1\u0001\u0000\u0000\u0000"+
		"\u00b4\u00b2\u0001\u0000\u0000\u0000\u00b4\u00b3\u0001\u0000\u0000\u0000"+
		"\u00b5\u0007\u0001\u0000\u0000\u0000\u00b6\u00b7\u0005G\u0000\u0000\u00b7"+
		"\u00bc\u0005U\u0000\u0000\u00b8\u00b9\u0005O\u0000\u0000\u00b9\u00ba\u0003"+
		"\u0004\u0002\u0000\u00ba\u00bb\u0005P\u0000\u0000\u00bb\u00bd\u0001\u0000"+
		"\u0000\u0000\u00bc\u00b8\u0001\u0000\u0000\u0000\u00bc\u00bd\u0001\u0000"+
		"\u0000\u0000\u00bd\u00be\u0001\u0000\u0000\u0000\u00be\u00c0\u0005S\u0000"+
		"\u0000\u00bf\u00c1\u0005X\u0000\u0000\u00c0\u00bf\u0001\u0000\u0000\u0000"+
		"\u00c0\u00c1\u0001\u0000\u0000\u0000\u00c1\u00c2\u0001\u0000\u0000\u0000"+
		"\u00c2\u00c3\u0003\n\u0005\u0000\u00c3\u00c4\u0005R\u0000\u0000\u00c4"+
		"\t\u0001\u0000\u0000\u0000\u00c5\u00d4\u0003(\u0014\u0000\u00c6\u00d4"+
		"\u0003 \u0010\u0000\u00c7\u00d4\u0003&\u0013\u0000\u00c8\u00d4\u0003\""+
		"\u0011\u0000\u00c9\u00d4\u0003$\u0012\u0000\u00ca\u00d4\u0003\u0010\b"+
		"\u0000\u00cb\u00d4\u0003\u0012\t\u0000\u00cc\u00d4\u0003\u0014\n\u0000"+
		"\u00cd\u00d4\u0003\u0016\u000b\u0000\u00ce\u00d4\u0003P(\u0000\u00cf\u00d4"+
		"\u0003.\u0017\u0000\u00d0\u00d4\u0003\f\u0006\u0000\u00d1\u00d4\u0003"+
		"R)\u0000\u00d2\u00d4\u00032\u0019\u0000\u00d3\u00c5\u0001\u0000\u0000"+
		"\u0000\u00d3\u00c6\u0001\u0000\u0000\u0000\u00d3\u00c7\u0001\u0000\u0000"+
		"\u0000\u00d3\u00c8\u0001\u0000\u0000\u0000\u00d3\u00c9\u0001\u0000\u0000"+
		"\u0000\u00d3\u00ca\u0001\u0000\u0000\u0000\u00d3\u00cb\u0001\u0000\u0000"+
		"\u0000\u00d3\u00cc\u0001\u0000\u0000\u0000\u00d3\u00cd\u0001\u0000\u0000"+
		"\u0000\u00d3\u00ce\u0001\u0000\u0000\u0000\u00d3\u00cf\u0001\u0000\u0000"+
		"\u0000\u00d3\u00d0\u0001\u0000\u0000\u0000\u00d3\u00d1\u0001\u0000\u0000"+
		"\u0000\u00d3\u00d2\u0001\u0000\u0000\u0000\u00d4\u000b\u0001\u0000\u0000"+
		"\u0000\u00d5\u00d6\u00050\u0000\u0000\u00d6\u00dc\u0003\u000e\u0007\u0000"+
		"\u00d7\u00d8\u00050\u0000\u0000\u00d8\u00dc\u0003P(\u0000\u00d9\u00da"+
		"\u00050\u0000\u0000\u00da\u00dc\u0003R)\u0000\u00db\u00d5\u0001\u0000"+
		"\u0000\u0000\u00db\u00d7\u0001\u0000\u0000\u0000\u00db\u00d9\u0001\u0000"+
		"\u0000\u0000\u00dc\r\u0001\u0000\u0000\u0000\u00dd\u00de\u0005\u0001\u0000"+
		"\u0000\u00de\u000f\u0001\u0000\u0000\u0000\u00df\u00e0\u0005F\u0000\u0000"+
		"\u00e0\u00e1\u0003\u001a\r\u0000\u00e1\u00e2\u0003\n\u0005\u0000\u00e2"+
		"\u0011\u0001\u0000\u0000\u0000\u00e3\u00e4\u0005.\u0000\u0000\u00e4\u00e5"+
		"\u0003\u001a\r\u0000\u00e5\u00e7\u0003\n\u0005\u0000\u00e6\u00e8\u0005"+
		"X\u0000\u0000\u00e7\u00e6\u0001\u0000\u0000\u0000\u00e7\u00e8\u0001\u0000"+
		"\u0000\u0000\u00e8\u00ee\u0001\u0000\u0000\u0000\u00e9\u00eb\u0005@\u0000"+
		"\u0000\u00ea\u00ec\u0005X\u0000\u0000\u00eb\u00ea\u0001\u0000\u0000\u0000"+
		"\u00eb\u00ec\u0001\u0000\u0000\u0000\u00ec\u00ed\u0001\u0000\u0000\u0000"+
		"\u00ed\u00ef\u0003\n\u0005\u0000\u00ee\u00e9\u0001\u0000\u0000\u0000\u00ee"+
		"\u00ef\u0001\u0000\u0000\u0000\u00ef\u0013\u0001\u0000\u0000\u0000\u00f0"+
		"\u00f1\u0005?\u0000\u0000\u00f1\u00f2\u0003.\u0017\u0000\u00f2\u00f3\u0005"+
		"\u0001\u0000\u0000\u00f3\u00f4\u0003\u001a\r\u0000\u00f4\u00f5\u0005\u0001"+
		"\u0000\u0000\u00f5\u00f6\u0003.\u0017\u0000\u00f6\u00f8\u0005\u0001\u0000"+
		"\u0000\u00f7\u00f9\u0005X\u0000\u0000\u00f8\u00f7\u0001\u0000\u0000\u0000"+
		"\u00f8\u00f9\u0001\u0000\u0000\u0000\u00f9\u00fa\u0001\u0000\u0000\u0000"+
		"\u00fa\u00fb\u0003\n\u0005\u0000\u00fb\u0107\u0001\u0000\u0000\u0000\u00fc"+
		"\u00fd\u0005?\u0000\u0000\u00fd\u00fe\u0005O\u0000\u0000\u00fe\u00ff\u0003"+
		".\u0017\u0000\u00ff\u0100\u0005\u0001\u0000\u0000\u0100\u0101\u0003\u001a"+
		"\r\u0000\u0101\u0102\u0005\u0001\u0000\u0000\u0102\u0103\u0003.\u0017"+
		"\u0000\u0103\u0104\u0005P\u0000\u0000\u0104\u0105\u0003\n\u0005\u0000"+
		"\u0105\u0107\u0001\u0000\u0000\u0000\u0106\u00f0\u0001\u0000\u0000\u0000"+
		"\u0106\u00fc\u0001\u0000\u0000\u0000\u0107\u0015\u0001\u0000\u0000\u0000"+
		"\u0108\u0109\u0005/\u0000\u0000\u0109\u010a\u0005U\u0000\u0000\u010a\u010b"+
		"\u0005O\u0000\u0000\u010b\u010c\u0003\u0004\u0002\u0000\u010c\u010d\u0005"+
		"P\u0000\u0000\u010d\u010f\u0005S\u0000\u0000\u010e\u0110\u0005X\u0000"+
		"\u0000\u010f\u010e\u0001\u0000\u0000\u0000\u010f\u0110\u0001\u0000\u0000"+
		"\u0000\u0110\u0111\u0001\u0000\u0000\u0000\u0111\u0112\u0003\n\u0005\u0000"+
		"\u0112\u0017\u0001\u0000\u0000\u0000\u0113\u0114\u0003R)\u0000\u0114\u0115"+
		"\u0007\u0000\u0000\u0000\u0115\u0116\u0003R)\u0000\u0116\u0019\u0001\u0000"+
		"\u0000\u0000\u0117\u0118\u0006\r\uffff\uffff\u0000\u0118\u0119\u0003\u001c"+
		"\u000e\u0000\u0119\u011f\u0001\u0000\u0000\u0000\u011a\u011b\n\u0002\u0000"+
		"\u0000\u011b\u011c\u0005E\u0000\u0000\u011c\u011e\u0003\u001c\u000e\u0000"+
		"\u011d\u011a\u0001\u0000\u0000\u0000\u011e\u0121\u0001\u0000\u0000\u0000"+
		"\u011f\u011d\u0001\u0000\u0000\u0000\u011f\u0120\u0001\u0000\u0000\u0000"+
		"\u0120\u001b\u0001\u0000\u0000\u0000\u0121\u011f\u0001\u0000\u0000\u0000"+
		"\u0122\u0123\u0006\u000e\uffff\uffff\u0000\u0123\u0124\u0003\u001e\u000f"+
		"\u0000\u0124\u012a\u0001\u0000\u0000\u0000\u0125\u0126\n\u0002\u0000\u0000"+
		"\u0126\u0127\u0005D\u0000\u0000\u0127\u0129\u0003\u001e\u000f\u0000\u0128"+
		"\u0125\u0001\u0000\u0000\u0000\u0129\u012c\u0001\u0000\u0000\u0000\u012a"+
		"\u0128\u0001\u0000\u0000\u0000\u012a\u012b\u0001\u0000\u0000\u0000\u012b"+
		"\u001d\u0001\u0000\u0000\u0000\u012c\u012a\u0001\u0000\u0000\u0000\u012d"+
		"\u012e\u0005A\u0000\u0000\u012e\u013c\u0003\u001e\u000f\u0000\u012f\u0130"+
		"\u0005O\u0000\u0000\u0130\u0131\u0003\u001a\r\u0000\u0131\u0132\u0005"+
		"P\u0000\u0000\u0132\u013c\u0001\u0000\u0000\u0000\u0133\u013c\u0005U\u0000"+
		"\u0000\u0134\u013c\u0005B\u0000\u0000\u0135\u013c\u0005C\u0000\u0000\u0136"+
		"\u013c\u0003\u0018\f\u0000\u0137\u0138\u0005O\u0000\u0000\u0138\u0139"+
		"\u0003\u0018\f\u0000\u0139\u013a\u0005P\u0000\u0000\u013a\u013c\u0001"+
		"\u0000\u0000\u0000\u013b\u012d\u0001\u0000\u0000\u0000\u013b\u012f\u0001"+
		"\u0000\u0000\u0000\u013b\u0133\u0001\u0000\u0000\u0000\u013b\u0134\u0001"+
		"\u0000\u0000\u0000\u013b\u0135\u0001\u0000\u0000\u0000\u013b\u0136\u0001"+
		"\u0000\u0000\u0000\u013b\u0137\u0001\u0000\u0000\u0000\u013c\u001f\u0001"+
		"\u0000\u0000\u0000\u013d\u013e\u0005H\u0000\u0000\u013e\u013f\u0005O\u0000"+
		"\u0000\u013f\u0140\u0003\u0004\u0002\u0000\u0140\u0141\u0005P\u0000\u0000"+
		"\u0141\u0147\u0001\u0000\u0000\u0000\u0142\u0143\u0005H\u0000\u0000\u0143"+
		"\u0144\u0005O\u0000\u0000\u0144\u0145\u0005T\u0000\u0000\u0145\u0147\u0005"+
		"P\u0000\u0000\u0146\u013d\u0001\u0000\u0000\u0000\u0146\u0142\u0001\u0000"+
		"\u0000\u0000\u0147!\u0001\u0000\u0000\u0000\u0148\u0149\u0005I\u0000\u0000"+
		"\u0149\u014a\u0005O\u0000\u0000\u014a\u014b\u0003\u0004\u0002\u0000\u014b"+
		"\u014c\u0005P\u0000\u0000\u014c\u0175\u0001\u0000\u0000\u0000\u014d\u014e"+
		"\u0005I\u0000\u0000\u014e\u014f\u0005O\u0000\u0000\u014f\u0150\u0003R"+
		")\u0000\u0150\u0151\u0005P\u0000\u0000\u0151\u0175\u0001\u0000\u0000\u0000"+
		"\u0152\u0153\u0005I\u0000\u0000\u0153\u0154\u0005O\u0000\u0000\u0154\u0155"+
		"\u0005T\u0000\u0000\u0155\u0175\u0005P\u0000\u0000\u0156\u0157\u0005I"+
		"\u0000\u0000\u0157\u0158\u0005O\u0000\u0000\u0158\u0159\u0003,\u0016\u0000"+
		"\u0159\u015a\u0005\u0002\u0000\u0000\u015a\u015b\u0005V\u0000\u0000\u015b"+
		"\u015c\u0005\u0003\u0000\u0000\u015c\u015d\u0005P\u0000\u0000\u015d\u0175"+
		"\u0001\u0000\u0000\u0000\u015e\u015f\u0005I\u0000\u0000\u015f\u0160\u0005"+
		"O\u0000\u0000\u0160\u0161\u0003P(\u0000\u0161\u0162\u0005P\u0000\u0000"+
		"\u0162\u0175\u0001\u0000\u0000\u0000\u0163\u0164\u0005I\u0000\u0000\u0164"+
		"\u0165\u0005O\u0000\u0000\u0165\u0166\u00032\u0019\u0000\u0166\u0167\u0005"+
		"P\u0000\u0000\u0167\u0175\u0001\u0000\u0000\u0000\u0168\u0169\u0005I\u0000"+
		"\u0000\u0169\u016a\u0005O\u0000\u0000\u016a\u016e\u0003*\u0015\u0000\u016b"+
		"\u016c\u0005\u0002\u0000\u0000\u016c\u016d\u0005V\u0000\u0000\u016d\u016f"+
		"\u0005\u0003\u0000\u0000\u016e\u016b\u0001\u0000\u0000\u0000\u016f\u0170"+
		"\u0001\u0000\u0000\u0000\u0170\u016e\u0001\u0000\u0000\u0000\u0170\u0171"+
		"\u0001\u0000\u0000\u0000\u0171\u0172\u0001\u0000\u0000\u0000\u0172\u0173"+
		"\u0005P\u0000\u0000\u0173\u0175\u0001\u0000\u0000\u0000\u0174\u0148\u0001"+
		"\u0000\u0000\u0000\u0174\u014d\u0001\u0000\u0000\u0000\u0174\u0152\u0001"+
		"\u0000\u0000\u0000\u0174\u0156\u0001\u0000\u0000\u0000\u0174\u015e\u0001"+
		"\u0000\u0000\u0000\u0174\u0163\u0001\u0000\u0000\u0000\u0174\u0168\u0001"+
		"\u0000\u0000\u0000\u0175#\u0001\u0000\u0000\u0000\u0176\u0177\u0005\u001d"+
		"\u0000\u0000\u0177\u0178\u0005O\u0000\u0000\u0178\u017a\u0003\u0004\u0002"+
		"\u0000\u0179\u017b\u0005Q\u0000\u0000\u017a\u0179\u0001\u0000\u0000\u0000"+
		"\u017a\u017b\u0001\u0000\u0000\u0000\u017b\u017c\u0001\u0000\u0000\u0000"+
		"\u017c\u017d\u0005T\u0000\u0000\u017d\u017e\u0005P\u0000\u0000\u017e\u01bf"+
		"\u0001\u0000\u0000\u0000\u017f\u0180\u0005\u001d\u0000\u0000\u0180\u0181"+
		"\u0005O\u0000\u0000\u0181\u0183\u0003R)\u0000\u0182\u0184\u0005Q\u0000"+
		"\u0000\u0183\u0182\u0001\u0000\u0000\u0000\u0183\u0184\u0001\u0000\u0000"+
		"\u0000\u0184\u0185\u0001\u0000\u0000\u0000\u0185\u0186\u0005T\u0000\u0000"+
		"\u0186\u0187\u0005P\u0000\u0000\u0187\u01bf\u0001\u0000\u0000\u0000\u0188"+
		"\u0189\u0005\u001d\u0000\u0000\u0189\u018a\u0005O\u0000\u0000\u018a\u018c"+
		"\u0005T\u0000\u0000\u018b\u018d\u0005Q\u0000\u0000\u018c\u018b\u0001\u0000"+
		"\u0000\u0000\u018c\u018d\u0001\u0000\u0000\u0000\u018d\u018e\u0001\u0000"+
		"\u0000\u0000\u018e\u018f\u0005T\u0000\u0000\u018f\u01bf\u0005P\u0000\u0000"+
		"\u0190\u0191\u0005\u001d\u0000\u0000\u0191\u0192\u0005O\u0000\u0000\u0192"+
		"\u0194\u0003,\u0016\u0000\u0193\u0195\u0005Q\u0000\u0000\u0194\u0193\u0001"+
		"\u0000\u0000\u0000\u0194\u0195\u0001\u0000\u0000\u0000\u0195\u0196\u0001"+
		"\u0000\u0000\u0000\u0196\u0197\u0005T\u0000\u0000\u0197\u0198\u0005\u0002"+
		"\u0000\u0000\u0198\u0199\u0005V\u0000\u0000\u0199\u019a\u0005\u0003\u0000"+
		"\u0000\u019a\u019b\u0005P\u0000\u0000\u019b\u01bf\u0001\u0000\u0000\u0000"+
		"\u019c\u019d\u0005\u001d\u0000\u0000\u019d\u019e\u0005O\u0000\u0000\u019e"+
		"\u01a0\u0003P(\u0000\u019f\u01a1\u0005Q\u0000\u0000\u01a0\u019f\u0001"+
		"\u0000\u0000\u0000\u01a0\u01a1\u0001\u0000\u0000\u0000\u01a1\u01a2\u0001"+
		"\u0000\u0000\u0000\u01a2\u01a3\u0005T\u0000\u0000\u01a3\u01a4\u0005P\u0000"+
		"\u0000\u01a4\u01bf\u0001\u0000\u0000\u0000\u01a5\u01a6\u0005\u001d\u0000"+
		"\u0000\u01a6\u01a7\u0005O\u0000\u0000\u01a7\u01a9\u00032\u0019\u0000\u01a8"+
		"\u01aa\u0005Q\u0000\u0000\u01a9\u01a8\u0001\u0000\u0000\u0000\u01a9\u01aa"+
		"\u0001\u0000\u0000\u0000\u01aa\u01ab\u0001\u0000\u0000\u0000\u01ab\u01ac"+
		"\u0005T\u0000\u0000\u01ac\u01ad\u0005P\u0000\u0000\u01ad\u01bf\u0001\u0000"+
		"\u0000\u0000\u01ae\u01af\u0005\u001d\u0000\u0000\u01af\u01b0\u0005O\u0000"+
		"\u0000\u01b0\u01b4\u0003*\u0015\u0000\u01b1\u01b2\u0005\u0002\u0000\u0000"+
		"\u01b2\u01b3\u0005V\u0000\u0000\u01b3\u01b5\u0005\u0003\u0000\u0000\u01b4"+
		"\u01b1\u0001\u0000\u0000\u0000\u01b5\u01b6\u0001\u0000\u0000\u0000\u01b6"+
		"\u01b4\u0001\u0000\u0000\u0000\u01b6\u01b7\u0001\u0000\u0000\u0000\u01b7"+
		"\u01b9\u0001\u0000\u0000\u0000\u01b8\u01ba\u0005Q\u0000\u0000\u01b9\u01b8"+
		"\u0001\u0000\u0000\u0000\u01b9\u01ba\u0001\u0000\u0000\u0000\u01ba\u01bb"+
		"\u0001\u0000\u0000\u0000\u01bb\u01bc\u0005T\u0000\u0000\u01bc\u01bd\u0005"+
		"P\u0000\u0000\u01bd\u01bf\u0001\u0000\u0000\u0000\u01be\u0176\u0001\u0000"+
		"\u0000\u0000\u01be\u017f\u0001\u0000\u0000\u0000\u01be\u0188\u0001\u0000"+
		"\u0000\u0000\u01be\u0190\u0001\u0000\u0000\u0000\u01be\u019c\u0001\u0000"+
		"\u0000\u0000\u01be\u01a5\u0001\u0000\u0000\u0000\u01be\u01ae\u0001\u0000"+
		"\u0000\u0000\u01bf%\u0001\u0000\u0000\u0000\u01c0\u01c1\u0005\u001e\u0000"+
		"\u0000\u01c1\u01c2\u0005O\u0000\u0000\u01c2\u01c3\u0003\u0004\u0002\u0000"+
		"\u01c3\u01c5\u0005Q\u0000\u0000\u01c4\u01c6\u0005T\u0000\u0000\u01c5\u01c4"+
		"\u0001\u0000\u0000\u0000\u01c5\u01c6\u0001\u0000\u0000\u0000\u01c6\u01c7"+
		"\u0001\u0000\u0000\u0000\u01c7\u01c8\u0005P\u0000\u0000\u01c8\u01d2\u0001"+
		"\u0000\u0000\u0000\u01c9\u01ca\u0005\u001e\u0000\u0000\u01ca\u01cb\u0005"+
		"O\u0000\u0000\u01cb\u01cc\u0005T\u0000\u0000\u01cc\u01ce\u0005Q\u0000"+
		"\u0000\u01cd\u01cf\u0005T\u0000\u0000\u01ce\u01cd\u0001\u0000\u0000\u0000"+
		"\u01ce\u01cf\u0001\u0000\u0000\u0000\u01cf\u01d0\u0001\u0000\u0000\u0000"+
		"\u01d0\u01d2\u0005P\u0000\u0000\u01d1\u01c0\u0001\u0000\u0000\u0000\u01d1"+
		"\u01c9\u0001\u0000\u0000\u0000\u01d2\'\u0001\u0000\u0000\u0000\u01d3\u01d5"+
		"\u0005\u0004\u0000\u0000\u01d4\u01d6\u0005X\u0000\u0000\u01d5\u01d4\u0001"+
		"\u0000\u0000\u0000\u01d5\u01d6\u0001\u0000\u0000\u0000\u01d6\u01de\u0001"+
		"\u0000\u0000\u0000\u01d7\u01d8\u0003\n\u0005\u0000\u01d8\u01da\u0005\u0001"+
		"\u0000\u0000\u01d9\u01db\u0005X\u0000\u0000\u01da\u01d9\u0001\u0000\u0000"+
		"\u0000\u01da\u01db\u0001\u0000\u0000\u0000\u01db\u01dd\u0001\u0000\u0000"+
		"\u0000\u01dc\u01d7\u0001\u0000\u0000\u0000\u01dd\u01e0\u0001\u0000\u0000"+
		"\u0000\u01de\u01dc\u0001\u0000\u0000\u0000\u01de\u01df\u0001\u0000\u0000"+
		"\u0000\u01df\u01e1\u0001\u0000\u0000\u0000\u01e0\u01de\u0001\u0000\u0000"+
		"\u0000\u01e1\u01e2\u0005\u0005\u0000\u0000\u01e2)\u0001\u0000\u0000\u0000"+
		"\u01e3\u01e8\u0005\u0002\u0000\u0000\u01e4\u01e6\u0003,\u0016\u0000\u01e5"+
		"\u01e7\u0005Q\u0000\u0000\u01e6\u01e5\u0001\u0000\u0000\u0000\u01e6\u01e7"+
		"\u0001\u0000\u0000\u0000\u01e7\u01e9\u0001\u0000\u0000\u0000\u01e8\u01e4"+
		"\u0001\u0000\u0000\u0000\u01e9\u01ea\u0001\u0000\u0000\u0000\u01ea\u01e8"+
		"\u0001\u0000\u0000\u0000\u01ea\u01eb\u0001\u0000\u0000\u0000\u01eb\u01ec"+
		"\u0001\u0000\u0000\u0000\u01ec\u01ed\u0005\u0003\u0000\u0000\u01ed\u01f0"+
		"\u0001\u0000\u0000\u0000\u01ee\u01f0\u0005U\u0000\u0000\u01ef\u01e3\u0001"+
		"\u0000\u0000\u0000\u01ef\u01ee\u0001\u0000\u0000\u0000\u01f0+\u0001\u0000"+
		"\u0000\u0000\u01f1\u01f6\u0005\u0002\u0000\u0000\u01f2\u01f4\u0003R)\u0000"+
		"\u01f3\u01f5\u0005Q\u0000\u0000\u01f4\u01f3\u0001\u0000\u0000\u0000\u01f4"+
		"\u01f5\u0001\u0000\u0000\u0000\u01f5\u01f7\u0001\u0000\u0000\u0000\u01f6"+
		"\u01f2\u0001\u0000\u0000\u0000\u01f7\u01f8\u0001\u0000\u0000\u0000\u01f8"+
		"\u01f6\u0001\u0000\u0000\u0000\u01f8\u01f9\u0001\u0000\u0000\u0000\u01f9"+
		"\u01fa\u0001\u0000\u0000\u0000\u01fa\u01fb\u0005\u0003\u0000\u0000\u01fb"+
		"\u01ff\u0001\u0000\u0000\u0000\u01fc\u01ff\u0005U\u0000\u0000\u01fd\u01ff"+
		"\u00032\u0019\u0000\u01fe\u01f1\u0001\u0000\u0000\u0000\u01fe\u01fc\u0001"+
		"\u0000\u0000\u0000\u01fe\u01fd\u0001\u0000\u0000\u0000\u01ff-\u0001\u0000"+
		"\u0000\u0000\u0200\u0201\u0005U\u0000\u0000\u0201\u0202\u0005\u0006\u0000"+
		"\u0000\u0202\u0210\u0003P(\u0000\u0203\u0204\u0005U\u0000\u0000\u0204"+
		"\u0205\u0005\u0006\u0000\u0000\u0205\u0210\u0003R)\u0000\u0206\u0207\u0005"+
		"U\u0000\u0000\u0207\u0208\u0005\u0006\u0000\u0000\u0208\u0210\u0005T\u0000"+
		"\u0000\u0209\u020a\u0005U\u0000\u0000\u020a\u020b\u0005\u0006\u0000\u0000"+
		"\u020b\u0210\u0003*\u0015\u0000\u020c\u020d\u0005U\u0000\u0000\u020d\u020e"+
		"\u0005\u0006\u0000\u0000\u020e\u0210\u0003,\u0016\u0000\u020f\u0200\u0001"+
		"\u0000\u0000\u0000\u020f\u0203\u0001\u0000\u0000\u0000\u020f\u0206\u0001"+
		"\u0000\u0000\u0000\u020f\u0209\u0001\u0000\u0000\u0000\u020f\u020c\u0001"+
		"\u0000\u0000\u0000\u0210/\u0001\u0000\u0000\u0000\u0211\u0215\u0003R)"+
		"\u0000\u0212\u0215\u0003\u001a\r\u0000\u0213\u0215\u0005T\u0000\u0000"+
		"\u0214\u0211\u0001\u0000\u0000\u0000\u0214\u0212\u0001\u0000\u0000\u0000"+
		"\u0214\u0213\u0001\u0000\u0000\u0000\u02151\u0001\u0000\u0000\u0000\u0216"+
		"\u0217\u0005!\u0000\u0000\u0217\u0218\u0005O\u0000\u0000\u0218\u021a\u0003"+
		",\u0016\u0000\u0219\u021b\u0005Q\u0000\u0000\u021a\u0219\u0001\u0000\u0000"+
		"\u0000\u021a\u021b\u0001\u0000\u0000\u0000\u021b\u021c\u0001\u0000\u0000"+
		"\u0000\u021c\u021d\u0003,\u0016\u0000\u021d\u021e\u0005P\u0000\u0000\u021e"+
		"\u0240\u0001\u0000\u0000\u0000\u021f\u0220\u0005\u001c\u0000\u0000\u0220"+
		"\u0221\u0005O\u0000\u0000\u0221\u0222\u0003,\u0016\u0000\u0222\u0223\u0005"+
		"P\u0000\u0000\u0223\u0240\u0001\u0000\u0000\u0000\u0224\u0225\u0005\""+
		"\u0000\u0000\u0225\u0226\u0005O\u0000\u0000\u0226\u0228\u0003,\u0016\u0000"+
		"\u0227\u0229\u0005Q\u0000\u0000\u0228\u0227\u0001\u0000\u0000\u0000\u0228"+
		"\u0229\u0001\u0000\u0000\u0000\u0229\u022a\u0001\u0000\u0000\u0000\u022a"+
		"\u022b\u0003,\u0016\u0000\u022b\u022c\u0005P\u0000\u0000\u022c\u0240\u0001"+
		"\u0000\u0000\u0000\u022d\u022e\u0005#\u0000\u0000\u022e\u022f\u0005O\u0000"+
		"\u0000\u022f\u0231\u0003,\u0016\u0000\u0230\u0232\u0005Q\u0000\u0000\u0231"+
		"\u0230\u0001\u0000\u0000\u0000\u0231\u0232\u0001\u0000\u0000\u0000\u0232"+
		"\u0233\u0001\u0000\u0000\u0000\u0233\u0234\u0003,\u0016\u0000\u0234\u0235"+
		"\u0005P\u0000\u0000\u0235\u0240\u0001\u0000\u0000\u0000\u0236\u0237\u0005"+
		"$\u0000\u0000\u0237\u0238\u0005O\u0000\u0000\u0238\u023a\u0003,\u0016"+
		"\u0000\u0239\u023b\u0005Q\u0000\u0000\u023a\u0239\u0001\u0000\u0000\u0000"+
		"\u023a\u023b\u0001\u0000\u0000\u0000\u023b\u023c\u0001\u0000\u0000\u0000"+
		"\u023c\u023d\u0003,\u0016\u0000\u023d\u023e\u0005P\u0000\u0000\u023e\u0240"+
		"\u0001\u0000\u0000\u0000\u023f\u0216\u0001\u0000\u0000\u0000\u023f\u021f"+
		"\u0001\u0000\u0000\u0000\u023f\u0224\u0001\u0000\u0000\u0000\u023f\u022d"+
		"\u0001\u0000\u0000\u0000\u023f\u0236\u0001\u0000\u0000\u0000\u02403\u0001"+
		"\u0000\u0000\u0000\u0241\u0242\u0005\r\u0000\u0000\u0242\u0245\u0005U"+
		"\u0000\u0000\u0243\u0245\u0005U\u0000\u0000\u0244\u0241\u0001\u0000\u0000"+
		"\u0000\u0244\u0243\u0001\u0000\u0000\u0000\u02455\u0001\u0000\u0000\u0000"+
		"\u0246\u0247\u0005U\u0000\u0000\u0247\u0248\u0005\u000e\u0000\u0000\u0248"+
		"\u0249\u0005O\u0000\u0000\u0249\u024a\u0003,\u0016\u0000\u024a\u024b\u0005"+
		"P\u0000\u0000\u024b\u0262\u0001\u0000\u0000\u0000\u024c\u024d\u0005U\u0000"+
		"\u0000\u024d\u024e\u0005\u0010\u0000\u0000\u024e\u024f\u0005O\u0000\u0000"+
		"\u024f\u0250\u0003,\u0016\u0000\u0250\u0251\u0005P\u0000\u0000\u0251\u0262"+
		"\u0001\u0000\u0000\u0000\u0252\u0253\u0005U\u0000\u0000\u0253\u0254\u0005"+
		"\u000f\u0000\u0000\u0254\u0255\u0005O\u0000\u0000\u0255\u0256\u0005V\u0000"+
		"\u0000\u0256\u0262\u0005P\u0000\u0000\u0257\u0258\u0005U\u0000\u0000\u0258"+
		"\u0259\u0005\u0011\u0000\u0000\u0259\u025a\u0005O\u0000\u0000\u025a\u025b"+
		"\u0003,\u0016\u0000\u025b\u025c\u0005P\u0000\u0000\u025c\u0262\u0001\u0000"+
		"\u0000\u0000\u025d\u025e\u0005U\u0000\u0000\u025e\u025f\u0005\f\u0000"+
		"\u0000\u025f\u0260\u0005O\u0000\u0000\u0260\u0262\u0005P\u0000\u0000\u0261"+
		"\u0246\u0001\u0000\u0000\u0000\u0261\u024c\u0001\u0000\u0000\u0000\u0261"+
		"\u0252\u0001\u0000\u0000\u0000\u0261\u0257\u0001\u0000\u0000\u0000\u0261"+
		"\u025d\u0001\u0000\u0000\u0000\u02627\u0001\u0000\u0000\u0000\u0263\u0264"+
		"\u0005%\u0000\u0000\u0264\u0265\u0005O\u0000\u0000\u0265\u0266\u0003R"+
		")\u0000\u0266\u0267\u0005P\u0000\u0000\u0267\u0291\u0001\u0000\u0000\u0000"+
		"\u0268\u0269\u0005&\u0000\u0000\u0269\u026a\u0005O\u0000\u0000\u026a\u026b"+
		"\u0003R)\u0000\u026b\u026c\u0005P\u0000\u0000\u026c\u0291\u0001\u0000"+
		"\u0000\u0000\u026d\u026e\u0005\'\u0000\u0000\u026e\u026f\u0005O\u0000"+
		"\u0000\u026f\u0270\u0003R)\u0000\u0270\u0271\u0005P\u0000\u0000\u0271"+
		"\u0291\u0001\u0000\u0000\u0000\u0272\u0273\u0005(\u0000\u0000\u0273\u0274"+
		"\u0005O\u0000\u0000\u0274\u0275\u0003R)\u0000\u0275\u0276\u0005P\u0000"+
		"\u0000\u0276\u0291\u0001\u0000\u0000\u0000\u0277\u0278\u0005)\u0000\u0000"+
		"\u0278\u0279\u0005O\u0000\u0000\u0279\u027a\u0003R)\u0000\u027a\u027b"+
		"\u0005P\u0000\u0000\u027b\u0291\u0001\u0000\u0000\u0000\u027c\u027d\u0005"+
		"*\u0000\u0000\u027d\u027e\u0005O\u0000\u0000\u027e\u027f\u0003R)\u0000"+
		"\u027f\u0280\u0005P\u0000\u0000\u0280\u0291\u0001\u0000\u0000\u0000\u0281"+
		"\u0282\u0005+\u0000\u0000\u0282\u0283\u0005O\u0000\u0000\u0283\u0284\u0003"+
		"R)\u0000\u0284\u0285\u0005P\u0000\u0000\u0285\u0291\u0001\u0000\u0000"+
		"\u0000\u0286\u0287\u0005,\u0000\u0000\u0287\u0288\u0005O\u0000\u0000\u0288"+
		"\u0289\u0003R)\u0000\u0289\u028a\u0005P\u0000\u0000\u028a\u0291\u0001"+
		"\u0000\u0000\u0000\u028b\u028c\u0005-\u0000\u0000\u028c\u028d\u0005O\u0000"+
		"\u0000\u028d\u028e\u0003R)\u0000\u028e\u028f\u0005P\u0000\u0000\u028f"+
		"\u0291\u0001\u0000\u0000\u0000\u0290\u0263\u0001\u0000\u0000\u0000\u0290"+
		"\u0268\u0001\u0000\u0000\u0000\u0290\u026d\u0001\u0000\u0000\u0000\u0290"+
		"\u0272\u0001\u0000\u0000\u0000\u0290\u0277\u0001\u0000\u0000\u0000\u0290"+
		"\u027c\u0001\u0000\u0000\u0000\u0290\u0281\u0001\u0000\u0000\u0000\u0290"+
		"\u0286\u0001\u0000\u0000\u0000\u0290\u028b\u0001\u0000\u0000\u0000\u0291"+
		"9\u0001\u0000\u0000\u0000\u0292\u0295\u0003<\u001e\u0000\u0293\u0295\u0003"+
		"P(\u0000\u0294\u0292\u0001\u0000\u0000\u0000\u0294\u0293\u0001\u0000\u0000"+
		"\u0000\u0295;\u0001\u0000\u0000\u0000\u0296\u029a\u00038\u001c\u0000\u0297"+
		"\u029a\u0003N\'\u0000\u0298\u029a\u0003>\u001f\u0000\u0299\u0296\u0001"+
		"\u0000\u0000\u0000\u0299\u0297\u0001\u0000\u0000\u0000\u0299\u0298\u0001"+
		"\u0000\u0000\u0000\u029a=\u0001\u0000\u0000\u0000\u029b\u02a1\u0003L&"+
		"\u0000\u029c\u02a1\u0003D\"\u0000\u029d\u02a1\u0003H$\u0000\u029e\u02a1"+
		"\u0003J%\u0000\u029f\u02a1\u0003F#\u0000\u02a0\u029b\u0001\u0000\u0000"+
		"\u0000\u02a0\u029c\u0001\u0000\u0000\u0000\u02a0\u029d\u0001\u0000\u0000"+
		"\u0000\u02a0\u029e\u0001\u0000\u0000\u0000\u02a0\u029f\u0001\u0000\u0000"+
		"\u0000\u02a1?\u0001\u0000\u0000\u0000\u02a2\u02a3\u00058\u0000\u0000\u02a3"+
		"\u02a4\u0005U\u0000\u0000\u02a4\u02a5\u0005O\u0000\u0000\u02a5\u02a7\u0005"+
		"W\u0000\u0000\u02a6\u02a8\u0005Q\u0000\u0000\u02a7\u02a6\u0001\u0000\u0000"+
		"\u0000\u02a7\u02a8\u0001\u0000\u0000\u0000\u02a8\u02a9\u0001\u0000\u0000"+
		"\u0000\u02a9\u02ab\u0003,\u0016\u0000\u02aa\u02ac\u0005Q\u0000\u0000\u02ab"+
		"\u02aa\u0001\u0000\u0000\u0000\u02ab\u02ac\u0001\u0000\u0000\u0000\u02ac"+
		"\u02ad\u0001\u0000\u0000\u0000\u02ad\u02af\u0003,\u0016\u0000\u02ae\u02b0"+
		"\u0005Q\u0000\u0000\u02af\u02ae\u0001\u0000\u0000\u0000\u02af\u02b0\u0001"+
		"\u0000\u0000\u0000\u02b0\u02b1\u0001\u0000\u0000\u0000\u02b1\u02b2\u0003"+
		"4\u001a\u0000\u02b2\u02b3\u0005P\u0000\u0000\u02b3A\u0001\u0000\u0000"+
		"\u0000\u02b4\u02b5\u0005U\u0000\u0000\u02b5\u02b6\u0005\b\u0000\u0000"+
		"\u02b6\u02b7\u0005O\u0000\u0000\u02b7\u02b8\u0005\u000b\u0000\u0000\u02b8"+
		"\u02d7\u0005P\u0000\u0000\u02b9\u02ba\u0005U\u0000\u0000\u02ba\u02bb\u0005"+
		"\b\u0000\u0000\u02bb\u02bc\u0005O\u0000\u0000\u02bc\u02bd\u0005V\u0000"+
		"\u0000\u02bd\u02be\u0005\n\u0000\u0000\u02be\u02d7\u0005P\u0000\u0000"+
		"\u02bf\u02c0\u0005U\u0000\u0000\u02c0\u02c1\u0005\b\u0000\u0000\u02c1"+
		"\u02c2\u0005O\u0000\u0000\u02c2\u02c3\u0005\t\u0000\u0000\u02c3\u02c4"+
		"\u0005V\u0000\u0000\u02c4\u02d7\u0005P\u0000\u0000\u02c5\u02c6\u0005U"+
		"\u0000\u0000\u02c6\u02c7\u0005\u0007\u0000\u0000\u02c7\u02c8\u0005O\u0000"+
		"\u0000\u02c8\u02c9\u0005\u000b\u0000\u0000\u02c9\u02d7\u0005P\u0000\u0000"+
		"\u02ca\u02cb\u0005U\u0000\u0000\u02cb\u02cc\u0005\u0007\u0000\u0000\u02cc"+
		"\u02cd\u0005O\u0000\u0000\u02cd\u02ce\u0005V\u0000\u0000\u02ce\u02cf\u0005"+
		"\n\u0000\u0000\u02cf\u02d7\u0005P\u0000\u0000\u02d0\u02d1\u0005U\u0000"+
		"\u0000\u02d1\u02d2\u0005\u0007\u0000\u0000\u02d2\u02d3\u0005O\u0000\u0000"+
		"\u02d3\u02d4\u0005\t\u0000\u0000\u02d4\u02d5\u0005V\u0000\u0000\u02d5"+
		"\u02d7\u0005P\u0000\u0000\u02d6\u02b4\u0001\u0000\u0000\u0000\u02d6\u02b9"+
		"\u0001\u0000\u0000\u0000\u02d6\u02bf\u0001\u0000\u0000\u0000\u02d6\u02c5"+
		"\u0001\u0000\u0000\u0000\u02d6\u02ca\u0001\u0000\u0000\u0000\u02d6\u02d0"+
		"\u0001\u0000\u0000\u0000\u02d7C\u0001\u0000\u0000\u0000\u02d8\u02d9\u0005"+
		"\u001b\u0000\u0000\u02d9\u02da\u0005O\u0000\u0000\u02da\u02dc\u0005W\u0000"+
		"\u0000\u02db\u02dd\u0005Q\u0000\u0000\u02dc\u02db\u0001\u0000\u0000\u0000"+
		"\u02dc\u02dd\u0001\u0000\u0000\u0000\u02dd\u02de\u0001\u0000\u0000\u0000"+
		"\u02de\u02df\u0005W\u0000\u0000\u02df\u02e0\u0005P\u0000\u0000\u02e0\u02e1"+
		"\u0005\u0014\u0000\u0000\u02e1\u02e2\u0005O\u0000\u0000\u02e2\u02e3\u0005"+
		"W\u0000\u0000\u02e3\u0311\u0005P\u0000\u0000\u02e4\u02e5\u0005\u0019\u0000"+
		"\u0000\u02e5\u02e6\u0005O\u0000\u0000\u02e6\u02e7\u0005V\u0000\u0000\u02e7"+
		"\u02e8\u0005P\u0000\u0000\u02e8\u02e9\u0005\u0014\u0000\u0000\u02e9\u02ea"+
		"\u0005O\u0000\u0000\u02ea\u02eb\u0005W\u0000\u0000\u02eb\u0311\u0005P"+
		"\u0000\u0000\u02ec\u02ed\u0005\u001a\u0000\u0000\u02ed\u02ee\u0005O\u0000"+
		"\u0000\u02ee\u02ef\u0005W\u0000\u0000\u02ef\u02f0\u0005P\u0000\u0000\u02f0"+
		"\u02f1\u0005\u0014\u0000\u0000\u02f1\u02f2\u0005O\u0000\u0000\u02f2\u02f3"+
		"\u0005W\u0000\u0000\u02f3\u0311\u0005P\u0000\u0000\u02f4\u02f5\u0005\u0018"+
		"\u0000\u0000\u02f5\u02f6\u0005O\u0000\u0000\u02f6\u02f7\u0005V\u0000\u0000"+
		"\u02f7\u02f8\u0005P\u0000\u0000\u02f8\u02f9\u0005\u0014\u0000\u0000\u02f9"+
		"\u02fa\u0005O\u0000\u0000\u02fa\u02fb\u0005W\u0000\u0000\u02fb\u0311\u0005"+
		"P\u0000\u0000\u02fc\u02fd\u0005\u0017\u0000\u0000\u02fd\u02fe\u0005O\u0000"+
		"\u0000\u02fe\u02ff\u0005W\u0000\u0000\u02ff\u0300\u0005P\u0000\u0000\u0300"+
		"\u0301\u0005\u0014\u0000\u0000\u0301\u0302\u0005O\u0000\u0000\u0302\u0303"+
		"\u0005W\u0000\u0000\u0303\u0311\u0005P\u0000\u0000\u0304\u0305\u0005\u0016"+
		"\u0000\u0000\u0305\u0306\u0005O\u0000\u0000\u0306\u0308\u0005W\u0000\u0000"+
		"\u0307\u0309\u0005Q\u0000\u0000\u0308\u0307\u0001\u0000\u0000\u0000\u0308"+
		"\u0309\u0001\u0000\u0000\u0000\u0309\u030a\u0001\u0000\u0000\u0000\u030a"+
		"\u030b\u0005W\u0000\u0000\u030b\u030c\u0005P\u0000\u0000\u030c\u030d\u0005"+
		"\u0014\u0000\u0000\u030d\u030e\u0005O\u0000\u0000\u030e\u030f\u0005W\u0000"+
		"\u0000\u030f\u0311\u0005P\u0000\u0000\u0310\u02d8\u0001\u0000\u0000\u0000"+
		"\u0310\u02e4\u0001\u0000\u0000\u0000\u0310\u02ec\u0001\u0000\u0000\u0000"+
		"\u0310\u02f4\u0001\u0000\u0000\u0000\u0310\u02fc\u0001\u0000\u0000\u0000"+
		"\u0310\u0304\u0001\u0000\u0000\u0000\u0311E\u0001\u0000\u0000\u0000\u0312"+
		"\u0313\u0005\u001b\u0000\u0000\u0313\u0314\u0005O\u0000\u0000\u0314\u0316"+
		"\u0005W\u0000\u0000\u0315\u0317\u0005Q\u0000\u0000\u0316\u0315\u0001\u0000"+
		"\u0000\u0000\u0316\u0317\u0001\u0000\u0000\u0000\u0317\u0318\u0001\u0000"+
		"\u0000\u0000\u0318\u0319\u0005W\u0000\u0000\u0319\u031a\u0005P\u0000\u0000"+
		"\u031a\u031b\u0005\u0012\u0000\u0000\u031b\u031c\u0005O\u0000\u0000\u031c"+
		"\u031d\u0005W\u0000\u0000\u031d\u034b\u0005P\u0000\u0000\u031e\u031f\u0005"+
		"\u0019\u0000\u0000\u031f\u0320\u0005O\u0000\u0000\u0320\u0321\u0005V\u0000"+
		"\u0000\u0321\u0322\u0005P\u0000\u0000\u0322\u0323\u0005\u0012\u0000\u0000"+
		"\u0323\u0324\u0005O\u0000\u0000\u0324\u0325\u0005W\u0000\u0000\u0325\u034b"+
		"\u0005P\u0000\u0000\u0326\u0327\u0005\u001a\u0000\u0000\u0327\u0328\u0005"+
		"O\u0000\u0000\u0328\u0329\u0005W\u0000\u0000\u0329\u032a\u0005P\u0000"+
		"\u0000\u032a\u032b\u0005\u0012\u0000\u0000\u032b\u032c\u0005O\u0000\u0000"+
		"\u032c\u032d\u0005W\u0000\u0000\u032d\u034b\u0005P\u0000\u0000\u032e\u032f"+
		"\u0005\u0018\u0000\u0000\u032f\u0330\u0005O\u0000\u0000\u0330\u0331\u0005"+
		"V\u0000\u0000\u0331\u0332\u0005P\u0000\u0000\u0332\u0333\u0005\u0012\u0000"+
		"\u0000\u0333\u0334\u0005O\u0000\u0000\u0334\u0335\u0005W\u0000\u0000\u0335"+
		"\u034b\u0005P\u0000\u0000\u0336\u0337\u0005\u0017\u0000\u0000\u0337\u0338"+
		"\u0005O\u0000\u0000\u0338\u0339\u0005W\u0000\u0000\u0339\u033a\u0005P"+
		"\u0000\u0000\u033a\u033b\u0005\u0012\u0000\u0000\u033b\u033c\u0005O\u0000"+
		"\u0000\u033c\u033d\u0005W\u0000\u0000\u033d\u034b\u0005P\u0000\u0000\u033e"+
		"\u033f\u0005\u0016\u0000\u0000\u033f\u0340\u0005O\u0000\u0000\u0340\u0342"+
		"\u0005W\u0000\u0000\u0341\u0343\u0005Q\u0000\u0000\u0342\u0341\u0001\u0000"+
		"\u0000\u0000\u0342\u0343\u0001\u0000\u0000\u0000\u0343\u0344\u0001\u0000"+
		"\u0000\u0000\u0344\u0345\u0005W\u0000\u0000\u0345\u0346\u0005P\u0000\u0000"+
		"\u0346\u0347\u0005\u0012\u0000\u0000\u0347\u0348\u0005O\u0000\u0000\u0348"+
		"\u0349\u0005W\u0000\u0000\u0349\u034b\u0005P\u0000\u0000\u034a\u0312\u0001"+
		"\u0000\u0000\u0000\u034a\u031e\u0001\u0000\u0000\u0000\u034a\u0326\u0001"+
		"\u0000\u0000\u0000\u034a\u032e\u0001\u0000\u0000\u0000\u034a\u0336\u0001"+
		"\u0000\u0000\u0000\u034a\u033e\u0001\u0000\u0000\u0000\u034bG\u0001\u0000"+
		"\u0000\u0000\u034c\u034d\u0005\u001b\u0000\u0000\u034d\u034e\u0005O\u0000"+
		"\u0000\u034e\u0350\u0005W\u0000\u0000\u034f\u0351\u0005Q\u0000\u0000\u0350"+
		"\u034f\u0001\u0000\u0000\u0000\u0350\u0351\u0001\u0000\u0000\u0000\u0351"+
		"\u0352\u0001\u0000\u0000\u0000\u0352\u0353\u0005W\u0000\u0000\u0353\u0354"+
		"\u0005P\u0000\u0000\u0354\u0355\u0005\u0013\u0000\u0000\u0355\u0356\u0005"+
		"O\u0000\u0000\u0356\u0357\u0005W\u0000\u0000\u0357\u0385\u0005P\u0000"+
		"\u0000\u0358\u0359\u0005\u0019\u0000\u0000\u0359\u035a\u0005O\u0000\u0000"+
		"\u035a\u035b\u0005V\u0000\u0000\u035b\u035c\u0005P\u0000\u0000\u035c\u035d"+
		"\u0005\u0013\u0000\u0000\u035d\u035e\u0005O\u0000\u0000\u035e\u035f\u0005"+
		"W\u0000\u0000\u035f\u0385\u0005P\u0000\u0000\u0360\u0361\u0005\u001a\u0000"+
		"\u0000\u0361\u0362\u0005O\u0000\u0000\u0362\u0363\u0005W\u0000\u0000\u0363"+
		"\u0364\u0005P\u0000\u0000\u0364\u0365\u0005\u0013\u0000\u0000\u0365\u0366"+
		"\u0005O\u0000\u0000\u0366\u0367\u0005V\u0000\u0000\u0367\u0385\u0005P"+
		"\u0000\u0000\u0368\u0369\u0005\u0018\u0000\u0000\u0369\u036a\u0005O\u0000"+
		"\u0000\u036a\u036b\u0005V\u0000\u0000\u036b\u036c\u0005P\u0000\u0000\u036c"+
		"\u036d\u0005\u0013\u0000\u0000\u036d\u036e\u0005O\u0000\u0000\u036e\u036f"+
		"\u0005W\u0000\u0000\u036f\u0385\u0005P\u0000\u0000\u0370\u0371\u0005\u0017"+
		"\u0000\u0000\u0371\u0372\u0005O\u0000\u0000\u0372\u0373\u0005W\u0000\u0000"+
		"\u0373\u0374\u0005P\u0000\u0000\u0374\u0375\u0005\u0013\u0000\u0000\u0375"+
		"\u0376\u0005O\u0000\u0000\u0376\u0377\u0005V\u0000\u0000\u0377\u0385\u0005"+
		"P\u0000\u0000\u0378\u0379\u0005\u0016\u0000\u0000\u0379\u037a\u0005O\u0000"+
		"\u0000\u037a\u037c\u0005W\u0000\u0000\u037b\u037d\u0005Q\u0000\u0000\u037c"+
		"\u037b\u0001\u0000\u0000\u0000\u037c\u037d\u0001\u0000\u0000\u0000\u037d"+
		"\u037e\u0001\u0000\u0000\u0000\u037e\u037f\u0005W\u0000\u0000\u037f\u0380"+
		"\u0005P\u0000\u0000\u0380\u0381\u0005\u0013\u0000\u0000\u0381\u0382\u0005"+
		"O\u0000\u0000\u0382\u0383\u0005W\u0000\u0000\u0383\u0385\u0005P\u0000"+
		"\u0000\u0384\u034c\u0001\u0000\u0000\u0000\u0384\u0358\u0001\u0000\u0000"+
		"\u0000\u0384\u0360\u0001\u0000\u0000\u0000\u0384\u0368\u0001\u0000\u0000"+
		"\u0000\u0384\u0370\u0001\u0000\u0000\u0000\u0384\u0378\u0001\u0000\u0000"+
		"\u0000\u0385I\u0001\u0000\u0000\u0000\u0386\u0387\u0005\u001b\u0000\u0000"+
		"\u0387\u0388\u0005O\u0000\u0000\u0388\u038a\u0005W\u0000\u0000\u0389\u038b"+
		"\u0005Q\u0000\u0000\u038a\u0389\u0001\u0000\u0000\u0000\u038a\u038b\u0001"+
		"\u0000\u0000\u0000\u038b\u038c\u0001\u0000\u0000\u0000\u038c\u038d\u0005"+
		"W\u0000\u0000\u038d\u038e\u0005P\u0000\u0000\u038e\u038f\u0005\u0015\u0000"+
		"\u0000\u038f\u0390\u0005O\u0000\u0000\u0390\u0391\u0005W\u0000\u0000\u0391"+
		"\u03bf\u0005P\u0000\u0000\u0392\u0393\u0005\u0019\u0000\u0000\u0393\u0394"+
		"\u0005O\u0000\u0000\u0394\u0395\u0005V\u0000\u0000\u0395\u0396\u0005P"+
		"\u0000\u0000\u0396\u0397\u0005\u0015\u0000\u0000\u0397\u0398\u0005O\u0000"+
		"\u0000\u0398\u0399\u0005W\u0000\u0000\u0399\u03bf\u0005P\u0000\u0000\u039a"+
		"\u039b\u0005\u001a\u0000\u0000\u039b\u039c\u0005O\u0000\u0000\u039c\u039d"+
		"\u0005W\u0000\u0000\u039d\u039e\u0005P\u0000\u0000\u039e\u039f\u0005\u0015"+
		"\u0000\u0000\u039f\u03a0\u0005O\u0000\u0000\u03a0\u03a1\u0005W\u0000\u0000"+
		"\u03a1\u03bf\u0005P\u0000\u0000\u03a2\u03a3\u0005\u0018\u0000\u0000\u03a3"+
		"\u03a4\u0005O\u0000\u0000\u03a4\u03a5\u0005V\u0000\u0000\u03a5\u03a6\u0005"+
		"P\u0000\u0000\u03a6\u03a7\u0005\u0015\u0000\u0000\u03a7\u03a8\u0005O\u0000"+
		"\u0000\u03a8\u03a9\u0005W\u0000\u0000\u03a9\u03bf\u0005P\u0000\u0000\u03aa"+
		"\u03ab\u0005\u0017\u0000\u0000\u03ab\u03ac\u0005O\u0000\u0000\u03ac\u03ad"+
		"\u0005W\u0000\u0000\u03ad\u03ae\u0005P\u0000\u0000\u03ae\u03af\u0005\u0015"+
		"\u0000\u0000\u03af\u03b0\u0005O\u0000\u0000\u03b0\u03b1\u0005W\u0000\u0000"+
		"\u03b1\u03bf\u0005P\u0000\u0000\u03b2\u03b3\u0005\u0016\u0000\u0000\u03b3"+
		"\u03b4\u0005O\u0000\u0000\u03b4\u03b6\u0005W\u0000\u0000\u03b5\u03b7\u0005"+
		"Q\u0000\u0000\u03b6\u03b5\u0001\u0000\u0000\u0000\u03b6\u03b7\u0001\u0000"+
		"\u0000\u0000\u03b7\u03b8\u0001\u0000\u0000\u0000\u03b8\u03b9\u0005W\u0000"+
		"\u0000\u03b9\u03ba\u0005P\u0000\u0000\u03ba\u03bb\u0005\u0015\u0000\u0000"+
		"\u03bb\u03bc\u0005O\u0000\u0000\u03bc\u03bd\u0005W\u0000\u0000\u03bd\u03bf"+
		"\u0005P\u0000\u0000\u03be\u0386\u0001\u0000\u0000\u0000\u03be\u0392\u0001"+
		"\u0000\u0000\u0000\u03be\u039a\u0001\u0000\u0000\u0000\u03be\u03a2\u0001"+
		"\u0000\u0000\u0000\u03be\u03aa\u0001\u0000\u0000\u0000\u03be\u03b2\u0001"+
		"\u0000\u0000\u0000\u03bfK\u0001\u0000\u0000\u0000\u03c0\u03c1\u0005\u001f"+
		"\u0000\u0000\u03c1\u03c2\u0005O\u0000\u0000\u03c2\u03c3\u0005W\u0000\u0000"+
		"\u03c3\u03c4\u0005P\u0000\u0000\u03c4M\u0001\u0000\u0000\u0000\u03c5\u03c6"+
		"\u0005 \u0000\u0000\u03c6\u03c7\u0005O\u0000\u0000\u03c7\u03c8\u0003R"+
		")\u0000\u03c8\u03c9\u0005P\u0000\u0000\u03c9O\u0001\u0000\u0000\u0000"+
		"\u03ca\u03cb\u0005U\u0000\u0000\u03cb\u03d0\u0005O\u0000\u0000\u03cc\u03ce"+
		"\u0003R)\u0000\u03cd\u03cf\u0005Q\u0000\u0000\u03ce\u03cd\u0001\u0000"+
		"\u0000\u0000\u03ce\u03cf\u0001\u0000\u0000\u0000\u03cf\u03d1\u0001\u0000"+
		"\u0000\u0000\u03d0\u03cc\u0001\u0000\u0000\u0000\u03d1\u03d2\u0001\u0000"+
		"\u0000\u0000\u03d2\u03d0\u0001\u0000\u0000\u0000\u03d2\u03d3\u0001\u0000"+
		"\u0000\u0000\u03d3\u03d4\u0001\u0000\u0000\u0000\u03d4\u03d5\u0005P\u0000"+
		"\u0000\u03d5\u03dd\u0001\u0000\u0000\u0000\u03d6\u03d7\u0005U\u0000\u0000"+
		"\u03d7\u03d8\u0005O\u0000\u0000\u03d8\u03d9\u0003\u0004\u0002\u0000\u03d9"+
		"\u03da\u0005P\u0000\u0000\u03da\u03db\u0005\u0001\u0000\u0000\u03db\u03dd"+
		"\u0001\u0000\u0000\u0000\u03dc\u03ca\u0001\u0000\u0000\u0000\u03dc\u03d6"+
		"\u0001\u0000\u0000\u0000\u03ddQ\u0001\u0000\u0000\u0000\u03de\u03df\u0006"+
		")\uffff\uffff\u0000\u03df\u03e0\u0005L\u0000\u0000\u03e0\u03ef\u0003R"+
		")\u0006\u03e1\u03ef\u0005W\u0000\u0000\u03e2\u03ef\u0005V\u0000\u0000"+
		"\u03e3\u03ef\u0003:\u001d\u0000\u03e4\u03e5\u0005O\u0000\u0000\u03e5\u03e6"+
		"\u0003R)\u0000\u03e6\u03e7\u0005P\u0000\u0000\u03e7\u03ef\u0001\u0000"+
		"\u0000\u0000\u03e8\u03ec\u0005U\u0000\u0000\u03e9\u03ea\u0005\u0002\u0000"+
		"\u0000\u03ea\u03eb\u0005V\u0000\u0000\u03eb\u03ed\u0005\u0003\u0000\u0000"+
		"\u03ec\u03e9\u0001\u0000\u0000\u0000\u03ec\u03ed\u0001\u0000\u0000\u0000"+
		"\u03ed\u03ef\u0001\u0000\u0000\u0000\u03ee\u03de\u0001\u0000\u0000\u0000"+
		"\u03ee\u03e1\u0001\u0000\u0000\u0000\u03ee\u03e2\u0001\u0000\u0000\u0000"+
		"\u03ee\u03e3\u0001\u0000\u0000\u0000\u03ee\u03e4\u0001\u0000\u0000\u0000"+
		"\u03ee\u03e8\u0001\u0000\u0000\u0000\u03ef\u03fe\u0001\u0000\u0000\u0000"+
		"\u03f0\u03f1\n\n\u0000\u0000\u03f1\u03f2\u0005N\u0000\u0000\u03f2\u03fd"+
		"\u0003R)\u000b\u03f3\u03f4\n\t\u0000\u0000\u03f4\u03f5\u0007\u0001\u0000"+
		"\u0000\u03f5\u03fd\u0003R)\n\u03f6\u03f7\n\b\u0000\u0000\u03f7\u03f8\u0007"+
		"\u0002\u0000\u0000\u03f8\u03fd\u0003R)\t\u03f9\u03fa\n\u0007\u0000\u0000"+
		"\u03fa\u03fb\u00051\u0000\u0000\u03fb\u03fd\u0003R)\b\u03fc\u03f0\u0001"+
		"\u0000\u0000\u0000\u03fc\u03f3\u0001\u0000\u0000\u0000\u03fc\u03f6\u0001"+
		"\u0000\u0000\u0000\u03fc\u03f9\u0001\u0000\u0000\u0000\u03fd\u0400\u0001"+
		"\u0000\u0000\u0000\u03fe\u03fc\u0001\u0000\u0000\u0000\u03fe\u03ff\u0001"+
		"\u0000\u0000\u0000\u03ffS\u0001\u0000\u0000\u0000\u0400\u03fe\u0001\u0000"+
		"\u0000\u0000^W[`dhlptx|\u0081\u0085\u0089\u008e\u0092\u0098\u009c\u00a0"+
		"\u00a3\u00aa\u00b4\u00bc\u00c0\u00d3\u00db\u00e7\u00eb\u00ee\u00f8\u0106"+
		"\u010f\u011f\u012a\u013b\u0146\u0170\u0174\u017a\u0183\u018c\u0194\u01a0"+
		"\u01a9\u01b6\u01b9\u01be\u01c5\u01ce\u01d1\u01d5\u01da\u01de\u01e6\u01ea"+
		"\u01ef\u01f4\u01f8\u01fe\u020f\u0214\u021a\u0228\u0231\u023a\u023f\u0244"+
		"\u0261\u0290\u0294\u0299\u02a0\u02a7\u02ab\u02af\u02d6\u02dc\u0308\u0310"+
		"\u0316\u0342\u034a\u0350\u037c\u0384\u038a\u03b6\u03be\u03ce\u03d2\u03dc"+
		"\u03ec\u03ee\u03fc\u03fe";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}