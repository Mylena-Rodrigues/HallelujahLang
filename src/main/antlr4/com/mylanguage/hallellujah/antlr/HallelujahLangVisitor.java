// Generated from HallelujahLang.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link HallelujahLangParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface HallelujahLangVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link HallelujahLangParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(HallelujahLangParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link HallelujahLangParser#package_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackage_declaration(HallelujahLangParser.Package_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link HallelujahLangParser#program_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram_body(HallelujahLangParser.Program_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link HallelujahLangParser#package_import}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackage_import(HallelujahLangParser.Package_importContext ctx);
	/**
	 * Visit a parse tree produced by {@link HallelujahLangParser#class_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_declaration(HallelujahLangParser.Class_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link HallelujahLangParser#class_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_body(HallelujahLangParser.Class_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link HallelujahLangParser#class_instance}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_instance(HallelujahLangParser.Class_instanceContext ctx);
	/**
	 * Visit a parse tree produced by {@link HallelujahLangParser#variable_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable_declaration(HallelujahLangParser.Variable_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link HallelujahLangParser#variable_assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable_assignment(HallelujahLangParser.Variable_assignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link HallelujahLangParser#variable_reference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable_reference(HallelujahLangParser.Variable_referenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link HallelujahLangParser#array_initializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_initializer(HallelujahLangParser.Array_initializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link HallelujahLangParser#array_access}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_access(HallelujahLangParser.Array_accessContext ctx);
	/**
	 * Visit a parse tree produced by {@link HallelujahLangParser#array_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_declaration(HallelujahLangParser.Array_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link HallelujahLangParser#variable_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable_statement(HallelujahLangParser.Variable_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link HallelujahLangParser#parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameters(HallelujahLangParser.ParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link HallelujahLangParser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter(HallelujahLangParser.ParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link HallelujahLangParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(HallelujahLangParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link HallelujahLangParser#if_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_statement(HallelujahLangParser.If_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link HallelujahLangParser#while_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_statement(HallelujahLangParser.While_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link HallelujahLangParser#return_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_statement(HallelujahLangParser.Return_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link HallelujahLangParser#method_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethod_declaration(HallelujahLangParser.Method_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link HallelujahLangParser#method_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethod_call(HallelujahLangParser.Method_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link HallelujahLangParser#method_call_class}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethod_call_class(HallelujahLangParser.Method_call_classContext ctx);
	/**
	 * Visit a parse tree produced by {@link HallelujahLangParser#method_call_this_class}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethod_call_this_class(HallelujahLangParser.Method_call_this_classContext ctx);
	/**
	 * Visit a parse tree produced by {@link HallelujahLangParser#print_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint_statement(HallelujahLangParser.Print_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link HallelujahLangParser#input_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInput_statement(HallelujahLangParser.Input_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link HallelujahLangParser#interface_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterface_declaration(HallelujahLangParser.Interface_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link HallelujahLangParser#interface_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterface_body(HallelujahLangParser.Interface_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link HallelujahLangParser#arguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArguments(HallelujahLangParser.ArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link HallelujahLangParser#constructor_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructor_declaration(HallelujahLangParser.Constructor_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link HallelujahLangParser#constructor_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructor_body(HallelujahLangParser.Constructor_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link HallelujahLangParser#aritmetical_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAritmetical_expression(HallelujahLangParser.Aritmetical_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HallelujahLangParser#equality_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEquality_expression(HallelujahLangParser.Equality_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HallelujahLangParser#comparison_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparison_expression(HallelujahLangParser.Comparison_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HallelujahLangParser#logical_not_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogical_not_expression(HallelujahLangParser.Logical_not_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HallelujahLangParser#logical_or_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogical_or_expression(HallelujahLangParser.Logical_or_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HallelujahLangParser#logical_and_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogical_and_expression(HallelujahLangParser.Logical_and_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HallelujahLangParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(HallelujahLangParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HallelujahLangParser#binary_operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinary_operation(HallelujahLangParser.Binary_operationContext ctx);
	/**
	 * Visit a parse tree produced by {@link HallelujahLangParser#operand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperand(HallelujahLangParser.OperandContext ctx);
	/**
	 * Visit a parse tree produced by {@link HallelujahLangParser#callings}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallings(HallelujahLangParser.CallingsContext ctx);
	/**
	 * Visit a parse tree produced by {@link HallelujahLangParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(HallelujahLangParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link HallelujahLangParser#data_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitData_type(HallelujahLangParser.Data_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link HallelujahLangParser#comment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComment(HallelujahLangParser.CommentContext ctx);
}