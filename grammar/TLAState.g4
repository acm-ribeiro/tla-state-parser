grammar TLAState;

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
    | AND pcState 
    | AND reqState 
    | AND resState 
    | AND entity (AND entity)*
    | AND tagState
    | AND schemaMapping
    ;

schemaMapping
    : 'schemaMapping' EQ record
    ;

tagState
    : 'tags' EQ LCURL tags RCURL
    ;

tags
    : NONE
    | STRING (COMMA STRING)*
    ;

resState
    : 'res' EQ responseRecord
    ;

responseRecord
    : LSTR body COMMA code RSTR
    ;

code
    : 'code' ATTR codeID
    ;

codeID
    : NONE
    | CODE
    ;

entity 
    : STRING EQ LPAR map RPAR
    ;

map
    : mapElement (REC_SEP mapElement)*
    ;

mapElement
    : STRING ':>' record
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

fState
    : 'f' EQ BOOLEAN 
    ;

pcState
    : 'pc' EQ BOOLEAN 
    ;

reqState
    : 'req' EQ requestRecord 
    ;

requestRecord
    : LSTR operation COMMA verb COMMA parameters COMMA body RSTR
    ;

operation
    : 'op' ATTR operationID
    ;

operationID
    : NONE
    | STRING
    ;

verb
    : 'verb' ATTR verbID
    ;

verbID
    : NONE
    | VERB
    ;

parameters
    : 'params' ATTR LCURL paramRecord (COMMA paramRecord)* RCURL
    ;

body 
    : 'body' ATTR bodyRecord (COMMA bodyRecord)*
    ;

paramRecord
    : LSTR 'name' ATTR STRING COMMA 'value' ATTR STRING RSTR
    | /* epsilon */
    ;

bodyRecord
    : LSTR bodyType COMMA bodyInt COMMA bodyBool COMMA bodyObject RSTR
    | /* epsilon */
    ;

bodyType
    : 'type' ATTR typeID
    ;

typeID
    : NONE
    | RTYPE
    ;

bodyInt
    : 'int' ATTR NAT
    ;

bodyBool
    : 'bool' ATTR BOOLEAN
    ;

bodyObject
    : 'obj' ATTR LCURL objectRecord RCURL
    ;

objectRecord
    : record (COMMA record)*
    | STRING (COMMA STRING)* 
    | /* epsilon */
    ;

// Lexer rules

NONE
    : 'None'
    ;

VERB
    : NONE
    | 'post' 
    | 'put' 
    | 'get' 
    | 'delete' 
    ;

RTYPE
    : NONE
    | 'num' 
    | 'boolean' 
    | 'object' 
    ;

CODE
    : '201' 
    | '200' 
    | '403' 
    | '404' 
    | '409' 
    ;

BOOLEAN 
    : 'TRUE'
    | 'FALSE'
    ;

REC_SEP
    : '@@'
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
