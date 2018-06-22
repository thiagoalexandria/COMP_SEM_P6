# Construção de Compiladores
# Guia da Linguagem MiniC

### 1. Introdução	
Este guia descreve a linguagem de programação MiniC, que será usada como linguagem
fonte para o projeto de compilador da disciplina. MiniC é um subconjunto da linguagem
C, ou seja, todo programa MiniC é também um programa C, mas há muitas características
da linguagem C completa que não aparecem em MiniC. Por exemplo, existem poucos tipos
básicos, e não é possível escrever o programa usando mais de um arquivo fonte. Não
existem protótipos: cada função usada pela função main deve ser definida antes desta.
Aqui está descrita a estrutura léxica da linguagem. Ao final apresentamos um programa de
exemplo simples em MiniC.

### 2. Estrutura Léxica
A estrutura léxica da linguagem é simples. As classes léxicas são:
	• Palavras-chave
	• Identificadores
	• Literais Inteiro (int)
	• Literais de Ponto flutuante (double, float)
	• Literais string
	• Literais char
	• Operadores
	• Símbolos de Pontuação
	• ComentáriosPalavras-chave: Estas são palavras reservadas que não podem ser usadas como identificadores. 

As palavras-chave do MiniC são:
	• char
	• else
	• if
	• int
	• float
	• double
	• main
	• printf
	• printint
	• printstr
	• return
	• while
	• include

Identificadores: os identificadores seguem a mesma regra da linguagem C: podem começar com uma letra ou sublinhado (’_’); os demais caracteres podem ser letras,sublinhado ou dígitos.

Literais Inteiros: são literais inteiros, ou seja, cadeias de dígitos numéricos. Por exemplo, 1; 24; 4567, entre outros.

Literais de Ponto flutuante: são literais reais, como por exemplo, 2.55, 45.678, 0.75, entre outros.

Literais caracteres: seguem a regra da linguagem C, sendo compostos por um caractere envolto em aspas simples. O caractere pode ser uma das sequências de escape ‘\r’, ’\n’ ou ’\t’. Para representar uma barra invertida como caractere, deve-se usar ‘\\’.

Literais String: mesma regra da linguagem C: começam e terminam com um caractere de aspas duplas, e podem conter as sequências de escape \r, \n e \t. Para incluir uma barra invertida (\) na string, deve-se usar \\. Uma string representa um array de caracteres. Por exemplo: “\nHello World\n”.


Operadores: os operadores binários em MiniC são as quatro operações aritméticas (+, -, * e /), os operadores de comparação (==, !=, <, >, <= e >=) e os lógicos (&& e ||); há também o operador de atribuição (=). O único operador unário é o de negação lógica (!).

Símbolos de Pontuação: os símbolos de pontuação na linguagem MiniC são os tipos básicos encontrados na linguagem C, sendo eles : ; , ( ) { } . # & Comentários: seguem as mesmas regras da linguagem C: comentários até o final da linha começando com // ou comentários multilinha começando com /* e terminando com */. Comentários multilinha não podem ser aninhados.

### 3. Gramática
	
Um programa MiniC sempre deve estar contido em apenas um arquivo. É preciso ter pelo menos uma função, a função principal, chamada de main. Antes da função principal pode ser definido um número qualquer de outras funções, que poderão ser chamadas no main ou em outras funções. As estruturas de controle são apenas if para comandos condicionais e while para loops. Os tipos básicos são: inteiros (int), double (double), float (float) e caracteres (char). O único tipo composto é o array, que pode ter componentes int, float, double ou char. 

A gramática usa a notação N∗, onde N é um não-terminal, para denotar nenhuma, uma ou várias ocorrências de N. Os terminais em negrito são palavras chave. Para as expressões aritméticas, assume-se que os operadores têm precedência e associatividade padrão. Os operadores aritméticos têm maior precedência que os de comparação, e estes têm precedência maior do que os operadores lógicos. As funções printint e printstr imprimem um inteiro e uma string, respectivamente; são fáceis de escrever em C padrão usando printf. A gramática completa para a linguagem é apresentada a seguir.

	Programa -> DeclInclude* FuncaoPrincipal DeclFuncoes*

	DeclInclude -> #include<ID.h>

	DeclFuncoes -> Tipo ID (ListaArgumentos) {Comando* return Expressao;}
	
	FuncaoPrincipal -> int main() { Comando* return Literal Inteiro; }

	Tipo -> int | float | double | char

	Comando -> {Comando*} |
			 if ( ExpRel ) Comando else Comando |
			 if ( ExpRel ) Comando |
			 while ( ExpRel) Comando |
			 printf ( Expressao ); |
 			 printint ( Literal Inteiro ); |
			 printstr ( Literal String ); |
			 Tipo ID (, ID)*; |
			 Tipo (ID = Expressao) ( , ID = Expressao)*; |
			 ID = Expressao;

	ExpRel -> ExpRelAux OpRelacional ExpRelAux | !(ExpRel)

	ExpRelAux -> ID | Literal Inteiro | Literal Ponto Flutuante

	OpRelacional ->  > | < | == | >= | <= | !=

	ExprAritmetica -> ExprAritmetica + T | ExprAritmetica - T | T

	T -> T * F | T / F | F

	F -> (ExprAritmetica) | ID | Literal Inteiro | Literal Ponto Flutuante | ID (Parametros*)

	Expressao -> ExprAritmetica | Literal Char | Literal String

	Parametros -> Expressao

	Resto Parametros -> , Resto Parametros 
  
### 4. Ações Semânticas

  O objetivo desta última parte do projeto é implementar todas as ações semânticas que serão
executadas à medida que a análise sintática for executada. O objetivo das ações semânticas
é criar uma representação do programa lido na memória usando classes e objetos. Observe
o exemplo a seguir: 
    
    ProgramaMiniC ::= DeclIncludeOpt:includes FuncaoMain:funcaoMain
    DeclFuncoesOpt:declFuncoes {: RESULT = new ProgramaMiniC( includes, 
    funcaoMain, declFuncoes ); :};
    
  Um programa em MiniC é formado por zero ou várias instruções include, seguido
da declaração da função Main e por fim zero ou mais declarações de funções. Para
representar um ProgramaMiniC em memória a ação semântica cria um objeto de classe
ProgramaMiniC que recebe por parâmetros uma lista de declarações include, a função
  Main e uma lista de declarações de funções.
Esse procedimento deve ser repetido para todas as produções de forma que ao
executar o código da classe CompiladorMiniC, caso o programa de entrada esteja correto,
o compilador deve exibir na tela o mesmo código de entrada, com exceção dos comentários,
usando o trecho de código a seguir:

    Symbol symbol = parser.parse();
    ProgramaMiniC programaMiniC = (ProgramaMiniC) symbol.value;
    System.out.println( programaMiniC );


### 5. Informações Importantes
	
Data Entrega: : 22/06/2018 (via Unipê virtual)
	
Equipe: INDIVIDUAL
	
Ferramentas: JavaCUP e JFlex.
	
Ações Semânticas: As ações semânticas não serão necessárias neste 2o estágio.
	
Observação. Ao final do trabalho, cada aluno deverá fazer o upload do projeto completo, incluindo:
	a) Os arquivos de especificação (.flex) e (.cup).
	b) As classes do Analisador Léxico e Sintático gerados.
	c) As classes que geram o Analisador Léxico e o Analisador Sintático a partir do arquivo de especificação.
	d) A classe principal que utiliza o Analisar léxico e Sintático gerados passando m arquivo de teste como entrada.

### 6. Programa Teste

	#include <stdio.h>
	#include <stdlib.h>

	// Programa Teste Projeto Compiladores

	/*

	  *** Autor: Hilario Tomaz
  	-- Data: 23/03/2018
   
	*/

	int main() {
 
  	printint(fatorial(5));
  

	return 1;
  
	}

	int fatorial (int n){

	int res;
	char n = 'i';
	char i = '\n';

	if (n < 1)
	   res = 1;
	else
	   res = n * fatorial (n - 1);


	return res;
	}
