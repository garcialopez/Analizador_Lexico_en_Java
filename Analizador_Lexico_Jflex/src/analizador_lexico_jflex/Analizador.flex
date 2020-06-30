%%

%public
%class Analizador
%{
  /* Código de la clase */
  private boolean masTokens = false;

  public boolean hayTokens() {
    return masTokens;
  }
%}

%type GestionaToken

%init{
  /* Código al inicio de nuestro Analizador */
%init}

%eof{
  /* Código al finalizar el análisis */
%eof}

/* Expresiones regulares */

DIGITO = [0-9]+
NUMEROS_ENTEROS = {DIGITO} {DIGITO}*

DECIMAL=[0-9]+("."[  |0-9]+)?

LETRA = [A-Za-z_]
IDENTIFICADOR= {LETRA} {LETRA}*

RESERVADAS = "abstract"|"assert"|"boolean"|"break"|"byte"|"case"|"catch"|"char"|
             "class"|"const"|"continue"|"default"|"do"|"double"|"else"|"enum"|
             "extends"|"final"|"finally"|"float"|"for"|"goto"|"if"|"implements"|
             "import"|"instanceof"|"int"|"interface"|"long"|"native"|"new"|"Object"|
             "package"|"private"|"protected"|"public"|"return"|"short"|"static"|
             "strictfp"|"super"|"switch"|"synchronized"|"this"|"throw"|"throws"|
             "transient"|"try"|"void"|"volatile"|"while"

BLANCO =[ \t]+
SALTO_LINEA = \n|\r|\r\n

CADENACOMILLASDOBLES = [\"]([^\"\n]|(\\\"))*[\"]
COMENTUNILINEA =("//".*\r\n)|("//".*\n)|("//".*\r)
COMENTMULTILINEA ="/*""/"*([^*/]|[^*]"/"|"*"[^/])*"*"*"*/"
COMILLAS = [\"]
%%

/* Reglas */

{COMENTUNILINEA} {
        GestionaToken t = new GestionaToken("Comentario de una linea", yytext());
        masTokens = true;
        return t;
      } 
{COMENTMULTILINEA} {
        GestionaToken t = new GestionaToken("Comentario multilinea", yytext());
        masTokens = true;
        return t;
      }  
{CADENACOMILLASDOBLES} {
        GestionaToken t = new GestionaToken("Cadena", yytext());
        masTokens = true;
        return t;
      }
"&"  {
        GestionaToken t = new GestionaToken("AND", yytext());
        masTokens = true;
        return t;
      }
"|"  {
        GestionaToken t = new GestionaToken("OR", yytext());
        masTokens = true;
        return t;
      }
"%"  {
            GestionaToken t = new GestionaToken("MOD", yytext());
        masTokens = true;
        return t;
      }
"="  {
        GestionaToken t = new GestionaToken("Asignación", yytext());
        masTokens = true;
        return t;
      }
"==" {
        GestionaToken t = new GestionaToken("Igualdad", yytext());
        masTokens = true;
        return t;
      }
"!=" {
        GestionaToken t = new GestionaToken("Diferente", yytext());
        masTokens = true;
        return t;
      }
"!" {
        GestionaToken t = new GestionaToken("Negación", yytext());
        masTokens = true;
        return t;
      }
"+"  {
        GestionaToken t = new GestionaToken("Suma", yytext());
        masTokens = true;
        return t;
      }
"*"  {
        GestionaToken t = new GestionaToken("Multiplicación", yytext());
        masTokens = true;
        return t;
      }
"-"  {
        GestionaToken t = new GestionaToken("Resta", yytext());
        masTokens = true;
        return t;
      }
"/"  {
        GestionaToken t = new GestionaToken("División", yytext());
        masTokens = true;
        return t;
      }
"'"  {
        GestionaToken t = new GestionaToken("Apostrofe", yytext());
        masTokens = true;
        return t;
      }
"("  {
        GestionaToken t = new GestionaToken("Paréntesis abierto", yytext());
        masTokens = true;
        return t;
      }
")"  {
        GestionaToken t = new GestionaToken("Paréntesis cerrado", yytext());
        masTokens = true;
        return t;
      }
">"  {
        GestionaToken t = new GestionaToken("Mayor que", yytext());
        masTokens = true;
        return t;
      }
">="  {
        GestionaToken t = new GestionaToken("Mayor igual que", yytext());
        masTokens = true;
        return t;
      }
"<"  {
        GestionaToken t = new GestionaToken("Menor que", yytext());
        masTokens = true;
        return t;
      }
"<="  {
        GestionaToken t = new GestionaToken("Menor igual que", yytext());
        masTokens = true;
        return t;
      }
"["  {
        GestionaToken t = new GestionaToken("Corchete abierto", yytext());
        masTokens = true;
        return t;
      }
"]"  {
        GestionaToken t = new GestionaToken("Corchete cerrado", yytext());
        masTokens = true;
        return t;
      }
"{"  {
        GestionaToken t = new GestionaToken("Llave abierta", yytext());
        masTokens = true;
        return t;
      }
"}"  {
        GestionaToken t = new GestionaToken("Llave cerrada", yytext());
        masTokens = true;
        return t;
      }
";"  {
        GestionaToken t = new GestionaToken("Punto y coma", yytext());
        masTokens = true;
        return t;
      }
":"  {
        GestionaToken t = new GestionaToken("Dos puntos", yytext());
        masTokens = true;
        return t;
      }
"."  {
        GestionaToken t = new GestionaToken("Punto", yytext());
        masTokens = true;
        return t;
      }
","  {
        GestionaToken t = new GestionaToken("Coma", yytext());
        masTokens = true;
        return t;
      }

"^"  {
        GestionaToken t = new GestionaToken("Acento circunflejo", yytext());
        masTokens = true;
        return t;
      }

{RESERVADAS} {
  GestionaToken t = new GestionaToken("Palabra reservada", yytext());
  masTokens = true;
  return t;
}

{IDENTIFICADOR} {
  GestionaToken t = new GestionaToken("IDENTIFICADOR", yytext());
  masTokens = true;
  return t;
}
{NUMEROS_ENTEROS} {
  GestionaToken t = new GestionaToken("Número entero", yytext());
  masTokens = true;
  return t;
}
{DECIMAL} {
  GestionaToken t = new GestionaToken("Numero decimal", yytext());
  masTokens = true;
  return t;
}

/*Ignorados*/
{SALTO_LINEA} {}
{BLANCO} {}

{COMILLAS}  {
        GestionaToken t = new GestionaToken("Comillas dobles", yytext());
        masTokens = true;
        return t;
      }

//GESTION DE ERRORES
. {
    GestionaToken t = new GestionaToken("Simbolo desconocido", yytext());
    masTokens = true;
    return t;
}






