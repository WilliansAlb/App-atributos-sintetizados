package Analizador;
import java_cup.runtime.Symbol;
%%
%class Lexer
%type java_cup.runtime.Symbol
%cup
%unicode
%line
%column
%char
%public
D= [0-9]+
espacio=[\t|\r|\n]+
esp = [" "]+
%{
    private Symbol symbol(int type, Object value){
        return new Symbol(type, yyline, yycolumn, value);
    }
    private Symbol symbol(int type){
        return new Symbol(type, yyline, yycolumn);
    }
%}
%%
<YYINITIAL> {
    "+"                       { return new Symbol(sym.MAS, yycolumn, yyline, yytext());}
    "*"                       { return new Symbol(sym.POR, yycolumn, yyline, yytext());}
    "("                       { return new Symbol(sym.PA, yycolumn, yyline, yytext());}
    ")"                       { return new Symbol(sym.PC, yycolumn, yyline, yytext());}
    {D}                       { return new Symbol(sym.NUMERO, yycolumn, yyline, yytext());}
    {esp} {/*ignore*/}
    {espacio}           {/*Ignore*/}
}
{esp} {/*ignore*/}
{espacio}           {/*Ignore*/}
[^]                           { return new Symbol(sym.ERRORLEX,yycolumn,yyline,yytext()); }