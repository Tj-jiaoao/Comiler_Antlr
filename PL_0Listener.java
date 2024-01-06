// Generated from /Users/jiaoao/Documents/编译原理大作业/PL_0/src/PL_0.g4 by ANTLR 4.13.1
package PL_0;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PL_0Parser}.
 */
public interface PL_0Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PL_0Parser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(PL_0Parser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link PL_0Parser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(PL_0Parser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link PL_0Parser#programHeader}.
	 * @param ctx the parse tree
	 */
	void enterProgramHeader(PL_0Parser.ProgramHeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link PL_0Parser#programHeader}.
	 * @param ctx the parse tree
	 */
	void exitProgramHeader(PL_0Parser.ProgramHeaderContext ctx);
	/**
	 * Enter a parse tree produced by {@link PL_0Parser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(PL_0Parser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link PL_0Parser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(PL_0Parser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link PL_0Parser#constDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterConstDeclaration(PL_0Parser.ConstDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PL_0Parser#constDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitConstDeclaration(PL_0Parser.ConstDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PL_0Parser#constDefinition}.
	 * @param ctx the parse tree
	 */
	void enterConstDefinition(PL_0Parser.ConstDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PL_0Parser#constDefinition}.
	 * @param ctx the parse tree
	 */
	void exitConstDefinition(PL_0Parser.ConstDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PL_0Parser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVarDeclaration(PL_0Parser.VarDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PL_0Parser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVarDeclaration(PL_0Parser.VarDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PL_0Parser#statementPart}.
	 * @param ctx the parse tree
	 */
	void enterStatementPart(PL_0Parser.StatementPartContext ctx);
	/**
	 * Exit a parse tree produced by {@link PL_0Parser#statementPart}.
	 * @param ctx the parse tree
	 */
	void exitStatementPart(PL_0Parser.StatementPartContext ctx);
	/**
	 * Enter a parse tree produced by {@link PL_0Parser#compoundStatement}.
	 * @param ctx the parse tree
	 */
	void enterCompoundStatement(PL_0Parser.CompoundStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PL_0Parser#compoundStatement}.
	 * @param ctx the parse tree
	 */
	void exitCompoundStatement(PL_0Parser.CompoundStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PL_0Parser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(PL_0Parser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PL_0Parser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(PL_0Parser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PL_0Parser#assignmentStatement}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentStatement(PL_0Parser.AssignmentStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PL_0Parser#assignmentStatement}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentStatement(PL_0Parser.AssignmentStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PL_0Parser#conditionStatement}.
	 * @param ctx the parse tree
	 */
	void enterConditionStatement(PL_0Parser.ConditionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PL_0Parser#conditionStatement}.
	 * @param ctx the parse tree
	 */
	void exitConditionStatement(PL_0Parser.ConditionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PL_0Parser#loopStatement}.
	 * @param ctx the parse tree
	 */
	void enterLoopStatement(PL_0Parser.LoopStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PL_0Parser#loopStatement}.
	 * @param ctx the parse tree
	 */
	void exitLoopStatement(PL_0Parser.LoopStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PL_0Parser#emptyStatement}.
	 * @param ctx the parse tree
	 */
	void enterEmptyStatement(PL_0Parser.EmptyStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PL_0Parser#emptyStatement}.
	 * @param ctx the parse tree
	 */
	void exitEmptyStatement(PL_0Parser.EmptyStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PL_0Parser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(PL_0Parser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PL_0Parser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(PL_0Parser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PL_0Parser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(PL_0Parser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link PL_0Parser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(PL_0Parser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link PL_0Parser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(PL_0Parser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PL_0Parser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(PL_0Parser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PL_0Parser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(PL_0Parser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PL_0Parser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(PL_0Parser.ConditionContext ctx);
}