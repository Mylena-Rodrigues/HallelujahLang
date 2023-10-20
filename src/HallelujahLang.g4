grammar HallelujahLang;

// Reserved Keywords
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

// Symbols
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

//Comments
LINE_COMMENT: '//' ~[\r\n]* -> skip;

MULTILINE_COMMENT: '/*' .*? '*/' -> skip;

// Other Tokens
BOOL_CONST: BOOL_TRUE | BOOL_FALSE;
FLOAT_CONST: [0-9]+ '.' [0-9]+;
ID: [a-zA-Z]+;
INT_CONST: [0-9]+;
STRING_CONST: '"' (~["\r\n] | '\\"')* '"';
WS: [ \t\r\n]+ -> skip; // Ignore whitespace

// Automaton Token Rules
program: (package_declaration)? (
		class_declaration
		| interface_declaration
		| package_import
		| LINE_COMMENT
		| MULTILINE_COMMENT
	)* EOF;

package_declaration: PACKAGE ID SEMICOLON;
package_import: IMPORT ID DOT ID SEMICOLON;

class_declaration:
	CLASS ID (EXTENDS ID)? (IMPLEMENTS ID (COMMA ID)*)? LBRACE class_body RBRACE;

class_body: (
		field_declaration
		| array_declaration
	    | print_statement
	    | input_statement
		| if_statement
        | while_statement
		| method_declaration
		| class_instance
		| class_method_call SEMICOLON
		| this_class_method_call SEMICOLON
		| constructor_declaration
		| LINE_COMMENT
		| MULTILINE_COMMENT
	)*;

class_instance: data_type ID ASSIGN NEW ID LPAREN arguments RPAREN SEMICOLON;

field_declaration:
	data_type ID (SEMICOLON | ASSIGN expression (LBRACKET expression RBRACKET)? SEMICOLON);

method_declaration:
	data_type METHOD ID LPAREN parameters RPAREN block;

parameters: parameter (COMMA parameter)* | WS?;

parameter: data_type ID;

block: LBRACE statement* RBRACE;

statement:
	assignment_statement
	| if_statement
	| while_statement
	| return_statement
	| method_call
	| method_call_statement
	| class_method_call SEMICOLON
	| print_statement
	| input_statement
	| array_access
	| array_declaration
	| class_instance
	| this_class_method_call SEMICOLON
	| LINE_COMMENT
	| MULTILINE_COMMENT
	| expression SEMICOLON;

assignment_statement:
	ID ASSIGN expression SEMICOLON
	| data_type ID ASSIGN expression SEMICOLON
	| array_initializer;

if_statement: IF LPAREN expression RPAREN block (elseif_statement)*? (ELSE block)?;

elseif_statement: ELSEIF LPAREN expression RPAREN block;

while_statement: WHILE LPAREN expression RPAREN block;

return_statement: RETURN print SEMICOLON;

print: (STRING_CONST | ID | expression | this_class_method_call) (PLUS (STRING_CONST | ID | expression | this_class_method_call))*?;

method_call_statement: ID LPAREN arguments RPAREN;

class_method_call: ID DOT ID LPAREN arguments RPAREN;

this_class_method_call: THIS DOT ID (LPAREN arguments RPAREN)?;

print_statement:
	PRINT LPAREN print | class_method_call? RPAREN SEMICOLON;

input_statement: INPUT LPAREN ID RPAREN SEMICOLON;

interface_declaration:
	INTERFACE ID LBRACE interface_body RBRACE;

interface_body: (method_declaration | method_call_statement SEMICOLON | (data_type method_call_statement SEMICOLON))*;

arguments: (expression (COMMA expression)*)?;

expression:
	expression (
		PLUS
		| MINUS
		| MULTIPLY
		| DIVIDE
		| EQUALS
		| NOT_EQUALS
		| LESS_THAN
		| GREATER_THAN
		| LESS_EQUAL
		| GREATER_EQUAL
		| AND
		| OR
	) expression
	| NOT expression
	| ID
	| INT_CONST
	| FLOAT_CONST
	| STRING_CONST
	| BOOL_CONST
	| NULL
	| class_method_call
	| array_initializer
	| ID array_initializer
	| method_call_statement
	| this_class_method_call;

array_initializer: LBRACKET arguments (LBRACKET arguments RBRACKET)*? RBRACKET;

array_access: ID LBRACKET expression RBRACKET;

method_call: METHOD ID LPAREN arguments RPAREN block;

data_type: (INT | FLOAT | BOOLEAN | STRING | VOID );

array_declaration:
	data_type array_initializer (array_initializer)? ID (SEMICOLON | ASSIGN ID? array_initializer SEMICOLON);

constructor_declaration: CONSTRUCTOR LPAREN arguments RPAREN LBRACE constructor_body RBRACE;
constructor_fields_declaration: data_type THIS DOT ID ASSIGN expression SEMICOLON;
constructor_body: constructor_fields_declaration*;
