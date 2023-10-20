
// Generated from HallelujahLang.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link HallelujahLangParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 *            operations with no return type.
 */
public interface HallelujahLangVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link HallelujahLangParser#program}.
	 * 
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(HallelujahLangParser.ProgramContext ctx);

	/**
	 * Visit a parse tree produced by
	 * {@link HallelujahLangParser#package_declaration}.
	 * 
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackage_declaration(HallelujahLangParser.Package_declarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link HallelujahLangParser#package_import}.
	 * 
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackage_import(HallelujahLangParser.Package_importContext ctx);

	/**
	 * Visit a parse tree produced by
	 * {@link HallelujahLangParser#class_declaration}.
	 * 
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_declaration(HallelujahLangParser.Class_declarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link HallelujahLangParser#class_body}.
	 * 
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_body(HallelujahLangParser.Class_bodyContext ctx);

	/**
	 * Visit a parse tree produced by {@link HallelujahLangParser#class_instance}.
	 * 
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_instance(HallelujahLangParser.Class_instanceContext ctx);

	/**
	 * Visit a parse tree produced by
	 * {@link HallelujahLangParser#field_declaration}.
	 * 
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitField_declaration(HallelujahLangParser.Field_declarationContext ctx);

	/**
	 * Visit a parse tree produced by
	 * {@link HallelujahLangParser#method_declaration}.
	 * 
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethod_declaration(HallelujahLangParser.Method_declarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link HallelujahLangParser#parameters}.
	 * 
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameters(HallelujahLangParser.ParametersContext ctx);

	/**
	 * Visit a parse tree produced by {@link HallelujahLangParser#parameter}.
	 * 
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter(HallelujahLangParser.ParameterContext ctx);

	/**
	 * Visit a parse tree produced by {@link HallelujahLangParser#block}.
	 * 
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(HallelujahLangParser.BlockContext ctx);

	/**
	 * Visit a parse tree produced by {@link HallelujahLangParser#statement}.
	 * 
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(HallelujahLangParser.StatementContext ctx);

	/**
	 * Visit a parse tree produced by
	 * {@link HallelujahLangParser#assignment_statement}.
	 * 
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment_statement(HallelujahLangParser.Assignment_statementContext ctx);

	/**
	 * Visit a parse tree produced by {@link HallelujahLangParser#if_statement}.
	 * 
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_statement(HallelujahLangParser.If_statementContext ctx);

	/**
	 * Visit a parse tree produced by {@link HallelujahLangParser#elseif_statement}.
	 * 
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseif_statement(HallelujahLangParser.Elseif_statementContext ctx);

	/**
	 * Visit a parse tree produced by {@link HallelujahLangParser#while_statement}.
	 * 
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_statement(HallelujahLangParser.While_statementContext ctx);

	/**
	 * Visit a parse tree produced by {@link HallelujahLangParser#return_statement}.
	 * 
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_statement(HallelujahLangParser.Return_statementContext ctx);

	/**
	 * Visit a parse tree produced by {@link HallelujahLangParser#print}.
	 * 
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(HallelujahLangParser.PrintContext ctx);

	/**
	 * Visit a parse tree produced by
	 * {@link HallelujahLangParser#method_call_statement}.
	 * 
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethod_call_statement(HallelujahLangParser.Method_call_statementContext ctx);

	/**
	 * Visit a parse tree produced by
	 * {@link HallelujahLangParser#class_method_call}.
	 * 
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_method_call(HallelujahLangParser.Class_method_callContext ctx);

	/**
	 * Visit a parse tree produced by
	 * {@link HallelujahLangParser#this_class_method_call}.
	 * 
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThis_class_method_call(HallelujahLangParser.This_class_method_callContext ctx);

	/**
	 * Visit a parse tree produced by {@link HallelujahLangParser#print_statement}.
	 * 
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint_statement(HallelujahLangParser.Print_statementContext ctx);

	/**
	 * Visit a parse tree produced by {@link HallelujahLangParser#input_statement}.
	 * 
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInput_statement(HallelujahLangParser.Input_statementContext ctx);

	/**
	 * Visit a parse tree produced by
	 * {@link HallelujahLangParser#interface_declaration}.
	 * 
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterface_declaration(HallelujahLangParser.Interface_declarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link HallelujahLangParser#interface_body}.
	 * 
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterface_body(HallelujahLangParser.Interface_bodyContext ctx);

	/**
	 * Visit a parse tree produced by {@link HallelujahLangParser#arguments}.
	 * 
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArguments(HallelujahLangParser.ArgumentsContext ctx);

	/**
	 * Visit a parse tree produced by {@link HallelujahLangParser#expression}.
	 * 
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(HallelujahLangParser.ExpressionContext ctx);

	/**
	 * Visit a parse tree produced by
	 * {@link HallelujahLangParser#array_initializer}.
	 * 
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_initializer(HallelujahLangParser.Array_initializerContext ctx);

	/**
	 * Visit a parse tree produced by {@link HallelujahLangParser#array_access}.
	 * 
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_access(HallelujahLangParser.Array_accessContext ctx);

	/**
	 * Visit a parse tree produced by {@link HallelujahLangParser#method_call}.
	 * 
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethod_call(HallelujahLangParser.Method_callContext ctx);

	/**
	 * Visit a parse tree produced by {@link HallelujahLangParser#data_type}.
	 * 
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitData_type(HallelujahLangParser.Data_typeContext ctx);

	/**
	 * Visit a parse tree produced by
	 * {@link HallelujahLangParser#array_declaration}.
	 * 
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_declaration(HallelujahLangParser.Array_declarationContext ctx);

	/**
	 * Visit a parse tree produced by
	 * {@link HallelujahLangParser#constructor_declaration}.
	 * 
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructor_declaration(HallelujahLangParser.Constructor_declarationContext ctx);

	/**
	 * Visit a parse tree produced by
	 * {@link HallelujahLangParser#constructor_fields_declaration}.
	 * 
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructor_fields_declaration(HallelujahLangParser.Constructor_fields_declarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link HallelujahLangParser#constructor_body}.
	 * 
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructor_body(HallelujahLangParser.Constructor_bodyContext ctx);
}