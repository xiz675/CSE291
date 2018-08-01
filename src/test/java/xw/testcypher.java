package xw;
import xw.QueryEngine.CypherParser;
import xw.QueryEngine.ExecuteEngine;
import xw.util.ParseResults;
import java.sql.SQLException;

public class testcypher {
    public static void main (String[] args) throws SQLException
    {
        String path = "./cypher_test2.txt";
        ParseResults results = CypherParser.getParseResuilts(path);
        ExecuteEngine execute = new ExecuteEngine(results);
        execute.executeQuery();
    }
}
