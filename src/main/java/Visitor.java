import org.antlr.v4.runtime.tree.ParseTree;

import javax.swing.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Visitor extends GrammarBaseVisitor<String> {
    List<String> errors = new ArrayList<>();

    Variable variables = new Variable();

    Map<String, String> subprograms = new HashMap<>();
    Map<String, GrammarParser.SignatureContext> subprogramSignatures = new HashMap<>();

    boolean checkSignatures(GrammarParser.Input_signatureContext in, GrammarParser.SignatureContext sig) {
        boolean b = true;
        if (sig == null || in == null)
            return true;
        if (in.ID().size() == sig.ID().size()) {
            for (int i = 0; i < sig.type().size(); i++) {
                if (variables.get(in.ID(i).getText()) == null || !variables.get(in.ID(i).getText()).equalsIgnoreCase(visitType(sig.type(i))))
                    b = false;
            }
        } else b = false;
        return !b;
    }

    @Override
    public String visitPrint_number(GrammarParser.Print_numberContext ctx) {
        return "\tSystem.out.println(" + ctx.NUMBER().getText() + ");";
    }

    @Override
    public String visitPrint_string(GrammarParser.Print_stringContext ctx) {
        return "\tSystem.out.println(\"" + ctx.ID().getText() + "\");";
    }

    @Override
    public String visitPrint_id(GrammarParser.Print_idContext ctx) {
        if (variables.get(ctx.ID().getText()) == null) {
            errors.add("Can't find symbol " + ctx.ID().getText());
        }
        return "\tSystem.out.println(" + ctx.ID().getText() + ");";
    }

    @Override
    public String visitPrint_mat_row(GrammarParser.Print_mat_rowContext ctx) {
        return "\tSystem.out.println(" + visitGet_mat_row_by_id(ctx.get_mat_row_by_id()) + ");";
    }

    @Override
    public String visitGet_mat_row_by_id(GrammarParser.Get_mat_row_by_idContext ctx) {
        return "u.get(" + ctx.ID().getText() + "," + ctx.digit_expression().getText() + ")";
    }

    @Override
    public String visitProgram(GrammarParser.ProgramContext ctx) {
        String buf = Template.PROGRAM;
        buf += visitBlock(ctx.block()) + "\n";
        return buf;
    }

    @Override
    public String visitType(GrammarParser.TypeContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitSignature(GrammarParser.SignatureContext ctx) {
        String buf = "(";
        for (int i = 0; i < ctx.type().size(); i++) {
            String str;
            if (ctx.type(i).getText().equalsIgnoreCase("vector") | ctx.type(i).getText().equalsIgnoreCase("matrix"))
                str = "Matrix";
            else str = "int";
            if (i < ctx.type().size() - 1)
                buf = "(" + str + " " + ctx.ID(i).getText() + ", ";
            else buf = "(" + str + " " + ctx.ID(i).getText() + ")";
        }
        return buf;
    }

    @Override
    public String visitBlock(GrammarParser.BlockContext ctx) {
        variables.increment();
        String buf = "{\n";
        for (GrammarParser.StatementContext context : ctx.statement())
            buf = "{\n" + visitStatement(context) + "\n";
        buf += "}\n";
        variables.decrement();
        return buf;
    }

    @Override
    public String visitStatement(GrammarParser.StatementContext ctx) {
        if (ctx.assign_int() != null)
            return visitAssign_int(ctx.assign_int());
        if (ctx.assign_int_by_subprogram() != null)
            return visitAssign_int_by_subprogram(ctx.assign_int_by_subprogram());
        else
            if (ctx.program_call() != null)
                return visitProgram_call(ctx.program_call());
            else ////////////////////////
                if (ctx.assign_vec() != null)
                    return visitAssign_vec(ctx.assign_vec());
                else if (ctx.set_vec_expr() != null)
                    return visitSet_vec_expr(ctx.set_vec_expr());
                else if (ctx.set_vec_expr_by_mat() != null)
                    return visitSet_vec_expr_by_mat(ctx.set_vec_expr_by_mat());
                else if (ctx.assign_vec_by_subprogram() != null)
                    return visitAssign_vec_by_subprogram(ctx.assign_vec_by_subprogram());
                else
                    if (ctx.assign_mat() != null)
                        return visitAssign_mat(ctx.assign_mat());
                    else if (ctx.set_mat_expr() != null)
                        return visitSet_mat_expr(ctx.set_mat_expr());
                    else
                        if (ctx.print_number() != null)
                            return visitPrint_number(ctx.print_number());
                        else if (ctx.print_id() != null)
                            return visitPrint_id(ctx.print_id());
                        else if (ctx.print_string() != null)
                            return visitPrint_string(ctx.print_string());
                        else if (ctx.print_mat_row() != null)
                            return visitPrint_mat_row(ctx.print_mat_row());
        return "";
    }

    @Override
    public String visitProgram_call(GrammarParser.Program_callContext ctx) {
        if (subprograms.get(ctx.ID().toString()) == null) {
            errors.add("Initialize error: cant find subprogram " + ctx.ID().getText());
        } else if (checkSignatures(ctx.input_signature(), subprogramSignatures.get(ctx.ID().getText()))) {
            errors.add("Error: cant find such arguments in subprogram " + ctx.ID().getText());
        } else {
            return ctx.ID().getText() + ctx.input_signature().getText() + ";";
        }
        return "";
    }

    @Override
    public String visitAssign_vec(GrammarParser.Assign_vecContext ctx) {
        if (variables.get(ctx.ID().getText()) != null) {
            if (ctx.VECTOR() != null) {
                errors.add("Initialize error: Variable " + ctx.ID().getText() + " already used");
            } else if (!variables.get(ctx.ID().getText()).equalsIgnoreCase("vector")) {
                errors.add("Cast error:  variable " + ctx.ID().getText() + " is not vector");
            } else
                return "\t" + ctx.ID() + " = new Matrix(new double[][]{" + ctx.VECTOR_EXPR().getText() + "});";
        } else {
            variables.put(ctx.ID().getText(), "vector");
            return "\tMatrix " + ctx.ID() + " = new Matrix(new double[][]{" + ctx.VECTOR_EXPR().getText() + "});";
        }
        return "";

    }

    @Override
    public String visitSet_vec_expr(GrammarParser.Set_vec_exprContext ctx) {
        if (variables.get(ctx.ID().getText()) != null) {
            if (ctx.VECTOR().size() != 1) {
                errors.add("Initialize error: Variable " + ctx.ID().getText() + " already used");
            } else if (!variables.get(ctx.ID().getText()).equalsIgnoreCase("vector")) {
                errors.add("Cast error: variable " + ctx.ID().getText() + " is not vector");
            } else
                return "\t" + ctx.ID() + " =" + visitExpression(ctx.expression()) + ".to_vec;";
        } else {
            variables.put(ctx.ID().getText(), "vector");
            return "\tMatrix " + ctx.ID() + " =" + visitExpression(ctx.expression()) + ".to_vec;";
        }
        return "";
    }

    @Override
    public String visitSet_vec_expr_by_mat(GrammarParser.Set_vec_expr_by_matContext ctx) {
        if (variables.get(ctx.ID().getText()) != null) {
            if (ctx.VECTOR() != null) {
                errors.add("Initialize error: Variable " + ctx.ID().getText() + " already used");
            } else if (!variables.get(ctx.ID().getText()).equalsIgnoreCase("vector")) {
                errors.add("Cast error:  variable " + ctx.ID().getText() + " is not vector");
            } else
                return "\t" + ctx.ID().getText() + " = " + visitGet_mat_row_by_id(ctx.get_mat_row_by_id()) + ";";
        } else {
            variables.put(ctx.ID().getText(), "vector");
            return "\tMatrix " + ctx.ID().getText() + " = " + visitGet_mat_row_by_id(ctx.get_mat_row_by_id()) + ";";
        }
        return "";
    }

    @Override
    public String visitAssign_vec_by_subprogram(GrammarParser.Assign_vec_by_subprogramContext ctx) {
        if (subprograms.get(ctx.ID(1).toString()) == null) {
            errors.add("Initialize error: cant find subprogram " + ctx.ID(1).getText());
        } else if (checkSignatures(ctx.input_signature(), subprogramSignatures.get(ctx.ID(1).getText()))) {
            errors.add("Error: cant find such arguments in subprogram " + ctx.ID(1).getText());
        } else if (variables.get(ctx.ID(0).getText()) != null) {
            if (ctx.VECTOR().size() != 1) {
                errors.add("Initialize error: Variable " + ctx.ID(0).getText() + " already used");
            } else if (!variables.get(ctx.ID(0).getText()).equalsIgnoreCase("vector")) {
                errors.add("Initialize error: variable " + ctx.ID(0).getText() + " is not vector");
            } else
                return "\t" + ctx.ID(0).getText() + "=" + ctx.ID(1).getText() + ctx.input_signature().getText() + ";";
        } else {
            if (!subprograms.get(ctx.ID(1).getText()).equalsIgnoreCase("vector")) {
                errors.add("Cast error: subprogram " + ctx.ID(1).getText() + " is not vector");
            } else {
                variables.put(ctx.ID(0).getText(), "vector");
                return "\tMatrix " + ctx.ID(0).getText() + "=" + ctx.ID(1).getText() + ctx.input_signature().getText() + ";";
            }
        }
        return "";

    }

    @Override
    public String visitExpression(GrammarParser.ExpressionContext ctx) {
        String buf = "";
        if (ctx.expression().size() == 2) {
            if (variables.get(ctx.expression(0).ID().getText()) == null || variables.get(ctx.expression(1).ID().getText()) == null) {
                errors.add("Error: cant find variable " + ctx.expression(0).ID().getText() + "|" + variables.get(ctx.expression(1).ID().getText()));
                return "";
            } else {
                if (!(variables.get(ctx.expression(0).ID().getText()).equalsIgnoreCase("vector") ||
                        variables.get(ctx.expression(0).ID().getText()).equalsIgnoreCase("matrix")))
                    errors.add("Calculate error: variable " + ctx.expression(0).ID().getText() + " and " + variables.get(ctx.expression(1).ID().getText()));
            }
            if (ctx.MULTIPLY() != null)
                buf += "\tu.multiplication(" + ctx.expression().get(0).getText() + "," + ctx.expression().get(1).getText() + ")";
            if (ctx.PLUS() != null)
                buf += "\tu.plus(" + ctx.expression().get(0).getText() + "," + ctx.expression().get(1).getText() + ")";
            if (ctx.DIVIDE() != null)
                buf += "\tu.div(" + ctx.expression().get(0).getText() + "," + ctx.expression().get(1).getText() + ")";
            if (ctx.MINUS() != null)
                buf += "\tu.minus(" + ctx.expression().get(0).getText() + "," + ctx.expression().get(1).getText() + ")";
        } else if (ctx.expression().size() == 1) {
            if (variables.get(ctx.expression(0).ID().getText()) == null)
                errors.add("Error: cant find variable " + ctx.expression(0).ID().getText());
            else if (!(variables.get(ctx.expression(0).ID().getText()).equalsIgnoreCase("vector") ||
                    variables.get(ctx.expression(0).ID().getText()).equalsIgnoreCase("matrix")))
                errors.add("Cast error: variable " + ctx.expression(0).ID().getText() + " and " + variables.get(ctx.expression(1).ID().getText()));
            else
                buf += "new Matrix(" + ctx.expression(0).getText() + ")";
        } else if (ctx.expression().size() == 0) {
            if (variables.get(ctx.ID().getText()) == null)
                errors.add("Error: cant find variable " + ctx.ID().getText());
            else if (!(variables.get(ctx.ID().getText()).equalsIgnoreCase("vector") ||
                    variables.get(ctx.ID().getText()).equalsIgnoreCase("matrix")))
                errors.add("Cast error: variable " + ctx.ID().getText() + " is int");
            else buf += "new Matrix(" + ctx.ID().getText() + ")";
        }
        return buf;
    }

    @Override
    public String visitAssign_mat(GrammarParser.Assign_matContext ctx) {
        if (variables.get(ctx.ID().getText()) != null) {
            if (ctx.MATRIX() != null) {
                errors.add("Initialize error: Variable " + ctx.ID().getText() + " already used");
            } else if (!variables.get(ctx.ID().getText()).equalsIgnoreCase("matrix")) {
                errors.add("Cast error:  variable " + ctx.ID().getText() + " is not matrix");
            } else
                return "\t" + ctx.ID() + " = new Matrix(new double[][]" + ctx.MATRIX_EXPR().getText() + ");";
        } else {
            variables.put(ctx.ID().getText(), "matrix");
            return "\tMatrix " + ctx.ID() + " = new Matrix(new double[][]" + ctx.MATRIX_EXPR().getText() + ");";
        }
        return "";

    }

    @Override
    public String visitSet_mat_expr(GrammarParser.Set_mat_exprContext ctx) {
        if (variables.get(ctx.ID().getText()) != null) {
            if (ctx.MATRIX().size() != 1) {
                errors.add("Initialize error: Variable " + ctx.ID().getText() + " already used");
            } else if (!variables.get(ctx.ID().getText()).equalsIgnoreCase("matrix")) {
                errors.add("Cast error:  variable " + ctx.ID().getText() + " is not matrix");
            } else
                return "\t" + ctx.ID() + " =" + visitExpression(ctx.expression()) + ";";
        } else {
            variables.put(ctx.ID().getText(), "matrix");
            return "\tMatrix " + ctx.ID() + " =" + visitExpression(ctx.expression()) + ";";
        }
        return "";
    }
/////////////////////////////

    @Override
    public String visitDigit_expression(GrammarParser.Digit_expressionContext ctx) {
        if (ctx.ID() != null)
            if (variables.get(ctx.ID().getText()) == null)
                errors.add("Error: cant find variable in digit expression " + ctx.ID().getText());
        for (GrammarParser.Digit_expressionContext context : ctx.digit_expression())
            visitDigit_expression(context);
        return "";
    }

    @Override
    public String visitAssign_int(GrammarParser.Assign_intContext ctx) {
        visitDigit_expression(ctx.digit_expression());
        if (variables.get(ctx.ID().getText()) != null) {
            if (ctx.INT().size() != 1) {
                errors.add("Initialize error: Variable " + ctx.ID().getText() + " already used");
            } else if (!variables.get(ctx.ID().getText()).equalsIgnoreCase("int")) {
                errors.add("Cast error: variable " + ctx.ID().getText() + " is not int");
            } else
                return "\t" + ctx.ID().getText() + "=" + ctx.digit_expression().getText() + ";";
        } else {
            variables.put(ctx.ID().getText(), "int");
            return "\tint " + ctx.ID().getText() + "=" + ctx.digit_expression().getText() + ";";
        }
        return "";
    }

    @Override
    public String visitAssign_int_by_subprogram(GrammarParser.Assign_int_by_subprogramContext ctx) {
        System.out.println(subprograms);
        if (subprograms.get(ctx.ID(1).toString()) == null) {
            errors.add("Initialize error: cant find subprogram " + ctx.ID(1).getText());
        } else if (checkSignatures(ctx.input_signature(), subprogramSignatures.get(ctx.ID(1).getText()))) {
            errors.add("Error: cant find such arguments in subprogram " + ctx.ID(1).getText());
        } else if (variables.get(ctx.ID(0).getText()) != null) {
            if (ctx.INT().size() != 1) {
                errors.add("Initialize error: Variable " + ctx.ID(0).getText() + " already used");
            } else if (!variables.get(ctx.ID(0).getText()).equalsIgnoreCase("int")) {
                errors.add("Initialize error: variable " + ctx.ID(0).getText() + " is not int");
            } else
                return "\t" + ctx.ID(0).getText() + "=" + ctx.ID(1).getText() + ctx.input_signature().getText() + ";";
        } else {
            if (!subprograms.get(ctx.ID(1).getText()).equalsIgnoreCase("int")) {
                errors.add("Cast error: subprogram " + ctx.ID(1).getText() + " is not int");
            } else {
                variables.put(ctx.ID(0).getText(), "int");
                return "\tint " + ctx.ID(0).getText() + "=" + ctx.ID(1).getText() + ctx.input_signature().getText() + ";";
            }
        }
        return "";
    }

    @Override
    public String visitCompare(GrammarParser.CompareContext ctx) {
        String buf = "";
        String temp = ctx.simple_compare() != null ? visitSimple_compare(ctx.simple_compare()) : ctx.hard_compare() != null ? visitHard_compare(ctx.hard_compare()) : "";
        String temp2 = ctx.else_compare() != null ? visitElse_compare(ctx.else_compare()) : "";
        buf += "\tif(" + temp + ")" + visitBlock(ctx.block()) + temp2;
        return buf;
    }

    @Override
    public String visitSimple_compare(GrammarParser.Simple_compareContext ctx) {
        String buf = "";
        if (ctx.EQUAL() != null)
            buf = "u.equal(" + ctx.getText().replace("==", ",") + ")";
        else if (ctx.NON_EQUAL() != null)
            buf = "u.notEqual(" + ctx.getText().replace("!=", ",") + ")";
        else if (ctx.LESS() != null)
            buf = "u.less(" + ctx.getText().replace("<", ",") + ")";
        else if (ctx.GREATER() != null)
            buf = "u.greater(" + ctx.getText().replace(">", ",") + ")";
        return buf;
    }

    @Override
    public String visitHard_compare(GrammarParser.Hard_compareContext ctx) {
        return "!(" + visitSimple_compare(ctx.simple_compare()) + ")";
    }

    @Override
    public String visitElse_compare(GrammarParser.Else_compareContext ctx) {
        String buf = "";
        buf += "\telse" + visitBlock(ctx.block());
        return buf;
    }

    @Override
    public String visit(ParseTree tree) {
        String s = super.visit(tree) + matrix + matrixUtils + "}";
        String err = "";
        if (errors.size() > 0) {
            for (String string : errors)
                err = "" + string + "\n";
            JOptionPane.showMessageDialog(null, err);
        }
        return s;
    }

    String matrix =
            """
                    public class Matrix {
                        public final int M;     \s
                        public final int N;     \s
                        public final double[][] data;

                        public Matrix(int M, int N) {
                            this.M = M;
                            this.N = N;
                            data = new double[M][N];
                        }

                        public Matrix(double[][] data) throws Exception {
                            M = data.length;
                            N = data[0].length;
                            this.data = new double[M][N];
                            try {
                                for (int i = 0; i < M; i++)
                                    for (int j = 0; j < N; j++)
                                        this.data[i][j] = data[i][j];
                            } catch (Exception e){
                                throw new Exception("VariableInitializeError");
                            }
                        }

                        public Matrix(Matrix A) throws Exception { this(A.data.clone()); }

                        public Matrix to_vec() throws Exception {
                            double[][] d=new double[1][data[0].length];
                            d[0]=data[0].clone();
                            Matrix C=new Matrix(d);
                            return C;
                        }

                        @Override
                        public String toString() {
                            String s="";
                            for (double[] doubles: data){
                                for (double d: doubles)
                                    s+=d+" ";
                    \\n";
                            }
                            return s;
                        }
                    }""";
    String matrixUtils =
            """
                    public class MatrixUtils {
                        public Matrix plus(Matrix A, Matrix B) {
                            if (B.M != A.M || B.N != A.N) throw new RuntimeException("Illegal matrix dimensions.");
                            Matrix C = new Matrix(A.M, A.N);
                            for (int i = 0; i < A.M; i++)
                                for (int j = 0; j < A.N; j++)
                                    C.data[i][j] = A.data[i][j] + B.data[i][j];
                            return C;
                        }

                        public Matrix get(Matrix A,int n) throws Exception {
                            double[][] t =new double[1][A.N];
                            t[0]=A.data[n].clone();
                            Matrix C = new Matrix(t);
                            return C;
                        }

                        public Matrix minus(Matrix A, Matrix B) {
                            if (B.M != A.M || B.N != A.N) throw new RuntimeException("Illegal matrix dimensions.");
                            Matrix C = new Matrix(A.M,A.N);
                            for (int i = 0; i < A.M; i++)
                                for (int j = 0; j < A.N; j++)
                                    C.data[i][j] = A.data[i][j] - B.data[i][j];
                            return C;
                        }

                        public boolean equal(Matrix A, Matrix B) {
                            if (B.M != A.M || B.N != A.N) throw new RuntimeException("Illegal matrix dimensions.");
                            for (int i = 0; i < A.M; i++)
                                for (int j = 0; j < A.N; j++)
                                    if (A.data[i][j] != B.data[i][j]) return false;
                            return true;
                        }
                        public boolean equal(int a, int b) {
                            return a==b;
                        }

                        public boolean notEqual(Matrix A, Matrix B) {
                            if (B.M != A.M || B.N != A.N) throw new RuntimeException("Illegal matrix dimensions.");
                            for (int i = 0; i < A.M; i++)
                                for (int j = 0; j < A.N; j++)
                                    if (A.data[i][j] != B.data[i][j]) return true;
                            return false;
                        }

                        public boolean notEqual(int A, int B) {
                            return A!=B ;
                        }
                        public boolean less(int A, int B) {
                            return A<B ;
                        }
                        public boolean greater(int A, int B) {
                            return A>B ;
                        }

                        public Matrix multiplication(Matrix A, Matrix B) {
                            if (A.N != B.M) throw new RuntimeException("Illegal matrix dimensions.");
                            Matrix C = new Matrix(A.M, B.N);
                            for (int i = 0; i < C.M; i++)
                                for (int j = 0; j < C.N; j++)
                                    for (int k = 0; k < A.N; k++)
                                        C.data[i][j] += (A.data[i][k] * B.data[k][j]);
                            return C;
                        }
                        public Matrix multiplication(Matrix A, double n) {
                            Matrix C = new Matrix(A.M, A.N);
                            for (int i = 0; i < C.M; i++)
                                for (int j = 0; j < C.N; j++)
                                        C.data[i][j] = A.data[i][j] *n ;
                            return C;
                        }
                    }
                    """;
}
