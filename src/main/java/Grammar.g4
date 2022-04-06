grammar Grammar;
program         : 'main_program' block;

block           :BEGIN statement+ END;
statement : assign_int | assign_int_by_subprogram | program_call | assign_vec | set_vec_expr | set_vec_expr_by_mat | assign_vec_by_subprogram
    | assign_mat | set_mat_expr | compare | print_id | print_mat_row | print_string | print_number ;

type                : VECTOR | MATRIX | INT;

print_number        : PRINT OPEN_BRACKET (NUMBER) CLOSE_BRACKET ;
print_id            : PRINT OPEN_BRACKET (ID) CLOSE_BRACKET ;
print_string        : PRINT OPEN_BRACKET (('"')(ID)('"')) CLOSE_BRACKET ;
print_mat_row       : PRINT OPEN_BRACKET get_mat_row_by_id CLOSE_BRACKET ;

simple_compare      : (ID | digit_expression) (EQUAL | NON_EQUAL | LESS | GREATER) (ID | digit_expression);
hard_compare        : NEGATION? OPEN_BRACKET simple_compare CLOSE_BRACKET;
else_compare        : ELSE block;

compare             : IF OPEN_BRACKET (simple_compare | hard_compare) CLOSE_BRACKET block else_compare?;

digit_expression : digit_expression (MULTIPLY | DIVIDE) digit_expression | digit_expression (PLUS | MINUS) digit_expression | NUMBER | ID | OPEN_BRACKET digit_expression CLOSE_BRACKET ;

expression : expression (MULTIPLY) expression | expression (PLUS | MINUS) expression | ID | expression (MULTIPLY | DIVIDE) digit_expression | OPEN_BRACKET expression CLOSE_BRACKET ;

input_signature     : (OPEN_BRACKET (ID COMMA)* (ID) CLOSE_BRACKET);
assign_int          : ( (INT ID ASSIGN (OPEN_BRACKET INT CLOSE_BRACKET)(digit_expression)) | (ID ASSIGN (OPEN_BRACKET INT CLOSE_BRACKET)(digit_expression)));
assign_int_by_subprogram :((INT ID ASSIGN (OPEN_BRACKET INT CLOSE_BRACKET)(ID (input_signature | (OPEN_BRACKET CLOSE_BRACKET)))) | (ID ASSIGN (OPEN_BRACKET INT CLOSE_BRACKET)(ID (input_signature|(OPEN_BRACKET CLOSE_BRACKET)))));

program_call        : (ID (input_signature | (OPEN_BRACKET CLOSE_BRACKET)));

assign_vec          : ( (VECTOR ID ASSIGN (VECTOR_EXPR)) | (ID ASSIGN (VECTOR_EXPR)) );
assign_vec_by_subprogram : ((VECTOR ID ASSIGN (OPEN_BRACKET VECTOR CLOSE_BRACKET)(ID (input_signature|(OPEN_BRACKET CLOSE_BRACKET)))) | (ID ASSIGN (OPEN_BRACKET VECTOR CLOSE_BRACKET)(ID (input_signature|(OPEN_BRACKET CLOSE_BRACKET)))));
set_vec_expr        : ( (VECTOR ID ASSIGN (OPEN_BRACKET VECTOR CLOSE_BRACKET)(expression)) | (ID ASSIGN (OPEN_BRACKET VECTOR CLOSE_BRACKET)(expression)));
set_vec_expr_by_mat : ((VECTOR ID ASSIGN get_mat_row_by_id)|(ID ASSIGN get_mat_row_by_id));


assign_mat          : ( (MATRIX ID ASSIGN (MATRIX_EXPR)) | (ID ASSIGN (MATRIX_EXPR)));
set_mat             : ( (MATRIX ID ASSIGN (OPEN_BRACKET MATRIX CLOSE_BRACKET)(ID )) | (ID ASSIGN (OPEN_BRACKET MATRIX CLOSE_BRACKET) (ID )));
set_mat_expr        : ( (MATRIX ID ASSIGN (OPEN_BRACKET MATRIX CLOSE_BRACKET)(expression )) | (ID ASSIGN(OPEN_BRACKET MATRIX CLOSE_BRACKET)(expression)));

get_mat_row_by_id   : (ID OPEN_SQUARE_BRACKET digit_expression CLOSE_SQUARE_BRACKET) ;


BEGIN         : 'begin';
END           : 'end';
PRINT         : 'print';
INT           : 'int';
IF            : 'if';
ELSE          : 'else';
FOR           : 'for';
WHILE         : 'while';
VECTOR        : 'vector';
MATRIX        : 'matrix';
RETURN        : 'return';

ID            : [a-zA-Z_][a-zA-Z_0-9]* ;
NUMBER        : [0-9]+ ;
WS            : [ \n\t\r]+ -> skip;

OPEN_BRACKET            : '(';
CLOSE_BRACKET           : ')';
OPEN_SQUARE_BRACKET     : '[';
CLOSE_SQUARE_BRACKET    : ']';
OPEN_CURLY_BRACKET      : '{';
CLOSE_CURLY_BRACKET     : '}';

COMMA           : ',' ;
PLUS            : '+' ;
MINUS           : '-' ;
MULTIPLY        : '*' ;
DIVIDE          : '/' ;
ASSIGN          : '=' ;

NEGATION        : '!';
EQUAL           : '==';
NON_EQUAL       : '!=';
LESS            : '<';
GREATER         : '>';

VECTOR_EXPR     : OPEN_CURLY_BRACKET (((NUMBER COMMA)*NUMBER)) CLOSE_CURLY_BRACKET;
MATRIX_EXPR     : (OPEN_CURLY_BRACKET (((VECTOR_EXPR COMMA )*VECTOR_EXPR)) CLOSE_CURLY_BRACKET);