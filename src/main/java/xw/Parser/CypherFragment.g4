grammar CypherFragment;

cypher : singleQuery ;

singleQuery : clause ( SP? clause )* ;

clause : match | returnStatement       ;

match : MATCH SP? pattern ( SP? where )? ;

returnStatement : RETURN SP ( ( SP? ',' SP? returnItem )* ) | ( returnItem ( SP? ',' SP? returnItem )* ) ;

returnItem : expression ;

where : WHERE SP expression ;

pattern : patternPart ( SP? ',' SP? patternPart )* ;

patternPart
            : ( variable SP? '=' SP? anonymousPatternPart )
            | anonymousPatternPart
            ;


anonymousPatternPart : patternElement ;

patternElement : ( nodePattern ( SP? patternElementChain )* )
               | ( '(' patternElement ')' )
               ;

nodePattern : '(' SP? ( variable SP? )? ( nodeLabels  SP? )? ( properties SP? )? ')' ;

patternElementChain : relationshipPattern SP? nodePattern ;

relationshipPattern : ( leftArrowHead SP? dash SP? relationshipDetail? SP? dash SP? rightArrowHead )
                    | ( leftArrowHead SP? dash SP? relationshipDetail? SP? dash )
                    | ( dash SP? relationshipDetail? SP? dash SP? rightArrowHead )
                    | ( dash SP? relationshipDetail? SP? dash )
                    ;

relationshipDetail : '[' SP? ( variable SP? )? ( relationshipTypes SP? )? rangeLiteral? ( properties SP? )? ']' ;

properties : mapLiteral
           ;

relationshipTypes : ':' SP? relTypeName ( SP? '|' ':'? SP? relTypeName )* ;

nodeLabels : nodeLabel ( SP? nodeLabel )* ;


nodeLabel : ':' SP? labelName ;

rangeLiteral : '*' SP? ( integerLiteral SP? )? ( '..' SP? ( integerLiteral SP? )? )? ;

labelName : symbolicName ;

relTypeName : symbolicName ;

expression : expression9 ( SP AND SP expression9 )* ;

expression9 : expression7 ( SP? ( '=' SP? literal ) )? ;

expression7 : atom ( SP? ( propertyLookup | labelLookup ) )? ;

atom : literal
     | parenthesizedExpression
     | variable
     ;

literal : numberLiteral
        | StringLiteral
        | booleanLiteral
        | NULL
        ;

StringLiteral : ( '"' ( StringLiteral_0 )* '"' ) ;

numberLiteral : doubleLiteral
              | integerLiteral
              ;

booleanLiteral : TRUE
               | FALSE
               ;

//listLiteral : '[' SP? ( expression SP? ( ',' SP? expression SP? )* )? ']' ;

mapLiteral : '{' SP? ( propertyKeyName SP? ':' SP? expression SP? ( ',' SP? propertyKeyName SP? ':' SP? expression SP? )* )? '}' ;

//partialComparisonExpression : ( '=' SP? expression7 )
//                            | ( '<>' SP? expression7 )
//                            | ( '!=' SP? expression7 )
//                            | ( '<' SP? expression7 )
//                            | ( '>' SP? expression7 )
//                            | ( '<=' SP? expression7 )
//                            | ( '>=' SP? expression7 )
//                            ;

parenthesizedExpression : '(' SP? expression SP? ')' ;
//parameter : '$' ( symbolicName | DecimalInteger ) ;
//relationshipsPattern : nodePattern ( SP? patternElementChain )+ ;
propertyLookup : '.' SP? ( propertyKeyName ) ;
labelLookup : ':' SP? symbolicName;
variable : symbolicName ;
integerLiteral : DecimalInteger               ;

propertyKeyName : schemaName ;
schemaName : symbolicName
           | reservedWord
           ;

reservedWord : MATCH
             | RETURN
             | WHERE
             | AND
             | NOT
             | FALSE
             | TRUE
             | NULL
             | OR
             ;

DecimalInteger : ZeroDigit
               | ( NonZeroDigit ( Digit )* )
               ;

Digit : ZeroDigit | NonZeroDigit ;
NonZeroDigit : NonZeroOctDigit | '8' | '9' ;
NonZeroOctDigit : '1' | '2' | '3' | '4' | '5' | '6' | '7' ;
OctDigit : ZeroDigit | NonZeroOctDigit ;
ZeroDigit : '0' ;
doubleLiteral : RegularDecimalReal ;
RegularDecimalReal : ( Digit )* '.' ( Digit )+ ;
symbolicName : UnescapedSymbolicName | MATCH | RETURN | WHERE | OR | AND | NOT | TRUE | FALSE ;

OR : ( 'O' | 'o' ) ( 'R' | 'r' )  ;
NULL : ( 'N' | 'n' ) ( 'U' | 'u' ) ( 'L' | 'l' ) ( 'L' | 'l' )  ;
COUNT : ( 'C' | 'c' ) ( 'O' | 'o' ) ( 'U' | 'u' ) ( 'N' | 'n' ) ( 'T' | 't' )  ;
MATCH : ( 'M' | 'm' ) ( 'A' | 'a' ) ( 'T' | 't' ) ( 'C' | 'c' ) ( 'H' | 'h' )  ;
RETURN : ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'T' | 't' ) ( 'U' | 'u' ) ( 'R' | 'r' ) ( 'N' | 'n' )  ;
WHERE : ( 'W' | 'w' ) ( 'H' | 'h' ) ( 'E' | 'e' ) ( 'R' | 'r' ) ( 'E' | 'e' )  ;
AND : ( 'A' | 'a' ) ( 'N' | 'n' ) ( 'D' | 'd' )  ;
NOT : ( 'N' | 'n' ) ( 'O' | 'o' ) ( 'T' | 't' )  ;
TRUE : ( 'T' | 't' ) ( 'R' | 'r' ) ( 'U' | 'u' ) ( 'E' | 'e' )  ;
FALSE : ( 'F' | 'f' ) ( 'A' | 'a' ) ( 'L' | 'l' ) ( 'S' | 's' ) ( 'E' | 'e' )  ;
UnescapedSymbolicName : IdentifierStart ( IdentifierPart )* ;
/** * Based on the unicode identifier and pattern syntax *   (http://www.unicode.org/reports/tr31/) * And extended with a few characters. */IdentifierStart : ID_Start                | '_'                | '‿'                | '⁀'                | '⁔'                | '︳'                | '︴'                | '﹍'                | '﹎'                | '﹏'                | '＿'                ;
/** * Based on the unicode identifier and pattern syntax *   (http://www.unicode.org/reports/tr31/) * And extended with a few characters. */IdentifierPart : ID_Continue               ;
/** * Any character except "`", enclosed within `backticks`. Backticks are escaped with double backticks. */
SP : ( WHITESPACE )+ ;
WHITESPACE : SPACE           | TAB           | LF           | VT           | FF           | CR           | FS           | GS           | RS           | US           | ' '           | '᠎'           | ' '           | ' '           | ' '           | ' '           | ' '           | ' '           | ' '           | ' '           | ' '           | ' '           | ' '           | ' '           | ' '           | '　'           | ' '           | ' '           | ' '           | Comment           ;
Comment : ( '/*' ( Comment_1 | ( '*' Comment_2 ) )* '*/' )        | ( '//' ( Comment_3 )* CR? ( LF | EOF ) )        ;
leftArrowHead : '<'          ;
rightArrowHead : '>'               ;
dash : '-'     ;
fragment FF : [\f] ;
fragment RS : [\u001E] ;
fragment ID_Continue : [0-9A-Z_a-z];
fragment Comment_1 : [\u0000-)+-\uFFFF] ;
fragment Comment_3 : [\u0000-\t\u000B-\f\u000E-\uFFFF] ;
fragment Comment_2 : [\u0000-.0-\uFFFF] ;
fragment GS : [\u001D] ;
fragment FS : [\u001C] ;
fragment CR : [\r] ;
fragment SPACE : [ ] ;
fragment TAB : [\t] ;
fragment StringLiteral_0 : [\u0000-!#-[\]-\uFFFF] ;
fragment LF : [\n] ;
fragment VT : [\u000B] ;
fragment US : [\u001F] ;
fragment ID_Start : [A-Za-z] ;