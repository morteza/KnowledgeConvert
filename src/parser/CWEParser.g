/** CAPEC/XML Taxonomy (version 1.3.2) Parser by Morteza Ansarinia February 28, 2012 */
lexer grammar CWEParser;

options {
  language = Java;
}

@header {
    package parser;
    
    import ontology.*;
}

@members {
private Graph graph = new Graph();

public static void main(String[] args) {
	try {
		CharStream input = new ANTLRFileStream("res/attack_taxonomy_v1.3.2.xml");
		CWEParser parser = new CWEParser(input);
		while (parser.nextToken() != Token.EOF_TOKEN)
			;
	} catch (Exception e) {
		e.printStackTrace();
	}
}
}

DOCUMENT
	:
	XMLDECL? DOCTYPE? TAXONOMY EOF
	;

fragment
DOCTYPE
  :
  '<!DOCTYPE' WS GENERIC_ID WS
  (
    (
      'SYSTEM' WS VALUE
      | 'PUBLIC' WS VALUE WS VALUE
    )
    (WS)?
  )?
  (INTERNAL_DTD)? '>'
  ;

fragment
INTERNAL_DTD
  :
  '[' (options {greedy=false;}: .)* ']'
  ;

fragment
XMLDECL
  :
  '<?'
  (
    'x'
    | 'X'
  )
  (
    'm'
    | 'M'
  )
  (
    'l'
    | 'L'
  )
  WS? (ATTRIBUTE WS?)* '?>'
  ;

fragment
TAXONOMY
  :
  TAXONOMY_START_TAG (tt=TAXONOMY_NODE 
                                       {
                                        System.out.println($tt);
                                       })* '</Attack_Taxonomy>'
  ;

fragment
TAXONOMY_START_TAG
  :
  '<Attack_Taxonomy' (~'>')* '>'
  ;

fragment
TAXONOMY_NODE returns [GraphNode node]
  :
  
   {
    $node = new GraphNode();
   }
  WS? '<Taxonomy_Node' WS? (NODE_ATTRIBUTE WS?)* '>'
  (
    (data=NODE_DATA 
                    {
                     $node.data = "test";
                    })*
    | COMMENT
  )
  WS? '</Taxonomy_Node>' WS?
  ;

fragment
ATTRIBUTE
  :
  name=GENERIC_ID WS? '=' WS? value=VALUE 
                                          {
                                           
                                          }
  ;

fragment
NODE_ATTRIBUTE
  :
  CAPEC_ID
  | NODE_ID
  | NODE_PATTERN_ABSTRACTION
  | NODE_TYPE
  | NODE_NAME
  ;

fragment
CAPEC_ID
  :
  'CAPEC_ID' WS? '=' WS? value=VALUE
  ;

fragment
NODE_ID
  :
  'Node_ID' WS? '=' WS? value=VALUE
  ;

fragment
NODE_PATTERN_ABSTRACTION
  :
  'Pattern_Abstraction' WS? '=' WS?
  (
    '"Meta"'
    | '"Standard"'
    | '"Detailed"'
  )
  ;

fragment
NODE_TYPE
  :
  'Type' WS? '=' WS?
  (
    '"Attack_Category"'
    | '"Attack_Pattern"'
    | '"Metadata_Field"'
    | '"Node_Alias"'
  )
  ;

fragment
NODE_NAME
  :
  'Name' WS? '=' WS? value=VALUE
  ;

fragment
COMMENT
  :
  '<!--' (options {greedy=false;}: .)* '-->'
  ;

fragment
NODE_DATA
  :
  WS? '<Node_Relationship>' (WS? RELATIONSHIP_TYPE_TAG WS? RELATED_NODE_TAG WS?) '</Node_Relationship>' WS?
  ;

fragment
RELATIONSHIP_TYPE_TAG
  :
  '<Relationship_Type>' WS?
  (
    'Peer'
    | 'ResultantFrom'
    | 'ResultsIn'
    | 'CanAlsoBe'
    | 'ChildOf'
    | 'ParentOf'
  )
  WS? '</Relationship_Type>'
  ;

fragment
RELATED_NODE_TAG
  :
  '<Related_Node>' WS? NUMBER WS? '</Related_Node>'
  ;

fragment
NUMBER
  :
  (
    '-'
    | '+'
  )?
  ('0'..'9')+
  ;

fragment
VALUE
  :
  (
    '\"' (~'\"')* '\"'
    | '\'' (~'\'')* '\''
  )
  ;

fragment
GENERIC_ID
  :
  (
    'a'..'z'
    | 'A'..'Z'
    | '_'
    | ':'
  )
  ( options {greedy=true;}: 'a'..'z'
    | 'A'..'Z'
    | '0'..'9'
    | '.'
    | '-'
    | '_'
    | ':'
  )*
  ;

WS
  :
  (
    '\f'
    | '\t'
    | ' '
    | ('\r'? '\n')
  )+
  
   {
    skip();
   }
  ;
