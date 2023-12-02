grammar HallelujahLang;

@parser::header { 
	import java.util.Map;
	import java.util.HashMap;
	import java.util.List;
	import java.util.ArrayList;
	import org.example.ast.*;
}

@parser::members {
	Map<String, Object> symbolTable = new HashMap<String, Object>();
}

program:
	{
		List<ASTNode> body = new ArrayList<ASTNode>();
		HashMap<String, Object> symbolTable = new HashMap<String, Object>();
	} (package_declaration)? {body.add($package_declaration.node);} (
		program_body {body.add($program_body.node);}
	)* {
		for (ASTNode n : body) {
			n.execute(symbolTable);
		}
	};

package_declaration
	returns[ASTNode node]:
	PACKAGE ID SEMICOLON {$node = new PackageDeclaration($ID.text);};

program_body
	returns[ASTNode node]:
	class_declaration {$node = $class_declaration.node;}
	| interface_declaration {$node = $interface_declaration.node;}
	| package_import {$node = $package_import.node;}
	| comment;

package_import
	returns[ASTNode node]:
	IMPORT ID (DOT ID)? SEMICOLON {$node = new PackageImport($ID.text);};

class_declaration
	returns[ASTNode node]:
	CLASS ID (EXTENDS ID)? (IMPLEMENTS ID (COMMA ID)*)? LBRACE {
			List<ASTNode> body = new ArrayList<ASTNode>();
		} class_body {body.add($class_body.node);} RBRACE {
			$node = new ClassDeclaration($ID.text, body);
		};

class_body
	returns[ASTNode node]: (
		variable_statement {$node = $variable_statement.node;}
		| array_declaration {$node = $print_statement.node;}
		| print_statement {$node = $print_statement.node;}
		| input_statement {$node = $input_statement.node;}
		| if_statement {$node = $if_statement.node;}
		| while_statement {$node = $while_statement.node;}
		| class_instance {$node = $class_instance.node;}
		| method_declaration {$node = $method_declaration.node;}
		| method_call_class {$node = $method_call_class.node;} SEMICOLON
		| method_call_this_class {$node = $method_call_this_class.node;} SEMICOLON
		| constructor_declaration
		| comment
	)*;

class_instance
	returns[ASTNode node]:
	DATA_TYPE ID ASSIGN NEW ID LPAREN (arguments)? RPAREN SEMICOLON {$node = new ClassInstance($ID.text, $arguments.list);
		};

variable_declaration
	returns[ASTNode node]:
	DATA_TYPE ID (ASSIGN expression)? SEMICOLON {$node = new VariableDeclaration( $DATA_TYPE.text, $ID.text, $expression.node);
		};

variable_assignment
	returns[ASTNode node]:
	ID ASSIGN expression SEMICOLON {$node = new VariableAssignment( $ID.text, $expression.node);
		};

variable_reference
	returns[ASTNode node]:
	ID {$node = new VariableReference($ID.text);};

array_initializer
	returns[ASTNode node]:
	LPAREN DATA_TYPE RPAREN LBRACKET arguments (
		LBRACKET arguments RBRACKET
	)*? RBRACKET {
        $node = new ArrayInitializer($DATA_TYPE.text, $arguments.list);
    };

array_access
	returns[ASTNode node]:
	ID LBRACKET expression RBRACKET {
        $node = new ArrayAccess($ID.text, $expression.node);
    };

array_declaration
	returns[ASTNode node]:
	DATA_TYPE array_initializer (array_initializer)? ID (
		SEMICOLON
		| ASSIGN ID? array_initializer SEMICOLON
	) {
        // Lógica para determinar se há inicialização do array e criar o ArrayDeclaration correspondente
        if ($array_initializer.node != null) {
            $node = new ArrayDeclaration($DATA_TYPE.text, $ID.text, $array_initializer.node);
        } else {
            $node = new ArrayDeclaration($DATA_TYPE.text, $ID.text);
        }
    };

variable_statement
	returns[ASTNode node]:
	variable_declaration {$node = $variable_declaration.node;}
	| variable_assignment {$node = $variable_assignment.node;}
	| variable_reference {$node = $variable_reference.node;};

parameters
	returns[List<Parameter> list]:
	{List<Parameter> params = new ArrayList<Parameter>();} (
		p = parameter {params.add($p.param);} (
			COMMA p = parameter {params.add($p.param);}
		)*
	) {$list = params;};

parameter
	returns[Parameter param]:
	DATA_TYPE ID {$param = new Parameter($DATA_TYPE.text, $ID.text);};

statement
	returns[ASTNode node]:
	if_statement {$node = $if_statement.node;}
	| while_statement {$node = $while_statement.node;}
	| return_statement
	| print_statement {$node = $print_statement.node;}
	| input_statement {$node = $input_statement.node;}
	| array_access {$node = $array_access.node;}
	| array_declaration {$node = $array_declaration.node;}
	| class_instance {$node = $class_instance.node;}
	| method_call {$node = $method_call.node;}
	| method_call_class {$node = $method_call_class.node;}
	| method_call_this_class {$node = $method_call_this_class.node;}
	| comment
	| expression {$node = $expression.node;};

if_statement
	returns[ASTNode node]:
	IF LPAREN expression1 = expression RPAREN LBRACE {
        List<ASTNode> body = new ArrayList<ASTNode>();
        List<ASTNode> elseIfBody = new ArrayList<ASTNode>();
        List<ASTNode> elseBody = new ArrayList<ASTNode>();
    } (statement1 = statement {body.add($statement1.node);})* RBRACE (
		(
			ELSEIF LPAREN expression2 = expression RPAREN LBRACE

		(statement2 = statement {elseIfBody.add($statement2.node);})* RBRACE
		)* ELSE LBRACE

		 (
			statement3 = statement {elseBody.add($statement3.node);}
		)* RBRACE
	)? {
		$node = new If($expression1.node, body, $expression2.node, elseIfBody, elseBody);
	};

while_statement
	returns[ASTNode node]:
	WHILE LPAREN expression RPAREN LBRACE {
        List<ASTNode> body = new ArrayList<ASTNode>();
    } (statement {body.add($statement.node);})* RBRACE {
        $node = new WhileLoop($expression.node, body);
    };

return_statement:
	RETURN (expression | aritmetical_expression) SEMICOLON;

method_declaration
	returns[ASTNode node]:
	DATA_TYPE METHOD ID LPAREN (parameters)? RPAREN {
		List<ASTNode> body = new ArrayList<ASTNode>();
		HashMap<String, Object> localSymbolTable = new HashMap<String, Object>();
	} LBRACE (statement {body.add($statement.node);})*
	RBRACE {$node = new MethodDeclaration($DATA_TYPE.text, $ID.text, $parameters.list, body, localSymbolTable);
		};

method_call
	returns[ASTNode node]:
	ID LPAREN (arguments)? RPAREN {$node = new MethodCall($ID.text, $arguments.list);};

method_call_class
	returns[ASTNode node]:
	ID DOT ID LPAREN (arguments)? RPAREN {$node = new MethodCall($ID.text, $arguments.list);};

method_call_this_class
	returns[ASTNode node]:
	THIS DOT ID LPAREN (arguments)? RPAREN {$node = new MethodCall($ID.text, $arguments.list);};

print_statement
	returns[ASTNode node]:
	PRINT LPAREN expression RPAREN SEMICOLON {$node = new Print($expression.node);};

input_statement
	returns[ASTNode node]:
	INPUT LPAREN ID RPAREN SEMICOLON {$node = new Input($ID.text);};

interface_declaration
	returns[ASTNode node]:
	INTERFACE ID LBRACE {
		List<ASTNode> body = new ArrayList<ASTNode>();
		Map<String, Object> localSymbolTable = new HashMap<String, Object>();
	} (interface_body {body.add($interface_body.node);})* RBRACE {$node = new InterfaceDeclaration($ID.text, body, localSymbolTable);
		};

interface_body
	returns[ASTNode node]:
	method_declaration {$node = $method_declaration.node;}
	| (
		DATA_TYPE method_call {$node = $method_call.node;} SEMICOLON
	);

arguments
	returns[List<ASTNode> list]:
	{List<ASTNode> args = new ArrayList<ASTNode>();} (
		e = expression {args.add($e.node);} (
			COMMA e = expression {args.add($e.node);}
		)*
	) {$list = args;};

constructor_declaration
	returns[ASTNode node]:
	CONSTRUCTOR LPAREN parameters RPAREN LBRACE {
		List<ASTNode> body = new ArrayList<ASTNode>();
	} constructor_body {body.add($constructor_body.node);} RBRACE {$node = new ConstructorDeclaration($parameters.list, body);
		};

constructor_body
	returns[ASTNode node]: (
		DATA_TYPE THIS DOT ID ASSIGN expression SEMICOLON
	)*;

aritmetical_expression
	returns[ASTNode node]:
	operand {$node = $operand.node;} (
		ARITMETICAL_OPERATORS right = operand {
            $node = new AritmeticalOperations($node, $right.node, $ARITMETICAL_OPERATORS.text);
        }
	)*;

equality_expression
	returns[ASTNode node]:
	operand {$node = $operand.node;} (
		EQUALITY_OPERATORS right = operand {
            $node = new ComparisonOperations($node, $right.node, $EQUALITY_OPERATORS.text);
        }
	)*;

comparison_expression
	returns[ASTNode node]:
	operand {$node = $operand.node;} (
		COMPARISON_OPERATORS right = operand {$node = new ComparisonOperations($node, $right.node, $COMPARISON_OPERATORS.text);
			}
	)*;

logical_not_expression
	returns[ASTNode node]:
	NOT expression {$node = new LogicalNot($expression.node);};

logical_or_expression
	returns[ASTNode node]:
	logical_and_expression {$node = $logical_and_expression.node;} (
		OR right = logical_and_expression {$node = new LogicalOr($node, $right.node);}
	)*;

logical_and_expression
	returns[ASTNode node]:
	equality_expression {$node = $equality_expression.node;} (
		AND right = equality_expression {$node = new LogicalAnd($node, $right.node);}
	)*;

expression
	returns[ASTNode node]:
	binary_operation {$node = $binary_operation.node;}
	| operand {$node = $operand.node;};

binary_operation
	returns[ASTNode node]:
	aritmetical_expression {$node = $aritmetical_expression.node;}
	| equality_expression {$node = $equality_expression.node;}
	| comparison_expression {$node = $comparison_expression.node;}
	| logical_not_expression {$node = $logical_not_expression.node;}
	| logical_and_expression {$node = $logical_and_expression.node;}
	| logical_or_expression {$node = $logical_or_expression.node;};

operand
	returns[ASTNode node]:
	logical_not_expression {$node = $logical_not_expression.node;}
	| value {$node = $value.node;}
	| callings {$node = $callings.node;};

callings
	returns[ASTNode node]:
	method_call_class {$node = $method_call_class.node;}
	| array_initializer {$node = $array_initializer.node;}
	| ID array_initializer {$node = $array_initializer.node;}
	| method_call {$node = $method_call.node;}
	| method_call_this_class {$node = $method_call_this_class.node;};

value
	returns[ASTNode node]:
	ID {$node = new VariableReference($ID.text);}
	| INT_CONST {$node = new Constant(Integer.parseInt($INT_CONST.text));}
	| FLOAT_CONST {$node = new Constant(Float.parseFloat($FLOAT_CONST.text));}
	| STRING_CONST {$node = new Constant($STRING_CONST.text.substring(1, $STRING_CONST.text.length() - 1));
		}
	| BOOL_CONST {$node = new Constant(Boolean.parseBoolean($BOOL_CONST.text));}
	| NULL {$node = null;};

comment:
	LINE_COMMENT
	| MULTILINE_COMMENT;

DATA_TYPE: INT | FLOAT | BOOLEAN | STRING | VOID;

EQUALITY_OPERATORS: EQUALS | NOT_EQUALS;

ARITMETICAL_OPERATORS: PLUS | MINUS | MULTIPLY | DIVIDE;

COMPARISON_OPERATORS:
	LESS_THAN
	| GREATER_THAN
	| LESS_EQUAL
	| GREATER_EQUAL;

CLASS: 'igreja';
EXTENDS: 'estende';
IMPLEMENTS: 'implementa';
INTERFACE: 'feFaz';
METHOD: 'obraDoSenhor';
NEW: 'nova';
PACKAGE: 'alma';
CONSTRUCTOR: 'fundacao';
IMPORT: 'arrebatandoDa';

THIS: 'nestaIgreja';

INPUT: 'responda';
PRINT: 'pregue';
RETURN: 'amem';

WHILE: 'enquantoDeusQuiser';

IF: 'seDeusQuiser';
ELSE: 'seDeusNaoQuiserEntao';
ELSEIF: 'seDeusNaoQuiserTente';

BOOLEAN: 'consciencia';
BOOL_TRUE: 'anjo';
BOOL_FALSE: 'demonio';
FLOAT: 'asas';
INT: 'pes';
STRING: 'gloria';
VOID: 'qualquer';
NULL: 'limbo';

ASSIGN: '=';
DIVIDE: '/';
MINUS: '-';
MULTIPLY: '*';
PLUS: '+';

EQUALS: '==';
GREATER_EQUAL: '>=';
GREATER_THAN: '>';
LESS_EQUAL: '<=';
LESS_THAN: '<';
NOT_EQUALS: '!=';

AND: '&&';
NOT: '!';
OR: '||';

COMMA: ',';
DOT: '.';
SEMICOLON: ';';

LBRACE: '{';
RBRACE: '}';
LPAREN: '(';
RPAREN: ')';
LBRACKET: '[';
RBRACKET: ']';

LINE_COMMENT: '//' ~[\r\n]* -> skip;

MULTILINE_COMMENT: '/*' .*? '*/' -> skip;

BOOL_CONST: BOOL_TRUE | BOOL_FALSE;
FLOAT_CONST: [0-9]+ '.' [0-9]+;
ID: [a-zA-Z]+;
INT_CONST: [0-9]+;
STRING_CONST: '"' (~["\r\n] | '\\"')* '"';
WS: [ \t\r\n]+ -> skip;
