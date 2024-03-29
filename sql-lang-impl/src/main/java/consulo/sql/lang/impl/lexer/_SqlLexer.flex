package consulo.sql.lang.impl.lexer;

import consulo.language.lexer.LexerBase;
import consulo.language.ast.IElementType;
import consulo.language.ast.TokenType;
import consulo.sql.lang.impl.psi.SqlTokenType;

@SuppressWarnings({"ALL"})
%%

%unicode
%public
%class _SqlLexer
%extends LexerBase
%function advanceImpl
%type IElementType
%eof{  return;
%eof}

WHITE_SPACE_CHAR=[\ \r\t\f\n]

C_STYLE_COMMENT="/*""*"*("/"|([^"/""*"]{COMMENT_TAIL}))?

COMMENT_TAIL=([^"*"]*("*"+[^"*""/"])?)*("*"+"/")?

END_OF_LINE_COMMENT="-""-"[^\r\n]*

IDENTIFIER=[:jletter:] [:jletterdigit:]*

ESCAPE_SEQUENCE=(\'\')

SINGLE_QUOTED_LITERAL="'"([^\\\']|{ESCAPE_SEQUENCE})*("'"|\\)?

DIGIT=[0-9]

NUMBER={DIGIT}*

%%

<YYINITIAL> {C_STYLE_COMMENT} { return SqlTokenType.C_STYLE_COMMENT; }

<YYINITIAL> {END_OF_LINE_COMMENT} { return SqlTokenType.END_OF_LINE_COMMENT; }

<YYINITIAL> {WHITE_SPACE_CHAR}+ { return TokenType.WHITE_SPACE; }

<YYINITIAL> {IDENTIFIER} { return SqlTokenType.IDENTIFIER; }

<YYINITIAL> {SINGLE_QUOTED_LITERAL} { return SqlTokenType.SINGLE_QUOTED_LITERAL; }

<YYINITIAL> {NUMBER} { return SqlTokenType.NUMBER; }

<YYINITIAL> "(" { return SqlTokenType.LPAR; }

<YYINITIAL> ")" { return SqlTokenType.RPAR; }

<YYINITIAL> "," { return SqlTokenType.COMMA; }

<YYINITIAL>  . { return TokenType.BAD_CHARACTER; }