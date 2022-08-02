Metodos

-> Conceituação: deve ser criados dentro de uma classe, é executado quando é feita uma requisição(mensagem)

-> Padrão de definição: <?visibilidade?><?tipo?><?modificador?> retorno nome (<?parametros?>) <?exceções?> corpo

*o que está entre interrogações é opcional 

=
POO:
visibilidade: public protected ou private;
tipo: concreto ou abstrato;
modificador: static ou final;

retorno: tipo de dado ou void(vazio, não retorna nada);
nome: nome que é fornecido ao método;
parametro: parametros que pode receber;
exceção: exceções que pode lançar; 
corpo: código que possui ou vazio;


=
Ex: public static R N(P) {...}

assinatura do método: ass= nome + parâmetros.


=
Sobrecarga 

-> Conceito: o mesmo metodo para diferentes contextos, se comporta de forma difernete perante a uma necessidade.(mudando a lista de parametros)

sobrecarga: mantem o nome muda a lista de parametreos
sobescrita: voltado para OO

=
Retorno 
-> funcionamento: completa todas suas intruções internas, chega a uma declaração explicita de retorno e lança uma exceção

Exemplo: public String getMensagem(){
return "Olá"; 
}

-> slide do curso:https://docs.google.com/presentation/d/1InCKAqx_Vocw9BxN95JTtcDpPnredEOa/edit#slide=id.p2

====================================================================
-> Lógica Condicional e Controle de Fluxos em Java
Operadores Relacionais 

Similaridade: igualdade(==), diferente(!=)
Tamanho: maior(>), maior igual(>=), menor(<), menor igual(<=)
Atribuição: atribuir um valor a uma va´riavel (Ex: int i = 10;)

Observação: tipos de dados diferentes não é possivel realizar comparação

=
-> Operadores Logicos

conjução: operações lógicas que só é verdadeira quando ambos os operadores ou expressões envolvidas são verdade (tabela verdade). Ex: true && true = true
simbologia:&& (and - e)

disjunção: operação que só é falsa quando ambos os operandos ou expressões envolvidos são falsos. Ex: fase || false = false
simbologia: || (or - ou)

disjunção exclusiva: operações que só é verdade quando ambos os operadores são opostos. 
ex: false ^ true = true
simbologia: ^

negação: operação que inverte o valor lógico de um operando ou expressão. simbologia: !

Boas práticas
1.criar variaveis auxiliares para guardar resultados.

=
-> Controle de Fluxo

são estruturas que tem a capacidade de diecionar o fluxo de execução do código

Tipos: 

Decisão: if, if-else, if-else-if e operador ternário
Repetidor: for, while , do while
Interrupção: break, continue e return

if > else if... > else

Decisão operador ternário
Ex: ligado ? desligar : ligar;
obs: recomendado não utilizar

Decisão switch
Ex: switch(olhos){
	case "azuis";
	break
	
	case"verdes";
	break;
	
	case"castanhos";
	break;
	
	default:
	break;
}

Boas praticas:
1. switch é valor exatos, if expressões booleanas.
2. evitar muitos ifs aninhados

=
-> Blocos

é um grupo de 0 ou mais códigos quais trabalham em conjunto para execitar uma operação 

Tipos
Locais: dentro de métodos
Estáticos: dentro de classes
Instância: dentro de classes

Exemplo criação: { ... }





