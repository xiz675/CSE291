package xw.Parser;// Generated from /home/kyliu/IdeaProjects/graphTest/src/main/antlr/CypherFragment.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CypherFragmentParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CypherFragmentVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CypherFragmentParser#cypher}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCypher(CypherFragmentParser.CypherContext ctx);
	/**
	 * Visit a parse tree produced by {@link CypherFragmentParser#singleQuery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleQuery(CypherFragmentParser.SingleQueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link CypherFragmentParser#clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClause(CypherFragmentParser.ClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link CypherFragmentParser#match}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMatch(CypherFragmentParser.MatchContext ctx);
	/**
	 * Visit a parse tree produced by {@link CypherFragmentParser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(CypherFragmentParser.ReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CypherFragmentParser#returnItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnItem(CypherFragmentParser.ReturnItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link CypherFragmentParser#where}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhere(CypherFragmentParser.WhereContext ctx);
	/**
	 * Visit a parse tree produced by {@link CypherFragmentParser#pattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPattern(CypherFragmentParser.PatternContext ctx);
	/**
	 * Visit a parse tree produced by {@link CypherFragmentParser#patternPart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPatternPart(CypherFragmentParser.PatternPartContext ctx);
	/**
	 * Visit a parse tree produced by {@link CypherFragmentParser#anonymousPatternPart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnonymousPatternPart(CypherFragmentParser.AnonymousPatternPartContext ctx);
	/**
	 * Visit a parse tree produced by {@link CypherFragmentParser#patternElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPatternElement(CypherFragmentParser.PatternElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CypherFragmentParser#nodePattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNodePattern(CypherFragmentParser.NodePatternContext ctx);
	/**
	 * Visit a parse tree produced by {@link CypherFragmentParser#patternElementChain}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPatternElementChain(CypherFragmentParser.PatternElementChainContext ctx);
	/**
	 * Visit a parse tree produced by {@link CypherFragmentParser#relationshipPattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationshipPattern(CypherFragmentParser.RelationshipPatternContext ctx);
	/**
	 * Visit a parse tree produced by {@link CypherFragmentParser#relationshipDetail}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationshipDetail(CypherFragmentParser.RelationshipDetailContext ctx);
	/**
	 * Visit a parse tree produced by {@link CypherFragmentParser#properties}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProperties(CypherFragmentParser.PropertiesContext ctx);
	/**
	 * Visit a parse tree produced by {@link CypherFragmentParser#relationshipTypes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationshipTypes(CypherFragmentParser.RelationshipTypesContext ctx);
	/**
	 * Visit a parse tree produced by {@link CypherFragmentParser#nodeLabels}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNodeLabels(CypherFragmentParser.NodeLabelsContext ctx);
	/**
	 * Visit a parse tree produced by {@link CypherFragmentParser#nodeLabel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNodeLabel(CypherFragmentParser.NodeLabelContext ctx);
	/**
	 * Visit a parse tree produced by {@link CypherFragmentParser#rangeLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRangeLiteral(CypherFragmentParser.RangeLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link CypherFragmentParser#labelName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabelName(CypherFragmentParser.LabelNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link CypherFragmentParser#relTypeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelTypeName(CypherFragmentParser.RelTypeNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link CypherFragmentParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(CypherFragmentParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CypherFragmentParser#expression9}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression9(CypherFragmentParser.Expression9Context ctx);
	/**
	 * Visit a parse tree produced by {@link CypherFragmentParser#expression7}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression7(CypherFragmentParser.Expression7Context ctx);
	/**
	 * Visit a parse tree produced by {@link CypherFragmentParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtom(CypherFragmentParser.AtomContext ctx);
	/**
	 * Visit a parse tree produced by {@link CypherFragmentParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(CypherFragmentParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link CypherFragmentParser#numberLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberLiteral(CypherFragmentParser.NumberLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link CypherFragmentParser#booleanLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanLiteral(CypherFragmentParser.BooleanLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link CypherFragmentParser#mapLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMapLiteral(CypherFragmentParser.MapLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link CypherFragmentParser#parenthesizedExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthesizedExpression(CypherFragmentParser.ParenthesizedExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CypherFragmentParser#propertyLookup}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertyLookup(CypherFragmentParser.PropertyLookupContext ctx);
	/**
	 * Visit a parse tree produced by {@link CypherFragmentParser#labelLookup}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabelLookup(CypherFragmentParser.LabelLookupContext ctx);
	/**
	 * Visit a parse tree produced by {@link CypherFragmentParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(CypherFragmentParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link CypherFragmentParser#integerLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerLiteral(CypherFragmentParser.IntegerLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link CypherFragmentParser#propertyKeyName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertyKeyName(CypherFragmentParser.PropertyKeyNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link CypherFragmentParser#schemaName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSchemaName(CypherFragmentParser.SchemaNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link CypherFragmentParser#reservedWord}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReservedWord(CypherFragmentParser.ReservedWordContext ctx);
	/**
	 * Visit a parse tree produced by {@link CypherFragmentParser#doubleLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoubleLiteral(CypherFragmentParser.DoubleLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link CypherFragmentParser#symbolicName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSymbolicName(CypherFragmentParser.SymbolicNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link CypherFragmentParser#leftArrowHead}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeftArrowHead(CypherFragmentParser.LeftArrowHeadContext ctx);
	/**
	 * Visit a parse tree produced by {@link CypherFragmentParser#rightArrowHead}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRightArrowHead(CypherFragmentParser.RightArrowHeadContext ctx);
	/**
	 * Visit a parse tree produced by {@link CypherFragmentParser#dash}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDash(CypherFragmentParser.DashContext ctx);
}