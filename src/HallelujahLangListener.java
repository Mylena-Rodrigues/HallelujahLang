
// Generated from HallelujahLang.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link HallelujahLangParser}.
 */
public interface HallelujahLangListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link HallelujahLangParser#program}.
	 * 
	 * @param ctx the parse tree
	 */
	void enterProgram(HallelujahLangParser.ProgramContext ctx);

	/**
	 * Exit a parse tree produced by {@link HallelujahLangParser#program}.
	 * 
	 * @param ctx the parse tree
	 */
	void exitProgram(HallelujahLangParser.ProgramContext ctx);

	/**
	 * Enter a parse tree produced by
	 * {@link HallelujahLangParser#package_declaration}.
	 * 
	 * @param ctx the parse tree
	 */
	void enterPackage_declaration(HallelujahLangParser.Package_declarationContext ctx);

	/**
	 * Exit a parse tree produced by
	 * {@link HallelujahLangParser#package_declaration}.
	 * 
	 * @param ctx the parse tree
	 */
	void exitPackage_declaration(HallelujahLangParser.Package_declarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link HallelujahLangParser#package_import}.
	 * 
	 * @param ctx the parse tree
	 */
	void enterPackage_import(HallelujahLangParser.Package_importContext ctx);

	/**
	 * Exit a parse tree produced by {@link HallelujahLangParser#package_import}.
	 * 
	 * @param ctx the parse tree
	 */
	void exitPackage_import(HallelujahLangParser.Package_importContext ctx);

	/**
	 * Enter a parse tree produced by
	 * {@link HallelujahLangParser#class_declaration}.
	 * 
	 * @param ctx the parse tree
	 */
	void enterClass_declaration(HallelujahLangParser.Class_declarationContext ctx);

	/**
	 * Exit a parse tree produced by {@link HallelujahLangParser#class_declaration}.
	 * 
	 * @param ctx the parse tree
	 */
	void exitClass_declaration(HallelujahLangParser.Class_declarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link HallelujahLangParser#class_body}.
	 * 
	 * @param ctx the parse tree
	 */
	void enterClass_body(HallelujahLangParser.Class_bodyContext ctx);

	/**
	 * Exit a parse tree produced by {@link HallelujahLangParser#class_body}.
	 * 
	 * @param ctx the parse tree
	 */
	void exitClass_body(HallelujahLangParser.Class_bodyContext ctx);

	/**
	 * Enter a parse tree produced by {@link HallelujahLangParser#class_instance}.
	 * 
	 * @param ctx the parse tree
	 */
	void enterClass_instance(HallelujahLangParser.Class_instanceContext ctx);

	/**
	 * Exit a parse tree produced by {@link HallelujahLangParser#class_instance}.
	 * 
	 * @param ctx the parse tree
	 */
	void exitClass_instance(HallelujahLangParser.Class_instanceContext ctx);

	/**
	 * Enter a parse tree produced by
	 * {@link HallelujahLangParser#field_declaration}.
	 * 
	 * @param ctx the parse tree
	 */
	void enterField_declaration(HallelujahLangParser.Field_declarationContext ctx);

	/**
	 * Exit a parse tree produced by {@link HallelujahLangParser#field_declaration}.
	 * 
	 * @param ctx the parse tree
	 */
	void exitField_declaration(HallelujahLangParser.Field_declarationContext ctx);

	/**
	 * Enter a parse tree produced by
	 * {@link HallelujahLangParser#method_declaration}.
	 * 
	 * @param ctx the parse tree
	 */
	void enterMethod_declaration(HallelujahLangParser.Method_declarationContext ctx);

	/**
	 * Exit a parse tree produced by
	 * {@link HallelujahLangParser#method_declaration}.
	 * 
	 * @param ctx the parse tree
	 */
	void exitMethod_declaration(HallelujahLangParser.Method_declarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link HallelujahLangParser#parameters}.
	 * 
	 * @param ctx the parse tree
	 */
	void enterParameters(HallelujahLangParser.ParametersContext ctx);

	/**
	 * Exit a parse tree produced by {@link HallelujahLangParser#parameters}.
	 * 
	 * @param ctx the parse tree
	 */
	void exitParameters(HallelujahLangParser.ParametersContext ctx);

	/**
	 * Enter a parse tree produced by {@link HallelujahLangParser#parameter}.
	 * 
	 * @param ctx the parse tree
	 */
	void enterParameter(HallelujahLangParser.ParameterContext ctx);

	/**
	 * Exit a parse tree produced by {@link HallelujahLangParser#parameter}.
	 * 
	 * @param ctx the parse tree
	 */
	void exitParameter(HallelujahLangParser.ParameterContext ctx);

	/**
	 * Enter a parse tree produced by {@link HallelujahLangParser#block}.
	 * 
	 * @param ctx the parse tree
	 */
	void enterBlock(HallelujahLangParser.BlockContext ctx);

	/**
	 * Exit a parse tree produced by {@link HallelujahLangParser#block}.
	 * 
	 * @param ctx the parse tree
	 */
	void exitBlock(HallelujahLangParser.BlockContext ctx);

	/**
	 * Enter a parse tree produced by {@link HallelujahLangParser#statement}.
	 * 
	 * @param ctx the parse tree
	 */
	void enterStatement(HallelujahLangParser.StatementContext ctx);

	/**
	 * Exit a parse tree produced by {@link HallelujahLangParser#statement}.
	 * 
	 * @param ctx the parse tree
	 */
	void exitStatement(HallelujahLangParser.StatementContext ctx);

	/**
	 * Enter a parse tree produced by
	 * {@link HallelujahLangParser#assignment_statement}.
	 * 
	 * @param ctx the parse tree
	 */
	void enterAssignment_statement(HallelujahLangParser.Assignment_statementContext ctx);

	/**
	 * Exit a parse tree produced by
	 * {@link HallelujahLangParser#assignment_statement}.
	 * 
	 * @param ctx the parse tree
	 */
	void exitAssignment_statement(HallelujahLangParser.Assignment_statementContext ctx);

	/**
	 * Enter a parse tree produced by {@link HallelujahLangParser#if_statement}.
	 * 
	 * @param ctx the parse tree
	 */
	void enterIf_statement(HallelujahLangParser.If_statementContext ctx);

	/**
	 * Exit a parse tree produced by {@link HallelujahLangParser#if_statement}.
	 * 
	 * @param ctx the parse tree
	 */
	void exitIf_statement(HallelujahLangParser.If_statementContext ctx);

	/**
	 * Enter a parse tree produced by {@link HallelujahLangParser#elseif_statement}.
	 * 
	 * @param ctx the parse tree
	 */
	void enterElseif_statement(HallelujahLangParser.Elseif_statementContext ctx);

	/**
	 * Exit a parse tree produced by {@link HallelujahLangParser#elseif_statement}.
	 * 
	 * @param ctx the parse tree
	 */
	void exitElseif_statement(HallelujahLangParser.Elseif_statementContext ctx);

	/**
	 * Enter a parse tree produced by {@link HallelujahLangParser#while_statement}.
	 * 
	 * @param ctx the parse tree
	 */
	void enterWhile_statement(HallelujahLangParser.While_statementContext ctx);

	/**
	 * Exit a parse tree produced by {@link HallelujahLangParser#while_statement}.
	 * 
	 * @param ctx the parse tree
	 */
	void exitWhile_statement(HallelujahLangParser.While_statementContext ctx);

	/**
	 * Enter a parse tree produced by {@link HallelujahLangParser#return_statement}.
	 * 
	 * @param ctx the parse tree
	 */
	void enterReturn_statement(HallelujahLangParser.Return_statementContext ctx);

	/**
	 * Exit a parse tree produced by {@link HallelujahLangParser#return_statement}.
	 * 
	 * @param ctx the parse tree
	 */
	void exitReturn_statement(HallelujahLangParser.Return_statementContext ctx);

	/**
	 * Enter a parse tree produced by {@link HallelujahLangParser#print}.
	 * 
	 * @param ctx the parse tree
	 */
	void enterPrint(HallelujahLangParser.PrintContext ctx);

	/**
	 * Exit a parse tree produced by {@link HallelujahLangParser#print}.
	 * 
	 * @param ctx the parse tree
	 */
	void exitPrint(HallelujahLangParser.PrintContext ctx);

	/**
	 * Enter a parse tree produced by
	 * {@link HallelujahLangParser#method_call_statement}.
	 * 
	 * @param ctx the parse tree
	 */
	void enterMethod_call_statement(HallelujahLangParser.Method_call_statementContext ctx);

	/**
	 * Exit a parse tree produced by
	 * {@link HallelujahLangParser#method_call_statement}.
	 * 
	 * @param ctx the parse tree
	 */
	void exitMethod_call_statement(HallelujahLangParser.Method_call_statementContext ctx);

	/**
	 * Enter a parse tree produced by
	 * {@link HallelujahLangParser#class_method_call}.
	 * 
	 * @param ctx the parse tree
	 */
	void enterClass_method_call(HallelujahLangParser.Class_method_callContext ctx);

	/**
	 * Exit a parse tree produced by {@link HallelujahLangParser#class_method_call}.
	 * 
	 * @param ctx the parse tree
	 */
	void exitClass_method_call(HallelujahLangParser.Class_method_callContext ctx);

	/**
	 * Enter a parse tree produced by
	 * {@link HallelujahLangParser#this_class_method_call}.
	 * 
	 * @param ctx the parse tree
	 */
	void enterThis_class_method_call(HallelujahLangParser.This_class_method_callContext ctx);

	/**
	 * Exit a parse tree produced by
	 * {@link HallelujahLangParser#this_class_method_call}.
	 * 
	 * @param ctx the parse tree
	 */
	void exitThis_class_method_call(HallelujahLangParser.This_class_method_callContext ctx);

	/**
	 * Enter a parse tree produced by {@link HallelujahLangParser#print_statement}.
	 * 
	 * @param ctx the parse tree
	 */
	void enterPrint_statement(HallelujahLangParser.Print_statementContext ctx);

	/**
	 * Exit a parse tree produced by {@link HallelujahLangParser#print_statement}.
	 * 
	 * @param ctx the parse tree
	 */
	void exitPrint_statement(HallelujahLangParser.Print_statementContext ctx);

	/**
	 * Enter a parse tree produced by {@link HallelujahLangParser#input_statement}.
	 * 
	 * @param ctx the parse tree
	 */
	void enterInput_statement(HallelujahLangParser.Input_statementContext ctx);

	/**
	 * Exit a parse tree produced by {@link HallelujahLangParser#input_statement}.
	 * 
	 * @param ctx the parse tree
	 */
	void exitInput_statement(HallelujahLangParser.Input_statementContext ctx);

	/**
	 * Enter a parse tree produced by
	 * {@link HallelujahLangParser#interface_declaration}.
	 * 
	 * @param ctx the parse tree
	 */
	void enterInterface_declaration(HallelujahLangParser.Interface_declarationContext ctx);

	/**
	 * Exit a parse tree produced by
	 * {@link HallelujahLangParser#interface_declaration}.
	 * 
	 * @param ctx the parse tree
	 */
	void exitInterface_declaration(HallelujahLangParser.Interface_declarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link HallelujahLangParser#interface_body}.
	 * 
	 * @param ctx the parse tree
	 */
	void enterInterface_body(HallelujahLangParser.Interface_bodyContext ctx);

	/**
	 * Exit a parse tree produced by {@link HallelujahLangParser#interface_body}.
	 * 
	 * @param ctx the parse tree
	 */
	void exitInterface_body(HallelujahLangParser.Interface_bodyContext ctx);

	/**
	 * Enter a parse tree produced by {@link HallelujahLangParser#arguments}.
	 * 
	 * @param ctx the parse tree
	 */
	void enterArguments(HallelujahLangParser.ArgumentsContext ctx);

	/**
	 * Exit a parse tree produced by {@link HallelujahLangParser#arguments}.
	 * 
	 * @param ctx the parse tree
	 */
	void exitArguments(HallelujahLangParser.ArgumentsContext ctx);

	/**
	 * Enter a parse tree produced by {@link HallelujahLangParser#expression}.
	 * 
	 * @param ctx the parse tree
	 */
	void enterExpression(HallelujahLangParser.ExpressionContext ctx);

	/**
	 * Exit a parse tree produced by {@link HallelujahLangParser#expression}.
	 * 
	 * @param ctx the parse tree
	 */
	void exitExpression(HallelujahLangParser.ExpressionContext ctx);

	/**
	 * Enter a parse tree produced by
	 * {@link HallelujahLangParser#array_initializer}.
	 * 
	 * @param ctx the parse tree
	 */
	void enterArray_initializer(HallelujahLangParser.Array_initializerContext ctx);

	/**
	 * Exit a parse tree produced by {@link HallelujahLangParser#array_initializer}.
	 * 
	 * @param ctx the parse tree
	 */
	void exitArray_initializer(HallelujahLangParser.Array_initializerContext ctx);

	/**
	 * Enter a parse tree produced by {@link HallelujahLangParser#array_access}.
	 * 
	 * @param ctx the parse tree
	 */
	void enterArray_access(HallelujahLangParser.Array_accessContext ctx);

	/**
	 * Exit a parse tree produced by {@link HallelujahLangParser#array_access}.
	 * 
	 * @param ctx the parse tree
	 */
	void exitArray_access(HallelujahLangParser.Array_accessContext ctx);

	/**
	 * Enter a parse tree produced by {@link HallelujahLangParser#method_call}.
	 * 
	 * @param ctx the parse tree
	 */
	void enterMethod_call(HallelujahLangParser.Method_callContext ctx);

	/**
	 * Exit a parse tree produced by {@link HallelujahLangParser#method_call}.
	 * 
	 * @param ctx the parse tree
	 */
	void exitMethod_call(HallelujahLangParser.Method_callContext ctx);

	/**
	 * Enter a parse tree produced by {@link HallelujahLangParser#data_type}.
	 * 
	 * @param ctx the parse tree
	 */
	void enterData_type(HallelujahLangParser.Data_typeContext ctx);

	/**
	 * Exit a parse tree produced by {@link HallelujahLangParser#data_type}.
	 * 
	 * @param ctx the parse tree
	 */
	void exitData_type(HallelujahLangParser.Data_typeContext ctx);

	/**
	 * Enter a parse tree produced by
	 * {@link HallelujahLangParser#array_declaration}.
	 * 
	 * @param ctx the parse tree
	 */
	void enterArray_declaration(HallelujahLangParser.Array_declarationContext ctx);

	/**
	 * Exit a parse tree produced by {@link HallelujahLangParser#array_declaration}.
	 * 
	 * @param ctx the parse tree
	 */
	void exitArray_declaration(HallelujahLangParser.Array_declarationContext ctx);

	/**
	 * Enter a parse tree produced by
	 * {@link HallelujahLangParser#constructor_declaration}.
	 * 
	 * @param ctx the parse tree
	 */
	void enterConstructor_declaration(HallelujahLangParser.Constructor_declarationContext ctx);

	/**
	 * Exit a parse tree produced by
	 * {@link HallelujahLangParser#constructor_declaration}.
	 * 
	 * @param ctx the parse tree
	 */
	void exitConstructor_declaration(HallelujahLangParser.Constructor_declarationContext ctx);

	/**
	 * Enter a parse tree produced by
	 * {@link HallelujahLangParser#constructor_fields_declaration}.
	 * 
	 * @param ctx the parse tree
	 */
	void enterConstructor_fields_declaration(HallelujahLangParser.Constructor_fields_declarationContext ctx);

	/**
	 * Exit a parse tree produced by
	 * {@link HallelujahLangParser#constructor_fields_declaration}.
	 * 
	 * @param ctx the parse tree
	 */
	void exitConstructor_fields_declaration(HallelujahLangParser.Constructor_fields_declarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link HallelujahLangParser#constructor_body}.
	 * 
	 * @param ctx the parse tree
	 */
	void enterConstructor_body(HallelujahLangParser.Constructor_bodyContext ctx);

	/**
	 * Exit a parse tree produced by {@link HallelujahLangParser#constructor_body}.
	 * 
	 * @param ctx the parse tree
	 */
	void exitConstructor_body(HallelujahLangParser.Constructor_bodyContext ctx);
}