// Generated from /Users/jiaoao/Documents/编译原理大作业/PL_0/src/PL_0.g4 by ANTLR 4.13.1
package PL_0;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link PL_0Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface PL_0Visitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link PL_0Parser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(PL_0Parser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link PL_0Parser#programHeader}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgramHeader(PL_0Parser.ProgramHeaderContext ctx);
	/**
	 * Visit a parse tree produced by {@link PL_0Parser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(PL_0Parser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link PL_0Parser#constDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstDeclaration(PL_0Parser.ConstDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PL_0Parser#constDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstDefinition(PL_0Parser.ConstDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PL_0Parser#varDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDeclaration(PL_0Parser.VarDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PL_0Parser#statementPart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementPart(PL_0Parser.StatementPartContext ctx);
	/**
	 * Visit a parse tree produced by {@link PL_0Parser#compoundStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompoundStatement(PL_0Parser.CompoundStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PL_0Parser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(PL_0Parser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PL_0Parser#assignmentStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentStatement(PL_0Parser.AssignmentStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PL_0Parser#conditionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionStatement(PL_0Parser.ConditionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PL_0Parser#loopStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoopStatement(PL_0Parser.LoopStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PL_0Parser#emptyStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmptyStatement(PL_0Parser.EmptyStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PL_0Parser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(PL_0Parser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PL_0Parser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(PL_0Parser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link PL_0Parser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(PL_0Parser.FactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link PL_0Parser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(PL_0Parser.ConditionContext ctx);
}