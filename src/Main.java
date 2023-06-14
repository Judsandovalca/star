import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.io.*;

import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.*;
public class Main {
public static void main(String[] args) throws Exception {
    String filePath = "C:\\Users\\mapu\\IdeaProjects\\proyecto\\src\\ejemplo.txt";


            ANTLRInputStream input = new ANTLRFileStream(filePath);
            StarLexer lexer = new StarLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            StarParser parser = new StarParser(tokens);
            ParseTree tree = parser.prog(); // parse; start at prog
            exprVisitor expr = new exprVisitor();
            expr.visit(tree);

    }
/*
         String inputFile = null;
         BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
         if ( args.length>0 ) inputFile = args[0];
         //InputStream is = System.in;
         //if ( inputFile!=null ) is = new FileInputStream(inputFile);
         ANTLRInputStream input = new ANTLRInputStream(reader.readLine());
         StarLexer lexer = new StarLexer(input);
         CommonTokenStream tokens = new CommonTokenStream(lexer);
         StarParser parser = new StarParser(tokens);
         ParseTree tree = parser.prog(); // parse; start at prog
         exprVisitor expr = new exprVisitor();
         expr.visit(tree);
*/
         }

