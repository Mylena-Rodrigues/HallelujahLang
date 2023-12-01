public class HallelujahLangCustomVisitor extends HallelujahLangBaseVisitor<Object> {

    @Override
	public Object visitProgram(HallelujahLangParser.ProgramContext ctx) {
		return visitChildren(ctx);
	}


	@Override
	public Object visitPackage_declaration(HallelujahLangParser.Package_declarationContext ctx) {
		return visitChildren(ctx);
	}


	@Override
	public Object visitPackage_import(HallelujahLangParser.Package_importContext ctx) {
		return visitChildren(ctx);
	}


	@Override
	public Object visitClass_declaration(HallelujahLangParser.Class_declarationContext ctx) {
		return visitChildren(ctx);
	}


	@Override
	public Object visitClass_body(HallelujahLangParser.Class_bodyContext ctx) {
		return visitChildren(ctx);
	}


	@Override
	public Object visitClass_instance(HallelujahLangParser.Class_instanceContext ctx) {
		return visitChildren(ctx);
	}


	@Override
	public Object visitField_declaration(HallelujahLangParser.Field_declarationContext ctx) {
		return visitChildren(ctx);
	}


	@Override
	public Object visitMethod_declaration(HallelujahLangParser.Method_declarationContext ctx) {
		return visitChildren(ctx);
	}


	@Override
	public Object visitParameters(HallelujahLangParser.ParametersContext ctx) {
		return visitChildren(ctx);
	}


	@Override
	public Object visitParameter(HallelujahLangParser.ParameterContext ctx) {
		return visitChildren(ctx);
	}


	@Override
	public Object visitBlock(HallelujahLangParser.BlockContext ctx) {
		return visitChildren(ctx);
	}


	@Override
	public Object visitStatement(HallelujahLangParser.StatementContext ctx) {
		return visitChildren(ctx);
	}


	@Override
	public Object visitAssignment_statement(HallelujahLangParser.Assignment_statementContext ctx) {
		return visitChildren(ctx);
	}


	@Override
	public Object visitIf_statement(HallelujahLangParser.If_statementContext ctx) {
		return visitChildren(ctx);
	}


	@Override
	public Object visitElseif_statement(HallelujahLangParser.Elseif_statementContext ctx) {
		return visitChildren(ctx);
	}


	@Override
	public Object visitWhile_statement(HallelujahLangParser.While_statementContext ctx) {
		return visitChildren(ctx);
	}


	@Override
	public Object visitReturn_statement(HallelujahLangParser.Return_statementContext ctx) {
		return visitChildren(ctx);
	}


	@Override
	public Object visitPrint(HallelujahLangParser.PrintContext ctx) {
		return visitChildren(ctx);
	}


	@Override
	public Object visitMethod_call_statement(HallelujahLangParser.Method_call_statementContext ctx) {
		return visitChildren(ctx);
	}


	@Override
	public Object visitClass_method_call(HallelujahLangParser.Class_method_callContext ctx) {
		return visitChildren(ctx);
	}


	@Override
	public Object visitThis_class_method_call(HallelujahLangParser.This_class_method_callContext ctx) {
		return visitChildren(ctx);
	}


	@Override
	public Object visitPrint_statement(HallelujahLangParser.Print_statementContext ctx) {
		return visitChildren(ctx);
	}


	@Override
	public Object visitInput_statement(HallelujahLangParser.Input_statementContext ctx) {
		return visitChildren(ctx);
	}


	@Override
	public Object visitInterface_declaration(HallelujahLangParser.Interface_declarationContext ctx) {
		return visitChildren(ctx);
	}


	@Override
	public Object visitInterface_body(HallelujahLangParser.Interface_bodyContext ctx) {
		return visitChildren(ctx);
	}


	@Override
	public Object visitArguments(HallelujahLangParser.ArgumentsContext ctx) {
		return visitChildren(ctx);
	}


	@Override
	public Object visitExpression(HallelujahLangParser.ExpressionContext ctx) {
		return visitChildren(ctx);
	}


	@Override
	public Object visitArray_initializer(HallelujahLangParser.Array_initializerContext ctx) {
		return visitChildren(ctx);
	}


	@Override
	public Object visitArray_access(HallelujahLangParser.Array_accessContext ctx) {
		return visitChildren(ctx);
	}


	@Override
	public Object visitMethod_call(HallelujahLangParser.Method_callContext ctx) {
		return visitChildren(ctx);
	}


	@Override
	public Object visitData_type(HallelujahLangParser.Data_typeContext ctx) {
		return visitChildren(ctx);
	}


	@Override
	public Object visitArray_declaration(HallelujahLangParser.Array_declarationContext ctx) {
		return visitChildren(ctx);
	}


	@Override
	public Object visitConstructor_declaration(HallelujahLangParser.Constructor_declarationContext ctx) {
		return visitChildren(ctx);
	}


	@Override
	public Object visitConstructor_fields_declaration(HallelujahLangParser.Constructor_fields_declarationContext ctx) {
		return visitChildren(ctx);
	}


	@Override
	public Object visitConstructor_body(HallelujahLangParser.Constructor_bodyContext ctx) {
		return visitChildren(ctx);
	}
}
