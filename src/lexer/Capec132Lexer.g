lexer grammar Capec132Lexer;

options {
  language = Java;
}

@header{
package lexer;

import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
}

@members {
boolean isTagContext = false;
	 
public static void main(String[] args) {
    try {
    	CharStream input = new ANTLRFileStream(args[0]);
    	Capec132Lexer lexer = new Capec132Lexer(input);
    	Token token;
    	while ((token = lexer.nextToken())!=Token.EOF_TOKEN) {
    		System.out.println("Token: "+token.getText());
    	}
    } catch(Exception e) {
    	e.printStackTrace();
    }
}
}

DOCUMENT		:	;

TAG_START_OPEN	: '<' { isTagContext = true; } ;
TAG_END_OPEN	: '</' { isTagContext = true; } ;
TAG_CLOSE		: { isTagContext }?=> '>' { isTagContext = false; } ;
TAG_EMPTY_CLOSE	: { isTagContext }?=> '/>' { isTagContext = false; } ;
 
ATTRIBUTE_EQ : { isTagContext }?=> '=' ;
ATTRIBUTE_VALUE : { isTagContext }?=> ( '"' (~'"')* '"' | '\'' (~'\'')* '\'' ) ;

PCDATA		: {isTagContext}?=>	(~'<')+ ;

GENERIC_ID	: {isTagContext}?=>	( LETTER | '_' | ':') (NAMECHAR)* ;

fragment NAMECHAR
			: LETTER | DIGIT | '.' | '-' | '_' | ':' ;
 
fragment DIGIT
			:	'0'..'9' ;
 
fragment LETTER
			:	'a'..'z' | 'A'..'Z' ;
 
WS			: {isTagContext}?=>	(' '|'\r'|'\t'|'\u000C'|'\n')+ {skip();} ;
