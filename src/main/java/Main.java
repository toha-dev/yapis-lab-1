import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import javax.swing.*;
import java.io.*;

public class Main {

    public static void main(String[] args) {
        try {
            CharStream input = CharStreams.fromFileName(args[0]);

            GrammarLexer lexer = new GrammarLexer(input);
            GrammarParser parser = new GrammarParser(new CommonTokenStream(lexer));

            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            PrintStream oldERR = System.err;
            System.setErr(new PrintStream(byteArrayOutputStream));
            ParseTree tree = parser.program();
            if (!byteArrayOutputStream.toString().equalsIgnoreCase("")) {
                System.setErr(oldERR);
                JOptionPane.showMessageDialog(null, "Lexer error: " + byteArrayOutputStream);
                return;
            }
            System.setErr(oldERR);
            Visitor listVisitor = new Visitor();
            String output = listVisitor.visit(tree);
            System.out.print(output);
            FileWriter fileWriter = new FileWriter("Program.java");
            fileWriter.write(output);
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
