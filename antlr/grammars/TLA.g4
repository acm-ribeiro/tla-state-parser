grammar TLA;

/*
.dot file pre-processing:
    1. remove \n
    2. remove \" 
*/

state 
    : stateElement+
    ;

stateElement
    : AND fState
    | AND entity (AND entity)*
    ;

fState
    : 'f' EQ BOOLEAN
    ;

entity 
    : STRING EQ LPAR map RPAR
    | STRING EQ EMPTY_MAP
    | STRING EQ set
    ;

map
    : mapElement (REC_SEP mapElement)*
    ;

mapElement
    : STRING ':>' (record | STRING)
    ;

record 
    : LSTR recordElement (COMMA recordElement)* RSTR
    ;

recordElement
    : STRING ATTR fieldValue
    ;

fieldValue
    : STRING
    | NAT
    | BOOLEAN
    | set
    ;

set
    : LCURL setElement* RCURL
    ;

setElement
    : STRING (COMMA STRING)*
    | NAT (COMMA NAT)*
    | record (COMMA record)*
    ;

objectRecord
    : record (COMMA record)*
    | STRING (COMMA STRING)* 
    | /* epsilon */
    ;

// Lexer rules

BOOLEAN 
    : 'TRUE'
    | 'FALSE'
    ;

REC_SEP
    : '@@'
    ;

EMPTY_MAP
    : '<<>>'
    ;

AND
    : '/\\\\'
    ;

NAT 
	: '-'?[0-9]+
	;

STRING
	: [0-9_@\-]*[A-Za-z_@]+[A-Za-z0-9_@\-]*
	;

LSTR
    : '['
    ;

RSTR
    : ']'
    ;

LCURL
	: '{'
	;

RCURL
	: '}'
	;

LPAR
	: '('
	;

RPAR
	: ')'
	;

EQ 
    : '='
    ;

ATTR 
    : '|->'
    ;

COMMA
    : ','
    ;

NEWLINE
	: ('\r'? '\n' | '\r')+
	;

WS
	: ' ' -> skip
	;
