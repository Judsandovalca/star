// Generated from Star.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link StarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface StarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link StarParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(StarParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by the {@code prob}
	 * labeled alternative in {@link StarParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProb(StarParser.ProbContext ctx);
	/**
	 * Visit a parse tree produced by the {@code algoritmo}
	 * labeled alternative in {@link StarParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlgoritmo(StarParser.AlgoritmoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code usefun}
	 * labeled alternative in {@link StarParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUsefun(StarParser.UsefunContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrayf}
	 * labeled alternative in {@link StarParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayf(StarParser.ArrayfContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stringopp}
	 * labeled alternative in {@link StarParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringopp(StarParser.StringoppContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrayl}
	 * labeled alternative in {@link StarParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayl(StarParser.ArraylContext ctx);
	/**
	 * Visit a parse tree produced by the {@code twm}
	 * labeled alternative in {@link StarParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTwm(StarParser.TwmContext ctx);
	/**
	 * Visit a parse tree produced by the {@code twmop}
	 * labeled alternative in {@link StarParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTwmop(StarParser.TwmopContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arraylop}
	 * labeled alternative in {@link StarParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArraylop(StarParser.ArraylopContext ctx);
	/**
	 * Visit a parse tree produced by the {@code printExpr}
	 * labeled alternative in {@link StarParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintExpr(StarParser.PrintExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assign}
	 * labeled alternative in {@link StarParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(StarParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bexpr}
	 * labeled alternative in {@link StarParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBexpr(StarParser.BexprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code while}
	 * labeled alternative in {@link StarParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile(StarParser.WhileContext ctx);
	/**
	 * Visit a parse tree produced by the {@code if}
	 * labeled alternative in {@link StarParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf(StarParser.IfContext ctx);
	/**
	 * Visit a parse tree produced by the {@code for}
	 * labeled alternative in {@link StarParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor(StarParser.ForContext ctx);
	/**
	 * Visit a parse tree produced by the {@code relationalexpresion}
	 * labeled alternative in {@link StarParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalexpresion(StarParser.RelationalexpresionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code write}
	 * labeled alternative in {@link StarParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWrite(StarParser.WriteContext ctx);
	/**
	 * Visit a parse tree produced by the {@code fwrite}
	 * labeled alternative in {@link StarParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFwrite(StarParser.FwriteContext ctx);
	/**
	 * Visit a parse tree produced by the {@code read}
	 * labeled alternative in {@link StarParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRead(StarParser.ReadContext ctx);
	/**
	 * Visit a parse tree produced by the {@code fread}
	 * labeled alternative in {@link StarParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFread(StarParser.FreadContext ctx);
	/**
	 * Visit a parse tree produced by the {@code functions}
	 * labeled alternative in {@link StarParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctions(StarParser.FunctionsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code return2}
	 * labeled alternative in {@link StarParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn2(StarParser.Return2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code trig}
	 * labeled alternative in {@link StarParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrig(StarParser.TrigContext ctx);
	/**
	 * Visit a parse tree produced by the {@code family}
	 * labeled alternative in {@link StarParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFamily(StarParser.FamilyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lambdafam}
	 * labeled alternative in {@link StarParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdafam(StarParser.LambdafamContext ctx);
	/**
	 * Visit a parse tree produced by the {@code blank}
	 * labeled alternative in {@link StarParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlank(StarParser.BlankContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarParser#idlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdlist(StarParser.IdlistContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tipoInt}
	 * labeled alternative in {@link StarParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipoInt(StarParser.TipoIntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tipoFloat}
	 * labeled alternative in {@link StarParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipoFloat(StarParser.TipoFloatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tipoString}
	 * labeled alternative in {@link StarParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipoString(StarParser.TipoStringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tipoBool}
	 * labeled alternative in {@link StarParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipoBool(StarParser.TipoBoolContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tipoMatrix}
	 * labeled alternative in {@link StarParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipoMatrix(StarParser.TipoMatrixContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tipoVector}
	 * labeled alternative in {@link StarParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipoVector(StarParser.TipoVectorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tipoTMW}
	 * labeled alternative in {@link StarParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipoTMW(StarParser.TipoTMWContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarParser#algorithm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlgorithm(StarParser.AlgorithmContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(StarParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarParser#return_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_statement(StarParser.Return_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarParser#recursiveCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecursiveCall(StarParser.RecursiveCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarParser#while_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_statement(StarParser.While_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarParser#if_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_statement(StarParser.If_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarParser#for_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_statement(StarParser.For_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarParser#fun_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFun_statement(StarParser.Fun_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarParser#relexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelexpr(StarParser.RelexprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bexp1}
	 * labeled alternative in {@link StarParser#bexpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBexp1(StarParser.Bexp1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code bexp2}
	 * labeled alternative in {@link StarParser#bexpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBexp2(StarParser.Bexp2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code bterm2}
	 * labeled alternative in {@link StarParser#bterm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBterm2(StarParser.Bterm2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code bterm1}
	 * labeled alternative in {@link StarParser#bterm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBterm1(StarParser.Bterm1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code bNeg}
	 * labeled alternative in {@link StarParser#bfactor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBNeg(StarParser.BNegContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bParenthesis}
	 * labeled alternative in {@link StarParser#bfactor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBParenthesis(StarParser.BParenthesisContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bID}
	 * labeled alternative in {@link StarParser#bfactor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBID(StarParser.BIDContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bTrue}
	 * labeled alternative in {@link StarParser#bfactor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBTrue(StarParser.BTrueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bFalse}
	 * labeled alternative in {@link StarParser#bfactor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBFalse(StarParser.BFalseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code relationals}
	 * labeled alternative in {@link StarParser#bfactor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationals(StarParser.RelationalsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code relParenthesis}
	 * labeled alternative in {@link StarParser#bfactor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelParenthesis(StarParser.RelParenthesisContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarParser#read_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRead_statement(StarParser.Read_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarParser#write_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWrite_statement(StarParser.Write_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarParser#fwrite_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFwrite_statement(StarParser.Fwrite_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarParser#fread_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFread_statement(StarParser.Fread_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(StarParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarParser#matrix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMatrix(StarParser.MatrixContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarParser#array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray(StarParser.ArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarParser#assignment_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment_statement(StarParser.Assignment_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(StarParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarParser#arrayexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayexpr(StarParser.ArrayexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarParser#arraylist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArraylist(StarParser.ArraylistContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarParser#arraylistop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArraylistop(StarParser.ArraylistopContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarParser#trigFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrigFunction(StarParser.TrigFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(StarParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarParser#lambdaFamily}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaFamily(StarParser.LambdaFamilyContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarParser#mathFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMathFunction(StarParser.MathFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarParser#probFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProbFunction(StarParser.ProbFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarParser#twoWaysModel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTwoWaysModel(StarParser.TwoWaysModelContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarParser#twoWaysModelop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTwoWaysModelop(StarParser.TwoWaysModelopContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarParser#xOperations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXOperations(StarParser.XOperationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarParser#nOperations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNOperations(StarParser.NOperationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarParser#rOperations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitROperations(StarParser.ROperationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarParser#densityFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDensityFunction(StarParser.DensityFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarParser#momentumGenerationFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMomentumGenerationFunction(StarParser.MomentumGenerationFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarParser#familyDistribution}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFamilyDistribution(StarParser.FamilyDistributionContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarParser#distributionFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDistributionFunction(StarParser.DistributionFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarParser#percentilFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPercentilFunction(StarParser.PercentilFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarParser#randomFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRandomFunction(StarParser.RandomFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarParser#logFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogFunction(StarParser.LogFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarParser#usefunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUsefunction(StarParser.UsefunctionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rOP}
	 * labeled alternative in {@link StarParser#algexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitROP(StarParser.ROPContext ctx);
	/**
	 * Visit a parse tree produced by the {@code trigf}
	 * labeled alternative in {@link StarParser#algexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrigf(StarParser.TrigfContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Parenthesis}
	 * labeled alternative in {@link StarParser#algexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthesis(StarParser.ParenthesisContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Negation}
	 * labeled alternative in {@link StarParser#algexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNegation(StarParser.NegationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Number}
	 * labeled alternative in {@link StarParser#algexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(StarParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MulDiv}
	 * labeled alternative in {@link StarParser#algexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulDiv(StarParser.MulDivContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link StarParser#algexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddSub(StarParser.AddSubContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PowerRoot}
	 * labeled alternative in {@link StarParser#algexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPowerRoot(StarParser.PowerRootContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Md}
	 * labeled alternative in {@link StarParser#algexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMd(StarParser.MdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ENT}
	 * labeled alternative in {@link StarParser#algexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitENT(StarParser.ENTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code id}
	 * labeled alternative in {@link StarParser#algexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(StarParser.IdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nOP}
	 * labeled alternative in {@link StarParser#algexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNOP(StarParser.NOPContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarParser#stringOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringOp(StarParser.StringOpContext ctx);
}