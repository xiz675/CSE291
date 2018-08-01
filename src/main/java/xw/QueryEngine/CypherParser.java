package xw.QueryEngine;

import xw.Parser.ANTLRVisitor;
import xw.Parser.CypherFragmentLexer;
import xw.Parser.CypherFragmentParser;
import xw.util.ParseResults;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

public class CypherParser {

    public static ParseResults getParseResuilts(String filePath) {
        CharStream input = null;

        try{
            input = CharStreams.fromFileName(filePath);
        }
        catch (Exception e){
            e.printStackTrace();
        }

        CypherFragmentLexer lexer = new CypherFragmentLexer(input);
        CypherFragmentParser parser = new CypherFragmentParser(new CommonTokenStream(lexer));
        ANTLRVisitor visitor = new ANTLRVisitor();

        visitor.visit(parser.cypher());

        return new ParseResults(visitor);
    }

}
