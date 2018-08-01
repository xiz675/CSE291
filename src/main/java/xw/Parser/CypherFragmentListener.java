package xw.Parser;// Generated from /home/kyliu/IdeaProjects/graphTest/src/main/antlr/CypherFragment.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CypherFragmentParser}.
 */
public interface CypherFragmentListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CypherFragmentParser#cypher}.
	 * @param ctx the parse tree
	 */
	void enterCypher(CypherFragmentParser.CypherContext ctx);
	/**
	 * Exit a parse tree produced by {@link CypherFragmentParser#cypher}.
	 * @param ctx the parse tree
	 */
	void exitCypher(CypherFragmentParser.CypherContext ctx);
	/**
	 * Enter a parse tree produced by {@link CypherFragmentParser#singleQuery}.
	 * @param ctx the parse tree
	 */
	void enterSingleQuery(CypherFragmentParser.SingleQueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link CypherFragmentParser#singleQuery}.
	 * @param ctx the parse tree
	 */
	void exitSingleQuery(CypherFragmentParser.SingleQueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link CypherFragmentParser#clause}.
	 * @param ctx the parse tree
	 */
	void enterClause(CypherFragmentParser.ClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link CypherFragmentParser#clause}.
	 * @param ctx the parse tree
	 */
	void exitClause(CypherFragmentParser.ClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link CypherFragmentParser#match}.
	 * @param ctx the parse tree
	 */
	void enterMatch(CypherFragmentParser.MatchContext ctx);
	/**
	 * Exit a parse tree produced by {@link CypherFragmentParser#match}.
	 * @param ctx the parse tree
	 */
	void exitMatch(CypherFragmentParser.MatchContext ctx);
	/**
	 * Enter a parse tree produced by {@link CypherFragmentParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(CypherFragmentParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CypherFragmentParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(CypherFragmentParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CypherFragmentParser#returnItem}.
	 * @param ctx the parse tree
	 */
	void enterReturnItem(CypherFragmentParser.ReturnItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link CypherFragmentParser#returnItem}.
	 * @param ctx the parse tree
	 */
	void exitReturnItem(CypherFragmentParser.ReturnItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link CypherFragmentParser#where}.
	 * @param ctx the parse tree
	 */
	void enterWhere(CypherFragmentParser.WhereContext ctx);
	/**
	 * Exit a parse tree produced by {@link CypherFragmentParser#where}.
	 * @param ctx the parse tree
	 */
	void exitWhere(CypherFragmentParser.WhereContext ctx);
	/**
	 * Enter a parse tree produced by {@link CypherFragmentParser#pattern}.
	 * @param ctx the parse tree
	 */
	void enterPattern(CypherFragmentParser.PatternContext ctx);
	/**
	 * Exit a parse tree produced by {@link CypherFragmentParser#pattern}.
	 * @param ctx the parse tree
	 */
	void exitPattern(CypherFragmentParser.PatternContext ctx);
	/**
	 * Enter a parse tree produced by {@link CypherFragmentParser#patternPart}.
	 * @param ctx the parse tree
	 */
	void enterPatternPart(CypherFragmentParser.PatternPartContext ctx);
	/**
	 * Exit a parse tree produced by {@link CypherFragmentParser#patternPart}.
	 * @param ctx the parse tree
	 */
	void exitPatternPart(CypherFragmentParser.PatternPartContext ctx);
	/**
	 * Enter a parse tree produced by {@link CypherFragmentParser#anonymousPatternPart}.
	 * @param ctx the parse tree
	 */
	void enterAnonymousPatternPart(CypherFragmentParser.AnonymousPatternPartContext ctx);
	/**
	 * Exit a parse tree produced by {@link CypherFragmentParser#anonymousPatternPart}.
	 * @param ctx the parse tree
	 */
	void exitAnonymousPatternPart(CypherFragmentParser.AnonymousPatternPartContext ctx);
	/**
	 * Enter a parse tree produced by {@link CypherFragmentParser#patternElement}.
	 * @param ctx the parse tree
	 */
	void enterPatternElement(CypherFragmentParser.PatternElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CypherFragmentParser#patternElement}.
	 * @param ctx the parse tree
	 */
	void exitPatternElement(CypherFragmentParser.PatternElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CypherFragmentParser#nodePattern}.
	 * @param ctx the parse tree
	 */
	void enterNodePattern(CypherFragmentParser.NodePatternContext ctx);
	/**
	 * Exit a parse tree produced by {@link CypherFragmentParser#nodePattern}.
	 * @param ctx the parse tree
	 */
	void exitNodePattern(CypherFragmentParser.NodePatternContext ctx);
	/**
	 * Enter a parse tree produced by {@link CypherFragmentParser#patternElementChain}.
	 * @param ctx the parse tree
	 */
	void enterPatternElementChain(CypherFragmentParser.PatternElementChainContext ctx);
	/**
	 * Exit a parse tree produced by {@link CypherFragmentParser#patternElementChain}.
	 * @param ctx the parse tree
	 */
	void exitPatternElementChain(CypherFragmentParser.PatternElementChainContext ctx);
	/**
	 * Enter a parse tree produced by {@link CypherFragmentParser#relationshipPattern}.
	 * @param ctx the parse tree
	 */
	void enterRelationshipPattern(CypherFragmentParser.RelationshipPatternContext ctx);
	/**
	 * Exit a parse tree produced by {@link CypherFragmentParser#relationshipPattern}.
	 * @param ctx the parse tree
	 */
	void exitRelationshipPattern(CypherFragmentParser.RelationshipPatternContext ctx);
	/**
	 * Enter a parse tree produced by {@link CypherFragmentParser#relationshipDetail}.
	 * @param ctx the parse tree
	 */
	void enterRelationshipDetail(CypherFragmentParser.RelationshipDetailContext ctx);
	/**
	 * Exit a parse tree produced by {@link CypherFragmentParser#relationshipDetail}.
	 * @param ctx the parse tree
	 */
	void exitRelationshipDetail(CypherFragmentParser.RelationshipDetailContext ctx);
	/**
	 * Enter a parse tree produced by {@link CypherFragmentParser#properties}.
	 * @param ctx the parse tree
	 */
	void enterProperties(CypherFragmentParser.PropertiesContext ctx);
	/**
	 * Exit a parse tree produced by {@link CypherFragmentParser#properties}.
	 * @param ctx the parse tree
	 */
	void exitProperties(CypherFragmentParser.PropertiesContext ctx);
	/**
	 * Enter a parse tree produced by {@link CypherFragmentParser#relationshipTypes}.
	 * @param ctx the parse tree
	 */
	void enterRelationshipTypes(CypherFragmentParser.RelationshipTypesContext ctx);
	/**
	 * Exit a parse tree produced by {@link CypherFragmentParser#relationshipTypes}.
	 * @param ctx the parse tree
	 */
	void exitRelationshipTypes(CypherFragmentParser.RelationshipTypesContext ctx);
	/**
	 * Enter a parse tree produced by {@link CypherFragmentParser#nodeLabels}.
	 * @param ctx the parse tree
	 */
	void enterNodeLabels(CypherFragmentParser.NodeLabelsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CypherFragmentParser#nodeLabels}.
	 * @param ctx the parse tree
	 */
	void exitNodeLabels(CypherFragmentParser.NodeLabelsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CypherFragmentParser#nodeLabel}.
	 * @param ctx the parse tree
	 */
	void enterNodeLabel(CypherFragmentParser.NodeLabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link CypherFragmentParser#nodeLabel}.
	 * @param ctx the parse tree
	 */
	void exitNodeLabel(CypherFragmentParser.NodeLabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link CypherFragmentParser#rangeLiteral}.
	 * @param ctx the parse tree
	 */
	void enterRangeLiteral(CypherFragmentParser.RangeLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link CypherFragmentParser#rangeLiteral}.
	 * @param ctx the parse tree
	 */
	void exitRangeLiteral(CypherFragmentParser.RangeLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link CypherFragmentParser#labelName}.
	 * @param ctx the parse tree
	 */
	void enterLabelName(CypherFragmentParser.LabelNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CypherFragmentParser#labelName}.
	 * @param ctx the parse tree
	 */
	void exitLabelName(CypherFragmentParser.LabelNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link CypherFragmentParser#relTypeName}.
	 * @param ctx the parse tree
	 */
	void enterRelTypeName(CypherFragmentParser.RelTypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CypherFragmentParser#relTypeName}.
	 * @param ctx the parse tree
	 */
	void exitRelTypeName(CypherFragmentParser.RelTypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link CypherFragmentParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(CypherFragmentParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CypherFragmentParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(CypherFragmentParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CypherFragmentParser#expression9}.
	 * @param ctx the parse tree
	 */
	void enterExpression9(CypherFragmentParser.Expression9Context ctx);
	/**
	 * Exit a parse tree produced by {@link CypherFragmentParser#expression9}.
	 * @param ctx the parse tree
	 */
	void exitExpression9(CypherFragmentParser.Expression9Context ctx);
	/**
	 * Enter a parse tree produced by {@link CypherFragmentParser#expression7}.
	 * @param ctx the parse tree
	 */
	void enterExpression7(CypherFragmentParser.Expression7Context ctx);
	/**
	 * Exit a parse tree produced by {@link CypherFragmentParser#expression7}.
	 * @param ctx the parse tree
	 */
	void exitExpression7(CypherFragmentParser.Expression7Context ctx);
	/**
	 * Enter a parse tree produced by {@link CypherFragmentParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtom(CypherFragmentParser.AtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link CypherFragmentParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtom(CypherFragmentParser.AtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link CypherFragmentParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(CypherFragmentParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link CypherFragmentParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(CypherFragmentParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link CypherFragmentParser#numberLiteral}.
	 * @param ctx the parse tree
	 */
	void enterNumberLiteral(CypherFragmentParser.NumberLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link CypherFragmentParser#numberLiteral}.
	 * @param ctx the parse tree
	 */
	void exitNumberLiteral(CypherFragmentParser.NumberLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link CypherFragmentParser#booleanLiteral}.
	 * @param ctx the parse tree
	 */
	void enterBooleanLiteral(CypherFragmentParser.BooleanLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link CypherFragmentParser#booleanLiteral}.
	 * @param ctx the parse tree
	 */
	void exitBooleanLiteral(CypherFragmentParser.BooleanLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link CypherFragmentParser#mapLiteral}.
	 * @param ctx the parse tree
	 */
	void enterMapLiteral(CypherFragmentParser.MapLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link CypherFragmentParser#mapLiteral}.
	 * @param ctx the parse tree
	 */
	void exitMapLiteral(CypherFragmentParser.MapLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link CypherFragmentParser#parenthesizedExpression}.
	 * @param ctx the parse tree
	 */
	void enterParenthesizedExpression(CypherFragmentParser.ParenthesizedExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CypherFragmentParser#parenthesizedExpression}.
	 * @param ctx the parse tree
	 */
	void exitParenthesizedExpression(CypherFragmentParser.ParenthesizedExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CypherFragmentParser#propertyLookup}.
	 * @param ctx the parse tree
	 */
	void enterPropertyLookup(CypherFragmentParser.PropertyLookupContext ctx);
	/**
	 * Exit a parse tree produced by {@link CypherFragmentParser#propertyLookup}.
	 * @param ctx the parse tree
	 */
	void exitPropertyLookup(CypherFragmentParser.PropertyLookupContext ctx);
	/**
	 * Enter a parse tree produced by {@link CypherFragmentParser#labelLookup}.
	 * @param ctx the parse tree
	 */
	void enterLabelLookup(CypherFragmentParser.LabelLookupContext ctx);
	/**
	 * Exit a parse tree produced by {@link CypherFragmentParser#labelLookup}.
	 * @param ctx the parse tree
	 */
	void exitLabelLookup(CypherFragmentParser.LabelLookupContext ctx);
	/**
	 * Enter a parse tree produced by {@link CypherFragmentParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(CypherFragmentParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link CypherFragmentParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(CypherFragmentParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link CypherFragmentParser#integerLiteral}.
	 * @param ctx the parse tree
	 */
	void enterIntegerLiteral(CypherFragmentParser.IntegerLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link CypherFragmentParser#integerLiteral}.
	 * @param ctx the parse tree
	 */
	void exitIntegerLiteral(CypherFragmentParser.IntegerLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link CypherFragmentParser#propertyKeyName}.
	 * @param ctx the parse tree
	 */
	void enterPropertyKeyName(CypherFragmentParser.PropertyKeyNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CypherFragmentParser#propertyKeyName}.
	 * @param ctx the parse tree
	 */
	void exitPropertyKeyName(CypherFragmentParser.PropertyKeyNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link CypherFragmentParser#schemaName}.
	 * @param ctx the parse tree
	 */
	void enterSchemaName(CypherFragmentParser.SchemaNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CypherFragmentParser#schemaName}.
	 * @param ctx the parse tree
	 */
	void exitSchemaName(CypherFragmentParser.SchemaNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link CypherFragmentParser#reservedWord}.
	 * @param ctx the parse tree
	 */
	void enterReservedWord(CypherFragmentParser.ReservedWordContext ctx);
	/**
	 * Exit a parse tree produced by {@link CypherFragmentParser#reservedWord}.
	 * @param ctx the parse tree
	 */
	void exitReservedWord(CypherFragmentParser.ReservedWordContext ctx);
	/**
	 * Enter a parse tree produced by {@link CypherFragmentParser#doubleLiteral}.
	 * @param ctx the parse tree
	 */
	void enterDoubleLiteral(CypherFragmentParser.DoubleLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link CypherFragmentParser#doubleLiteral}.
	 * @param ctx the parse tree
	 */
	void exitDoubleLiteral(CypherFragmentParser.DoubleLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link CypherFragmentParser#symbolicName}.
	 * @param ctx the parse tree
	 */
	void enterSymbolicName(CypherFragmentParser.SymbolicNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CypherFragmentParser#symbolicName}.
	 * @param ctx the parse tree
	 */
	void exitSymbolicName(CypherFragmentParser.SymbolicNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link CypherFragmentParser#leftArrowHead}.
	 * @param ctx the parse tree
	 */
	void enterLeftArrowHead(CypherFragmentParser.LeftArrowHeadContext ctx);
	/**
	 * Exit a parse tree produced by {@link CypherFragmentParser#leftArrowHead}.
	 * @param ctx the parse tree
	 */
	void exitLeftArrowHead(CypherFragmentParser.LeftArrowHeadContext ctx);
	/**
	 * Enter a parse tree produced by {@link CypherFragmentParser#rightArrowHead}.
	 * @param ctx the parse tree
	 */
	void enterRightArrowHead(CypherFragmentParser.RightArrowHeadContext ctx);
	/**
	 * Exit a parse tree produced by {@link CypherFragmentParser#rightArrowHead}.
	 * @param ctx the parse tree
	 */
	void exitRightArrowHead(CypherFragmentParser.RightArrowHeadContext ctx);
	/**
	 * Enter a parse tree produced by {@link CypherFragmentParser#dash}.
	 * @param ctx the parse tree
	 */
	void enterDash(CypherFragmentParser.DashContext ctx);
	/**
	 * Exit a parse tree produced by {@link CypherFragmentParser#dash}.
	 * @param ctx the parse tree
	 */
	void exitDash(CypherFragmentParser.DashContext ctx);
}