package xw.util;

import xw.Parser.ANTLRVisitor;
import xw.Parser.Constrain;
import xw.Parser.Relation;
import xw.Parser.Return;

import java.util.ArrayList;

public class ParseResults {
    public ArrayList<Constrain> constrainList;
    public ArrayList<Relation> relationList;
    public ArrayList<Return> returnList;

    public ParseResults(ArrayList<Constrain> constrainList,
                        ArrayList<Relation> relationList,
                        ArrayList<Return> returnList){
        this.constrainList = constrainList;
        this.relationList = relationList;
        this.returnList = returnList;
    }

    public ParseResults(ANTLRVisitor visitor) {
        this.constrainList = visitor.constrains;
        this.relationList = visitor.relations;
        this.returnList = visitor.returns;
    }

}
