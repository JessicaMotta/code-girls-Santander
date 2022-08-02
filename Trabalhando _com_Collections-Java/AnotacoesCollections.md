## ➔✨ Trabalhando com Collections Java ✨

> **Visão geral: Collections Framework**

**[Git](https://github.com/cami-la/curso-dio-intro-collections)**

### **Persurso:**

1. Coleções com interações ordenadas;

2. Coleção com Singularidade: Set;

3. Coleção de pares: Map;

4. Stream API;

<hr>

> **Definição**

- Collection é um objeto que agrupa múltiplos elementos  (variaveis primitivas ou objetos) dentro de uma única unidade
- Serve para armazenar e processar conjunto de dadosde forma eficiente. 
- Antes do Java 2 (JDK 1.2), a implementação de coleções na linguagem Java incluía poucas classes e não tinha a organização de um framework.

> **Composição**

- **Interfaces:** É um contrato que quando assumido por uma classe deve ser implementado.
- **Implementações ou Classes:** São as materializações, a codificação das interfaces.
- **Algoritmos:** É uma sequência lógica, finita e definida de instruções que devem ser seguidas para resolver um problema.

> Exercício Proposto:
>
> - Estudar mais sobre composição das collections;
>   1. interfaces
>   2. implementações
>   3. algoritmos.
> - Analise da hierarquia do collection framework 

## Coleções com Iterações Ordenadas: Listas

**[Slides List](https://drive.google.com/file/d/1tFsgADr5gYFEa4fQS0XzpK8i4ADqt95W/view)**

####  java.util.List

- Permite elementos duplicados e garante ordem de inserção
- ArrayList deve ser usado onde mais operações de pesquisa são necessárias, e LinkedList deve ser usado onde mais operações de inserção e exclusão são necessárias

### Coleções com Singularidade: Set

**[Slides Set](https://drive.google.com/file/d/1tS3Np0gVTBbfr9CyOjgevsjjNd083peY/view)**

#### java.util.Set

- Não permite elementos duplicados

- Não possui índice (get set)

  

### HashSet

- Utiliza a implementação HashMap para armazenar os elementos
- Não mantêm a ordem dos elementos
- Melhor performance dos três
- Permite no máximo um elemnto null

### LinkedHashSet

- Utiliza a implementação LinkedHashMap para armazenar os elementos
- Mantêm a ordem de inserção dos elementos
- Performance mediana
- Permite no máximo um elemnto null

### TreeSet

- Utiliza a implementação TreeMap para armazenar os elementos
- Mantêm por default a ordem natural dos elementos (numérica, alfabética)
- Pior performance dos três
- Não permite nenhum elemento null

### Coleções de Pares: Map

#### java.util.Map

**[Slides Map](https://drive.google.com/file/d/1u02CyiElDJR4wmDQ8vq3aNYe10-iSVt-/view)**

- O map não se estende da interface Collections, porém faz parte do framework Collections.
- O map é um objeto que nos permite armazenar múltiplos elementos (variáveis primitivas ou outros objetos).
- Cada elemento armazenado no map tem uma *key* e um *value* (chave e valor).
- As chaves devem ter valores únicos, não pode haver repetições de chaves, os valores podem se repetir.

<hr>

### Java Steam API

**[Slides Atream API](https://drive.google.com/file/d/10-98R_8p6kS3fvsBm-Tkt3MHNIEuz3yy/view)**


#### Classe anonima:

> **Conceito: classe que nao recebeu um nome e é tanto declarado e instanciado em uma unica instrução,
> deve considerar o uso sempre que precisa criar uma claase que será instanciada apenas uma vez.**

#### functional interfce
> **Conceito: qlq interface com um SAM (SINGLE ABSTRACT METHOD) é uma interface funcional, e sua implementação
> pode ser tratada como expressão lambda**

- Comparator
- Consumer
- Function
- Predicate  


### Lambda

> **Conceito: função sem declaração, não é necessáriocolocar um nome, a ideia é que o metodo seja declarado
> no mesmo lugar em que será usado. as funções lambda em java tem a sintaxe definida como (argumento) -> (corpo)**

- Função sem declaração, não é necessário colocar um nome, um tipo de retorno e o modificador de acesso.
- Os métodos são declarados no mesmo lugar em que será usado.
- As funções lambda em Java tem a sintaxe definida como (argumento) -> (corpo).

#### Reference Method

- Novo recurso do Java 8 que permite fazer refêrencia a um método ou construtor de uma classe (de forma funcional) e assim indicar que ele deve ser utilizado num ponto específico do código.
- Deixa o código mais simples e legível
- Para utilizá-lo, basta informar uma classe ou referência seguida do símbolo "::" e o nome do método sem os parênteses no final
- É uma forma de simplificar o Lambda que por sua vez é uma forma de simplificar uma Classe Anônima

#### Stream API

- Segue os princípios da programação funcional
- Proporciona uma forma diferente de lidar com conjuntos de elementos, oferecendo ao desenvolvedor uma maneira simples e concisa de escrever códigos
- Maior facilidade de manutenção e paralelização sem efeitos indesejados em tempo de execução
