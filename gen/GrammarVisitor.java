// Generated from C:/Users/Александр/IdeaProjects/Yapis_lab_1/src/main/java\Grammar.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link GrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface GrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link GrammarParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(GrammarParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(GrammarParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(GrammarParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(GrammarParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#print_number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint_number(GrammarParser.Print_numberContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#print_id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint_id(GrammarParser.Print_idContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#print_string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint_string(GrammarParser.Print_stringContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#print_mat_row}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint_mat_row(GrammarParser.Print_mat_rowContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#simple_compare}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_compare(GrammarParser.Simple_compareContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#hard_compare}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHard_compare(GrammarParser.Hard_compareContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#else_compare}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElse_compare(GrammarParser.Else_compareContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#compare}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompare(GrammarParser.CompareContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#digit_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDigit_expression(GrammarParser.Digit_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(GrammarParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#input_signature}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInput_signature(GrammarParser.Input_signatureContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#assign_int}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign_int(GrammarParser.Assign_intContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#assign_int_by_subprogram}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign_int_by_subprogram(GrammarParser.Assign_int_by_subprogramContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#program_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram_call(GrammarParser.Program_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#assign_vec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign_vec(GrammarParser.Assign_vecContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#assign_vec_by_subprogram}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign_vec_by_subprogram(GrammarParser.Assign_vec_by_subprogramContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#set_vec_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet_vec_expr(GrammarParser.Set_vec_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#set_vec_expr_by_mat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet_vec_expr_by_mat(GrammarParser.Set_vec_expr_by_matContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#assign_mat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign_mat(GrammarParser.Assign_matContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#set_mat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet_mat(GrammarParser.Set_matContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#set_mat_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet_mat_expr(GrammarParser.Set_mat_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#get_mat_row_by_id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGet_mat_row_by_id(GrammarParser.Get_mat_row_by_idContext ctx);
}