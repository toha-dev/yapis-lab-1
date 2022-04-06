// Generated from C:/Users/Александр/IdeaProjects/Yapis_lab_1/src/main/java\Grammar.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GrammarParser}.
 */
public interface GrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GrammarParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(GrammarParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(GrammarParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(GrammarParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(GrammarParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(GrammarParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(GrammarParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(GrammarParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(GrammarParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#print_number}.
	 * @param ctx the parse tree
	 */
	void enterPrint_number(GrammarParser.Print_numberContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#print_number}.
	 * @param ctx the parse tree
	 */
	void exitPrint_number(GrammarParser.Print_numberContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#print_id}.
	 * @param ctx the parse tree
	 */
	void enterPrint_id(GrammarParser.Print_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#print_id}.
	 * @param ctx the parse tree
	 */
	void exitPrint_id(GrammarParser.Print_idContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#print_string}.
	 * @param ctx the parse tree
	 */
	void enterPrint_string(GrammarParser.Print_stringContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#print_string}.
	 * @param ctx the parse tree
	 */
	void exitPrint_string(GrammarParser.Print_stringContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#print_mat_row}.
	 * @param ctx the parse tree
	 */
	void enterPrint_mat_row(GrammarParser.Print_mat_rowContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#print_mat_row}.
	 * @param ctx the parse tree
	 */
	void exitPrint_mat_row(GrammarParser.Print_mat_rowContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#simple_compare}.
	 * @param ctx the parse tree
	 */
	void enterSimple_compare(GrammarParser.Simple_compareContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#simple_compare}.
	 * @param ctx the parse tree
	 */
	void exitSimple_compare(GrammarParser.Simple_compareContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#hard_compare}.
	 * @param ctx the parse tree
	 */
	void enterHard_compare(GrammarParser.Hard_compareContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#hard_compare}.
	 * @param ctx the parse tree
	 */
	void exitHard_compare(GrammarParser.Hard_compareContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#else_compare}.
	 * @param ctx the parse tree
	 */
	void enterElse_compare(GrammarParser.Else_compareContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#else_compare}.
	 * @param ctx the parse tree
	 */
	void exitElse_compare(GrammarParser.Else_compareContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#compare}.
	 * @param ctx the parse tree
	 */
	void enterCompare(GrammarParser.CompareContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#compare}.
	 * @param ctx the parse tree
	 */
	void exitCompare(GrammarParser.CompareContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#digit_expression}.
	 * @param ctx the parse tree
	 */
	void enterDigit_expression(GrammarParser.Digit_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#digit_expression}.
	 * @param ctx the parse tree
	 */
	void exitDigit_expression(GrammarParser.Digit_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(GrammarParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(GrammarParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#input_signature}.
	 * @param ctx the parse tree
	 */
	void enterInput_signature(GrammarParser.Input_signatureContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#input_signature}.
	 * @param ctx the parse tree
	 */
	void exitInput_signature(GrammarParser.Input_signatureContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#assign_int}.
	 * @param ctx the parse tree
	 */
	void enterAssign_int(GrammarParser.Assign_intContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#assign_int}.
	 * @param ctx the parse tree
	 */
	void exitAssign_int(GrammarParser.Assign_intContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#assign_int_by_subprogram}.
	 * @param ctx the parse tree
	 */
	void enterAssign_int_by_subprogram(GrammarParser.Assign_int_by_subprogramContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#assign_int_by_subprogram}.
	 * @param ctx the parse tree
	 */
	void exitAssign_int_by_subprogram(GrammarParser.Assign_int_by_subprogramContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#program_call}.
	 * @param ctx the parse tree
	 */
	void enterProgram_call(GrammarParser.Program_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#program_call}.
	 * @param ctx the parse tree
	 */
	void exitProgram_call(GrammarParser.Program_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#assign_vec}.
	 * @param ctx the parse tree
	 */
	void enterAssign_vec(GrammarParser.Assign_vecContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#assign_vec}.
	 * @param ctx the parse tree
	 */
	void exitAssign_vec(GrammarParser.Assign_vecContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#assign_vec_by_subprogram}.
	 * @param ctx the parse tree
	 */
	void enterAssign_vec_by_subprogram(GrammarParser.Assign_vec_by_subprogramContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#assign_vec_by_subprogram}.
	 * @param ctx the parse tree
	 */
	void exitAssign_vec_by_subprogram(GrammarParser.Assign_vec_by_subprogramContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#set_vec_expr}.
	 * @param ctx the parse tree
	 */
	void enterSet_vec_expr(GrammarParser.Set_vec_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#set_vec_expr}.
	 * @param ctx the parse tree
	 */
	void exitSet_vec_expr(GrammarParser.Set_vec_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#set_vec_expr_by_mat}.
	 * @param ctx the parse tree
	 */
	void enterSet_vec_expr_by_mat(GrammarParser.Set_vec_expr_by_matContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#set_vec_expr_by_mat}.
	 * @param ctx the parse tree
	 */
	void exitSet_vec_expr_by_mat(GrammarParser.Set_vec_expr_by_matContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#assign_mat}.
	 * @param ctx the parse tree
	 */
	void enterAssign_mat(GrammarParser.Assign_matContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#assign_mat}.
	 * @param ctx the parse tree
	 */
	void exitAssign_mat(GrammarParser.Assign_matContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#set_mat}.
	 * @param ctx the parse tree
	 */
	void enterSet_mat(GrammarParser.Set_matContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#set_mat}.
	 * @param ctx the parse tree
	 */
	void exitSet_mat(GrammarParser.Set_matContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#set_mat_expr}.
	 * @param ctx the parse tree
	 */
	void enterSet_mat_expr(GrammarParser.Set_mat_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#set_mat_expr}.
	 * @param ctx the parse tree
	 */
	void exitSet_mat_expr(GrammarParser.Set_mat_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#get_mat_row_by_id}.
	 * @param ctx the parse tree
	 */
	void enterGet_mat_row_by_id(GrammarParser.Get_mat_row_by_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#get_mat_row_by_id}.
	 * @param ctx the parse tree
	 */
	void exitGet_mat_row_by_id(GrammarParser.Get_mat_row_by_idContext ctx);
}