grammar Star;
prog:   stat+;

stat:   probFunction WS?           # prob
    |  algorithm                      # algoritmo
    |  usefunction   WS?              # usefun
    |  arrayexpr WS?                  # arrayf
    |  arraylist WS?                  # arrayl
    |  twoWaysModel WS?                  # twm
    |  twoWaysModelop WS?                  # twmop
    |  arraylistop WS?                  # arraylop
    |  algexpr   WS?                  # printExpr
    |  assignment_statement WS?       # assign
    |  bexpression                    # bexpr
    |  while_statement WS?               # while
    |  if_statement  WS?                 # if
    |  for_statement WS?                 # for
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
 | TWM      # tipoTMW
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


  return_statement : RETURN recursiveCall
  | RETURN usefunction
  | RETURN algexpr

  ;
recursiveCall:';'
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
 bfactor: NOT bfactor   # bNeg
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
fread_statement:
   FREAD LEFTP idlist ',' CADENA? RIGHTP
  |FREAD LEFTP CADENA ',' CADENA? RIGHTP
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
 | ARRAYSIZE LEFTP array RIGHTP
 | ARRAYSUBS LEFTP array ','? array RIGHTP
 | ARRAYDOT LEFTP array ','? array RIGHTP
 | ARRAYCROSS LEFTP array ','? array RIGHTP

;
arraylist:
ARRAYLIST ID
| ID
;
arraylistop:
 ID LADD LEFTP array RIGHTP
| ID LDELETE LEFTP array RIGHTP
| ID LGET LEFTP INTEGER RIGHTP
| ID LCONTAINS LEFTP array RIGHTP
| ID LSIZE LEFTP RIGHTP
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
 | densityFunction
 | distributionFunction
 | percentilFunction
 | momentumGenerationFunction
 ;
 twoWaysModel:
  TWM ID LEFTP REALNUMBER ','? array ','? array ','? arraylist RIGHTP  // efecto del modelo, tratamiento, bloques, matriz de n
  ;
 twoWaysModelop:
   ID N LEFTP DOTDOT RIGHTP
  |ID N  LEFTP INTEGER IDOT RIGHTP
  |ID N  LEFTP DOTJ INTEGER RIGHTP
  |ID X LEFTP DOTDOT RIGHTP
  |ID X  LEFTP INTEGER IDOT RIGHTP
  |ID X  LEFTP DOTJ INTEGER RIGHTP
 ;

 densityFunction:
      NORMALDISTRIBUTION LEFTP REALNUMBER ','? REALNUMBER RIGHTP  DENSITY LEFTP REALNUMBER RIGHTP //confidence degrees
    | TDISTRIBUTION LEFTP INTEGER RIGHTP DENSITY LEFTP REALNUMBER RIGHTP  //confidence degrees
    | POISSONDISTRIBUTION LEFTP REALNUMBER RIGHTP  DENSITY LEFTP REALNUMBER RIGHTP  // lambda, probability of
    | CHISQUAREDDISTRIBUTION LEFTP INTEGER RIGHTP  DENSITY LEFTP REALNUMBER RIGHTP //confidence degrees
    | GEOMETRICDISTRIBUTION LEFTP REALNUMBER  RIGHTP DENSITY LEFTP REALNUMBER RIGHTP //confidence degrees
    | GAMMADISTRIBUTION LEFTP REALNUMBER ','? REALNUMBER RIGHTP  DENSITY  LEFTP REALNUMBER RIGHTP
 ;
 momentumGenerationFunction:
     NORMALDISTRIBUTION LEFTP REALNUMBER ','? REALNUMBER RIGHTP  MGF LEFTP REALNUMBER RIGHTP //confidence degrees
     | TDISTRIBUTION LEFTP INTEGER RIGHTP MGF LEFTP REALNUMBER RIGHTP  //confidence degrees
     | POISSONDISTRIBUTION LEFTP REALNUMBER RIGHTP  MGF LEFTP REALNUMBER RIGHTP  // lambda, probability of
     | CHISQUAREDDISTRIBUTION LEFTP INTEGER RIGHTP  MGF LEFTP REALNUMBER RIGHTP //confidence degrees
     | GEOMETRICDISTRIBUTION LEFTP REALNUMBER  RIGHTP MGF LEFTP REALNUMBER RIGHTP //confidence degrees
     | GAMMADISTRIBUTION LEFTP REALNUMBER ','? REALNUMBER RIGHTP  MGF  LEFTP REALNUMBER RIGHTP
 ;

 distributionFunction:
   NORMALDISTRIBUTION LEFTP REALNUMBER ','? REALNUMBER RIGHTP DISTRIBUTION LEFTP REALNUMBER RIGHTP //mean and standard deviation
 | TDISTRIBUTION LEFTP INTEGER RIGHTP DISTRIBUTION LEFTP REALNUMBER RIGHTP                          // degrees of freedom
 | POISSONDISTRIBUTION LEFTP REALNUMBER RIGHTP DISTRIBUTION LEFTP INTEGER RIGHTP   // lambda, probability of
 | CHISQUAREDDISTRIBUTION LEFTP INTEGER RIGHTP  DISTRIBUTION LEFTP REALNUMBER RIGHTP               // degrees of freedom
 | GEOMETRICDISTRIBUTION LEFTP REALNUMBER  RIGHTP DISTRIBUTION LEFTP INTEGER RIGHTP  // success probability
 | GAMMADISTRIBUTION LEFTP REALNUMBER ','? REALNUMBER RIGHTP  DISTRIBUTION LEFTP REALNUMBER RIGHTP  // shape, scale
 ;
 percentilFunction:
    NORMALDISTRIBUTION LEFTP REALNUMBER ','? REALNUMBER RIGHTP  PERCENTIL LEFTP REALNUMBER RIGHTP //confidence degrees
   | TDISTRIBUTION LEFTP INTEGER RIGHTP PERCENTIL LEFTP REALNUMBER RIGHTP  //confidence degrees
   | POISSONDISTRIBUTION LEFTP REALNUMBER  RIGHTP  PERCENTIL LEFTP REALNUMBER RIGHTP  // lambda, probability of
   | CHISQUAREDDISTRIBUTION LEFTP INTEGER RIGHTP  PERCENTIL LEFTP REALNUMBER RIGHTP //confidence degrees
   | GEOMETRICDISTRIBUTION LEFTP REALNUMBER  RIGHTP  PERCENTIL LEFTP REALNUMBER RIGHTP //confidence degrees
   | GAMMADISTRIBUTION LEFTP REALNUMBER ','? REALNUMBER RIGHTP  PERCENTIL LEFTP REALNUMBER RIGHTP //confidence degrees
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
X: '.x';
N:'.n';
DOTJ: '.,';
IDOT:',.' ;
DOTDOT: '..';
LSIZE: '.size';
ARRAYLIST: 'arraylist';
LADD: '.add' ;
LGET: '.get' ;
LDELETE: '.delete';
LCONTAINS:'.contains' ;
MGF:'.MGF';
DISTRIBUTION:'.distribution';
DENSITY:'.density';
PERCENTIL:'.percentil';
GAMMADISTRIBUTION:'gammaDistribution';
GEOMETRICDISTRIBUTION: 'geometricDistribution';
CHISQUAREDDISTRIBUTION:'chiSquaredDistribution';
TDISTRIBUTION:'TDistribution';
POISSONDISTRIBUTION:'poissonDistribution';
NORMALDISTRIBUTION:'normalDistribution';
ARRAYSIZE:'array.size';
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
TWM: 'TWM';
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



