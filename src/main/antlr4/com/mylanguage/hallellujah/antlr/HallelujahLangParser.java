// Generated from HallelujahLang.g4 by ANTLR 4.13.1
 
	import java.util.Map;
	import java.util.HashMap;
	import java.util.List;
	import java.util.ArrayList;
	import com.mylanguage.hallellujah.ast*;

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
		ID=53, INT_CONST=54, STRING_CONST=55, WS=56, EQUALITY_OPERATORS=57, ARITMETICAL_OPERATORS=58, 
		COMPARISON_OPERATORS=59;
	public static final int
		RULE_program = 0, RULE_package_declaration = 1, RULE_program_body = 2, 
		RULE_package_import = 3, RULE_class_declaration = 4, RULE_class_body = 5, 
		RULE_class_instance = 6, RULE_variable_declaration = 7, RULE_variable_assignment = 8, 
		RULE_variable_reference = 9, RULE_array_initializer = 10, RULE_array_access = 11, 
		RULE_array_declaration = 12, RULE_variable_statement = 13, RULE_parameters = 14, 
		RULE_parameter = 15, RULE_statement = 16, RULE_if_statement = 17, RULE_while_statement = 18, 
		RULE_return_statement = 19, RULE_method_declaration = 20, RULE_method_call = 21, 
		RULE_method_call_class = 22, RULE_method_call_this_class = 23, RULE_print_statement = 24, 
		RULE_input_statement = 25, RULE_interface_declaration = 26, RULE_interface_body = 27, 
		RULE_arguments = 28, RULE_constructor_declaration = 29, RULE_constructor_body = 30, 
		RULE_aritmetical_expression = 31, RULE_equality_expression = 32, RULE_comparison_expression = 33, 
		RULE_logical_not_expression = 34, RULE_logical_or_expression = 35, RULE_logical_and_expression = 36, 
		RULE_expression = 37, RULE_binary_operation = 38, RULE_operand = 39, RULE_callings = 40, 
		RULE_value = 41, RULE_data_type = 42, RULE_comment = 43;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "package_declaration", "program_body", "package_import", "class_declaration", 
			"class_body", "class_instance", "variable_declaration", "variable_assignment", 
			"variable_reference", "array_initializer", "array_access", "array_declaration", 
			"variable_statement", "parameters", "parameter", "statement", "if_statement", 
			"while_statement", "return_statement", "method_declaration", "method_call", 
			"method_call_class", "method_call_this_class", "print_statement", "input_statement", 
			"interface_declaration", "interface_body", "arguments", "constructor_declaration", 
			"constructor_body", "aritmetical_expression", "equality_expression", 
			"comparison_expression", "logical_not_expression", "logical_or_expression", 
			"logical_and_expression", "expression", "binary_operation", "operand", 
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
			"STRING_CONST", "WS", "EQUALITY_OPERATORS", "ARITMETICAL_OPERATORS", 
			"COMPARISON_OPERATORS"
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
		public Package_declarationContext package_declaration;
		public Program_bodyContext program_body;
		public Package_declarationContext package_declaration() {
			return getRuleContext(Package_declarationContext.class,0);
		}
		public List<Program_bodyContext> program_body() {
			return getRuleContexts(Program_bodyContext.class);
		}
		public Program_bodyContext program_body(int i) {
			return getRuleContext(Program_bodyContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HallelujahLangListener ) ((HallelujahLangListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HallelujahLangListener ) ((HallelujahLangListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HallelujahLangVisitor ) return ((HallelujahLangVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{

					List<ASTNode> body = new ArrayList<ASTNode>();
					Map<String, Object> symbolTable = new HashMap<String, Object>();
				
			setState(90);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PACKAGE) {
				{
				setState(89);
				((ProgramContext)_localctx).package_declaration = package_declaration();
				}
			}

			body.add(((ProgramContext)_localctx).package_declaration.node);
			setState(98);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1688849860264466L) != 0)) {
				{
				{
				setState(93);
				((ProgramContext)_localctx).program_body = program_body();
				body.add(((ProgramContext)_localctx).program_body.node);
				}
				}
				setState(100);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}

					for (ASTNode n : body) {
						n.execute(symbolTable);
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
	public static class Package_declarationContext extends ParserRuleContext {
		public ASTNode node;
		public Token ID;
		public TerminalNode PACKAGE() { return getToken(HallelujahLangParser.PACKAGE, 0); }
		public TerminalNode ID() { return getToken(HallelujahLangParser.ID, 0); }
		public TerminalNode SEMICOLON() { return getToken(HallelujahLangParser.SEMICOLON, 0); }
		public Package_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_package_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HallelujahLangListener ) ((HallelujahLangListener)listener).enterPackage_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HallelujahLangListener ) ((HallelujahLangListener)listener).exitPackage_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HallelujahLangVisitor ) return ((HallelujahLangVisitor<? extends T>)visitor).visitPackage_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Package_declarationContext package_declaration() throws RecognitionException {
		Package_declarationContext _localctx = new Package_declarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_package_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			match(PACKAGE);
			setState(104);
			((Package_declarationContext)_localctx).ID = match(ID);
			setState(105);
			match(SEMICOLON);
			((Package_declarationContext)_localctx).node =  new PackageDeclaration((((Package_declarationContext)_localctx).ID!=null?((Package_declarationContext)_localctx).ID.getText():null));
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
	public static class Program_bodyContext extends ParserRuleContext {
		public ASTNode node;
		public Class_declarationContext class_declaration;
		public Interface_declarationContext interface_declaration;
		public Package_importContext package_import;
		public CommentContext comment;
		public Class_declarationContext class_declaration() {
			return getRuleContext(Class_declarationContext.class,0);
		}
		public Interface_declarationContext interface_declaration() {
			return getRuleContext(Interface_declarationContext.class,0);
		}
		public Package_importContext package_import() {
			return getRuleContext(Package_importContext.class,0);
		}
		public CommentContext comment() {
			return getRuleContext(CommentContext.class,0);
		}
		public Program_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HallelujahLangListener ) ((HallelujahLangListener)listener).enterProgram_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HallelujahLangListener ) ((HallelujahLangListener)listener).exitProgram_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HallelujahLangVisitor ) return ((HallelujahLangVisitor<? extends T>)visitor).visitProgram_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Program_bodyContext program_body() throws RecognitionException {
		Program_bodyContext _localctx = new Program_bodyContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_program_body);
		try {
			setState(120);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CLASS:
				enterOuterAlt(_localctx, 1);
				{
				setState(108);
				((Program_bodyContext)_localctx).class_declaration = class_declaration();
				((Program_bodyContext)_localctx).node =  ((Program_bodyContext)_localctx).class_declaration.node;
				}
				break;
			case INTERFACE:
				enterOuterAlt(_localctx, 2);
				{
				setState(111);
				((Program_bodyContext)_localctx).interface_declaration = interface_declaration();
				((Program_bodyContext)_localctx).node =  ((Program_bodyContext)_localctx).interface_declaration.node;
				}
				break;
			case IMPORT:
				enterOuterAlt(_localctx, 3);
				{
				setState(114);
				((Program_bodyContext)_localctx).package_import = package_import();
				((Program_bodyContext)_localctx).node =  ((Program_bodyContext)_localctx).package_import.node;
				}
				break;
			case LINE_COMMENT:
			case MULTILINE_COMMENT:
				enterOuterAlt(_localctx, 4);
				{
				setState(117);
				((Program_bodyContext)_localctx).comment = comment();
				_localctx.node = ((Program_bodyContext)_localctx).comment.node
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
	public static class Package_importContext extends ParserRuleContext {
		public ASTNode node;
		public Token ID;
		public TerminalNode IMPORT() { return getToken(HallelujahLangParser.IMPORT, 0); }
		public List<TerminalNode> ID() { return getTokens(HallelujahLangParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(HallelujahLangParser.ID, i);
		}
		public TerminalNode SEMICOLON() { return getToken(HallelujahLangParser.SEMICOLON, 0); }
		public TerminalNode DOT() { return getToken(HallelujahLangParser.DOT, 0); }
		public Package_importContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_package_import; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HallelujahLangListener ) ((HallelujahLangListener)listener).enterPackage_import(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HallelujahLangListener ) ((HallelujahLangListener)listener).exitPackage_import(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HallelujahLangVisitor ) return ((HallelujahLangVisitor<? extends T>)visitor).visitPackage_import(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Package_importContext package_import() throws RecognitionException {
		Package_importContext _localctx = new Package_importContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_package_import);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			match(IMPORT);
			setState(123);
			((Package_importContext)_localctx).ID = match(ID);
			setState(126);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOT) {
				{
				setState(124);
				match(DOT);
				setState(125);
				((Package_importContext)_localctx).ID = match(ID);
				}
			}

			setState(128);
			match(SEMICOLON);
			((Package_importContext)_localctx).node =  new PackageImport((((Package_importContext)_localctx).ID!=null?((Package_importContext)_localctx).ID.getText():null));
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
		public ASTNode node;
		public Token ID;
		public Class_bodyContext class_body;
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HallelujahLangListener ) ((HallelujahLangListener)listener).enterClass_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HallelujahLangListener ) ((HallelujahLangListener)listener).exitClass_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HallelujahLangVisitor ) return ((HallelujahLangVisitor<? extends T>)visitor).visitClass_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Class_declarationContext class_declaration() throws RecognitionException {
		Class_declarationContext _localctx = new Class_declarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_class_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			match(CLASS);
			setState(132);
			((Class_declarationContext)_localctx).ID = match(ID);
			setState(135);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(133);
				match(EXTENDS);
				setState(134);
				((Class_declarationContext)_localctx).ID = match(ID);
				}
			}

			setState(146);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS) {
				{
				setState(137);
				match(IMPLEMENTS);
				setState(138);
				((Class_declarationContext)_localctx).ID = match(ID);
				setState(143);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(139);
					match(COMMA);
					setState(140);
					((Class_declarationContext)_localctx).ID = match(ID);
					}
					}
					setState(145);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(148);
			match(LBRACE);

						List<ASTNode> body = new ArrayList<ASTNode>();
					
			setState(150);
			((Class_declarationContext)_localctx).class_body = class_body();
			body.add(((Class_declarationContext)_localctx).class_body.node);
			setState(152);
			match(RBRACE);

						((Class_declarationContext)_localctx).node =  new ClassDeclaration((((Class_declarationContext)_localctx).ID!=null?((Class_declarationContext)_localctx).ID.getText():null), body);
					
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
		public Variable_statementContext variable_statement;
		public Print_statementContext print_statement;
		public Input_statementContext input_statement;
		public If_statementContext if_statement;
		public While_statementContext while_statement;
		public Class_instanceContext class_instance;
		public Method_declarationContext method_declaration;
		public Method_call_classContext method_call_class;
		public Method_call_this_classContext method_call_this_class;
		public CommentContext comment;
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HallelujahLangListener ) ((HallelujahLangListener)listener).enterClass_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HallelujahLangListener ) ((HallelujahLangListener)listener).exitClass_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HallelujahLangVisitor ) return ((HallelujahLangVisitor<? extends T>)visitor).visitClass_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Class_bodyContext class_body() throws RecognitionException {
		Class_bodyContext _localctx = new Class_bodyContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_class_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 10696049146780928L) != 0)) {
				{
				setState(191);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					setState(155);
					((Class_bodyContext)_localctx).variable_statement = variable_statement();
					((Class_bodyContext)_localctx).node =  ((Class_bodyContext)_localctx).variable_statement.node;
					}
					break;
				case 2:
					{
					setState(158);
					array_declaration();
					((Class_bodyContext)_localctx).node =  ((Class_bodyContext)_localctx).print_statement.node;
					}
					break;
				case 3:
					{
					setState(161);
					((Class_bodyContext)_localctx).print_statement = print_statement();
					((Class_bodyContext)_localctx).node =  ((Class_bodyContext)_localctx).print_statement.node;
					}
					break;
				case 4:
					{
					setState(164);
					((Class_bodyContext)_localctx).input_statement = input_statement();
					((Class_bodyContext)_localctx).node =  ((Class_bodyContext)_localctx).input_statement.node;
					}
					break;
				case 5:
					{
					setState(167);
					((Class_bodyContext)_localctx).if_statement = if_statement();
					((Class_bodyContext)_localctx).node =  ((Class_bodyContext)_localctx).if_statement.node;
					}
					break;
				case 6:
					{
					setState(170);
					((Class_bodyContext)_localctx).while_statement = while_statement();
					((Class_bodyContext)_localctx).node =  ((Class_bodyContext)_localctx).while_statement.node;
					}
					break;
				case 7:
					{
					setState(173);
					((Class_bodyContext)_localctx).class_instance = class_instance();
					((Class_bodyContext)_localctx).node =  ((Class_bodyContext)_localctx).class_instance.node;
					}
					break;
				case 8:
					{
					setState(176);
					((Class_bodyContext)_localctx).method_declaration = method_declaration();
					((Class_bodyContext)_localctx).node =  ((Class_bodyContext)_localctx).method_declaration.node;
					}
					break;
				case 9:
					{
					setState(179);
					((Class_bodyContext)_localctx).method_call_class = method_call_class();
					((Class_bodyContext)_localctx).node =  ((Class_bodyContext)_localctx).method_call_class.node;
					setState(181);
					match(SEMICOLON);
					}
					break;
				case 10:
					{
					setState(183);
					((Class_bodyContext)_localctx).method_call_this_class = method_call_this_class();
					((Class_bodyContext)_localctx).node =  ((Class_bodyContext)_localctx).method_call_this_class.node;
					setState(185);
					match(SEMICOLON);
					}
					break;
				case 11:
					{
					setState(187);
					constructor_declaration();
					}
					break;
				case 12:
					{
					setState(188);
					((Class_bodyContext)_localctx).comment = comment();
					_localctx.node = ((Class_bodyContext)_localctx).comment.node
					}
					break;
				}
				}
				setState(195);
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
		public ASTNode node;
		public Token ID;
		public ArgumentsContext arguments;
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
		public TerminalNode RPAREN() { return getToken(HallelujahLangParser.RPAREN, 0); }
		public TerminalNode SEMICOLON() { return getToken(HallelujahLangParser.SEMICOLON, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public Class_instanceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_instance; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HallelujahLangListener ) ((HallelujahLangListener)listener).enterClass_instance(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HallelujahLangListener ) ((HallelujahLangListener)listener).exitClass_instance(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HallelujahLangVisitor ) return ((HallelujahLangVisitor<? extends T>)visitor).visitClass_instance(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Class_instanceContext class_instance() throws RecognitionException {
		Class_instanceContext _localctx = new Class_instanceContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_class_instance);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			data_type();
			setState(197);
			((Class_instanceContext)_localctx).ID = match(ID);
			setState(198);
			match(ASSIGN);
			setState(199);
			match(NEW);
			setState(200);
			((Class_instanceContext)_localctx).ID = match(ID);
			setState(201);
			match(LPAREN);
			setState(203);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 69841253507793920L) != 0)) {
				{
				setState(202);
				((Class_instanceContext)_localctx).arguments = arguments();
				}
			}

			setState(205);
			match(RPAREN);
			setState(206);
			match(SEMICOLON);
			((Class_instanceContext)_localctx).node =  new ClassInstance((((Class_instanceContext)_localctx).ID!=null?((Class_instanceContext)_localctx).ID.getText():null), ((Class_instanceContext)_localctx).arguments.list);
					
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HallelujahLangListener ) ((HallelujahLangListener)listener).enterVariable_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HallelujahLangListener ) ((HallelujahLangListener)listener).exitVariable_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HallelujahLangVisitor ) return ((HallelujahLangVisitor<? extends T>)visitor).visitVariable_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Variable_declarationContext variable_declaration() throws RecognitionException {
		Variable_declarationContext _localctx = new Variable_declarationContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_variable_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			((Variable_declarationContext)_localctx).data_type = data_type();
			setState(210);
			((Variable_declarationContext)_localctx).ID = match(ID);
			setState(213);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(211);
				match(ASSIGN);
				setState(212);
				((Variable_declarationContext)_localctx).expression = expression();
				}
			}

			setState(215);
			match(SEMICOLON);
			((Variable_declarationContext)_localctx).node =  new VariableDeclaration( (((Variable_declarationContext)_localctx).data_type!=null?_input.getText(((Variable_declarationContext)_localctx).data_type.start,((Variable_declarationContext)_localctx).data_type.stop):null), (((Variable_declarationContext)_localctx).ID!=null?((Variable_declarationContext)_localctx).ID.getText():null), ((Variable_declarationContext)_localctx).expression.node);
					
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HallelujahLangListener ) ((HallelujahLangListener)listener).enterVariable_assignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HallelujahLangListener ) ((HallelujahLangListener)listener).exitVariable_assignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HallelujahLangVisitor ) return ((HallelujahLangVisitor<? extends T>)visitor).visitVariable_assignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Variable_assignmentContext variable_assignment() throws RecognitionException {
		Variable_assignmentContext _localctx = new Variable_assignmentContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_variable_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			((Variable_assignmentContext)_localctx).ID = match(ID);
			setState(219);
			match(ASSIGN);
			setState(220);
			((Variable_assignmentContext)_localctx).expression = expression();
			setState(221);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HallelujahLangListener ) ((HallelujahLangListener)listener).enterVariable_reference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HallelujahLangListener ) ((HallelujahLangListener)listener).exitVariable_reference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HallelujahLangVisitor ) return ((HallelujahLangVisitor<? extends T>)visitor).visitVariable_reference(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Variable_referenceContext variable_reference() throws RecognitionException {
		Variable_referenceContext _localctx = new Variable_referenceContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_variable_reference);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			((Variable_referenceContext)_localctx).ID = match(ID);
			_localctx.node = new VariableReference((((Variable_referenceContext)_localctx).ID!=null?((Variable_referenceContext)_localctx).ID.getText():null))
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
		public ASTNode node;
		public Data_typeContext data_type;
		public ArgumentsContext arguments;
		public TerminalNode LPAREN() { return getToken(HallelujahLangParser.LPAREN, 0); }
		public Data_typeContext data_type() {
			return getRuleContext(Data_typeContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(HallelujahLangParser.RPAREN, 0); }
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HallelujahLangListener ) ((HallelujahLangListener)listener).enterArray_initializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HallelujahLangListener ) ((HallelujahLangListener)listener).exitArray_initializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HallelujahLangVisitor ) return ((HallelujahLangVisitor<? extends T>)visitor).visitArray_initializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Array_initializerContext array_initializer() throws RecognitionException {
		Array_initializerContext _localctx = new Array_initializerContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_array_initializer);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			match(LPAREN);
			setState(228);
			((Array_initializerContext)_localctx).data_type = data_type();
			setState(229);
			match(RPAREN);
			setState(230);
			match(LBRACKET);
			setState(231);
			((Array_initializerContext)_localctx).arguments = arguments();
			setState(238);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(232);
					match(LBRACKET);
					setState(233);
					((Array_initializerContext)_localctx).arguments = arguments();
					setState(234);
					match(RBRACKET);
					}
					} 
				}
				setState(240);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			}
			setState(241);
			match(RBRACKET);

			        ((Array_initializerContext)_localctx).node =  new ArrayInitializer((((Array_initializerContext)_localctx).data_type!=null?_input.getText(((Array_initializerContext)_localctx).data_type.start,((Array_initializerContext)_localctx).data_type.stop):null), ((Array_initializerContext)_localctx).arguments.list);
			    
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
		public ASTNode node;
		public Token ID;
		public ExpressionContext expression;
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HallelujahLangListener ) ((HallelujahLangListener)listener).enterArray_access(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HallelujahLangListener ) ((HallelujahLangListener)listener).exitArray_access(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HallelujahLangVisitor ) return ((HallelujahLangVisitor<? extends T>)visitor).visitArray_access(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Array_accessContext array_access() throws RecognitionException {
		Array_accessContext _localctx = new Array_accessContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_array_access);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(244);
			((Array_accessContext)_localctx).ID = match(ID);
			setState(245);
			match(LBRACKET);
			setState(246);
			((Array_accessContext)_localctx).expression = expression();
			setState(247);
			match(RBRACKET);

			        ((Array_accessContext)_localctx).node =  new ArrayAccess((((Array_accessContext)_localctx).ID!=null?((Array_accessContext)_localctx).ID.getText():null), ((Array_accessContext)_localctx).expression.node);
			    
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
		public ASTNode node;
		public Data_typeContext data_type;
		public Array_initializerContext array_initializer;
		public Token ID;
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HallelujahLangListener ) ((HallelujahLangListener)listener).enterArray_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HallelujahLangListener ) ((HallelujahLangListener)listener).exitArray_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HallelujahLangVisitor ) return ((HallelujahLangVisitor<? extends T>)visitor).visitArray_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Array_declarationContext array_declaration() throws RecognitionException {
		Array_declarationContext _localctx = new Array_declarationContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_array_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
			((Array_declarationContext)_localctx).data_type = data_type();
			setState(251);
			((Array_declarationContext)_localctx).array_initializer = array_initializer();
			setState(253);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(252);
				((Array_declarationContext)_localctx).array_initializer = array_initializer();
				}
			}

			setState(255);
			((Array_declarationContext)_localctx).ID = match(ID);
			setState(264);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SEMICOLON:
				{
				setState(256);
				match(SEMICOLON);
				}
				break;
			case ASSIGN:
				{
				setState(257);
				match(ASSIGN);
				setState(259);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(258);
					((Array_declarationContext)_localctx).ID = match(ID);
					}
				}

				setState(261);
				((Array_declarationContext)_localctx).array_initializer = array_initializer();
				setState(262);
				match(SEMICOLON);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}

			        // Lógica para determinar se há inicialização do array e criar o ArrayDeclaration correspondente
			        if (((Array_declarationContext)_localctx).array_initializer.node != null) {
			            ((Array_declarationContext)_localctx).node =  new ArrayDeclaration((((Array_declarationContext)_localctx).data_type!=null?_input.getText(((Array_declarationContext)_localctx).data_type.start,((Array_declarationContext)_localctx).data_type.stop):null), (((Array_declarationContext)_localctx).ID!=null?((Array_declarationContext)_localctx).ID.getText():null), ((Array_declarationContext)_localctx).array_initializer.node);
			        } else {
			            ((Array_declarationContext)_localctx).node =  new ArrayDeclaration((((Array_declarationContext)_localctx).data_type!=null?_input.getText(((Array_declarationContext)_localctx).data_type.start,((Array_declarationContext)_localctx).data_type.stop):null), (((Array_declarationContext)_localctx).ID!=null?((Array_declarationContext)_localctx).ID.getText():null));
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HallelujahLangListener ) ((HallelujahLangListener)listener).enterVariable_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HallelujahLangListener ) ((HallelujahLangListener)listener).exitVariable_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HallelujahLangVisitor ) return ((HallelujahLangVisitor<? extends T>)visitor).visitVariable_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Variable_statementContext variable_statement() throws RecognitionException {
		Variable_statementContext _localctx = new Variable_statementContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_variable_statement);
		try {
			setState(277);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(268);
				((Variable_statementContext)_localctx).variable_declaration = variable_declaration();
				_localctx.node = ((Variable_statementContext)_localctx).variable_declaration.node
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(271);
				((Variable_statementContext)_localctx).variable_assignment = variable_assignment();
				_localctx.node = ((Variable_statementContext)_localctx).variable_assignment.node
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(274);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HallelujahLangListener ) ((HallelujahLangListener)listener).enterParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HallelujahLangListener ) ((HallelujahLangListener)listener).exitParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HallelujahLangVisitor ) return ((HallelujahLangVisitor<? extends T>)visitor).visitParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametersContext parameters() throws RecognitionException {
		ParametersContext _localctx = new ParametersContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_parameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			List<Parameter> params = new ArrayList<Parameter>();
			{
			setState(280);
			((ParametersContext)_localctx).p = parameter();
			params.add(((ParametersContext)_localctx).p.param);
			setState(288);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(282);
				match(COMMA);
				setState(283);
				((ParametersContext)_localctx).p = parameter();
				params.add(((ParametersContext)_localctx).p.param);
				}
				}
				setState(290);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HallelujahLangListener ) ((HallelujahLangListener)listener).enterParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HallelujahLangListener ) ((HallelujahLangListener)listener).exitParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HallelujahLangVisitor ) return ((HallelujahLangVisitor<? extends T>)visitor).visitParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_parameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(293);
			((ParameterContext)_localctx).data_type = data_type();
			setState(294);
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
	public static class StatementContext extends ParserRuleContext {
		public ASTNode node;
		public If_statementContext if_statement;
		public While_statementContext while_statement;
		public Print_statementContext print_statement;
		public Input_statementContext input_statement;
		public Array_accessContext array_access;
		public Array_declarationContext array_declaration;
		public Class_instanceContext class_instance;
		public Method_callContext method_call;
		public Method_call_classContext method_call_class;
		public Method_call_this_classContext method_call_this_class;
		public CommentContext comment;
		public ExpressionContext expression;
		public If_statementContext if_statement() {
			return getRuleContext(If_statementContext.class,0);
		}
		public While_statementContext while_statement() {
			return getRuleContext(While_statementContext.class,0);
		}
		public Return_statementContext return_statement() {
			return getRuleContext(Return_statementContext.class,0);
		}
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
		public Method_callContext method_call() {
			return getRuleContext(Method_callContext.class,0);
		}
		public Method_call_classContext method_call_class() {
			return getRuleContext(Method_call_classContext.class,0);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HallelujahLangListener ) ((HallelujahLangListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HallelujahLangListener ) ((HallelujahLangListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HallelujahLangVisitor ) return ((HallelujahLangVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_statement);
		try {
			setState(334);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(297);
				((StatementContext)_localctx).if_statement = if_statement();
				((StatementContext)_localctx).node =  ((StatementContext)_localctx).if_statement.node;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(300);
				((StatementContext)_localctx).while_statement = while_statement();
				((StatementContext)_localctx).node =  ((StatementContext)_localctx).while_statement.node;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(303);
				return_statement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(304);
				((StatementContext)_localctx).print_statement = print_statement();
				((StatementContext)_localctx).node =  ((StatementContext)_localctx).print_statement.node;
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(307);
				((StatementContext)_localctx).input_statement = input_statement();
				((StatementContext)_localctx).node =  ((StatementContext)_localctx).input_statement.node;
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(310);
				((StatementContext)_localctx).array_access = array_access();
				((StatementContext)_localctx).node =  ((StatementContext)_localctx).array_access.node;
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(313);
				((StatementContext)_localctx).array_declaration = array_declaration();
				((StatementContext)_localctx).node =  ((StatementContext)_localctx).array_declaration.node;
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(316);
				((StatementContext)_localctx).class_instance = class_instance();
				((StatementContext)_localctx).node =  ((StatementContext)_localctx).class_instance.node;
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(319);
				((StatementContext)_localctx).method_call = method_call();
				((StatementContext)_localctx).node =  ((StatementContext)_localctx).method_call.node;
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(322);
				((StatementContext)_localctx).method_call_class = method_call_class();
				((StatementContext)_localctx).node =  ((StatementContext)_localctx).method_call_class.node;
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(325);
				((StatementContext)_localctx).method_call_this_class = method_call_this_class();
				((StatementContext)_localctx).node =  ((StatementContext)_localctx).method_call_this_class.node;
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(328);
				((StatementContext)_localctx).comment = comment();
				_localctx.node = ((StatementContext)_localctx).comment.node
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(331);
				((StatementContext)_localctx).expression = expression();
				((StatementContext)_localctx).node =  ((StatementContext)_localctx).expression.node;
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
	public static class If_statementContext extends ParserRuleContext {
		public ASTNode node;
		public ExpressionContext expression1;
		public StatementContext statement1;
		public ExpressionContext expression2;
		public StatementContext statement2;
		public StatementContext statement3;
		public TerminalNode IF() { return getToken(HallelujahLangParser.IF, 0); }
		public List<TerminalNode> LPAREN() { return getTokens(HallelujahLangParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(HallelujahLangParser.LPAREN, i);
		}
		public List<TerminalNode> RPAREN() { return getTokens(HallelujahLangParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(HallelujahLangParser.RPAREN, i);
		}
		public List<TerminalNode> LBRACE() { return getTokens(HallelujahLangParser.LBRACE); }
		public TerminalNode LBRACE(int i) {
			return getToken(HallelujahLangParser.LBRACE, i);
		}
		public List<TerminalNode> RBRACE() { return getTokens(HallelujahLangParser.RBRACE); }
		public TerminalNode RBRACE(int i) {
			return getToken(HallelujahLangParser.RBRACE, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(HallelujahLangParser.ELSE, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<TerminalNode> ELSEIF() { return getTokens(HallelujahLangParser.ELSEIF); }
		public TerminalNode ELSEIF(int i) {
			return getToken(HallelujahLangParser.ELSEIF, i);
		}
		public If_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HallelujahLangListener ) ((HallelujahLangListener)listener).enterIf_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HallelujahLangListener ) ((HallelujahLangListener)listener).exitIf_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HallelujahLangVisitor ) return ((HallelujahLangVisitor<? extends T>)visitor).visitIf_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_statementContext if_statement() throws RecognitionException {
		If_statementContext _localctx = new If_statementContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_if_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(336);
			match(IF);
			setState(337);
			match(LPAREN);
			setState(338);
			((If_statementContext)_localctx).expression1 = expression();
			setState(339);
			match(RPAREN);
			setState(340);
			match(LBRACE);

			        List<ASTNode> body = new ArrayList<ASTNode>();
			    
			setState(347);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 71530103399840768L) != 0)) {
				{
				{
				setState(342);
				((If_statementContext)_localctx).statement1 = statement();
				body.add(((If_statementContext)_localctx).statement1.node);
				}
				}
				setState(349);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(350);
			match(RBRACE);
			setState(384);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE || _la==ELSEIF) {
				{
				setState(369);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ELSEIF) {
					{
					{
					setState(351);
					match(ELSEIF);
					setState(352);
					match(LPAREN);
					setState(353);
					((If_statementContext)_localctx).expression2 = expression();
					setState(354);
					match(RPAREN);
					setState(355);
					match(LBRACE);

								List<ASTNode> elseIfBody = new ArrayList<ASTNode>();
							
					setState(362);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 71530103399840768L) != 0)) {
						{
						{
						setState(357);
						((If_statementContext)_localctx).statement2 = statement();
						elseIfBody.add(((If_statementContext)_localctx).statement2.node);
						}
						}
						setState(364);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(365);
					match(RBRACE);
					}
					}
					setState(371);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(372);
				match(ELSE);
				setState(373);
				match(LBRACE);
				 
							List<ASTNode> elseBody = new ArrayList<ASTNode>();
						
				setState(380);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 71530103399840768L) != 0)) {
					{
					{
					setState(375);
					((If_statementContext)_localctx).statement3 = statement();
					elseBody.add(((If_statementContext)_localctx).statement3.node);
					}
					}
					setState(382);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(383);
				match(RBRACE);
				}
			}


					((If_statementContext)_localctx).node =  new If(((If_statementContext)_localctx).expression1.node, body, ((If_statementContext)_localctx).expression2.node, elseIfBody, elseBody);
				
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
		public StatementContext statement;
		public TerminalNode WHILE() { return getToken(HallelujahLangParser.WHILE, 0); }
		public TerminalNode LPAREN() { return getToken(HallelujahLangParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(HallelujahLangParser.RPAREN, 0); }
		public TerminalNode LBRACE() { return getToken(HallelujahLangParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(HallelujahLangParser.RBRACE, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public While_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HallelujahLangListener ) ((HallelujahLangListener)listener).enterWhile_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HallelujahLangListener ) ((HallelujahLangListener)listener).exitWhile_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HallelujahLangVisitor ) return ((HallelujahLangVisitor<? extends T>)visitor).visitWhile_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_statementContext while_statement() throws RecognitionException {
		While_statementContext _localctx = new While_statementContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_while_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(388);
			match(WHILE);
			setState(389);
			match(LPAREN);
			setState(390);
			((While_statementContext)_localctx).expression = expression();
			setState(391);
			match(RPAREN);
			setState(392);
			match(LBRACE);

			        List<ASTNode> body = new ArrayList<ASTNode>();
			    
			setState(399);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 71530103399840768L) != 0)) {
				{
				{
				setState(394);
				((While_statementContext)_localctx).statement = statement();
				body.add(((While_statementContext)_localctx).statement.node);
				}
				}
				setState(401);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(402);
			match(RBRACE);

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
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Aritmetical_expressionContext aritmetical_expression() {
			return getRuleContext(Aritmetical_expressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(HallelujahLangParser.SEMICOLON, 0); }
		public Return_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HallelujahLangListener ) ((HallelujahLangListener)listener).enterReturn_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HallelujahLangListener ) ((HallelujahLangListener)listener).exitReturn_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HallelujahLangVisitor ) return ((HallelujahLangVisitor<? extends T>)visitor).visitReturn_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Return_statementContext return_statement() throws RecognitionException {
		Return_statementContext _localctx = new Return_statementContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_return_statement);
		try {
			setState(410);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RETURN:
				enterOuterAlt(_localctx, 1);
				{
				setState(405);
				match(RETURN);
				setState(406);
				expression();
				}
				break;
			case THIS:
			case NULL:
			case NOT:
			case LPAREN:
			case BOOL_CONST:
			case FLOAT_CONST:
			case ID:
			case INT_CONST:
			case STRING_CONST:
				enterOuterAlt(_localctx, 2);
				{
				setState(407);
				aritmetical_expression();
				setState(408);
				match(SEMICOLON);
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
	public static class Method_declarationContext extends ParserRuleContext {
		public ASTNode node;
		public Data_typeContext data_type;
		public Token ID;
		public ParametersContext parameters;
		public StatementContext statement;
		public Data_typeContext data_type() {
			return getRuleContext(Data_typeContext.class,0);
		}
		public TerminalNode METHOD() { return getToken(HallelujahLangParser.METHOD, 0); }
		public TerminalNode ID() { return getToken(HallelujahLangParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(HallelujahLangParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(HallelujahLangParser.RPAREN, 0); }
		public TerminalNode LBRACE() { return getToken(HallelujahLangParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(HallelujahLangParser.RBRACE, 0); }
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public Method_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HallelujahLangListener ) ((HallelujahLangListener)listener).enterMethod_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HallelujahLangListener ) ((HallelujahLangListener)listener).exitMethod_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HallelujahLangVisitor ) return ((HallelujahLangVisitor<? extends T>)visitor).visitMethod_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Method_declarationContext method_declaration() throws RecognitionException {
		Method_declarationContext _localctx = new Method_declarationContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_method_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(412);
			((Method_declarationContext)_localctx).data_type = data_type();
			setState(413);
			match(METHOD);
			setState(414);
			((Method_declarationContext)_localctx).ID = match(ID);
			setState(415);
			match(LPAREN);
			setState(417);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 31719424L) != 0)) {
				{
				setState(416);
				((Method_declarationContext)_localctx).parameters = parameters();
				}
			}

			setState(419);
			match(RPAREN);

					List<ASTNode> body = new ArrayList<ASTNode>();
					Map<String, Object> localSymbolTable = new HashMap<String, Object>();
				
			setState(421);
			match(LBRACE);
			setState(427);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 71530103399840768L) != 0)) {
				{
				{
				setState(422);
				((Method_declarationContext)_localctx).statement = statement();
				body.add(((Method_declarationContext)_localctx).statement.node);
				}
				}
				setState(429);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(430);
			match(RBRACE);
			((Method_declarationContext)_localctx).node =  new MethodDeclaration((((Method_declarationContext)_localctx).data_type!=null?_input.getText(((Method_declarationContext)_localctx).data_type.start,((Method_declarationContext)_localctx).data_type.stop):null), (((Method_declarationContext)_localctx).ID!=null?((Method_declarationContext)_localctx).ID.getText():null), body, localSymbolTable, ((Method_declarationContext)_localctx).parameters.list);
					
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
		public TerminalNode RPAREN() { return getToken(HallelujahLangParser.RPAREN, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public Method_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HallelujahLangListener ) ((HallelujahLangListener)listener).enterMethod_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HallelujahLangListener ) ((HallelujahLangListener)listener).exitMethod_call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HallelujahLangVisitor ) return ((HallelujahLangVisitor<? extends T>)visitor).visitMethod_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Method_callContext method_call() throws RecognitionException {
		Method_callContext _localctx = new Method_callContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_method_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(433);
			((Method_callContext)_localctx).ID = match(ID);
			setState(434);
			match(LPAREN);
			setState(436);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 69841253507793920L) != 0)) {
				{
				setState(435);
				((Method_callContext)_localctx).arguments = arguments();
				}
			}

			setState(438);
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
		public ASTNode node;
		public Token ID;
		public ArgumentsContext arguments;
		public List<TerminalNode> ID() { return getTokens(HallelujahLangParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(HallelujahLangParser.ID, i);
		}
		public TerminalNode DOT() { return getToken(HallelujahLangParser.DOT, 0); }
		public TerminalNode LPAREN() { return getToken(HallelujahLangParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(HallelujahLangParser.RPAREN, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public Method_call_classContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_call_class; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HallelujahLangListener ) ((HallelujahLangListener)listener).enterMethod_call_class(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HallelujahLangListener ) ((HallelujahLangListener)listener).exitMethod_call_class(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HallelujahLangVisitor ) return ((HallelujahLangVisitor<? extends T>)visitor).visitMethod_call_class(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Method_call_classContext method_call_class() throws RecognitionException {
		Method_call_classContext _localctx = new Method_call_classContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_method_call_class);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(441);
			((Method_call_classContext)_localctx).ID = match(ID);
			setState(442);
			match(DOT);
			setState(443);
			((Method_call_classContext)_localctx).ID = match(ID);
			setState(444);
			match(LPAREN);
			setState(446);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 69841253507793920L) != 0)) {
				{
				setState(445);
				((Method_call_classContext)_localctx).arguments = arguments();
				}
			}

			setState(448);
			match(RPAREN);
			_localctx.node = new MethodCall((((Method_call_classContext)_localctx).ID!=null?((Method_call_classContext)_localctx).ID.getText():null), ((Method_call_classContext)_localctx).arguments.list)
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
		public ASTNode node;
		public Token ID;
		public ArgumentsContext arguments;
		public TerminalNode THIS() { return getToken(HallelujahLangParser.THIS, 0); }
		public TerminalNode DOT() { return getToken(HallelujahLangParser.DOT, 0); }
		public TerminalNode ID() { return getToken(HallelujahLangParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(HallelujahLangParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(HallelujahLangParser.RPAREN, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public Method_call_this_classContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_call_this_class; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HallelujahLangListener ) ((HallelujahLangListener)listener).enterMethod_call_this_class(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HallelujahLangListener ) ((HallelujahLangListener)listener).exitMethod_call_this_class(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HallelujahLangVisitor ) return ((HallelujahLangVisitor<? extends T>)visitor).visitMethod_call_this_class(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Method_call_this_classContext method_call_this_class() throws RecognitionException {
		Method_call_this_classContext _localctx = new Method_call_this_classContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_method_call_this_class);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(451);
			match(THIS);
			setState(452);
			match(DOT);
			setState(453);
			((Method_call_this_classContext)_localctx).ID = match(ID);
			setState(454);
			match(LPAREN);
			setState(456);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 69841253507793920L) != 0)) {
				{
				setState(455);
				((Method_call_this_classContext)_localctx).arguments = arguments();
				}
			}

			setState(458);
			match(RPAREN);
			_localctx.node = new MethodCall((((Method_call_this_classContext)_localctx).ID!=null?((Method_call_this_classContext)_localctx).ID.getText():null), ((Method_call_this_classContext)_localctx).arguments.list)
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
		public ExpressionContext expression;
		public TerminalNode PRINT() { return getToken(HallelujahLangParser.PRINT, 0); }
		public TerminalNode LPAREN() { return getToken(HallelujahLangParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(HallelujahLangParser.RPAREN, 0); }
		public TerminalNode SEMICOLON() { return getToken(HallelujahLangParser.SEMICOLON, 0); }
		public Print_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HallelujahLangListener ) ((HallelujahLangListener)listener).enterPrint_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HallelujahLangListener ) ((HallelujahLangListener)listener).exitPrint_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HallelujahLangVisitor ) return ((HallelujahLangVisitor<? extends T>)visitor).visitPrint_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Print_statementContext print_statement() throws RecognitionException {
		Print_statementContext _localctx = new Print_statementContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_print_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(461);
			match(PRINT);
			setState(462);
			match(LPAREN);
			setState(463);
			((Print_statementContext)_localctx).expression = expression();
			setState(464);
			match(RPAREN);
			setState(465);
			match(SEMICOLON);
			((Print_statementContext)_localctx).node =  new Print(((Print_statementContext)_localctx).expression.node);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HallelujahLangListener ) ((HallelujahLangListener)listener).enterInput_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HallelujahLangListener ) ((HallelujahLangListener)listener).exitInput_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HallelujahLangVisitor ) return ((HallelujahLangVisitor<? extends T>)visitor).visitInput_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Input_statementContext input_statement() throws RecognitionException {
		Input_statementContext _localctx = new Input_statementContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_input_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(468);
			match(INPUT);
			setState(469);
			match(LPAREN);
			setState(470);
			((Input_statementContext)_localctx).ID = match(ID);
			setState(471);
			match(RPAREN);
			setState(472);
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
		public ASTNode node;
		public Token ID;
		public Interface_bodyContext interface_body;
		public TerminalNode INTERFACE() { return getToken(HallelujahLangParser.INTERFACE, 0); }
		public TerminalNode ID() { return getToken(HallelujahLangParser.ID, 0); }
		public TerminalNode LBRACE() { return getToken(HallelujahLangParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(HallelujahLangParser.RBRACE, 0); }
		public List<Interface_bodyContext> interface_body() {
			return getRuleContexts(Interface_bodyContext.class);
		}
		public Interface_bodyContext interface_body(int i) {
			return getRuleContext(Interface_bodyContext.class,i);
		}
		public Interface_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interface_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HallelujahLangListener ) ((HallelujahLangListener)listener).enterInterface_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HallelujahLangListener ) ((HallelujahLangListener)listener).exitInterface_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HallelujahLangVisitor ) return ((HallelujahLangVisitor<? extends T>)visitor).visitInterface_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Interface_declarationContext interface_declaration() throws RecognitionException {
		Interface_declarationContext _localctx = new Interface_declarationContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_interface_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(475);
			match(INTERFACE);
			setState(476);
			((Interface_declarationContext)_localctx).ID = match(ID);
			setState(477);
			match(LBRACE);

					List<ASTNode> body = new ArrayList<ASTNode>();
					Map<String, Object> localSymbolTable = new HashMap<String, Object>();
				
			setState(484);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 31719424L) != 0)) {
				{
				{
				setState(479);
				((Interface_declarationContext)_localctx).interface_body = interface_body();
				body.add(((Interface_declarationContext)_localctx).interface_body.node);
				}
				}
				setState(486);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(487);
			match(RBRACE);
			((Interface_declarationContext)_localctx).node =  new InterfaceDeclaration((((Interface_declarationContext)_localctx).ID!=null?((Interface_declarationContext)_localctx).ID.getText():null), body, localSymbolTable);
					
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
		public Method_callContext method_call;
		public Method_declarationContext method_declaration() {
			return getRuleContext(Method_declarationContext.class,0);
		}
		public Data_typeContext data_type() {
			return getRuleContext(Data_typeContext.class,0);
		}
		public Method_callContext method_call() {
			return getRuleContext(Method_callContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(HallelujahLangParser.SEMICOLON, 0); }
		public Interface_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interface_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HallelujahLangListener ) ((HallelujahLangListener)listener).enterInterface_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HallelujahLangListener ) ((HallelujahLangListener)listener).exitInterface_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HallelujahLangVisitor ) return ((HallelujahLangVisitor<? extends T>)visitor).visitInterface_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Interface_bodyContext interface_body() throws RecognitionException {
		Interface_bodyContext _localctx = new Interface_bodyContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_interface_body);
		try {
			setState(498);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(490);
				((Interface_bodyContext)_localctx).method_declaration = method_declaration();
				((Interface_bodyContext)_localctx).node =  ((Interface_bodyContext)_localctx).method_declaration.node;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(493);
				data_type();
				setState(494);
				((Interface_bodyContext)_localctx).method_call = method_call();
				((Interface_bodyContext)_localctx).node =  ((Interface_bodyContext)_localctx).method_call.node;
				setState(496);
				match(SEMICOLON);
				}
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HallelujahLangListener ) ((HallelujahLangListener)listener).enterArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HallelujahLangListener ) ((HallelujahLangListener)listener).exitArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HallelujahLangVisitor ) return ((HallelujahLangVisitor<? extends T>)visitor).visitArguments(this);
			else return visitor.visitChildren(this);
		}
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
			setState(501);
			((ArgumentsContext)_localctx).e = expression();
			args.add(((ArgumentsContext)_localctx).e.node);
			setState(509);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(503);
				match(COMMA);
				setState(504);
				((ArgumentsContext)_localctx).e = expression();
				args.add(((ArgumentsContext)_localctx).e.node);
				}
				}
				setState(511);
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
	public static class Constructor_declarationContext extends ParserRuleContext {
		public ASTNode node;
		public ParametersContext parameters;
		public Constructor_bodyContext constructor_body;
		public TerminalNode CONSTRUCTOR() { return getToken(HallelujahLangParser.CONSTRUCTOR, 0); }
		public TerminalNode LPAREN() { return getToken(HallelujahLangParser.LPAREN, 0); }
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HallelujahLangListener ) ((HallelujahLangListener)listener).enterConstructor_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HallelujahLangListener ) ((HallelujahLangListener)listener).exitConstructor_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HallelujahLangVisitor ) return ((HallelujahLangVisitor<? extends T>)visitor).visitConstructor_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Constructor_declarationContext constructor_declaration() throws RecognitionException {
		Constructor_declarationContext _localctx = new Constructor_declarationContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_constructor_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(514);
			match(CONSTRUCTOR);
			setState(515);
			match(LPAREN);
			setState(516);
			((Constructor_declarationContext)_localctx).parameters = parameters();
			setState(517);
			match(RPAREN);
			setState(518);
			match(LBRACE);

					List<ASTNode> body = new ArrayList<ASTNode>();
				
			setState(520);
			((Constructor_declarationContext)_localctx).constructor_body = constructor_body();
			body.add(((Constructor_declarationContext)_localctx).constructor_body.node);
			setState(522);
			match(RBRACE);
			_localctx.node = new ConstructorDeclaration(((Constructor_declarationContext)_localctx).parameters.list, body)
					
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
		public ASTNode node;
		public List<Data_typeContext> data_type() {
			return getRuleContexts(Data_typeContext.class);
		}
		public Data_typeContext data_type(int i) {
			return getRuleContext(Data_typeContext.class,i);
		}
		public List<TerminalNode> THIS() { return getTokens(HallelujahLangParser.THIS); }
		public TerminalNode THIS(int i) {
			return getToken(HallelujahLangParser.THIS, i);
		}
		public List<TerminalNode> DOT() { return getTokens(HallelujahLangParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(HallelujahLangParser.DOT, i);
		}
		public List<TerminalNode> ID() { return getTokens(HallelujahLangParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(HallelujahLangParser.ID, i);
		}
		public List<TerminalNode> ASSIGN() { return getTokens(HallelujahLangParser.ASSIGN); }
		public TerminalNode ASSIGN(int i) {
			return getToken(HallelujahLangParser.ASSIGN, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(HallelujahLangParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(HallelujahLangParser.SEMICOLON, i);
		}
		public Constructor_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructor_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HallelujahLangListener ) ((HallelujahLangListener)listener).enterConstructor_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HallelujahLangListener ) ((HallelujahLangListener)listener).exitConstructor_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HallelujahLangVisitor ) return ((HallelujahLangVisitor<? extends T>)visitor).visitConstructor_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Constructor_bodyContext constructor_body() throws RecognitionException {
		Constructor_bodyContext _localctx = new Constructor_bodyContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_constructor_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(535);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 31719424L) != 0)) {
				{
				{
				setState(525);
				data_type();
				setState(526);
				match(THIS);
				setState(527);
				match(DOT);
				setState(528);
				match(ID);
				setState(529);
				match(ASSIGN);
				setState(530);
				expression();
				setState(531);
				match(SEMICOLON);
				}
				}
				setState(537);
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
	public static class Aritmetical_expressionContext extends ParserRuleContext {
		public ASTNode node;
		public OperandContext operand;
		public Token ARITMETICAL_OPERATORS;
		public OperandContext right;
		public List<OperandContext> operand() {
			return getRuleContexts(OperandContext.class);
		}
		public OperandContext operand(int i) {
			return getRuleContext(OperandContext.class,i);
		}
		public List<TerminalNode> ARITMETICAL_OPERATORS() { return getTokens(HallelujahLangParser.ARITMETICAL_OPERATORS); }
		public TerminalNode ARITMETICAL_OPERATORS(int i) {
			return getToken(HallelujahLangParser.ARITMETICAL_OPERATORS, i);
		}
		public Aritmetical_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aritmetical_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HallelujahLangListener ) ((HallelujahLangListener)listener).enterAritmetical_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HallelujahLangListener ) ((HallelujahLangListener)listener).exitAritmetical_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HallelujahLangVisitor ) return ((HallelujahLangVisitor<? extends T>)visitor).visitAritmetical_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Aritmetical_expressionContext aritmetical_expression() throws RecognitionException {
		Aritmetical_expressionContext _localctx = new Aritmetical_expressionContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_aritmetical_expression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(538);
			((Aritmetical_expressionContext)_localctx).operand = operand();
			((Aritmetical_expressionContext)_localctx).node =  ((Aritmetical_expressionContext)_localctx).operand.node;
			setState(546);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(540);
					((Aritmetical_expressionContext)_localctx).ARITMETICAL_OPERATORS = match(ARITMETICAL_OPERATORS);
					setState(541);
					((Aritmetical_expressionContext)_localctx).right = ((Aritmetical_expressionContext)_localctx).operand = operand();

					            ((Aritmetical_expressionContext)_localctx).node =  new AritmeticalOperations(_localctx.node, ((Aritmetical_expressionContext)_localctx).right.node, (((Aritmetical_expressionContext)_localctx).ARITMETICAL_OPERATORS!=null?((Aritmetical_expressionContext)_localctx).ARITMETICAL_OPERATORS.getText():null));
					        
					}
					} 
				}
				setState(548);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
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
	public static class Equality_expressionContext extends ParserRuleContext {
		public ASTNode node;
		public OperandContext operand;
		public Token EQUALITY_OPERATORS;
		public OperandContext right;
		public List<OperandContext> operand() {
			return getRuleContexts(OperandContext.class);
		}
		public OperandContext operand(int i) {
			return getRuleContext(OperandContext.class,i);
		}
		public List<TerminalNode> EQUALITY_OPERATORS() { return getTokens(HallelujahLangParser.EQUALITY_OPERATORS); }
		public TerminalNode EQUALITY_OPERATORS(int i) {
			return getToken(HallelujahLangParser.EQUALITY_OPERATORS, i);
		}
		public Equality_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equality_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HallelujahLangListener ) ((HallelujahLangListener)listener).enterEquality_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HallelujahLangListener ) ((HallelujahLangListener)listener).exitEquality_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HallelujahLangVisitor ) return ((HallelujahLangVisitor<? extends T>)visitor).visitEquality_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Equality_expressionContext equality_expression() throws RecognitionException {
		Equality_expressionContext _localctx = new Equality_expressionContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_equality_expression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(549);
			((Equality_expressionContext)_localctx).operand = operand();
			((Equality_expressionContext)_localctx).node =  ((Equality_expressionContext)_localctx).operand.node;
			setState(557);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(551);
					((Equality_expressionContext)_localctx).EQUALITY_OPERATORS = match(EQUALITY_OPERATORS);
					setState(552);
					((Equality_expressionContext)_localctx).right = ((Equality_expressionContext)_localctx).operand = operand();

					            ((Equality_expressionContext)_localctx).node =  new ComparisonOperations(_localctx.node, ((Equality_expressionContext)_localctx).right.node, (((Equality_expressionContext)_localctx).EQUALITY_OPERATORS!=null?((Equality_expressionContext)_localctx).EQUALITY_OPERATORS.getText():null));
					        
					}
					} 
				}
				setState(559);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
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
	public static class Comparison_expressionContext extends ParserRuleContext {
		public ASTNode node;
		public OperandContext operand;
		public Token COMPARISON_OPERATORS;
		public OperandContext right;
		public List<OperandContext> operand() {
			return getRuleContexts(OperandContext.class);
		}
		public OperandContext operand(int i) {
			return getRuleContext(OperandContext.class,i);
		}
		public List<TerminalNode> COMPARISON_OPERATORS() { return getTokens(HallelujahLangParser.COMPARISON_OPERATORS); }
		public TerminalNode COMPARISON_OPERATORS(int i) {
			return getToken(HallelujahLangParser.COMPARISON_OPERATORS, i);
		}
		public Comparison_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparison_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HallelujahLangListener ) ((HallelujahLangListener)listener).enterComparison_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HallelujahLangListener ) ((HallelujahLangListener)listener).exitComparison_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HallelujahLangVisitor ) return ((HallelujahLangVisitor<? extends T>)visitor).visitComparison_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Comparison_expressionContext comparison_expression() throws RecognitionException {
		Comparison_expressionContext _localctx = new Comparison_expressionContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_comparison_expression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(560);
			((Comparison_expressionContext)_localctx).operand = operand();
			((Comparison_expressionContext)_localctx).node =  ((Comparison_expressionContext)_localctx).operand.node;
			setState(568);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(562);
					((Comparison_expressionContext)_localctx).COMPARISON_OPERATORS = match(COMPARISON_OPERATORS);
					setState(563);
					((Comparison_expressionContext)_localctx).right = ((Comparison_expressionContext)_localctx).operand = operand();
					((Comparison_expressionContext)_localctx).node =  new ComparisonOperations(_localctx.node, ((Comparison_expressionContext)_localctx).right.node, (((Comparison_expressionContext)_localctx).COMPARISON_OPERATORS!=null?((Comparison_expressionContext)_localctx).COMPARISON_OPERATORS.getText():null));
								
					}
					} 
				}
				setState(570);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HallelujahLangListener ) ((HallelujahLangListener)listener).enterLogical_not_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HallelujahLangListener ) ((HallelujahLangListener)listener).exitLogical_not_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HallelujahLangVisitor ) return ((HallelujahLangVisitor<? extends T>)visitor).visitLogical_not_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Logical_not_expressionContext logical_not_expression() throws RecognitionException {
		Logical_not_expressionContext _localctx = new Logical_not_expressionContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_logical_not_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(571);
			match(NOT);
			setState(572);
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
	public static class Logical_or_expressionContext extends ParserRuleContext {
		public ASTNode node;
		public Logical_and_expressionContext logical_and_expression;
		public Logical_and_expressionContext right;
		public List<Logical_and_expressionContext> logical_and_expression() {
			return getRuleContexts(Logical_and_expressionContext.class);
		}
		public Logical_and_expressionContext logical_and_expression(int i) {
			return getRuleContext(Logical_and_expressionContext.class,i);
		}
		public List<TerminalNode> OR() { return getTokens(HallelujahLangParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(HallelujahLangParser.OR, i);
		}
		public Logical_or_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logical_or_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HallelujahLangListener ) ((HallelujahLangListener)listener).enterLogical_or_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HallelujahLangListener ) ((HallelujahLangListener)listener).exitLogical_or_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HallelujahLangVisitor ) return ((HallelujahLangVisitor<? extends T>)visitor).visitLogical_or_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Logical_or_expressionContext logical_or_expression() throws RecognitionException {
		Logical_or_expressionContext _localctx = new Logical_or_expressionContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_logical_or_expression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(575);
			((Logical_or_expressionContext)_localctx).logical_and_expression = logical_and_expression();
			((Logical_or_expressionContext)_localctx).node =  ((Logical_or_expressionContext)_localctx).logical_and_expression.node;
			setState(583);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(577);
					match(OR);
					setState(578);
					((Logical_or_expressionContext)_localctx).right = ((Logical_or_expressionContext)_localctx).logical_and_expression = logical_and_expression();
					((Logical_or_expressionContext)_localctx).node =  new LogicalOr(_localctx.node, ((Logical_or_expressionContext)_localctx).right.node);
					}
					} 
				}
				setState(585);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
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
	public static class Logical_and_expressionContext extends ParserRuleContext {
		public ASTNode node;
		public Equality_expressionContext equality_expression;
		public Equality_expressionContext right;
		public List<Equality_expressionContext> equality_expression() {
			return getRuleContexts(Equality_expressionContext.class);
		}
		public Equality_expressionContext equality_expression(int i) {
			return getRuleContext(Equality_expressionContext.class,i);
		}
		public List<TerminalNode> AND() { return getTokens(HallelujahLangParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(HallelujahLangParser.AND, i);
		}
		public Logical_and_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logical_and_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HallelujahLangListener ) ((HallelujahLangListener)listener).enterLogical_and_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HallelujahLangListener ) ((HallelujahLangListener)listener).exitLogical_and_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HallelujahLangVisitor ) return ((HallelujahLangVisitor<? extends T>)visitor).visitLogical_and_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Logical_and_expressionContext logical_and_expression() throws RecognitionException {
		Logical_and_expressionContext _localctx = new Logical_and_expressionContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_logical_and_expression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(586);
			((Logical_and_expressionContext)_localctx).equality_expression = equality_expression();
			((Logical_and_expressionContext)_localctx).node =  ((Logical_and_expressionContext)_localctx).equality_expression.node;
			setState(594);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(588);
					match(AND);
					setState(589);
					((Logical_and_expressionContext)_localctx).right = ((Logical_and_expressionContext)_localctx).equality_expression = equality_expression();
					((Logical_and_expressionContext)_localctx).node =  new LogicalAnd(_localctx.node, ((Logical_and_expressionContext)_localctx).right.node);
					}
					} 
				}
				setState(596);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
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
		public Binary_operationContext binary_operation;
		public OperandContext operand;
		public Binary_operationContext binary_operation() {
			return getRuleContext(Binary_operationContext.class,0);
		}
		public OperandContext operand() {
			return getRuleContext(OperandContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HallelujahLangListener ) ((HallelujahLangListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HallelujahLangListener ) ((HallelujahLangListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HallelujahLangVisitor ) return ((HallelujahLangVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_expression);
		try {
			setState(603);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(597);
				((ExpressionContext)_localctx).binary_operation = binary_operation();
				((ExpressionContext)_localctx).node =  ((ExpressionContext)_localctx).binary_operation.node;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(600);
				((ExpressionContext)_localctx).operand = operand();
				((ExpressionContext)_localctx).node =  ((ExpressionContext)_localctx).operand.node;
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
		public ASTNode node;
		public Aritmetical_expressionContext aritmetical_expression;
		public Equality_expressionContext equality_expression;
		public Comparison_expressionContext comparison_expression;
		public Logical_not_expressionContext logical_not_expression;
		public Logical_and_expressionContext logical_and_expression;
		public Logical_or_expressionContext logical_or_expression;
		public Aritmetical_expressionContext aritmetical_expression() {
			return getRuleContext(Aritmetical_expressionContext.class,0);
		}
		public Equality_expressionContext equality_expression() {
			return getRuleContext(Equality_expressionContext.class,0);
		}
		public Comparison_expressionContext comparison_expression() {
			return getRuleContext(Comparison_expressionContext.class,0);
		}
		public Logical_not_expressionContext logical_not_expression() {
			return getRuleContext(Logical_not_expressionContext.class,0);
		}
		public Logical_and_expressionContext logical_and_expression() {
			return getRuleContext(Logical_and_expressionContext.class,0);
		}
		public Logical_or_expressionContext logical_or_expression() {
			return getRuleContext(Logical_or_expressionContext.class,0);
		}
		public Binary_operationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binary_operation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HallelujahLangListener ) ((HallelujahLangListener)listener).enterBinary_operation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HallelujahLangListener ) ((HallelujahLangListener)listener).exitBinary_operation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HallelujahLangVisitor ) return ((HallelujahLangVisitor<? extends T>)visitor).visitBinary_operation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Binary_operationContext binary_operation() throws RecognitionException {
		Binary_operationContext _localctx = new Binary_operationContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_binary_operation);
		try {
			setState(623);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(605);
				((Binary_operationContext)_localctx).aritmetical_expression = aritmetical_expression();
				_localctx.node = ((Binary_operationContext)_localctx).aritmetical_expression.node
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(608);
				((Binary_operationContext)_localctx).equality_expression = equality_expression();
				_localctx.node = ((Binary_operationContext)_localctx).equality_expression.node
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(611);
				((Binary_operationContext)_localctx).comparison_expression = comparison_expression();
				_localctx.node = ((Binary_operationContext)_localctx).comparison_expression.node
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(614);
				((Binary_operationContext)_localctx).logical_not_expression = logical_not_expression();
				_localctx.node = ((Binary_operationContext)_localctx).logical_not_expression.node
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(617);
				((Binary_operationContext)_localctx).logical_and_expression = logical_and_expression();
				_localctx.node = ((Binary_operationContext)_localctx).logical_and_expression.node
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(620);
				((Binary_operationContext)_localctx).logical_or_expression = logical_or_expression();
				_localctx.node = ((Binary_operationContext)_localctx).logical_or_expression.node
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HallelujahLangListener ) ((HallelujahLangListener)listener).enterOperand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HallelujahLangListener ) ((HallelujahLangListener)listener).exitOperand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HallelujahLangVisitor ) return ((HallelujahLangVisitor<? extends T>)visitor).visitOperand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperandContext operand() throws RecognitionException {
		OperandContext _localctx = new OperandContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_operand);
		try {
			setState(634);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(625);
				((OperandContext)_localctx).logical_not_expression = logical_not_expression();
				((OperandContext)_localctx).node =  ((OperandContext)_localctx).logical_not_expression.node;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(628);
				((OperandContext)_localctx).value = value();
				((OperandContext)_localctx).node =  ((OperandContext)_localctx).value.node;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(631);
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
	public static class CallingsContext extends ParserRuleContext {
		public ASTNode node;
		public Method_call_classContext method_call_class;
		public Array_initializerContext array_initializer;
		public Method_callContext method_call;
		public Method_call_this_classContext method_call_this_class;
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HallelujahLangListener ) ((HallelujahLangListener)listener).enterCallings(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HallelujahLangListener ) ((HallelujahLangListener)listener).exitCallings(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HallelujahLangVisitor ) return ((HallelujahLangVisitor<? extends T>)visitor).visitCallings(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallingsContext callings() throws RecognitionException {
		CallingsContext _localctx = new CallingsContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_callings);
		try {
			setState(652);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(636);
				((CallingsContext)_localctx).method_call_class = method_call_class();
				((CallingsContext)_localctx).node =  ((CallingsContext)_localctx).method_call_class.node;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(639);
				((CallingsContext)_localctx).array_initializer = array_initializer();
				((CallingsContext)_localctx).node =  ((CallingsContext)_localctx).array_initializer.node;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(642);
				match(ID);
				setState(643);
				((CallingsContext)_localctx).array_initializer = array_initializer();
				((CallingsContext)_localctx).node =  ((CallingsContext)_localctx).array_initializer.node;
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(646);
				((CallingsContext)_localctx).method_call = method_call();
				((CallingsContext)_localctx).node =  ((CallingsContext)_localctx).method_call.node;
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(649);
				((CallingsContext)_localctx).method_call_this_class = method_call_this_class();
				((CallingsContext)_localctx).node =  ((CallingsContext)_localctx).method_call_this_class.node;
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HallelujahLangListener ) ((HallelujahLangListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HallelujahLangListener ) ((HallelujahLangListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HallelujahLangVisitor ) return ((HallelujahLangVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_value);
		try {
			setState(666);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(654);
				((ValueContext)_localctx).ID = match(ID);
				((ValueContext)_localctx).node =  new VariableReference((((ValueContext)_localctx).ID!=null?((ValueContext)_localctx).ID.getText():null));
				}
				break;
			case INT_CONST:
				enterOuterAlt(_localctx, 2);
				{
				setState(656);
				((ValueContext)_localctx).INT_CONST = match(INT_CONST);
				((ValueContext)_localctx).node =  new Constant(Integer.parseInt((((ValueContext)_localctx).INT_CONST!=null?((ValueContext)_localctx).INT_CONST.getText():null)));
				}
				break;
			case FLOAT_CONST:
				enterOuterAlt(_localctx, 3);
				{
				setState(658);
				((ValueContext)_localctx).FLOAT_CONST = match(FLOAT_CONST);
				((ValueContext)_localctx).node =  new Constant(Float.parseFloat((((ValueContext)_localctx).FLOAT_CONST!=null?((ValueContext)_localctx).FLOAT_CONST.getText():null)));
				}
				break;
			case STRING_CONST:
				enterOuterAlt(_localctx, 4);
				{
				setState(660);
				((ValueContext)_localctx).STRING_CONST = match(STRING_CONST);
				((ValueContext)_localctx).node =  new Constant((((ValueContext)_localctx).STRING_CONST!=null?((ValueContext)_localctx).STRING_CONST.getText():null).substring(1, (((ValueContext)_localctx).STRING_CONST!=null?((ValueContext)_localctx).STRING_CONST.getText():null).length() - 1));
						
				}
				break;
			case BOOL_CONST:
				enterOuterAlt(_localctx, 5);
				{
				setState(662);
				((ValueContext)_localctx).BOOL_CONST = match(BOOL_CONST);
				((ValueContext)_localctx).node =  new Constant(Boolean.parseBoolean((((ValueContext)_localctx).BOOL_CONST!=null?((ValueContext)_localctx).BOOL_CONST.getText():null)));
				}
				break;
			case NULL:
				enterOuterAlt(_localctx, 6);
				{
				setState(664);
				match(NULL);
				((ValueContext)_localctx).node =  null;
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HallelujahLangListener ) ((HallelujahLangListener)listener).enterData_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HallelujahLangListener ) ((HallelujahLangListener)listener).exitData_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HallelujahLangVisitor ) return ((HallelujahLangVisitor<? extends T>)visitor).visitData_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Data_typeContext data_type() throws RecognitionException {
		Data_typeContext _localctx = new Data_typeContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_data_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(668);
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
		public ASTNode node;
		public Token LINE_COMMENT;
		public Token MULTILINE_COMMENT;
		public TerminalNode LINE_COMMENT() { return getToken(HallelujahLangParser.LINE_COMMENT, 0); }
		public TerminalNode MULTILINE_COMMENT() { return getToken(HallelujahLangParser.MULTILINE_COMMENT, 0); }
		public CommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HallelujahLangListener ) ((HallelujahLangListener)listener).enterComment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HallelujahLangListener ) ((HallelujahLangListener)listener).exitComment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HallelujahLangVisitor ) return ((HallelujahLangVisitor<? extends T>)visitor).visitComment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommentContext comment() throws RecognitionException {
		CommentContext _localctx = new CommentContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_comment);
		try {
			setState(674);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LINE_COMMENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(670);
				((CommentContext)_localctx).LINE_COMMENT = match(LINE_COMMENT);
				((CommentContext)_localctx).node =  (((CommentContext)_localctx).LINE_COMMENT!=null?((CommentContext)_localctx).LINE_COMMENT.getText():null);
				}
				break;
			case MULTILINE_COMMENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(672);
				((CommentContext)_localctx).MULTILINE_COMMENT = match(MULTILINE_COMMENT);
				((CommentContext)_localctx).node =  (((CommentContext)_localctx).MULTILINE_COMMENT!=null?((CommentContext)_localctx).MULTILINE_COMMENT.getText():null);
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

	public static final String _serializedATN =
		"\u0004\u0001;\u02a5\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0001\u0000\u0001\u0000"+
		"\u0003\u0000[\b\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0005\u0000a\b\u0000\n\u0000\f\u0000d\t\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002"+
		"y\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003"+
		"\u007f\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0003\u0004\u0088\b\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0005\u0004\u008e\b\u0004\n\u0004\f\u0004\u0091"+
		"\t\u0004\u0003\u0004\u0093\b\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005\u00c0\b\u0005"+
		"\n\u0005\f\u0005\u00c3\t\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u00cc\b\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0003\u0007\u00d6\b\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t"+
		"\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0005\n\u00ed\b\n\n\n\f\n\u00f0\t\n\u0001\n\u0001\n\u0001\n"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\f\u0001\f\u0001\f\u0003\f\u00fe\b\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0003\f\u0104\b\f\u0001\f\u0001\f\u0001\f\u0003\f\u0109\b\f\u0001\f"+
		"\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0003\r\u0116\b\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0005\u000e\u011f\b\u000e\n"+
		"\u000e\f\u000e\u0122\t\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u014f\b\u0010\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0005\u0011\u015a\b\u0011\n\u0011\f\u0011"+
		"\u015d\t\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0005\u0011"+
		"\u0169\b\u0011\n\u0011\f\u0011\u016c\t\u0011\u0001\u0011\u0001\u0011\u0005"+
		"\u0011\u0170\b\u0011\n\u0011\f\u0011\u0173\t\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0005\u0011\u017b\b\u0011"+
		"\n\u0011\f\u0011\u017e\t\u0011\u0001\u0011\u0003\u0011\u0181\b\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0005\u0012\u018e"+
		"\b\u0012\n\u0012\f\u0012\u0191\t\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013"+
		"\u019b\b\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0003\u0014\u01a2\b\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0005\u0014\u01aa\b\u0014\n\u0014\f\u0014\u01ad"+
		"\t\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0003\u0015\u01b5\b\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u01bf"+
		"\b\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0003\u0017\u01c9\b\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0005\u001a\u01e3"+
		"\b\u001a\n\u001a\f\u001a\u01e6\t\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0003\u001b\u01f3\b\u001b\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0005\u001c"+
		"\u01fc\b\u001c\n\u001c\f\u001c\u01ff\t\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0005\u001e\u0216\b\u001e\n\u001e\f\u001e\u0219\t\u001e\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0005\u001f"+
		"\u0221\b\u001f\n\u001f\f\u001f\u0224\t\u001f\u0001 \u0001 \u0001 \u0001"+
		" \u0001 \u0001 \u0005 \u022c\b \n \f \u022f\t \u0001!\u0001!\u0001!\u0001"+
		"!\u0001!\u0001!\u0005!\u0237\b!\n!\f!\u023a\t!\u0001\"\u0001\"\u0001\""+
		"\u0001\"\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0005#\u0246\b#\n#"+
		"\f#\u0249\t#\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0005$\u0251\b"+
		"$\n$\f$\u0254\t$\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0003%\u025c"+
		"\b%\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001"+
		"&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0003&\u0270"+
		"\b&\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001"+
		"\'\u0003\'\u027b\b\'\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001("+
		"\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0003"+
		"(\u028d\b(\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001"+
		")\u0001)\u0001)\u0001)\u0003)\u029b\b)\u0001*\u0001*\u0001+\u0001+\u0001"+
		"+\u0001+\u0003+\u02a3\b+\u0001+\u0001\u00ee\u0000,\u0000\u0002\u0004\u0006"+
		"\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,."+
		"02468:<>@BDFHJLNPRTV\u0000\u0001\u0002\u0000\u0012\u0012\u0015\u0018\u02c9"+
		"\u0000X\u0001\u0000\u0000\u0000\u0002g\u0001\u0000\u0000\u0000\u0004x"+
		"\u0001\u0000\u0000\u0000\u0006z\u0001\u0000\u0000\u0000\b\u0083\u0001"+
		"\u0000\u0000\u0000\n\u00c1\u0001\u0000\u0000\u0000\f\u00c4\u0001\u0000"+
		"\u0000\u0000\u000e\u00d1\u0001\u0000\u0000\u0000\u0010\u00da\u0001\u0000"+
		"\u0000\u0000\u0012\u00e0\u0001\u0000\u0000\u0000\u0014\u00e3\u0001\u0000"+
		"\u0000\u0000\u0016\u00f4\u0001\u0000\u0000\u0000\u0018\u00fa\u0001\u0000"+
		"\u0000\u0000\u001a\u0115\u0001\u0000\u0000\u0000\u001c\u0117\u0001\u0000"+
		"\u0000\u0000\u001e\u0125\u0001\u0000\u0000\u0000 \u014e\u0001\u0000\u0000"+
		"\u0000\"\u0150\u0001\u0000\u0000\u0000$\u0184\u0001\u0000\u0000\u0000"+
		"&\u019a\u0001\u0000\u0000\u0000(\u019c\u0001\u0000\u0000\u0000*\u01b1"+
		"\u0001\u0000\u0000\u0000,\u01b9\u0001\u0000\u0000\u0000.\u01c3\u0001\u0000"+
		"\u0000\u00000\u01cd\u0001\u0000\u0000\u00002\u01d4\u0001\u0000\u0000\u0000"+
		"4\u01db\u0001\u0000\u0000\u00006\u01f2\u0001\u0000\u0000\u00008\u01f4"+
		"\u0001\u0000\u0000\u0000:\u0202\u0001\u0000\u0000\u0000<\u0217\u0001\u0000"+
		"\u0000\u0000>\u021a\u0001\u0000\u0000\u0000@\u0225\u0001\u0000\u0000\u0000"+
		"B\u0230\u0001\u0000\u0000\u0000D\u023b\u0001\u0000\u0000\u0000F\u023f"+
		"\u0001\u0000\u0000\u0000H\u024a\u0001\u0000\u0000\u0000J\u025b\u0001\u0000"+
		"\u0000\u0000L\u026f\u0001\u0000\u0000\u0000N\u027a\u0001\u0000\u0000\u0000"+
		"P\u028c\u0001\u0000\u0000\u0000R\u029a\u0001\u0000\u0000\u0000T\u029c"+
		"\u0001\u0000\u0000\u0000V\u02a2\u0001\u0000\u0000\u0000XZ\u0006\u0000"+
		"\uffff\uffff\u0000Y[\u0003\u0002\u0001\u0000ZY\u0001\u0000\u0000\u0000"+
		"Z[\u0001\u0000\u0000\u0000[\\\u0001\u0000\u0000\u0000\\b\u0006\u0000\uffff"+
		"\uffff\u0000]^\u0003\u0004\u0002\u0000^_\u0006\u0000\uffff\uffff\u0000"+
		"_a\u0001\u0000\u0000\u0000`]\u0001\u0000\u0000\u0000ad\u0001\u0000\u0000"+
		"\u0000b`\u0001\u0000\u0000\u0000bc\u0001\u0000\u0000\u0000ce\u0001\u0000"+
		"\u0000\u0000db\u0001\u0000\u0000\u0000ef\u0006\u0000\uffff\uffff\u0000"+
		"f\u0001\u0001\u0000\u0000\u0000gh\u0005\u0007\u0000\u0000hi\u00055\u0000"+
		"\u0000ij\u0005*\u0000\u0000jk\u0006\u0001\uffff\uffff\u0000k\u0003\u0001"+
		"\u0000\u0000\u0000lm\u0003\b\u0004\u0000mn\u0006\u0002\uffff\uffff\u0000"+
		"ny\u0001\u0000\u0000\u0000op\u00034\u001a\u0000pq\u0006\u0002\uffff\uffff"+
		"\u0000qy\u0001\u0000\u0000\u0000rs\u0003\u0006\u0003\u0000st\u0006\u0002"+
		"\uffff\uffff\u0000ty\u0001\u0000\u0000\u0000uv\u0003V+\u0000vw\u0006\u0002"+
		"\uffff\uffff\u0000wy\u0001\u0000\u0000\u0000xl\u0001\u0000\u0000\u0000"+
		"xo\u0001\u0000\u0000\u0000xr\u0001\u0000\u0000\u0000xu\u0001\u0000\u0000"+
		"\u0000y\u0005\u0001\u0000\u0000\u0000z{\u0005\t\u0000\u0000{~\u00055\u0000"+
		"\u0000|}\u0005)\u0000\u0000}\u007f\u00055\u0000\u0000~|\u0001\u0000\u0000"+
		"\u0000~\u007f\u0001\u0000\u0000\u0000\u007f\u0080\u0001\u0000\u0000\u0000"+
		"\u0080\u0081\u0005*\u0000\u0000\u0081\u0082\u0006\u0003\uffff\uffff\u0000"+
		"\u0082\u0007\u0001\u0000\u0000\u0000\u0083\u0084\u0005\u0001\u0000\u0000"+
		"\u0084\u0087\u00055\u0000\u0000\u0085\u0086\u0005\u0002\u0000\u0000\u0086"+
		"\u0088\u00055\u0000\u0000\u0087\u0085\u0001\u0000\u0000\u0000\u0087\u0088"+
		"\u0001\u0000\u0000\u0000\u0088\u0092\u0001\u0000\u0000\u0000\u0089\u008a"+
		"\u0005\u0003\u0000\u0000\u008a\u008f\u00055\u0000\u0000\u008b\u008c\u0005"+
		"(\u0000\u0000\u008c\u008e\u00055\u0000\u0000\u008d\u008b\u0001\u0000\u0000"+
		"\u0000\u008e\u0091\u0001\u0000\u0000\u0000\u008f\u008d\u0001\u0000\u0000"+
		"\u0000\u008f\u0090\u0001\u0000\u0000\u0000\u0090\u0093\u0001\u0000\u0000"+
		"\u0000\u0091\u008f\u0001\u0000\u0000\u0000\u0092\u0089\u0001\u0000\u0000"+
		"\u0000\u0092\u0093\u0001\u0000\u0000\u0000\u0093\u0094\u0001\u0000\u0000"+
		"\u0000\u0094\u0095\u0005+\u0000\u0000\u0095\u0096\u0006\u0004\uffff\uffff"+
		"\u0000\u0096\u0097\u0003\n\u0005\u0000\u0097\u0098\u0006\u0004\uffff\uffff"+
		"\u0000\u0098\u0099\u0005,\u0000\u0000\u0099\u009a\u0006\u0004\uffff\uffff"+
		"\u0000\u009a\t\u0001\u0000\u0000\u0000\u009b\u009c\u0003\u001a\r\u0000"+
		"\u009c\u009d\u0006\u0005\uffff\uffff\u0000\u009d\u00c0\u0001\u0000\u0000"+
		"\u0000\u009e\u009f\u0003\u0018\f\u0000\u009f\u00a0\u0006\u0005\uffff\uffff"+
		"\u0000\u00a0\u00c0\u0001\u0000\u0000\u0000\u00a1\u00a2\u00030\u0018\u0000"+
		"\u00a2\u00a3\u0006\u0005\uffff\uffff\u0000\u00a3\u00c0\u0001\u0000\u0000"+
		"\u0000\u00a4\u00a5\u00032\u0019\u0000\u00a5\u00a6\u0006\u0005\uffff\uffff"+
		"\u0000\u00a6\u00c0\u0001\u0000\u0000\u0000\u00a7\u00a8\u0003\"\u0011\u0000"+
		"\u00a8\u00a9\u0006\u0005\uffff\uffff\u0000\u00a9\u00c0\u0001\u0000\u0000"+
		"\u0000\u00aa\u00ab\u0003$\u0012\u0000\u00ab\u00ac\u0006\u0005\uffff\uffff"+
		"\u0000\u00ac\u00c0\u0001\u0000\u0000\u0000\u00ad\u00ae\u0003\f\u0006\u0000"+
		"\u00ae\u00af\u0006\u0005\uffff\uffff\u0000\u00af\u00c0\u0001\u0000\u0000"+
		"\u0000\u00b0\u00b1\u0003(\u0014\u0000\u00b1\u00b2\u0006\u0005\uffff\uffff"+
		"\u0000\u00b2\u00c0\u0001\u0000\u0000\u0000\u00b3\u00b4\u0003,\u0016\u0000"+
		"\u00b4\u00b5\u0006\u0005\uffff\uffff\u0000\u00b5\u00b6\u0005*\u0000\u0000"+
		"\u00b6\u00c0\u0001\u0000\u0000\u0000\u00b7\u00b8\u0003.\u0017\u0000\u00b8"+
		"\u00b9\u0006\u0005\uffff\uffff\u0000\u00b9\u00ba\u0005*\u0000\u0000\u00ba"+
		"\u00c0\u0001\u0000\u0000\u0000\u00bb\u00c0\u0003:\u001d\u0000\u00bc\u00bd"+
		"\u0003V+\u0000\u00bd\u00be\u0006\u0005\uffff\uffff\u0000\u00be\u00c0\u0001"+
		"\u0000\u0000\u0000\u00bf\u009b\u0001\u0000\u0000\u0000\u00bf\u009e\u0001"+
		"\u0000\u0000\u0000\u00bf\u00a1\u0001\u0000\u0000\u0000\u00bf\u00a4\u0001"+
		"\u0000\u0000\u0000\u00bf\u00a7\u0001\u0000\u0000\u0000\u00bf\u00aa\u0001"+
		"\u0000\u0000\u0000\u00bf\u00ad\u0001\u0000\u0000\u0000\u00bf\u00b0\u0001"+
		"\u0000\u0000\u0000\u00bf\u00b3\u0001\u0000\u0000\u0000\u00bf\u00b7\u0001"+
		"\u0000\u0000\u0000\u00bf\u00bb\u0001\u0000\u0000\u0000\u00bf\u00bc\u0001"+
		"\u0000\u0000\u0000\u00c0\u00c3\u0001\u0000\u0000\u0000\u00c1\u00bf\u0001"+
		"\u0000\u0000\u0000\u00c1\u00c2\u0001\u0000\u0000\u0000\u00c2\u000b\u0001"+
		"\u0000\u0000\u0000\u00c3\u00c1\u0001\u0000\u0000\u0000\u00c4\u00c5\u0003"+
		"T*\u0000\u00c5\u00c6\u00055\u0000\u0000\u00c6\u00c7\u0005\u001a\u0000"+
		"\u0000\u00c7\u00c8\u0005\u0006\u0000\u0000\u00c8\u00c9\u00055\u0000\u0000"+
		"\u00c9\u00cb\u0005-\u0000\u0000\u00ca\u00cc\u00038\u001c\u0000\u00cb\u00ca"+
		"\u0001\u0000\u0000\u0000\u00cb\u00cc\u0001\u0000\u0000\u0000\u00cc\u00cd"+
		"\u0001\u0000\u0000\u0000\u00cd\u00ce\u0005.\u0000\u0000\u00ce\u00cf\u0005"+
		"*\u0000\u0000\u00cf\u00d0\u0006\u0006\uffff\uffff\u0000\u00d0\r\u0001"+
		"\u0000\u0000\u0000\u00d1\u00d2\u0003T*\u0000\u00d2\u00d5\u00055\u0000"+
		"\u0000\u00d3\u00d4\u0005\u001a\u0000\u0000\u00d4\u00d6\u0003J%\u0000\u00d5"+
		"\u00d3\u0001\u0000\u0000\u0000\u00d5\u00d6\u0001\u0000\u0000\u0000\u00d6"+
		"\u00d7\u0001\u0000\u0000\u0000\u00d7\u00d8\u0005*\u0000\u0000\u00d8\u00d9"+
		"\u0006\u0007\uffff\uffff\u0000\u00d9\u000f\u0001\u0000\u0000\u0000\u00da"+
		"\u00db\u00055\u0000\u0000\u00db\u00dc\u0005\u001a\u0000\u0000\u00dc\u00dd"+
		"\u0003J%\u0000\u00dd\u00de\u0005*\u0000\u0000\u00de\u00df\u0006\b\uffff"+
		"\uffff\u0000\u00df\u0011\u0001\u0000\u0000\u0000\u00e0\u00e1\u00055\u0000"+
		"\u0000\u00e1\u00e2\u0006\t\uffff\uffff\u0000\u00e2\u0013\u0001\u0000\u0000"+
		"\u0000\u00e3\u00e4\u0005-\u0000\u0000\u00e4\u00e5\u0003T*\u0000\u00e5"+
		"\u00e6\u0005.\u0000\u0000\u00e6\u00e7\u0005/\u0000\u0000\u00e7\u00ee\u0003"+
		"8\u001c\u0000\u00e8\u00e9\u0005/\u0000\u0000\u00e9\u00ea\u00038\u001c"+
		"\u0000\u00ea\u00eb\u00050\u0000\u0000\u00eb\u00ed\u0001\u0000\u0000\u0000"+
		"\u00ec\u00e8\u0001\u0000\u0000\u0000\u00ed\u00f0\u0001\u0000\u0000\u0000"+
		"\u00ee\u00ef\u0001\u0000\u0000\u0000\u00ee\u00ec\u0001\u0000\u0000\u0000"+
		"\u00ef\u00f1\u0001\u0000\u0000\u0000\u00f0\u00ee\u0001\u0000\u0000\u0000"+
		"\u00f1\u00f2\u00050\u0000\u0000\u00f2\u00f3\u0006\n\uffff\uffff\u0000"+
		"\u00f3\u0015\u0001\u0000\u0000\u0000\u00f4\u00f5\u00055\u0000\u0000\u00f5"+
		"\u00f6\u0005/\u0000\u0000\u00f6\u00f7\u0003J%\u0000\u00f7\u00f8\u0005"+
		"0\u0000\u0000\u00f8\u00f9\u0006\u000b\uffff\uffff\u0000\u00f9\u0017\u0001"+
		"\u0000\u0000\u0000\u00fa\u00fb\u0003T*\u0000\u00fb\u00fd\u0003\u0014\n"+
		"\u0000\u00fc\u00fe\u0003\u0014\n\u0000\u00fd\u00fc\u0001\u0000\u0000\u0000"+
		"\u00fd\u00fe\u0001\u0000\u0000\u0000\u00fe\u00ff\u0001\u0000\u0000\u0000"+
		"\u00ff\u0108\u00055\u0000\u0000\u0100\u0109\u0005*\u0000\u0000\u0101\u0103"+
		"\u0005\u001a\u0000\u0000\u0102\u0104\u00055\u0000\u0000\u0103\u0102\u0001"+
		"\u0000\u0000\u0000\u0103\u0104\u0001\u0000\u0000\u0000\u0104\u0105\u0001"+
		"\u0000\u0000\u0000\u0105\u0106\u0003\u0014\n\u0000\u0106\u0107\u0005*"+
		"\u0000\u0000\u0107\u0109\u0001\u0000\u0000\u0000\u0108\u0100\u0001\u0000"+
		"\u0000\u0000\u0108\u0101\u0001\u0000\u0000\u0000\u0109\u010a\u0001\u0000"+
		"\u0000\u0000\u010a\u010b\u0006\f\uffff\uffff\u0000\u010b\u0019\u0001\u0000"+
		"\u0000\u0000\u010c\u010d\u0003\u000e\u0007\u0000\u010d\u010e\u0006\r\uffff"+
		"\uffff\u0000\u010e\u0116\u0001\u0000\u0000\u0000\u010f\u0110\u0003\u0010"+
		"\b\u0000\u0110\u0111\u0006\r\uffff\uffff\u0000\u0111\u0116\u0001\u0000"+
		"\u0000\u0000\u0112\u0113\u0003\u0012\t\u0000\u0113\u0114\u0006\r\uffff"+
		"\uffff\u0000\u0114\u0116\u0001\u0000\u0000\u0000\u0115\u010c\u0001\u0000"+
		"\u0000\u0000\u0115\u010f\u0001\u0000\u0000\u0000\u0115\u0112\u0001\u0000"+
		"\u0000\u0000\u0116\u001b\u0001\u0000\u0000\u0000\u0117\u0118\u0006\u000e"+
		"\uffff\uffff\u0000\u0118\u0119\u0003\u001e\u000f\u0000\u0119\u0120\u0006"+
		"\u000e\uffff\uffff\u0000\u011a\u011b\u0005(\u0000\u0000\u011b\u011c\u0003"+
		"\u001e\u000f\u0000\u011c\u011d\u0006\u000e\uffff\uffff\u0000\u011d\u011f"+
		"\u0001\u0000\u0000\u0000\u011e\u011a\u0001\u0000\u0000\u0000\u011f\u0122"+
		"\u0001\u0000\u0000\u0000\u0120\u011e\u0001\u0000\u0000\u0000\u0120\u0121"+
		"\u0001\u0000\u0000\u0000\u0121\u0123\u0001\u0000\u0000\u0000\u0122\u0120"+
		"\u0001\u0000\u0000\u0000\u0123\u0124\u0006\u000e\uffff\uffff\u0000\u0124"+
		"\u001d\u0001\u0000\u0000\u0000\u0125\u0126\u0003T*\u0000\u0126\u0127\u0005"+
		"5\u0000\u0000\u0127\u0128\u0006\u000f\uffff\uffff\u0000\u0128\u001f\u0001"+
		"\u0000\u0000\u0000\u0129\u012a\u0003\"\u0011\u0000\u012a\u012b\u0006\u0010"+
		"\uffff\uffff\u0000\u012b\u014f\u0001\u0000\u0000\u0000\u012c\u012d\u0003"+
		"$\u0012\u0000\u012d\u012e\u0006\u0010\uffff\uffff\u0000\u012e\u014f\u0001"+
		"\u0000\u0000\u0000\u012f\u014f\u0003&\u0013\u0000\u0130\u0131\u00030\u0018"+
		"\u0000\u0131\u0132\u0006\u0010\uffff\uffff\u0000\u0132\u014f\u0001\u0000"+
		"\u0000\u0000\u0133\u0134\u00032\u0019\u0000\u0134\u0135\u0006\u0010\uffff"+
		"\uffff\u0000\u0135\u014f\u0001\u0000\u0000\u0000\u0136\u0137\u0003\u0016"+
		"\u000b\u0000\u0137\u0138\u0006\u0010\uffff\uffff\u0000\u0138\u014f\u0001"+
		"\u0000\u0000\u0000\u0139\u013a\u0003\u0018\f\u0000\u013a\u013b\u0006\u0010"+
		"\uffff\uffff\u0000\u013b\u014f\u0001\u0000\u0000\u0000\u013c\u013d\u0003"+
		"\f\u0006\u0000\u013d\u013e\u0006\u0010\uffff\uffff\u0000\u013e\u014f\u0001"+
		"\u0000\u0000\u0000\u013f\u0140\u0003*\u0015\u0000\u0140\u0141\u0006\u0010"+
		"\uffff\uffff\u0000\u0141\u014f\u0001\u0000\u0000\u0000\u0142\u0143\u0003"+
		",\u0016\u0000\u0143\u0144\u0006\u0010\uffff\uffff\u0000\u0144\u014f\u0001"+
		"\u0000\u0000\u0000\u0145\u0146\u0003.\u0017\u0000\u0146\u0147\u0006\u0010"+
		"\uffff\uffff\u0000\u0147\u014f\u0001\u0000\u0000\u0000\u0148\u0149\u0003"+
		"V+\u0000\u0149\u014a\u0006\u0010\uffff\uffff\u0000\u014a\u014f\u0001\u0000"+
		"\u0000\u0000\u014b\u014c\u0003J%\u0000\u014c\u014d\u0006\u0010\uffff\uffff"+
		"\u0000\u014d\u014f\u0001\u0000\u0000\u0000\u014e\u0129\u0001\u0000\u0000"+
		"\u0000\u014e\u012c\u0001\u0000\u0000\u0000\u014e\u012f\u0001\u0000\u0000"+
		"\u0000\u014e\u0130\u0001\u0000\u0000\u0000\u014e\u0133\u0001\u0000\u0000"+
		"\u0000\u014e\u0136\u0001\u0000\u0000\u0000\u014e\u0139\u0001\u0000\u0000"+
		"\u0000\u014e\u013c\u0001\u0000\u0000\u0000\u014e\u013f\u0001\u0000\u0000"+
		"\u0000\u014e\u0142\u0001\u0000\u0000\u0000\u014e\u0145\u0001\u0000\u0000"+
		"\u0000\u014e\u0148\u0001\u0000\u0000\u0000\u014e\u014b\u0001\u0000\u0000"+
		"\u0000\u014f!\u0001\u0000\u0000\u0000\u0150\u0151\u0005\u000f\u0000\u0000"+
		"\u0151\u0152\u0005-\u0000\u0000\u0152\u0153\u0003J%\u0000\u0153\u0154"+
		"\u0005.\u0000\u0000\u0154\u0155\u0005+\u0000\u0000\u0155\u015b\u0006\u0011"+
		"\uffff\uffff\u0000\u0156\u0157\u0003 \u0010\u0000\u0157\u0158\u0006\u0011"+
		"\uffff\uffff\u0000\u0158\u015a\u0001\u0000\u0000\u0000\u0159\u0156\u0001"+
		"\u0000\u0000\u0000\u015a\u015d\u0001\u0000\u0000\u0000\u015b\u0159\u0001"+
		"\u0000\u0000\u0000\u015b\u015c\u0001\u0000\u0000\u0000\u015c\u015e\u0001"+
		"\u0000\u0000\u0000\u015d\u015b\u0001\u0000\u0000\u0000\u015e\u0180\u0005"+
		",\u0000\u0000\u015f\u0160\u0005\u0011\u0000\u0000\u0160\u0161\u0005-\u0000"+
		"\u0000\u0161\u0162\u0003J%\u0000\u0162\u0163\u0005.\u0000\u0000\u0163"+
		"\u0164\u0005+\u0000\u0000\u0164\u016a\u0006\u0011\uffff\uffff\u0000\u0165"+
		"\u0166\u0003 \u0010\u0000\u0166\u0167\u0006\u0011\uffff\uffff\u0000\u0167"+
		"\u0169\u0001\u0000\u0000\u0000\u0168\u0165\u0001\u0000\u0000\u0000\u0169"+
		"\u016c\u0001\u0000\u0000\u0000\u016a\u0168\u0001\u0000\u0000\u0000\u016a"+
		"\u016b\u0001\u0000\u0000\u0000\u016b\u016d\u0001\u0000\u0000\u0000\u016c"+
		"\u016a\u0001\u0000\u0000\u0000\u016d\u016e\u0005,\u0000\u0000\u016e\u0170"+
		"\u0001\u0000\u0000\u0000\u016f\u015f\u0001\u0000\u0000\u0000\u0170\u0173"+
		"\u0001\u0000\u0000\u0000\u0171\u016f\u0001\u0000\u0000\u0000\u0171\u0172"+
		"\u0001\u0000\u0000\u0000\u0172\u0174\u0001\u0000\u0000\u0000\u0173\u0171"+
		"\u0001\u0000\u0000\u0000\u0174\u0175\u0005\u0010\u0000\u0000\u0175\u0176"+
		"\u0005+\u0000\u0000\u0176\u017c\u0006\u0011\uffff\uffff\u0000\u0177\u0178"+
		"\u0003 \u0010\u0000\u0178\u0179\u0006\u0011\uffff\uffff\u0000\u0179\u017b"+
		"\u0001\u0000\u0000\u0000\u017a\u0177\u0001\u0000\u0000\u0000\u017b\u017e"+
		"\u0001\u0000\u0000\u0000\u017c\u017a\u0001\u0000\u0000\u0000\u017c\u017d"+
		"\u0001\u0000\u0000\u0000\u017d\u017f\u0001\u0000\u0000\u0000\u017e\u017c"+
		"\u0001\u0000\u0000\u0000\u017f\u0181\u0005,\u0000\u0000\u0180\u0171\u0001"+
		"\u0000\u0000\u0000\u0180\u0181\u0001\u0000\u0000\u0000\u0181\u0182\u0001"+
		"\u0000\u0000\u0000\u0182\u0183\u0006\u0011\uffff\uffff\u0000\u0183#\u0001"+
		"\u0000\u0000\u0000\u0184\u0185\u0005\u000e\u0000\u0000\u0185\u0186\u0005"+
		"-\u0000\u0000\u0186\u0187\u0003J%\u0000\u0187\u0188\u0005.\u0000\u0000"+
		"\u0188\u0189\u0005+\u0000\u0000\u0189\u018f\u0006\u0012\uffff\uffff\u0000"+
		"\u018a\u018b\u0003 \u0010\u0000\u018b\u018c\u0006\u0012\uffff\uffff\u0000"+
		"\u018c\u018e\u0001\u0000\u0000\u0000\u018d\u018a\u0001\u0000\u0000\u0000"+
		"\u018e\u0191\u0001\u0000\u0000\u0000\u018f\u018d\u0001\u0000\u0000\u0000"+
		"\u018f\u0190\u0001\u0000\u0000\u0000\u0190\u0192\u0001\u0000\u0000\u0000"+
		"\u0191\u018f\u0001\u0000\u0000\u0000\u0192\u0193\u0005,\u0000\u0000\u0193"+
		"\u0194\u0006\u0012\uffff\uffff\u0000\u0194%\u0001\u0000\u0000\u0000\u0195"+
		"\u0196\u0005\r\u0000\u0000\u0196\u019b\u0003J%\u0000\u0197\u0198\u0003"+
		">\u001f\u0000\u0198\u0199\u0005*\u0000\u0000\u0199\u019b\u0001\u0000\u0000"+
		"\u0000\u019a\u0195\u0001\u0000\u0000\u0000\u019a\u0197\u0001\u0000\u0000"+
		"\u0000\u019b\'\u0001\u0000\u0000\u0000\u019c\u019d\u0003T*\u0000\u019d"+
		"\u019e\u0005\u0005\u0000\u0000\u019e\u019f\u00055\u0000\u0000\u019f\u01a1"+
		"\u0005-\u0000\u0000\u01a0\u01a2\u0003\u001c\u000e\u0000\u01a1\u01a0\u0001"+
		"\u0000\u0000\u0000\u01a1\u01a2\u0001\u0000\u0000\u0000\u01a2\u01a3\u0001"+
		"\u0000\u0000\u0000\u01a3\u01a4\u0005.\u0000\u0000\u01a4\u01a5\u0006\u0014"+
		"\uffff\uffff\u0000\u01a5\u01ab\u0005+\u0000\u0000\u01a6\u01a7\u0003 \u0010"+
		"\u0000\u01a7\u01a8\u0006\u0014\uffff\uffff\u0000\u01a8\u01aa\u0001\u0000"+
		"\u0000\u0000\u01a9\u01a6\u0001\u0000\u0000\u0000\u01aa\u01ad\u0001\u0000"+
		"\u0000\u0000\u01ab\u01a9\u0001\u0000\u0000\u0000\u01ab\u01ac\u0001\u0000"+
		"\u0000\u0000\u01ac\u01ae\u0001\u0000\u0000\u0000\u01ad\u01ab\u0001\u0000"+
		"\u0000\u0000\u01ae\u01af\u0005,\u0000\u0000\u01af\u01b0\u0006\u0014\uffff"+
		"\uffff\u0000\u01b0)\u0001\u0000\u0000\u0000\u01b1\u01b2\u00055\u0000\u0000"+
		"\u01b2\u01b4\u0005-\u0000\u0000\u01b3\u01b5\u00038\u001c\u0000\u01b4\u01b3"+
		"\u0001\u0000\u0000\u0000\u01b4\u01b5\u0001\u0000\u0000\u0000\u01b5\u01b6"+
		"\u0001\u0000\u0000\u0000\u01b6\u01b7\u0005.\u0000\u0000\u01b7\u01b8\u0006"+
		"\u0015\uffff\uffff\u0000\u01b8+\u0001\u0000\u0000\u0000\u01b9\u01ba\u0005"+
		"5\u0000\u0000\u01ba\u01bb\u0005)\u0000\u0000\u01bb\u01bc\u00055\u0000"+
		"\u0000\u01bc\u01be\u0005-\u0000\u0000\u01bd\u01bf\u00038\u001c\u0000\u01be"+
		"\u01bd\u0001\u0000\u0000\u0000\u01be\u01bf\u0001\u0000\u0000\u0000\u01bf"+
		"\u01c0\u0001\u0000\u0000\u0000\u01c0\u01c1\u0005.\u0000\u0000\u01c1\u01c2"+
		"\u0006\u0016\uffff\uffff\u0000\u01c2-\u0001\u0000\u0000\u0000\u01c3\u01c4"+
		"\u0005\n\u0000\u0000\u01c4\u01c5\u0005)\u0000\u0000\u01c5\u01c6\u0005"+
		"5\u0000\u0000\u01c6\u01c8\u0005-\u0000\u0000\u01c7\u01c9\u00038\u001c"+
		"\u0000\u01c8\u01c7\u0001\u0000\u0000\u0000\u01c8\u01c9\u0001\u0000\u0000"+
		"\u0000\u01c9\u01ca\u0001\u0000\u0000\u0000\u01ca\u01cb\u0005.\u0000\u0000"+
		"\u01cb\u01cc\u0006\u0017\uffff\uffff\u0000\u01cc/\u0001\u0000\u0000\u0000"+
		"\u01cd\u01ce\u0005\f\u0000\u0000\u01ce\u01cf\u0005-\u0000\u0000\u01cf"+
		"\u01d0\u0003J%\u0000\u01d0\u01d1\u0005.\u0000\u0000\u01d1\u01d2\u0005"+
		"*\u0000\u0000\u01d2\u01d3\u0006\u0018\uffff\uffff\u0000\u01d31\u0001\u0000"+
		"\u0000\u0000\u01d4\u01d5\u0005\u000b\u0000\u0000\u01d5\u01d6\u0005-\u0000"+
		"\u0000\u01d6\u01d7\u00055\u0000\u0000\u01d7\u01d8\u0005.\u0000\u0000\u01d8"+
		"\u01d9\u0005*\u0000\u0000\u01d9\u01da\u0006\u0019\uffff\uffff\u0000\u01da"+
		"3\u0001\u0000\u0000\u0000\u01db\u01dc\u0005\u0004\u0000\u0000\u01dc\u01dd"+
		"\u00055\u0000\u0000\u01dd\u01de\u0005+\u0000\u0000\u01de\u01e4\u0006\u001a"+
		"\uffff\uffff\u0000\u01df\u01e0\u00036\u001b\u0000\u01e0\u01e1\u0006\u001a"+
		"\uffff\uffff\u0000\u01e1\u01e3\u0001\u0000\u0000\u0000\u01e2\u01df\u0001"+
		"\u0000\u0000\u0000\u01e3\u01e6\u0001\u0000\u0000\u0000\u01e4\u01e2\u0001"+
		"\u0000\u0000\u0000\u01e4\u01e5\u0001\u0000\u0000\u0000\u01e5\u01e7\u0001"+
		"\u0000\u0000\u0000\u01e6\u01e4\u0001\u0000\u0000\u0000\u01e7\u01e8\u0005"+
		",\u0000\u0000\u01e8\u01e9\u0006\u001a\uffff\uffff\u0000\u01e95\u0001\u0000"+
		"\u0000\u0000\u01ea\u01eb\u0003(\u0014\u0000\u01eb\u01ec\u0006\u001b\uffff"+
		"\uffff\u0000\u01ec\u01f3\u0001\u0000\u0000\u0000\u01ed\u01ee\u0003T*\u0000"+
		"\u01ee\u01ef\u0003*\u0015\u0000\u01ef\u01f0\u0006\u001b\uffff\uffff\u0000"+
		"\u01f0\u01f1\u0005*\u0000\u0000\u01f1\u01f3\u0001\u0000\u0000\u0000\u01f2"+
		"\u01ea\u0001\u0000\u0000\u0000\u01f2\u01ed\u0001\u0000\u0000\u0000\u01f3"+
		"7\u0001\u0000\u0000\u0000\u01f4\u01f5\u0006\u001c\uffff\uffff\u0000\u01f5"+
		"\u01f6\u0003J%\u0000\u01f6\u01fd\u0006\u001c\uffff\uffff\u0000\u01f7\u01f8"+
		"\u0005(\u0000\u0000\u01f8\u01f9\u0003J%\u0000\u01f9\u01fa\u0006\u001c"+
		"\uffff\uffff\u0000\u01fa\u01fc\u0001\u0000\u0000\u0000\u01fb\u01f7\u0001"+
		"\u0000\u0000\u0000\u01fc\u01ff\u0001\u0000\u0000\u0000\u01fd\u01fb\u0001"+
		"\u0000\u0000\u0000\u01fd\u01fe\u0001\u0000\u0000\u0000\u01fe\u0200\u0001"+
		"\u0000\u0000\u0000\u01ff\u01fd\u0001\u0000\u0000\u0000\u0200\u0201\u0006"+
		"\u001c\uffff\uffff\u0000\u02019\u0001\u0000\u0000\u0000\u0202\u0203\u0005"+
		"\b\u0000\u0000\u0203\u0204\u0005-\u0000\u0000\u0204\u0205\u0003\u001c"+
		"\u000e\u0000\u0205\u0206\u0005.\u0000\u0000\u0206\u0207\u0005+\u0000\u0000"+
		"\u0207\u0208\u0006\u001d\uffff\uffff\u0000\u0208\u0209\u0003<\u001e\u0000"+
		"\u0209\u020a\u0006\u001d\uffff\uffff\u0000\u020a\u020b\u0005,\u0000\u0000"+
		"\u020b\u020c\u0006\u001d\uffff\uffff\u0000\u020c;\u0001\u0000\u0000\u0000"+
		"\u020d\u020e\u0003T*\u0000\u020e\u020f\u0005\n\u0000\u0000\u020f\u0210"+
		"\u0005)\u0000\u0000\u0210\u0211\u00055\u0000\u0000\u0211\u0212\u0005\u001a"+
		"\u0000\u0000\u0212\u0213\u0003J%\u0000\u0213\u0214\u0005*\u0000\u0000"+
		"\u0214\u0216\u0001\u0000\u0000\u0000\u0215\u020d\u0001\u0000\u0000\u0000"+
		"\u0216\u0219\u0001\u0000\u0000\u0000\u0217\u0215\u0001\u0000\u0000\u0000"+
		"\u0217\u0218\u0001\u0000\u0000\u0000\u0218=\u0001\u0000\u0000\u0000\u0219"+
		"\u0217\u0001\u0000\u0000\u0000\u021a\u021b\u0003N\'\u0000\u021b\u0222"+
		"\u0006\u001f\uffff\uffff\u0000\u021c\u021d\u0005:\u0000\u0000\u021d\u021e"+
		"\u0003N\'\u0000\u021e\u021f\u0006\u001f\uffff\uffff\u0000\u021f\u0221"+
		"\u0001\u0000\u0000\u0000\u0220\u021c\u0001\u0000\u0000\u0000\u0221\u0224"+
		"\u0001\u0000\u0000\u0000\u0222\u0220\u0001\u0000\u0000\u0000\u0222\u0223"+
		"\u0001\u0000\u0000\u0000\u0223?\u0001\u0000\u0000\u0000\u0224\u0222\u0001"+
		"\u0000\u0000\u0000\u0225\u0226\u0003N\'\u0000\u0226\u022d\u0006 \uffff"+
		"\uffff\u0000\u0227\u0228\u00059\u0000\u0000\u0228\u0229\u0003N\'\u0000"+
		"\u0229\u022a\u0006 \uffff\uffff\u0000\u022a\u022c\u0001\u0000\u0000\u0000"+
		"\u022b\u0227\u0001\u0000\u0000\u0000\u022c\u022f\u0001\u0000\u0000\u0000"+
		"\u022d\u022b\u0001\u0000\u0000\u0000\u022d\u022e\u0001\u0000\u0000\u0000"+
		"\u022eA\u0001\u0000\u0000\u0000\u022f\u022d\u0001\u0000\u0000\u0000\u0230"+
		"\u0231\u0003N\'\u0000\u0231\u0238\u0006!\uffff\uffff\u0000\u0232\u0233"+
		"\u0005;\u0000\u0000\u0233\u0234\u0003N\'\u0000\u0234\u0235\u0006!\uffff"+
		"\uffff\u0000\u0235\u0237\u0001\u0000\u0000\u0000\u0236\u0232\u0001\u0000"+
		"\u0000\u0000\u0237\u023a\u0001\u0000\u0000\u0000\u0238\u0236\u0001\u0000"+
		"\u0000\u0000\u0238\u0239\u0001\u0000\u0000\u0000\u0239C\u0001\u0000\u0000"+
		"\u0000\u023a\u0238\u0001\u0000\u0000\u0000\u023b\u023c\u0005&\u0000\u0000"+
		"\u023c\u023d\u0003J%\u0000\u023d\u023e\u0006\"\uffff\uffff\u0000\u023e"+
		"E\u0001\u0000\u0000\u0000\u023f\u0240\u0003H$\u0000\u0240\u0247\u0006"+
		"#\uffff\uffff\u0000\u0241\u0242\u0005\'\u0000\u0000\u0242\u0243\u0003"+
		"H$\u0000\u0243\u0244\u0006#\uffff\uffff\u0000\u0244\u0246\u0001\u0000"+
		"\u0000\u0000\u0245\u0241\u0001\u0000\u0000\u0000\u0246\u0249\u0001\u0000"+
		"\u0000\u0000\u0247\u0245\u0001\u0000\u0000\u0000\u0247\u0248\u0001\u0000"+
		"\u0000\u0000\u0248G\u0001\u0000\u0000\u0000\u0249\u0247\u0001\u0000\u0000"+
		"\u0000\u024a\u024b\u0003@ \u0000\u024b\u0252\u0006$\uffff\uffff\u0000"+
		"\u024c\u024d\u0005%\u0000\u0000\u024d\u024e\u0003@ \u0000\u024e\u024f"+
		"\u0006$\uffff\uffff\u0000\u024f\u0251\u0001\u0000\u0000\u0000\u0250\u024c"+
		"\u0001\u0000\u0000\u0000\u0251\u0254\u0001\u0000\u0000\u0000\u0252\u0250"+
		"\u0001\u0000\u0000\u0000\u0252\u0253\u0001\u0000\u0000\u0000\u0253I\u0001"+
		"\u0000\u0000\u0000\u0254\u0252\u0001\u0000\u0000\u0000\u0255\u0256\u0003"+
		"L&\u0000\u0256\u0257\u0006%\uffff\uffff\u0000\u0257\u025c\u0001\u0000"+
		"\u0000\u0000\u0258\u0259\u0003N\'\u0000\u0259\u025a\u0006%\uffff\uffff"+
		"\u0000\u025a\u025c\u0001\u0000\u0000\u0000\u025b\u0255\u0001\u0000\u0000"+
		"\u0000\u025b\u0258\u0001\u0000\u0000\u0000\u025cK\u0001\u0000\u0000\u0000"+
		"\u025d\u025e\u0003>\u001f\u0000\u025e\u025f\u0006&\uffff\uffff\u0000\u025f"+
		"\u0270\u0001\u0000\u0000\u0000\u0260\u0261\u0003@ \u0000\u0261\u0262\u0006"+
		"&\uffff\uffff\u0000\u0262\u0270\u0001\u0000\u0000\u0000\u0263\u0264\u0003"+
		"B!\u0000\u0264\u0265\u0006&\uffff\uffff\u0000\u0265\u0270\u0001\u0000"+
		"\u0000\u0000\u0266\u0267\u0003D\"\u0000\u0267\u0268\u0006&\uffff\uffff"+
		"\u0000\u0268\u0270\u0001\u0000\u0000\u0000\u0269\u026a\u0003H$\u0000\u026a"+
		"\u026b\u0006&\uffff\uffff\u0000\u026b\u0270\u0001\u0000\u0000\u0000\u026c"+
		"\u026d\u0003F#\u0000\u026d\u026e\u0006&\uffff\uffff\u0000\u026e\u0270"+
		"\u0001\u0000\u0000\u0000\u026f\u025d\u0001\u0000\u0000\u0000\u026f\u0260"+
		"\u0001\u0000\u0000\u0000\u026f\u0263\u0001\u0000\u0000\u0000\u026f\u0266"+
		"\u0001\u0000\u0000\u0000\u026f\u0269\u0001\u0000\u0000\u0000\u026f\u026c"+
		"\u0001\u0000\u0000\u0000\u0270M\u0001\u0000\u0000\u0000\u0271\u0272\u0003"+
		"D\"\u0000\u0272\u0273\u0006\'\uffff\uffff\u0000\u0273\u027b\u0001\u0000"+
		"\u0000\u0000\u0274\u0275\u0003R)\u0000\u0275\u0276\u0006\'\uffff\uffff"+
		"\u0000\u0276\u027b\u0001\u0000\u0000\u0000\u0277\u0278\u0003P(\u0000\u0278"+
		"\u0279\u0006\'\uffff\uffff\u0000\u0279\u027b\u0001\u0000\u0000\u0000\u027a"+
		"\u0271\u0001\u0000\u0000\u0000\u027a\u0274\u0001\u0000\u0000\u0000\u027a"+
		"\u0277\u0001\u0000\u0000\u0000\u027bO\u0001\u0000\u0000\u0000\u027c\u027d"+
		"\u0003,\u0016\u0000\u027d\u027e\u0006(\uffff\uffff\u0000\u027e\u028d\u0001"+
		"\u0000\u0000\u0000\u027f\u0280\u0003\u0014\n\u0000\u0280\u0281\u0006("+
		"\uffff\uffff\u0000\u0281\u028d\u0001\u0000\u0000\u0000\u0282\u0283\u0005"+
		"5\u0000\u0000\u0283\u0284\u0003\u0014\n\u0000\u0284\u0285\u0006(\uffff"+
		"\uffff\u0000\u0285\u028d\u0001\u0000\u0000\u0000\u0286\u0287\u0003*\u0015"+
		"\u0000\u0287\u0288\u0006(\uffff\uffff\u0000\u0288\u028d\u0001\u0000\u0000"+
		"\u0000\u0289\u028a\u0003.\u0017\u0000\u028a\u028b\u0006(\uffff\uffff\u0000"+
		"\u028b\u028d\u0001\u0000\u0000\u0000\u028c\u027c\u0001\u0000\u0000\u0000"+
		"\u028c\u027f\u0001\u0000\u0000\u0000\u028c\u0282\u0001\u0000\u0000\u0000"+
		"\u028c\u0286\u0001\u0000\u0000\u0000\u028c\u0289\u0001\u0000\u0000\u0000"+
		"\u028dQ\u0001\u0000\u0000\u0000\u028e\u028f\u00055\u0000\u0000\u028f\u029b"+
		"\u0006)\uffff\uffff\u0000\u0290\u0291\u00056\u0000\u0000\u0291\u029b\u0006"+
		")\uffff\uffff\u0000\u0292\u0293\u00054\u0000\u0000\u0293\u029b\u0006)"+
		"\uffff\uffff\u0000\u0294\u0295\u00057\u0000\u0000\u0295\u029b\u0006)\uffff"+
		"\uffff\u0000\u0296\u0297\u00053\u0000\u0000\u0297\u029b\u0006)\uffff\uffff"+
		"\u0000\u0298\u0299\u0005\u0019\u0000\u0000\u0299\u029b\u0006)\uffff\uffff"+
		"\u0000\u029a\u028e\u0001\u0000\u0000\u0000\u029a\u0290\u0001\u0000\u0000"+
		"\u0000\u029a\u0292\u0001\u0000\u0000\u0000\u029a\u0294\u0001\u0000\u0000"+
		"\u0000\u029a\u0296\u0001\u0000\u0000\u0000\u029a\u0298\u0001\u0000\u0000"+
		"\u0000\u029bS\u0001\u0000\u0000\u0000\u029c\u029d\u0007\u0000\u0000\u0000"+
		"\u029dU\u0001\u0000\u0000\u0000\u029e\u029f\u00051\u0000\u0000\u029f\u02a3"+
		"\u0006+\uffff\uffff\u0000\u02a0\u02a1\u00052\u0000\u0000\u02a1\u02a3\u0006"+
		"+\uffff\uffff\u0000\u02a2\u029e\u0001\u0000\u0000\u0000\u02a2\u02a0\u0001"+
		"\u0000\u0000\u0000\u02a3W\u0001\u0000\u0000\u0000-Zbx~\u0087\u008f\u0092"+
		"\u00bf\u00c1\u00cb\u00d5\u00ee\u00fd\u0103\u0108\u0115\u0120\u014e\u015b"+
		"\u016a\u0171\u017c\u0180\u018f\u019a\u01a1\u01ab\u01b4\u01be\u01c8\u01e4"+
		"\u01f2\u01fd\u0217\u0222\u022d\u0238\u0247\u0252\u025b\u026f\u027a\u028c"+
		"\u029a\u02a2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}