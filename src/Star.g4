grammar Star;
prog:   stat+;

stat:   probFunction WS?           # prob
    |  algorithm                      # algoritmo
    |  usefunction   WS?              # usefun
    |  arrayexpr WS?                  # arrayf
    |  stringOp WS?                  # stringopp
    |  arraylist WS?                  # arrayl
    |  twoWaysModel WS?                  # twm
    |  twoWaysModelop WS?                  # twmop
    |  arraylistop WS?                  # arraylop
    |  algexpr   WS?                  # printExpr
    |  assignment_statement WS?       # assign
    |  bexpression  WS?                  # bexpr
    |  while_statement WS?               # while
    |  if_statement  WS?                 # if
    |  for_statement WS?                 # for
    |  relexpr     WS?                   # relationalexpresion
    |  write_statement WS?            # write
    |  fwrite_statement WS?           # fwrite
    |  read_statement    WS?             # read
    |  fread_statement  WS?               # fread
    |  fun_statement  WS?             # functions
    |  return_statement  WS?          # return2
    |  trigFunction WS?               # trig
    |  familyDistribution WS?         # family
    |  lambdaFamily WS?               # lambdafam
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
   ALGORITHM ID (LEFTP idlist RIGHTP)? COLON WS?   statement DOT;

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
 | xOperations
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
 lambdaFamily:
   LAMBDA PERCENTIL LEFTP REALNUMBER ';' REALNUMBER ','? REALNUMBER ','? REALNUMBER ','? REALNUMBER RIGHTP // u,lambda1 2 3 4
|  LAMBDA DENSITY LEFTP REALNUMBER ';' REALNUMBER ','? REALNUMBER ','? REALNUMBER ','? REALNUMBER RIGHTP // x ,lambda1 2 3 4
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
   nOperations
  |xOperations
  |rOperations
  |ID ALPHA LEFTP  RIGHTP

 ;
  xOperations:
     ID X LEFTP DOTDOT RIGHTP
    |ID X  LEFTP INTEGER IDOT RIGHTP
    |ID X  LEFTP DOTJ INTEGER RIGHTP
    |ID R LEFTP DOTDOT RIGHTP
    |ID R  LEFTP INTEGER IDOT RIGHTP
    |ID R  LEFTP DOTJ INTEGER RIGHTP
    |ID C LEFTP INTEGER RIGHTP

  ;
 nOperations:
    ID N LEFTP DOTDOT RIGHTP
   |ID N  LEFTP INTEGER IDOT RIGHTP
   |ID N  LEFTP DOTJ INTEGER RIGHTP
   |ID N LEFTP INTEGER ','? INTEGER ','? INTEGER RIGHTP //ijk
   |ID X LEFTP INTEGER ','? INTEGER IDOT RIGHTP            //suma rachas  celda i j
   |ID XAVERAGE LEFTP INTEGER ','? INTEGER IDOT RIGHTP     // promedio suma rachas i j
   |ID X LEFTP INTEGER DOTDOTSPACE RIGHTP         //suma rachas bloque i
   |ID X LEFTP DOT INTEGER DOT RIGHTP       //suma rachas tratamiento j
   |ID XAVERAGE LEFTP INTEGER DOTDOTSPACE RIGHTP  //promedio rachas bloque i
   |ID XAVERAGE LEFTP DOT INTEGER DOT RIGHTP       //promedio rachas tratamiento j
   |ID X LEFTP DOTDOTDOT RIGHTP       //suma rachas todo el modelo
   |ID XAVERAGE LEFTP DOTDOTDOT RIGHTP       // promedio rachas modelo
 ;
 rOperations:
    ID R LEFTP INTEGER ','? INTEGER ','? INTEGER RIGHTP //ijk
   |ID R LEFTP INTEGER ','? INTEGER IDOT RIGHTP            //suma rachas  celda i j
   |ID RAVERAGE LEFTP INTEGER ','? INTEGER IDOT RIGHTP     // promedio suma rachas i j
   |ID R LEFTP INTEGER DOTDOTSPACE RIGHTP         //suma rachas bloque i
   |ID R LEFTP DOT INTEGER DOT RIGHTP       //suma rachas tratamiento j
   |ID RAVERAGE LEFTP INTEGER DOTDOTSPACE RIGHTP  //promedio rachas bloque i
   |ID RAVERAGE LEFTP DOT INTEGER DOT RIGHTP       //promedio rachas tratamiento j
   |ID R LEFTP DOTDOTDOT RIGHTP       //suma rachas todo el modelo
   |ID RAVERAGE LEFTP DOTDOTDOT RIGHTP       // promedio rachas modelo
 ;

 densityFunction:
      ID DENSITY LEFTP REALNUMBER RIGHTP

 ;
 momentumGenerationFunction:
      ID MGF LEFTP REALNUMBER RIGHTP
     |ID MGF  LEFTP REALNUMBER REALNUMBER RIGHTP
 ;

 familyDistribution:
   NORMALDISTRIBUTION  ID LEFTP REALNUMBER ','? REALNUMBER RIGHTP //mean and standard deviation
  | TDISTRIBUTION ID LEFTP INTEGER RIGHTP                          // degrees of freedom
  | POISSONDISTRIBUTION ID LEFTP REALNUMBER RIGHTP   // lambda, probability of
  | CHISQUAREDDISTRIBUTION ID LEFTP INTEGER RIGHTP      // degrees of freedom
  | GEOMETRICDISTRIBUTION ID LEFTP REALNUMBER  RIGHTP   // success probability
  | GAMMADISTRIBUTION ID LEFTP REALNUMBER ','? REALNUMBER RIGHTP // shape, scale

 ;
 distributionFunction:
    ID DISTRIBUTION LEFTP INTEGER RIGHTP  //GEOMETRIC DIST success probability
 | ID DISTRIBUTION LEFTP REALNUMBER RIGHTP  // GAMMADIST shape, scale
 ;
 percentilFunction:
     ID PERCENTIL LEFTP REALNUMBER RIGHTP

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
  | rOperations                       # rOP
  | nOperations                       # nOP
  | function                          # trigf
  | LEFTP algexpr RIGHTP              # Parenthesis
  | ID ('['INTEGER']')?               # id
  ;
 stringOp:
 STRING TOARRAY LEFTP ID RIGHTP
|STRING LENGTH LEFTP ID RIGHTP
|STRING CONCAT LEFTP ID ID RIGHTP
|ID SUBSTRING LEFTP INTEGER ','? INTEGER RIGHTP
|ID REPLACE LEFTP CADENA ','? CADENA RIGHTP
  ;
LAMBDA: 'lambda';
REPLACE: '.replace';
SUBSTRING: '.substring';
CONCAT: '.concat';
LENGTH:'.length';
TOARRAY: '.toArray';
C:'.c';
XAVERAGE:'.x.average';
DOTDOTDOT:'. . .';
DOT:'.';
ALPHA:'.alpha';
R:'.r';
RAVERAGE:'.r.average';
IJK:'.ijk';
X: '.x';
N:'.n';
DOTDOTSPACE:'. .';
DOTJ: '.,';
IDOT:',.' ;
DOTDOT:'..';
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
COLON: ':';
CADENA : '"' (~["\r\n] | '""')* '"';
ID  :   [a-zA-Z]+ ;      // match identifiers
INTEGER : [0-9]+;
REALNUMBER : [0-9]* '.' [0-9]* ([eE] [+-]? [0-9]+)?;
WS : [ \t\r\n] -> skip ;



