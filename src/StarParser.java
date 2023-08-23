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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, LAMBDA=7, REPLACE=8, SUBSTRING=9, 
		CONCAT=10, LENGTH=11, TOARRAY=12, C=13, XAVERAGE=14, DOTDOTDOT=15, DOT=16, 
		ALPHA=17, R=18, RAVERAGE=19, IJK=20, X=21, N=22, DOTDOTSPACE=23, DOTJ=24, 
		IDOT=25, DOTDOT=26, LSIZE=27, ARRAYLIST=28, LADD=29, LGET=30, LDELETE=31, 
		LCONTAINS=32, MGF=33, DISTRIBUTION=34, DENSITY=35, PERCENTIL=36, GAMMADISTRIBUTION=37, 
		GEOMETRICDISTRIBUTION=38, CHISQUAREDDISTRIBUTION=39, TDISTRIBUTION=40, 
		POISSONDISTRIBUTION=41, NORMALDISTRIBUTION=42, ARRAYSIZE=43, FWRITE=44, 
		FREAD=45, RANDOM=46, LN=47, ARRAYADD=48, ARRAYSUBS=49, ARRAYDOT=50, ARRAYCROSS=51, 
		SIN=52, COS=53, TAN=54, ARCSIN=55, ACOS=56, ARCTAN=57, SINH=58, COSH=59, 
		TANH=60, IF=61, DEF=62, RETURN=63, MOD=64, VECTOR=65, INT=66, FLOAT=67, 
		STRING=68, MATRIX=69, BOOL=70, TWM=71, GT=72, LESS=73, EQ=74, GTH=75, 
		LESSTH=76, NOTEQ=77, FOR=78, ELSE=79, NOT=80, TRUE=81, FALSE=82, AND=83, 
		OR=84, WHILE=85, ALGORITHM=86, READ=87, WRITE=88, ADD=89, MULT=90, SUBS=91, 
		DIV=92, POWER=93, LEFTP=94, RIGHTP=95, COMMA=96, COLON=97, CADENA=98, 
		ID=99, INTEGER=100, REALNUMBER=101, WS=102;
	public static final int
		RULE_prog = 0, RULE_stat = 1, RULE_idlist = 2, RULE_type = 3, RULE_algorithm = 4, 
		RULE_statement = 5, RULE_return_statement = 6, RULE_recursiveCall = 7, 
		RULE_while_statement = 8, RULE_if_statement = 9, RULE_for_statement = 10, 
		RULE_fun_statement = 11, RULE_relexpr = 12, RULE_bexpression = 13, RULE_bterm = 14, 
		RULE_bfactor = 15, RULE_read_statement = 16, RULE_write_statement = 17, 
		RULE_fwrite_statement = 18, RULE_fread_statement = 19, RULE_block = 20, 
		RULE_matrix = 21, RULE_array = 22, RULE_assignment_statement = 23, RULE_value = 24, 
		RULE_arrayexpr = 25, RULE_arraylist = 26, RULE_arraylistop = 27, RULE_trigFunction = 28, 
		RULE_function = 29, RULE_lambdaFamily = 30, RULE_mathFunction = 31, RULE_probFunction = 32, 
		RULE_twoWaysModel = 33, RULE_twoWaysModelop = 34, RULE_xOperations = 35, 
		RULE_nOperations = 36, RULE_rOperations = 37, RULE_densityFunction = 38, 
		RULE_momentumGenerationFunction = 39, RULE_familyDistribution = 40, RULE_distributionFunction = 41, 
		RULE_percentilFunction = 42, RULE_randomFunction = 43, RULE_logFunction = 44, 
		RULE_usefunction = 45, RULE_algexpr = 46, RULE_stringOp = 47;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "stat", "idlist", "type", "algorithm", "statement", "return_statement", 
			"recursiveCall", "while_statement", "if_statement", "for_statement", 
			"fun_statement", "relexpr", "bexpression", "bterm", "bfactor", "read_statement", 
			"write_statement", "fwrite_statement", "fread_statement", "block", "matrix", 
			"array", "assignment_statement", "value", "arrayexpr", "arraylist", "arraylistop", 
			"trigFunction", "function", "lambdaFamily", "mathFunction", "probFunction", 
			"twoWaysModel", "twoWaysModelop", "xOperations", "nOperations", "rOperations", 
			"densityFunction", "momentumGenerationFunction", "familyDistribution", 
			"distributionFunction", "percentilFunction", "randomFunction", "logFunction", 
			"usefunction", "algexpr", "stringOp"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'['", "']'", "'{'", "'}'", "'='", "'lambda'", "'.replace'", 
			"'.substring'", "'.concat'", "'.length'", "'.toArray'", "'.c'", "'.x.average'", 
			"'. . .'", "'.'", "'.alpha'", "'.r'", "'.r.average'", "'.ijk'", "'.x'", 
			"'.n'", "'. .'", "'.,'", "',.'", "'..'", "'.size'", "'arraylist'", "'.add'", 
			"'.get'", "'.delete'", "'.contains'", "'.MGF'", "'.distribution'", "'.density'", 
			"'.percentil'", "'gammaDistribution'", "'geometricDistribution'", "'chiSquaredDistribution'", 
			"'TDistribution'", "'poissonDistribution'", "'normalDistribution'", "'array.size'", 
			"'fwrite'", "'fread'", "'random'", "'ln'", "'array.add'", "'array.substract'", 
			"'array.dot'", "'array.cross'", "'sin'", "'cos'", "'tan'", "'arcsin'", 
			"'acos'", "'arctan'", "'sinh'", "'cosh'", "'tanh'", "'if'", "'def'", 
			"'return'", "'%'", "'vector'", "'int'", "'float'", "'string'", "'matrix'", 
			"'bool'", "'TWM'", "'>'", "'<'", "'=='", "'>='", "'<='", "'!='", "'for'", 
			"'else'", "'not'", "'true'", "'false'", "'and'", "'or'", "'while'", "'algorithm'", 
			"'read'", "'write'", "'+'", "'*'", "'-'", "'/'", "'^'", "'('", "')'", 
			"','", "':'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, "LAMBDA", "REPLACE", "SUBSTRING", 
			"CONCAT", "LENGTH", "TOARRAY", "C", "XAVERAGE", "DOTDOTDOT", "DOT", "ALPHA", 
			"R", "RAVERAGE", "IJK", "X", "N", "DOTDOTSPACE", "DOTJ", "IDOT", "DOTDOT", 
			"LSIZE", "ARRAYLIST", "LADD", "LGET", "LDELETE", "LCONTAINS", "MGF", 
			"DISTRIBUTION", "DENSITY", "PERCENTIL", "GAMMADISTRIBUTION", "GEOMETRICDISTRIBUTION", 
			"CHISQUAREDDISTRIBUTION", "TDISTRIBUTION", "POISSONDISTRIBUTION", "NORMALDISTRIBUTION", 
			"ARRAYSIZE", "FWRITE", "FREAD", "RANDOM", "LN", "ARRAYADD", "ARRAYSUBS", 
			"ARRAYDOT", "ARRAYCROSS", "SIN", "COS", "TAN", "ARCSIN", "ACOS", "ARCTAN", 
			"SINH", "COSH", "TANH", "IF", "DEF", "RETURN", "MOD", "VECTOR", "INT", 
			"FLOAT", "STRING", "MATRIX", "BOOL", "TWM", "GT", "LESS", "EQ", "GTH", 
			"LESSTH", "NOTEQ", "FOR", "ELSE", "NOT", "TRUE", "FALSE", "AND", "OR", 
			"WHILE", "ALGORITHM", "READ", "WRITE", "ADD", "MULT", "SUBS", "DIV", 
			"POWER", "LEFTP", "RIGHTP", "COMMA", "COLON", "CADENA", "ID", "INTEGER", 
			"REALNUMBER", "WS"
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
			setState(97); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(96);
				stat();
				}
				}
				setState(99); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & -137170517888L) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & 32289747977L) != 0) );
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
	public static class BexprContext extends StatContext {
		public BexpressionContext bexpression() {
			return getRuleContext(BexpressionContext.class,0);
		}
		public TerminalNode WS() { return getToken(StarParser.WS, 0); }
		public BexprContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StarVisitor ) return ((StarVisitor<? extends T>)visitor).visitBexpr(this);
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
	public static class StringoppContext extends StatContext {
		public StringOpContext stringOp() {
			return getRuleContext(StringOpContext.class,0);
		}
		public TerminalNode WS() { return getToken(StarParser.WS, 0); }
		public StringoppContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StarVisitor ) return ((StarVisitor<? extends T>)visitor).visitStringopp(this);
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
	public static class LambdafamContext extends StatContext {
		public LambdaFamilyContext lambdaFamily() {
			return getRuleContext(LambdaFamilyContext.class,0);
		}
		public TerminalNode WS() { return getToken(StarParser.WS, 0); }
		public LambdafamContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StarVisitor ) return ((StarVisitor<? extends T>)visitor).visitLambdafam(this);
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
	public static class RelationalexpresionContext extends StatContext {
		public RelexprContext relexpr() {
			return getRuleContext(RelexprContext.class,0);
		}
		public TerminalNode WS() { return getToken(StarParser.WS, 0); }
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
		public TerminalNode WS() { return getToken(StarParser.WS, 0); }
		public ReadContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StarVisitor ) return ((StarVisitor<? extends T>)visitor).visitRead(this);
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
	public static class FreadContext extends StatContext {
		public Fread_statementContext fread_statement() {
			return getRuleContext(Fread_statementContext.class,0);
		}
		public TerminalNode WS() { return getToken(StarParser.WS, 0); }
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
	public static class FamilyContext extends StatContext {
		public FamilyDistributionContext familyDistribution() {
			return getRuleContext(FamilyDistributionContext.class,0);
		}
		public TerminalNode WS() { return getToken(StarParser.WS, 0); }
		public FamilyContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StarVisitor ) return ((StarVisitor<? extends T>)visitor).visitFamily(this);
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
			setState(199);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				_localctx = new ProbContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(101);
				probFunction();
				setState(103);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
				case 1:
					{
					setState(102);
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
				setState(105);
				algorithm();
				}
				break;
			case 3:
				_localctx = new UsefunContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(106);
				usefunction();
				setState(108);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(107);
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
				setState(110);
				arrayexpr();
				setState(112);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(111);
					match(WS);
					}
					break;
				}
				}
				break;
			case 5:
				_localctx = new StringoppContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(114);
				stringOp();
				setState(116);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(115);
					match(WS);
					}
					break;
				}
				}
				break;
			case 6:
				_localctx = new ArraylContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(118);
				arraylist();
				setState(120);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(119);
					match(WS);
					}
					break;
				}
				}
				break;
			case 7:
				_localctx = new TwmContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(122);
				twoWaysModel();
				setState(124);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(123);
					match(WS);
					}
					break;
				}
				}
				break;
			case 8:
				_localctx = new TwmopContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(126);
				twoWaysModelop();
				setState(128);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					setState(127);
					match(WS);
					}
					break;
				}
				}
				break;
			case 9:
				_localctx = new ArraylopContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(130);
				arraylistop();
				setState(132);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					setState(131);
					match(WS);
					}
					break;
				}
				}
				break;
			case 10:
				_localctx = new PrintExprContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(134);
				algexpr(0);
				setState(136);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
				case 1:
					{
					setState(135);
					match(WS);
					}
					break;
				}
				}
				break;
			case 11:
				_localctx = new AssignContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(138);
				assignment_statement();
				setState(140);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
				case 1:
					{
					setState(139);
					match(WS);
					}
					break;
				}
				}
				break;
			case 12:
				_localctx = new BexprContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(142);
				bexpression(0);
				setState(144);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
				case 1:
					{
					setState(143);
					match(WS);
					}
					break;
				}
				}
				break;
			case 13:
				_localctx = new WhileContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(146);
				while_statement();
				setState(148);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
				case 1:
					{
					setState(147);
					match(WS);
					}
					break;
				}
				}
				break;
			case 14:
				_localctx = new IfContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(150);
				if_statement();
				setState(152);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
				case 1:
					{
					setState(151);
					match(WS);
					}
					break;
				}
				}
				break;
			case 15:
				_localctx = new ForContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(154);
				for_statement();
				setState(156);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
				case 1:
					{
					setState(155);
					match(WS);
					}
					break;
				}
				}
				break;
			case 16:
				_localctx = new RelationalexpresionContext(_localctx);
				enterOuterAlt(_localctx, 16);
				{
				setState(158);
				relexpr();
				setState(160);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
				case 1:
					{
					setState(159);
					match(WS);
					}
					break;
				}
				}
				break;
			case 17:
				_localctx = new WriteContext(_localctx);
				enterOuterAlt(_localctx, 17);
				{
				setState(162);
				write_statement();
				setState(164);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
				case 1:
					{
					setState(163);
					match(WS);
					}
					break;
				}
				}
				break;
			case 18:
				_localctx = new FwriteContext(_localctx);
				enterOuterAlt(_localctx, 18);
				{
				setState(166);
				fwrite_statement();
				setState(168);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
				case 1:
					{
					setState(167);
					match(WS);
					}
					break;
				}
				}
				break;
			case 19:
				_localctx = new ReadContext(_localctx);
				enterOuterAlt(_localctx, 19);
				{
				setState(170);
				read_statement();
				setState(172);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
				case 1:
					{
					setState(171);
					match(WS);
					}
					break;
				}
				}
				break;
			case 20:
				_localctx = new FreadContext(_localctx);
				enterOuterAlt(_localctx, 20);
				{
				setState(174);
				fread_statement();
				setState(176);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
				case 1:
					{
					setState(175);
					match(WS);
					}
					break;
				}
				}
				break;
			case 21:
				_localctx = new FunctionsContext(_localctx);
				enterOuterAlt(_localctx, 21);
				{
				setState(178);
				fun_statement();
				setState(180);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
				case 1:
					{
					setState(179);
					match(WS);
					}
					break;
				}
				}
				break;
			case 22:
				_localctx = new Return2Context(_localctx);
				enterOuterAlt(_localctx, 22);
				{
				setState(182);
				return_statement();
				setState(184);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
				case 1:
					{
					setState(183);
					match(WS);
					}
					break;
				}
				}
				break;
			case 23:
				_localctx = new TrigContext(_localctx);
				enterOuterAlt(_localctx, 23);
				{
				setState(186);
				trigFunction();
				setState(188);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
				case 1:
					{
					setState(187);
					match(WS);
					}
					break;
				}
				}
				break;
			case 24:
				_localctx = new FamilyContext(_localctx);
				enterOuterAlt(_localctx, 24);
				{
				setState(190);
				familyDistribution();
				setState(192);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
				case 1:
					{
					setState(191);
					match(WS);
					}
					break;
				}
				}
				break;
			case 25:
				_localctx = new LambdafamContext(_localctx);
				enterOuterAlt(_localctx, 25);
				{
				setState(194);
				lambdaFamily();
				setState(196);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
				case 1:
					{
					setState(195);
					match(WS);
					}
					break;
				}
				}
				break;
			case 26:
				_localctx = new BlankContext(_localctx);
				enterOuterAlt(_localctx, 26);
				{
				setState(198);
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
			setState(201);
			match(ID);
			setState(206);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(202);
					match(COMMA);
					setState(203);
					match(ID);
					}
					} 
				}
				setState(208);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
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
			setState(216);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				_localctx = new TipoIntContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(209);
				match(INT);
				}
				break;
			case FLOAT:
				_localctx = new TipoFloatContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(210);
				match(FLOAT);
				}
				break;
			case STRING:
				_localctx = new TipoStringContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(211);
				match(STRING);
				}
				break;
			case BOOL:
				_localctx = new TipoBoolContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(212);
				match(BOOL);
				}
				break;
			case MATRIX:
				_localctx = new TipoMatrixContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(213);
				match(MATRIX);
				}
				break;
			case VECTOR:
				_localctx = new TipoVectorContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(214);
				match(VECTOR);
				}
				break;
			case TWM:
				_localctx = new TipoTMWContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(215);
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
		public TerminalNode DOT() { return getToken(StarParser.DOT, 0); }
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
			setState(218);
			match(ALGORITHM);
			setState(219);
			match(ID);
			setState(224);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LEFTP) {
				{
				setState(220);
				match(LEFTP);
				setState(221);
				idlist();
				setState(222);
				match(RIGHTP);
				}
			}

			setState(226);
			match(COLON);
			setState(228);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(227);
				match(WS);
				}
			}

			setState(230);
			statement();
			setState(231);
			match(DOT);
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
			setState(247);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(233);
				block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(234);
				read_statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(235);
				fread_statement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(236);
				write_statement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(237);
				fwrite_statement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(238);
				while_statement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(239);
				if_statement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(240);
				for_statement();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(241);
				fun_statement();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(242);
				usefunction();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(243);
				assignment_statement();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(244);
				return_statement();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(245);
				algexpr(0);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(246);
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
			setState(255);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(249);
				match(RETURN);
				setState(250);
				recursiveCall();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(251);
				match(RETURN);
				setState(252);
				usefunction();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(253);
				match(RETURN);
				setState(254);
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
			setState(257);
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
			setState(259);
			match(WHILE);
			setState(260);
			bexpression(0);
			setState(261);
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
			setState(263);
			match(IF);
			setState(264);
			bexpression(0);
			setState(265);
			statement();
			setState(267);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				{
				setState(266);
				match(WS);
				}
				break;
			}
			setState(274);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				{
				setState(269);
				match(ELSE);
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
			setState(298);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(276);
				match(FOR);
				setState(277);
				assignment_statement();
				setState(278);
				match(T__0);
				setState(279);
				bexpression(0);
				setState(280);
				match(T__0);
				setState(281);
				assignment_statement();
				setState(282);
				match(T__0);
				setState(284);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(283);
					match(WS);
					}
				}

				setState(286);
				statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(288);
				match(FOR);
				setState(289);
				match(LEFTP);
				setState(290);
				assignment_statement();
				setState(291);
				match(T__0);
				setState(292);
				bexpression(0);
				setState(293);
				match(T__0);
				setState(294);
				assignment_statement();
				setState(295);
				match(RIGHTP);
				setState(296);
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
			setState(300);
			match(DEF);
			setState(301);
			match(ID);
			setState(302);
			match(LEFTP);
			setState(303);
			idlist();
			setState(304);
			match(RIGHTP);
			setState(305);
			match(COLON);
			setState(307);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(306);
				match(WS);
				}
			}

			setState(309);
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
			setState(311);
			algexpr(0);
			setState(312);
			((RelexprContext)_localctx).opl = _input.LT(1);
			_la = _input.LA(1);
			if ( !(((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & 63L) != 0)) ) {
				((RelexprContext)_localctx).opl = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(313);
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

			setState(316);
			bterm(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(323);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Bexp1Context(new BexpressionContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_bexpression);
					setState(318);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(319);
					match(OR);
					setState(320);
					bterm(0);
					}
					} 
				}
				setState(325);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
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

			setState(327);
			bfactor();
			}
			_ctx.stop = _input.LT(-1);
			setState(334);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Bterm1Context(new BtermContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_bterm);
					setState(329);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(330);
					match(AND);
					setState(331);
					bfactor();
					}
					} 
				}
				setState(336);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
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
			setState(351);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				_localctx = new BNegContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(337);
				match(NOT);
				setState(338);
				bfactor();
				}
				break;
			case 2:
				_localctx = new BParenthesisContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(339);
				match(LEFTP);
				setState(340);
				bexpression(0);
				setState(341);
				match(RIGHTP);
				}
				break;
			case 3:
				_localctx = new BIDContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(343);
				match(ID);
				}
				break;
			case 4:
				_localctx = new BTrueContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(344);
				match(TRUE);
				}
				break;
			case 5:
				_localctx = new BFalseContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(345);
				match(FALSE);
				}
				break;
			case 6:
				_localctx = new RelationalsContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(346);
				relexpr();
				}
				break;
			case 7:
				_localctx = new RelParenthesisContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(347);
				match(LEFTP);
				setState(348);
				relexpr();
				setState(349);
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
			setState(362);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(353);
				match(READ);
				setState(354);
				match(LEFTP);
				setState(355);
				idlist();
				setState(356);
				match(RIGHTP);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(358);
				match(READ);
				setState(359);
				match(LEFTP);
				setState(360);
				match(CADENA);
				setState(361);
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
			setState(408);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(364);
				match(WRITE);
				setState(365);
				match(LEFTP);
				setState(366);
				idlist();
				setState(367);
				match(RIGHTP);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(369);
				match(WRITE);
				setState(370);
				match(LEFTP);
				setState(371);
				algexpr(0);
				setState(372);
				match(RIGHTP);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(374);
				match(WRITE);
				setState(375);
				match(LEFTP);
				setState(376);
				match(CADENA);
				setState(377);
				match(RIGHTP);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(378);
				match(WRITE);
				setState(379);
				match(LEFTP);
				setState(380);
				array();
				setState(381);
				match(T__1);
				setState(382);
				match(INTEGER);
				setState(383);
				match(T__2);
				setState(384);
				match(RIGHTP);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(386);
				match(WRITE);
				setState(387);
				match(LEFTP);
				setState(388);
				usefunction();
				setState(389);
				match(RIGHTP);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(391);
				match(WRITE);
				setState(392);
				match(LEFTP);
				setState(393);
				arrayexpr();
				setState(394);
				match(RIGHTP);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(396);
				match(WRITE);
				setState(397);
				match(LEFTP);
				setState(398);
				matrix();
				setState(402); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(399);
					match(T__1);
					setState(400);
					match(INTEGER);
					setState(401);
					match(T__2);
					}
					}
					setState(404); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__1 );
				setState(406);
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
			setState(482);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(410);
				match(FWRITE);
				setState(411);
				match(LEFTP);
				setState(412);
				idlist();
				setState(414);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(413);
					match(COMMA);
					}
				}

				setState(416);
				match(CADENA);
				setState(417);
				match(RIGHTP);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(419);
				match(FWRITE);
				setState(420);
				match(LEFTP);
				setState(421);
				algexpr(0);
				setState(423);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(422);
					match(COMMA);
					}
				}

				setState(425);
				match(CADENA);
				setState(426);
				match(RIGHTP);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(428);
				match(FWRITE);
				setState(429);
				match(LEFTP);
				setState(430);
				match(CADENA);
				setState(432);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(431);
					match(COMMA);
					}
				}

				setState(434);
				match(CADENA);
				setState(435);
				match(RIGHTP);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(436);
				match(FWRITE);
				setState(437);
				match(LEFTP);
				setState(438);
				array();
				setState(440);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(439);
					match(COMMA);
					}
				}

				setState(442);
				match(CADENA);
				setState(443);
				match(T__1);
				setState(444);
				match(INTEGER);
				setState(445);
				match(T__2);
				setState(446);
				match(RIGHTP);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(448);
				match(FWRITE);
				setState(449);
				match(LEFTP);
				setState(450);
				usefunction();
				setState(452);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(451);
					match(COMMA);
					}
				}

				setState(454);
				match(CADENA);
				setState(455);
				match(RIGHTP);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(457);
				match(FWRITE);
				setState(458);
				match(LEFTP);
				setState(459);
				arrayexpr();
				setState(461);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(460);
					match(COMMA);
					}
				}

				setState(463);
				match(CADENA);
				setState(464);
				match(RIGHTP);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(466);
				match(FWRITE);
				setState(467);
				match(LEFTP);
				setState(468);
				matrix();
				setState(472); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(469);
					match(T__1);
					setState(470);
					match(INTEGER);
					setState(471);
					match(T__2);
					}
					}
					setState(474); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__1 );
				setState(477);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(476);
					match(COMMA);
					}
				}

				setState(479);
				match(CADENA);
				setState(480);
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
			setState(501);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(484);
				match(FREAD);
				setState(485);
				match(LEFTP);
				setState(486);
				idlist();
				setState(487);
				match(COMMA);
				setState(489);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CADENA) {
					{
					setState(488);
					match(CADENA);
					}
				}

				setState(491);
				match(RIGHTP);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(493);
				match(FREAD);
				setState(494);
				match(LEFTP);
				setState(495);
				match(CADENA);
				setState(496);
				match(COMMA);
				setState(498);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CADENA) {
					{
					setState(497);
					match(CADENA);
					}
				}

				setState(500);
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
			setState(503);
			match(T__3);
			setState(505);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(504);
				match(WS);
				}
			}

			setState(514);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -8796093022192L) != 0) || ((((_la - 78)) & ~0x3f) == 0 && ((1L << (_la - 78)) & 14755457L) != 0)) {
				{
				{
				setState(507);
				statement();
				setState(508);
				match(T__0);
				setState(510);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(509);
					match(WS);
					}
				}

				}
				}
				setState(516);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(517);
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
			setState(531);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(519);
				match(T__1);
				setState(524); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(520);
					array();
					setState(522);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==COMMA) {
						{
						setState(521);
						match(COMMA);
						}
					}

					}
					}
					setState(526); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 4230920743682052L) != 0) || _la==ID );
				setState(528);
				match(T__2);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(530);
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
		public XOperationsContext xOperations() {
			return getRuleContext(XOperationsContext.class,0);
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
			setState(547);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(533);
				match(T__1);
				setState(538); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(534);
					algexpr(0);
					setState(536);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==COMMA) {
						{
						setState(535);
						match(COMMA);
						}
					}

					}
					}
					setState(540); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 46)) & ~0x3f) == 0 && ((1L << (_la - 46)) & 63367054132019139L) != 0) );
				setState(542);
				match(T__2);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(544);
				match(ID);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(545);
				arrayexpr();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(546);
				xOperations();
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
			setState(564);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(549);
				match(ID);
				setState(550);
				match(T__5);
				setState(551);
				usefunction();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(552);
				match(ID);
				setState(553);
				match(T__5);
				setState(554);
				algexpr(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(555);
				match(ID);
				setState(556);
				match(T__5);
				setState(557);
				match(CADENA);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(558);
				match(ID);
				setState(559);
				match(T__5);
				setState(560);
				matrix();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(561);
				match(ID);
				setState(562);
				match(T__5);
				setState(563);
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
			setState(569);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(566);
				algexpr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(567);
				bexpression(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(568);
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
			setState(612);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ARRAYADD:
				enterOuterAlt(_localctx, 1);
				{
				setState(571);
				match(ARRAYADD);
				setState(572);
				match(LEFTP);
				setState(573);
				array();
				setState(575);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(574);
					match(COMMA);
					}
				}

				setState(577);
				array();
				setState(578);
				match(RIGHTP);
				}
				break;
			case ARRAYSIZE:
				enterOuterAlt(_localctx, 2);
				{
				setState(580);
				match(ARRAYSIZE);
				setState(581);
				match(LEFTP);
				setState(582);
				array();
				setState(583);
				match(RIGHTP);
				}
				break;
			case ARRAYSUBS:
				enterOuterAlt(_localctx, 3);
				{
				setState(585);
				match(ARRAYSUBS);
				setState(586);
				match(LEFTP);
				setState(587);
				array();
				setState(589);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(588);
					match(COMMA);
					}
				}

				setState(591);
				array();
				setState(592);
				match(RIGHTP);
				}
				break;
			case ARRAYDOT:
				enterOuterAlt(_localctx, 4);
				{
				setState(594);
				match(ARRAYDOT);
				setState(595);
				match(LEFTP);
				setState(596);
				array();
				setState(598);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(597);
					match(COMMA);
					}
				}

				setState(600);
				array();
				setState(601);
				match(RIGHTP);
				}
				break;
			case ARRAYCROSS:
				enterOuterAlt(_localctx, 5);
				{
				setState(603);
				match(ARRAYCROSS);
				setState(604);
				match(LEFTP);
				setState(605);
				array();
				setState(607);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(606);
					match(COMMA);
					}
				}

				setState(609);
				array();
				setState(610);
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
			setState(617);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ARRAYLIST:
				enterOuterAlt(_localctx, 1);
				{
				setState(614);
				match(ARRAYLIST);
				setState(615);
				match(ID);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(616);
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
			setState(646);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(619);
				match(ID);
				setState(620);
				match(LADD);
				setState(621);
				match(LEFTP);
				setState(622);
				array();
				setState(623);
				match(RIGHTP);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(625);
				match(ID);
				setState(626);
				match(LDELETE);
				setState(627);
				match(LEFTP);
				setState(628);
				array();
				setState(629);
				match(RIGHTP);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(631);
				match(ID);
				setState(632);
				match(LGET);
				setState(633);
				match(LEFTP);
				setState(634);
				match(INTEGER);
				setState(635);
				match(RIGHTP);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(636);
				match(ID);
				setState(637);
				match(LCONTAINS);
				setState(638);
				match(LEFTP);
				setState(639);
				array();
				setState(640);
				match(RIGHTP);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(642);
				match(ID);
				setState(643);
				match(LSIZE);
				setState(644);
				match(LEFTP);
				setState(645);
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
			setState(693);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SIN:
				enterOuterAlt(_localctx, 1);
				{
				setState(648);
				match(SIN);
				setState(649);
				match(LEFTP);
				setState(650);
				algexpr(0);
				setState(651);
				match(RIGHTP);
				}
				break;
			case COS:
				enterOuterAlt(_localctx, 2);
				{
				setState(653);
				match(COS);
				setState(654);
				match(LEFTP);
				setState(655);
				algexpr(0);
				setState(656);
				match(RIGHTP);
				}
				break;
			case TAN:
				enterOuterAlt(_localctx, 3);
				{
				setState(658);
				match(TAN);
				setState(659);
				match(LEFTP);
				setState(660);
				algexpr(0);
				setState(661);
				match(RIGHTP);
				}
				break;
			case ARCSIN:
				enterOuterAlt(_localctx, 4);
				{
				setState(663);
				match(ARCSIN);
				setState(664);
				match(LEFTP);
				setState(665);
				algexpr(0);
				setState(666);
				match(RIGHTP);
				}
				break;
			case ACOS:
				enterOuterAlt(_localctx, 5);
				{
				setState(668);
				match(ACOS);
				setState(669);
				match(LEFTP);
				setState(670);
				algexpr(0);
				setState(671);
				match(RIGHTP);
				}
				break;
			case ARCTAN:
				enterOuterAlt(_localctx, 6);
				{
				setState(673);
				match(ARCTAN);
				setState(674);
				match(LEFTP);
				setState(675);
				algexpr(0);
				setState(676);
				match(RIGHTP);
				}
				break;
			case SINH:
				enterOuterAlt(_localctx, 7);
				{
				setState(678);
				match(SINH);
				setState(679);
				match(LEFTP);
				setState(680);
				algexpr(0);
				setState(681);
				match(RIGHTP);
				}
				break;
			case COSH:
				enterOuterAlt(_localctx, 8);
				{
				setState(683);
				match(COSH);
				setState(684);
				match(LEFTP);
				setState(685);
				algexpr(0);
				setState(686);
				match(RIGHTP);
				}
				break;
			case TANH:
				enterOuterAlt(_localctx, 9);
				{
				setState(688);
				match(TANH);
				setState(689);
				match(LEFTP);
				setState(690);
				algexpr(0);
				setState(691);
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
			setState(697);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(695);
				mathFunction();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(696);
				usefunction();
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
	public static class LambdaFamilyContext extends ParserRuleContext {
		public TerminalNode LAMBDA() { return getToken(StarParser.LAMBDA, 0); }
		public TerminalNode PERCENTIL() { return getToken(StarParser.PERCENTIL, 0); }
		public TerminalNode LEFTP() { return getToken(StarParser.LEFTP, 0); }
		public List<TerminalNode> REALNUMBER() { return getTokens(StarParser.REALNUMBER); }
		public TerminalNode REALNUMBER(int i) {
			return getToken(StarParser.REALNUMBER, i);
		}
		public TerminalNode RIGHTP() { return getToken(StarParser.RIGHTP, 0); }
		public List<TerminalNode> COMMA() { return getTokens(StarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(StarParser.COMMA, i);
		}
		public TerminalNode DENSITY() { return getToken(StarParser.DENSITY, 0); }
		public LambdaFamilyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaFamily; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StarVisitor ) return ((StarVisitor<? extends T>)visitor).visitLambdaFamily(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LambdaFamilyContext lambdaFamily() throws RecognitionException {
		LambdaFamilyContext _localctx = new LambdaFamilyContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_lambdaFamily);
		int _la;
		try {
			setState(737);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(699);
				match(LAMBDA);
				setState(700);
				match(PERCENTIL);
				setState(701);
				match(LEFTP);
				setState(702);
				match(REALNUMBER);
				setState(703);
				match(T__0);
				setState(704);
				match(REALNUMBER);
				setState(706);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(705);
					match(COMMA);
					}
				}

				setState(708);
				match(REALNUMBER);
				setState(710);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(709);
					match(COMMA);
					}
				}

				setState(712);
				match(REALNUMBER);
				setState(714);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(713);
					match(COMMA);
					}
				}

				setState(716);
				match(REALNUMBER);
				setState(717);
				match(RIGHTP);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(718);
				match(LAMBDA);
				setState(719);
				match(DENSITY);
				setState(720);
				match(LEFTP);
				setState(721);
				match(REALNUMBER);
				setState(722);
				match(T__0);
				setState(723);
				match(REALNUMBER);
				setState(725);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(724);
					match(COMMA);
					}
				}

				setState(727);
				match(REALNUMBER);
				setState(729);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(728);
					match(COMMA);
					}
				}

				setState(731);
				match(REALNUMBER);
				setState(733);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(732);
					match(COMMA);
					}
				}

				setState(735);
				match(REALNUMBER);
				setState(736);
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
		enterRule(_localctx, 62, RULE_mathFunction);
		try {
			setState(742);
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
				setState(739);
				trigFunction();
				}
				break;
			case LN:
				enterOuterAlt(_localctx, 2);
				{
				setState(740);
				logFunction();
				}
				break;
			case RANDOM:
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(741);
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
		enterRule(_localctx, 64, RULE_probFunction);
		try {
			setState(749);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(744);
				randomFunction();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(745);
				densityFunction();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(746);
				distributionFunction();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(747);
				percentilFunction();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(748);
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
		enterRule(_localctx, 66, RULE_twoWaysModel);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(751);
			match(TWM);
			setState(752);
			match(ID);
			setState(753);
			match(LEFTP);
			setState(754);
			match(REALNUMBER);
			setState(756);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(755);
				match(COMMA);
				}
			}

			setState(758);
			array();
			setState(760);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(759);
				match(COMMA);
				}
			}

			setState(762);
			array();
			setState(764);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(763);
				match(COMMA);
				}
			}

			setState(766);
			arraylist();
			setState(767);
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
		public NOperationsContext nOperations() {
			return getRuleContext(NOperationsContext.class,0);
		}
		public XOperationsContext xOperations() {
			return getRuleContext(XOperationsContext.class,0);
		}
		public ROperationsContext rOperations() {
			return getRuleContext(ROperationsContext.class,0);
		}
		public TerminalNode ID() { return getToken(StarParser.ID, 0); }
		public TerminalNode ALPHA() { return getToken(StarParser.ALPHA, 0); }
		public TerminalNode LEFTP() { return getToken(StarParser.LEFTP, 0); }
		public TerminalNode RIGHTP() { return getToken(StarParser.RIGHTP, 0); }
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
		enterRule(_localctx, 68, RULE_twoWaysModelop);
		try {
			setState(776);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,88,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(769);
				nOperations();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(770);
				xOperations();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(771);
				rOperations();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(772);
				match(ID);
				setState(773);
				match(ALPHA);
				setState(774);
				match(LEFTP);
				setState(775);
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
	public static class XOperationsContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(StarParser.ID, 0); }
		public TerminalNode X() { return getToken(StarParser.X, 0); }
		public TerminalNode LEFTP() { return getToken(StarParser.LEFTP, 0); }
		public TerminalNode DOTDOT() { return getToken(StarParser.DOTDOT, 0); }
		public TerminalNode RIGHTP() { return getToken(StarParser.RIGHTP, 0); }
		public TerminalNode INTEGER() { return getToken(StarParser.INTEGER, 0); }
		public TerminalNode IDOT() { return getToken(StarParser.IDOT, 0); }
		public TerminalNode DOTJ() { return getToken(StarParser.DOTJ, 0); }
		public TerminalNode R() { return getToken(StarParser.R, 0); }
		public TerminalNode C() { return getToken(StarParser.C, 0); }
		public XOperationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_xOperations; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StarVisitor ) return ((StarVisitor<? extends T>)visitor).visitXOperations(this);
			else return visitor.visitChildren(this);
		}
	}

	public final XOperationsContext xOperations() throws RecognitionException {
		XOperationsContext _localctx = new XOperationsContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_xOperations);
		try {
			setState(817);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,89,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(778);
				match(ID);
				setState(779);
				match(X);
				setState(780);
				match(LEFTP);
				setState(781);
				match(DOTDOT);
				setState(782);
				match(RIGHTP);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(783);
				match(ID);
				setState(784);
				match(X);
				setState(785);
				match(LEFTP);
				setState(786);
				match(INTEGER);
				setState(787);
				match(IDOT);
				setState(788);
				match(RIGHTP);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(789);
				match(ID);
				setState(790);
				match(X);
				setState(791);
				match(LEFTP);
				setState(792);
				match(DOTJ);
				setState(793);
				match(INTEGER);
				setState(794);
				match(RIGHTP);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(795);
				match(ID);
				setState(796);
				match(R);
				setState(797);
				match(LEFTP);
				setState(798);
				match(DOTDOT);
				setState(799);
				match(RIGHTP);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(800);
				match(ID);
				setState(801);
				match(R);
				setState(802);
				match(LEFTP);
				setState(803);
				match(INTEGER);
				setState(804);
				match(IDOT);
				setState(805);
				match(RIGHTP);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(806);
				match(ID);
				setState(807);
				match(R);
				setState(808);
				match(LEFTP);
				setState(809);
				match(DOTJ);
				setState(810);
				match(INTEGER);
				setState(811);
				match(RIGHTP);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(812);
				match(ID);
				setState(813);
				match(C);
				setState(814);
				match(LEFTP);
				setState(815);
				match(INTEGER);
				setState(816);
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
	public static class NOperationsContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(StarParser.ID, 0); }
		public TerminalNode N() { return getToken(StarParser.N, 0); }
		public TerminalNode LEFTP() { return getToken(StarParser.LEFTP, 0); }
		public TerminalNode DOTDOT() { return getToken(StarParser.DOTDOT, 0); }
		public TerminalNode RIGHTP() { return getToken(StarParser.RIGHTP, 0); }
		public List<TerminalNode> INTEGER() { return getTokens(StarParser.INTEGER); }
		public TerminalNode INTEGER(int i) {
			return getToken(StarParser.INTEGER, i);
		}
		public TerminalNode IDOT() { return getToken(StarParser.IDOT, 0); }
		public TerminalNode DOTJ() { return getToken(StarParser.DOTJ, 0); }
		public List<TerminalNode> COMMA() { return getTokens(StarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(StarParser.COMMA, i);
		}
		public TerminalNode X() { return getToken(StarParser.X, 0); }
		public TerminalNode XAVERAGE() { return getToken(StarParser.XAVERAGE, 0); }
		public TerminalNode DOTDOTSPACE() { return getToken(StarParser.DOTDOTSPACE, 0); }
		public List<TerminalNode> DOT() { return getTokens(StarParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(StarParser.DOT, i);
		}
		public TerminalNode DOTDOTDOT() { return getToken(StarParser.DOTDOTDOT, 0); }
		public NOperationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nOperations; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StarVisitor ) return ((StarVisitor<? extends T>)visitor).visitNOperations(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NOperationsContext nOperations() throws RecognitionException {
		NOperationsContext _localctx = new NOperationsContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_nOperations);
		int _la;
		try {
			setState(905);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,94,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(819);
				match(ID);
				setState(820);
				match(N);
				setState(821);
				match(LEFTP);
				setState(822);
				match(DOTDOT);
				setState(823);
				match(RIGHTP);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(824);
				match(ID);
				setState(825);
				match(N);
				setState(826);
				match(LEFTP);
				setState(827);
				match(INTEGER);
				setState(828);
				match(IDOT);
				setState(829);
				match(RIGHTP);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(830);
				match(ID);
				setState(831);
				match(N);
				setState(832);
				match(LEFTP);
				setState(833);
				match(DOTJ);
				setState(834);
				match(INTEGER);
				setState(835);
				match(RIGHTP);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(836);
				match(ID);
				setState(837);
				match(N);
				setState(838);
				match(LEFTP);
				setState(839);
				match(INTEGER);
				setState(841);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(840);
					match(COMMA);
					}
				}

				setState(843);
				match(INTEGER);
				setState(845);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(844);
					match(COMMA);
					}
				}

				setState(847);
				match(INTEGER);
				setState(848);
				match(RIGHTP);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(849);
				match(ID);
				setState(850);
				match(X);
				setState(851);
				match(LEFTP);
				setState(852);
				match(INTEGER);
				setState(854);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(853);
					match(COMMA);
					}
				}

				setState(856);
				match(INTEGER);
				setState(857);
				match(IDOT);
				setState(858);
				match(RIGHTP);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(859);
				match(ID);
				setState(860);
				match(XAVERAGE);
				setState(861);
				match(LEFTP);
				setState(862);
				match(INTEGER);
				setState(864);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(863);
					match(COMMA);
					}
				}

				setState(866);
				match(INTEGER);
				setState(867);
				match(IDOT);
				setState(868);
				match(RIGHTP);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(869);
				match(ID);
				setState(870);
				match(X);
				setState(871);
				match(LEFTP);
				setState(872);
				match(INTEGER);
				setState(873);
				match(DOTDOTSPACE);
				setState(874);
				match(RIGHTP);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(875);
				match(ID);
				setState(876);
				match(X);
				setState(877);
				match(LEFTP);
				setState(878);
				match(DOT);
				setState(879);
				match(INTEGER);
				setState(880);
				match(DOT);
				setState(881);
				match(RIGHTP);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(882);
				match(ID);
				setState(883);
				match(XAVERAGE);
				setState(884);
				match(LEFTP);
				setState(885);
				match(INTEGER);
				setState(886);
				match(DOTDOTSPACE);
				setState(887);
				match(RIGHTP);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(888);
				match(ID);
				setState(889);
				match(XAVERAGE);
				setState(890);
				match(LEFTP);
				setState(891);
				match(DOT);
				setState(892);
				match(INTEGER);
				setState(893);
				match(DOT);
				setState(894);
				match(RIGHTP);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(895);
				match(ID);
				setState(896);
				match(X);
				setState(897);
				match(LEFTP);
				setState(898);
				match(DOTDOTDOT);
				setState(899);
				match(RIGHTP);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(900);
				match(ID);
				setState(901);
				match(XAVERAGE);
				setState(902);
				match(LEFTP);
				setState(903);
				match(DOTDOTDOT);
				setState(904);
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
	public static class ROperationsContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(StarParser.ID, 0); }
		public TerminalNode R() { return getToken(StarParser.R, 0); }
		public TerminalNode LEFTP() { return getToken(StarParser.LEFTP, 0); }
		public List<TerminalNode> INTEGER() { return getTokens(StarParser.INTEGER); }
		public TerminalNode INTEGER(int i) {
			return getToken(StarParser.INTEGER, i);
		}
		public TerminalNode RIGHTP() { return getToken(StarParser.RIGHTP, 0); }
		public List<TerminalNode> COMMA() { return getTokens(StarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(StarParser.COMMA, i);
		}
		public TerminalNode IDOT() { return getToken(StarParser.IDOT, 0); }
		public TerminalNode RAVERAGE() { return getToken(StarParser.RAVERAGE, 0); }
		public TerminalNode DOTDOTSPACE() { return getToken(StarParser.DOTDOTSPACE, 0); }
		public List<TerminalNode> DOT() { return getTokens(StarParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(StarParser.DOT, i);
		}
		public TerminalNode DOTDOTDOT() { return getToken(StarParser.DOTDOTDOT, 0); }
		public ROperationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rOperations; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StarVisitor ) return ((StarVisitor<? extends T>)visitor).visitROperations(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ROperationsContext rOperations() throws RecognitionException {
		ROperationsContext _localctx = new ROperationsContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_rOperations);
		int _la;
		try {
			setState(976);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,99,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(907);
				match(ID);
				setState(908);
				match(R);
				setState(909);
				match(LEFTP);
				setState(910);
				match(INTEGER);
				setState(912);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(911);
					match(COMMA);
					}
				}

				setState(914);
				match(INTEGER);
				setState(916);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(915);
					match(COMMA);
					}
				}

				setState(918);
				match(INTEGER);
				setState(919);
				match(RIGHTP);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(920);
				match(ID);
				setState(921);
				match(R);
				setState(922);
				match(LEFTP);
				setState(923);
				match(INTEGER);
				setState(925);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(924);
					match(COMMA);
					}
				}

				setState(927);
				match(INTEGER);
				setState(928);
				match(IDOT);
				setState(929);
				match(RIGHTP);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(930);
				match(ID);
				setState(931);
				match(RAVERAGE);
				setState(932);
				match(LEFTP);
				setState(933);
				match(INTEGER);
				setState(935);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(934);
					match(COMMA);
					}
				}

				setState(937);
				match(INTEGER);
				setState(938);
				match(IDOT);
				setState(939);
				match(RIGHTP);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(940);
				match(ID);
				setState(941);
				match(R);
				setState(942);
				match(LEFTP);
				setState(943);
				match(INTEGER);
				setState(944);
				match(DOTDOTSPACE);
				setState(945);
				match(RIGHTP);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(946);
				match(ID);
				setState(947);
				match(R);
				setState(948);
				match(LEFTP);
				setState(949);
				match(DOT);
				setState(950);
				match(INTEGER);
				setState(951);
				match(DOT);
				setState(952);
				match(RIGHTP);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(953);
				match(ID);
				setState(954);
				match(RAVERAGE);
				setState(955);
				match(LEFTP);
				setState(956);
				match(INTEGER);
				setState(957);
				match(DOTDOTSPACE);
				setState(958);
				match(RIGHTP);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(959);
				match(ID);
				setState(960);
				match(RAVERAGE);
				setState(961);
				match(LEFTP);
				setState(962);
				match(DOT);
				setState(963);
				match(INTEGER);
				setState(964);
				match(DOT);
				setState(965);
				match(RIGHTP);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(966);
				match(ID);
				setState(967);
				match(R);
				setState(968);
				match(LEFTP);
				setState(969);
				match(DOTDOTDOT);
				setState(970);
				match(RIGHTP);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(971);
				match(ID);
				setState(972);
				match(RAVERAGE);
				setState(973);
				match(LEFTP);
				setState(974);
				match(DOTDOTDOT);
				setState(975);
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
		public TerminalNode ID() { return getToken(StarParser.ID, 0); }
		public TerminalNode DENSITY() { return getToken(StarParser.DENSITY, 0); }
		public TerminalNode LEFTP() { return getToken(StarParser.LEFTP, 0); }
		public TerminalNode REALNUMBER() { return getToken(StarParser.REALNUMBER, 0); }
		public TerminalNode RIGHTP() { return getToken(StarParser.RIGHTP, 0); }
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
		enterRule(_localctx, 76, RULE_densityFunction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(978);
			match(ID);
			setState(979);
			match(DENSITY);
			setState(980);
			match(LEFTP);
			setState(981);
			match(REALNUMBER);
			setState(982);
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
	public static class MomentumGenerationFunctionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(StarParser.ID, 0); }
		public TerminalNode MGF() { return getToken(StarParser.MGF, 0); }
		public TerminalNode LEFTP() { return getToken(StarParser.LEFTP, 0); }
		public List<TerminalNode> REALNUMBER() { return getTokens(StarParser.REALNUMBER); }
		public TerminalNode REALNUMBER(int i) {
			return getToken(StarParser.REALNUMBER, i);
		}
		public TerminalNode RIGHTP() { return getToken(StarParser.RIGHTP, 0); }
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
		enterRule(_localctx, 78, RULE_momentumGenerationFunction);
		try {
			setState(995);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,100,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(984);
				match(ID);
				setState(985);
				match(MGF);
				setState(986);
				match(LEFTP);
				setState(987);
				match(REALNUMBER);
				setState(988);
				match(RIGHTP);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(989);
				match(ID);
				setState(990);
				match(MGF);
				setState(991);
				match(LEFTP);
				setState(992);
				match(REALNUMBER);
				setState(993);
				match(REALNUMBER);
				setState(994);
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
	public static class FamilyDistributionContext extends ParserRuleContext {
		public TerminalNode NORMALDISTRIBUTION() { return getToken(StarParser.NORMALDISTRIBUTION, 0); }
		public TerminalNode ID() { return getToken(StarParser.ID, 0); }
		public TerminalNode LEFTP() { return getToken(StarParser.LEFTP, 0); }
		public List<TerminalNode> REALNUMBER() { return getTokens(StarParser.REALNUMBER); }
		public TerminalNode REALNUMBER(int i) {
			return getToken(StarParser.REALNUMBER, i);
		}
		public TerminalNode RIGHTP() { return getToken(StarParser.RIGHTP, 0); }
		public TerminalNode COMMA() { return getToken(StarParser.COMMA, 0); }
		public TerminalNode TDISTRIBUTION() { return getToken(StarParser.TDISTRIBUTION, 0); }
		public TerminalNode INTEGER() { return getToken(StarParser.INTEGER, 0); }
		public TerminalNode POISSONDISTRIBUTION() { return getToken(StarParser.POISSONDISTRIBUTION, 0); }
		public TerminalNode CHISQUAREDDISTRIBUTION() { return getToken(StarParser.CHISQUAREDDISTRIBUTION, 0); }
		public TerminalNode GEOMETRICDISTRIBUTION() { return getToken(StarParser.GEOMETRICDISTRIBUTION, 0); }
		public TerminalNode GAMMADISTRIBUTION() { return getToken(StarParser.GAMMADISTRIBUTION, 0); }
		public FamilyDistributionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_familyDistribution; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StarVisitor ) return ((StarVisitor<? extends T>)visitor).visitFamilyDistribution(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FamilyDistributionContext familyDistribution() throws RecognitionException {
		FamilyDistributionContext _localctx = new FamilyDistributionContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_familyDistribution);
		int _la;
		try {
			setState(1035);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NORMALDISTRIBUTION:
				enterOuterAlt(_localctx, 1);
				{
				setState(997);
				match(NORMALDISTRIBUTION);
				setState(998);
				match(ID);
				setState(999);
				match(LEFTP);
				setState(1000);
				match(REALNUMBER);
				setState(1002);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(1001);
					match(COMMA);
					}
				}

				setState(1004);
				match(REALNUMBER);
				setState(1005);
				match(RIGHTP);
				}
				break;
			case TDISTRIBUTION:
				enterOuterAlt(_localctx, 2);
				{
				setState(1006);
				match(TDISTRIBUTION);
				setState(1007);
				match(ID);
				setState(1008);
				match(LEFTP);
				setState(1009);
				match(INTEGER);
				setState(1010);
				match(RIGHTP);
				}
				break;
			case POISSONDISTRIBUTION:
				enterOuterAlt(_localctx, 3);
				{
				setState(1011);
				match(POISSONDISTRIBUTION);
				setState(1012);
				match(ID);
				setState(1013);
				match(LEFTP);
				setState(1014);
				match(REALNUMBER);
				setState(1015);
				match(RIGHTP);
				}
				break;
			case CHISQUAREDDISTRIBUTION:
				enterOuterAlt(_localctx, 4);
				{
				setState(1016);
				match(CHISQUAREDDISTRIBUTION);
				setState(1017);
				match(ID);
				setState(1018);
				match(LEFTP);
				setState(1019);
				match(INTEGER);
				setState(1020);
				match(RIGHTP);
				}
				break;
			case GEOMETRICDISTRIBUTION:
				enterOuterAlt(_localctx, 5);
				{
				setState(1021);
				match(GEOMETRICDISTRIBUTION);
				setState(1022);
				match(ID);
				setState(1023);
				match(LEFTP);
				setState(1024);
				match(REALNUMBER);
				setState(1025);
				match(RIGHTP);
				}
				break;
			case GAMMADISTRIBUTION:
				enterOuterAlt(_localctx, 6);
				{
				setState(1026);
				match(GAMMADISTRIBUTION);
				setState(1027);
				match(ID);
				setState(1028);
				match(LEFTP);
				setState(1029);
				match(REALNUMBER);
				setState(1031);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(1030);
					match(COMMA);
					}
				}

				setState(1033);
				match(REALNUMBER);
				setState(1034);
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
		public TerminalNode ID() { return getToken(StarParser.ID, 0); }
		public TerminalNode DISTRIBUTION() { return getToken(StarParser.DISTRIBUTION, 0); }
		public TerminalNode LEFTP() { return getToken(StarParser.LEFTP, 0); }
		public TerminalNode INTEGER() { return getToken(StarParser.INTEGER, 0); }
		public TerminalNode RIGHTP() { return getToken(StarParser.RIGHTP, 0); }
		public TerminalNode REALNUMBER() { return getToken(StarParser.REALNUMBER, 0); }
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
		enterRule(_localctx, 82, RULE_distributionFunction);
		try {
			setState(1047);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,104,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1037);
				match(ID);
				setState(1038);
				match(DISTRIBUTION);
				setState(1039);
				match(LEFTP);
				setState(1040);
				match(INTEGER);
				setState(1041);
				match(RIGHTP);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1042);
				match(ID);
				setState(1043);
				match(DISTRIBUTION);
				setState(1044);
				match(LEFTP);
				setState(1045);
				match(REALNUMBER);
				setState(1046);
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
	public static class PercentilFunctionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(StarParser.ID, 0); }
		public TerminalNode PERCENTIL() { return getToken(StarParser.PERCENTIL, 0); }
		public TerminalNode LEFTP() { return getToken(StarParser.LEFTP, 0); }
		public TerminalNode REALNUMBER() { return getToken(StarParser.REALNUMBER, 0); }
		public TerminalNode RIGHTP() { return getToken(StarParser.RIGHTP, 0); }
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
		enterRule(_localctx, 84, RULE_percentilFunction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1049);
			match(ID);
			setState(1050);
			match(PERCENTIL);
			setState(1051);
			match(LEFTP);
			setState(1052);
			match(REALNUMBER);
			setState(1053);
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
		enterRule(_localctx, 86, RULE_randomFunction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1055);
			match(RANDOM);
			setState(1056);
			match(LEFTP);
			setState(1057);
			match(REALNUMBER);
			setState(1058);
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
		enterRule(_localctx, 88, RULE_logFunction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1060);
			match(LN);
			setState(1061);
			match(LEFTP);
			setState(1062);
			algexpr(0);
			setState(1063);
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
		enterRule(_localctx, 90, RULE_usefunction);
		int _la;
		try {
			setState(1083);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,107,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1065);
				match(ID);
				setState(1066);
				match(LEFTP);
				setState(1071); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1067);
					algexpr(0);
					setState(1069);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==COMMA) {
						{
						setState(1068);
						match(COMMA);
						}
					}

					}
					}
					setState(1073); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 46)) & ~0x3f) == 0 && ((1L << (_la - 46)) & 63367054132019139L) != 0) );
				setState(1075);
				match(RIGHTP);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1077);
				match(ID);
				setState(1078);
				match(LEFTP);
				setState(1079);
				idlist();
				setState(1080);
				match(RIGHTP);
				setState(1081);
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
	public static class ROPContext extends AlgexprContext {
		public ROperationsContext rOperations() {
			return getRuleContext(ROperationsContext.class,0);
		}
		public ROPContext(AlgexprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StarVisitor ) return ((StarVisitor<? extends T>)visitor).visitROP(this);
			else return visitor.visitChildren(this);
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
	@SuppressWarnings("CheckReturnValue")
	public static class NOPContext extends AlgexprContext {
		public NOperationsContext nOperations() {
			return getRuleContext(NOperationsContext.class,0);
		}
		public NOPContext(AlgexprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StarVisitor ) return ((StarVisitor<? extends T>)visitor).visitNOP(this);
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
		int _startState = 92;
		enterRecursionRule(_localctx, 92, RULE_algexpr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1103);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,109,_ctx) ) {
			case 1:
				{
				_localctx = new NegationContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(1086);
				match(SUBS);
				setState(1087);
				algexpr(8);
				}
				break;
			case 2:
				{
				_localctx = new NumberContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1088);
				match(REALNUMBER);
				}
				break;
			case 3:
				{
				_localctx = new ENTContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1089);
				match(INTEGER);
				}
				break;
			case 4:
				{
				_localctx = new ROPContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1090);
				rOperations();
				}
				break;
			case 5:
				{
				_localctx = new NOPContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1091);
				nOperations();
				}
				break;
			case 6:
				{
				_localctx = new TrigfContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1092);
				function();
				}
				break;
			case 7:
				{
				_localctx = new ParenthesisContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1093);
				match(LEFTP);
				setState(1094);
				algexpr(0);
				setState(1095);
				match(RIGHTP);
				}
				break;
			case 8:
				{
				_localctx = new IdContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1097);
				match(ID);
				setState(1101);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,108,_ctx) ) {
				case 1:
					{
					setState(1098);
					match(T__1);
					setState(1099);
					match(INTEGER);
					setState(1100);
					match(T__2);
					}
					break;
				}
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1119);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,111,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1117);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,110,_ctx) ) {
					case 1:
						{
						_localctx = new PowerRootContext(new AlgexprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_algexpr);
						setState(1105);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(1106);
						match(POWER);
						setState(1107);
						algexpr(13);
						}
						break;
					case 2:
						{
						_localctx = new MulDivContext(new AlgexprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_algexpr);
						setState(1108);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(1109);
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
						setState(1110);
						algexpr(12);
						}
						break;
					case 3:
						{
						_localctx = new AddSubContext(new AlgexprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_algexpr);
						setState(1111);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(1112);
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
						setState(1113);
						algexpr(11);
						}
						break;
					case 4:
						{
						_localctx = new MdContext(new AlgexprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_algexpr);
						setState(1114);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(1115);
						match(MOD);
						setState(1116);
						algexpr(10);
						}
						break;
					}
					} 
				}
				setState(1121);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,111,_ctx);
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
	public static class StringOpContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(StarParser.STRING, 0); }
		public TerminalNode TOARRAY() { return getToken(StarParser.TOARRAY, 0); }
		public TerminalNode LEFTP() { return getToken(StarParser.LEFTP, 0); }
		public List<TerminalNode> ID() { return getTokens(StarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(StarParser.ID, i);
		}
		public TerminalNode RIGHTP() { return getToken(StarParser.RIGHTP, 0); }
		public TerminalNode LENGTH() { return getToken(StarParser.LENGTH, 0); }
		public TerminalNode CONCAT() { return getToken(StarParser.CONCAT, 0); }
		public TerminalNode SUBSTRING() { return getToken(StarParser.SUBSTRING, 0); }
		public List<TerminalNode> INTEGER() { return getTokens(StarParser.INTEGER); }
		public TerminalNode INTEGER(int i) {
			return getToken(StarParser.INTEGER, i);
		}
		public TerminalNode COMMA() { return getToken(StarParser.COMMA, 0); }
		public TerminalNode REPLACE() { return getToken(StarParser.REPLACE, 0); }
		public List<TerminalNode> CADENA() { return getTokens(StarParser.CADENA); }
		public TerminalNode CADENA(int i) {
			return getToken(StarParser.CADENA, i);
		}
		public StringOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringOp; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StarVisitor ) return ((StarVisitor<? extends T>)visitor).visitStringOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringOpContext stringOp() throws RecognitionException {
		StringOpContext _localctx = new StringOpContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_stringOp);
		int _la;
		try {
			setState(1156);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,114,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1122);
				match(STRING);
				setState(1123);
				match(TOARRAY);
				setState(1124);
				match(LEFTP);
				setState(1125);
				match(ID);
				setState(1126);
				match(RIGHTP);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1127);
				match(STRING);
				setState(1128);
				match(LENGTH);
				setState(1129);
				match(LEFTP);
				setState(1130);
				match(ID);
				setState(1131);
				match(RIGHTP);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1132);
				match(STRING);
				setState(1133);
				match(CONCAT);
				setState(1134);
				match(LEFTP);
				setState(1135);
				match(ID);
				setState(1136);
				match(ID);
				setState(1137);
				match(RIGHTP);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1138);
				match(ID);
				setState(1139);
				match(SUBSTRING);
				setState(1140);
				match(LEFTP);
				setState(1141);
				match(INTEGER);
				setState(1143);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(1142);
					match(COMMA);
					}
				}

				setState(1145);
				match(INTEGER);
				setState(1146);
				match(RIGHTP);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1147);
				match(ID);
				setState(1148);
				match(REPLACE);
				setState(1149);
				match(LEFTP);
				setState(1150);
				match(CADENA);
				setState(1152);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(1151);
					match(COMMA);
					}
				}

				setState(1154);
				match(CADENA);
				setState(1155);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 13:
			return bexpression_sempred((BexpressionContext)_localctx, predIndex);
		case 14:
			return bterm_sempred((BtermContext)_localctx, predIndex);
		case 46:
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
			return precpred(_ctx, 12);
		case 3:
			return precpred(_ctx, 11);
		case 4:
			return precpred(_ctx, 10);
		case 5:
			return precpred(_ctx, 9);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001f\u0487\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007,\u0002"+
		"-\u0007-\u0002.\u0007.\u0002/\u0007/\u0001\u0000\u0004\u0000b\b\u0000"+
		"\u000b\u0000\f\u0000c\u0001\u0001\u0001\u0001\u0003\u0001h\b\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0003\u0001m\b\u0001\u0001\u0001\u0001"+
		"\u0001\u0003\u0001q\b\u0001\u0001\u0001\u0001\u0001\u0003\u0001u\b\u0001"+
		"\u0001\u0001\u0001\u0001\u0003\u0001y\b\u0001\u0001\u0001\u0001\u0001"+
		"\u0003\u0001}\b\u0001\u0001\u0001\u0001\u0001\u0003\u0001\u0081\b\u0001"+
		"\u0001\u0001\u0001\u0001\u0003\u0001\u0085\b\u0001\u0001\u0001\u0001\u0001"+
		"\u0003\u0001\u0089\b\u0001\u0001\u0001\u0001\u0001\u0003\u0001\u008d\b"+
		"\u0001\u0001\u0001\u0001\u0001\u0003\u0001\u0091\b\u0001\u0001\u0001\u0001"+
		"\u0001\u0003\u0001\u0095\b\u0001\u0001\u0001\u0001\u0001\u0003\u0001\u0099"+
		"\b\u0001\u0001\u0001\u0001\u0001\u0003\u0001\u009d\b\u0001\u0001\u0001"+
		"\u0001\u0001\u0003\u0001\u00a1\b\u0001\u0001\u0001\u0001\u0001\u0003\u0001"+
		"\u00a5\b\u0001\u0001\u0001\u0001\u0001\u0003\u0001\u00a9\b\u0001\u0001"+
		"\u0001\u0001\u0001\u0003\u0001\u00ad\b\u0001\u0001\u0001\u0001\u0001\u0003"+
		"\u0001\u00b1\b\u0001\u0001\u0001\u0001\u0001\u0003\u0001\u00b5\b\u0001"+
		"\u0001\u0001\u0001\u0001\u0003\u0001\u00b9\b\u0001\u0001\u0001\u0001\u0001"+
		"\u0003\u0001\u00bd\b\u0001\u0001\u0001\u0001\u0001\u0003\u0001\u00c1\b"+
		"\u0001\u0001\u0001\u0001\u0001\u0003\u0001\u00c5\b\u0001\u0001\u0001\u0003"+
		"\u0001\u00c8\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002\u00cd"+
		"\b\u0002\n\u0002\f\u0002\u00d0\t\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003\u00d9\b\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0003\u0004\u00e1\b\u0004\u0001\u0004\u0001\u0004\u0003\u0004\u00e5\b"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003"+
		"\u0005\u00f8\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0003\u0006\u0100\b\u0006\u0001\u0007\u0001\u0007\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u010c"+
		"\b\t\u0001\t\u0001\t\u0003\t\u0110\b\t\u0001\t\u0003\t\u0113\b\t\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u011d"+
		"\b\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0003\n\u012b\b\n\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u0134"+
		"\b\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0005\r\u0142\b\r\n\r\f\r\u0145"+
		"\t\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0005\u000e\u014d\b\u000e\n\u000e\f\u000e\u0150\t\u000e\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0003\u000f\u0160\b\u000f\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0003\u0010\u016b\b\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0004\u0011\u0193\b\u0011"+
		"\u000b\u0011\f\u0011\u0194\u0001\u0011\u0001\u0011\u0003\u0011\u0199\b"+
		"\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u019f"+
		"\b\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0003\u0012\u01a8\b\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u01b1"+
		"\b\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0003\u0012\u01b9\b\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0003\u0012\u01c5\b\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u01ce\b\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0004\u0012\u01d9\b\u0012\u000b\u0012\f"+
		"\u0012\u01da\u0001\u0012\u0003\u0012\u01de\b\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0003\u0012\u01e3\b\u0012\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0003\u0013\u01ea\b\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013"+
		"\u01f3\b\u0013\u0001\u0013\u0003\u0013\u01f6\b\u0013\u0001\u0014\u0001"+
		"\u0014\u0003\u0014\u01fa\b\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0003"+
		"\u0014\u01ff\b\u0014\u0005\u0014\u0201\b\u0014\n\u0014\f\u0014\u0204\t"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0003"+
		"\u0015\u020b\b\u0015\u0004\u0015\u020d\b\u0015\u000b\u0015\f\u0015\u020e"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u0214\b\u0015\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0003\u0016\u0219\b\u0016\u0004\u0016\u021b\b"+
		"\u0016\u000b\u0016\f\u0016\u021c\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0003\u0016\u0224\b\u0016\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0003\u0017\u0235\b\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0003"+
		"\u0018\u023a\b\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0003"+
		"\u0019\u0240\b\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0003\u0019\u024e\b\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0003\u0019\u0257"+
		"\b\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0003\u0019\u0260\b\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0003\u0019\u0265\b\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0003"+
		"\u001a\u026a\b\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0003\u001b\u0287"+
		"\b\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0003\u001c\u02b6\b\u001c\u0001"+
		"\u001d\u0001\u001d\u0003\u001d\u02ba\b\u001d\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0003\u001e\u02c3"+
		"\b\u001e\u0001\u001e\u0001\u001e\u0003\u001e\u02c7\b\u001e\u0001\u001e"+
		"\u0001\u001e\u0003\u001e\u02cb\b\u001e\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0003\u001e\u02d6\b\u001e\u0001\u001e\u0001\u001e\u0003\u001e\u02da\b"+
		"\u001e\u0001\u001e\u0001\u001e\u0003\u001e\u02de\b\u001e\u0001\u001e\u0001"+
		"\u001e\u0003\u001e\u02e2\b\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0003"+
		"\u001f\u02e7\b\u001f\u0001 \u0001 \u0001 \u0001 \u0001 \u0003 \u02ee\b"+
		" \u0001!\u0001!\u0001!\u0001!\u0001!\u0003!\u02f5\b!\u0001!\u0001!\u0003"+
		"!\u02f9\b!\u0001!\u0001!\u0003!\u02fd\b!\u0001!\u0001!\u0001!\u0001\""+
		"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0003\"\u0309\b\"\u0001"+
		"#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001"+
		"#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001"+
		"#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001"+
		"#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0003#\u0332"+
		"\b#\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001"+
		"$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001"+
		"$\u0001$\u0001$\u0003$\u034a\b$\u0001$\u0001$\u0003$\u034e\b$\u0001$\u0001"+
		"$\u0001$\u0001$\u0001$\u0001$\u0001$\u0003$\u0357\b$\u0001$\u0001$\u0001"+
		"$\u0001$\u0001$\u0001$\u0001$\u0001$\u0003$\u0361\b$\u0001$\u0001$\u0001"+
		"$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001"+
		"$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001"+
		"$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001"+
		"$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0003$\u038a\b$\u0001%\u0001"+
		"%\u0001%\u0001%\u0001%\u0003%\u0391\b%\u0001%\u0001%\u0003%\u0395\b%\u0001"+
		"%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0003%\u039e\b%\u0001%\u0001"+
		"%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0003%\u03a8\b%\u0001%\u0001"+
		"%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001"+
		"%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001"+
		"%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001"+
		"%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0003%\u03d1\b%\u0001"+
		"&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001\'\u0001\'\u0001\'\u0001\'\u0001"+
		"\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0003\'\u03e4\b\'\u0001"+
		"(\u0001(\u0001(\u0001(\u0001(\u0003(\u03eb\b(\u0001(\u0001(\u0001(\u0001"+
		"(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001"+
		"(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001"+
		"(\u0001(\u0001(\u0001(\u0003(\u0408\b(\u0001(\u0001(\u0003(\u040c\b(\u0001"+
		")\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0003"+
		")\u0418\b)\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001+\u0001+\u0001"+
		"+\u0001+\u0001+\u0001,\u0001,\u0001,\u0001,\u0001,\u0001-\u0001-\u0001"+
		"-\u0001-\u0003-\u042e\b-\u0004-\u0430\b-\u000b-\f-\u0431\u0001-\u0001"+
		"-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0003-\u043c\b-\u0001.\u0001"+
		".\u0001.\u0001.\u0001.\u0001.\u0001.\u0001.\u0001.\u0001.\u0001.\u0001"+
		".\u0001.\u0001.\u0001.\u0001.\u0003.\u044e\b.\u0003.\u0450\b.\u0001.\u0001"+
		".\u0001.\u0001.\u0001.\u0001.\u0001.\u0001.\u0001.\u0001.\u0001.\u0001"+
		".\u0005.\u045e\b.\n.\f.\u0461\t.\u0001/\u0001/\u0001/\u0001/\u0001/\u0001"+
		"/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001"+
		"/\u0001/\u0001/\u0001/\u0001/\u0001/\u0003/\u0478\b/\u0001/\u0001/\u0001"+
		"/\u0001/\u0001/\u0001/\u0001/\u0003/\u0481\b/\u0001/\u0001/\u0003/\u0485"+
		"\b/\u0001/\u0000\u0003\u001a\u001c\\0\u0000\u0002\u0004\u0006\b\n\f\u000e"+
		"\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDF"+
		"HJLNPRTVXZ\\^\u0000\u0003\u0001\u0000HM\u0002\u0000ZZ\\\\\u0002\u0000"+
		"YY[[\u0540\u0000a\u0001\u0000\u0000\u0000\u0002\u00c7\u0001\u0000\u0000"+
		"\u0000\u0004\u00c9\u0001\u0000\u0000\u0000\u0006\u00d8\u0001\u0000\u0000"+
		"\u0000\b\u00da\u0001\u0000\u0000\u0000\n\u00f7\u0001\u0000\u0000\u0000"+
		"\f\u00ff\u0001\u0000\u0000\u0000\u000e\u0101\u0001\u0000\u0000\u0000\u0010"+
		"\u0103\u0001\u0000\u0000\u0000\u0012\u0107\u0001\u0000\u0000\u0000\u0014"+
		"\u012a\u0001\u0000\u0000\u0000\u0016\u012c\u0001\u0000\u0000\u0000\u0018"+
		"\u0137\u0001\u0000\u0000\u0000\u001a\u013b\u0001\u0000\u0000\u0000\u001c"+
		"\u0146\u0001\u0000\u0000\u0000\u001e\u015f\u0001\u0000\u0000\u0000 \u016a"+
		"\u0001\u0000\u0000\u0000\"\u0198\u0001\u0000\u0000\u0000$\u01e2\u0001"+
		"\u0000\u0000\u0000&\u01f5\u0001\u0000\u0000\u0000(\u01f7\u0001\u0000\u0000"+
		"\u0000*\u0213\u0001\u0000\u0000\u0000,\u0223\u0001\u0000\u0000\u0000."+
		"\u0234\u0001\u0000\u0000\u00000\u0239\u0001\u0000\u0000\u00002\u0264\u0001"+
		"\u0000\u0000\u00004\u0269\u0001\u0000\u0000\u00006\u0286\u0001\u0000\u0000"+
		"\u00008\u02b5\u0001\u0000\u0000\u0000:\u02b9\u0001\u0000\u0000\u0000<"+
		"\u02e1\u0001\u0000\u0000\u0000>\u02e6\u0001\u0000\u0000\u0000@\u02ed\u0001"+
		"\u0000\u0000\u0000B\u02ef\u0001\u0000\u0000\u0000D\u0308\u0001\u0000\u0000"+
		"\u0000F\u0331\u0001\u0000\u0000\u0000H\u0389\u0001\u0000\u0000\u0000J"+
		"\u03d0\u0001\u0000\u0000\u0000L\u03d2\u0001\u0000\u0000\u0000N\u03e3\u0001"+
		"\u0000\u0000\u0000P\u040b\u0001\u0000\u0000\u0000R\u0417\u0001\u0000\u0000"+
		"\u0000T\u0419\u0001\u0000\u0000\u0000V\u041f\u0001\u0000\u0000\u0000X"+
		"\u0424\u0001\u0000\u0000\u0000Z\u043b\u0001\u0000\u0000\u0000\\\u044f"+
		"\u0001\u0000\u0000\u0000^\u0484\u0001\u0000\u0000\u0000`b\u0003\u0002"+
		"\u0001\u0000a`\u0001\u0000\u0000\u0000bc\u0001\u0000\u0000\u0000ca\u0001"+
		"\u0000\u0000\u0000cd\u0001\u0000\u0000\u0000d\u0001\u0001\u0000\u0000"+
		"\u0000eg\u0003@ \u0000fh\u0005f\u0000\u0000gf\u0001\u0000\u0000\u0000"+
		"gh\u0001\u0000\u0000\u0000h\u00c8\u0001\u0000\u0000\u0000i\u00c8\u0003"+
		"\b\u0004\u0000jl\u0003Z-\u0000km\u0005f\u0000\u0000lk\u0001\u0000\u0000"+
		"\u0000lm\u0001\u0000\u0000\u0000m\u00c8\u0001\u0000\u0000\u0000np\u0003"+
		"2\u0019\u0000oq\u0005f\u0000\u0000po\u0001\u0000\u0000\u0000pq\u0001\u0000"+
		"\u0000\u0000q\u00c8\u0001\u0000\u0000\u0000rt\u0003^/\u0000su\u0005f\u0000"+
		"\u0000ts\u0001\u0000\u0000\u0000tu\u0001\u0000\u0000\u0000u\u00c8\u0001"+
		"\u0000\u0000\u0000vx\u00034\u001a\u0000wy\u0005f\u0000\u0000xw\u0001\u0000"+
		"\u0000\u0000xy\u0001\u0000\u0000\u0000y\u00c8\u0001\u0000\u0000\u0000"+
		"z|\u0003B!\u0000{}\u0005f\u0000\u0000|{\u0001\u0000\u0000\u0000|}\u0001"+
		"\u0000\u0000\u0000}\u00c8\u0001\u0000\u0000\u0000~\u0080\u0003D\"\u0000"+
		"\u007f\u0081\u0005f\u0000\u0000\u0080\u007f\u0001\u0000\u0000\u0000\u0080"+
		"\u0081\u0001\u0000\u0000\u0000\u0081\u00c8\u0001\u0000\u0000\u0000\u0082"+
		"\u0084\u00036\u001b\u0000\u0083\u0085\u0005f\u0000\u0000\u0084\u0083\u0001"+
		"\u0000\u0000\u0000\u0084\u0085\u0001\u0000\u0000\u0000\u0085\u00c8\u0001"+
		"\u0000\u0000\u0000\u0086\u0088\u0003\\.\u0000\u0087\u0089\u0005f\u0000"+
		"\u0000\u0088\u0087\u0001\u0000\u0000\u0000\u0088\u0089\u0001\u0000\u0000"+
		"\u0000\u0089\u00c8\u0001\u0000\u0000\u0000\u008a\u008c\u0003.\u0017\u0000"+
		"\u008b\u008d\u0005f\u0000\u0000\u008c\u008b\u0001\u0000\u0000\u0000\u008c"+
		"\u008d\u0001\u0000\u0000\u0000\u008d\u00c8\u0001\u0000\u0000\u0000\u008e"+
		"\u0090\u0003\u001a\r\u0000\u008f\u0091\u0005f\u0000\u0000\u0090\u008f"+
		"\u0001\u0000\u0000\u0000\u0090\u0091\u0001\u0000\u0000\u0000\u0091\u00c8"+
		"\u0001\u0000\u0000\u0000\u0092\u0094\u0003\u0010\b\u0000\u0093\u0095\u0005"+
		"f\u0000\u0000\u0094\u0093\u0001\u0000\u0000\u0000\u0094\u0095\u0001\u0000"+
		"\u0000\u0000\u0095\u00c8\u0001\u0000\u0000\u0000\u0096\u0098\u0003\u0012"+
		"\t\u0000\u0097\u0099\u0005f\u0000\u0000\u0098\u0097\u0001\u0000\u0000"+
		"\u0000\u0098\u0099\u0001\u0000\u0000\u0000\u0099\u00c8\u0001\u0000\u0000"+
		"\u0000\u009a\u009c\u0003\u0014\n\u0000\u009b\u009d\u0005f\u0000\u0000"+
		"\u009c\u009b\u0001\u0000\u0000\u0000\u009c\u009d\u0001\u0000\u0000\u0000"+
		"\u009d\u00c8\u0001\u0000\u0000\u0000\u009e\u00a0\u0003\u0018\f\u0000\u009f"+
		"\u00a1\u0005f\u0000\u0000\u00a0\u009f\u0001\u0000\u0000\u0000\u00a0\u00a1"+
		"\u0001\u0000\u0000\u0000\u00a1\u00c8\u0001\u0000\u0000\u0000\u00a2\u00a4"+
		"\u0003\"\u0011\u0000\u00a3\u00a5\u0005f\u0000\u0000\u00a4\u00a3\u0001"+
		"\u0000\u0000\u0000\u00a4\u00a5\u0001\u0000\u0000\u0000\u00a5\u00c8\u0001"+
		"\u0000\u0000\u0000\u00a6\u00a8\u0003$\u0012\u0000\u00a7\u00a9\u0005f\u0000"+
		"\u0000\u00a8\u00a7\u0001\u0000\u0000\u0000\u00a8\u00a9\u0001\u0000\u0000"+
		"\u0000\u00a9\u00c8\u0001\u0000\u0000\u0000\u00aa\u00ac\u0003 \u0010\u0000"+
		"\u00ab\u00ad\u0005f\u0000\u0000\u00ac\u00ab\u0001\u0000\u0000\u0000\u00ac"+
		"\u00ad\u0001\u0000\u0000\u0000\u00ad\u00c8\u0001\u0000\u0000\u0000\u00ae"+
		"\u00b0\u0003&\u0013\u0000\u00af\u00b1\u0005f\u0000\u0000\u00b0\u00af\u0001"+
		"\u0000\u0000\u0000\u00b0\u00b1\u0001\u0000\u0000\u0000\u00b1\u00c8\u0001"+
		"\u0000\u0000\u0000\u00b2\u00b4\u0003\u0016\u000b\u0000\u00b3\u00b5\u0005"+
		"f\u0000\u0000\u00b4\u00b3\u0001\u0000\u0000\u0000\u00b4\u00b5\u0001\u0000"+
		"\u0000\u0000\u00b5\u00c8\u0001\u0000\u0000\u0000\u00b6\u00b8\u0003\f\u0006"+
		"\u0000\u00b7\u00b9\u0005f\u0000\u0000\u00b8\u00b7\u0001\u0000\u0000\u0000"+
		"\u00b8\u00b9\u0001\u0000\u0000\u0000\u00b9\u00c8\u0001\u0000\u0000\u0000"+
		"\u00ba\u00bc\u00038\u001c\u0000\u00bb\u00bd\u0005f\u0000\u0000\u00bc\u00bb"+
		"\u0001\u0000\u0000\u0000\u00bc\u00bd\u0001\u0000\u0000\u0000\u00bd\u00c8"+
		"\u0001\u0000\u0000\u0000\u00be\u00c0\u0003P(\u0000\u00bf\u00c1\u0005f"+
		"\u0000\u0000\u00c0\u00bf\u0001\u0000\u0000\u0000\u00c0\u00c1\u0001\u0000"+
		"\u0000\u0000\u00c1\u00c8\u0001\u0000\u0000\u0000\u00c2\u00c4\u0003<\u001e"+
		"\u0000\u00c3\u00c5\u0005f\u0000\u0000\u00c4\u00c3\u0001\u0000\u0000\u0000"+
		"\u00c4\u00c5\u0001\u0000\u0000\u0000\u00c5\u00c8\u0001\u0000\u0000\u0000"+
		"\u00c6\u00c8\u0005f\u0000\u0000\u00c7e\u0001\u0000\u0000\u0000\u00c7i"+
		"\u0001\u0000\u0000\u0000\u00c7j\u0001\u0000\u0000\u0000\u00c7n\u0001\u0000"+
		"\u0000\u0000\u00c7r\u0001\u0000\u0000\u0000\u00c7v\u0001\u0000\u0000\u0000"+
		"\u00c7z\u0001\u0000\u0000\u0000\u00c7~\u0001\u0000\u0000\u0000\u00c7\u0082"+
		"\u0001\u0000\u0000\u0000\u00c7\u0086\u0001\u0000\u0000\u0000\u00c7\u008a"+
		"\u0001\u0000\u0000\u0000\u00c7\u008e\u0001\u0000\u0000\u0000\u00c7\u0092"+
		"\u0001\u0000\u0000\u0000\u00c7\u0096\u0001\u0000\u0000\u0000\u00c7\u009a"+
		"\u0001\u0000\u0000\u0000\u00c7\u009e\u0001\u0000\u0000\u0000\u00c7\u00a2"+
		"\u0001\u0000\u0000\u0000\u00c7\u00a6\u0001\u0000\u0000\u0000\u00c7\u00aa"+
		"\u0001\u0000\u0000\u0000\u00c7\u00ae\u0001\u0000\u0000\u0000\u00c7\u00b2"+
		"\u0001\u0000\u0000\u0000\u00c7\u00b6\u0001\u0000\u0000\u0000\u00c7\u00ba"+
		"\u0001\u0000\u0000\u0000\u00c7\u00be\u0001\u0000\u0000\u0000\u00c7\u00c2"+
		"\u0001\u0000\u0000\u0000\u00c7\u00c6\u0001\u0000\u0000\u0000\u00c8\u0003"+
		"\u0001\u0000\u0000\u0000\u00c9\u00ce\u0005c\u0000\u0000\u00ca\u00cb\u0005"+
		"`\u0000\u0000\u00cb\u00cd\u0005c\u0000\u0000\u00cc\u00ca\u0001\u0000\u0000"+
		"\u0000\u00cd\u00d0\u0001\u0000\u0000\u0000\u00ce\u00cc\u0001\u0000\u0000"+
		"\u0000\u00ce\u00cf\u0001\u0000\u0000\u0000\u00cf\u0005\u0001\u0000\u0000"+
		"\u0000\u00d0\u00ce\u0001\u0000\u0000\u0000\u00d1\u00d9\u0005B\u0000\u0000"+
		"\u00d2\u00d9\u0005C\u0000\u0000\u00d3\u00d9\u0005D\u0000\u0000\u00d4\u00d9"+
		"\u0005F\u0000\u0000\u00d5\u00d9\u0005E\u0000\u0000\u00d6\u00d9\u0005A"+
		"\u0000\u0000\u00d7\u00d9\u0005G\u0000\u0000\u00d8\u00d1\u0001\u0000\u0000"+
		"\u0000\u00d8\u00d2\u0001\u0000\u0000\u0000\u00d8\u00d3\u0001\u0000\u0000"+
		"\u0000\u00d8\u00d4\u0001\u0000\u0000\u0000\u00d8\u00d5\u0001\u0000\u0000"+
		"\u0000\u00d8\u00d6\u0001\u0000\u0000\u0000\u00d8\u00d7\u0001\u0000\u0000"+
		"\u0000\u00d9\u0007\u0001\u0000\u0000\u0000\u00da\u00db\u0005V\u0000\u0000"+
		"\u00db\u00e0\u0005c\u0000\u0000\u00dc\u00dd\u0005^\u0000\u0000\u00dd\u00de"+
		"\u0003\u0004\u0002\u0000\u00de\u00df\u0005_\u0000\u0000\u00df\u00e1\u0001"+
		"\u0000\u0000\u0000\u00e0\u00dc\u0001\u0000\u0000\u0000\u00e0\u00e1\u0001"+
		"\u0000\u0000\u0000\u00e1\u00e2\u0001\u0000\u0000\u0000\u00e2\u00e4\u0005"+
		"a\u0000\u0000\u00e3\u00e5\u0005f\u0000\u0000\u00e4\u00e3\u0001\u0000\u0000"+
		"\u0000\u00e4\u00e5\u0001\u0000\u0000\u0000\u00e5\u00e6\u0001\u0000\u0000"+
		"\u0000\u00e6\u00e7\u0003\n\u0005\u0000\u00e7\u00e8\u0005\u0010\u0000\u0000"+
		"\u00e8\t\u0001\u0000\u0000\u0000\u00e9\u00f8\u0003(\u0014\u0000\u00ea"+
		"\u00f8\u0003 \u0010\u0000\u00eb\u00f8\u0003&\u0013\u0000\u00ec\u00f8\u0003"+
		"\"\u0011\u0000\u00ed\u00f8\u0003$\u0012\u0000\u00ee\u00f8\u0003\u0010"+
		"\b\u0000\u00ef\u00f8\u0003\u0012\t\u0000\u00f0\u00f8\u0003\u0014\n\u0000"+
		"\u00f1\u00f8\u0003\u0016\u000b\u0000\u00f2\u00f8\u0003Z-\u0000\u00f3\u00f8"+
		"\u0003.\u0017\u0000\u00f4\u00f8\u0003\f\u0006\u0000\u00f5\u00f8\u0003"+
		"\\.\u0000\u00f6\u00f8\u00032\u0019\u0000\u00f7\u00e9\u0001\u0000\u0000"+
		"\u0000\u00f7\u00ea\u0001\u0000\u0000\u0000\u00f7\u00eb\u0001\u0000\u0000"+
		"\u0000\u00f7\u00ec\u0001\u0000\u0000\u0000\u00f7\u00ed\u0001\u0000\u0000"+
		"\u0000\u00f7\u00ee\u0001\u0000\u0000\u0000\u00f7\u00ef\u0001\u0000\u0000"+
		"\u0000\u00f7\u00f0\u0001\u0000\u0000\u0000\u00f7\u00f1\u0001\u0000\u0000"+
		"\u0000\u00f7\u00f2\u0001\u0000\u0000\u0000\u00f7\u00f3\u0001\u0000\u0000"+
		"\u0000\u00f7\u00f4\u0001\u0000\u0000\u0000\u00f7\u00f5\u0001\u0000\u0000"+
		"\u0000\u00f7\u00f6\u0001\u0000\u0000\u0000\u00f8\u000b\u0001\u0000\u0000"+
		"\u0000\u00f9\u00fa\u0005?\u0000\u0000\u00fa\u0100\u0003\u000e\u0007\u0000"+
		"\u00fb\u00fc\u0005?\u0000\u0000\u00fc\u0100\u0003Z-\u0000\u00fd\u00fe"+
		"\u0005?\u0000\u0000\u00fe\u0100\u0003\\.\u0000\u00ff\u00f9\u0001\u0000"+
		"\u0000\u0000\u00ff\u00fb\u0001\u0000\u0000\u0000\u00ff\u00fd\u0001\u0000"+
		"\u0000\u0000\u0100\r\u0001\u0000\u0000\u0000\u0101\u0102\u0005\u0001\u0000"+
		"\u0000\u0102\u000f\u0001\u0000\u0000\u0000\u0103\u0104\u0005U\u0000\u0000"+
		"\u0104\u0105\u0003\u001a\r\u0000\u0105\u0106\u0003\n\u0005\u0000\u0106"+
		"\u0011\u0001\u0000\u0000\u0000\u0107\u0108\u0005=\u0000\u0000\u0108\u0109"+
		"\u0003\u001a\r\u0000\u0109\u010b\u0003\n\u0005\u0000\u010a\u010c\u0005"+
		"f\u0000\u0000\u010b\u010a\u0001\u0000\u0000\u0000\u010b\u010c\u0001\u0000"+
		"\u0000\u0000\u010c\u0112\u0001\u0000\u0000\u0000\u010d\u010f\u0005O\u0000"+
		"\u0000\u010e\u0110\u0005f\u0000\u0000\u010f\u010e\u0001\u0000\u0000\u0000"+
		"\u010f\u0110\u0001\u0000\u0000\u0000\u0110\u0111\u0001\u0000\u0000\u0000"+
		"\u0111\u0113\u0003\n\u0005\u0000\u0112\u010d\u0001\u0000\u0000\u0000\u0112"+
		"\u0113\u0001\u0000\u0000\u0000\u0113\u0013\u0001\u0000\u0000\u0000\u0114"+
		"\u0115\u0005N\u0000\u0000\u0115\u0116\u0003.\u0017\u0000\u0116\u0117\u0005"+
		"\u0001\u0000\u0000\u0117\u0118\u0003\u001a\r\u0000\u0118\u0119\u0005\u0001"+
		"\u0000\u0000\u0119\u011a\u0003.\u0017\u0000\u011a\u011c\u0005\u0001\u0000"+
		"\u0000\u011b\u011d\u0005f\u0000\u0000\u011c\u011b\u0001\u0000\u0000\u0000"+
		"\u011c\u011d\u0001\u0000\u0000\u0000\u011d\u011e\u0001\u0000\u0000\u0000"+
		"\u011e\u011f\u0003\n\u0005\u0000\u011f\u012b\u0001\u0000\u0000\u0000\u0120"+
		"\u0121\u0005N\u0000\u0000\u0121\u0122\u0005^\u0000\u0000\u0122\u0123\u0003"+
		".\u0017\u0000\u0123\u0124\u0005\u0001\u0000\u0000\u0124\u0125\u0003\u001a"+
		"\r\u0000\u0125\u0126\u0005\u0001\u0000\u0000\u0126\u0127\u0003.\u0017"+
		"\u0000\u0127\u0128\u0005_\u0000\u0000\u0128\u0129\u0003\n\u0005\u0000"+
		"\u0129\u012b\u0001\u0000\u0000\u0000\u012a\u0114\u0001\u0000\u0000\u0000"+
		"\u012a\u0120\u0001\u0000\u0000\u0000\u012b\u0015\u0001\u0000\u0000\u0000"+
		"\u012c\u012d\u0005>\u0000\u0000\u012d\u012e\u0005c\u0000\u0000\u012e\u012f"+
		"\u0005^\u0000\u0000\u012f\u0130\u0003\u0004\u0002\u0000\u0130\u0131\u0005"+
		"_\u0000\u0000\u0131\u0133\u0005a\u0000\u0000\u0132\u0134\u0005f\u0000"+
		"\u0000\u0133\u0132\u0001\u0000\u0000\u0000\u0133\u0134\u0001\u0000\u0000"+
		"\u0000\u0134\u0135\u0001\u0000\u0000\u0000\u0135\u0136\u0003\n\u0005\u0000"+
		"\u0136\u0017\u0001\u0000\u0000\u0000\u0137\u0138\u0003\\.\u0000\u0138"+
		"\u0139\u0007\u0000\u0000\u0000\u0139\u013a\u0003\\.\u0000\u013a\u0019"+
		"\u0001\u0000\u0000\u0000\u013b\u013c\u0006\r\uffff\uffff\u0000\u013c\u013d"+
		"\u0003\u001c\u000e\u0000\u013d\u0143\u0001\u0000\u0000\u0000\u013e\u013f"+
		"\n\u0002\u0000\u0000\u013f\u0140\u0005T\u0000\u0000\u0140\u0142\u0003"+
		"\u001c\u000e\u0000\u0141\u013e\u0001\u0000\u0000\u0000\u0142\u0145\u0001"+
		"\u0000\u0000\u0000\u0143\u0141\u0001\u0000\u0000\u0000\u0143\u0144\u0001"+
		"\u0000\u0000\u0000\u0144\u001b\u0001\u0000\u0000\u0000\u0145\u0143\u0001"+
		"\u0000\u0000\u0000\u0146\u0147\u0006\u000e\uffff\uffff\u0000\u0147\u0148"+
		"\u0003\u001e\u000f\u0000\u0148\u014e\u0001\u0000\u0000\u0000\u0149\u014a"+
		"\n\u0002\u0000\u0000\u014a\u014b\u0005S\u0000\u0000\u014b\u014d\u0003"+
		"\u001e\u000f\u0000\u014c\u0149\u0001\u0000\u0000\u0000\u014d\u0150\u0001"+
		"\u0000\u0000\u0000\u014e\u014c\u0001\u0000\u0000\u0000\u014e\u014f\u0001"+
		"\u0000\u0000\u0000\u014f\u001d\u0001\u0000\u0000\u0000\u0150\u014e\u0001"+
		"\u0000\u0000\u0000\u0151\u0152\u0005P\u0000\u0000\u0152\u0160\u0003\u001e"+
		"\u000f\u0000\u0153\u0154\u0005^\u0000\u0000\u0154\u0155\u0003\u001a\r"+
		"\u0000\u0155\u0156\u0005_\u0000\u0000\u0156\u0160\u0001\u0000\u0000\u0000"+
		"\u0157\u0160\u0005c\u0000\u0000\u0158\u0160\u0005Q\u0000\u0000\u0159\u0160"+
		"\u0005R\u0000\u0000\u015a\u0160\u0003\u0018\f\u0000\u015b\u015c\u0005"+
		"^\u0000\u0000\u015c\u015d\u0003\u0018\f\u0000\u015d\u015e\u0005_\u0000"+
		"\u0000\u015e\u0160\u0001\u0000\u0000\u0000\u015f\u0151\u0001\u0000\u0000"+
		"\u0000\u015f\u0153\u0001\u0000\u0000\u0000\u015f\u0157\u0001\u0000\u0000"+
		"\u0000\u015f\u0158\u0001\u0000\u0000\u0000\u015f\u0159\u0001\u0000\u0000"+
		"\u0000\u015f\u015a\u0001\u0000\u0000\u0000\u015f\u015b\u0001\u0000\u0000"+
		"\u0000\u0160\u001f\u0001\u0000\u0000\u0000\u0161\u0162\u0005W\u0000\u0000"+
		"\u0162\u0163\u0005^\u0000\u0000\u0163\u0164\u0003\u0004\u0002\u0000\u0164"+
		"\u0165\u0005_\u0000\u0000\u0165\u016b\u0001\u0000\u0000\u0000\u0166\u0167"+
		"\u0005W\u0000\u0000\u0167\u0168\u0005^\u0000\u0000\u0168\u0169\u0005b"+
		"\u0000\u0000\u0169\u016b\u0005_\u0000\u0000\u016a\u0161\u0001\u0000\u0000"+
		"\u0000\u016a\u0166\u0001\u0000\u0000\u0000\u016b!\u0001\u0000\u0000\u0000"+
		"\u016c\u016d\u0005X\u0000\u0000\u016d\u016e\u0005^\u0000\u0000\u016e\u016f"+
		"\u0003\u0004\u0002\u0000\u016f\u0170\u0005_\u0000\u0000\u0170\u0199\u0001"+
		"\u0000\u0000\u0000\u0171\u0172\u0005X\u0000\u0000\u0172\u0173\u0005^\u0000"+
		"\u0000\u0173\u0174\u0003\\.\u0000\u0174\u0175\u0005_\u0000\u0000\u0175"+
		"\u0199\u0001\u0000\u0000\u0000\u0176\u0177\u0005X\u0000\u0000\u0177\u0178"+
		"\u0005^\u0000\u0000\u0178\u0179\u0005b\u0000\u0000\u0179\u0199\u0005_"+
		"\u0000\u0000\u017a\u017b\u0005X\u0000\u0000\u017b\u017c\u0005^\u0000\u0000"+
		"\u017c\u017d\u0003,\u0016\u0000\u017d\u017e\u0005\u0002\u0000\u0000\u017e"+
		"\u017f\u0005d\u0000\u0000\u017f\u0180\u0005\u0003\u0000\u0000\u0180\u0181"+
		"\u0005_\u0000\u0000\u0181\u0199\u0001\u0000\u0000\u0000\u0182\u0183\u0005"+
		"X\u0000\u0000\u0183\u0184\u0005^\u0000\u0000\u0184\u0185\u0003Z-\u0000"+
		"\u0185\u0186\u0005_\u0000\u0000\u0186\u0199\u0001\u0000\u0000\u0000\u0187"+
		"\u0188\u0005X\u0000\u0000\u0188\u0189\u0005^\u0000\u0000\u0189\u018a\u0003"+
		"2\u0019\u0000\u018a\u018b\u0005_\u0000\u0000\u018b\u0199\u0001\u0000\u0000"+
		"\u0000\u018c\u018d\u0005X\u0000\u0000\u018d\u018e\u0005^\u0000\u0000\u018e"+
		"\u0192\u0003*\u0015\u0000\u018f\u0190\u0005\u0002\u0000\u0000\u0190\u0191"+
		"\u0005d\u0000\u0000\u0191\u0193\u0005\u0003\u0000\u0000\u0192\u018f\u0001"+
		"\u0000\u0000\u0000\u0193\u0194\u0001\u0000\u0000\u0000\u0194\u0192\u0001"+
		"\u0000\u0000\u0000\u0194\u0195\u0001\u0000\u0000\u0000\u0195\u0196\u0001"+
		"\u0000\u0000\u0000\u0196\u0197\u0005_\u0000\u0000\u0197\u0199\u0001\u0000"+
		"\u0000\u0000\u0198\u016c\u0001\u0000\u0000\u0000\u0198\u0171\u0001\u0000"+
		"\u0000\u0000\u0198\u0176\u0001\u0000\u0000\u0000\u0198\u017a\u0001\u0000"+
		"\u0000\u0000\u0198\u0182\u0001\u0000\u0000\u0000\u0198\u0187\u0001\u0000"+
		"\u0000\u0000\u0198\u018c\u0001\u0000\u0000\u0000\u0199#\u0001\u0000\u0000"+
		"\u0000\u019a\u019b\u0005,\u0000\u0000\u019b\u019c\u0005^\u0000\u0000\u019c"+
		"\u019e\u0003\u0004\u0002\u0000\u019d\u019f\u0005`\u0000\u0000\u019e\u019d"+
		"\u0001\u0000\u0000\u0000\u019e\u019f\u0001\u0000\u0000\u0000\u019f\u01a0"+
		"\u0001\u0000\u0000\u0000\u01a0\u01a1\u0005b\u0000\u0000\u01a1\u01a2\u0005"+
		"_\u0000\u0000\u01a2\u01e3\u0001\u0000\u0000\u0000\u01a3\u01a4\u0005,\u0000"+
		"\u0000\u01a4\u01a5\u0005^\u0000\u0000\u01a5\u01a7\u0003\\.\u0000\u01a6"+
		"\u01a8\u0005`\u0000\u0000\u01a7\u01a6\u0001\u0000\u0000\u0000\u01a7\u01a8"+
		"\u0001\u0000\u0000\u0000\u01a8\u01a9\u0001\u0000\u0000\u0000\u01a9\u01aa"+
		"\u0005b\u0000\u0000\u01aa\u01ab\u0005_\u0000\u0000\u01ab\u01e3\u0001\u0000"+
		"\u0000\u0000\u01ac\u01ad\u0005,\u0000\u0000\u01ad\u01ae\u0005^\u0000\u0000"+
		"\u01ae\u01b0\u0005b\u0000\u0000\u01af\u01b1\u0005`\u0000\u0000\u01b0\u01af"+
		"\u0001\u0000\u0000\u0000\u01b0\u01b1\u0001\u0000\u0000\u0000\u01b1\u01b2"+
		"\u0001\u0000\u0000\u0000\u01b2\u01b3\u0005b\u0000\u0000\u01b3\u01e3\u0005"+
		"_\u0000\u0000\u01b4\u01b5\u0005,\u0000\u0000\u01b5\u01b6\u0005^\u0000"+
		"\u0000\u01b6\u01b8\u0003,\u0016\u0000\u01b7\u01b9\u0005`\u0000\u0000\u01b8"+
		"\u01b7\u0001\u0000\u0000\u0000\u01b8\u01b9\u0001\u0000\u0000\u0000\u01b9"+
		"\u01ba\u0001\u0000\u0000\u0000\u01ba\u01bb\u0005b\u0000\u0000\u01bb\u01bc"+
		"\u0005\u0002\u0000\u0000\u01bc\u01bd\u0005d\u0000\u0000\u01bd\u01be\u0005"+
		"\u0003\u0000\u0000\u01be\u01bf\u0005_\u0000\u0000\u01bf\u01e3\u0001\u0000"+
		"\u0000\u0000\u01c0\u01c1\u0005,\u0000\u0000\u01c1\u01c2\u0005^\u0000\u0000"+
		"\u01c2\u01c4\u0003Z-\u0000\u01c3\u01c5\u0005`\u0000\u0000\u01c4\u01c3"+
		"\u0001\u0000\u0000\u0000\u01c4\u01c5\u0001\u0000\u0000\u0000\u01c5\u01c6"+
		"\u0001\u0000\u0000\u0000\u01c6\u01c7\u0005b\u0000\u0000\u01c7\u01c8\u0005"+
		"_\u0000\u0000\u01c8\u01e3\u0001\u0000\u0000\u0000\u01c9\u01ca\u0005,\u0000"+
		"\u0000\u01ca\u01cb\u0005^\u0000\u0000\u01cb\u01cd\u00032\u0019\u0000\u01cc"+
		"\u01ce\u0005`\u0000\u0000\u01cd\u01cc\u0001\u0000\u0000\u0000\u01cd\u01ce"+
		"\u0001\u0000\u0000\u0000\u01ce\u01cf\u0001\u0000\u0000\u0000\u01cf\u01d0"+
		"\u0005b\u0000\u0000\u01d0\u01d1\u0005_\u0000\u0000\u01d1\u01e3\u0001\u0000"+
		"\u0000\u0000\u01d2\u01d3\u0005,\u0000\u0000\u01d3\u01d4\u0005^\u0000\u0000"+
		"\u01d4\u01d8\u0003*\u0015\u0000\u01d5\u01d6\u0005\u0002\u0000\u0000\u01d6"+
		"\u01d7\u0005d\u0000\u0000\u01d7\u01d9\u0005\u0003\u0000\u0000\u01d8\u01d5"+
		"\u0001\u0000\u0000\u0000\u01d9\u01da\u0001\u0000\u0000\u0000\u01da\u01d8"+
		"\u0001\u0000\u0000\u0000\u01da\u01db\u0001\u0000\u0000\u0000\u01db\u01dd"+
		"\u0001\u0000\u0000\u0000\u01dc\u01de\u0005`\u0000\u0000\u01dd\u01dc\u0001"+
		"\u0000\u0000\u0000\u01dd\u01de\u0001\u0000\u0000\u0000\u01de\u01df\u0001"+
		"\u0000\u0000\u0000\u01df\u01e0\u0005b\u0000\u0000\u01e0\u01e1\u0005_\u0000"+
		"\u0000\u01e1\u01e3\u0001\u0000\u0000\u0000\u01e2\u019a\u0001\u0000\u0000"+
		"\u0000\u01e2\u01a3\u0001\u0000\u0000\u0000\u01e2\u01ac\u0001\u0000\u0000"+
		"\u0000\u01e2\u01b4\u0001\u0000\u0000\u0000\u01e2\u01c0\u0001\u0000\u0000"+
		"\u0000\u01e2\u01c9\u0001\u0000\u0000\u0000\u01e2\u01d2\u0001\u0000\u0000"+
		"\u0000\u01e3%\u0001\u0000\u0000\u0000\u01e4\u01e5\u0005-\u0000\u0000\u01e5"+
		"\u01e6\u0005^\u0000\u0000\u01e6\u01e7\u0003\u0004\u0002\u0000\u01e7\u01e9"+
		"\u0005`\u0000\u0000\u01e8\u01ea\u0005b\u0000\u0000\u01e9\u01e8\u0001\u0000"+
		"\u0000\u0000\u01e9\u01ea\u0001\u0000\u0000\u0000\u01ea\u01eb\u0001\u0000"+
		"\u0000\u0000\u01eb\u01ec\u0005_\u0000\u0000\u01ec\u01f6\u0001\u0000\u0000"+
		"\u0000\u01ed\u01ee\u0005-\u0000\u0000\u01ee\u01ef\u0005^\u0000\u0000\u01ef"+
		"\u01f0\u0005b\u0000\u0000\u01f0\u01f2\u0005`\u0000\u0000\u01f1\u01f3\u0005"+
		"b\u0000\u0000\u01f2\u01f1\u0001\u0000\u0000\u0000\u01f2\u01f3\u0001\u0000"+
		"\u0000\u0000\u01f3\u01f4\u0001\u0000\u0000\u0000\u01f4\u01f6\u0005_\u0000"+
		"\u0000\u01f5\u01e4\u0001\u0000\u0000\u0000\u01f5\u01ed\u0001\u0000\u0000"+
		"\u0000\u01f6\'\u0001\u0000\u0000\u0000\u01f7\u01f9\u0005\u0004\u0000\u0000"+
		"\u01f8\u01fa\u0005f\u0000\u0000\u01f9\u01f8\u0001\u0000\u0000\u0000\u01f9"+
		"\u01fa\u0001\u0000\u0000\u0000\u01fa\u0202\u0001\u0000\u0000\u0000\u01fb"+
		"\u01fc\u0003\n\u0005\u0000\u01fc\u01fe\u0005\u0001\u0000\u0000\u01fd\u01ff"+
		"\u0005f\u0000\u0000\u01fe\u01fd\u0001\u0000\u0000\u0000\u01fe\u01ff\u0001"+
		"\u0000\u0000\u0000\u01ff\u0201\u0001\u0000\u0000\u0000\u0200\u01fb\u0001"+
		"\u0000\u0000\u0000\u0201\u0204\u0001\u0000\u0000\u0000\u0202\u0200\u0001"+
		"\u0000\u0000\u0000\u0202\u0203\u0001\u0000\u0000\u0000\u0203\u0205\u0001"+
		"\u0000\u0000\u0000\u0204\u0202\u0001\u0000\u0000\u0000\u0205\u0206\u0005"+
		"\u0005\u0000\u0000\u0206)\u0001\u0000\u0000\u0000\u0207\u020c\u0005\u0002"+
		"\u0000\u0000\u0208\u020a\u0003,\u0016\u0000\u0209\u020b\u0005`\u0000\u0000"+
		"\u020a\u0209\u0001\u0000\u0000\u0000\u020a\u020b\u0001\u0000\u0000\u0000"+
		"\u020b\u020d\u0001\u0000\u0000\u0000\u020c\u0208\u0001\u0000\u0000\u0000"+
		"\u020d\u020e\u0001\u0000\u0000\u0000\u020e\u020c\u0001\u0000\u0000\u0000"+
		"\u020e\u020f\u0001\u0000\u0000\u0000\u020f\u0210\u0001\u0000\u0000\u0000"+
		"\u0210\u0211\u0005\u0003\u0000\u0000\u0211\u0214\u0001\u0000\u0000\u0000"+
		"\u0212\u0214\u0005c\u0000\u0000\u0213\u0207\u0001\u0000\u0000\u0000\u0213"+
		"\u0212\u0001\u0000\u0000\u0000\u0214+\u0001\u0000\u0000\u0000\u0215\u021a"+
		"\u0005\u0002\u0000\u0000\u0216\u0218\u0003\\.\u0000\u0217\u0219\u0005"+
		"`\u0000\u0000\u0218\u0217\u0001\u0000\u0000\u0000\u0218\u0219\u0001\u0000"+
		"\u0000\u0000\u0219\u021b\u0001\u0000\u0000\u0000\u021a\u0216\u0001\u0000"+
		"\u0000\u0000\u021b\u021c\u0001\u0000\u0000\u0000\u021c\u021a\u0001\u0000"+
		"\u0000\u0000\u021c\u021d\u0001\u0000\u0000\u0000\u021d\u021e\u0001\u0000"+
		"\u0000\u0000\u021e\u021f\u0005\u0003\u0000\u0000\u021f\u0224\u0001\u0000"+
		"\u0000\u0000\u0220\u0224\u0005c\u0000\u0000\u0221\u0224\u00032\u0019\u0000"+
		"\u0222\u0224\u0003F#\u0000\u0223\u0215\u0001\u0000\u0000\u0000\u0223\u0220"+
		"\u0001\u0000\u0000\u0000\u0223\u0221\u0001\u0000\u0000\u0000\u0223\u0222"+
		"\u0001\u0000\u0000\u0000\u0224-\u0001\u0000\u0000\u0000\u0225\u0226\u0005"+
		"c\u0000\u0000\u0226\u0227\u0005\u0006\u0000\u0000\u0227\u0235\u0003Z-"+
		"\u0000\u0228\u0229\u0005c\u0000\u0000\u0229\u022a\u0005\u0006\u0000\u0000"+
		"\u022a\u0235\u0003\\.\u0000\u022b\u022c\u0005c\u0000\u0000\u022c\u022d"+
		"\u0005\u0006\u0000\u0000\u022d\u0235\u0005b\u0000\u0000\u022e\u022f\u0005"+
		"c\u0000\u0000\u022f\u0230\u0005\u0006\u0000\u0000\u0230\u0235\u0003*\u0015"+
		"\u0000\u0231\u0232\u0005c\u0000\u0000\u0232\u0233\u0005\u0006\u0000\u0000"+
		"\u0233\u0235\u0003,\u0016\u0000\u0234\u0225\u0001\u0000\u0000\u0000\u0234"+
		"\u0228\u0001\u0000\u0000\u0000\u0234\u022b\u0001\u0000\u0000\u0000\u0234"+
		"\u022e\u0001\u0000\u0000\u0000\u0234\u0231\u0001\u0000\u0000\u0000\u0235"+
		"/\u0001\u0000\u0000\u0000\u0236\u023a\u0003\\.\u0000\u0237\u023a\u0003"+
		"\u001a\r\u0000\u0238\u023a\u0005b\u0000\u0000\u0239\u0236\u0001\u0000"+
		"\u0000\u0000\u0239\u0237\u0001\u0000\u0000\u0000\u0239\u0238\u0001\u0000"+
		"\u0000\u0000\u023a1\u0001\u0000\u0000\u0000\u023b\u023c\u00050\u0000\u0000"+
		"\u023c\u023d\u0005^\u0000\u0000\u023d\u023f\u0003,\u0016\u0000\u023e\u0240"+
		"\u0005`\u0000\u0000\u023f\u023e\u0001\u0000\u0000\u0000\u023f\u0240\u0001"+
		"\u0000\u0000\u0000\u0240\u0241\u0001\u0000\u0000\u0000\u0241\u0242\u0003"+
		",\u0016\u0000\u0242\u0243\u0005_\u0000\u0000\u0243\u0265\u0001\u0000\u0000"+
		"\u0000\u0244\u0245\u0005+\u0000\u0000\u0245\u0246\u0005^\u0000\u0000\u0246"+
		"\u0247\u0003,\u0016\u0000\u0247\u0248\u0005_\u0000\u0000\u0248\u0265\u0001"+
		"\u0000\u0000\u0000\u0249\u024a\u00051\u0000\u0000\u024a\u024b\u0005^\u0000"+
		"\u0000\u024b\u024d\u0003,\u0016\u0000\u024c\u024e\u0005`\u0000\u0000\u024d"+
		"\u024c\u0001\u0000\u0000\u0000\u024d\u024e\u0001\u0000\u0000\u0000\u024e"+
		"\u024f\u0001\u0000\u0000\u0000\u024f\u0250\u0003,\u0016\u0000\u0250\u0251"+
		"\u0005_\u0000\u0000\u0251\u0265\u0001\u0000\u0000\u0000\u0252\u0253\u0005"+
		"2\u0000\u0000\u0253\u0254\u0005^\u0000\u0000\u0254\u0256\u0003,\u0016"+
		"\u0000\u0255\u0257\u0005`\u0000\u0000\u0256\u0255\u0001\u0000\u0000\u0000"+
		"\u0256\u0257\u0001\u0000\u0000\u0000\u0257\u0258\u0001\u0000\u0000\u0000"+
		"\u0258\u0259\u0003,\u0016\u0000\u0259\u025a\u0005_\u0000\u0000\u025a\u0265"+
		"\u0001\u0000\u0000\u0000\u025b\u025c\u00053\u0000\u0000\u025c\u025d\u0005"+
		"^\u0000\u0000\u025d\u025f\u0003,\u0016\u0000\u025e\u0260\u0005`\u0000"+
		"\u0000\u025f\u025e\u0001\u0000\u0000\u0000\u025f\u0260\u0001\u0000\u0000"+
		"\u0000\u0260\u0261\u0001\u0000\u0000\u0000\u0261\u0262\u0003,\u0016\u0000"+
		"\u0262\u0263\u0005_\u0000\u0000\u0263\u0265\u0001\u0000\u0000\u0000\u0264"+
		"\u023b\u0001\u0000\u0000\u0000\u0264\u0244\u0001\u0000\u0000\u0000\u0264"+
		"\u0249\u0001\u0000\u0000\u0000\u0264\u0252\u0001\u0000\u0000\u0000\u0264"+
		"\u025b\u0001\u0000\u0000\u0000\u02653\u0001\u0000\u0000\u0000\u0266\u0267"+
		"\u0005\u001c\u0000\u0000\u0267\u026a\u0005c\u0000\u0000\u0268\u026a\u0005"+
		"c\u0000\u0000\u0269\u0266\u0001\u0000\u0000\u0000\u0269\u0268\u0001\u0000"+
		"\u0000\u0000\u026a5\u0001\u0000\u0000\u0000\u026b\u026c\u0005c\u0000\u0000"+
		"\u026c\u026d\u0005\u001d\u0000\u0000\u026d\u026e\u0005^\u0000\u0000\u026e"+
		"\u026f\u0003,\u0016\u0000\u026f\u0270\u0005_\u0000\u0000\u0270\u0287\u0001"+
		"\u0000\u0000\u0000\u0271\u0272\u0005c\u0000\u0000\u0272\u0273\u0005\u001f"+
		"\u0000\u0000\u0273\u0274\u0005^\u0000\u0000\u0274\u0275\u0003,\u0016\u0000"+
		"\u0275\u0276\u0005_\u0000\u0000\u0276\u0287\u0001\u0000\u0000\u0000\u0277"+
		"\u0278\u0005c\u0000\u0000\u0278\u0279\u0005\u001e\u0000\u0000\u0279\u027a"+
		"\u0005^\u0000\u0000\u027a\u027b\u0005d\u0000\u0000\u027b\u0287\u0005_"+
		"\u0000\u0000\u027c\u027d\u0005c\u0000\u0000\u027d\u027e\u0005 \u0000\u0000"+
		"\u027e\u027f\u0005^\u0000\u0000\u027f\u0280\u0003,\u0016\u0000\u0280\u0281"+
		"\u0005_\u0000\u0000\u0281\u0287\u0001\u0000\u0000\u0000\u0282\u0283\u0005"+
		"c\u0000\u0000\u0283\u0284\u0005\u001b\u0000\u0000\u0284\u0285\u0005^\u0000"+
		"\u0000\u0285\u0287\u0005_\u0000\u0000\u0286\u026b\u0001\u0000\u0000\u0000"+
		"\u0286\u0271\u0001\u0000\u0000\u0000\u0286\u0277\u0001\u0000\u0000\u0000"+
		"\u0286\u027c\u0001\u0000\u0000\u0000\u0286\u0282\u0001\u0000\u0000\u0000"+
		"\u02877\u0001\u0000\u0000\u0000\u0288\u0289\u00054\u0000\u0000\u0289\u028a"+
		"\u0005^\u0000\u0000\u028a\u028b\u0003\\.\u0000\u028b\u028c\u0005_\u0000"+
		"\u0000\u028c\u02b6\u0001\u0000\u0000\u0000\u028d\u028e\u00055\u0000\u0000"+
		"\u028e\u028f\u0005^\u0000\u0000\u028f\u0290\u0003\\.\u0000\u0290\u0291"+
		"\u0005_\u0000\u0000\u0291\u02b6\u0001\u0000\u0000\u0000\u0292\u0293\u0005"+
		"6\u0000\u0000\u0293\u0294\u0005^\u0000\u0000\u0294\u0295\u0003\\.\u0000"+
		"\u0295\u0296\u0005_\u0000\u0000\u0296\u02b6\u0001\u0000\u0000\u0000\u0297"+
		"\u0298\u00057\u0000\u0000\u0298\u0299\u0005^\u0000\u0000\u0299\u029a\u0003"+
		"\\.\u0000\u029a\u029b\u0005_\u0000\u0000\u029b\u02b6\u0001\u0000\u0000"+
		"\u0000\u029c\u029d\u00058\u0000\u0000\u029d\u029e\u0005^\u0000\u0000\u029e"+
		"\u029f\u0003\\.\u0000\u029f\u02a0\u0005_\u0000\u0000\u02a0\u02b6\u0001"+
		"\u0000\u0000\u0000\u02a1\u02a2\u00059\u0000\u0000\u02a2\u02a3\u0005^\u0000"+
		"\u0000\u02a3\u02a4\u0003\\.\u0000\u02a4\u02a5\u0005_\u0000\u0000\u02a5"+
		"\u02b6\u0001\u0000\u0000\u0000\u02a6\u02a7\u0005:\u0000\u0000\u02a7\u02a8"+
		"\u0005^\u0000\u0000\u02a8\u02a9\u0003\\.\u0000\u02a9\u02aa\u0005_\u0000"+
		"\u0000\u02aa\u02b6\u0001\u0000\u0000\u0000\u02ab\u02ac\u0005;\u0000\u0000"+
		"\u02ac\u02ad\u0005^\u0000\u0000\u02ad\u02ae\u0003\\.\u0000\u02ae\u02af"+
		"\u0005_\u0000\u0000\u02af\u02b6\u0001\u0000\u0000\u0000\u02b0\u02b1\u0005"+
		"<\u0000\u0000\u02b1\u02b2\u0005^\u0000\u0000\u02b2\u02b3\u0003\\.\u0000"+
		"\u02b3\u02b4\u0005_\u0000\u0000\u02b4\u02b6\u0001\u0000\u0000\u0000\u02b5"+
		"\u0288\u0001\u0000\u0000\u0000\u02b5\u028d\u0001\u0000\u0000\u0000\u02b5"+
		"\u0292\u0001\u0000\u0000\u0000\u02b5\u0297\u0001\u0000\u0000\u0000\u02b5"+
		"\u029c\u0001\u0000\u0000\u0000\u02b5\u02a1\u0001\u0000\u0000\u0000\u02b5"+
		"\u02a6\u0001\u0000\u0000\u0000\u02b5\u02ab\u0001\u0000\u0000\u0000\u02b5"+
		"\u02b0\u0001\u0000\u0000\u0000\u02b69\u0001\u0000\u0000\u0000\u02b7\u02ba"+
		"\u0003>\u001f\u0000\u02b8\u02ba\u0003Z-\u0000\u02b9\u02b7\u0001\u0000"+
		"\u0000\u0000\u02b9\u02b8\u0001\u0000\u0000\u0000\u02ba;\u0001\u0000\u0000"+
		"\u0000\u02bb\u02bc\u0005\u0007\u0000\u0000\u02bc\u02bd\u0005$\u0000\u0000"+
		"\u02bd\u02be\u0005^\u0000\u0000\u02be\u02bf\u0005e\u0000\u0000\u02bf\u02c0"+
		"\u0005\u0001\u0000\u0000\u02c0\u02c2\u0005e\u0000\u0000\u02c1\u02c3\u0005"+
		"`\u0000\u0000\u02c2\u02c1\u0001\u0000\u0000\u0000\u02c2\u02c3\u0001\u0000"+
		"\u0000\u0000\u02c3\u02c4\u0001\u0000\u0000\u0000\u02c4\u02c6\u0005e\u0000"+
		"\u0000\u02c5\u02c7\u0005`\u0000\u0000\u02c6\u02c5\u0001\u0000\u0000\u0000"+
		"\u02c6\u02c7\u0001\u0000\u0000\u0000\u02c7\u02c8\u0001\u0000\u0000\u0000"+
		"\u02c8\u02ca\u0005e\u0000\u0000\u02c9\u02cb\u0005`\u0000\u0000\u02ca\u02c9"+
		"\u0001\u0000\u0000\u0000\u02ca\u02cb\u0001\u0000\u0000\u0000\u02cb\u02cc"+
		"\u0001\u0000\u0000\u0000\u02cc\u02cd\u0005e\u0000\u0000\u02cd\u02e2\u0005"+
		"_\u0000\u0000\u02ce\u02cf\u0005\u0007\u0000\u0000\u02cf\u02d0\u0005#\u0000"+
		"\u0000\u02d0\u02d1\u0005^\u0000\u0000\u02d1\u02d2\u0005e\u0000\u0000\u02d2"+
		"\u02d3\u0005\u0001\u0000\u0000\u02d3\u02d5\u0005e\u0000\u0000\u02d4\u02d6"+
		"\u0005`\u0000\u0000\u02d5\u02d4\u0001\u0000\u0000\u0000\u02d5\u02d6\u0001"+
		"\u0000\u0000\u0000\u02d6\u02d7\u0001\u0000\u0000\u0000\u02d7\u02d9\u0005"+
		"e\u0000\u0000\u02d8\u02da\u0005`\u0000\u0000\u02d9\u02d8\u0001\u0000\u0000"+
		"\u0000\u02d9\u02da\u0001\u0000\u0000\u0000\u02da\u02db\u0001\u0000\u0000"+
		"\u0000\u02db\u02dd\u0005e\u0000\u0000\u02dc\u02de\u0005`\u0000\u0000\u02dd"+
		"\u02dc\u0001\u0000\u0000\u0000\u02dd\u02de\u0001\u0000\u0000\u0000\u02de"+
		"\u02df\u0001\u0000\u0000\u0000\u02df\u02e0\u0005e\u0000\u0000\u02e0\u02e2"+
		"\u0005_\u0000\u0000\u02e1\u02bb\u0001\u0000\u0000\u0000\u02e1\u02ce\u0001"+
		"\u0000\u0000\u0000\u02e2=\u0001\u0000\u0000\u0000\u02e3\u02e7\u00038\u001c"+
		"\u0000\u02e4\u02e7\u0003X,\u0000\u02e5\u02e7\u0003@ \u0000\u02e6\u02e3"+
		"\u0001\u0000\u0000\u0000\u02e6\u02e4\u0001\u0000\u0000\u0000\u02e6\u02e5"+
		"\u0001\u0000\u0000\u0000\u02e7?\u0001\u0000\u0000\u0000\u02e8\u02ee\u0003"+
		"V+\u0000\u02e9\u02ee\u0003L&\u0000\u02ea\u02ee\u0003R)\u0000\u02eb\u02ee"+
		"\u0003T*\u0000\u02ec\u02ee\u0003N\'\u0000\u02ed\u02e8\u0001\u0000\u0000"+
		"\u0000\u02ed\u02e9\u0001\u0000\u0000\u0000\u02ed\u02ea\u0001\u0000\u0000"+
		"\u0000\u02ed\u02eb\u0001\u0000\u0000\u0000\u02ed\u02ec\u0001\u0000\u0000"+
		"\u0000\u02eeA\u0001\u0000\u0000\u0000\u02ef\u02f0\u0005G\u0000\u0000\u02f0"+
		"\u02f1\u0005c\u0000\u0000\u02f1\u02f2\u0005^\u0000\u0000\u02f2\u02f4\u0005"+
		"e\u0000\u0000\u02f3\u02f5\u0005`\u0000\u0000\u02f4\u02f3\u0001\u0000\u0000"+
		"\u0000\u02f4\u02f5\u0001\u0000\u0000\u0000\u02f5\u02f6\u0001\u0000\u0000"+
		"\u0000\u02f6\u02f8\u0003,\u0016\u0000\u02f7\u02f9\u0005`\u0000\u0000\u02f8"+
		"\u02f7\u0001\u0000\u0000\u0000\u02f8\u02f9\u0001\u0000\u0000\u0000\u02f9"+
		"\u02fa\u0001\u0000\u0000\u0000\u02fa\u02fc\u0003,\u0016\u0000\u02fb\u02fd"+
		"\u0005`\u0000\u0000\u02fc\u02fb\u0001\u0000\u0000\u0000\u02fc\u02fd\u0001"+
		"\u0000\u0000\u0000\u02fd\u02fe\u0001\u0000\u0000\u0000\u02fe\u02ff\u0003"+
		"4\u001a\u0000\u02ff\u0300\u0005_\u0000\u0000\u0300C\u0001\u0000\u0000"+
		"\u0000\u0301\u0309\u0003H$\u0000\u0302\u0309\u0003F#\u0000\u0303\u0309"+
		"\u0003J%\u0000\u0304\u0305\u0005c\u0000\u0000\u0305\u0306\u0005\u0011"+
		"\u0000\u0000\u0306\u0307\u0005^\u0000\u0000\u0307\u0309\u0005_\u0000\u0000"+
		"\u0308\u0301\u0001\u0000\u0000\u0000\u0308\u0302\u0001\u0000\u0000\u0000"+
		"\u0308\u0303\u0001\u0000\u0000\u0000\u0308\u0304\u0001\u0000\u0000\u0000"+
		"\u0309E\u0001\u0000\u0000\u0000\u030a\u030b\u0005c\u0000\u0000\u030b\u030c"+
		"\u0005\u0015\u0000\u0000\u030c\u030d\u0005^\u0000\u0000\u030d\u030e\u0005"+
		"\u001a\u0000\u0000\u030e\u0332\u0005_\u0000\u0000\u030f\u0310\u0005c\u0000"+
		"\u0000\u0310\u0311\u0005\u0015\u0000\u0000\u0311\u0312\u0005^\u0000\u0000"+
		"\u0312\u0313\u0005d\u0000\u0000\u0313\u0314\u0005\u0019\u0000\u0000\u0314"+
		"\u0332\u0005_\u0000\u0000\u0315\u0316\u0005c\u0000\u0000\u0316\u0317\u0005"+
		"\u0015\u0000\u0000\u0317\u0318\u0005^\u0000\u0000\u0318\u0319\u0005\u0018"+
		"\u0000\u0000\u0319\u031a\u0005d\u0000\u0000\u031a\u0332\u0005_\u0000\u0000"+
		"\u031b\u031c\u0005c\u0000\u0000\u031c\u031d\u0005\u0012\u0000\u0000\u031d"+
		"\u031e\u0005^\u0000\u0000\u031e\u031f\u0005\u001a\u0000\u0000\u031f\u0332"+
		"\u0005_\u0000\u0000\u0320\u0321\u0005c\u0000\u0000\u0321\u0322\u0005\u0012"+
		"\u0000\u0000\u0322\u0323\u0005^\u0000\u0000\u0323\u0324\u0005d\u0000\u0000"+
		"\u0324\u0325\u0005\u0019\u0000\u0000\u0325\u0332\u0005_\u0000\u0000\u0326"+
		"\u0327\u0005c\u0000\u0000\u0327\u0328\u0005\u0012\u0000\u0000\u0328\u0329"+
		"\u0005^\u0000\u0000\u0329\u032a\u0005\u0018\u0000\u0000\u032a\u032b\u0005"+
		"d\u0000\u0000\u032b\u0332\u0005_\u0000\u0000\u032c\u032d\u0005c\u0000"+
		"\u0000\u032d\u032e\u0005\r\u0000\u0000\u032e\u032f\u0005^\u0000\u0000"+
		"\u032f\u0330\u0005d\u0000\u0000\u0330\u0332\u0005_\u0000\u0000\u0331\u030a"+
		"\u0001\u0000\u0000\u0000\u0331\u030f\u0001\u0000\u0000\u0000\u0331\u0315"+
		"\u0001\u0000\u0000\u0000\u0331\u031b\u0001\u0000\u0000\u0000\u0331\u0320"+
		"\u0001\u0000\u0000\u0000\u0331\u0326\u0001\u0000\u0000\u0000\u0331\u032c"+
		"\u0001\u0000\u0000\u0000\u0332G\u0001\u0000\u0000\u0000\u0333\u0334\u0005"+
		"c\u0000\u0000\u0334\u0335\u0005\u0016\u0000\u0000\u0335\u0336\u0005^\u0000"+
		"\u0000\u0336\u0337\u0005\u001a\u0000\u0000\u0337\u038a\u0005_\u0000\u0000"+
		"\u0338\u0339\u0005c\u0000\u0000\u0339\u033a\u0005\u0016\u0000\u0000\u033a"+
		"\u033b\u0005^\u0000\u0000\u033b\u033c\u0005d\u0000\u0000\u033c\u033d\u0005"+
		"\u0019\u0000\u0000\u033d\u038a\u0005_\u0000\u0000\u033e\u033f\u0005c\u0000"+
		"\u0000\u033f\u0340\u0005\u0016\u0000\u0000\u0340\u0341\u0005^\u0000\u0000"+
		"\u0341\u0342\u0005\u0018\u0000\u0000\u0342\u0343\u0005d\u0000\u0000\u0343"+
		"\u038a\u0005_\u0000\u0000\u0344\u0345\u0005c\u0000\u0000\u0345\u0346\u0005"+
		"\u0016\u0000\u0000\u0346\u0347\u0005^\u0000\u0000\u0347\u0349\u0005d\u0000"+
		"\u0000\u0348\u034a\u0005`\u0000\u0000\u0349\u0348\u0001\u0000\u0000\u0000"+
		"\u0349\u034a\u0001\u0000\u0000\u0000\u034a\u034b\u0001\u0000\u0000\u0000"+
		"\u034b\u034d\u0005d\u0000\u0000\u034c\u034e\u0005`\u0000\u0000\u034d\u034c"+
		"\u0001\u0000\u0000\u0000\u034d\u034e\u0001\u0000\u0000\u0000\u034e\u034f"+
		"\u0001\u0000\u0000\u0000\u034f\u0350\u0005d\u0000\u0000\u0350\u038a\u0005"+
		"_\u0000\u0000\u0351\u0352\u0005c\u0000\u0000\u0352\u0353\u0005\u0015\u0000"+
		"\u0000\u0353\u0354\u0005^\u0000\u0000\u0354\u0356\u0005d\u0000\u0000\u0355"+
		"\u0357\u0005`\u0000\u0000\u0356\u0355\u0001\u0000\u0000\u0000\u0356\u0357"+
		"\u0001\u0000\u0000\u0000\u0357\u0358\u0001\u0000\u0000\u0000\u0358\u0359"+
		"\u0005d\u0000\u0000\u0359\u035a\u0005\u0019\u0000\u0000\u035a\u038a\u0005"+
		"_\u0000\u0000\u035b\u035c\u0005c\u0000\u0000\u035c\u035d\u0005\u000e\u0000"+
		"\u0000\u035d\u035e\u0005^\u0000\u0000\u035e\u0360\u0005d\u0000\u0000\u035f"+
		"\u0361\u0005`\u0000\u0000\u0360\u035f\u0001\u0000\u0000\u0000\u0360\u0361"+
		"\u0001\u0000\u0000\u0000\u0361\u0362\u0001\u0000\u0000\u0000\u0362\u0363"+
		"\u0005d\u0000\u0000\u0363\u0364\u0005\u0019\u0000\u0000\u0364\u038a\u0005"+
		"_\u0000\u0000\u0365\u0366\u0005c\u0000\u0000\u0366\u0367\u0005\u0015\u0000"+
		"\u0000\u0367\u0368\u0005^\u0000\u0000\u0368\u0369\u0005d\u0000\u0000\u0369"+
		"\u036a\u0005\u0017\u0000\u0000\u036a\u038a\u0005_\u0000\u0000\u036b\u036c"+
		"\u0005c\u0000\u0000\u036c\u036d\u0005\u0015\u0000\u0000\u036d\u036e\u0005"+
		"^\u0000\u0000\u036e\u036f\u0005\u0010\u0000\u0000\u036f\u0370\u0005d\u0000"+
		"\u0000\u0370\u0371\u0005\u0010\u0000\u0000\u0371\u038a\u0005_\u0000\u0000"+
		"\u0372\u0373\u0005c\u0000\u0000\u0373\u0374\u0005\u000e\u0000\u0000\u0374"+
		"\u0375\u0005^\u0000\u0000\u0375\u0376\u0005d\u0000\u0000\u0376\u0377\u0005"+
		"\u0017\u0000\u0000\u0377\u038a\u0005_\u0000\u0000\u0378\u0379\u0005c\u0000"+
		"\u0000\u0379\u037a\u0005\u000e\u0000\u0000\u037a\u037b\u0005^\u0000\u0000"+
		"\u037b\u037c\u0005\u0010\u0000\u0000\u037c\u037d\u0005d\u0000\u0000\u037d"+
		"\u037e\u0005\u0010\u0000\u0000\u037e\u038a\u0005_\u0000\u0000\u037f\u0380"+
		"\u0005c\u0000\u0000\u0380\u0381\u0005\u0015\u0000\u0000\u0381\u0382\u0005"+
		"^\u0000\u0000\u0382\u0383\u0005\u000f\u0000\u0000\u0383\u038a\u0005_\u0000"+
		"\u0000\u0384\u0385\u0005c\u0000\u0000\u0385\u0386\u0005\u000e\u0000\u0000"+
		"\u0386\u0387\u0005^\u0000\u0000\u0387\u0388\u0005\u000f\u0000\u0000\u0388"+
		"\u038a\u0005_\u0000\u0000\u0389\u0333\u0001\u0000\u0000\u0000\u0389\u0338"+
		"\u0001\u0000\u0000\u0000\u0389\u033e\u0001\u0000\u0000\u0000\u0389\u0344"+
		"\u0001\u0000\u0000\u0000\u0389\u0351\u0001\u0000\u0000\u0000\u0389\u035b"+
		"\u0001\u0000\u0000\u0000\u0389\u0365\u0001\u0000\u0000\u0000\u0389\u036b"+
		"\u0001\u0000\u0000\u0000\u0389\u0372\u0001\u0000\u0000\u0000\u0389\u0378"+
		"\u0001\u0000\u0000\u0000\u0389\u037f\u0001\u0000\u0000\u0000\u0389\u0384"+
		"\u0001\u0000\u0000\u0000\u038aI\u0001\u0000\u0000\u0000\u038b\u038c\u0005"+
		"c\u0000\u0000\u038c\u038d\u0005\u0012\u0000\u0000\u038d\u038e\u0005^\u0000"+
		"\u0000\u038e\u0390\u0005d\u0000\u0000\u038f\u0391\u0005`\u0000\u0000\u0390"+
		"\u038f\u0001\u0000\u0000\u0000\u0390\u0391\u0001\u0000\u0000\u0000\u0391"+
		"\u0392\u0001\u0000\u0000\u0000\u0392\u0394\u0005d\u0000\u0000\u0393\u0395"+
		"\u0005`\u0000\u0000\u0394\u0393\u0001\u0000\u0000\u0000\u0394\u0395\u0001"+
		"\u0000\u0000\u0000\u0395\u0396\u0001\u0000\u0000\u0000\u0396\u0397\u0005"+
		"d\u0000\u0000\u0397\u03d1\u0005_\u0000\u0000\u0398\u0399\u0005c\u0000"+
		"\u0000\u0399\u039a\u0005\u0012\u0000\u0000\u039a\u039b\u0005^\u0000\u0000"+
		"\u039b\u039d\u0005d\u0000\u0000\u039c\u039e\u0005`\u0000\u0000\u039d\u039c"+
		"\u0001\u0000\u0000\u0000\u039d\u039e\u0001\u0000\u0000\u0000\u039e\u039f"+
		"\u0001\u0000\u0000\u0000\u039f\u03a0\u0005d\u0000\u0000\u03a0\u03a1\u0005"+
		"\u0019\u0000\u0000\u03a1\u03d1\u0005_\u0000\u0000\u03a2\u03a3\u0005c\u0000"+
		"\u0000\u03a3\u03a4\u0005\u0013\u0000\u0000\u03a4\u03a5\u0005^\u0000\u0000"+
		"\u03a5\u03a7\u0005d\u0000\u0000\u03a6\u03a8\u0005`\u0000\u0000\u03a7\u03a6"+
		"\u0001\u0000\u0000\u0000\u03a7\u03a8\u0001\u0000\u0000\u0000\u03a8\u03a9"+
		"\u0001\u0000\u0000\u0000\u03a9\u03aa\u0005d\u0000\u0000\u03aa\u03ab\u0005"+
		"\u0019\u0000\u0000\u03ab\u03d1\u0005_\u0000\u0000\u03ac\u03ad\u0005c\u0000"+
		"\u0000\u03ad\u03ae\u0005\u0012\u0000\u0000\u03ae\u03af\u0005^\u0000\u0000"+
		"\u03af\u03b0\u0005d\u0000\u0000\u03b0\u03b1\u0005\u0017\u0000\u0000\u03b1"+
		"\u03d1\u0005_\u0000\u0000\u03b2\u03b3\u0005c\u0000\u0000\u03b3\u03b4\u0005"+
		"\u0012\u0000\u0000\u03b4\u03b5\u0005^\u0000\u0000\u03b5\u03b6\u0005\u0010"+
		"\u0000\u0000\u03b6\u03b7\u0005d\u0000\u0000\u03b7\u03b8\u0005\u0010\u0000"+
		"\u0000\u03b8\u03d1\u0005_\u0000\u0000\u03b9\u03ba\u0005c\u0000\u0000\u03ba"+
		"\u03bb\u0005\u0013\u0000\u0000\u03bb\u03bc\u0005^\u0000\u0000\u03bc\u03bd"+
		"\u0005d\u0000\u0000\u03bd\u03be\u0005\u0017\u0000\u0000\u03be\u03d1\u0005"+
		"_\u0000\u0000\u03bf\u03c0\u0005c\u0000\u0000\u03c0\u03c1\u0005\u0013\u0000"+
		"\u0000\u03c1\u03c2\u0005^\u0000\u0000\u03c2\u03c3\u0005\u0010\u0000\u0000"+
		"\u03c3\u03c4\u0005d\u0000\u0000\u03c4\u03c5\u0005\u0010\u0000\u0000\u03c5"+
		"\u03d1\u0005_\u0000\u0000\u03c6\u03c7\u0005c\u0000\u0000\u03c7\u03c8\u0005"+
		"\u0012\u0000\u0000\u03c8\u03c9\u0005^\u0000\u0000\u03c9\u03ca\u0005\u000f"+
		"\u0000\u0000\u03ca\u03d1\u0005_\u0000\u0000\u03cb\u03cc\u0005c\u0000\u0000"+
		"\u03cc\u03cd\u0005\u0013\u0000\u0000\u03cd\u03ce\u0005^\u0000\u0000\u03ce"+
		"\u03cf\u0005\u000f\u0000\u0000\u03cf\u03d1\u0005_\u0000\u0000\u03d0\u038b"+
		"\u0001\u0000\u0000\u0000\u03d0\u0398\u0001\u0000\u0000\u0000\u03d0\u03a2"+
		"\u0001\u0000\u0000\u0000\u03d0\u03ac\u0001\u0000\u0000\u0000\u03d0\u03b2"+
		"\u0001\u0000\u0000\u0000\u03d0\u03b9\u0001\u0000\u0000\u0000\u03d0\u03bf"+
		"\u0001\u0000\u0000\u0000\u03d0\u03c6\u0001\u0000\u0000\u0000\u03d0\u03cb"+
		"\u0001\u0000\u0000\u0000\u03d1K\u0001\u0000\u0000\u0000\u03d2\u03d3\u0005"+
		"c\u0000\u0000\u03d3\u03d4\u0005#\u0000\u0000\u03d4\u03d5\u0005^\u0000"+
		"\u0000\u03d5\u03d6\u0005e\u0000\u0000\u03d6\u03d7\u0005_\u0000\u0000\u03d7"+
		"M\u0001\u0000\u0000\u0000\u03d8\u03d9\u0005c\u0000\u0000\u03d9\u03da\u0005"+
		"!\u0000\u0000\u03da\u03db\u0005^\u0000\u0000\u03db\u03dc\u0005e\u0000"+
		"\u0000\u03dc\u03e4\u0005_\u0000\u0000\u03dd\u03de\u0005c\u0000\u0000\u03de"+
		"\u03df\u0005!\u0000\u0000\u03df\u03e0\u0005^\u0000\u0000\u03e0\u03e1\u0005"+
		"e\u0000\u0000\u03e1\u03e2\u0005e\u0000\u0000\u03e2\u03e4\u0005_\u0000"+
		"\u0000\u03e3\u03d8\u0001\u0000\u0000\u0000\u03e3\u03dd\u0001\u0000\u0000"+
		"\u0000\u03e4O\u0001\u0000\u0000\u0000\u03e5\u03e6\u0005*\u0000\u0000\u03e6"+
		"\u03e7\u0005c\u0000\u0000\u03e7\u03e8\u0005^\u0000\u0000\u03e8\u03ea\u0005"+
		"e\u0000\u0000\u03e9\u03eb\u0005`\u0000\u0000\u03ea\u03e9\u0001\u0000\u0000"+
		"\u0000\u03ea\u03eb\u0001\u0000\u0000\u0000\u03eb\u03ec\u0001\u0000\u0000"+
		"\u0000\u03ec\u03ed\u0005e\u0000\u0000\u03ed\u040c\u0005_\u0000\u0000\u03ee"+
		"\u03ef\u0005(\u0000\u0000\u03ef\u03f0\u0005c\u0000\u0000\u03f0\u03f1\u0005"+
		"^\u0000\u0000\u03f1\u03f2\u0005d\u0000\u0000\u03f2\u040c\u0005_\u0000"+
		"\u0000\u03f3\u03f4\u0005)\u0000\u0000\u03f4\u03f5\u0005c\u0000\u0000\u03f5"+
		"\u03f6\u0005^\u0000\u0000\u03f6\u03f7\u0005e\u0000\u0000\u03f7\u040c\u0005"+
		"_\u0000\u0000\u03f8\u03f9\u0005\'\u0000\u0000\u03f9\u03fa\u0005c\u0000"+
		"\u0000\u03fa\u03fb\u0005^\u0000\u0000\u03fb\u03fc\u0005d\u0000\u0000\u03fc"+
		"\u040c\u0005_\u0000\u0000\u03fd\u03fe\u0005&\u0000\u0000\u03fe\u03ff\u0005"+
		"c\u0000\u0000\u03ff\u0400\u0005^\u0000\u0000\u0400\u0401\u0005e\u0000"+
		"\u0000\u0401\u040c\u0005_\u0000\u0000\u0402\u0403\u0005%\u0000\u0000\u0403"+
		"\u0404\u0005c\u0000\u0000\u0404\u0405\u0005^\u0000\u0000\u0405\u0407\u0005"+
		"e\u0000\u0000\u0406\u0408\u0005`\u0000\u0000\u0407\u0406\u0001\u0000\u0000"+
		"\u0000\u0407\u0408\u0001\u0000\u0000\u0000\u0408\u0409\u0001\u0000\u0000"+
		"\u0000\u0409\u040a\u0005e\u0000\u0000\u040a\u040c\u0005_\u0000\u0000\u040b"+
		"\u03e5\u0001\u0000\u0000\u0000\u040b\u03ee\u0001\u0000\u0000\u0000\u040b"+
		"\u03f3\u0001\u0000\u0000\u0000\u040b\u03f8\u0001\u0000\u0000\u0000\u040b"+
		"\u03fd\u0001\u0000\u0000\u0000\u040b\u0402\u0001\u0000\u0000\u0000\u040c"+
		"Q\u0001\u0000\u0000\u0000\u040d\u040e\u0005c\u0000\u0000\u040e\u040f\u0005"+
		"\"\u0000\u0000\u040f\u0410\u0005^\u0000\u0000\u0410\u0411\u0005d\u0000"+
		"\u0000\u0411\u0418\u0005_\u0000\u0000\u0412\u0413\u0005c\u0000\u0000\u0413"+
		"\u0414\u0005\"\u0000\u0000\u0414\u0415\u0005^\u0000\u0000\u0415\u0416"+
		"\u0005e\u0000\u0000\u0416\u0418\u0005_\u0000\u0000\u0417\u040d\u0001\u0000"+
		"\u0000\u0000\u0417\u0412\u0001\u0000\u0000\u0000\u0418S\u0001\u0000\u0000"+
		"\u0000\u0419\u041a\u0005c\u0000\u0000\u041a\u041b\u0005$\u0000\u0000\u041b"+
		"\u041c\u0005^\u0000\u0000\u041c\u041d\u0005e\u0000\u0000\u041d\u041e\u0005"+
		"_\u0000\u0000\u041eU\u0001\u0000\u0000\u0000\u041f\u0420\u0005.\u0000"+
		"\u0000\u0420\u0421\u0005^\u0000\u0000\u0421\u0422\u0005e\u0000\u0000\u0422"+
		"\u0423\u0005_\u0000\u0000\u0423W\u0001\u0000\u0000\u0000\u0424\u0425\u0005"+
		"/\u0000\u0000\u0425\u0426\u0005^\u0000\u0000\u0426\u0427\u0003\\.\u0000"+
		"\u0427\u0428\u0005_\u0000\u0000\u0428Y\u0001\u0000\u0000\u0000\u0429\u042a"+
		"\u0005c\u0000\u0000\u042a\u042f\u0005^\u0000\u0000\u042b\u042d\u0003\\"+
		".\u0000\u042c\u042e\u0005`\u0000\u0000\u042d\u042c\u0001\u0000\u0000\u0000"+
		"\u042d\u042e\u0001\u0000\u0000\u0000\u042e\u0430\u0001\u0000\u0000\u0000"+
		"\u042f\u042b\u0001\u0000\u0000\u0000\u0430\u0431\u0001\u0000\u0000\u0000"+
		"\u0431\u042f\u0001\u0000\u0000\u0000\u0431\u0432\u0001\u0000\u0000\u0000"+
		"\u0432\u0433\u0001\u0000\u0000\u0000\u0433\u0434\u0005_\u0000\u0000\u0434"+
		"\u043c\u0001\u0000\u0000\u0000\u0435\u0436\u0005c\u0000\u0000\u0436\u0437"+
		"\u0005^\u0000\u0000\u0437\u0438\u0003\u0004\u0002\u0000\u0438\u0439\u0005"+
		"_\u0000\u0000\u0439\u043a\u0005\u0001\u0000\u0000\u043a\u043c\u0001\u0000"+
		"\u0000\u0000\u043b\u0429\u0001\u0000\u0000\u0000\u043b\u0435\u0001\u0000"+
		"\u0000\u0000\u043c[\u0001\u0000\u0000\u0000\u043d\u043e\u0006.\uffff\uffff"+
		"\u0000\u043e\u043f\u0005[\u0000\u0000\u043f\u0450\u0003\\.\b\u0440\u0450"+
		"\u0005e\u0000\u0000\u0441\u0450\u0005d\u0000\u0000\u0442\u0450\u0003J"+
		"%\u0000\u0443\u0450\u0003H$\u0000\u0444\u0450\u0003:\u001d\u0000\u0445"+
		"\u0446\u0005^\u0000\u0000\u0446\u0447\u0003\\.\u0000\u0447\u0448\u0005"+
		"_\u0000\u0000\u0448\u0450\u0001\u0000\u0000\u0000\u0449\u044d\u0005c\u0000"+
		"\u0000\u044a\u044b\u0005\u0002\u0000\u0000\u044b\u044c\u0005d\u0000\u0000"+
		"\u044c\u044e\u0005\u0003\u0000\u0000\u044d\u044a\u0001\u0000\u0000\u0000"+
		"\u044d\u044e\u0001\u0000\u0000\u0000\u044e\u0450\u0001\u0000\u0000\u0000"+
		"\u044f\u043d\u0001\u0000\u0000\u0000\u044f\u0440\u0001\u0000\u0000\u0000"+
		"\u044f\u0441\u0001\u0000\u0000\u0000\u044f\u0442\u0001\u0000\u0000\u0000"+
		"\u044f\u0443\u0001\u0000\u0000\u0000\u044f\u0444\u0001\u0000\u0000\u0000"+
		"\u044f\u0445\u0001\u0000\u0000\u0000\u044f\u0449\u0001\u0000\u0000\u0000"+
		"\u0450\u045f\u0001\u0000\u0000\u0000\u0451\u0452\n\f\u0000\u0000\u0452"+
		"\u0453\u0005]\u0000\u0000\u0453\u045e\u0003\\.\r\u0454\u0455\n\u000b\u0000"+
		"\u0000\u0455\u0456\u0007\u0001\u0000\u0000\u0456\u045e\u0003\\.\f\u0457"+
		"\u0458\n\n\u0000\u0000\u0458\u0459\u0007\u0002\u0000\u0000\u0459\u045e"+
		"\u0003\\.\u000b\u045a\u045b\n\t\u0000\u0000\u045b\u045c\u0005@\u0000\u0000"+
		"\u045c\u045e\u0003\\.\n\u045d\u0451\u0001\u0000\u0000\u0000\u045d\u0454"+
		"\u0001\u0000\u0000\u0000\u045d\u0457\u0001\u0000\u0000\u0000\u045d\u045a"+
		"\u0001\u0000\u0000\u0000\u045e\u0461\u0001\u0000\u0000\u0000\u045f\u045d"+
		"\u0001\u0000\u0000\u0000\u045f\u0460\u0001\u0000\u0000\u0000\u0460]\u0001"+
		"\u0000\u0000\u0000\u0461\u045f\u0001\u0000\u0000\u0000\u0462\u0463\u0005"+
		"D\u0000\u0000\u0463\u0464\u0005\f\u0000\u0000\u0464\u0465\u0005^\u0000"+
		"\u0000\u0465\u0466\u0005c\u0000\u0000\u0466\u0485\u0005_\u0000\u0000\u0467"+
		"\u0468\u0005D\u0000\u0000\u0468\u0469\u0005\u000b\u0000\u0000\u0469\u046a"+
		"\u0005^\u0000\u0000\u046a\u046b\u0005c\u0000\u0000\u046b\u0485\u0005_"+
		"\u0000\u0000\u046c\u046d\u0005D\u0000\u0000\u046d\u046e\u0005\n\u0000"+
		"\u0000\u046e\u046f\u0005^\u0000\u0000\u046f\u0470\u0005c\u0000\u0000\u0470"+
		"\u0471\u0005c\u0000\u0000\u0471\u0485\u0005_\u0000\u0000\u0472\u0473\u0005"+
		"c\u0000\u0000\u0473\u0474\u0005\t\u0000\u0000\u0474\u0475\u0005^\u0000"+
		"\u0000\u0475\u0477\u0005d\u0000\u0000\u0476\u0478\u0005`\u0000\u0000\u0477"+
		"\u0476\u0001\u0000\u0000\u0000\u0477\u0478\u0001\u0000\u0000\u0000\u0478"+
		"\u0479\u0001\u0000\u0000\u0000\u0479\u047a\u0005d\u0000\u0000\u047a\u0485"+
		"\u0005_\u0000\u0000\u047b\u047c\u0005c\u0000\u0000\u047c\u047d\u0005\b"+
		"\u0000\u0000\u047d\u047e\u0005^\u0000\u0000\u047e\u0480\u0005b\u0000\u0000"+
		"\u047f\u0481\u0005`\u0000\u0000\u0480\u047f\u0001\u0000\u0000\u0000\u0480"+
		"\u0481\u0001\u0000\u0000\u0000\u0481\u0482\u0001\u0000\u0000\u0000\u0482"+
		"\u0483\u0005b\u0000\u0000\u0483\u0485\u0005_\u0000\u0000\u0484\u0462\u0001"+
		"\u0000\u0000\u0000\u0484\u0467\u0001\u0000\u0000\u0000\u0484\u046c\u0001"+
		"\u0000\u0000\u0000\u0484\u0472\u0001\u0000\u0000\u0000\u0484\u047b\u0001"+
		"\u0000\u0000\u0000\u0485_\u0001\u0000\u0000\u0000scglptx|\u0080\u0084"+
		"\u0088\u008c\u0090\u0094\u0098\u009c\u00a0\u00a4\u00a8\u00ac\u00b0\u00b4"+
		"\u00b8\u00bc\u00c0\u00c4\u00c7\u00ce\u00d8\u00e0\u00e4\u00f7\u00ff\u010b"+
		"\u010f\u0112\u011c\u012a\u0133\u0143\u014e\u015f\u016a\u0194\u0198\u019e"+
		"\u01a7\u01b0\u01b8\u01c4\u01cd\u01da\u01dd\u01e2\u01e9\u01f2\u01f5\u01f9"+
		"\u01fe\u0202\u020a\u020e\u0213\u0218\u021c\u0223\u0234\u0239\u023f\u024d"+
		"\u0256\u025f\u0264\u0269\u0286\u02b5\u02b9\u02c2\u02c6\u02ca\u02d5\u02d9"+
		"\u02dd\u02e1\u02e6\u02ed\u02f4\u02f8\u02fc\u0308\u0331\u0349\u034d\u0356"+
		"\u0360\u0389\u0390\u0394\u039d\u03a7\u03d0\u03e3\u03ea\u0407\u040b\u0417"+
		"\u042d\u0431\u043b\u044d\u044f\u045d\u045f\u0477\u0480\u0484";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}