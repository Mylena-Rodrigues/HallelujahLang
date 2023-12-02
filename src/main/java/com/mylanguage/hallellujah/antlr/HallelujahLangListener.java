// Generated from D:/PUC CAMPINAS/HallelujahLang/src/main/java/com/mylanguage/hallellujah/antlr/HallelujahLang.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link HallelujahLangParser}.
 */
public interface HallelujahLangListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link HallelujahLangParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(HallelujahLangParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link HallelujahLangParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(HallelujahLangParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link HallelujahLangParser#package_declaration}.
	 * @param ctx the parse tree
	 */
	void enterPackage_declaration(HallelujahLangParser.Package_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link HallelujahLangParser#package_declaration}.
	 * @param ctx the parse tree
	 */
	void exitPackage_declaration(HallelujahLangParser.Package_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link HallelujahLangParser#program_body}.
	 * @param ctx the parse tree
	 */
	void enterProgram_body(HallelujahLangParser.Program_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link HallelujahLangParser#program_body}.
	 * @param ctx the parse tree
	 */
	void exitProgram_body(HallelujahLangParser.Program_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link HallelujahLangParser#package_import}.
	 * @param ctx the parse tree
	 */
	void enterPackage_import(HallelujahLangParser.Package_importContext ctx);
	/**
	 * Exit a parse tree produced by {@link HallelujahLangParser#package_import}.
	 * @param ctx the parse tree
	 */
	void exitPackage_import(HallelujahLangParser.Package_importContext ctx);
	/**
	 * Enter a parse tree produced by {@link HallelujahLangParser#class_declaration}.
	 * @param ctx the parse tree
	 */
	void enterClass_declaration(HallelujahLangParser.Class_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link HallelujahLangParser#class_declaration}.
	 * @param ctx the parse tree
	 */
	void exitClass_declaration(HallelujahLangParser.Class_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link HallelujahLangParser#class_body}.
	 * @param ctx the parse tree
	 */
	void enterClass_body(HallelujahLangParser.Class_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link HallelujahLangParser#class_body}.
	 * @param ctx the parse tree
	 */
	void exitClass_body(HallelujahLangParser.Class_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link HallelujahLangParser#class_instance}.
	 * @param ctx the parse tree
	 */
	void enterClass_instance(HallelujahLangParser.Class_instanceContext ctx);
	/**
	 * Exit a parse tree produced by {@link HallelujahLangParser#class_instance}.
	 * @param ctx the parse tree
	 */
	void exitClass_instance(HallelujahLangParser.Class_instanceContext ctx);
	/**
	 * Enter a parse tree produced by {@link HallelujahLangParser#variable_declaration}.
	 * @param ctx the parse tree
	 */
	void enterVariable_declaration(HallelujahLangParser.Variable_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link HallelujahLangParser#variable_declaration}.
	 * @param ctx the parse tree
	 */
	void exitVariable_declaration(HallelujahLangParser.Variable_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link HallelujahLangParser#variable_assignment}.
	 * @param ctx the parse tree
	 */
	void enterVariable_assignment(HallelujahLangParser.Variable_assignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link HallelujahLangParser#variable_assignment}.
	 * @param ctx the parse tree
	 */
	void exitVariable_assignment(HallelujahLangParser.Variable_assignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link HallelujahLangParser#variable_reference}.
	 * @param ctx the parse tree
	 */
	void enterVariable_reference(HallelujahLangParser.Variable_referenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link HallelujahLangParser#variable_reference}.
	 * @param ctx the parse tree
	 */
	void exitVariable_reference(HallelujahLangParser.Variable_referenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link HallelujahLangParser#array_initializer}.
	 * @param ctx the parse tree
	 */
	void enterArray_initializer(HallelujahLangParser.Array_initializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link HallelujahLangParser#array_initializer}.
	 * @param ctx the parse tree
	 */
	void exitArray_initializer(HallelujahLangParser.Array_initializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link HallelujahLangParser#array_access}.
	 * @param ctx the parse tree
	 */
	void enterArray_access(HallelujahLangParser.Array_accessContext ctx);
	/**
	 * Exit a parse tree produced by {@link HallelujahLangParser#array_access}.
	 * @param ctx the parse tree
	 */
	void exitArray_access(HallelujahLangParser.Array_accessContext ctx);
	/**
	 * Enter a parse tree produced by {@link HallelujahLangParser#array_declaration}.
	 * @param ctx the parse tree
	 */
	void enterArray_declaration(HallelujahLangParser.Array_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link HallelujahLangParser#array_declaration}.
	 * @param ctx the parse tree
	 */
	void exitArray_declaration(HallelujahLangParser.Array_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link HallelujahLangParser#variable_statement}.
	 * @param ctx the parse tree
	 */
	void enterVariable_statement(HallelujahLangParser.Variable_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HallelujahLangParser#variable_statement}.
	 * @param ctx the parse tree
	 */
	void exitVariable_statement(HallelujahLangParser.Variable_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link HallelujahLangParser#parameters}.
	 * @param ctx the parse tree
	 */
	void enterParameters(HallelujahLangParser.ParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link HallelujahLangParser#parameters}.
	 * @param ctx the parse tree
	 */
	void exitParameters(HallelujahLangParser.ParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link HallelujahLangParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(HallelujahLangParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link HallelujahLangParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(HallelujahLangParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link HallelujahLangParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(HallelujahLangParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HallelujahLangParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(HallelujahLangParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link HallelujahLangParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void enterIf_statement(HallelujahLangParser.If_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HallelujahLangParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void exitIf_statement(HallelujahLangParser.If_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link HallelujahLangParser#while_statement}.
	 * @param ctx the parse tree
	 */
	void enterWhile_statement(HallelujahLangParser.While_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HallelujahLangParser#while_statement}.
	 * @param ctx the parse tree
	 */
	void exitWhile_statement(HallelujahLangParser.While_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link HallelujahLangParser#return_statement}.
	 * @param ctx the parse tree
	 */
	void enterReturn_statement(HallelujahLangParser.Return_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HallelujahLangParser#return_statement}.
	 * @param ctx the parse tree
	 */
	void exitReturn_statement(HallelujahLangParser.Return_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link HallelujahLangParser#method_declaration}.
	 * @param ctx the parse tree
	 */
	void enterMethod_declaration(HallelujahLangParser.Method_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link HallelujahLangParser#method_declaration}.
	 * @param ctx the parse tree
	 */
	void exitMethod_declaration(HallelujahLangParser.Method_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link HallelujahLangParser#method_call}.
	 * @param ctx the parse tree
	 */
	void enterMethod_call(HallelujahLangParser.Method_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link HallelujahLangParser#method_call}.
	 * @param ctx the parse tree
	 */
	void exitMethod_call(HallelujahLangParser.Method_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link HallelujahLangParser#method_call_class}.
	 * @param ctx the parse tree
	 */
	void enterMethod_call_class(HallelujahLangParser.Method_call_classContext ctx);
	/**
	 * Exit a parse tree produced by {@link HallelujahLangParser#method_call_class}.
	 * @param ctx the parse tree
	 */
	void exitMethod_call_class(HallelujahLangParser.Method_call_classContext ctx);
	/**
	 * Enter a parse tree produced by {@link HallelujahLangParser#method_call_this_class}.
	 * @param ctx the parse tree
	 */
	void enterMethod_call_this_class(HallelujahLangParser.Method_call_this_classContext ctx);
	/**
	 * Exit a parse tree produced by {@link HallelujahLangParser#method_call_this_class}.
	 * @param ctx the parse tree
	 */
	void exitMethod_call_this_class(HallelujahLangParser.Method_call_this_classContext ctx);
	/**
	 * Enter a parse tree produced by {@link HallelujahLangParser#print_statement}.
	 * @param ctx the parse tree
	 */
	void enterPrint_statement(HallelujahLangParser.Print_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HallelujahLangParser#print_statement}.
	 * @param ctx the parse tree
	 */
	void exitPrint_statement(HallelujahLangParser.Print_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link HallelujahLangParser#input_statement}.
	 * @param ctx the parse tree
	 */
	void enterInput_statement(HallelujahLangParser.Input_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HallelujahLangParser#input_statement}.
	 * @param ctx the parse tree
	 */
	void exitInput_statement(HallelujahLangParser.Input_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link HallelujahLangParser#interface_declaration}.
	 * @param ctx the parse tree
	 */
	void enterInterface_declaration(HallelujahLangParser.Interface_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link HallelujahLangParser#interface_declaration}.
	 * @param ctx the parse tree
	 */
	void exitInterface_declaration(HallelujahLangParser.Interface_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link HallelujahLangParser#interface_body}.
	 * @param ctx the parse tree
	 */
	void enterInterface_body(HallelujahLangParser.Interface_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link HallelujahLangParser#interface_body}.
	 * @param ctx the parse tree
	 */
	void exitInterface_body(HallelujahLangParser.Interface_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link HallelujahLangParser#arguments}.
	 * @param ctx the parse tree
	 */
	void enterArguments(HallelujahLangParser.ArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link HallelujahLangParser#arguments}.
	 * @param ctx the parse tree
	 */
	void exitArguments(HallelujahLangParser.ArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link HallelujahLangParser#constructor_declaration}.
	 * @param ctx the parse tree
	 */
	void enterConstructor_declaration(HallelujahLangParser.Constructor_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link HallelujahLangParser#constructor_declaration}.
	 * @param ctx the parse tree
	 */
	void exitConstructor_declaration(HallelujahLangParser.Constructor_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link HallelujahLangParser#constructor_body}.
	 * @param ctx the parse tree
	 */
	void enterConstructor_body(HallelujahLangParser.Constructor_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link HallelujahLangParser#constructor_body}.
	 * @param ctx the parse tree
	 */
	void exitConstructor_body(HallelujahLangParser.Constructor_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link HallelujahLangParser#aritmetical_expression}.
	 * @param ctx the parse tree
	 */
	void enterAritmetical_expression(HallelujahLangParser.Aritmetical_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HallelujahLangParser#aritmetical_expression}.
	 * @param ctx the parse tree
	 */
	void exitAritmetical_expression(HallelujahLangParser.Aritmetical_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HallelujahLangParser#equality_expression}.
	 * @param ctx the parse tree
	 */
	void enterEquality_expression(HallelujahLangParser.Equality_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HallelujahLangParser#equality_expression}.
	 * @param ctx the parse tree
	 */
	void exitEquality_expression(HallelujahLangParser.Equality_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HallelujahLangParser#comparison_expression}.
	 * @param ctx the parse tree
	 */
	void enterComparison_expression(HallelujahLangParser.Comparison_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HallelujahLangParser#comparison_expression}.
	 * @param ctx the parse tree
	 */
	void exitComparison_expression(HallelujahLangParser.Comparison_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HallelujahLangParser#logical_not_expression}.
	 * @param ctx the parse tree
	 */
	void enterLogical_not_expression(HallelujahLangParser.Logical_not_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HallelujahLangParser#logical_not_expression}.
	 * @param ctx the parse tree
	 */
	void exitLogical_not_expression(HallelujahLangParser.Logical_not_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HallelujahLangParser#logical_or_expression}.
	 * @param ctx the parse tree
	 */
	void enterLogical_or_expression(HallelujahLangParser.Logical_or_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HallelujahLangParser#logical_or_expression}.
	 * @param ctx the parse tree
	 */
	void exitLogical_or_expression(HallelujahLangParser.Logical_or_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HallelujahLangParser#logical_and_expression}.
	 * @param ctx the parse tree
	 */
	void enterLogical_and_expression(HallelujahLangParser.Logical_and_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HallelujahLangParser#logical_and_expression}.
	 * @param ctx the parse tree
	 */
	void exitLogical_and_expression(HallelujahLangParser.Logical_and_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HallelujahLangParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(HallelujahLangParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HallelujahLangParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(HallelujahLangParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HallelujahLangParser#binary_operation}.
	 * @param ctx the parse tree
	 */
	void enterBinary_operation(HallelujahLangParser.Binary_operationContext ctx);
	/**
	 * Exit a parse tree produced by {@link HallelujahLangParser#binary_operation}.
	 * @param ctx the parse tree
	 */
	void exitBinary_operation(HallelujahLangParser.Binary_operationContext ctx);
	/**
	 * Enter a parse tree produced by {@link HallelujahLangParser#operand}.
	 * @param ctx the parse tree
	 */
	void enterOperand(HallelujahLangParser.OperandContext ctx);
	/**
	 * Exit a parse tree produced by {@link HallelujahLangParser#operand}.
	 * @param ctx the parse tree
	 */
	void exitOperand(HallelujahLangParser.OperandContext ctx);
	/**
	 * Enter a parse tree produced by {@link HallelujahLangParser#callings}.
	 * @param ctx the parse tree
	 */
	void enterCallings(HallelujahLangParser.CallingsContext ctx);
	/**
	 * Exit a parse tree produced by {@link HallelujahLangParser#callings}.
	 * @param ctx the parse tree
	 */
	void exitCallings(HallelujahLangParser.CallingsContext ctx);
	/**
	 * Enter a parse tree produced by {@link HallelujahLangParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(HallelujahLangParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link HallelujahLangParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(HallelujahLangParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link HallelujahLangParser#comment}.
	 * @param ctx the parse tree
	 */
	void enterComment(HallelujahLangParser.CommentContext ctx);
	/**
	 * Exit a parse tree produced by {@link HallelujahLangParser#comment}.
	 * @param ctx the parse tree
	 */
	void exitComment(HallelujahLangParser.CommentContext ctx);
}