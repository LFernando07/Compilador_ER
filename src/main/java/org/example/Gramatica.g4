grammar Gramatica;

//Expresion completa

prule: (declaraciones)+;
declaraciones: TIPO ID segunda tercera?;
segunda: COMA ID segunda | P_COMA | IGUAL valor P_COMA;
tercera: condicional;
valor: NUMINT | NUMDEC | BOOL;

condicional: P_IF PARENTESIS_A condicion PARENTESIS_c LLAVE_A LLAVE_C contraria?;
condicion: ID OPERADOR ID;
contraria: P_ELSE LLAVE_A LLAVE_C;

NUMINT: [0-9]+;
NUMDEC: [0-9] + ('.' [0-9]+ )?;
BOOL: 'true' | 'false';
TIPO: 'int'| 'float' | 'double' | 'boolean';
P_IF: 'if';
P_ELSE: 'else';
WS: [ \t\n\r]+ -> skip;
ID: LETRA(LETRA | DIGITO)*;
LETRA: 'A'..'Z' | 'a'..'z';
DIGITO: '0'..'9';
P_COMA: ';';
IGUAL: '=';
PUNTO: '.';
COMA: ',';

PARENTESIS_A: '(';
PARENTESIS_c: ')';
OPERADOR: '<'|'>'|'||'|'&&'| '==' | '!=';
LLAVE_A: '{';
LLAVE_C: '}';
