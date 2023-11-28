// Generated from /home/me/2.study/faculdade/hallelujahLang/src/HallelujahLang.g4 by ANTLR 4.13.1
 
	import java.util.Map;
	import java.util.HashMap;
	import java.util.List;
	import java.util.ArrayList;
	import com.mylanguage.simple.ast.*;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class HallelujahLangParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		CLASS=1, EXTENDS=2, IMPLEMENTS=3, INTERFACE=4, METHOD=5, NEW=6, PACKAGE=7, 
		CONSTRUCTOR=8, IMPORT=9, THIS=10, INPUT=11, PRINT=12, RETURN=13, WHILE=14, 
		IF=15, ELSE=16, ELSEIF=17, BOOLEAN=18, BOOL_TRUE=19, BOOL_FALSE=20, FLOAT=21, 
		INT=22, STRING=23, VOID=24, NULL=25, ASSIGN=26, DIVIDE=27, MINUS=28, MULTIPLY=29, 
		PLUS=30, EQUALS=31, GREATER_EQUAL=32, GREATER_THAN=33, LESS_EQUAL=34, 
		LESS_THAN=35, NOT_EQUALS=36, AND=37, NOT=38, OR=39, COMMA=40, DOT=41, 
		SEMICOLON=42, LBRACE=43, RBRACE=44, LPAREN=45, RPAREN=46, LBRACKET=47, 
		RBRACKET=48, LINE_COMMENT=49, MULTILINE_COMMENT=50, BOOL_CONST=51, FLOAT_CONST=52, 
		ID=53, INT_CONST=54, STRING_CONST=55, WS=56;
	public static final int
		RULE_program = 0, RULE_package_declaration = 1, RULE_package_import = 2, 
		RULE_class_declaration = 3, RULE_class_body = 4, RULE_class_instance = 5, 
		RULE_variable_declaration = 6, RULE_variable_assignment = 7, RULE_variable_reference = 8, 
		RULE_variable_statement = 9, RULE_parameters = 10, RULE_parameter = 11, 
		RULE_block = 12, RULE_statement = 13, RULE_assignment_statement = 14, 
		RULE_if_statement = 15, RULE_elseif_statement = 16, RULE_while_statement = 17, 
		RULE_return_statement = 18, RULE_method_declaration = 19, RULE_method_call = 20, 
		RULE_method_call_class = 21, RULE_method_call_this_class = 22, RULE_print = 23, 
		RULE_print_statement = 24, RULE_input_statement = 25, RULE_interface_declaration = 26, 
		RULE_interface_body = 27, RULE_arguments = 28, RULE_array_initializer = 29, 
		RULE_array_access = 30, RULE_array_declaration = 31, RULE_constructor_declaration = 32, 
		RULE_constructor_fields_declaration = 33, RULE_constructor_body = 34, 
		RULE_binary_operator = 35, RULE_aritmetical_operators = 36, RULE_aritmetical_expression = 37, 
		RULE_comparation_operators = 38, RULE_expression = 39, RULE_binary_operation = 40, 
		RULE_operand = 41, RULE_logical_not_expression = 42, RULE_callings = 43, 
		RULE_value = 44, RULE_data_type = 45, RULE_comment = 46;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "package_declaration", "package_import", "class_declaration", 
			"class_body", "class_instance", "variable_declaration", "variable_assignment", 
			"variable_reference", "variable_statement", "parameters", "parameter", 
			"block", "statement", "assignment_statement", "if_statement", "elseif_statement", 
			"while_statement", "return_statement", "method_declaration", "method_call", 
			"method_call_class", "method_call_this_class", "print", "print_statement", 
			"input_statement", "interface_declaration", "interface_body", "arguments", 
			"array_initializer", "array_access", "array_declaration", "constructor_declaration", 
			"constructor_fields_declaration", "constructor_body", "binary_operator", 
			"aritmetical_operators", "aritmetical_expression", "comparation_operators", 
			"expression", "binary_operation", "operand", "logical_not_expression", 
			"callings", "value", "data_type", "comment"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'igreja'", "'estende'", "'implementa'", "'feFaz'", "'obraDoSenhor'", 
			"'nova'", "'alma'", "'fundacao'", "'arrebatandoDa'", "'nestaIgreja'", 
			"'responda'", "'pregue'", "'amem'", "'enquantoDeusQuiser'", "'seDeusQuiser'", 
			"'seDeusNaoQuiserEntao'", "'seDeusNaoQuiserTente'", "'consciencia'", 
			"'anjo'", "'demonio'", "'asas'", "'pes'", "'gloria'", "'qualquer'", "'limbo'", 
			"'='", "'/'", "'-'", "'*'", "'+'", "'=='", "'>='", "'>'", "'<='", "'<'", 
			"'!='", "'&&'", "'!'", "'||'", "','", "'.'", "';'", "'{'", "'}'", "'('", 
			"')'", "'['", "']'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "CLASS", "EXTENDS", "IMPLEMENTS", "INTERFACE", "METHOD", "NEW", 
			"PACKAGE", "CONSTRUCTOR", "IMPORT", "THIS", "INPUT", "PRINT", "RETURN", 
			"WHILE", "IF", "ELSE", "ELSEIF", "BOOLEAN", "BOOL_TRUE", "BOOL_FALSE", 
			"FLOAT", "INT", "STRING", "VOID", "NULL", "ASSIGN", "DIVIDE", "MINUS", 
			"MULTIPLY", "PLUS", "EQUALS", "GREATER_EQUAL", "GREATER_THAN", "LESS_EQUAL", 
			"LESS_THAN", "NOT_EQUALS", "AND", "NOT", "OR", "COMMA", "DOT", "SEMICOLON", 
			"LBRACE", "RBRACE", "LPAREN", "RPAREN", "LBRACKET", "RBRACKET", "LINE_COMMENT", 
			"MULTILINE_COMMENT", "BOOL_CONST", "FLOAT_CONST", "ID", "INT_CONST", 
			"STRING_CONST", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "HallelujahLang.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


		Map<String, Object> symbolTable = new HashMap<String, Object>();

	public HallelujahLangParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(HallelujahLangParser.EOF, 0); }
		public Package_declarationContext package_declaration() {
			return getRuleContext(Package_declarationContext.class,0);
		}
		public List<Class_declarationContext> class_declaration() {
			return getRuleContexts(Class_declarationContext.class);
		}
		public Class_declarationContext class_declaration(int i) {
			return getRuleContext(Class_declarationContext.class,i);
		}
		public List<Interface_declarationContext> interface_declaration() {
			return getRuleContexts(Interface_declarationContext.class);
		}
		public Interface_declarationContext interface_declaration(int i) {
			return getRuleContext(Interface_declarationContext.class,i);
		}
		public List<Package_importContext> package_import() {
			return getRuleContexts(Package_importContext.class);
		}
		public Package_importContext package_import(int i) {
			return getRuleContext(Package_importContext.class,i);
		}
		public List<TerminalNode> LINE_COMMENT() { return getTokens(HallelujahLangParser.LINE_COMMENT); }
		public TerminalNode LINE_COMMENT(int i) {
			return getToken(HallelujahLangParser.LINE_COMMENT, i);
		}
		public List<TerminalNode> MULTILINE_COMMENT() { return getTokens(HallelujahLangParser.MULTILINE_COMMENT); }
		public TerminalNode MULTILINE_COMMENT(int i) {
			return getToken(HallelujahLangParser.MULTILINE_COMMENT, i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PACKAGE) {
				{
				setState(94);
				package_declaration();
				}
			}

			setState(104);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1688849860264466L) != 0)) {
				{
				setState(102);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CLASS:
					{
					setState(97);
					class_declaration();
					}
					break;
				case INTERFACE:
					{
					setState(98);
					interface_declaration();
					}
					break;
				case IMPORT:
					{
					setState(99);
					package_import();
					}
					break;
				case LINE_COMMENT:
					{
					setState(100);
					match(LINE_COMMENT);
					}
					break;
				case MULTILINE_COMMENT:
					{
					setState(101);
					match(MULTILINE_COMMENT);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(106);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(107);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Package_declarationContext extends ParserRuleContext {
		public TerminalNode PACKAGE() { return getToken(HallelujahLangParser.PACKAGE, 0); }
		public TerminalNode ID() { return getToken(HallelujahLangParser.ID, 0); }
		public TerminalNode SEMICOLON() { return getToken(HallelujahLangParser.SEMICOLON, 0); }
		public Package_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_package_declaration; }
	}

	public final Package_declarationContext package_declaration() throws RecognitionException {
		Package_declarationContext _localctx = new Package_declarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_package_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			match(PACKAGE);
			setState(110);
			match(ID);
			setState(111);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Package_importContext extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(HallelujahLangParser.IMPORT, 0); }
		public List<TerminalNode> ID() { return getTokens(HallelujahLangParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(HallelujahLangParser.ID, i);
		}
		public TerminalNode DOT() { return getToken(HallelujahLangParser.DOT, 0); }
		public TerminalNode SEMICOLON() { return getToken(HallelujahLangParser.SEMICOLON, 0); }
		public Package_importContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_package_import; }
	}

	public final Package_importContext package_import() throws RecognitionException {
		Package_importContext _localctx = new Package_importContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_package_import);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			match(IMPORT);
			setState(114);
			match(ID);
			setState(115);
			match(DOT);
			setState(116);
			match(ID);
			setState(117);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Class_declarationContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(HallelujahLangParser.CLASS, 0); }
		public List<TerminalNode> ID() { return getTokens(HallelujahLangParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(HallelujahLangParser.ID, i);
		}
		public TerminalNode LBRACE() { return getToken(HallelujahLangParser.LBRACE, 0); }
		public Class_bodyContext class_body() {
			return getRuleContext(Class_bodyContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(HallelujahLangParser.RBRACE, 0); }
		public TerminalNode EXTENDS() { return getToken(HallelujahLangParser.EXTENDS, 0); }
		public TerminalNode IMPLEMENTS() { return getToken(HallelujahLangParser.IMPLEMENTS, 0); }
		public List<TerminalNode> COMMA() { return getTokens(HallelujahLangParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(HallelujahLangParser.COMMA, i);
		}
		public Class_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_declaration; }
	}

	public final Class_declarationContext class_declaration() throws RecognitionException {
		Class_declarationContext _localctx = new Class_declarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_class_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			match(CLASS);
			setState(120);
			match(ID);
			setState(123);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(121);
				match(EXTENDS);
				setState(122);
				match(ID);
				}
			}

			setState(134);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS) {
				{
				setState(125);
				match(IMPLEMENTS);
				setState(126);
				match(ID);
				setState(131);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(127);
					match(COMMA);
					setState(128);
					match(ID);
					}
					}
					setState(133);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(136);
			match(LBRACE);
			setState(137);
			class_body();
			setState(138);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Class_bodyContext extends ParserRuleContext {
		public ASTNode node;
		public If_statementContext if_statement;
		public While_statementContext while_statement;
		public Method_declarationContext method_declaration;
		public List<Variable_statementContext> variable_statement() {
			return getRuleContexts(Variable_statementContext.class);
		}
		public Variable_statementContext variable_statement(int i) {
			return getRuleContext(Variable_statementContext.class,i);
		}
		public List<Array_declarationContext> array_declaration() {
			return getRuleContexts(Array_declarationContext.class);
		}
		public Array_declarationContext array_declaration(int i) {
			return getRuleContext(Array_declarationContext.class,i);
		}
		public List<Print_statementContext> print_statement() {
			return getRuleContexts(Print_statementContext.class);
		}
		public Print_statementContext print_statement(int i) {
			return getRuleContext(Print_statementContext.class,i);
		}
		public List<Input_statementContext> input_statement() {
			return getRuleContexts(Input_statementContext.class);
		}
		public Input_statementContext input_statement(int i) {
			return getRuleContext(Input_statementContext.class,i);
		}
		public List<If_statementContext> if_statement() {
			return getRuleContexts(If_statementContext.class);
		}
		public If_statementContext if_statement(int i) {
			return getRuleContext(If_statementContext.class,i);
		}
		public List<While_statementContext> while_statement() {
			return getRuleContexts(While_statementContext.class);
		}
		public While_statementContext while_statement(int i) {
			return getRuleContext(While_statementContext.class,i);
		}
		public List<Class_instanceContext> class_instance() {
			return getRuleContexts(Class_instanceContext.class);
		}
		public Class_instanceContext class_instance(int i) {
			return getRuleContext(Class_instanceContext.class,i);
		}
		public List<Method_declarationContext> method_declaration() {
			return getRuleContexts(Method_declarationContext.class);
		}
		public Method_declarationContext method_declaration(int i) {
			return getRuleContext(Method_declarationContext.class,i);
		}
		public List<Method_call_classContext> method_call_class() {
			return getRuleContexts(Method_call_classContext.class);
		}
		public Method_call_classContext method_call_class(int i) {
			return getRuleContext(Method_call_classContext.class,i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(HallelujahLangParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(HallelujahLangParser.SEMICOLON, i);
		}
		public List<Method_call_this_classContext> method_call_this_class() {
			return getRuleContexts(Method_call_this_classContext.class);
		}
		public Method_call_this_classContext method_call_this_class(int i) {
			return getRuleContext(Method_call_this_classContext.class,i);
		}
		public List<Constructor_declarationContext> constructor_declaration() {
			return getRuleContexts(Constructor_declarationContext.class);
		}
		public Constructor_declarationContext constructor_declaration(int i) {
			return getRuleContext(Constructor_declarationContext.class,i);
		}
		public List<CommentContext> comment() {
			return getRuleContexts(CommentContext.class);
		}
		public CommentContext comment(int i) {
			return getRuleContext(CommentContext.class,i);
		}
		public Class_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_body; }
	}

	public final Class_bodyContext class_body() throws RecognitionException {
		Class_bodyContext _localctx = new Class_bodyContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_class_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 10696049146780928L) != 0)) {
				{
				setState(162);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(140);
					variable_statement();
					}
					break;
				case 2:
					{
					setState(141);
					array_declaration();
					}
					break;
				case 3:
					{
					setState(142);
					print_statement();
					}
					break;
				case 4:
					{
					setState(143);
					input_statement();
					}
					break;
				case 5:
					{
					setState(144);
					((Class_bodyContext)_localctx).if_statement = if_statement();
					((Class_bodyContext)_localctx).node =  ((Class_bodyContext)_localctx).if_statement.node;
					}
					break;
				case 6:
					{
					setState(147);
					((Class_bodyContext)_localctx).while_statement = while_statement();
					((Class_bodyContext)_localctx).node =  ((Class_bodyContext)_localctx).while_statement.node;
					}
					break;
				case 7:
					{
					setState(150);
					class_instance();
					}
					break;
				case 8:
					{
					setState(151);
					((Class_bodyContext)_localctx).method_declaration = method_declaration();
					((Class_bodyContext)_localctx).node =  ((Class_bodyContext)_localctx).method_declaration.node;
					}
					break;
				case 9:
					{
					setState(154);
					method_call_class();
					setState(155);
					match(SEMICOLON);
					}
					break;
				case 10:
					{
					setState(157);
					method_call_this_class();
					setState(158);
					match(SEMICOLON);
					}
					break;
				case 11:
					{
					setState(160);
					constructor_declaration();
					}
					break;
				case 12:
					{
					setState(161);
					comment();
					}
					break;
				}
				}
				setState(166);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Class_instanceContext extends ParserRuleContext {
		public Data_typeContext data_type() {
			return getRuleContext(Data_typeContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(HallelujahLangParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(HallelujahLangParser.ID, i);
		}
		public TerminalNode ASSIGN() { return getToken(HallelujahLangParser.ASSIGN, 0); }
		public TerminalNode NEW() { return getToken(HallelujahLangParser.NEW, 0); }
		public TerminalNode LPAREN() { return getToken(HallelujahLangParser.LPAREN, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(HallelujahLangParser.RPAREN, 0); }
		public TerminalNode SEMICOLON() { return getToken(HallelujahLangParser.SEMICOLON, 0); }
		public Class_instanceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_instance; }
	}

	public final Class_instanceContext class_instance() throws RecognitionException {
		Class_instanceContext _localctx = new Class_instanceContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_class_instance);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			data_type();
			setState(168);
			match(ID);
			setState(169);
			match(ASSIGN);
			setState(170);
			match(NEW);
			setState(171);
			match(ID);
			setState(172);
			match(LPAREN);
			setState(173);
			arguments();
			setState(174);
			match(RPAREN);
			setState(175);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Variable_declarationContext extends ParserRuleContext {
		public ASTNode node;
		public Data_typeContext data_type;
		public Token ID;
		public ExpressionContext expression;
		public Data_typeContext data_type() {
			return getRuleContext(Data_typeContext.class,0);
		}
		public TerminalNode ID() { return getToken(HallelujahLangParser.ID, 0); }
		public TerminalNode SEMICOLON() { return getToken(HallelujahLangParser.SEMICOLON, 0); }
		public TerminalNode ASSIGN() { return getToken(HallelujahLangParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Variable_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_declaration; }
	}

	public final Variable_declarationContext variable_declaration() throws RecognitionException {
		Variable_declarationContext _localctx = new Variable_declarationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_variable_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			((Variable_declarationContext)_localctx).data_type = data_type();
			setState(178);
			((Variable_declarationContext)_localctx).ID = match(ID);
			setState(181);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(179);
				match(ASSIGN);
				setState(180);
				((Variable_declarationContext)_localctx).expression = expression();
				}
			}

			setState(183);
			match(SEMICOLON);
			((Variable_declarationContext)_localctx).node =  new VarDeclaration( (((Variable_declarationContext)_localctx).data_type!=null?_input.getText(((Variable_declarationContext)_localctx).data_type.start,((Variable_declarationContext)_localctx).data_type.stop):null), (((Variable_declarationContext)_localctx).ID!=null?((Variable_declarationContext)_localctx).ID.getText():null), ((Variable_declarationContext)_localctx).expression.node);
					
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Variable_assignmentContext extends ParserRuleContext {
		public ASTNode node;
		public Token ID;
		public ExpressionContext expression;
		public TerminalNode ID() { return getToken(HallelujahLangParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(HallelujahLangParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(HallelujahLangParser.SEMICOLON, 0); }
		public Variable_assignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_assignment; }
	}

	public final Variable_assignmentContext variable_assignment() throws RecognitionException {
		Variable_assignmentContext _localctx = new Variable_assignmentContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_variable_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			((Variable_assignmentContext)_localctx).ID = match(ID);
			setState(187);
			match(ASSIGN);
			setState(188);
			((Variable_assignmentContext)_localctx).expression = expression();
			setState(189);
			match(SEMICOLON);
			((Variable_assignmentContext)_localctx).node =  new VariableAssignment( (((Variable_assignmentContext)_localctx).ID!=null?((Variable_assignmentContext)_localctx).ID.getText():null), ((Variable_assignmentContext)_localctx).expression.node);
					
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Variable_referenceContext extends ParserRuleContext {
		public ASTNode node;
		public Token ID;
		public TerminalNode ID() { return getToken(HallelujahLangParser.ID, 0); }
		public Variable_referenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_reference; }
	}

	public final Variable_referenceContext variable_reference() throws RecognitionException {
		Variable_referenceContext _localctx = new Variable_referenceContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_variable_reference);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			((Variable_referenceContext)_localctx).ID = match(ID);
			_localctx.node = new VariableReference( (((Variable_referenceContext)_localctx).ID!=null?((Variable_referenceContext)_localctx).ID.getText():null))
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Variable_statementContext extends ParserRuleContext {
		public ASTNode node;
		public Variable_declarationContext variable_declaration;
		public Variable_assignmentContext variable_assignment;
		public Variable_referenceContext variable_reference;
		public Variable_declarationContext variable_declaration() {
			return getRuleContext(Variable_declarationContext.class,0);
		}
		public Variable_assignmentContext variable_assignment() {
			return getRuleContext(Variable_assignmentContext.class,0);
		}
		public Variable_referenceContext variable_reference() {
			return getRuleContext(Variable_referenceContext.class,0);
		}
		public Variable_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_statement; }
	}

	public final Variable_statementContext variable_statement() throws RecognitionException {
		Variable_statementContext _localctx = new Variable_statementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_variable_statement);
		try {
			setState(204);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(195);
				((Variable_statementContext)_localctx).variable_declaration = variable_declaration();
				_localctx.node = ((Variable_statementContext)_localctx).variable_declaration.node
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(198);
				((Variable_statementContext)_localctx).variable_assignment = variable_assignment();
				_localctx.node = ((Variable_statementContext)_localctx).variable_assignment.node
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(201);
				((Variable_statementContext)_localctx).variable_reference = variable_reference();
				_localctx.node = ((Variable_statementContext)_localctx).variable_reference.node
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParametersContext extends ParserRuleContext {
		public List<Parameter> list;
		public ParameterContext p;
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(HallelujahLangParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(HallelujahLangParser.COMMA, i);
		}
		public ParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameters; }
	}

	public final ParametersContext parameters() throws RecognitionException {
		ParametersContext _localctx = new ParametersContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_parameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			List<Parameter> params = new ArrayList<Parameter>();
			{
			setState(207);
			((ParametersContext)_localctx).p = parameter();
			params.add(((ParametersContext)_localctx).p.param);
			setState(215);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(209);
				match(COMMA);
				setState(210);
				((ParametersContext)_localctx).p = parameter();
				params.add(((ParametersContext)_localctx).p.param);
				}
				}
				setState(217);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			((ParametersContext)_localctx).list =  params;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParameterContext extends ParserRuleContext {
		public Parameter param;
		public Data_typeContext data_type;
		public Token ID;
		public Data_typeContext data_type() {
			return getRuleContext(Data_typeContext.class,0);
		}
		public TerminalNode ID() { return getToken(HallelujahLangParser.ID, 0); }
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_parameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
			((ParameterContext)_localctx).data_type = data_type();
			setState(221);
			((ParameterContext)_localctx).ID = match(ID);
			((ParameterContext)_localctx).param =  new Parameter((((ParameterContext)_localctx).data_type!=null?_input.getText(((ParameterContext)_localctx).data_type.start,((ParameterContext)_localctx).data_type.stop):null), (((ParameterContext)_localctx).ID!=null?((ParameterContext)_localctx).ID.getText():null));
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BlockContext extends ParserRuleContext {
		public ASTNode node;
		public StatementContext sttnt;
		public TerminalNode LBRACE() { return getToken(HallelujahLangParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(HallelujahLangParser.RBRACE, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			match(LBRACE);
			setState(230);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 71635656516107264L) != 0)) {
				{
				{
				setState(225);
				((BlockContext)_localctx).sttnt = statement();
				body.add(((BlockContext)_localctx).sttnt.node);
				}
				}
				setState(232);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(233);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public ASTNode node;
		public If_statementContext if_statement;
		public While_statementContext while_statement;
		public Method_callContext method_call;
		public Assignment_statementContext assignment_statement() {
			return getRuleContext(Assignment_statementContext.class,0);
		}
		public If_statementContext if_statement() {
			return getRuleContext(If_statementContext.class,0);
		}
		public While_statementContext while_statement() {
			return getRuleContext(While_statementContext.class,0);
		}
		public Return_statementContext return_statement() {
			return getRuleContext(Return_statementContext.class,0);
		}
		public Method_callContext method_call() {
			return getRuleContext(Method_callContext.class,0);
		}
		public Method_call_classContext method_call_class() {
			return getRuleContext(Method_call_classContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(HallelujahLangParser.SEMICOLON, 0); }
		public Print_statementContext print_statement() {
			return getRuleContext(Print_statementContext.class,0);
		}
		public Input_statementContext input_statement() {
			return getRuleContext(Input_statementContext.class,0);
		}
		public Array_accessContext array_access() {
			return getRuleContext(Array_accessContext.class,0);
		}
		public Array_declarationContext array_declaration() {
			return getRuleContext(Array_declarationContext.class,0);
		}
		public Class_instanceContext class_instance() {
			return getRuleContext(Class_instanceContext.class,0);
		}
		public Method_call_this_classContext method_call_this_class() {
			return getRuleContext(Method_call_this_classContext.class,0);
		}
		public CommentContext comment() {
			return getRuleContext(CommentContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_statement);
		try {
			setState(261);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(235);
				assignment_statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(236);
				((StatementContext)_localctx).if_statement = if_statement();
				((StatementContext)_localctx).node =  ((StatementContext)_localctx).if_statement.node;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(239);
				((StatementContext)_localctx).while_statement = while_statement();
				((StatementContext)_localctx).node =  ((StatementContext)_localctx).while_statement.node;
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(242);
				return_statement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(243);
				((StatementContext)_localctx).method_call = method_call();
				((StatementContext)_localctx).node =  ((StatementContext)_localctx).method_call.node;
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(246);
				method_call_class();
				setState(247);
				match(SEMICOLON);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(249);
				print_statement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(250);
				input_statement();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(251);
				array_access();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(252);
				array_declaration();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(253);
				class_instance();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(254);
				method_call_this_class();
				setState(255);
				match(SEMICOLON);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(257);
				comment();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(258);
				expression();
				setState(259);
				match(SEMICOLON);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Assignment_statementContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(HallelujahLangParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(HallelujahLangParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(HallelujahLangParser.SEMICOLON, 0); }
		public Data_typeContext data_type() {
			return getRuleContext(Data_typeContext.class,0);
		}
		public Array_initializerContext array_initializer() {
			return getRuleContext(Array_initializerContext.class,0);
		}
		public Assignment_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment_statement; }
	}

	public final Assignment_statementContext assignment_statement() throws RecognitionException {
		Assignment_statementContext _localctx = new Assignment_statementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_assignment_statement);
		try {
			setState(275);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(263);
				match(ID);
				setState(264);
				match(ASSIGN);
				setState(265);
				expression();
				setState(266);
				match(SEMICOLON);
				}
				break;
			case BOOLEAN:
			case FLOAT:
			case INT:
			case STRING:
			case VOID:
				enterOuterAlt(_localctx, 2);
				{
				setState(268);
				data_type();
				setState(269);
				match(ID);
				setState(270);
				match(ASSIGN);
				setState(271);
				expression();
				setState(272);
				match(SEMICOLON);
				}
				break;
			case LBRACKET:
				enterOuterAlt(_localctx, 3);
				{
				setState(274);
				array_initializer();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class If_statementContext extends ParserRuleContext {
		public ASTNode node;
		public ExpressionContext expression;
		public BlockContext block;
		public Elseif_statementContext elseif_statement;
		public TerminalNode IF() { return getToken(HallelujahLangParser.IF, 0); }
		public TerminalNode LPAREN() { return getToken(HallelujahLangParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(HallelujahLangParser.RPAREN, 0); }
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public List<Elseif_statementContext> elseif_statement() {
			return getRuleContexts(Elseif_statementContext.class);
		}
		public Elseif_statementContext elseif_statement(int i) {
			return getRuleContext(Elseif_statementContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(HallelujahLangParser.ELSE, 0); }
		public If_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_statement; }
	}

	public final If_statementContext if_statement() throws RecognitionException {
		If_statementContext _localctx = new If_statementContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_if_statement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
			match(IF);
			setState(278);
			match(LPAREN);
			setState(279);
			((If_statementContext)_localctx).expression = expression();
			setState(280);
			match(RPAREN);

					List<ASTNode> body = new ArrayList<ASTNode>();
				
			setState(282);
			((If_statementContext)_localctx).block = block();
			((If_statementContext)_localctx).node =  ((If_statementContext)_localctx).block.node;
			setState(289);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(284);
					((If_statementContext)_localctx).elseif_statement = elseif_statement();
					((If_statementContext)_localctx).node =  ((If_statementContext)_localctx).elseif_statement.node;
					}
					} 
				}
				setState(291);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			}
			setState(297);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(292);
				match(ELSE);

						List<ASTNode> elseBody = new ArrayList<ASTNode>();
					
				setState(294);
				((If_statementContext)_localctx).block = block();
				((If_statementContext)_localctx).node =  ((If_statementContext)_localctx).block.node;
				}
			}


					((If_statementContext)_localctx).node =  new If(((If_statementContext)_localctx).expression.node, body, elseBody);
				
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Elseif_statementContext extends ParserRuleContext {
		public ASTNode node;
		public ExpressionContext expression;
		public BlockContext block;
		public TerminalNode ELSEIF() { return getToken(HallelujahLangParser.ELSEIF, 0); }
		public TerminalNode LPAREN() { return getToken(HallelujahLangParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(HallelujahLangParser.RPAREN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Elseif_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseif_statement; }
	}

	public final Elseif_statementContext elseif_statement() throws RecognitionException {
		Elseif_statementContext _localctx = new Elseif_statementContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_elseif_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(301);
			match(ELSEIF);
			setState(302);
			match(LPAREN);
			setState(303);
			((Elseif_statementContext)_localctx).expression = expression();
			setState(304);
			match(RPAREN);

					List<ASTNode> body = new ArrayList<ASTNode>();
				
			setState(306);
			((Elseif_statementContext)_localctx).block = block();
			((Elseif_statementContext)_localctx).node =  ((Elseif_statementContext)_localctx).block.node;

					((Elseif_statementContext)_localctx).node =  new If(((Elseif_statementContext)_localctx).expression.node, body, elseBody);
				
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class While_statementContext extends ParserRuleContext {
		public ASTNode node;
		public ExpressionContext expression;
		public BlockContext block;
		public TerminalNode WHILE() { return getToken(HallelujahLangParser.WHILE, 0); }
		public TerminalNode LPAREN() { return getToken(HallelujahLangParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(HallelujahLangParser.RPAREN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public While_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_statement; }
	}

	public final While_statementContext while_statement() throws RecognitionException {
		While_statementContext _localctx = new While_statementContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_while_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(310);
			match(WHILE);
			setState(311);
			match(LPAREN);
			setState(312);
			((While_statementContext)_localctx).expression = expression();
			setState(313);
			match(RPAREN);

					List<ASTNode> body = new ArrayList<ASTNode>();
				
			setState(315);
			((While_statementContext)_localctx).block = block();
			((While_statementContext)_localctx).node =  ((While_statementContext)_localctx).block.node;

					((While_statementContext)_localctx).node =  new WhileLoop(((While_statementContext)_localctx).expression.node, body);
				
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Return_statementContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(HallelujahLangParser.RETURN, 0); }
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(HallelujahLangParser.SEMICOLON, 0); }
		public Return_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_statement; }
	}

	public final Return_statementContext return_statement() throws RecognitionException {
		Return_statementContext _localctx = new Return_statementContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_return_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(319);
			match(RETURN);
			setState(320);
			print();
			setState(321);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Method_declarationContext extends ParserRuleContext {
		public ASTNode node;
		public Data_typeContext data_type;
		public Token ID;
		public BlockContext block;
		public Data_typeContext data_type() {
			return getRuleContext(Data_typeContext.class,0);
		}
		public TerminalNode METHOD() { return getToken(HallelujahLangParser.METHOD, 0); }
		public TerminalNode ID() { return getToken(HallelujahLangParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(HallelujahLangParser.LPAREN, 0); }
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(HallelujahLangParser.RPAREN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Method_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_declaration; }
	}

	public final Method_declarationContext method_declaration() throws RecognitionException {
		Method_declarationContext _localctx = new Method_declarationContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_method_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(323);
			((Method_declarationContext)_localctx).data_type = data_type();
			setState(324);
			match(METHOD);
			setState(325);
			((Method_declarationContext)_localctx).ID = match(ID);
			setState(326);
			match(LPAREN);
			setState(327);
			parameters();
			setState(328);
			match(RPAREN);

					List<ASTNode> body = new ArrayList<ASTNode>();
					Map<String, Object> localSymbolTable = new HashMap<String, Object>();
				
			setState(330);
			((Method_declarationContext)_localctx).block = block();
			((Method_declarationContext)_localctx).node =  ((Method_declarationContext)_localctx).block.node;
			((Method_declarationContext)_localctx).node =  new MethodDeclaration((((Method_declarationContext)_localctx).data_type!=null?_input.getText(((Method_declarationContext)_localctx).data_type.start,((Method_declarationContext)_localctx).data_type.stop):null), (((Method_declarationContext)_localctx).ID!=null?((Method_declarationContext)_localctx).ID.getText():null), body, localSymbolTable);
					
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Method_callContext extends ParserRuleContext {
		public ASTNode node;
		public Token ID;
		public ArgumentsContext arguments;
		public TerminalNode ID() { return getToken(HallelujahLangParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(HallelujahLangParser.LPAREN, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(HallelujahLangParser.RPAREN, 0); }
		public Method_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_call; }
	}

	public final Method_callContext method_call() throws RecognitionException {
		Method_callContext _localctx = new Method_callContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_method_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(334);
			((Method_callContext)_localctx).ID = match(ID);
			setState(335);
			match(LPAREN);
			setState(336);
			((Method_callContext)_localctx).arguments = arguments();
			setState(337);
			match(RPAREN);
			((Method_callContext)_localctx).node =  new MethodCall((((Method_callContext)_localctx).ID!=null?((Method_callContext)_localctx).ID.getText():null), ((Method_callContext)_localctx).arguments.list);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Method_call_classContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(HallelujahLangParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(HallelujahLangParser.ID, i);
		}
		public TerminalNode DOT() { return getToken(HallelujahLangParser.DOT, 0); }
		public TerminalNode LPAREN() { return getToken(HallelujahLangParser.LPAREN, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(HallelujahLangParser.RPAREN, 0); }
		public Method_call_classContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_call_class; }
	}

	public final Method_call_classContext method_call_class() throws RecognitionException {
		Method_call_classContext _localctx = new Method_call_classContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_method_call_class);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(340);
			match(ID);
			setState(341);
			match(DOT);
			setState(342);
			match(ID);
			setState(343);
			match(LPAREN);
			setState(344);
			arguments();
			setState(345);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Method_call_this_classContext extends ParserRuleContext {
		public TerminalNode THIS() { return getToken(HallelujahLangParser.THIS, 0); }
		public TerminalNode DOT() { return getToken(HallelujahLangParser.DOT, 0); }
		public TerminalNode ID() { return getToken(HallelujahLangParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(HallelujahLangParser.LPAREN, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(HallelujahLangParser.RPAREN, 0); }
		public Method_call_this_classContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_call_this_class; }
	}

	public final Method_call_this_classContext method_call_this_class() throws RecognitionException {
		Method_call_this_classContext _localctx = new Method_call_this_classContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_method_call_this_class);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(347);
			match(THIS);
			setState(348);
			match(DOT);
			setState(349);
			match(ID);
			setState(354);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(350);
				match(LPAREN);
				setState(351);
				arguments();
				setState(352);
				match(RPAREN);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PrintContext extends ParserRuleContext {
		public ASTNode node;
		public ExpressionContext expression;
		public List<TerminalNode> PLUS() { return getTokens(HallelujahLangParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(HallelujahLangParser.PLUS, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_print);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(356);
			match(PLUS);
			setState(357);
			((PrintContext)_localctx).expression = expression();
			((PrintContext)_localctx).node =  new Print(((PrintContext)_localctx).expression.node);
			setState(365);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(359);
					match(PLUS);
					setState(360);
					((PrintContext)_localctx).expression = expression();
					((PrintContext)_localctx).node =  new Print(((PrintContext)_localctx).expression.node);
					}
					} 
				}
				setState(367);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			}
			setState(368);
			match(PLUS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Print_statementContext extends ParserRuleContext {
		public ASTNode node;
		public PrintContext print;
		public TerminalNode PRINT() { return getToken(HallelujahLangParser.PRINT, 0); }
		public TerminalNode LPAREN() { return getToken(HallelujahLangParser.LPAREN, 0); }
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(HallelujahLangParser.RPAREN, 0); }
		public TerminalNode SEMICOLON() { return getToken(HallelujahLangParser.SEMICOLON, 0); }
		public Print_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print_statement; }
	}

	public final Print_statementContext print_statement() throws RecognitionException {
		Print_statementContext _localctx = new Print_statementContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_print_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(370);
			match(PRINT);
			setState(371);
			match(LPAREN);
			setState(372);
			((Print_statementContext)_localctx).print = print();
			setState(373);
			match(RPAREN);
			setState(374);
			match(SEMICOLON);
			((Print_statementContext)_localctx).node =  new Print(((Print_statementContext)_localctx).print.node);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Input_statementContext extends ParserRuleContext {
		public ASTNode node;
		public Token ID;
		public TerminalNode INPUT() { return getToken(HallelujahLangParser.INPUT, 0); }
		public TerminalNode LPAREN() { return getToken(HallelujahLangParser.LPAREN, 0); }
		public TerminalNode ID() { return getToken(HallelujahLangParser.ID, 0); }
		public TerminalNode RPAREN() { return getToken(HallelujahLangParser.RPAREN, 0); }
		public TerminalNode SEMICOLON() { return getToken(HallelujahLangParser.SEMICOLON, 0); }
		public Input_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_input_statement; }
	}

	public final Input_statementContext input_statement() throws RecognitionException {
		Input_statementContext _localctx = new Input_statementContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_input_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(377);
			match(INPUT);
			setState(378);
			match(LPAREN);
			setState(379);
			((Input_statementContext)_localctx).ID = match(ID);
			setState(380);
			match(RPAREN);
			setState(381);
			match(SEMICOLON);
			((Input_statementContext)_localctx).node =  new Input((((Input_statementContext)_localctx).ID!=null?((Input_statementContext)_localctx).ID.getText():null));
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Interface_declarationContext extends ParserRuleContext {
		public TerminalNode INTERFACE() { return getToken(HallelujahLangParser.INTERFACE, 0); }
		public TerminalNode ID() { return getToken(HallelujahLangParser.ID, 0); }
		public TerminalNode LBRACE() { return getToken(HallelujahLangParser.LBRACE, 0); }
		public Interface_bodyContext interface_body() {
			return getRuleContext(Interface_bodyContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(HallelujahLangParser.RBRACE, 0); }
		public Interface_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interface_declaration; }
	}

	public final Interface_declarationContext interface_declaration() throws RecognitionException {
		Interface_declarationContext _localctx = new Interface_declarationContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_interface_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(384);
			match(INTERFACE);
			setState(385);
			match(ID);
			setState(386);
			match(LBRACE);
			setState(387);
			interface_body();
			setState(388);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Interface_bodyContext extends ParserRuleContext {
		public ASTNode node;
		public Method_declarationContext method_declaration;
		public List<Method_declarationContext> method_declaration() {
			return getRuleContexts(Method_declarationContext.class);
		}
		public Method_declarationContext method_declaration(int i) {
			return getRuleContext(Method_declarationContext.class,i);
		}
		public List<Data_typeContext> data_type() {
			return getRuleContexts(Data_typeContext.class);
		}
		public Data_typeContext data_type(int i) {
			return getRuleContext(Data_typeContext.class,i);
		}
		public List<Method_callContext> method_call() {
			return getRuleContexts(Method_callContext.class);
		}
		public Method_callContext method_call(int i) {
			return getRuleContext(Method_callContext.class,i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(HallelujahLangParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(HallelujahLangParser.SEMICOLON, i);
		}
		public Interface_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interface_body; }
	}

	public final Interface_bodyContext interface_body() throws RecognitionException {
		Interface_bodyContext _localctx = new Interface_bodyContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_interface_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(399);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 31719424L) != 0)) {
				{
				setState(397);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
				case 1:
					{
					setState(390);
					((Interface_bodyContext)_localctx).method_declaration = method_declaration();
					((Interface_bodyContext)_localctx).node =  ((Interface_bodyContext)_localctx).method_declaration.node;
					}
					break;
				case 2:
					{
					{
					setState(393);
					data_type();
					setState(394);
					method_call();
					setState(395);
					match(SEMICOLON);
					}
					}
					break;
				}
				}
				setState(401);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArgumentsContext extends ParserRuleContext {
		public List<ASTNode> list;
		public ExpressionContext e;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(HallelujahLangParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(HallelujahLangParser.COMMA, i);
		}
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			List<ASTNode> args = new ArrayList<ASTNode>();
			{
			setState(403);
			((ArgumentsContext)_localctx).e = expression();
			args.add(((ArgumentsContext)_localctx).e.node);
			setState(411);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(405);
				match(COMMA);
				setState(406);
				((ArgumentsContext)_localctx).e = expression();
				args.add(((ArgumentsContext)_localctx).e.node);
				}
				}
				setState(413);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			((ArgumentsContext)_localctx).list =  args;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Array_initializerContext extends ParserRuleContext {
		public List<TerminalNode> LBRACKET() { return getTokens(HallelujahLangParser.LBRACKET); }
		public TerminalNode LBRACKET(int i) {
			return getToken(HallelujahLangParser.LBRACKET, i);
		}
		public List<ArgumentsContext> arguments() {
			return getRuleContexts(ArgumentsContext.class);
		}
		public ArgumentsContext arguments(int i) {
			return getRuleContext(ArgumentsContext.class,i);
		}
		public List<TerminalNode> RBRACKET() { return getTokens(HallelujahLangParser.RBRACKET); }
		public TerminalNode RBRACKET(int i) {
			return getToken(HallelujahLangParser.RBRACKET, i);
		}
		public Array_initializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_initializer; }
	}

	public final Array_initializerContext array_initializer() throws RecognitionException {
		Array_initializerContext _localctx = new Array_initializerContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_array_initializer);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(416);
			match(LBRACKET);
			setState(417);
			arguments();
			setState(424);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(418);
					match(LBRACKET);
					setState(419);
					arguments();
					setState(420);
					match(RBRACKET);
					}
					} 
				}
				setState(426);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			}
			setState(427);
			match(RBRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Array_accessContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(HallelujahLangParser.ID, 0); }
		public TerminalNode LBRACKET() { return getToken(HallelujahLangParser.LBRACKET, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RBRACKET() { return getToken(HallelujahLangParser.RBRACKET, 0); }
		public Array_accessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_access; }
	}

	public final Array_accessContext array_access() throws RecognitionException {
		Array_accessContext _localctx = new Array_accessContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_array_access);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(429);
			match(ID);
			setState(430);
			match(LBRACKET);
			setState(431);
			expression();
			setState(432);
			match(RBRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Array_declarationContext extends ParserRuleContext {
		public Data_typeContext data_type() {
			return getRuleContext(Data_typeContext.class,0);
		}
		public List<Array_initializerContext> array_initializer() {
			return getRuleContexts(Array_initializerContext.class);
		}
		public Array_initializerContext array_initializer(int i) {
			return getRuleContext(Array_initializerContext.class,i);
		}
		public List<TerminalNode> ID() { return getTokens(HallelujahLangParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(HallelujahLangParser.ID, i);
		}
		public TerminalNode SEMICOLON() { return getToken(HallelujahLangParser.SEMICOLON, 0); }
		public TerminalNode ASSIGN() { return getToken(HallelujahLangParser.ASSIGN, 0); }
		public Array_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_declaration; }
	}

	public final Array_declarationContext array_declaration() throws RecognitionException {
		Array_declarationContext _localctx = new Array_declarationContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_array_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(434);
			data_type();
			setState(435);
			array_initializer();
			setState(437);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACKET) {
				{
				setState(436);
				array_initializer();
				}
			}

			setState(439);
			match(ID);
			setState(448);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SEMICOLON:
				{
				setState(440);
				match(SEMICOLON);
				}
				break;
			case ASSIGN:
				{
				setState(441);
				match(ASSIGN);
				setState(443);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(442);
					match(ID);
					}
				}

				setState(445);
				array_initializer();
				setState(446);
				match(SEMICOLON);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Constructor_declarationContext extends ParserRuleContext {
		public TerminalNode CONSTRUCTOR() { return getToken(HallelujahLangParser.CONSTRUCTOR, 0); }
		public TerminalNode LPAREN() { return getToken(HallelujahLangParser.LPAREN, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(HallelujahLangParser.RPAREN, 0); }
		public TerminalNode LBRACE() { return getToken(HallelujahLangParser.LBRACE, 0); }
		public Constructor_bodyContext constructor_body() {
			return getRuleContext(Constructor_bodyContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(HallelujahLangParser.RBRACE, 0); }
		public Constructor_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructor_declaration; }
	}

	public final Constructor_declarationContext constructor_declaration() throws RecognitionException {
		Constructor_declarationContext _localctx = new Constructor_declarationContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_constructor_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(450);
			match(CONSTRUCTOR);
			setState(451);
			match(LPAREN);
			setState(452);
			arguments();
			setState(453);
			match(RPAREN);
			setState(454);
			match(LBRACE);
			setState(455);
			constructor_body();
			setState(456);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Constructor_fields_declarationContext extends ParserRuleContext {
		public Data_typeContext data_type() {
			return getRuleContext(Data_typeContext.class,0);
		}
		public TerminalNode THIS() { return getToken(HallelujahLangParser.THIS, 0); }
		public TerminalNode DOT() { return getToken(HallelujahLangParser.DOT, 0); }
		public TerminalNode ID() { return getToken(HallelujahLangParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(HallelujahLangParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(HallelujahLangParser.SEMICOLON, 0); }
		public Constructor_fields_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructor_fields_declaration; }
	}

	public final Constructor_fields_declarationContext constructor_fields_declaration() throws RecognitionException {
		Constructor_fields_declarationContext _localctx = new Constructor_fields_declarationContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_constructor_fields_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(458);
			data_type();
			setState(459);
			match(THIS);
			setState(460);
			match(DOT);
			setState(461);
			match(ID);
			setState(462);
			match(ASSIGN);
			setState(463);
			expression();
			setState(464);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Constructor_bodyContext extends ParserRuleContext {
		public List<Constructor_fields_declarationContext> constructor_fields_declaration() {
			return getRuleContexts(Constructor_fields_declarationContext.class);
		}
		public Constructor_fields_declarationContext constructor_fields_declaration(int i) {
			return getRuleContext(Constructor_fields_declarationContext.class,i);
		}
		public Constructor_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructor_body; }
	}

	public final Constructor_bodyContext constructor_body() throws RecognitionException {
		Constructor_bodyContext _localctx = new Constructor_bodyContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_constructor_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(469);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 31719424L) != 0)) {
				{
				{
				setState(466);
				constructor_fields_declaration();
				}
				}
				setState(471);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Binary_operatorContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(HallelujahLangParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(HallelujahLangParser.MINUS, 0); }
		public TerminalNode MULTIPLY() { return getToken(HallelujahLangParser.MULTIPLY, 0); }
		public TerminalNode DIVIDE() { return getToken(HallelujahLangParser.DIVIDE, 0); }
		public TerminalNode EQUALS() { return getToken(HallelujahLangParser.EQUALS, 0); }
		public TerminalNode NOT_EQUALS() { return getToken(HallelujahLangParser.NOT_EQUALS, 0); }
		public TerminalNode LESS_THAN() { return getToken(HallelujahLangParser.LESS_THAN, 0); }
		public TerminalNode GREATER_THAN() { return getToken(HallelujahLangParser.GREATER_THAN, 0); }
		public TerminalNode LESS_EQUAL() { return getToken(HallelujahLangParser.LESS_EQUAL, 0); }
		public TerminalNode GREATER_EQUAL() { return getToken(HallelujahLangParser.GREATER_EQUAL, 0); }
		public TerminalNode AND() { return getToken(HallelujahLangParser.AND, 0); }
		public TerminalNode OR() { return getToken(HallelujahLangParser.OR, 0); }
		public Binary_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binary_operator; }
	}

	public final Binary_operatorContext binary_operator() throws RecognitionException {
		Binary_operatorContext _localctx = new Binary_operatorContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_binary_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(472);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 824499503104L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Aritmetical_operatorsContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(HallelujahLangParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(HallelujahLangParser.MINUS, 0); }
		public TerminalNode MULTIPLY() { return getToken(HallelujahLangParser.MULTIPLY, 0); }
		public TerminalNode DIVIDE() { return getToken(HallelujahLangParser.DIVIDE, 0); }
		public Aritmetical_operatorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aritmetical_operators; }
	}

	public final Aritmetical_operatorsContext aritmetical_operators() throws RecognitionException {
		Aritmetical_operatorsContext _localctx = new Aritmetical_operatorsContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_aritmetical_operators);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(474);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 2013265920L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Aritmetical_expressionContext extends ParserRuleContext {
		public List<OperandContext> operand() {
			return getRuleContexts(OperandContext.class);
		}
		public OperandContext operand(int i) {
			return getRuleContext(OperandContext.class,i);
		}
		public Aritmetical_operatorsContext aritmetical_operators() {
			return getRuleContext(Aritmetical_operatorsContext.class,0);
		}
		public Aritmetical_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aritmetical_expression; }
	}

	public final Aritmetical_expressionContext aritmetical_expression() throws RecognitionException {
		Aritmetical_expressionContext _localctx = new Aritmetical_expressionContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_aritmetical_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(476);
			operand();
			setState(477);
			aritmetical_operators();
			setState(478);
			operand();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Comparation_operatorsContext extends ParserRuleContext {
		public TerminalNode EQUALS() { return getToken(HallelujahLangParser.EQUALS, 0); }
		public TerminalNode NOT_EQUALS() { return getToken(HallelujahLangParser.NOT_EQUALS, 0); }
		public TerminalNode LESS_THAN() { return getToken(HallelujahLangParser.LESS_THAN, 0); }
		public TerminalNode GREATER_THAN() { return getToken(HallelujahLangParser.GREATER_THAN, 0); }
		public TerminalNode LESS_EQUAL() { return getToken(HallelujahLangParser.LESS_EQUAL, 0); }
		public TerminalNode GREATER_EQUAL() { return getToken(HallelujahLangParser.GREATER_EQUAL, 0); }
		public Comparation_operatorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparation_operators; }
	}

	public final Comparation_operatorsContext comparation_operators() throws RecognitionException {
		Comparation_operatorsContext _localctx = new Comparation_operatorsContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_comparation_operators);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(480);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 135291469824L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public ASTNode node;
		public Logical_not_expressionContext logical_not_expression;
		public ValueContext value;
		public CallingsContext callings;
		public Binary_operationContext binary_operation() {
			return getRuleContext(Binary_operationContext.class,0);
		}
		public Logical_not_expressionContext logical_not_expression() {
			return getRuleContext(Logical_not_expressionContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public CallingsContext callings() {
			return getRuleContext(CallingsContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_expression);
		try {
			setState(492);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(482);
				binary_operation();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(483);
				((ExpressionContext)_localctx).logical_not_expression = logical_not_expression();
				((ExpressionContext)_localctx).node =  ((ExpressionContext)_localctx).logical_not_expression.node;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(486);
				((ExpressionContext)_localctx).value = value();
				((ExpressionContext)_localctx).node =  ((ExpressionContext)_localctx).value.node;
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(489);
				((ExpressionContext)_localctx).callings = callings();
				((ExpressionContext)_localctx).node =  ((ExpressionContext)_localctx).callings.node;
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Binary_operationContext extends ParserRuleContext {
		public List<OperandContext> operand() {
			return getRuleContexts(OperandContext.class);
		}
		public OperandContext operand(int i) {
			return getRuleContext(OperandContext.class,i);
		}
		public Binary_operatorContext binary_operator() {
			return getRuleContext(Binary_operatorContext.class,0);
		}
		public Binary_operationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binary_operation; }
	}

	public final Binary_operationContext binary_operation() throws RecognitionException {
		Binary_operationContext _localctx = new Binary_operationContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_binary_operation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(494);
			operand();
			setState(495);
			binary_operator();
			setState(496);
			operand();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OperandContext extends ParserRuleContext {
		public ASTNode node;
		public Logical_not_expressionContext logical_not_expression;
		public ValueContext value;
		public CallingsContext callings;
		public Logical_not_expressionContext logical_not_expression() {
			return getRuleContext(Logical_not_expressionContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public CallingsContext callings() {
			return getRuleContext(CallingsContext.class,0);
		}
		public OperandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operand; }
	}

	public final OperandContext operand() throws RecognitionException {
		OperandContext _localctx = new OperandContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_operand);
		try {
			setState(507);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(498);
				((OperandContext)_localctx).logical_not_expression = logical_not_expression();
				((OperandContext)_localctx).node =  ((OperandContext)_localctx).logical_not_expression.node;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(501);
				((OperandContext)_localctx).value = value();
				((OperandContext)_localctx).node =  ((OperandContext)_localctx).value.node;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(504);
				((OperandContext)_localctx).callings = callings();
				((OperandContext)_localctx).node =  ((OperandContext)_localctx).callings.node;
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Logical_not_expressionContext extends ParserRuleContext {
		public ASTNode node;
		public ExpressionContext expression;
		public TerminalNode NOT() { return getToken(HallelujahLangParser.NOT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Logical_not_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logical_not_expression; }
	}

	public final Logical_not_expressionContext logical_not_expression() throws RecognitionException {
		Logical_not_expressionContext _localctx = new Logical_not_expressionContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_logical_not_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(509);
			match(NOT);
			setState(510);
			((Logical_not_expressionContext)_localctx).expression = expression();
			((Logical_not_expressionContext)_localctx).node =  new LogicalNot(((Logical_not_expressionContext)_localctx).expression.node);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CallingsContext extends ParserRuleContext {
		public ASTNode node;
		public Method_callContext method_call;
		public Method_call_classContext method_call_class() {
			return getRuleContext(Method_call_classContext.class,0);
		}
		public Array_initializerContext array_initializer() {
			return getRuleContext(Array_initializerContext.class,0);
		}
		public TerminalNode ID() { return getToken(HallelujahLangParser.ID, 0); }
		public Method_callContext method_call() {
			return getRuleContext(Method_callContext.class,0);
		}
		public Method_call_this_classContext method_call_this_class() {
			return getRuleContext(Method_call_this_classContext.class,0);
		}
		public CallingsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callings; }
	}

	public final CallingsContext callings() throws RecognitionException {
		CallingsContext _localctx = new CallingsContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_callings);
		try {
			setState(521);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(513);
				method_call_class();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(514);
				array_initializer();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(515);
				match(ID);
				setState(516);
				array_initializer();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(517);
				((CallingsContext)_localctx).method_call = method_call();
				((CallingsContext)_localctx).node =  ((CallingsContext)_localctx).method_call.node;
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(520);
				method_call_this_class();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ValueContext extends ParserRuleContext {
		public ASTNode node;
		public Token ID;
		public Token INT_CONST;
		public Token FLOAT_CONST;
		public Token STRING_CONST;
		public Token BOOL_CONST;
		public TerminalNode ID() { return getToken(HallelujahLangParser.ID, 0); }
		public TerminalNode INT_CONST() { return getToken(HallelujahLangParser.INT_CONST, 0); }
		public TerminalNode FLOAT_CONST() { return getToken(HallelujahLangParser.FLOAT_CONST, 0); }
		public TerminalNode STRING_CONST() { return getToken(HallelujahLangParser.STRING_CONST, 0); }
		public TerminalNode BOOL_CONST() { return getToken(HallelujahLangParser.BOOL_CONST, 0); }
		public TerminalNode NULL() { return getToken(HallelujahLangParser.NULL, 0); }
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_value);
		try {
			setState(535);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(523);
				((ValueContext)_localctx).ID = match(ID);
				((ValueContext)_localctx).node =  new VarRef((((ValueContext)_localctx).ID!=null?((ValueContext)_localctx).ID.getText():null));
				}
				break;
			case INT_CONST:
				enterOuterAlt(_localctx, 2);
				{
				setState(525);
				((ValueContext)_localctx).INT_CONST = match(INT_CONST);
				((ValueContext)_localctx).node =  new Constant(Integer.parseInt((((ValueContext)_localctx).INT_CONST!=null?((ValueContext)_localctx).INT_CONST.getText():null)));
				}
				break;
			case FLOAT_CONST:
				enterOuterAlt(_localctx, 3);
				{
				setState(527);
				((ValueContext)_localctx).FLOAT_CONST = match(FLOAT_CONST);
				((ValueContext)_localctx).node =  new Constant(Float.parseFloat((((ValueContext)_localctx).FLOAT_CONST!=null?((ValueContext)_localctx).FLOAT_CONST.getText():null)));
				}
				break;
			case STRING_CONST:
				enterOuterAlt(_localctx, 4);
				{
				setState(529);
				((ValueContext)_localctx).STRING_CONST = match(STRING_CONST);
				((ValueContext)_localctx).node =  new Constant((((ValueContext)_localctx).STRING_CONST!=null?((ValueContext)_localctx).STRING_CONST.getText():null).substring(1, (((ValueContext)_localctx).STRING_CONST!=null?((ValueContext)_localctx).STRING_CONST.getText():null).length() - 1));
						
				}
				break;
			case BOOL_CONST:
				enterOuterAlt(_localctx, 5);
				{
				setState(531);
				((ValueContext)_localctx).BOOL_CONST = match(BOOL_CONST);
				((ValueContext)_localctx).node =  new Constant(Boolean.parseBoolean((((ValueContext)_localctx).BOOL_CONST!=null?((ValueContext)_localctx).BOOL_CONST.getText():null)));
				}
				break;
			case NULL:
				enterOuterAlt(_localctx, 6);
				{
				setState(533);
				match(NULL);
				((ValueContext)_localctx).node =  new Constant(null);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Data_typeContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(HallelujahLangParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(HallelujahLangParser.FLOAT, 0); }
		public TerminalNode BOOLEAN() { return getToken(HallelujahLangParser.BOOLEAN, 0); }
		public TerminalNode STRING() { return getToken(HallelujahLangParser.STRING, 0); }
		public TerminalNode VOID() { return getToken(HallelujahLangParser.VOID, 0); }
		public Data_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_data_type; }
	}

	public final Data_typeContext data_type() throws RecognitionException {
		Data_typeContext _localctx = new Data_typeContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_data_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(537);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 31719424L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CommentContext extends ParserRuleContext {
		public TerminalNode LINE_COMMENT() { return getToken(HallelujahLangParser.LINE_COMMENT, 0); }
		public TerminalNode MULTILINE_COMMENT() { return getToken(HallelujahLangParser.MULTILINE_COMMENT, 0); }
		public CommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comment; }
	}

	public final CommentContext comment() throws RecognitionException {
		CommentContext _localctx = new CommentContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_comment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(539);
			_la = _input.LA(1);
			if ( !(_la==LINE_COMMENT || _la==MULTILINE_COMMENT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u00018\u021e\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0002"+
		"(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007,\u0002"+
		"-\u0007-\u0002.\u0007.\u0001\u0000\u0003\u0000`\b\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0005\u0000g\b\u0000\n\u0000"+
		"\f\u0000j\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003"+
		"\u0003|\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005"+
		"\u0003\u0082\b\u0003\n\u0003\f\u0003\u0085\t\u0003\u0003\u0003\u0087\b"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0005\u0004\u00a3\b\u0004\n\u0004\f\u0004"+
		"\u00a6\t\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u00b6\b\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u00cd\b\t\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0005\n\u00d6\b\n\n"+
		"\n\f\n\u00d9\t\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0005\f\u00e5\b\f\n\f\f\f\u00e8"+
		"\t\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0003\r\u0106\b\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u0114\b\u000e\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0005\u000f\u0120\b\u000f\n\u000f\f\u000f"+
		"\u0123\t\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0003\u000f\u012a\b\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u0163\b\u0016\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0005\u0017\u016c\b\u0017\n\u0017\f\u0017\u016f\t\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0005\u001b\u018e\b\u001b\n"+
		"\u001b\f\u001b\u0191\t\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0005\u001c\u019a\b\u001c\n"+
		"\u001c\f\u001c\u019d\t\u001c\u0001\u001c\u0001\u001c\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0005\u001d\u01a7"+
		"\b\u001d\n\u001d\f\u001d\u01aa\t\u001d\u0001\u001d\u0001\u001d\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0003\u001f\u01b6\b\u001f\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0003\u001f\u01bc\b\u001f\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0003\u001f\u01c1\b\u001f\u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001"+
		" \u0001 \u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001"+
		"\"\u0005\"\u01d4\b\"\n\"\f\"\u01d7\t\"\u0001#\u0001#\u0001$\u0001$\u0001"+
		"%\u0001%\u0001%\u0001%\u0001&\u0001&\u0001\'\u0001\'\u0001\'\u0001\'\u0001"+
		"\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0003\'\u01ed\b\'\u0001(\u0001"+
		"(\u0001(\u0001(\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001"+
		")\u0001)\u0003)\u01fc\b)\u0001*\u0001*\u0001*\u0001*\u0001+\u0001+\u0001"+
		"+\u0001+\u0001+\u0001+\u0001+\u0001+\u0003+\u020a\b+\u0001,\u0001,\u0001"+
		",\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0003"+
		",\u0218\b,\u0001-\u0001-\u0001.\u0001.\u0001.\u0003\u0121\u016d\u01a8"+
		"\u0000/\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018"+
		"\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\\u0000\u0005\u0002"+
		"\u0000\u001b%\'\'\u0001\u0000\u001b\u001e\u0001\u0000\u001f$\u0002\u0000"+
		"\u0012\u0012\u0015\u0018\u0001\u000012\u0231\u0000_\u0001\u0000\u0000"+
		"\u0000\u0002m\u0001\u0000\u0000\u0000\u0004q\u0001\u0000\u0000\u0000\u0006"+
		"w\u0001\u0000\u0000\u0000\b\u00a4\u0001\u0000\u0000\u0000\n\u00a7\u0001"+
		"\u0000\u0000\u0000\f\u00b1\u0001\u0000\u0000\u0000\u000e\u00ba\u0001\u0000"+
		"\u0000\u0000\u0010\u00c0\u0001\u0000\u0000\u0000\u0012\u00cc\u0001\u0000"+
		"\u0000\u0000\u0014\u00ce\u0001\u0000\u0000\u0000\u0016\u00dc\u0001\u0000"+
		"\u0000\u0000\u0018\u00e0\u0001\u0000\u0000\u0000\u001a\u0105\u0001\u0000"+
		"\u0000\u0000\u001c\u0113\u0001\u0000\u0000\u0000\u001e\u0115\u0001\u0000"+
		"\u0000\u0000 \u012d\u0001\u0000\u0000\u0000\"\u0136\u0001\u0000\u0000"+
		"\u0000$\u013f\u0001\u0000\u0000\u0000&\u0143\u0001\u0000\u0000\u0000("+
		"\u014e\u0001\u0000\u0000\u0000*\u0154\u0001\u0000\u0000\u0000,\u015b\u0001"+
		"\u0000\u0000\u0000.\u0164\u0001\u0000\u0000\u00000\u0172\u0001\u0000\u0000"+
		"\u00002\u0179\u0001\u0000\u0000\u00004\u0180\u0001\u0000\u0000\u00006"+
		"\u018f\u0001\u0000\u0000\u00008\u0192\u0001\u0000\u0000\u0000:\u01a0\u0001"+
		"\u0000\u0000\u0000<\u01ad\u0001\u0000\u0000\u0000>\u01b2\u0001\u0000\u0000"+
		"\u0000@\u01c2\u0001\u0000\u0000\u0000B\u01ca\u0001\u0000\u0000\u0000D"+
		"\u01d5\u0001\u0000\u0000\u0000F\u01d8\u0001\u0000\u0000\u0000H\u01da\u0001"+
		"\u0000\u0000\u0000J\u01dc\u0001\u0000\u0000\u0000L\u01e0\u0001\u0000\u0000"+
		"\u0000N\u01ec\u0001\u0000\u0000\u0000P\u01ee\u0001\u0000\u0000\u0000R"+
		"\u01fb\u0001\u0000\u0000\u0000T\u01fd\u0001\u0000\u0000\u0000V\u0209\u0001"+
		"\u0000\u0000\u0000X\u0217\u0001\u0000\u0000\u0000Z\u0219\u0001\u0000\u0000"+
		"\u0000\\\u021b\u0001\u0000\u0000\u0000^`\u0003\u0002\u0001\u0000_^\u0001"+
		"\u0000\u0000\u0000_`\u0001\u0000\u0000\u0000`h\u0001\u0000\u0000\u0000"+
		"ag\u0003\u0006\u0003\u0000bg\u00034\u001a\u0000cg\u0003\u0004\u0002\u0000"+
		"dg\u00051\u0000\u0000eg\u00052\u0000\u0000fa\u0001\u0000\u0000\u0000f"+
		"b\u0001\u0000\u0000\u0000fc\u0001\u0000\u0000\u0000fd\u0001\u0000\u0000"+
		"\u0000fe\u0001\u0000\u0000\u0000gj\u0001\u0000\u0000\u0000hf\u0001\u0000"+
		"\u0000\u0000hi\u0001\u0000\u0000\u0000ik\u0001\u0000\u0000\u0000jh\u0001"+
		"\u0000\u0000\u0000kl\u0005\u0000\u0000\u0001l\u0001\u0001\u0000\u0000"+
		"\u0000mn\u0005\u0007\u0000\u0000no\u00055\u0000\u0000op\u0005*\u0000\u0000"+
		"p\u0003\u0001\u0000\u0000\u0000qr\u0005\t\u0000\u0000rs\u00055\u0000\u0000"+
		"st\u0005)\u0000\u0000tu\u00055\u0000\u0000uv\u0005*\u0000\u0000v\u0005"+
		"\u0001\u0000\u0000\u0000wx\u0005\u0001\u0000\u0000x{\u00055\u0000\u0000"+
		"yz\u0005\u0002\u0000\u0000z|\u00055\u0000\u0000{y\u0001\u0000\u0000\u0000"+
		"{|\u0001\u0000\u0000\u0000|\u0086\u0001\u0000\u0000\u0000}~\u0005\u0003"+
		"\u0000\u0000~\u0083\u00055\u0000\u0000\u007f\u0080\u0005(\u0000\u0000"+
		"\u0080\u0082\u00055\u0000\u0000\u0081\u007f\u0001\u0000\u0000\u0000\u0082"+
		"\u0085\u0001\u0000\u0000\u0000\u0083\u0081\u0001\u0000\u0000\u0000\u0083"+
		"\u0084\u0001\u0000\u0000\u0000\u0084\u0087\u0001\u0000\u0000\u0000\u0085"+
		"\u0083\u0001\u0000\u0000\u0000\u0086}\u0001\u0000\u0000\u0000\u0086\u0087"+
		"\u0001\u0000\u0000\u0000\u0087\u0088\u0001\u0000\u0000\u0000\u0088\u0089"+
		"\u0005+\u0000\u0000\u0089\u008a\u0003\b\u0004\u0000\u008a\u008b\u0005"+
		",\u0000\u0000\u008b\u0007\u0001\u0000\u0000\u0000\u008c\u00a3\u0003\u0012"+
		"\t\u0000\u008d\u00a3\u0003>\u001f\u0000\u008e\u00a3\u00030\u0018\u0000"+
		"\u008f\u00a3\u00032\u0019\u0000\u0090\u0091\u0003\u001e\u000f\u0000\u0091"+
		"\u0092\u0006\u0004\uffff\uffff\u0000\u0092\u00a3\u0001\u0000\u0000\u0000"+
		"\u0093\u0094\u0003\"\u0011\u0000\u0094\u0095\u0006\u0004\uffff\uffff\u0000"+
		"\u0095\u00a3\u0001\u0000\u0000\u0000\u0096\u00a3\u0003\n\u0005\u0000\u0097"+
		"\u0098\u0003&\u0013\u0000\u0098\u0099\u0006\u0004\uffff\uffff\u0000\u0099"+
		"\u00a3\u0001\u0000\u0000\u0000\u009a\u009b\u0003*\u0015\u0000\u009b\u009c"+
		"\u0005*\u0000\u0000\u009c\u00a3\u0001\u0000\u0000\u0000\u009d\u009e\u0003"+
		",\u0016\u0000\u009e\u009f\u0005*\u0000\u0000\u009f\u00a3\u0001\u0000\u0000"+
		"\u0000\u00a0\u00a3\u0003@ \u0000\u00a1\u00a3\u0003\\.\u0000\u00a2\u008c"+
		"\u0001\u0000\u0000\u0000\u00a2\u008d\u0001\u0000\u0000\u0000\u00a2\u008e"+
		"\u0001\u0000\u0000\u0000\u00a2\u008f\u0001\u0000\u0000\u0000\u00a2\u0090"+
		"\u0001\u0000\u0000\u0000\u00a2\u0093\u0001\u0000\u0000\u0000\u00a2\u0096"+
		"\u0001\u0000\u0000\u0000\u00a2\u0097\u0001\u0000\u0000\u0000\u00a2\u009a"+
		"\u0001\u0000\u0000\u0000\u00a2\u009d\u0001\u0000\u0000\u0000\u00a2\u00a0"+
		"\u0001\u0000\u0000\u0000\u00a2\u00a1\u0001\u0000\u0000\u0000\u00a3\u00a6"+
		"\u0001\u0000\u0000\u0000\u00a4\u00a2\u0001\u0000\u0000\u0000\u00a4\u00a5"+
		"\u0001\u0000\u0000\u0000\u00a5\t\u0001\u0000\u0000\u0000\u00a6\u00a4\u0001"+
		"\u0000\u0000\u0000\u00a7\u00a8\u0003Z-\u0000\u00a8\u00a9\u00055\u0000"+
		"\u0000\u00a9\u00aa\u0005\u001a\u0000\u0000\u00aa\u00ab\u0005\u0006\u0000"+
		"\u0000\u00ab\u00ac\u00055\u0000\u0000\u00ac\u00ad\u0005-\u0000\u0000\u00ad"+
		"\u00ae\u00038\u001c\u0000\u00ae\u00af\u0005.\u0000\u0000\u00af\u00b0\u0005"+
		"*\u0000\u0000\u00b0\u000b\u0001\u0000\u0000\u0000\u00b1\u00b2\u0003Z-"+
		"\u0000\u00b2\u00b5\u00055\u0000\u0000\u00b3\u00b4\u0005\u001a\u0000\u0000"+
		"\u00b4\u00b6\u0003N\'\u0000\u00b5\u00b3\u0001\u0000\u0000\u0000\u00b5"+
		"\u00b6\u0001\u0000\u0000\u0000\u00b6\u00b7\u0001\u0000\u0000\u0000\u00b7"+
		"\u00b8\u0005*\u0000\u0000\u00b8\u00b9\u0006\u0006\uffff\uffff\u0000\u00b9"+
		"\r\u0001\u0000\u0000\u0000\u00ba\u00bb\u00055\u0000\u0000\u00bb\u00bc"+
		"\u0005\u001a\u0000\u0000\u00bc\u00bd\u0003N\'\u0000\u00bd\u00be\u0005"+
		"*\u0000\u0000\u00be\u00bf\u0006\u0007\uffff\uffff\u0000\u00bf\u000f\u0001"+
		"\u0000\u0000\u0000\u00c0\u00c1\u00055\u0000\u0000\u00c1\u00c2\u0006\b"+
		"\uffff\uffff\u0000\u00c2\u0011\u0001\u0000\u0000\u0000\u00c3\u00c4\u0003"+
		"\f\u0006\u0000\u00c4\u00c5\u0006\t\uffff\uffff\u0000\u00c5\u00cd\u0001"+
		"\u0000\u0000\u0000\u00c6\u00c7\u0003\u000e\u0007\u0000\u00c7\u00c8\u0006"+
		"\t\uffff\uffff\u0000\u00c8\u00cd\u0001\u0000\u0000\u0000\u00c9\u00ca\u0003"+
		"\u0010\b\u0000\u00ca\u00cb\u0006\t\uffff\uffff\u0000\u00cb\u00cd\u0001"+
		"\u0000\u0000\u0000\u00cc\u00c3\u0001\u0000\u0000\u0000\u00cc\u00c6\u0001"+
		"\u0000\u0000\u0000\u00cc\u00c9\u0001\u0000\u0000\u0000\u00cd\u0013\u0001"+
		"\u0000\u0000\u0000\u00ce\u00cf\u0006\n\uffff\uffff\u0000\u00cf\u00d0\u0003"+
		"\u0016\u000b\u0000\u00d0\u00d7\u0006\n\uffff\uffff\u0000\u00d1\u00d2\u0005"+
		"(\u0000\u0000\u00d2\u00d3\u0003\u0016\u000b\u0000\u00d3\u00d4\u0006\n"+
		"\uffff\uffff\u0000\u00d4\u00d6\u0001\u0000\u0000\u0000\u00d5\u00d1\u0001"+
		"\u0000\u0000\u0000\u00d6\u00d9\u0001\u0000\u0000\u0000\u00d7\u00d5\u0001"+
		"\u0000\u0000\u0000\u00d7\u00d8\u0001\u0000\u0000\u0000\u00d8\u00da\u0001"+
		"\u0000\u0000\u0000\u00d9\u00d7\u0001\u0000\u0000\u0000\u00da\u00db\u0006"+
		"\n\uffff\uffff\u0000\u00db\u0015\u0001\u0000\u0000\u0000\u00dc\u00dd\u0003"+
		"Z-\u0000\u00dd\u00de\u00055\u0000\u0000\u00de\u00df\u0006\u000b\uffff"+
		"\uffff\u0000\u00df\u0017\u0001\u0000\u0000\u0000\u00e0\u00e6\u0005+\u0000"+
		"\u0000\u00e1\u00e2\u0003\u001a\r\u0000\u00e2\u00e3\u0006\f\uffff\uffff"+
		"\u0000\u00e3\u00e5\u0001\u0000\u0000\u0000\u00e4\u00e1\u0001\u0000\u0000"+
		"\u0000\u00e5\u00e8\u0001\u0000\u0000\u0000\u00e6\u00e4\u0001\u0000\u0000"+
		"\u0000\u00e6\u00e7\u0001\u0000\u0000\u0000\u00e7\u00e9\u0001\u0000\u0000"+
		"\u0000\u00e8\u00e6\u0001\u0000\u0000\u0000\u00e9\u00ea\u0005,\u0000\u0000"+
		"\u00ea\u0019\u0001\u0000\u0000\u0000\u00eb\u0106\u0003\u001c\u000e\u0000"+
		"\u00ec\u00ed\u0003\u001e\u000f\u0000\u00ed\u00ee\u0006\r\uffff\uffff\u0000"+
		"\u00ee\u0106\u0001\u0000\u0000\u0000\u00ef\u00f0\u0003\"\u0011\u0000\u00f0"+
		"\u00f1\u0006\r\uffff\uffff\u0000\u00f1\u0106\u0001\u0000\u0000\u0000\u00f2"+
		"\u0106\u0003$\u0012\u0000\u00f3\u00f4\u0003(\u0014\u0000\u00f4\u00f5\u0006"+
		"\r\uffff\uffff\u0000\u00f5\u0106\u0001\u0000\u0000\u0000\u00f6\u00f7\u0003"+
		"*\u0015\u0000\u00f7\u00f8\u0005*\u0000\u0000\u00f8\u0106\u0001\u0000\u0000"+
		"\u0000\u00f9\u0106\u00030\u0018\u0000\u00fa\u0106\u00032\u0019\u0000\u00fb"+
		"\u0106\u0003<\u001e\u0000\u00fc\u0106\u0003>\u001f\u0000\u00fd\u0106\u0003"+
		"\n\u0005\u0000\u00fe\u00ff\u0003,\u0016\u0000\u00ff\u0100\u0005*\u0000"+
		"\u0000\u0100\u0106\u0001\u0000\u0000\u0000\u0101\u0106\u0003\\.\u0000"+
		"\u0102\u0103\u0003N\'\u0000\u0103\u0104\u0005*\u0000\u0000\u0104\u0106"+
		"\u0001\u0000\u0000\u0000\u0105\u00eb\u0001\u0000\u0000\u0000\u0105\u00ec"+
		"\u0001\u0000\u0000\u0000\u0105\u00ef\u0001\u0000\u0000\u0000\u0105\u00f2"+
		"\u0001\u0000\u0000\u0000\u0105\u00f3\u0001\u0000\u0000\u0000\u0105\u00f6"+
		"\u0001\u0000\u0000\u0000\u0105\u00f9\u0001\u0000\u0000\u0000\u0105\u00fa"+
		"\u0001\u0000\u0000\u0000\u0105\u00fb\u0001\u0000\u0000\u0000\u0105\u00fc"+
		"\u0001\u0000\u0000\u0000\u0105\u00fd\u0001\u0000\u0000\u0000\u0105\u00fe"+
		"\u0001\u0000\u0000\u0000\u0105\u0101\u0001\u0000\u0000\u0000\u0105\u0102"+
		"\u0001\u0000\u0000\u0000\u0106\u001b\u0001\u0000\u0000\u0000\u0107\u0108"+
		"\u00055\u0000\u0000\u0108\u0109\u0005\u001a\u0000\u0000\u0109\u010a\u0003"+
		"N\'\u0000\u010a\u010b\u0005*\u0000\u0000\u010b\u0114\u0001\u0000\u0000"+
		"\u0000\u010c\u010d\u0003Z-\u0000\u010d\u010e\u00055\u0000\u0000\u010e"+
		"\u010f\u0005\u001a\u0000\u0000\u010f\u0110\u0003N\'\u0000\u0110\u0111"+
		"\u0005*\u0000\u0000\u0111\u0114\u0001\u0000\u0000\u0000\u0112\u0114\u0003"+
		":\u001d\u0000\u0113\u0107\u0001\u0000\u0000\u0000\u0113\u010c\u0001\u0000"+
		"\u0000\u0000\u0113\u0112\u0001\u0000\u0000\u0000\u0114\u001d\u0001\u0000"+
		"\u0000\u0000\u0115\u0116\u0005\u000f\u0000\u0000\u0116\u0117\u0005-\u0000"+
		"\u0000\u0117\u0118\u0003N\'\u0000\u0118\u0119\u0005.\u0000\u0000\u0119"+
		"\u011a\u0006\u000f\uffff\uffff\u0000\u011a\u011b\u0003\u0018\f\u0000\u011b"+
		"\u0121\u0006\u000f\uffff\uffff\u0000\u011c\u011d\u0003 \u0010\u0000\u011d"+
		"\u011e\u0006\u000f\uffff\uffff\u0000\u011e\u0120\u0001\u0000\u0000\u0000"+
		"\u011f\u011c\u0001\u0000\u0000\u0000\u0120\u0123\u0001\u0000\u0000\u0000"+
		"\u0121\u0122\u0001\u0000\u0000\u0000\u0121\u011f\u0001\u0000\u0000\u0000"+
		"\u0122\u0129\u0001\u0000\u0000\u0000\u0123\u0121\u0001\u0000\u0000\u0000"+
		"\u0124\u0125\u0005\u0010\u0000\u0000\u0125\u0126\u0006\u000f\uffff\uffff"+
		"\u0000\u0126\u0127\u0003\u0018\f\u0000\u0127\u0128\u0006\u000f\uffff\uffff"+
		"\u0000\u0128\u012a\u0001\u0000\u0000\u0000\u0129\u0124\u0001\u0000\u0000"+
		"\u0000\u0129\u012a\u0001\u0000\u0000\u0000\u012a\u012b\u0001\u0000\u0000"+
		"\u0000\u012b\u012c\u0006\u000f\uffff\uffff\u0000\u012c\u001f\u0001\u0000"+
		"\u0000\u0000\u012d\u012e\u0005\u0011\u0000\u0000\u012e\u012f\u0005-\u0000"+
		"\u0000\u012f\u0130\u0003N\'\u0000\u0130\u0131\u0005.\u0000\u0000\u0131"+
		"\u0132\u0006\u0010\uffff\uffff\u0000\u0132\u0133\u0003\u0018\f\u0000\u0133"+
		"\u0134\u0006\u0010\uffff\uffff\u0000\u0134\u0135\u0006\u0010\uffff\uffff"+
		"\u0000\u0135!\u0001\u0000\u0000\u0000\u0136\u0137\u0005\u000e\u0000\u0000"+
		"\u0137\u0138\u0005-\u0000\u0000\u0138\u0139\u0003N\'\u0000\u0139\u013a"+
		"\u0005.\u0000\u0000\u013a\u013b\u0006\u0011\uffff\uffff\u0000\u013b\u013c"+
		"\u0003\u0018\f\u0000\u013c\u013d\u0006\u0011\uffff\uffff\u0000\u013d\u013e"+
		"\u0006\u0011\uffff\uffff\u0000\u013e#\u0001\u0000\u0000\u0000\u013f\u0140"+
		"\u0005\r\u0000\u0000\u0140\u0141\u0003.\u0017\u0000\u0141\u0142\u0005"+
		"*\u0000\u0000\u0142%\u0001\u0000\u0000\u0000\u0143\u0144\u0003Z-\u0000"+
		"\u0144\u0145\u0005\u0005\u0000\u0000\u0145\u0146\u00055\u0000\u0000\u0146"+
		"\u0147\u0005-\u0000\u0000\u0147\u0148\u0003\u0014\n\u0000\u0148\u0149"+
		"\u0005.\u0000\u0000\u0149\u014a\u0006\u0013\uffff\uffff\u0000\u014a\u014b"+
		"\u0003\u0018\f\u0000\u014b\u014c\u0006\u0013\uffff\uffff\u0000\u014c\u014d"+
		"\u0006\u0013\uffff\uffff\u0000\u014d\'\u0001\u0000\u0000\u0000\u014e\u014f"+
		"\u00055\u0000\u0000\u014f\u0150\u0005-\u0000\u0000\u0150\u0151\u00038"+
		"\u001c\u0000\u0151\u0152\u0005.\u0000\u0000\u0152\u0153\u0006\u0014\uffff"+
		"\uffff\u0000\u0153)\u0001\u0000\u0000\u0000\u0154\u0155\u00055\u0000\u0000"+
		"\u0155\u0156\u0005)\u0000\u0000\u0156\u0157\u00055\u0000\u0000\u0157\u0158"+
		"\u0005-\u0000\u0000\u0158\u0159\u00038\u001c\u0000\u0159\u015a\u0005."+
		"\u0000\u0000\u015a+\u0001\u0000\u0000\u0000\u015b\u015c\u0005\n\u0000"+
		"\u0000\u015c\u015d\u0005)\u0000\u0000\u015d\u0162\u00055\u0000\u0000\u015e"+
		"\u015f\u0005-\u0000\u0000\u015f\u0160\u00038\u001c\u0000\u0160\u0161\u0005"+
		".\u0000\u0000\u0161\u0163\u0001\u0000\u0000\u0000\u0162\u015e\u0001\u0000"+
		"\u0000\u0000\u0162\u0163\u0001\u0000\u0000\u0000\u0163-\u0001\u0000\u0000"+
		"\u0000\u0164\u0165\u0005\u001e\u0000\u0000\u0165\u0166\u0003N\'\u0000"+
		"\u0166\u016d\u0006\u0017\uffff\uffff\u0000\u0167\u0168\u0005\u001e\u0000"+
		"\u0000\u0168\u0169\u0003N\'\u0000\u0169\u016a\u0006\u0017\uffff\uffff"+
		"\u0000\u016a\u016c\u0001\u0000\u0000\u0000\u016b\u0167\u0001\u0000\u0000"+
		"\u0000\u016c\u016f\u0001\u0000\u0000\u0000\u016d\u016e\u0001\u0000\u0000"+
		"\u0000\u016d\u016b\u0001\u0000\u0000\u0000\u016e\u0170\u0001\u0000\u0000"+
		"\u0000\u016f\u016d\u0001\u0000\u0000\u0000\u0170\u0171\u0005\u001e\u0000"+
		"\u0000\u0171/\u0001\u0000\u0000\u0000\u0172\u0173\u0005\f\u0000\u0000"+
		"\u0173\u0174\u0005-\u0000\u0000\u0174\u0175\u0003.\u0017\u0000\u0175\u0176"+
		"\u0005.\u0000\u0000\u0176\u0177\u0005*\u0000\u0000\u0177\u0178\u0006\u0018"+
		"\uffff\uffff\u0000\u01781\u0001\u0000\u0000\u0000\u0179\u017a\u0005\u000b"+
		"\u0000\u0000\u017a\u017b\u0005-\u0000\u0000\u017b\u017c\u00055\u0000\u0000"+
		"\u017c\u017d\u0005.\u0000\u0000\u017d\u017e\u0005*\u0000\u0000\u017e\u017f"+
		"\u0006\u0019\uffff\uffff\u0000\u017f3\u0001\u0000\u0000\u0000\u0180\u0181"+
		"\u0005\u0004\u0000\u0000\u0181\u0182\u00055\u0000\u0000\u0182\u0183\u0005"+
		"+\u0000\u0000\u0183\u0184\u00036\u001b\u0000\u0184\u0185\u0005,\u0000"+
		"\u0000\u01855\u0001\u0000\u0000\u0000\u0186\u0187\u0003&\u0013\u0000\u0187"+
		"\u0188\u0006\u001b\uffff\uffff\u0000\u0188\u018e\u0001\u0000\u0000\u0000"+
		"\u0189\u018a\u0003Z-\u0000\u018a\u018b\u0003(\u0014\u0000\u018b\u018c"+
		"\u0005*\u0000\u0000\u018c\u018e\u0001\u0000\u0000\u0000\u018d\u0186\u0001"+
		"\u0000\u0000\u0000\u018d\u0189\u0001\u0000\u0000\u0000\u018e\u0191\u0001"+
		"\u0000\u0000\u0000\u018f\u018d\u0001\u0000\u0000\u0000\u018f\u0190\u0001"+
		"\u0000\u0000\u0000\u01907\u0001\u0000\u0000\u0000\u0191\u018f\u0001\u0000"+
		"\u0000\u0000\u0192\u0193\u0006\u001c\uffff\uffff\u0000\u0193\u0194\u0003"+
		"N\'\u0000\u0194\u019b\u0006\u001c\uffff\uffff\u0000\u0195\u0196\u0005"+
		"(\u0000\u0000\u0196\u0197\u0003N\'\u0000\u0197\u0198\u0006\u001c\uffff"+
		"\uffff\u0000\u0198\u019a\u0001\u0000\u0000\u0000\u0199\u0195\u0001\u0000"+
		"\u0000\u0000\u019a\u019d\u0001\u0000\u0000\u0000\u019b\u0199\u0001\u0000"+
		"\u0000\u0000\u019b\u019c\u0001\u0000\u0000\u0000\u019c\u019e\u0001\u0000"+
		"\u0000\u0000\u019d\u019b\u0001\u0000\u0000\u0000\u019e\u019f\u0006\u001c"+
		"\uffff\uffff\u0000\u019f9\u0001\u0000\u0000\u0000\u01a0\u01a1\u0005/\u0000"+
		"\u0000\u01a1\u01a8\u00038\u001c\u0000\u01a2\u01a3\u0005/\u0000\u0000\u01a3"+
		"\u01a4\u00038\u001c\u0000\u01a4\u01a5\u00050\u0000\u0000\u01a5\u01a7\u0001"+
		"\u0000\u0000\u0000\u01a6\u01a2\u0001\u0000\u0000\u0000\u01a7\u01aa\u0001"+
		"\u0000\u0000\u0000\u01a8\u01a9\u0001\u0000\u0000\u0000\u01a8\u01a6\u0001"+
		"\u0000\u0000\u0000\u01a9\u01ab\u0001\u0000\u0000\u0000\u01aa\u01a8\u0001"+
		"\u0000\u0000\u0000\u01ab\u01ac\u00050\u0000\u0000\u01ac;\u0001\u0000\u0000"+
		"\u0000\u01ad\u01ae\u00055\u0000\u0000\u01ae\u01af\u0005/\u0000\u0000\u01af"+
		"\u01b0\u0003N\'\u0000\u01b0\u01b1\u00050\u0000\u0000\u01b1=\u0001\u0000"+
		"\u0000\u0000\u01b2\u01b3\u0003Z-\u0000\u01b3\u01b5\u0003:\u001d\u0000"+
		"\u01b4\u01b6\u0003:\u001d\u0000\u01b5\u01b4\u0001\u0000\u0000\u0000\u01b5"+
		"\u01b6\u0001\u0000\u0000\u0000\u01b6\u01b7\u0001\u0000\u0000\u0000\u01b7"+
		"\u01c0\u00055\u0000\u0000\u01b8\u01c1\u0005*\u0000\u0000\u01b9\u01bb\u0005"+
		"\u001a\u0000\u0000\u01ba\u01bc\u00055\u0000\u0000\u01bb\u01ba\u0001\u0000"+
		"\u0000\u0000\u01bb\u01bc\u0001\u0000\u0000\u0000\u01bc\u01bd\u0001\u0000"+
		"\u0000\u0000\u01bd\u01be\u0003:\u001d\u0000\u01be\u01bf\u0005*\u0000\u0000"+
		"\u01bf\u01c1\u0001\u0000\u0000\u0000\u01c0\u01b8\u0001\u0000\u0000\u0000"+
		"\u01c0\u01b9\u0001\u0000\u0000\u0000\u01c1?\u0001\u0000\u0000\u0000\u01c2"+
		"\u01c3\u0005\b\u0000\u0000\u01c3\u01c4\u0005-\u0000\u0000\u01c4\u01c5"+
		"\u00038\u001c\u0000\u01c5\u01c6\u0005.\u0000\u0000\u01c6\u01c7\u0005+"+
		"\u0000\u0000\u01c7\u01c8\u0003D\"\u0000\u01c8\u01c9\u0005,\u0000\u0000"+
		"\u01c9A\u0001\u0000\u0000\u0000\u01ca\u01cb\u0003Z-\u0000\u01cb\u01cc"+
		"\u0005\n\u0000\u0000\u01cc\u01cd\u0005)\u0000\u0000\u01cd\u01ce\u0005"+
		"5\u0000\u0000\u01ce\u01cf\u0005\u001a\u0000\u0000\u01cf\u01d0\u0003N\'"+
		"\u0000\u01d0\u01d1\u0005*\u0000\u0000\u01d1C\u0001\u0000\u0000\u0000\u01d2"+
		"\u01d4\u0003B!\u0000\u01d3\u01d2\u0001\u0000\u0000\u0000\u01d4\u01d7\u0001"+
		"\u0000\u0000\u0000\u01d5\u01d3\u0001\u0000\u0000\u0000\u01d5\u01d6\u0001"+
		"\u0000\u0000\u0000\u01d6E\u0001\u0000\u0000\u0000\u01d7\u01d5\u0001\u0000"+
		"\u0000\u0000\u01d8\u01d9\u0007\u0000\u0000\u0000\u01d9G\u0001\u0000\u0000"+
		"\u0000\u01da\u01db\u0007\u0001\u0000\u0000\u01dbI\u0001\u0000\u0000\u0000"+
		"\u01dc\u01dd\u0003R)\u0000\u01dd\u01de\u0003H$\u0000\u01de\u01df\u0003"+
		"R)\u0000\u01dfK\u0001\u0000\u0000\u0000\u01e0\u01e1\u0007\u0002\u0000"+
		"\u0000\u01e1M\u0001\u0000\u0000\u0000\u01e2\u01ed\u0003P(\u0000\u01e3"+
		"\u01e4\u0003T*\u0000\u01e4\u01e5\u0006\'\uffff\uffff\u0000\u01e5\u01ed"+
		"\u0001\u0000\u0000\u0000\u01e6\u01e7\u0003X,\u0000\u01e7\u01e8\u0006\'"+
		"\uffff\uffff\u0000\u01e8\u01ed\u0001\u0000\u0000\u0000\u01e9\u01ea\u0003"+
		"V+\u0000\u01ea\u01eb\u0006\'\uffff\uffff\u0000\u01eb\u01ed\u0001\u0000"+
		"\u0000\u0000\u01ec\u01e2\u0001\u0000\u0000\u0000\u01ec\u01e3\u0001\u0000"+
		"\u0000\u0000\u01ec\u01e6\u0001\u0000\u0000\u0000\u01ec\u01e9\u0001\u0000"+
		"\u0000\u0000\u01edO\u0001\u0000\u0000\u0000\u01ee\u01ef\u0003R)\u0000"+
		"\u01ef\u01f0\u0003F#\u0000\u01f0\u01f1\u0003R)\u0000\u01f1Q\u0001\u0000"+
		"\u0000\u0000\u01f2\u01f3\u0003T*\u0000\u01f3\u01f4\u0006)\uffff\uffff"+
		"\u0000\u01f4\u01fc\u0001\u0000\u0000\u0000\u01f5\u01f6\u0003X,\u0000\u01f6"+
		"\u01f7\u0006)\uffff\uffff\u0000\u01f7\u01fc\u0001\u0000\u0000\u0000\u01f8"+
		"\u01f9\u0003V+\u0000\u01f9\u01fa\u0006)\uffff\uffff\u0000\u01fa\u01fc"+
		"\u0001\u0000\u0000\u0000\u01fb\u01f2\u0001\u0000\u0000\u0000\u01fb\u01f5"+
		"\u0001\u0000\u0000\u0000\u01fb\u01f8\u0001\u0000\u0000\u0000\u01fcS\u0001"+
		"\u0000\u0000\u0000\u01fd\u01fe\u0005&\u0000\u0000\u01fe\u01ff\u0003N\'"+
		"\u0000\u01ff\u0200\u0006*\uffff\uffff\u0000\u0200U\u0001\u0000\u0000\u0000"+
		"\u0201\u020a\u0003*\u0015\u0000\u0202\u020a\u0003:\u001d\u0000\u0203\u0204"+
		"\u00055\u0000\u0000\u0204\u020a\u0003:\u001d\u0000\u0205\u0206\u0003("+
		"\u0014\u0000\u0206\u0207\u0006+\uffff\uffff\u0000\u0207\u020a\u0001\u0000"+
		"\u0000\u0000\u0208\u020a\u0003,\u0016\u0000\u0209\u0201\u0001\u0000\u0000"+
		"\u0000\u0209\u0202\u0001\u0000\u0000\u0000\u0209\u0203\u0001\u0000\u0000"+
		"\u0000\u0209\u0205\u0001\u0000\u0000\u0000\u0209\u0208\u0001\u0000\u0000"+
		"\u0000\u020aW\u0001\u0000\u0000\u0000\u020b\u020c\u00055\u0000\u0000\u020c"+
		"\u0218\u0006,\uffff\uffff\u0000\u020d\u020e\u00056\u0000\u0000\u020e\u0218"+
		"\u0006,\uffff\uffff\u0000\u020f\u0210\u00054\u0000\u0000\u0210\u0218\u0006"+
		",\uffff\uffff\u0000\u0211\u0212\u00057\u0000\u0000\u0212\u0218\u0006,"+
		"\uffff\uffff\u0000\u0213\u0214\u00053\u0000\u0000\u0214\u0218\u0006,\uffff"+
		"\uffff\u0000\u0215\u0216\u0005\u0019\u0000\u0000\u0216\u0218\u0006,\uffff"+
		"\uffff\u0000\u0217\u020b\u0001\u0000\u0000\u0000\u0217\u020d\u0001\u0000"+
		"\u0000\u0000\u0217\u020f\u0001\u0000\u0000\u0000\u0217\u0211\u0001\u0000"+
		"\u0000\u0000\u0217\u0213\u0001\u0000\u0000\u0000\u0217\u0215\u0001\u0000"+
		"\u0000\u0000\u0218Y\u0001\u0000\u0000\u0000\u0219\u021a\u0007\u0003\u0000"+
		"\u0000\u021a[\u0001\u0000\u0000\u0000\u021b\u021c\u0007\u0004\u0000\u0000"+
		"\u021c]\u0001\u0000\u0000\u0000\u001e_fh{\u0083\u0086\u00a2\u00a4\u00b5"+
		"\u00cc\u00d7\u00e6\u0105\u0113\u0121\u0129\u0162\u016d\u018d\u018f\u019b"+
		"\u01a8\u01b5\u01bb\u01c0\u01d5\u01ec\u01fb\u0209\u0217";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}