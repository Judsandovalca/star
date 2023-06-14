grammar Star;
prog:   stat+;

stat:    randomFunction WS?           #prob
    |  algorithm                      # algoritmo
    |  usefunction   WS?              # usefun
    |  arrayexpr WS?                  #arrayf
    |  algexpr   WS?                  # printExpr
    |  assignment_statement WS?       # assign
    |  bexpression                    # bexpr
    |  while_statement                # while
    |  if_statement                   # if
    |  for_statement                  # for
    |  relexpr                        # relationalexpresion
    |  write_statement WS?            # write
    |  fwrite_statement WS?           # fwrite
    |  read_statement                 # read
    |  fread_statement                 # fread
    |  fun_statement  WS?             # functions
    |  return_statement  WS?          # return2
    |  trigFunction WS?               # trig
    |  WS                             # blank



    ;
idlist :
        ID (COMMA ID)*
 ;


 type : INT # tipoInt
 | FLOAT    # tipoFloat
 | STRING   # tipoString
 | BOOL     # tipoBool
 | MATRIX   # tipoMatrix
 | VECTOR   # tipoVector
 | TMW      # tipoTMW
 ;

 algorithm:
   ALGORITHM ID (LEFTP idlist RIGHTP)? COLON WS?   statement END;

 statement : block
 | read_statement
 | fread_statement
 | write_statement
 | fwrite_statement
 | while_statement
 | if_statement
 | for_statement
 | fun_statement
 | usefunction
 | assignment_statement
 | return_statement
 | algexpr
 | arrayexpr
 ;
 fread_statement:
   FREAD LEFTP idlist ',' CADENA? RIGHTP
  |FREAD LEFTP CADENA ',' CADENA? RIGHTP
  ;

  return_statement : RETURN usefunction
  | RETURN algexpr

  ;


 /* ciclos */
 while_statement :
  WHILE bexpression statement
 ;
 if_statement :
 IF bexpression statement WS? (ELSE WS? statement)?
 ;
 for_statement : FOR assignment_statement ';' bexpression ';' assignment_statement ';' WS? statement
 | FOR '(' assignment_statement ';' bexpression ';' assignment_statement ')' statement
 ;
 fun_statement :
  DEF  ID LEFTP idlist RIGHTP COLON WS? statement
 ;
 /* expresiones booleanas */
 relexpr: algexpr opl=(GT|LESS|EQ|GTH|LESSTH|NOTEQ) algexpr
 ;
 bexpression : bexpression OR bterm #bexp1
 | bterm                            #bexp2
 ;
 bterm : bterm AND bfactor  #bterm1
 | bfactor               #bterm2
 ;
 bfactor : NOT bfactor   # bNeg
 | LEFTP bexpression RIGHTP   # bParenthesis
 | ID                    # bID
 | TRUE                  # bTrue
 | FALSE                # bFalse
 | relexpr              # relationals
 | '(' relexpr ')'              # relParenthesis

;
/* lectura y escritura */
 read_statement:
  READ LEFTP idlist RIGHTP
 |READ LEFTP CADENA RIGHTP
 ;
 write_statement:
     WRITE LEFTP idlist RIGHTP
  |  WRITE LEFTP algexpr RIGHTP
  |  WRITE LEFTP CADENA RIGHTP
  |  WRITE LEFTP array '[' INTEGER ']' RIGHTP
  |  WRITE LEFTP usefunction RIGHTP
  |  WRITE LEFTP arrayexpr RIGHTP
  |  WRITE LEFTP matrix ('[' INTEGER ']')+ RIGHTP /* write matriz*/
  ;
  fwrite_statement:
    FWRITE LEFTP idlist ','? CADENA RIGHTP
 |  FWRITE LEFTP algexpr ','? CADENA RIGHTP
 |  FWRITE LEFTP CADENA ','? CADENA RIGHTP
 |  FWRITE LEFTP array ','? CADENA '[' INTEGER ']' RIGHTP
 |  FWRITE LEFTP usefunction ','? CADENA RIGHTP
 |  FWRITE LEFTP arrayexpr ','? CADENA RIGHTP
 |  FWRITE LEFTP matrix ('[' INTEGER ']')+ ','? CADENA RIGHTP /* write matriz*/
  ;

block : '{'WS? ( statement';'WS?)*'}' ;

matrix: '[' (array','?)+ ']'
| ID

;
array
: '['  (algexpr','?)+  ']'
 | ID
 | arrayexpr
;

assignment_statement
 : ID '=' usefunction
 | ID '=' algexpr
 | ID '=' CADENA
 | ID '=' matrix
 | ID '=' array

 ;

 value:
 algexpr
 | bexpression
 | CADENA
 ;

arrayexpr:
 ARRAYADD LEFTP array ','? array RIGHTP
 | ARRAYSUBS LEFTP array ','? array RIGHTP
 | ARRAYDOT LEFTP array ','? array RIGHTP
 | ARRAYCROSS LEFTP array ','? array RIGHTP

;
 trigFunction:
 SIN LEFTP algexpr RIGHTP
 | COS LEFTP algexpr RIGHTP
 | TAN LEFTP algexpr RIGHTP
 | ARCSIN LEFTP algexpr RIGHTP
 | ACOS LEFTP algexpr RIGHTP
 | ARCTAN LEFTP algexpr RIGHTP
 | SINH LEFTP algexpr RIGHTP
 | COSH LEFTP algexpr RIGHTP
 | TANH LEFTP algexpr RIGHTP
;

function:
mathFunction
|usefunction

 ;

 mathFunction:
 trigFunction
 | logFunction
 | probFunction
 ;
 probFunction:
  randomFunction
 ;
 randomFunction:
 RANDOM LEFTP REALNUMBER RIGHTP
 ;
logFunction:
LN LEFTP algexpr RIGHTP
;



  usefunction
  :  ID  LEFTP (algexpr','?)+ RIGHTP
  |  ID  LEFTP idlist RIGHTP';'
  ;




algexpr
 :
   algexpr POWER algexpr              # PowerRoot
  | algexpr op=(MULT|DIV) algexpr     # MulDiv
  | algexpr op=(ADD|SUBS) algexpr     # AddSub
  | algexpr MOD algexpr               # Md
  | SUBS algexpr                      # Negation
  | REALNUMBER                        # Number
  | INTEGER                           # ENT
  | function                          # trigf
  | LEFTP algexpr RIGHTP              # Parenthesis
  | ID ('['INTEGER']')?               # id

  ;
FWRITE:'fwrite';
FREAD:'fread' ;
RANDOM: 'random';
LN:'ln';
ARRAYADD:'array.add';
ARRAYSUBS:'array.substract';
ARRAYDOT:'array.dot';
ARRAYCROSS:'array.cross';
SIN: 'sin';
COS: 'cos';
TAN: 'tan';
ARCSIN: 'arcsin';
ACOS: 'acos';
ARCTAN: 'arctan';
SINH: 'sinh';
COSH: 'cosh';
TANH: 'tanh';
IF: 'if';
DEF: 'def';
RETURN: 'return';
MOD: '%';
VECTOR: 'vector';
INT: 'int';
FLOAT: 'float';
STRING: 'string';
MATRIX: 'matrix';
BOOL: 'bool';
TMW: 'TMW';
GT: '>';
LESS: '<';
EQ: '==';
GTH: '>=';
LESSTH: '<=';
NOTEQ: '!=';
FOR: 'for';
ELSE: 'else';
NOT: 'not';
TRUE: 'true';
FALSE: 'false';
AND: 'and';
OR : 'or';
WHILE : 'while';
ALGORITHM: 'algorithm';
READ: 'read';
WRITE: 'write';
ADD:'+';
MULT:'*';
SUBS: '-';
DIV: '/';
POWER: '^';
LEFTP: '(';
RIGHTP: ')';
COMMA: ',';
END: '.';
COLON: ':';
CADENA : '"' (~["\r\n] | '""')* '"';
ID  :   [a-zA-Z]+ ;      // match identifiers
INTEGER : [0-9]+;
REALNUMBER : [0-9]* '.' [0-9]* ([eE] [+-]? [0-9]+)?;
WS : [ \t\r\n] -> skip ;



