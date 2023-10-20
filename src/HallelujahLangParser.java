
// Generated from HallelujahLang.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({ "all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue" })
public class HallelujahLangParser extends Parser {
	static {
		RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION);
	}

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache = new PredictionContextCache();
	public static final int CLASS = 1, EXTENDS = 2, IMPLEMENTS = 3, INTERFACE = 4, METHOD = 5, NEW = 6, PACKAGE = 7,
			CONSTRUCTOR = 8, IMPORT = 9, THIS = 10, INPUT = 11, PRINT = 12, RETURN = 13, WHILE = 14,
			IF = 15, ELSE = 16, ELSEIF = 17, BOOLEAN = 18, BOOL_TRUE = 19, BOOL_FALSE = 20, FLOAT = 21,
			INT = 22, STRING = 23, VOID = 24, NULL = 25, ASSIGN = 26, DIVIDE = 27, MINUS = 28, MULTIPLY = 29,
			PLUS = 30, EQUALS = 31, GREATER_EQUAL = 32, GREATER_THAN = 33, LESS_EQUAL = 34,
			LESS_THAN = 35, NOT_EQUALS = 36, AND = 37, NOT = 38, OR = 39, COMMA = 40, DOT = 41,
			SEMICOLON = 42, LBRACE = 43, RBRACE = 44, LPAREN = 45, RPAREN = 46, LBRACKET = 47,
			RBRACKET = 48, LINE_COMMENT = 49, MULTILINE_COMMENT = 50, BOOL_CONST = 51, FLOAT_CONST = 52,
			ID = 53, INT_CONST = 54, STRING_CONST = 55, WS = 56;
	public static final int RULE_program = 0, RULE_package_declaration = 1, RULE_package_import = 2,
			RULE_class_declaration = 3, RULE_class_body = 4, RULE_class_instance = 5,
			RULE_field_declaration = 6, RULE_method_declaration = 7, RULE_parameters = 8,
			RULE_parameter = 9, RULE_block = 10, RULE_statement = 11, RULE_assignment_statement = 12,
			RULE_if_statement = 13, RULE_elseif_statement = 14, RULE_while_statement = 15,
			RULE_return_statement = 16, RULE_print = 17, RULE_method_call_statement = 18,
			RULE_class_method_call = 19, RULE_this_class_method_call = 20, RULE_print_statement = 21,
			RULE_input_statement = 22, RULE_interface_declaration = 23, RULE_interface_body = 24,
			RULE_arguments = 25, RULE_expression = 26, RULE_array_initializer = 27,
			RULE_array_access = 28, RULE_method_call = 29, RULE_data_type = 30, RULE_array_declaration = 31,
			RULE_constructor_declaration = 32, RULE_constructor_fields_declaration = 33,
			RULE_constructor_body = 34;

	private static String[] makeRuleNames() {
		return new String[] {
				"program", "package_declaration", "package_import", "class_declaration",
				"class_body", "class_instance", "field_declaration", "method_declaration",
				"parameters", "parameter", "block", "statement", "assignment_statement",
				"if_statement", "elseif_statement", "while_statement", "return_statement",
				"print", "method_call_statement", "class_method_call", "this_class_method_call",
				"print_statement", "input_statement", "interface_declaration", "interface_body",
				"arguments", "expression", "array_initializer", "array_access", "method_call",
				"data_type", "array_declaration", "constructor_declaration", "constructor_fields_declaration",
				"constructor_body"
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
	public String getGrammarFileName() {
		return "HallelujahLang.g4";
	}

	@Override
	public String[] getRuleNames() {
		return ruleNames;
	}

	@Override
	public String getSerializedATN() {
		return _serializedATN;
	}

	@Override
	public ATN getATN() {
		return _ATN;
	}

	public HallelujahLangParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() {
			return getToken(HallelujahLangParser.EOF, 0);
		}

		public Package_declarationContext package_declaration() {
			return getRuleContext(Package_declarationContext.class, 0);
		}

		public List<Class_declarationContext> class_declaration() {
			return getRuleContexts(Class_declarationContext.class);
		}

		public Class_declarationContext class_declaration(int i) {
			return getRuleContext(Class_declarationContext.class, i);
		}

		public List<Interface_declarationContext> interface_declaration() {
			return getRuleContexts(Interface_declarationContext.class);
		}

		public Interface_declarationContext interface_declaration(int i) {
			return getRuleContext(Interface_declarationContext.class, i);
		}

		public List<Package_importContext> package_import() {
			return getRuleContexts(Package_importContext.class);
		}

		public Package_importContext package_import(int i) {
			return getRuleContext(Package_importContext.class, i);
		}

		public List<TerminalNode> LINE_COMMENT() {
			return getTokens(HallelujahLangParser.LINE_COMMENT);
		}

		public TerminalNode LINE_COMMENT(int i) {
			return getToken(HallelujahLangParser.LINE_COMMENT, i);
		}

		public List<TerminalNode> MULTILINE_COMMENT() {
			return getTokens(HallelujahLangParser.MULTILINE_COMMENT);
		}

		public TerminalNode MULTILINE_COMMENT(int i) {
			return getToken(HallelujahLangParser.MULTILINE_COMMENT, i);
		}

		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_program;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HallelujahLangListener)
				((HallelujahLangListener) listener).enterProgram(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HallelujahLangListener)
				((HallelujahLangListener) listener).exitProgram(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof HallelujahLangVisitor)
				return ((HallelujahLangVisitor<? extends T>) visitor).visitProgram(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(71);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la == PACKAGE) {
					{
						setState(70);
						package_declaration();
					}
				}

				setState(80);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1688849860264466L) != 0)) {
					{
						setState(78);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
							case CLASS: {
								setState(73);
								class_declaration();
							}
								break;
							case INTERFACE: {
								setState(74);
								interface_declaration();
							}
								break;
							case IMPORT: {
								setState(75);
								package_import();
							}
								break;
							case LINE_COMMENT: {
								setState(76);
								match(LINE_COMMENT);
							}
								break;
							case MULTILINE_COMMENT: {
								setState(77);
								match(MULTILINE_COMMENT);
							}
								break;
							default:
								throw new NoViableAltException(this);
						}
					}
					setState(82);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(83);
				match(EOF);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Package_declarationContext extends ParserRuleContext {
		public TerminalNode PACKAGE() {
			return getToken(HallelujahLangParser.PACKAGE, 0);
		}

		public TerminalNode ID() {
			return getToken(HallelujahLangParser.ID, 0);
		}

		public TerminalNode SEMICOLON() {
			return getToken(HallelujahLangParser.SEMICOLON, 0);
		}

		public Package_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_package_declaration;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HallelujahLangListener)
				((HallelujahLangListener) listener).enterPackage_declaration(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HallelujahLangListener)
				((HallelujahLangListener) listener).exitPackage_declaration(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof HallelujahLangVisitor)
				return ((HallelujahLangVisitor<? extends T>) visitor).visitPackage_declaration(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final Package_declarationContext package_declaration() throws RecognitionException {
		Package_declarationContext _localctx = new Package_declarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_package_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(85);
				match(PACKAGE);
				setState(86);
				match(ID);
				setState(87);
				match(SEMICOLON);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Package_importContext extends ParserRuleContext {
		public TerminalNode IMPORT() {
			return getToken(HallelujahLangParser.IMPORT, 0);
		}

		public List<TerminalNode> ID() {
			return getTokens(HallelujahLangParser.ID);
		}

		public TerminalNode ID(int i) {
			return getToken(HallelujahLangParser.ID, i);
		}

		public TerminalNode DOT() {
			return getToken(HallelujahLangParser.DOT, 0);
		}

		public TerminalNode SEMICOLON() {
			return getToken(HallelujahLangParser.SEMICOLON, 0);
		}

		public Package_importContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_package_import;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HallelujahLangListener)
				((HallelujahLangListener) listener).enterPackage_import(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HallelujahLangListener)
				((HallelujahLangListener) listener).exitPackage_import(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof HallelujahLangVisitor)
				return ((HallelujahLangVisitor<? extends T>) visitor).visitPackage_import(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final Package_importContext package_import() throws RecognitionException {
		Package_importContext _localctx = new Package_importContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_package_import);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(89);
				match(IMPORT);
				setState(90);
				match(ID);
				setState(91);
				match(DOT);
				setState(92);
				match(ID);
				setState(93);
				match(SEMICOLON);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Class_declarationContext extends ParserRuleContext {
		public TerminalNode CLASS() {
			return getToken(HallelujahLangParser.CLASS, 0);
		}

		public List<TerminalNode> ID() {
			return getTokens(HallelujahLangParser.ID);
		}

		public TerminalNode ID(int i) {
			return getToken(HallelujahLangParser.ID, i);
		}

		public TerminalNode LBRACE() {
			return getToken(HallelujahLangParser.LBRACE, 0);
		}

		public Class_bodyContext class_body() {
			return getRuleContext(Class_bodyContext.class, 0);
		}

		public TerminalNode RBRACE() {
			return getToken(HallelujahLangParser.RBRACE, 0);
		}

		public TerminalNode EXTENDS() {
			return getToken(HallelujahLangParser.EXTENDS, 0);
		}

		public TerminalNode IMPLEMENTS() {
			return getToken(HallelujahLangParser.IMPLEMENTS, 0);
		}

		public List<TerminalNode> COMMA() {
			return getTokens(HallelujahLangParser.COMMA);
		}

		public TerminalNode COMMA(int i) {
			return getToken(HallelujahLangParser.COMMA, i);
		}

		public Class_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_class_declaration;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HallelujahLangListener)
				((HallelujahLangListener) listener).enterClass_declaration(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HallelujahLangListener)
				((HallelujahLangListener) listener).exitClass_declaration(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof HallelujahLangVisitor)
				return ((HallelujahLangVisitor<? extends T>) visitor).visitClass_declaration(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final Class_declarationContext class_declaration() throws RecognitionException {
		Class_declarationContext _localctx = new Class_declarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_class_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(95);
				match(CLASS);
				setState(96);
				match(ID);
				setState(99);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la == EXTENDS) {
					{
						setState(97);
						match(EXTENDS);
						setState(98);
						match(ID);
					}
				}

				setState(110);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la == IMPLEMENTS) {
					{
						setState(101);
						match(IMPLEMENTS);
						setState(102);
						match(ID);
						setState(107);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la == COMMA) {
							{
								{
									setState(103);
									match(COMMA);
									setState(104);
									match(ID);
								}
							}
							setState(109);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
					}
				}

				setState(112);
				match(LBRACE);
				setState(113);
				class_body();
				setState(114);
				match(RBRACE);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Class_bodyContext extends ParserRuleContext {
		public List<Field_declarationContext> field_declaration() {
			return getRuleContexts(Field_declarationContext.class);
		}

		public Field_declarationContext field_declaration(int i) {
			return getRuleContext(Field_declarationContext.class, i);
		}

		public List<Array_declarationContext> array_declaration() {
			return getRuleContexts(Array_declarationContext.class);
		}

		public Array_declarationContext array_declaration(int i) {
			return getRuleContext(Array_declarationContext.class, i);
		}

		public List<Print_statementContext> print_statement() {
			return getRuleContexts(Print_statementContext.class);
		}

		public Print_statementContext print_statement(int i) {
			return getRuleContext(Print_statementContext.class, i);
		}

		public List<Input_statementContext> input_statement() {
			return getRuleContexts(Input_statementContext.class);
		}

		public Input_statementContext input_statement(int i) {
			return getRuleContext(Input_statementContext.class, i);
		}

		public List<If_statementContext> if_statement() {
			return getRuleContexts(If_statementContext.class);
		}

		public If_statementContext if_statement(int i) {
			return getRuleContext(If_statementContext.class, i);
		}

		public List<While_statementContext> while_statement() {
			return getRuleContexts(While_statementContext.class);
		}

		public While_statementContext while_statement(int i) {
			return getRuleContext(While_statementContext.class, i);
		}

		public List<Method_declarationContext> method_declaration() {
			return getRuleContexts(Method_declarationContext.class);
		}

		public Method_declarationContext method_declaration(int i) {
			return getRuleContext(Method_declarationContext.class, i);
		}

		public List<Class_instanceContext> class_instance() {
			return getRuleContexts(Class_instanceContext.class);
		}

		public Class_instanceContext class_instance(int i) {
			return getRuleContext(Class_instanceContext.class, i);
		}

		public List<Class_method_callContext> class_method_call() {
			return getRuleContexts(Class_method_callContext.class);
		}

		public Class_method_callContext class_method_call(int i) {
			return getRuleContext(Class_method_callContext.class, i);
		}

		public List<TerminalNode> SEMICOLON() {
			return getTokens(HallelujahLangParser.SEMICOLON);
		}

		public TerminalNode SEMICOLON(int i) {
			return getToken(HallelujahLangParser.SEMICOLON, i);
		}

		public List<This_class_method_callContext> this_class_method_call() {
			return getRuleContexts(This_class_method_callContext.class);
		}

		public This_class_method_callContext this_class_method_call(int i) {
			return getRuleContext(This_class_method_callContext.class, i);
		}

		public List<Constructor_declarationContext> constructor_declaration() {
			return getRuleContexts(Constructor_declarationContext.class);
		}

		public Constructor_declarationContext constructor_declaration(int i) {
			return getRuleContext(Constructor_declarationContext.class, i);
		}

		public List<TerminalNode> LINE_COMMENT() {
			return getTokens(HallelujahLangParser.LINE_COMMENT);
		}

		public TerminalNode LINE_COMMENT(int i) {
			return getToken(HallelujahLangParser.LINE_COMMENT, i);
		}

		public List<TerminalNode> MULTILINE_COMMENT() {
			return getTokens(HallelujahLangParser.MULTILINE_COMMENT);
		}

		public TerminalNode MULTILINE_COMMENT(int i) {
			return getToken(HallelujahLangParser.MULTILINE_COMMENT, i);
		}

		public Class_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_class_body;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HallelujahLangListener)
				((HallelujahLangListener) listener).enterClass_body(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HallelujahLangListener)
				((HallelujahLangListener) listener).exitClass_body(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof HallelujahLangVisitor)
				return ((HallelujahLangVisitor<? extends T>) visitor).visitClass_body(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final Class_bodyContext class_body() throws RecognitionException {
		Class_bodyContext _localctx = new Class_bodyContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_class_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(133);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 10766417890958592L) != 0)) {
					{
						setState(131);
						_errHandler.sync(this);
						switch (getInterpreter().adaptivePredict(_input, 6, _ctx)) {
							case 1: {
								setState(116);
								field_declaration();
							}
								break;
							case 2: {
								setState(117);
								array_declaration();
							}
								break;
							case 3: {
								setState(118);
								print_statement();
							}
								break;
							case 4: {
								setState(119);
								input_statement();
							}
								break;
							case 5: {
								setState(120);
								if_statement();
							}
								break;
							case 6: {
								setState(121);
								while_statement();
							}
								break;
							case 7: {
								setState(122);
								method_declaration();
							}
								break;
							case 8: {
								setState(123);
								class_instance();
							}
								break;
							case 9: {
								setState(124);
								class_method_call();
								setState(125);
								match(SEMICOLON);
							}
								break;
							case 10: {
								setState(127);
								this_class_method_call();
							}
								break;
							case 11: {
								setState(128);
								constructor_declaration();
							}
								break;
							case 12: {
								setState(129);
								match(LINE_COMMENT);
							}
								break;
							case 13: {
								setState(130);
								match(MULTILINE_COMMENT);
							}
								break;
						}
					}
					setState(135);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Class_instanceContext extends ParserRuleContext {
		public Data_typeContext data_type() {
			return getRuleContext(Data_typeContext.class, 0);
		}

		public List<TerminalNode> ID() {
			return getTokens(HallelujahLangParser.ID);
		}

		public TerminalNode ID(int i) {
			return getToken(HallelujahLangParser.ID, i);
		}

		public TerminalNode ASSIGN() {
			return getToken(HallelujahLangParser.ASSIGN, 0);
		}

		public TerminalNode NEW() {
			return getToken(HallelujahLangParser.NEW, 0);
		}

		public TerminalNode LPAREN() {
			return getToken(HallelujahLangParser.LPAREN, 0);
		}

		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class, 0);
		}

		public TerminalNode RPAREN() {
			return getToken(HallelujahLangParser.RPAREN, 0);
		}

		public TerminalNode SEMICOLON() {
			return getToken(HallelujahLangParser.SEMICOLON, 0);
		}

		public Class_instanceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_class_instance;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HallelujahLangListener)
				((HallelujahLangListener) listener).enterClass_instance(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HallelujahLangListener)
				((HallelujahLangListener) listener).exitClass_instance(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof HallelujahLangVisitor)
				return ((HallelujahLangVisitor<? extends T>) visitor).visitClass_instance(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final Class_instanceContext class_instance() throws RecognitionException {
		Class_instanceContext _localctx = new Class_instanceContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_class_instance);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(136);
				data_type();
				setState(137);
				match(ID);
				setState(138);
				match(ASSIGN);
				setState(139);
				match(NEW);
				setState(140);
				match(ID);
				setState(141);
				match(LPAREN);
				setState(142);
				arguments();
				setState(143);
				match(RPAREN);
				setState(144);
				match(SEMICOLON);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Field_declarationContext extends ParserRuleContext {
		public Data_typeContext data_type() {
			return getRuleContext(Data_typeContext.class, 0);
		}

		public TerminalNode ID() {
			return getToken(HallelujahLangParser.ID, 0);
		}

		public TerminalNode SEMICOLON() {
			return getToken(HallelujahLangParser.SEMICOLON, 0);
		}

		public TerminalNode ASSIGN() {
			return getToken(HallelujahLangParser.ASSIGN, 0);
		}

		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class, 0);
		}

		public Field_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_field_declaration;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HallelujahLangListener)
				((HallelujahLangListener) listener).enterField_declaration(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HallelujahLangListener)
				((HallelujahLangListener) listener).exitField_declaration(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof HallelujahLangVisitor)
				return ((HallelujahLangVisitor<? extends T>) visitor).visitField_declaration(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final Field_declarationContext field_declaration() throws RecognitionException {
		Field_declarationContext _localctx = new Field_declarationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_field_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(146);
				data_type();
				setState(147);
				match(ID);
				setState(153);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
					case SEMICOLON: {
						setState(148);
						match(SEMICOLON);
					}
						break;
					case ASSIGN: {
						setState(149);
						match(ASSIGN);
						setState(150);
						expression(0);
						setState(151);
						match(SEMICOLON);
					}
						break;
					default:
						throw new NoViableAltException(this);
				}
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Method_declarationContext extends ParserRuleContext {
		public Data_typeContext data_type() {
			return getRuleContext(Data_typeContext.class, 0);
		}

		public TerminalNode METHOD() {
			return getToken(HallelujahLangParser.METHOD, 0);
		}

		public TerminalNode ID() {
			return getToken(HallelujahLangParser.ID, 0);
		}

		public TerminalNode LPAREN() {
			return getToken(HallelujahLangParser.LPAREN, 0);
		}

		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class, 0);
		}

		public TerminalNode RPAREN() {
			return getToken(HallelujahLangParser.RPAREN, 0);
		}

		public BlockContext block() {
			return getRuleContext(BlockContext.class, 0);
		}

		public Method_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_method_declaration;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HallelujahLangListener)
				((HallelujahLangListener) listener).enterMethod_declaration(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HallelujahLangListener)
				((HallelujahLangListener) listener).exitMethod_declaration(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof HallelujahLangVisitor)
				return ((HallelujahLangVisitor<? extends T>) visitor).visitMethod_declaration(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final Method_declarationContext method_declaration() throws RecognitionException {
		Method_declarationContext _localctx = new Method_declarationContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_method_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(155);
				data_type();
				setState(156);
				match(METHOD);
				setState(157);
				match(ID);
				setState(158);
				match(LPAREN);
				setState(159);
				parameters();
				setState(160);
				match(RPAREN);
				setState(161);
				block();
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParametersContext extends ParserRuleContext {
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}

		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class, i);
		}

		public List<TerminalNode> COMMA() {
			return getTokens(HallelujahLangParser.COMMA);
		}

		public TerminalNode COMMA(int i) {
			return getToken(HallelujahLangParser.COMMA, i);
		}

		public TerminalNode WS() {
			return getToken(HallelujahLangParser.WS, 0);
		}

		public ParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_parameters;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HallelujahLangListener)
				((HallelujahLangListener) listener).enterParameters(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HallelujahLangListener)
				((HallelujahLangListener) listener).exitParameters(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof HallelujahLangVisitor)
				return ((HallelujahLangVisitor<? extends T>) visitor).visitParameters(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final ParametersContext parameters() throws RecognitionException {
		ParametersContext _localctx = new ParametersContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_parameters);
		int _la;
		try {
			setState(174);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
				case BOOLEAN:
				case FLOAT:
				case INT:
				case STRING:
				case VOID:
					enterOuterAlt(_localctx, 1); {
					setState(163);
					parameter();
					setState(168);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la == COMMA) {
						{
							{
								setState(164);
								match(COMMA);
								setState(165);
								parameter();
							}
						}
						setState(170);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
				}
					break;
				case RPAREN:
				case WS:
					enterOuterAlt(_localctx, 2); {
					setState(172);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la == WS) {
						{
							setState(171);
							match(WS);
						}
					}

				}
					break;
				default:
					throw new NoViableAltException(this);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParameterContext extends ParserRuleContext {
		public Data_typeContext data_type() {
			return getRuleContext(Data_typeContext.class, 0);
		}

		public TerminalNode ID() {
			return getToken(HallelujahLangParser.ID, 0);
		}

		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_parameter;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HallelujahLangListener)
				((HallelujahLangListener) listener).enterParameter(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HallelujahLangListener)
				((HallelujahLangListener) listener).exitParameter(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof HallelujahLangVisitor)
				return ((HallelujahLangVisitor<? extends T>) visitor).visitParameter(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_parameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(176);
				data_type();
				setState(177);
				match(ID);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BlockContext extends ParserRuleContext {
		public TerminalNode LBRACE() {
			return getToken(HallelujahLangParser.LBRACE, 0);
		}

		public TerminalNode RBRACE() {
			return getToken(HallelujahLangParser.RBRACE, 0);
		}

		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}

		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class, i);
		}

		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_block;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HallelujahLangListener)
				((HallelujahLangListener) listener).enterBlock(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HallelujahLangListener)
				((HallelujahLangListener) listener).exitBlock(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof HallelujahLangVisitor)
				return ((HallelujahLangVisitor<? extends T>) visitor).visitBlock(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(179);
				match(LBRACE);
				setState(183);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 71706025260284960L) != 0)) {
					{
						{
							setState(180);
							statement();
						}
					}
					setState(185);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(186);
				match(RBRACE);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public Assignment_statementContext assignment_statement() {
			return getRuleContext(Assignment_statementContext.class, 0);
		}

		public If_statementContext if_statement() {
			return getRuleContext(If_statementContext.class, 0);
		}

		public While_statementContext while_statement() {
			return getRuleContext(While_statementContext.class, 0);
		}

		public Return_statementContext return_statement() {
			return getRuleContext(Return_statementContext.class, 0);
		}

		public Method_callContext method_call() {
			return getRuleContext(Method_callContext.class, 0);
		}

		public Method_call_statementContext method_call_statement() {
			return getRuleContext(Method_call_statementContext.class, 0);
		}

		public Class_method_callContext class_method_call() {
			return getRuleContext(Class_method_callContext.class, 0);
		}

		public TerminalNode SEMICOLON() {
			return getToken(HallelujahLangParser.SEMICOLON, 0);
		}

		public Print_statementContext print_statement() {
			return getRuleContext(Print_statementContext.class, 0);
		}

		public Input_statementContext input_statement() {
			return getRuleContext(Input_statementContext.class, 0);
		}

		public Array_accessContext array_access() {
			return getRuleContext(Array_accessContext.class, 0);
		}

		public Array_declarationContext array_declaration() {
			return getRuleContext(Array_declarationContext.class, 0);
		}

		public Class_instanceContext class_instance() {
			return getRuleContext(Class_instanceContext.class, 0);
		}

		public This_class_method_callContext this_class_method_call() {
			return getRuleContext(This_class_method_callContext.class, 0);
		}

		public TerminalNode LINE_COMMENT() {
			return getToken(HallelujahLangParser.LINE_COMMENT, 0);
		}

		public TerminalNode MULTILINE_COMMENT() {
			return getToken(HallelujahLangParser.MULTILINE_COMMENT, 0);
		}

		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class, 0);
		}

		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_statement;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HallelujahLangListener)
				((HallelujahLangListener) listener).enterStatement(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HallelujahLangListener)
				((HallelujahLangListener) listener).exitStatement(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof HallelujahLangVisitor)
				return ((HallelujahLangVisitor<? extends T>) visitor).visitStatement(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_statement);
		try {
			setState(208);
			_errHandler.sync(this);
			switch (getInterpreter().adaptivePredict(_input, 13, _ctx)) {
				case 1:
					enterOuterAlt(_localctx, 1); {
					setState(188);
					assignment_statement();
				}
					break;
				case 2:
					enterOuterAlt(_localctx, 2); {
					setState(189);
					if_statement();
				}
					break;
				case 3:
					enterOuterAlt(_localctx, 3); {
					setState(190);
					while_statement();
				}
					break;
				case 4:
					enterOuterAlt(_localctx, 4); {
					setState(191);
					return_statement();
				}
					break;
				case 5:
					enterOuterAlt(_localctx, 5); {
					setState(192);
					method_call();
				}
					break;
				case 6:
					enterOuterAlt(_localctx, 6); {
					setState(193);
					method_call_statement();
				}
					break;
				case 7:
					enterOuterAlt(_localctx, 7); {
					setState(194);
					class_method_call();
					setState(195);
					match(SEMICOLON);
				}
					break;
				case 8:
					enterOuterAlt(_localctx, 8); {
					setState(197);
					print_statement();
				}
					break;
				case 9:
					enterOuterAlt(_localctx, 9); {
					setState(198);
					input_statement();
				}
					break;
				case 10:
					enterOuterAlt(_localctx, 10); {
					setState(199);
					array_access();
				}
					break;
				case 11:
					enterOuterAlt(_localctx, 11); {
					setState(200);
					array_declaration();
				}
					break;
				case 12:
					enterOuterAlt(_localctx, 12); {
					setState(201);
					class_instance();
				}
					break;
				case 13:
					enterOuterAlt(_localctx, 13); {
					setState(202);
					this_class_method_call();
				}
					break;
				case 14:
					enterOuterAlt(_localctx, 14); {
					setState(203);
					match(LINE_COMMENT);
				}
					break;
				case 15:
					enterOuterAlt(_localctx, 15); {
					setState(204);
					match(MULTILINE_COMMENT);
				}
					break;
				case 16:
					enterOuterAlt(_localctx, 16); {
					setState(205);
					expression(0);
					setState(206);
					match(SEMICOLON);
				}
					break;
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Assignment_statementContext extends ParserRuleContext {
		public TerminalNode ID() {
			return getToken(HallelujahLangParser.ID, 0);
		}

		public TerminalNode ASSIGN() {
			return getToken(HallelujahLangParser.ASSIGN, 0);
		}

		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class, 0);
		}

		public TerminalNode SEMICOLON() {
			return getToken(HallelujahLangParser.SEMICOLON, 0);
		}

		public Data_typeContext data_type() {
			return getRuleContext(Data_typeContext.class, 0);
		}

		public Array_initializerContext array_initializer() {
			return getRuleContext(Array_initializerContext.class, 0);
		}

		public Assignment_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_assignment_statement;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HallelujahLangListener)
				((HallelujahLangListener) listener).enterAssignment_statement(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HallelujahLangListener)
				((HallelujahLangListener) listener).exitAssignment_statement(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof HallelujahLangVisitor)
				return ((HallelujahLangVisitor<? extends T>) visitor).visitAssignment_statement(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final Assignment_statementContext assignment_statement() throws RecognitionException {
		Assignment_statementContext _localctx = new Assignment_statementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_assignment_statement);
		try {
			setState(222);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
				case ID:
					enterOuterAlt(_localctx, 1); {
					setState(210);
					match(ID);
					setState(211);
					match(ASSIGN);
					setState(212);
					expression(0);
					setState(213);
					match(SEMICOLON);
				}
					break;
				case BOOLEAN:
				case FLOAT:
				case INT:
				case STRING:
				case VOID:
					enterOuterAlt(_localctx, 2); {
					setState(215);
					data_type();
					setState(216);
					match(ID);
					setState(217);
					match(ASSIGN);
					setState(218);
					expression(0);
					setState(219);
					match(SEMICOLON);
				}
					break;
				case LBRACKET:
					enterOuterAlt(_localctx, 3); {
					setState(221);
					array_initializer();
				}
					break;
				default:
					throw new NoViableAltException(this);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class If_statementContext extends ParserRuleContext {
		public TerminalNode IF() {
			return getToken(HallelujahLangParser.IF, 0);
		}

		public TerminalNode LPAREN() {
			return getToken(HallelujahLangParser.LPAREN, 0);
		}

		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class, 0);
		}

		public TerminalNode RPAREN() {
			return getToken(HallelujahLangParser.RPAREN, 0);
		}

		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}

		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class, i);
		}

		public List<Elseif_statementContext> elseif_statement() {
			return getRuleContexts(Elseif_statementContext.class);
		}

		public Elseif_statementContext elseif_statement(int i) {
			return getRuleContext(Elseif_statementContext.class, i);
		}

		public TerminalNode ELSE() {
			return getToken(HallelujahLangParser.ELSE, 0);
		}

		public If_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_if_statement;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HallelujahLangListener)
				((HallelujahLangListener) listener).enterIf_statement(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HallelujahLangListener)
				((HallelujahLangListener) listener).exitIf_statement(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof HallelujahLangVisitor)
				return ((HallelujahLangVisitor<? extends T>) visitor).visitIf_statement(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final If_statementContext if_statement() throws RecognitionException {
		If_statementContext _localctx = new If_statementContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_if_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(224);
				match(IF);
				setState(225);
				match(LPAREN);
				setState(226);
				expression(0);
				setState(227);
				match(RPAREN);
				setState(228);
				block();
				setState(232);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la == ELSEIF) {
					{
						{
							setState(229);
							elseif_statement();
						}
					}
					setState(234);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(237);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la == ELSE) {
					{
						setState(235);
						match(ELSE);
						setState(236);
						block();
					}
				}

			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Elseif_statementContext extends ParserRuleContext {
		public TerminalNode ELSEIF() {
			return getToken(HallelujahLangParser.ELSEIF, 0);
		}

		public TerminalNode LPAREN() {
			return getToken(HallelujahLangParser.LPAREN, 0);
		}

		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class, 0);
		}

		public TerminalNode RPAREN() {
			return getToken(HallelujahLangParser.RPAREN, 0);
		}

		public BlockContext block() {
			return getRuleContext(BlockContext.class, 0);
		}

		public Elseif_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_elseif_statement;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HallelujahLangListener)
				((HallelujahLangListener) listener).enterElseif_statement(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HallelujahLangListener)
				((HallelujahLangListener) listener).exitElseif_statement(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof HallelujahLangVisitor)
				return ((HallelujahLangVisitor<? extends T>) visitor).visitElseif_statement(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final Elseif_statementContext elseif_statement() throws RecognitionException {
		Elseif_statementContext _localctx = new Elseif_statementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_elseif_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(239);
				match(ELSEIF);
				setState(240);
				match(LPAREN);
				setState(241);
				expression(0);
				setState(242);
				match(RPAREN);
				setState(243);
				block();
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class While_statementContext extends ParserRuleContext {
		public TerminalNode WHILE() {
			return getToken(HallelujahLangParser.WHILE, 0);
		}

		public TerminalNode LPAREN() {
			return getToken(HallelujahLangParser.LPAREN, 0);
		}

		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class, 0);
		}

		public TerminalNode RPAREN() {
			return getToken(HallelujahLangParser.RPAREN, 0);
		}

		public BlockContext block() {
			return getRuleContext(BlockContext.class, 0);
		}

		public While_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_while_statement;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HallelujahLangListener)
				((HallelujahLangListener) listener).enterWhile_statement(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HallelujahLangListener)
				((HallelujahLangListener) listener).exitWhile_statement(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof HallelujahLangVisitor)
				return ((HallelujahLangVisitor<? extends T>) visitor).visitWhile_statement(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final While_statementContext while_statement() throws RecognitionException {
		While_statementContext _localctx = new While_statementContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_while_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(245);
				match(WHILE);
				setState(246);
				match(LPAREN);
				setState(247);
				expression(0);
				setState(248);
				match(RPAREN);
				setState(249);
				block();
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Return_statementContext extends ParserRuleContext {
		public TerminalNode RETURN() {
			return getToken(HallelujahLangParser.RETURN, 0);
		}

		public PrintContext print() {
			return getRuleContext(PrintContext.class, 0);
		}

		public TerminalNode SEMICOLON() {
			return getToken(HallelujahLangParser.SEMICOLON, 0);
		}

		public Return_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_return_statement;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HallelujahLangListener)
				((HallelujahLangListener) listener).enterReturn_statement(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HallelujahLangListener)
				((HallelujahLangListener) listener).exitReturn_statement(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof HallelujahLangVisitor)
				return ((HallelujahLangVisitor<? extends T>) visitor).visitReturn_statement(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final Return_statementContext return_statement() throws RecognitionException {
		Return_statementContext _localctx = new Return_statementContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_return_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(251);
				match(RETURN);
				setState(252);
				print();
				setState(253);
				match(SEMICOLON);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PrintContext extends ParserRuleContext {
		public List<TerminalNode> STRING_CONST() {
			return getTokens(HallelujahLangParser.STRING_CONST);
		}

		public TerminalNode STRING_CONST(int i) {
			return getToken(HallelujahLangParser.STRING_CONST, i);
		}

		public List<TerminalNode> ID() {
			return getTokens(HallelujahLangParser.ID);
		}

		public TerminalNode ID(int i) {
			return getToken(HallelujahLangParser.ID, i);
		}

		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}

		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class, i);
		}

		public List<This_class_method_callContext> this_class_method_call() {
			return getRuleContexts(This_class_method_callContext.class);
		}

		public This_class_method_callContext this_class_method_call(int i) {
			return getRuleContext(This_class_method_callContext.class, i);
		}

		public List<TerminalNode> PLUS() {
			return getTokens(HallelujahLangParser.PLUS);
		}

		public TerminalNode PLUS(int i) {
			return getToken(HallelujahLangParser.PLUS, i);
		}

		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_print;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HallelujahLangListener)
				((HallelujahLangListener) listener).enterPrint(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HallelujahLangListener)
				((HallelujahLangListener) listener).exitPrint(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof HallelujahLangVisitor)
				return ((HallelujahLangVisitor<? extends T>) visitor).visitPrint(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_print);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
				setState(259);
				_errHandler.sync(this);
				switch (getInterpreter().adaptivePredict(_input, 17, _ctx)) {
					case 1: {
						setState(255);
						match(STRING_CONST);
					}
						break;
					case 2: {
						setState(256);
						match(ID);
					}
						break;
					case 3: {
						setState(257);
						expression(0);
					}
						break;
					case 4: {
						setState(258);
						this_class_method_call();
					}
						break;
				}
				setState(270);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input, 19, _ctx);
				while (_alt != 1 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
					if (_alt == 1 + 1) {
						{
							{
								setState(261);
								match(PLUS);
								setState(266);
								_errHandler.sync(this);
								switch (getInterpreter().adaptivePredict(_input, 18, _ctx)) {
									case 1: {
										setState(262);
										match(STRING_CONST);
									}
										break;
									case 2: {
										setState(263);
										match(ID);
									}
										break;
									case 3: {
										setState(264);
										expression(0);
									}
										break;
									case 4: {
										setState(265);
										this_class_method_call();
									}
										break;
								}
							}
						}
					}
					setState(272);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input, 19, _ctx);
				}
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Method_call_statementContext extends ParserRuleContext {
		public TerminalNode ID() {
			return getToken(HallelujahLangParser.ID, 0);
		}

		public TerminalNode LPAREN() {
			return getToken(HallelujahLangParser.LPAREN, 0);
		}

		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class, 0);
		}

		public TerminalNode RPAREN() {
			return getToken(HallelujahLangParser.RPAREN, 0);
		}

		public Method_call_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_method_call_statement;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HallelujahLangListener)
				((HallelujahLangListener) listener).enterMethod_call_statement(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HallelujahLangListener)
				((HallelujahLangListener) listener).exitMethod_call_statement(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof HallelujahLangVisitor)
				return ((HallelujahLangVisitor<? extends T>) visitor).visitMethod_call_statement(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final Method_call_statementContext method_call_statement() throws RecognitionException {
		Method_call_statementContext _localctx = new Method_call_statementContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_method_call_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(273);
				match(ID);
				setState(274);
				match(LPAREN);
				setState(275);
				arguments();
				setState(276);
				match(RPAREN);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Class_method_callContext extends ParserRuleContext {
		public List<TerminalNode> ID() {
			return getTokens(HallelujahLangParser.ID);
		}

		public TerminalNode ID(int i) {
			return getToken(HallelujahLangParser.ID, i);
		}

		public TerminalNode DOT() {
			return getToken(HallelujahLangParser.DOT, 0);
		}

		public TerminalNode LPAREN() {
			return getToken(HallelujahLangParser.LPAREN, 0);
		}

		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class, 0);
		}

		public TerminalNode RPAREN() {
			return getToken(HallelujahLangParser.RPAREN, 0);
		}

		public Class_method_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_class_method_call;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HallelujahLangListener)
				((HallelujahLangListener) listener).enterClass_method_call(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HallelujahLangListener)
				((HallelujahLangListener) listener).exitClass_method_call(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof HallelujahLangVisitor)
				return ((HallelujahLangVisitor<? extends T>) visitor).visitClass_method_call(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final Class_method_callContext class_method_call() throws RecognitionException {
		Class_method_callContext _localctx = new Class_method_callContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_class_method_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(278);
				match(ID);
				setState(279);
				match(DOT);
				setState(280);
				match(ID);
				setState(281);
				match(LPAREN);
				setState(282);
				arguments();
				setState(283);
				match(RPAREN);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class This_class_method_callContext extends ParserRuleContext {
		public TerminalNode THIS() {
			return getToken(HallelujahLangParser.THIS, 0);
		}

		public TerminalNode DOT() {
			return getToken(HallelujahLangParser.DOT, 0);
		}

		public TerminalNode ID() {
			return getToken(HallelujahLangParser.ID, 0);
		}

		public TerminalNode LPAREN() {
			return getToken(HallelujahLangParser.LPAREN, 0);
		}

		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class, 0);
		}

		public TerminalNode RPAREN() {
			return getToken(HallelujahLangParser.RPAREN, 0);
		}

		public This_class_method_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_this_class_method_call;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HallelujahLangListener)
				((HallelujahLangListener) listener).enterThis_class_method_call(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HallelujahLangListener)
				((HallelujahLangListener) listener).exitThis_class_method_call(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof HallelujahLangVisitor)
				return ((HallelujahLangVisitor<? extends T>) visitor).visitThis_class_method_call(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final This_class_method_callContext this_class_method_call() throws RecognitionException {
		This_class_method_callContext _localctx = new This_class_method_callContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_this_class_method_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(285);
				match(THIS);
				setState(286);
				match(DOT);
				setState(287);
				match(ID);
				setState(292);
				_errHandler.sync(this);
				switch (getInterpreter().adaptivePredict(_input, 20, _ctx)) {
					case 1: {
						setState(288);
						match(LPAREN);
						setState(289);
						arguments();
						setState(290);
						match(RPAREN);
					}
						break;
				}
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Print_statementContext extends ParserRuleContext {
		public TerminalNode PRINT() {
			return getToken(HallelujahLangParser.PRINT, 0);
		}

		public TerminalNode LPAREN() {
			return getToken(HallelujahLangParser.LPAREN, 0);
		}

		public PrintContext print() {
			return getRuleContext(PrintContext.class, 0);
		}

		public TerminalNode RPAREN() {
			return getToken(HallelujahLangParser.RPAREN, 0);
		}

		public TerminalNode SEMICOLON() {
			return getToken(HallelujahLangParser.SEMICOLON, 0);
		}

		public Class_method_callContext class_method_call() {
			return getRuleContext(Class_method_callContext.class, 0);
		}

		public Print_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_print_statement;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HallelujahLangListener)
				((HallelujahLangListener) listener).enterPrint_statement(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HallelujahLangListener)
				((HallelujahLangListener) listener).exitPrint_statement(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof HallelujahLangVisitor)
				return ((HallelujahLangVisitor<? extends T>) visitor).visitPrint_statement(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final Print_statementContext print_statement() throws RecognitionException {
		Print_statementContext _localctx = new Print_statementContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_print_statement);
		int _la;
		try {
			setState(302);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
				case PRINT:
					enterOuterAlt(_localctx, 1); {
					setState(294);
					match(PRINT);
					setState(295);
					match(LPAREN);
					setState(296);
					print();
				}
					break;
				case RPAREN:
				case ID:
					enterOuterAlt(_localctx, 2); {
					setState(298);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la == ID) {
						{
							setState(297);
							class_method_call();
						}
					}

					setState(300);
					match(RPAREN);
					setState(301);
					match(SEMICOLON);
				}
					break;
				default:
					throw new NoViableAltException(this);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Input_statementContext extends ParserRuleContext {
		public TerminalNode INPUT() {
			return getToken(HallelujahLangParser.INPUT, 0);
		}

		public TerminalNode LPAREN() {
			return getToken(HallelujahLangParser.LPAREN, 0);
		}

		public TerminalNode ID() {
			return getToken(HallelujahLangParser.ID, 0);
		}

		public TerminalNode RPAREN() {
			return getToken(HallelujahLangParser.RPAREN, 0);
		}

		public TerminalNode SEMICOLON() {
			return getToken(HallelujahLangParser.SEMICOLON, 0);
		}

		public Input_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_input_statement;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HallelujahLangListener)
				((HallelujahLangListener) listener).enterInput_statement(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HallelujahLangListener)
				((HallelujahLangListener) listener).exitInput_statement(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof HallelujahLangVisitor)
				return ((HallelujahLangVisitor<? extends T>) visitor).visitInput_statement(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final Input_statementContext input_statement() throws RecognitionException {
		Input_statementContext _localctx = new Input_statementContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_input_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(304);
				match(INPUT);
				setState(305);
				match(LPAREN);
				setState(306);
				match(ID);
				setState(307);
				match(RPAREN);
				setState(308);
				match(SEMICOLON);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Interface_declarationContext extends ParserRuleContext {
		public TerminalNode INTERFACE() {
			return getToken(HallelujahLangParser.INTERFACE, 0);
		}

		public TerminalNode ID() {
			return getToken(HallelujahLangParser.ID, 0);
		}

		public TerminalNode LBRACE() {
			return getToken(HallelujahLangParser.LBRACE, 0);
		}

		public Interface_bodyContext interface_body() {
			return getRuleContext(Interface_bodyContext.class, 0);
		}

		public TerminalNode RBRACE() {
			return getToken(HallelujahLangParser.RBRACE, 0);
		}

		public Interface_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_interface_declaration;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HallelujahLangListener)
				((HallelujahLangListener) listener).enterInterface_declaration(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HallelujahLangListener)
				((HallelujahLangListener) listener).exitInterface_declaration(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof HallelujahLangVisitor)
				return ((HallelujahLangVisitor<? extends T>) visitor).visitInterface_declaration(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final Interface_declarationContext interface_declaration() throws RecognitionException {
		Interface_declarationContext _localctx = new Interface_declarationContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_interface_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(310);
				match(INTERFACE);
				setState(311);
				match(ID);
				setState(312);
				match(LBRACE);
				setState(313);
				interface_body();
				setState(314);
				match(RBRACE);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Interface_bodyContext extends ParserRuleContext {
		public List<Method_declarationContext> method_declaration() {
			return getRuleContexts(Method_declarationContext.class);
		}

		public Method_declarationContext method_declaration(int i) {
			return getRuleContext(Method_declarationContext.class, i);
		}

		public List<Method_call_statementContext> method_call_statement() {
			return getRuleContexts(Method_call_statementContext.class);
		}

		public Method_call_statementContext method_call_statement(int i) {
			return getRuleContext(Method_call_statementContext.class, i);
		}

		public List<Data_typeContext> data_type() {
			return getRuleContexts(Data_typeContext.class);
		}

		public Data_typeContext data_type(int i) {
			return getRuleContext(Data_typeContext.class, i);
		}

		public Interface_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_interface_body;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HallelujahLangListener)
				((HallelujahLangListener) listener).enterInterface_body(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HallelujahLangListener)
				((HallelujahLangListener) listener).exitInterface_body(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof HallelujahLangVisitor)
				return ((HallelujahLangVisitor<? extends T>) visitor).visitInterface_body(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final Interface_bodyContext interface_body() throws RecognitionException {
		Interface_bodyContext _localctx = new Interface_bodyContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_interface_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(323);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 9007199286460416L) != 0)) {
					{
						setState(321);
						_errHandler.sync(this);
						switch (getInterpreter().adaptivePredict(_input, 23, _ctx)) {
							case 1: {
								setState(316);
								method_declaration();
							}
								break;
							case 2: {
								setState(317);
								method_call_statement();
							}
								break;
							case 3: {
								{
									setState(318);
									data_type();
									setState(319);
									method_call_statement();
								}
							}
								break;
						}
					}
					setState(325);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArgumentsContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}

		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class, i);
		}

		public List<TerminalNode> COMMA() {
			return getTokens(HallelujahLangParser.COMMA);
		}

		public TerminalNode COMMA(int i) {
			return getToken(HallelujahLangParser.COMMA, i);
		}

		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_arguments;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HallelujahLangListener)
				((HallelujahLangListener) listener).enterArguments(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HallelujahLangListener)
				((HallelujahLangListener) listener).exitArguments(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof HallelujahLangVisitor)
				return ((HallelujahLangVisitor<? extends T>) visitor).visitArguments(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(334);
				_errHandler.sync(this);
				switch (getInterpreter().adaptivePredict(_input, 26, _ctx)) {
					case 1: {
						setState(326);
						expression(0);
						setState(331);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la == COMMA) {
							{
								{
									setState(327);
									match(COMMA);
									setState(328);
									expression(0);
								}
							}
							setState(333);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
					}
						break;
				}
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public TerminalNode NOT() {
			return getToken(HallelujahLangParser.NOT, 0);
		}

		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}

		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class, i);
		}

		public TerminalNode ID() {
			return getToken(HallelujahLangParser.ID, 0);
		}

		public TerminalNode INT_CONST() {
			return getToken(HallelujahLangParser.INT_CONST, 0);
		}

		public TerminalNode FLOAT_CONST() {
			return getToken(HallelujahLangParser.FLOAT_CONST, 0);
		}

		public TerminalNode STRING_CONST() {
			return getToken(HallelujahLangParser.STRING_CONST, 0);
		}

		public TerminalNode BOOL_CONST() {
			return getToken(HallelujahLangParser.BOOL_CONST, 0);
		}

		public TerminalNode NULL() {
			return getToken(HallelujahLangParser.NULL, 0);
		}

		public Class_method_callContext class_method_call() {
			return getRuleContext(Class_method_callContext.class, 0);
		}

		public Array_initializerContext array_initializer() {
			return getRuleContext(Array_initializerContext.class, 0);
		}

		public Method_call_statementContext method_call_statement() {
			return getRuleContext(Method_call_statementContext.class, 0);
		}

		public This_class_method_callContext this_class_method_call() {
			return getRuleContext(This_class_method_callContext.class, 0);
		}

		public TerminalNode PLUS() {
			return getToken(HallelujahLangParser.PLUS, 0);
		}

		public TerminalNode MINUS() {
			return getToken(HallelujahLangParser.MINUS, 0);
		}

		public TerminalNode MULTIPLY() {
			return getToken(HallelujahLangParser.MULTIPLY, 0);
		}

		public TerminalNode DIVIDE() {
			return getToken(HallelujahLangParser.DIVIDE, 0);
		}

		public TerminalNode EQUALS() {
			return getToken(HallelujahLangParser.EQUALS, 0);
		}

		public TerminalNode NOT_EQUALS() {
			return getToken(HallelujahLangParser.NOT_EQUALS, 0);
		}

		public TerminalNode LESS_THAN() {
			return getToken(HallelujahLangParser.LESS_THAN, 0);
		}

		public TerminalNode GREATER_THAN() {
			return getToken(HallelujahLangParser.GREATER_THAN, 0);
		}

		public TerminalNode LESS_EQUAL() {
			return getToken(HallelujahLangParser.LESS_EQUAL, 0);
		}

		public TerminalNode GREATER_EQUAL() {
			return getToken(HallelujahLangParser.GREATER_EQUAL, 0);
		}

		public TerminalNode AND() {
			return getToken(HallelujahLangParser.AND, 0);
		}

		public TerminalNode OR() {
			return getToken(HallelujahLangParser.OR, 0);
		}

		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_expression;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HallelujahLangListener)
				((HallelujahLangListener) listener).enterExpression(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HallelujahLangListener)
				((HallelujahLangListener) listener).exitExpression(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof HallelujahLangVisitor)
				return ((HallelujahLangVisitor<? extends T>) visitor).visitExpression(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 52;
		enterRecursionRule(_localctx, 52, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
				setState(351);
				_errHandler.sync(this);
				switch (getInterpreter().adaptivePredict(_input, 27, _ctx)) {
					case 1: {
						setState(337);
						match(NOT);
						setState(338);
						expression(12);
					}
						break;
					case 2: {
						setState(339);
						match(ID);
					}
						break;
					case 3: {
						setState(340);
						match(INT_CONST);
					}
						break;
					case 4: {
						setState(341);
						match(FLOAT_CONST);
					}
						break;
					case 5: {
						setState(342);
						match(STRING_CONST);
					}
						break;
					case 6: {
						setState(343);
						match(BOOL_CONST);
					}
						break;
					case 7: {
						setState(344);
						match(NULL);
					}
						break;
					case 8: {
						setState(345);
						class_method_call();
					}
						break;
					case 9: {
						setState(346);
						array_initializer();
					}
						break;
					case 10: {
						setState(347);
						match(ID);
						setState(348);
						array_initializer();
					}
						break;
					case 11: {
						setState(349);
						method_call_statement();
					}
						break;
					case 12: {
						setState(350);
						this_class_method_call();
					}
						break;
				}
				_ctx.stop = _input.LT(-1);
				setState(358);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input, 28, _ctx);
				while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
					if (_alt == 1) {
						if (_parseListeners != null)
							triggerExitRuleEvent();
						_prevctx = _localctx;
						{
							{
								_localctx = new ExpressionContext(_parentctx, _parentState);
								pushNewRecursionContext(_localctx, _startState, RULE_expression);
								setState(353);
								if (!(precpred(_ctx, 13)))
									throw new FailedPredicateException(this, "precpred(_ctx, 13)");
								setState(354);
								_la = _input.LA(1);
								if (!((((_la) & ~0x3f) == 0 && ((1L << _la) & 824499503104L) != 0))) {
									_errHandler.recoverInline(this);
								} else {
									if (_input.LA(1) == Token.EOF)
										matchedEOF = true;
									_errHandler.reportMatch(this);
									consume();
								}
								setState(355);
								expression(14);
							}
						}
					}
					setState(360);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input, 28, _ctx);
				}
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Array_initializerContext extends ParserRuleContext {
		public List<TerminalNode> LBRACKET() {
			return getTokens(HallelujahLangParser.LBRACKET);
		}

		public TerminalNode LBRACKET(int i) {
			return getToken(HallelujahLangParser.LBRACKET, i);
		}

		public List<ArgumentsContext> arguments() {
			return getRuleContexts(ArgumentsContext.class);
		}

		public ArgumentsContext arguments(int i) {
			return getRuleContext(ArgumentsContext.class, i);
		}

		public List<TerminalNode> RBRACKET() {
			return getTokens(HallelujahLangParser.RBRACKET);
		}

		public TerminalNode RBRACKET(int i) {
			return getToken(HallelujahLangParser.RBRACKET, i);
		}

		public Array_initializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_array_initializer;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HallelujahLangListener)
				((HallelujahLangListener) listener).enterArray_initializer(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HallelujahLangListener)
				((HallelujahLangListener) listener).exitArray_initializer(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof HallelujahLangVisitor)
				return ((HallelujahLangVisitor<? extends T>) visitor).visitArray_initializer(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final Array_initializerContext array_initializer() throws RecognitionException {
		Array_initializerContext _localctx = new Array_initializerContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_array_initializer);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
				setState(361);
				match(LBRACKET);
				setState(362);
				arguments();
				setState(369);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input, 29, _ctx);
				while (_alt != 1 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
					if (_alt == 1 + 1) {
						{
							{
								setState(363);
								match(LBRACKET);
								setState(364);
								arguments();
								setState(365);
								match(RBRACKET);
							}
						}
					}
					setState(371);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input, 29, _ctx);
				}
				setState(372);
				match(RBRACKET);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Array_accessContext extends ParserRuleContext {
		public TerminalNode ID() {
			return getToken(HallelujahLangParser.ID, 0);
		}

		public TerminalNode LBRACKET() {
			return getToken(HallelujahLangParser.LBRACKET, 0);
		}

		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class, 0);
		}

		public TerminalNode RBRACKET() {
			return getToken(HallelujahLangParser.RBRACKET, 0);
		}

		public Array_accessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_array_access;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HallelujahLangListener)
				((HallelujahLangListener) listener).enterArray_access(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HallelujahLangListener)
				((HallelujahLangListener) listener).exitArray_access(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof HallelujahLangVisitor)
				return ((HallelujahLangVisitor<? extends T>) visitor).visitArray_access(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final Array_accessContext array_access() throws RecognitionException {
		Array_accessContext _localctx = new Array_accessContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_array_access);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(374);
				match(ID);
				setState(375);
				match(LBRACKET);
				setState(376);
				expression(0);
				setState(377);
				match(RBRACKET);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Method_callContext extends ParserRuleContext {
		public TerminalNode METHOD() {
			return getToken(HallelujahLangParser.METHOD, 0);
		}

		public TerminalNode ID() {
			return getToken(HallelujahLangParser.ID, 0);
		}

		public TerminalNode LPAREN() {
			return getToken(HallelujahLangParser.LPAREN, 0);
		}

		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class, 0);
		}

		public TerminalNode RPAREN() {
			return getToken(HallelujahLangParser.RPAREN, 0);
		}

		public BlockContext block() {
			return getRuleContext(BlockContext.class, 0);
		}

		public Method_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_method_call;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HallelujahLangListener)
				((HallelujahLangListener) listener).enterMethod_call(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HallelujahLangListener)
				((HallelujahLangListener) listener).exitMethod_call(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof HallelujahLangVisitor)
				return ((HallelujahLangVisitor<? extends T>) visitor).visitMethod_call(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final Method_callContext method_call() throws RecognitionException {
		Method_callContext _localctx = new Method_callContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_method_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(379);
				match(METHOD);
				setState(380);
				match(ID);
				setState(381);
				match(LPAREN);
				setState(382);
				arguments();
				setState(383);
				match(RPAREN);
				setState(384);
				block();
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Data_typeContext extends ParserRuleContext {
		public TerminalNode INT() {
			return getToken(HallelujahLangParser.INT, 0);
		}

		public TerminalNode FLOAT() {
			return getToken(HallelujahLangParser.FLOAT, 0);
		}

		public TerminalNode BOOLEAN() {
			return getToken(HallelujahLangParser.BOOLEAN, 0);
		}

		public TerminalNode STRING() {
			return getToken(HallelujahLangParser.STRING, 0);
		}

		public TerminalNode VOID() {
			return getToken(HallelujahLangParser.VOID, 0);
		}

		public Data_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_data_type;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HallelujahLangListener)
				((HallelujahLangListener) listener).enterData_type(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HallelujahLangListener)
				((HallelujahLangListener) listener).exitData_type(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof HallelujahLangVisitor)
				return ((HallelujahLangVisitor<? extends T>) visitor).visitData_type(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final Data_typeContext data_type() throws RecognitionException {
		Data_typeContext _localctx = new Data_typeContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_data_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(386);
				_la = _input.LA(1);
				if (!((((_la) & ~0x3f) == 0 && ((1L << _la) & 31719424L) != 0))) {
					_errHandler.recoverInline(this);
				} else {
					if (_input.LA(1) == Token.EOF)
						matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Array_declarationContext extends ParserRuleContext {
		public Data_typeContext data_type() {
			return getRuleContext(Data_typeContext.class, 0);
		}

		public List<Array_initializerContext> array_initializer() {
			return getRuleContexts(Array_initializerContext.class);
		}

		public Array_initializerContext array_initializer(int i) {
			return getRuleContext(Array_initializerContext.class, i);
		}

		public List<TerminalNode> ID() {
			return getTokens(HallelujahLangParser.ID);
		}

		public TerminalNode ID(int i) {
			return getToken(HallelujahLangParser.ID, i);
		}

		public TerminalNode SEMICOLON() {
			return getToken(HallelujahLangParser.SEMICOLON, 0);
		}

		public TerminalNode ASSIGN() {
			return getToken(HallelujahLangParser.ASSIGN, 0);
		}

		public Array_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_array_declaration;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HallelujahLangListener)
				((HallelujahLangListener) listener).enterArray_declaration(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HallelujahLangListener)
				((HallelujahLangListener) listener).exitArray_declaration(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof HallelujahLangVisitor)
				return ((HallelujahLangVisitor<? extends T>) visitor).visitArray_declaration(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final Array_declarationContext array_declaration() throws RecognitionException {
		Array_declarationContext _localctx = new Array_declarationContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_array_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(388);
				data_type();
				setState(389);
				array_initializer();
				setState(391);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la == LBRACKET) {
					{
						setState(390);
						array_initializer();
					}
				}

				setState(393);
				match(ID);
				setState(402);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
					case SEMICOLON: {
						setState(394);
						match(SEMICOLON);
					}
						break;
					case ASSIGN: {
						setState(395);
						match(ASSIGN);
						setState(397);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la == ID) {
							{
								setState(396);
								match(ID);
							}
						}

						setState(399);
						array_initializer();
						setState(400);
						match(SEMICOLON);
					}
						break;
					default:
						throw new NoViableAltException(this);
				}
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Constructor_declarationContext extends ParserRuleContext {
		public TerminalNode CONSTRUCTOR() {
			return getToken(HallelujahLangParser.CONSTRUCTOR, 0);
		}

		public TerminalNode LPAREN() {
			return getToken(HallelujahLangParser.LPAREN, 0);
		}

		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class, 0);
		}

		public TerminalNode RPAREN() {
			return getToken(HallelujahLangParser.RPAREN, 0);
		}

		public TerminalNode LBRACE() {
			return getToken(HallelujahLangParser.LBRACE, 0);
		}

		public Constructor_bodyContext constructor_body() {
			return getRuleContext(Constructor_bodyContext.class, 0);
		}

		public TerminalNode RBRACE() {
			return getToken(HallelujahLangParser.RBRACE, 0);
		}

		public Constructor_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_constructor_declaration;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HallelujahLangListener)
				((HallelujahLangListener) listener).enterConstructor_declaration(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HallelujahLangListener)
				((HallelujahLangListener) listener).exitConstructor_declaration(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof HallelujahLangVisitor)
				return ((HallelujahLangVisitor<? extends T>) visitor).visitConstructor_declaration(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final Constructor_declarationContext constructor_declaration() throws RecognitionException {
		Constructor_declarationContext _localctx = new Constructor_declarationContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_constructor_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(404);
				match(CONSTRUCTOR);
				setState(405);
				match(LPAREN);
				setState(406);
				arguments();
				setState(407);
				match(RPAREN);
				setState(408);
				match(LBRACE);
				setState(409);
				constructor_body();
				setState(410);
				match(RBRACE);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Constructor_fields_declarationContext extends ParserRuleContext {
		public Data_typeContext data_type() {
			return getRuleContext(Data_typeContext.class, 0);
		}

		public TerminalNode THIS() {
			return getToken(HallelujahLangParser.THIS, 0);
		}

		public TerminalNode DOT() {
			return getToken(HallelujahLangParser.DOT, 0);
		}

		public TerminalNode ID() {
			return getToken(HallelujahLangParser.ID, 0);
		}

		public TerminalNode ASSIGN() {
			return getToken(HallelujahLangParser.ASSIGN, 0);
		}

		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class, 0);
		}

		public TerminalNode SEMICOLON() {
			return getToken(HallelujahLangParser.SEMICOLON, 0);
		}

		public Constructor_fields_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_constructor_fields_declaration;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HallelujahLangListener)
				((HallelujahLangListener) listener).enterConstructor_fields_declaration(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HallelujahLangListener)
				((HallelujahLangListener) listener).exitConstructor_fields_declaration(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof HallelujahLangVisitor)
				return ((HallelujahLangVisitor<? extends T>) visitor).visitConstructor_fields_declaration(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final Constructor_fields_declarationContext constructor_fields_declaration() throws RecognitionException {
		Constructor_fields_declarationContext _localctx = new Constructor_fields_declarationContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_constructor_fields_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(412);
				data_type();
				setState(413);
				match(THIS);
				setState(414);
				match(DOT);
				setState(415);
				match(ID);
				setState(416);
				match(ASSIGN);
				setState(417);
				expression(0);
				setState(418);
				match(SEMICOLON);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
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
			return getRuleContext(Constructor_fields_declarationContext.class, i);
		}

		public Constructor_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_constructor_body;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HallelujahLangListener)
				((HallelujahLangListener) listener).enterConstructor_body(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HallelujahLangListener)
				((HallelujahLangListener) listener).exitConstructor_body(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof HallelujahLangVisitor)
				return ((HallelujahLangVisitor<? extends T>) visitor).visitConstructor_body(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final Constructor_bodyContext constructor_body() throws RecognitionException {
		Constructor_bodyContext _localctx = new Constructor_bodyContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_constructor_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(423);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 31719424L) != 0)) {
					{
						{
							setState(420);
							constructor_fields_declaration();
						}
					}
					setState(425);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
			case 26:
				return expression_sempred((ExpressionContext) _localctx, predIndex);
		}
		return true;
	}

	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
			case 0:
				return precpred(_ctx, 13);
		}
		return true;
	}

	public static final String _serializedATN = "\u0004\u00018\u01ab\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"
			+
			"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002" +
			"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002" +
			"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002" +
			"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f" +
			"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012" +
			"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015" +
			"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018" +
			"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b" +
			"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e" +
			"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0001" +
			"\u0000\u0003\u0000H\b\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001" +
			"\u0000\u0001\u0000\u0005\u0000O\b\u0000\n\u0000\f\u0000R\t\u0000\u0001" +
			"\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001" +
			"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001" +
			"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003d\b\u0003\u0001" +
			"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003j\b\u0003\n\u0003" +
			"\f\u0003m\t\u0003\u0003\u0003o\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003" +
			"\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004" +
			"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004" +
			"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004\u0084\b\u0004" +
			"\n\u0004\f\u0004\u0087\t\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001" +
			"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001" +
			"\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001" +
			"\u0006\u0001\u0006\u0003\u0006\u009a\b\u0006\u0001\u0007\u0001\u0007\u0001" +
			"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001" +
			"\b\u0001\b\u0001\b\u0005\b\u00a7\b\b\n\b\f\b\u00aa\t\b\u0001\b\u0003\b" +
			"\u00ad\b\b\u0003\b\u00af\b\b\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0005" +
			"\n\u00b6\b\n\n\n\f\n\u00b9\t\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b" +
			"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b" +
			"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b" +
			"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b" +
			"\u0003\u000b\u00d1\b\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001" +
			"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u00df\b\f\u0001" +
			"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0005\r\u00e7\b\r\n\r\f\r\u00ea" +
			"\t\r\u0001\r\u0001\r\u0003\r\u00ee\b\r\u0001\u000e\u0001\u000e\u0001\u000e" +
			"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f" +
			"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010" +
			"\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011" +
			"\u0104\b\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011" +
			"\u0003\u0011\u010b\b\u0011\u0005\u0011\u010d\b\u0011\n\u0011\f\u0011\u0110" +
			"\t\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001" +
			"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001" +
			"\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001" +
			"\u0014\u0001\u0014\u0003\u0014\u0125\b\u0014\u0001\u0015\u0001\u0015\u0001" +
			"\u0015\u0001\u0015\u0003\u0015\u012b\b\u0015\u0001\u0015\u0001\u0015\u0003" +
			"\u0015\u012f\b\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001" +
			"\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001" +
			"\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001" +
			"\u0018\u0005\u0018\u0142\b\u0018\n\u0018\f\u0018\u0145\t\u0018\u0001\u0019" +
			"\u0001\u0019\u0001\u0019\u0005\u0019\u014a\b\u0019\n\u0019\f\u0019\u014d" +
			"\t\u0019\u0003\u0019\u014f\b\u0019\u0001\u001a\u0001\u001a\u0001\u001a" +
			"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a" +
			"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a" +
			"\u0003\u001a\u0160\b\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0005\u001a" +
			"\u0165\b\u001a\n\u001a\f\u001a\u0168\t\u001a\u0001\u001b\u0001\u001b\u0001" +
			"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0005\u001b\u0170\b\u001b\n" +
			"\u001b\f\u001b\u0173\t\u001b\u0001\u001b\u0001\u001b\u0001\u001c\u0001" +
			"\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001" +
			"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001e\u0001" +
			"\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0003\u001f\u0188\b\u001f\u0001" +
			"\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0003\u001f\u018e\b\u001f\u0001" +
			"\u001f\u0001\u001f\u0001\u001f\u0003\u001f\u0193\b\u001f\u0001 \u0001" +
			" \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001!\u0001!\u0001!\u0001" +
			"!\u0001!\u0001!\u0001!\u0001!\u0001\"\u0005\"\u01a6\b\"\n\"\f\"\u01a9" +
			"\t\"\u0001\"\u0002\u010e\u0171\u00014#\u0000\u0002\u0004\u0006\b\n\f\u000e" +
			"\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BD\u0000" +
			"\u0002\u0002\u0000\u001b%\'\'\u0002\u0000\u0012\u0012\u0015\u0018\u01d5" +
			"\u0000G\u0001\u0000\u0000\u0000\u0002U\u0001\u0000\u0000\u0000\u0004Y" +
			"\u0001\u0000\u0000\u0000\u0006_\u0001\u0000\u0000\u0000\b\u0085\u0001" +
			"\u0000\u0000\u0000\n\u0088\u0001\u0000\u0000\u0000\f\u0092\u0001\u0000" +
			"\u0000\u0000\u000e\u009b\u0001\u0000\u0000\u0000\u0010\u00ae\u0001\u0000" +
			"\u0000\u0000\u0012\u00b0\u0001\u0000\u0000\u0000\u0014\u00b3\u0001\u0000" +
			"\u0000\u0000\u0016\u00d0\u0001\u0000\u0000\u0000\u0018\u00de\u0001\u0000" +
			"\u0000\u0000\u001a\u00e0\u0001\u0000\u0000\u0000\u001c\u00ef\u0001\u0000" +
			"\u0000\u0000\u001e\u00f5\u0001\u0000\u0000\u0000 \u00fb\u0001\u0000\u0000" +
			"\u0000\"\u0103\u0001\u0000\u0000\u0000$\u0111\u0001\u0000\u0000\u0000" +
			"&\u0116\u0001\u0000\u0000\u0000(\u011d\u0001\u0000\u0000\u0000*\u012e" +
			"\u0001\u0000\u0000\u0000,\u0130\u0001\u0000\u0000\u0000.\u0136\u0001\u0000" +
			"\u0000\u00000\u0143\u0001\u0000\u0000\u00002\u014e\u0001\u0000\u0000\u0000" +
			"4\u015f\u0001\u0000\u0000\u00006\u0169\u0001\u0000\u0000\u00008\u0176" +
			"\u0001\u0000\u0000\u0000:\u017b\u0001\u0000\u0000\u0000<\u0182\u0001\u0000" +
			"\u0000\u0000>\u0184\u0001\u0000\u0000\u0000@\u0194\u0001\u0000\u0000\u0000" +
			"B\u019c\u0001\u0000\u0000\u0000D\u01a7\u0001\u0000\u0000\u0000FH\u0003" +
			"\u0002\u0001\u0000GF\u0001\u0000\u0000\u0000GH\u0001\u0000\u0000\u0000" +
			"HP\u0001\u0000\u0000\u0000IO\u0003\u0006\u0003\u0000JO\u0003.\u0017\u0000" +
			"KO\u0003\u0004\u0002\u0000LO\u00051\u0000\u0000MO\u00052\u0000\u0000N" +
			"I\u0001\u0000\u0000\u0000NJ\u0001\u0000\u0000\u0000NK\u0001\u0000\u0000" +
			"\u0000NL\u0001\u0000\u0000\u0000NM\u0001\u0000\u0000\u0000OR\u0001\u0000" +
			"\u0000\u0000PN\u0001\u0000\u0000\u0000PQ\u0001\u0000\u0000\u0000QS\u0001" +
			"\u0000\u0000\u0000RP\u0001\u0000\u0000\u0000ST\u0005\u0000\u0000\u0001" +
			"T\u0001\u0001\u0000\u0000\u0000UV\u0005\u0007\u0000\u0000VW\u00055\u0000" +
			"\u0000WX\u0005*\u0000\u0000X\u0003\u0001\u0000\u0000\u0000YZ\u0005\t\u0000" +
			"\u0000Z[\u00055\u0000\u0000[\\\u0005)\u0000\u0000\\]\u00055\u0000\u0000" +
			"]^\u0005*\u0000\u0000^\u0005\u0001\u0000\u0000\u0000_`\u0005\u0001\u0000" +
			"\u0000`c\u00055\u0000\u0000ab\u0005\u0002\u0000\u0000bd\u00055\u0000\u0000" +
			"ca\u0001\u0000\u0000\u0000cd\u0001\u0000\u0000\u0000dn\u0001\u0000\u0000" +
			"\u0000ef\u0005\u0003\u0000\u0000fk\u00055\u0000\u0000gh\u0005(\u0000\u0000" +
			"hj\u00055\u0000\u0000ig\u0001\u0000\u0000\u0000jm\u0001\u0000\u0000\u0000" +
			"ki\u0001\u0000\u0000\u0000kl\u0001\u0000\u0000\u0000lo\u0001\u0000\u0000" +
			"\u0000mk\u0001\u0000\u0000\u0000ne\u0001\u0000\u0000\u0000no\u0001\u0000" +
			"\u0000\u0000op\u0001\u0000\u0000\u0000pq\u0005+\u0000\u0000qr\u0003\b" +
			"\u0004\u0000rs\u0005,\u0000\u0000s\u0007\u0001\u0000\u0000\u0000t\u0084" +
			"\u0003\f\u0006\u0000u\u0084\u0003>\u001f\u0000v\u0084\u0003*\u0015\u0000" +
			"w\u0084\u0003,\u0016\u0000x\u0084\u0003\u001a\r\u0000y\u0084\u0003\u001e" +
			"\u000f\u0000z\u0084\u0003\u000e\u0007\u0000{\u0084\u0003\n\u0005\u0000" +
			"|}\u0003&\u0013\u0000}~\u0005*\u0000\u0000~\u0084\u0001\u0000\u0000\u0000" +
			"\u007f\u0084\u0003(\u0014\u0000\u0080\u0084\u0003@ \u0000\u0081\u0084" +
			"\u00051\u0000\u0000\u0082\u0084\u00052\u0000\u0000\u0083t\u0001\u0000" +
			"\u0000\u0000\u0083u\u0001\u0000\u0000\u0000\u0083v\u0001\u0000\u0000\u0000" +
			"\u0083w\u0001\u0000\u0000\u0000\u0083x\u0001\u0000\u0000\u0000\u0083y" +
			"\u0001\u0000\u0000\u0000\u0083z\u0001\u0000\u0000\u0000\u0083{\u0001\u0000" +
			"\u0000\u0000\u0083|\u0001\u0000\u0000\u0000\u0083\u007f\u0001\u0000\u0000" +
			"\u0000\u0083\u0080\u0001\u0000\u0000\u0000\u0083\u0081\u0001\u0000\u0000" +
			"\u0000\u0083\u0082\u0001\u0000\u0000\u0000\u0084\u0087\u0001\u0000\u0000" +
			"\u0000\u0085\u0083\u0001\u0000\u0000\u0000\u0085\u0086\u0001\u0000\u0000" +
			"\u0000\u0086\t\u0001\u0000\u0000\u0000\u0087\u0085\u0001\u0000\u0000\u0000" +
			"\u0088\u0089\u0003<\u001e\u0000\u0089\u008a\u00055\u0000\u0000\u008a\u008b" +
			"\u0005\u001a\u0000\u0000\u008b\u008c\u0005\u0006\u0000\u0000\u008c\u008d" +
			"\u00055\u0000\u0000\u008d\u008e\u0005-\u0000\u0000\u008e\u008f\u00032" +
			"\u0019\u0000\u008f\u0090\u0005.\u0000\u0000\u0090\u0091\u0005*\u0000\u0000" +
			"\u0091\u000b\u0001\u0000\u0000\u0000\u0092\u0093\u0003<\u001e\u0000\u0093" +
			"\u0099\u00055\u0000\u0000\u0094\u009a\u0005*\u0000\u0000\u0095\u0096\u0005" +
			"\u001a\u0000\u0000\u0096\u0097\u00034\u001a\u0000\u0097\u0098\u0005*\u0000" +
			"\u0000\u0098\u009a\u0001\u0000\u0000\u0000\u0099\u0094\u0001\u0000\u0000" +
			"\u0000\u0099\u0095\u0001\u0000\u0000\u0000\u009a\r\u0001\u0000\u0000\u0000" +
			"\u009b\u009c\u0003<\u001e\u0000\u009c\u009d\u0005\u0005\u0000\u0000\u009d" +
			"\u009e\u00055\u0000\u0000\u009e\u009f\u0005-\u0000\u0000\u009f\u00a0\u0003" +
			"\u0010\b\u0000\u00a0\u00a1\u0005.\u0000\u0000\u00a1\u00a2\u0003\u0014" +
			"\n\u0000\u00a2\u000f\u0001\u0000\u0000\u0000\u00a3\u00a8\u0003\u0012\t" +
			"\u0000\u00a4\u00a5\u0005(\u0000\u0000\u00a5\u00a7\u0003\u0012\t\u0000" +
			"\u00a6\u00a4\u0001\u0000\u0000\u0000\u00a7\u00aa\u0001\u0000\u0000\u0000" +
			"\u00a8\u00a6\u0001\u0000\u0000\u0000\u00a8\u00a9\u0001\u0000\u0000\u0000" +
			"\u00a9\u00af\u0001\u0000\u0000\u0000\u00aa\u00a8\u0001\u0000\u0000\u0000" +
			"\u00ab\u00ad\u00058\u0000\u0000\u00ac\u00ab\u0001\u0000\u0000\u0000\u00ac" +
			"\u00ad\u0001\u0000\u0000\u0000\u00ad\u00af\u0001\u0000\u0000\u0000\u00ae" +
			"\u00a3\u0001\u0000\u0000\u0000\u00ae\u00ac\u0001\u0000\u0000\u0000\u00af" +
			"\u0011\u0001\u0000\u0000\u0000\u00b0\u00b1\u0003<\u001e\u0000\u00b1\u00b2" +
			"\u00055\u0000\u0000\u00b2\u0013\u0001\u0000\u0000\u0000\u00b3\u00b7\u0005" +
			"+\u0000\u0000\u00b4\u00b6\u0003\u0016\u000b\u0000\u00b5\u00b4\u0001\u0000" +
			"\u0000\u0000\u00b6\u00b9\u0001\u0000\u0000\u0000\u00b7\u00b5\u0001\u0000" +
			"\u0000\u0000\u00b7\u00b8\u0001\u0000\u0000\u0000\u00b8\u00ba\u0001\u0000" +
			"\u0000\u0000\u00b9\u00b7\u0001\u0000\u0000\u0000\u00ba\u00bb\u0005,\u0000" +
			"\u0000\u00bb\u0015\u0001\u0000\u0000\u0000\u00bc\u00d1\u0003\u0018\f\u0000" +
			"\u00bd\u00d1\u0003\u001a\r\u0000\u00be\u00d1\u0003\u001e\u000f\u0000\u00bf" +
			"\u00d1\u0003 \u0010\u0000\u00c0\u00d1\u0003:\u001d\u0000\u00c1\u00d1\u0003" +
			"$\u0012\u0000\u00c2\u00c3\u0003&\u0013\u0000\u00c3\u00c4\u0005*\u0000" +
			"\u0000\u00c4\u00d1\u0001\u0000\u0000\u0000\u00c5\u00d1\u0003*\u0015\u0000" +
			"\u00c6\u00d1\u0003,\u0016\u0000\u00c7\u00d1\u00038\u001c\u0000\u00c8\u00d1" +
			"\u0003>\u001f\u0000\u00c9\u00d1\u0003\n\u0005\u0000\u00ca\u00d1\u0003" +
			"(\u0014\u0000\u00cb\u00d1\u00051\u0000\u0000\u00cc\u00d1\u00052\u0000" +
			"\u0000\u00cd\u00ce\u00034\u001a\u0000\u00ce\u00cf\u0005*\u0000\u0000\u00cf" +
			"\u00d1\u0001\u0000\u0000\u0000\u00d0\u00bc\u0001\u0000\u0000\u0000\u00d0" +
			"\u00bd\u0001\u0000\u0000\u0000\u00d0\u00be\u0001\u0000\u0000\u0000\u00d0" +
			"\u00bf\u0001\u0000\u0000\u0000\u00d0\u00c0\u0001\u0000\u0000\u0000\u00d0" +
			"\u00c1\u0001\u0000\u0000\u0000\u00d0\u00c2\u0001\u0000\u0000\u0000\u00d0" +
			"\u00c5\u0001\u0000\u0000\u0000\u00d0\u00c6\u0001\u0000\u0000\u0000\u00d0" +
			"\u00c7\u0001\u0000\u0000\u0000\u00d0\u00c8\u0001\u0000\u0000\u0000\u00d0" +
			"\u00c9\u0001\u0000\u0000\u0000\u00d0\u00ca\u0001\u0000\u0000\u0000\u00d0" +
			"\u00cb\u0001\u0000\u0000\u0000\u00d0\u00cc\u0001\u0000\u0000\u0000\u00d0" +
			"\u00cd\u0001\u0000\u0000\u0000\u00d1\u0017\u0001\u0000\u0000\u0000\u00d2" +
			"\u00d3\u00055\u0000\u0000\u00d3\u00d4\u0005\u001a\u0000\u0000\u00d4\u00d5" +
			"\u00034\u001a\u0000\u00d5\u00d6\u0005*\u0000\u0000\u00d6\u00df\u0001\u0000" +
			"\u0000\u0000\u00d7\u00d8\u0003<\u001e\u0000\u00d8\u00d9\u00055\u0000\u0000" +
			"\u00d9\u00da\u0005\u001a\u0000\u0000\u00da\u00db\u00034\u001a\u0000\u00db" +
			"\u00dc\u0005*\u0000\u0000\u00dc\u00df\u0001\u0000\u0000\u0000\u00dd\u00df" +
			"\u00036\u001b\u0000\u00de\u00d2\u0001\u0000\u0000\u0000\u00de\u00d7\u0001" +
			"\u0000\u0000\u0000\u00de\u00dd\u0001\u0000\u0000\u0000\u00df\u0019\u0001" +
			"\u0000\u0000\u0000\u00e0\u00e1\u0005\u000f\u0000\u0000\u00e1\u00e2\u0005" +
			"-\u0000\u0000\u00e2\u00e3\u00034\u001a\u0000\u00e3\u00e4\u0005.\u0000" +
			"\u0000\u00e4\u00e8\u0003\u0014\n\u0000\u00e5\u00e7\u0003\u001c\u000e\u0000" +
			"\u00e6\u00e5\u0001\u0000\u0000\u0000\u00e7\u00ea\u0001\u0000\u0000\u0000" +
			"\u00e8\u00e6\u0001\u0000\u0000\u0000\u00e8\u00e9\u0001\u0000\u0000\u0000" +
			"\u00e9\u00ed\u0001\u0000\u0000\u0000\u00ea\u00e8\u0001\u0000\u0000\u0000" +
			"\u00eb\u00ec\u0005\u0010\u0000\u0000\u00ec\u00ee\u0003\u0014\n\u0000\u00ed" +
			"\u00eb\u0001\u0000\u0000\u0000\u00ed\u00ee\u0001\u0000\u0000\u0000\u00ee" +
			"\u001b\u0001\u0000\u0000\u0000\u00ef\u00f0\u0005\u0011\u0000\u0000\u00f0" +
			"\u00f1\u0005-\u0000\u0000\u00f1\u00f2\u00034\u001a\u0000\u00f2\u00f3\u0005" +
			".\u0000\u0000\u00f3\u00f4\u0003\u0014\n\u0000\u00f4\u001d\u0001\u0000" +
			"\u0000\u0000\u00f5\u00f6\u0005\u000e\u0000\u0000\u00f6\u00f7\u0005-\u0000" +
			"\u0000\u00f7\u00f8\u00034\u001a\u0000\u00f8\u00f9\u0005.\u0000\u0000\u00f9" +
			"\u00fa\u0003\u0014\n\u0000\u00fa\u001f\u0001\u0000\u0000\u0000\u00fb\u00fc" +
			"\u0005\r\u0000\u0000\u00fc\u00fd\u0003\"\u0011\u0000\u00fd\u00fe\u0005" +
			"*\u0000\u0000\u00fe!\u0001\u0000\u0000\u0000\u00ff\u0104\u00057\u0000" +
			"\u0000\u0100\u0104\u00055\u0000\u0000\u0101\u0104\u00034\u001a\u0000\u0102" +
			"\u0104\u0003(\u0014\u0000\u0103\u00ff\u0001\u0000\u0000\u0000\u0103\u0100" +
			"\u0001\u0000\u0000\u0000\u0103\u0101\u0001\u0000\u0000\u0000\u0103\u0102" +
			"\u0001\u0000\u0000\u0000\u0104\u010e\u0001\u0000\u0000\u0000\u0105\u010a" +
			"\u0005\u001e\u0000\u0000\u0106\u010b\u00057\u0000\u0000\u0107\u010b\u0005" +
			"5\u0000\u0000\u0108\u010b\u00034\u001a\u0000\u0109\u010b\u0003(\u0014" +
			"\u0000\u010a\u0106\u0001\u0000\u0000\u0000\u010a\u0107\u0001\u0000\u0000" +
			"\u0000\u010a\u0108\u0001\u0000\u0000\u0000\u010a\u0109\u0001\u0000\u0000" +
			"\u0000\u010b\u010d\u0001\u0000\u0000\u0000\u010c\u0105\u0001\u0000\u0000" +
			"\u0000\u010d\u0110\u0001\u0000\u0000\u0000\u010e\u010f\u0001\u0000\u0000" +
			"\u0000\u010e\u010c\u0001\u0000\u0000\u0000\u010f#\u0001\u0000\u0000\u0000" +
			"\u0110\u010e\u0001\u0000\u0000\u0000\u0111\u0112\u00055\u0000\u0000\u0112" +
			"\u0113\u0005-\u0000\u0000\u0113\u0114\u00032\u0019\u0000\u0114\u0115\u0005" +
			".\u0000\u0000\u0115%\u0001\u0000\u0000\u0000\u0116\u0117\u00055\u0000" +
			"\u0000\u0117\u0118\u0005)\u0000\u0000\u0118\u0119\u00055\u0000\u0000\u0119" +
			"\u011a\u0005-\u0000\u0000\u011a\u011b\u00032\u0019\u0000\u011b\u011c\u0005" +
			".\u0000\u0000\u011c\'\u0001\u0000\u0000\u0000\u011d\u011e\u0005\n\u0000" +
			"\u0000\u011e\u011f\u0005)\u0000\u0000\u011f\u0124\u00055\u0000\u0000\u0120" +
			"\u0121\u0005-\u0000\u0000\u0121\u0122\u00032\u0019\u0000\u0122\u0123\u0005" +
			".\u0000\u0000\u0123\u0125\u0001\u0000\u0000\u0000\u0124\u0120\u0001\u0000" +
			"\u0000\u0000\u0124\u0125\u0001\u0000\u0000\u0000\u0125)\u0001\u0000\u0000" +
			"\u0000\u0126\u0127\u0005\f\u0000\u0000\u0127\u0128\u0005-\u0000\u0000" +
			"\u0128\u012f\u0003\"\u0011\u0000\u0129\u012b\u0003&\u0013\u0000\u012a" +
			"\u0129\u0001\u0000\u0000\u0000\u012a\u012b\u0001\u0000\u0000\u0000\u012b" +
			"\u012c\u0001\u0000\u0000\u0000\u012c\u012d\u0005.\u0000\u0000\u012d\u012f" +
			"\u0005*\u0000\u0000\u012e\u0126\u0001\u0000\u0000\u0000\u012e\u012a\u0001" +
			"\u0000\u0000\u0000\u012f+\u0001\u0000\u0000\u0000\u0130\u0131\u0005\u000b" +
			"\u0000\u0000\u0131\u0132\u0005-\u0000\u0000\u0132\u0133\u00055\u0000\u0000" +
			"\u0133\u0134\u0005.\u0000\u0000\u0134\u0135\u0005*\u0000\u0000\u0135-" +
			"\u0001\u0000\u0000\u0000\u0136\u0137\u0005\u0004\u0000\u0000\u0137\u0138" +
			"\u00055\u0000\u0000\u0138\u0139\u0005+\u0000\u0000\u0139\u013a\u00030" +
			"\u0018\u0000\u013a\u013b\u0005,\u0000\u0000\u013b/\u0001\u0000\u0000\u0000" +
			"\u013c\u0142\u0003\u000e\u0007\u0000\u013d\u0142\u0003$\u0012\u0000\u013e" +
			"\u013f\u0003<\u001e\u0000\u013f\u0140\u0003$\u0012\u0000\u0140\u0142\u0001" +
			"\u0000\u0000\u0000\u0141\u013c\u0001\u0000\u0000\u0000\u0141\u013d\u0001" +
			"\u0000\u0000\u0000\u0141\u013e\u0001\u0000\u0000\u0000\u0142\u0145\u0001" +
			"\u0000\u0000\u0000\u0143\u0141\u0001\u0000\u0000\u0000\u0143\u0144\u0001" +
			"\u0000\u0000\u0000\u01441\u0001\u0000\u0000\u0000\u0145\u0143\u0001\u0000" +
			"\u0000\u0000\u0146\u014b\u00034\u001a\u0000\u0147\u0148\u0005(\u0000\u0000" +
			"\u0148\u014a\u00034\u001a\u0000\u0149\u0147\u0001\u0000\u0000\u0000\u014a" +
			"\u014d\u0001\u0000\u0000\u0000\u014b\u0149\u0001\u0000\u0000\u0000\u014b" +
			"\u014c\u0001\u0000\u0000\u0000\u014c\u014f\u0001\u0000\u0000\u0000\u014d" +
			"\u014b\u0001\u0000\u0000\u0000\u014e\u0146\u0001\u0000\u0000\u0000\u014e" +
			"\u014f\u0001\u0000\u0000\u0000\u014f3\u0001\u0000\u0000\u0000\u0150\u0151" +
			"\u0006\u001a\uffff\uffff\u0000\u0151\u0152\u0005&\u0000\u0000\u0152\u0160" +
			"\u00034\u001a\f\u0153\u0160\u00055\u0000\u0000\u0154\u0160\u00056\u0000" +
			"\u0000\u0155\u0160\u00054\u0000\u0000\u0156\u0160\u00057\u0000\u0000\u0157" +
			"\u0160\u00053\u0000\u0000\u0158\u0160\u0005\u0019\u0000\u0000\u0159\u0160" +
			"\u0003&\u0013\u0000\u015a\u0160\u00036\u001b\u0000\u015b\u015c\u00055" +
			"\u0000\u0000\u015c\u0160\u00036\u001b\u0000\u015d\u0160\u0003$\u0012\u0000" +
			"\u015e\u0160\u0003(\u0014\u0000\u015f\u0150\u0001\u0000\u0000\u0000\u015f" +
			"\u0153\u0001\u0000\u0000\u0000\u015f\u0154\u0001\u0000\u0000\u0000\u015f" +
			"\u0155\u0001\u0000\u0000\u0000\u015f\u0156\u0001\u0000\u0000\u0000\u015f" +
			"\u0157\u0001\u0000\u0000\u0000\u015f\u0158\u0001\u0000\u0000\u0000\u015f" +
			"\u0159\u0001\u0000\u0000\u0000\u015f\u015a\u0001\u0000\u0000\u0000\u015f" +
			"\u015b\u0001\u0000\u0000\u0000\u015f\u015d\u0001\u0000\u0000\u0000\u015f" +
			"\u015e\u0001\u0000\u0000\u0000\u0160\u0166\u0001\u0000\u0000\u0000\u0161" +
			"\u0162\n\r\u0000\u0000\u0162\u0163\u0007\u0000\u0000\u0000\u0163\u0165" +
			"\u00034\u001a\u000e\u0164\u0161\u0001\u0000\u0000\u0000\u0165\u0168\u0001" +
			"\u0000\u0000\u0000\u0166\u0164\u0001\u0000\u0000\u0000\u0166\u0167\u0001" +
			"\u0000\u0000\u0000\u01675\u0001\u0000\u0000\u0000\u0168\u0166\u0001\u0000" +
			"\u0000\u0000\u0169\u016a\u0005/\u0000\u0000\u016a\u0171\u00032\u0019\u0000" +
			"\u016b\u016c\u0005/\u0000\u0000\u016c\u016d\u00032\u0019\u0000\u016d\u016e" +
			"\u00050\u0000\u0000\u016e\u0170\u0001\u0000\u0000\u0000\u016f\u016b\u0001" +
			"\u0000\u0000\u0000\u0170\u0173\u0001\u0000\u0000\u0000\u0171\u0172\u0001" +
			"\u0000\u0000\u0000\u0171\u016f\u0001\u0000\u0000\u0000\u0172\u0174\u0001" +
			"\u0000\u0000\u0000\u0173\u0171\u0001\u0000\u0000\u0000\u0174\u0175\u0005" +
			"0\u0000\u0000\u01757\u0001\u0000\u0000\u0000\u0176\u0177\u00055\u0000" +
			"\u0000\u0177\u0178\u0005/\u0000\u0000\u0178\u0179\u00034\u001a\u0000\u0179" +
			"\u017a\u00050\u0000\u0000\u017a9\u0001\u0000\u0000\u0000\u017b\u017c\u0005" +
			"\u0005\u0000\u0000\u017c\u017d\u00055\u0000\u0000\u017d\u017e\u0005-\u0000" +
			"\u0000\u017e\u017f\u00032\u0019\u0000\u017f\u0180\u0005.\u0000\u0000\u0180" +
			"\u0181\u0003\u0014\n\u0000\u0181;\u0001\u0000\u0000\u0000\u0182\u0183" +
			"\u0007\u0001\u0000\u0000\u0183=\u0001\u0000\u0000\u0000\u0184\u0185\u0003" +
			"<\u001e\u0000\u0185\u0187\u00036\u001b\u0000\u0186\u0188\u00036\u001b" +
			"\u0000\u0187\u0186\u0001\u0000\u0000\u0000\u0187\u0188\u0001\u0000\u0000" +
			"\u0000\u0188\u0189\u0001\u0000\u0000\u0000\u0189\u0192\u00055\u0000\u0000" +
			"\u018a\u0193\u0005*\u0000\u0000\u018b\u018d\u0005\u001a\u0000\u0000\u018c" +
			"\u018e\u00055\u0000\u0000\u018d\u018c\u0001\u0000\u0000\u0000\u018d\u018e" +
			"\u0001\u0000\u0000\u0000\u018e\u018f\u0001\u0000\u0000\u0000\u018f\u0190" +
			"\u00036\u001b\u0000\u0190\u0191\u0005*\u0000\u0000\u0191\u0193\u0001\u0000" +
			"\u0000\u0000\u0192\u018a\u0001\u0000\u0000\u0000\u0192\u018b\u0001\u0000" +
			"\u0000\u0000\u0193?\u0001\u0000\u0000\u0000\u0194\u0195\u0005\b\u0000" +
			"\u0000\u0195\u0196\u0005-\u0000\u0000\u0196\u0197\u00032\u0019\u0000\u0197" +
			"\u0198\u0005.\u0000\u0000\u0198\u0199\u0005+\u0000\u0000\u0199\u019a\u0003" +
			"D\"\u0000\u019a\u019b\u0005,\u0000\u0000\u019bA\u0001\u0000\u0000\u0000" +
			"\u019c\u019d\u0003<\u001e\u0000\u019d\u019e\u0005\n\u0000\u0000\u019e" +
			"\u019f\u0005)\u0000\u0000\u019f\u01a0\u00055\u0000\u0000\u01a0\u01a1\u0005" +
			"\u001a\u0000\u0000\u01a1\u01a2\u00034\u001a\u0000\u01a2\u01a3\u0005*\u0000" +
			"\u0000\u01a3C\u0001\u0000\u0000\u0000\u01a4\u01a6\u0003B!\u0000\u01a5" +
			"\u01a4\u0001\u0000\u0000\u0000\u01a6\u01a9\u0001\u0000\u0000\u0000\u01a7" +
			"\u01a5\u0001\u0000\u0000\u0000\u01a7\u01a8\u0001\u0000\u0000\u0000\u01a8" +
			"E\u0001\u0000\u0000\u0000\u01a9\u01a7\u0001\u0000\u0000\u0000\"GNPckn" +
			"\u0083\u0085\u0099\u00a8\u00ac\u00ae\u00b7\u00d0\u00de\u00e8\u00ed\u0103" +
			"\u010a\u010e\u0124\u012a\u012e\u0141\u0143\u014b\u014e\u015f\u0166\u0171" +
			"\u0187\u018d\u0192\u01a7";
	public static final ATN _ATN = new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}