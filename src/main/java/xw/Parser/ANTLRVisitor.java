package xw.Parser;

//import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;

import java.util.ArrayList;
import java.util.HashMap;

public class ANTLRVisitor extends CypherFragmentBaseVisitor<Object> {
    public ArrayList<Constrain> constrains = new ArrayList<Constrain>();
    public ArrayList<Relation> relations = new ArrayList<Relation>();
    public ArrayList<Return> returns = new ArrayList<Return>();
    public ArrayList<MatchElement> matchElements = new ArrayList<MatchElement>();
    public NameCenter nameCenter = NameCenter.getInstance();
    @Override
    public Object visitCypher(CypherFragmentParser.CypherContext ctx) {
        this.visit(ctx.singleQuery());
        for(int i=0; i<this.matchElements.size();i++){
            MatchElement me = matchElements.get(i);

            if(me.label != null){
                for(String label : me.label){
                    Constrain constrain = new Constrain();
                    constrain.rightConstant = label;
                    constrain.edgeOrVertexAlias = me.name;
                    constrain.property = "label";
                    this.constrains.add(constrain);

                }
            }
            if(!me.propertiesValue.isEmpty() && !me.propertiesName.isEmpty()){
                for(int j=0; j<me.propertiesName.size(); ++j){
                    Constrain constrain = new Constrain();
                    constrain.rightConstant = me.propertiesValue.get(j);
                    constrain.property = me.propertiesName.get(j);
                    constrain.edgeOrVertexAlias = me.name;
                    this.constrains.add(constrain);
                }
            }

            if(me.direction != null){
                Relation relation = new Relation();
                relation.edgeAlias = me.name;
                if(me.direction.equals("L")){
                    relation.fromVertexAlias = matchElements.get(i+1).name;
                    relation.toVertexAlias = matchElements.get(i-1).name;
                }else if(me.direction.equals("R")){
                    relation.fromVertexAlias = matchElements.get(i-1).name;
                    relation.toVertexAlias = matchElements.get(i+1).name;
                }else{
                    assert false;
                }
                this.relations.add(relation);
            }

        }
        return null;
    }

    @Override
    public Object visitSingleQuery(CypherFragmentParser.SingleQueryContext ctx) {
        for(int i = 0; i < ctx.clause().size(); i++){
            this.visit(ctx.clause(i));
        }
        return null;
    }

    @Override
    public Object visitClause(CypherFragmentParser.ClauseContext ctx) {
        if(ctx.match() != null){
            this.visit(ctx.match());
        }else if(ctx.returnStatement() != null){
            this.visit(ctx.returnStatement());
        }else{
            assert false;
        }
        return null;
    }

    @Override
    public Object visitMatch(CypherFragmentParser.MatchContext ctx) {
        this.visit(ctx.pattern());
        if(ctx.where() != null)
            this.visit(ctx.where());
        return null;


    }

    @Override
    public Object visitReturnStatement(CypherFragmentParser.ReturnStatementContext ctx) {
        for(int i = 0; i < ctx.returnItem().size(); i++){
            Return ret = (Return)this.visit(ctx.returnItem(i));
            this.returns.add(ret);
        }
        return null;
    }

    @Override
    public Object visitReturnItem(CypherFragmentParser.ReturnItemContext ctx) {
        Expression e = (Expression)this.visit(ctx.expression());
        Return ret = new Return();
        ret.edgeOrVertexAlias = e.name;
        if(e.property != null){
            ret.property = e.property;
        }
        return ret;
    }

    @Override
    public Object visitWhere(CypherFragmentParser.WhereContext ctx) {
        for(int i =0; i<ctx.expression().expression9().size();++i) {
            Expression e = (Expression) this.visit(ctx.expression().expression9(i));
            Constrain constrain = new Constrain();
            constrain.edgeOrVertexAlias = e.name;
            constrain.property = e.property;
            constrain.rightConstant = e.rightExp.substring(1, e.rightExp.length()-1);
            this.constrains.add(constrain);
        }
        return null;
    }

    @Override
    public Object visitPattern(CypherFragmentParser.PatternContext ctx) {
        for(int i=0;i<ctx.patternPart().size();i++){
            this.visit(ctx.patternPart(i));
        }
        return null;
    }

    @Override
    public Object visitPatternPart(CypherFragmentParser.PatternPartContext ctx) {
        if(ctx.anonymousPatternPart() != null){
            this.visit(ctx.anonymousPatternPart());
        }
        return null;
    }

    @Override
    public Object visitAnonymousPatternPart(CypherFragmentParser.AnonymousPatternPartContext ctx) {
        this.visit(ctx.patternElement());
        return null;
    }

    @Override
    public Object visitPatternElement(CypherFragmentParser.PatternElementContext ctx) {
        if(ctx.patternElement() != null){
            this.visit(ctx.patternElement());
        }else{
            MatchElement me = (MatchElement)this.visit(ctx.nodePattern());
            this.matchElements.add(me);
            for(int i=0; i<ctx.patternElementChain().size();i++){
                this.visit(ctx.patternElementChain(i));
            }

        }
        return null;
    }

    @Override
    public Object visitNodePattern(CypherFragmentParser.NodePatternContext ctx) {
        MatchElement me = new MatchElement();
        me.label = ctx.nodeLabels() == null? null : (ArrayList<String>)this.visit(ctx.nodeLabels());
        HashMap<String, String> props  = ctx.properties() == null? null : (HashMap<String,String>)this.visit(ctx.properties());
        if(props != null){
            for (HashMap.Entry<String, String> entry : props.entrySet())
            {
                me.propertiesName.add(entry.getKey());
                me.propertiesValue.add(entry.getValue());
            }
        }

        if(ctx.variable() != null){
            me.name = ctx.variable().getText();
        }else{
            me.name = nameCenter.getAvailableAlias(true, me);
        }
//        this.matchElements.add(me);
        return me;
    }

    @Override
    public Object visitPatternElementChain(CypherFragmentParser.PatternElementChainContext ctx) {
        MatchElement me1 = (MatchElement)this.visit(ctx.relationshipPattern());
        MatchElement me2 = (MatchElement)this.visit(ctx.nodePattern());
        this.matchElements.add(me1);
        this.matchElements.add(me2);
        return null;
    }

    @Override
    public Object visitRelationshipPattern(CypherFragmentParser.RelationshipPatternContext ctx) {
        MatchElement me = (MatchElement)this.visit(ctx.relationshipDetail());
        if(ctx.leftArrowHead() != null && ctx.rightArrowHead() != null){
            me.direction = "LR";
        }else if(ctx.leftArrowHead() != null && ctx.rightArrowHead() == null){
            me.direction = "L";
        }else if(ctx.rightArrowHead() != null && ctx.leftArrowHead() == null){
            me.direction = "R";
        }else{
            me.direction = "N";
        }
        return me;
    }

    @Override
    public Object visitRelationshipDetail(CypherFragmentParser.RelationshipDetailContext ctx) {
        MatchElement me = new MatchElement();
        me.label = ctx.relationshipTypes() == null? null : (ArrayList<String>)this.visit(ctx.relationshipTypes());
        HashMap<String, String> props = ctx.properties() == null? null : (HashMap<String,String>)this.visit(ctx.properties());
        if(props != null){
            for (HashMap.Entry<String, String> entry : props.entrySet())
            {
                me.propertiesName.add(entry.getKey());
                me.propertiesValue.add(entry.getValue());
            }
        }

        if(ctx.variable() != null){
            me.name = ctx.variable().getText();
        }else{
            me.name = nameCenter.getAvailableAlias(false, me);
        }
//        this.matchElements.add(me);
        return me;
    }

    @Override
    public Object visitProperties(CypherFragmentParser.PropertiesContext ctx) {
        return this.visit(ctx.mapLiteral());
    }

    @Override
    public Object visitRelationshipTypes(CypherFragmentParser.RelationshipTypesContext ctx) {
        ArrayList<String> res = new ArrayList<String>();
        res.add(ctx.relTypeName().get(0).getText());
        return res;
    }

    @Override
    public Object visitNodeLabels(CypherFragmentParser.NodeLabelsContext ctx) {
        ArrayList<String> res = new ArrayList<String>();
        for(int i = 0; i < ctx.nodeLabel().size(); i++){
            res.add(ctx.nodeLabel(i).labelName().getText());
        }
        return res;
    }

    @Override
    public Object visitNodeLabel(CypherFragmentParser.NodeLabelContext ctx) {
        assert false;
        return null;
    }

    @Override
    public Object visitRangeLiteral(CypherFragmentParser.RangeLiteralContext ctx) {
        assert false;
        return null;
    }

    @Override
    public Object visitLabelName(CypherFragmentParser.LabelNameContext ctx) {
        assert false;
        return super.visitLabelName(ctx);
    }

    @Override
    public Object visitRelTypeName(CypherFragmentParser.RelTypeNameContext ctx) {
        assert false;
        return super.visitRelTypeName(ctx);
    }

    @Override
    public Object visitExpression(CypherFragmentParser.ExpressionContext ctx) {
        return this.visit(ctx.expression9(0));
    }

    @Override
    public Object visitExpression9(CypherFragmentParser.Expression9Context ctx) {
        Expression exp9 = new Expression();
        exp9.name = ctx.expression7().atom().getText();
        if(ctx.expression7().propertyLookup() != null){
            exp9.property = ctx.expression7().propertyLookup().propertyKeyName().getText();
        }else if(ctx.expression7().labelLookup() != null){
            exp9.property = "label";
            exp9.rightExp = ctx.expression7().labelLookup().symbolicName().getText();
            return exp9;
        }else{
            assert false;
        }
//        exp9.property = exp9.property == null && ctx.expression7().propertyLookup() == null? null : ctx.expression7().propertyLookup().propertyKeyName().getText();
//        exp9.property = exp9.property == null && ctx.expression7().labelLookup() == null? null : "label";
        exp9.rightExp = ctx.literal() == null? null : ctx.literal().getText();
        return exp9;
    }

    @Override
    public Object visitExpression7(CypherFragmentParser.Expression7Context ctx) {
        assert false;
        return super.visitExpression7(ctx);
    }

    @Override
    public Object visitAtom(CypherFragmentParser.AtomContext ctx) {
        assert false;
        return super.visitAtom(ctx);
    }

    @Override
    public Object visitLiteral(CypherFragmentParser.LiteralContext ctx) {
        assert false;
        return super.visitLiteral(ctx);
    }

    @Override
    public Object visitNumberLiteral(CypherFragmentParser.NumberLiteralContext ctx) {
        assert false;
        return super.visitNumberLiteral(ctx);
    }

    @Override
    public Object visitBooleanLiteral(CypherFragmentParser.BooleanLiteralContext ctx) {
        assert false;
        return super.visitBooleanLiteral(ctx);
    }

    @Override
    public Object visitMapLiteral(CypherFragmentParser.MapLiteralContext ctx) {
        HashMap<String, String> res = new HashMap<String, String>();
        for(int i=0 ;i<ctx.propertyKeyName().size();i++){
            res.put(ctx.propertyKeyName(i).getText(), ctx.expression(i).getText());
        }

        return res;
    }

    @Override
    public Object visitParenthesizedExpression(CypherFragmentParser.ParenthesizedExpressionContext ctx) {
        return super.visitParenthesizedExpression(ctx);
    }

    @Override
    public Object visitPropertyLookup(CypherFragmentParser.PropertyLookupContext ctx) {
        return super.visitPropertyLookup(ctx);
    }

    @Override
    public Object visitLabelLookup(CypherFragmentParser.LabelLookupContext ctx) {
        return super.visitLabelLookup(ctx);
    }

    @Override
    public Object visitVariable(CypherFragmentParser.VariableContext ctx) {
        return super.visitVariable(ctx);
    }

    @Override
    public Object visitIntegerLiteral(CypherFragmentParser.IntegerLiteralContext ctx) {
        return super.visitIntegerLiteral(ctx);
    }

    @Override
    public Object visitPropertyKeyName(CypherFragmentParser.PropertyKeyNameContext ctx) {
        return super.visitPropertyKeyName(ctx);
    }

    @Override
    public Object visitSchemaName(CypherFragmentParser.SchemaNameContext ctx) {
        return super.visitSchemaName(ctx);
    }

    @Override
    public Object visitReservedWord(CypherFragmentParser.ReservedWordContext ctx) {
        return super.visitReservedWord(ctx);
    }

    @Override
    public Object visitDoubleLiteral(CypherFragmentParser.DoubleLiteralContext ctx) {
        return super.visitDoubleLiteral(ctx);
    }

    @Override
    public Object visitSymbolicName(CypherFragmentParser.SymbolicNameContext ctx) {
        return super.visitSymbolicName(ctx);
    }

    @Override
    public Object visitLeftArrowHead(CypherFragmentParser.LeftArrowHeadContext ctx) {
        return super.visitLeftArrowHead(ctx);
    }

    @Override
    public Object visitRightArrowHead(CypherFragmentParser.RightArrowHeadContext ctx) {
        return super.visitRightArrowHead(ctx);
    }

    @Override
    public Object visitDash(CypherFragmentParser.DashContext ctx) {
        return super.visitDash(ctx);
    }
}
