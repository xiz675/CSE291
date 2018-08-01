package xw.Parser;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import java.util.ArrayList;
import java.util.List;

public class ANTLRTest {

    public static void main(String[] args){
//        CSVImporter importer = new CSVImporter();
//        importer.importFromCSV("");
        CharStream input = null;

        try{
            input = CharStreams.fromFileName("./cypher_test1.txt");
        }catch (Exception e){
            e.printStackTrace();
        }
        CypherFragmentLexer lexer = new CypherFragmentLexer(input);
        CypherFragmentParser parser = new CypherFragmentParser(new CommonTokenStream(lexer));
        ANTLRVisitor visitor = new ANTLRVisitor();

        visitor.visit(parser.cypher());
        ArrayList<Constrain> constrains = visitor.constrains;
        ArrayList<Relation> relations = visitor.relations;
        ArrayList<Return> rets = visitor.returns;


        int b = 0;


    }
}

