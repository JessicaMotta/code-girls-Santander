### ✨ Programação Orientada a Objetos ✨

_Professor: [Thiago Leite](https://www.linkedin.com/in/thiago-leite-e-carvalho-1b337b127/)_

**[Slides da Aula](https://docs.google.com/presentation/d/1k5syUGWVoY8yJ2cDLHwhrR0kDBUUG5Ay/edit#slide=id.p2)**



> Definição: *"A Orientação a Objetos é um paradigma de análise, projeto e programação de sistemas de software baseado na composição e interação entre diversas unidades de software chamadas de objetos."*



### PE vs POO

- Paradigma Estruturado

  - Tem uma representação mais simplista
  - Foca em operações (funções) e dados
  - "Como fazer"

- Paradigma Orientado a Objeto

  - Tem uma representação mais realista
  - Foca na modelagem de entidades e nas interações entre elas
  - "O que fazer"

  **Vantagens:**

  - Melhor coesão - responsabilidades bem definidas
  - Melhor acoplamento - flexíveis
  - Diminuição do Gap semântico - maior aproximação do mundo real para o mundo computacional
  - Coletor de lixo - liberam espaço automaticamente.

### Fundamentos - 3 Pilares

> **Abstração**: "processo pelo qual se isolam características de um objeto, considerando os que tenham em comum certos grupos de objetos".
>
> **Reuso**: "capacidade de criar novas unidades de código a partir de outras já existentes".
>
> **Encapsulamento**: "capacidade de esconder complexidades e proteger dados".

### A estrutura:

### Classe

> Definição: *"É uma estrutura que abstrai um conjunto de objetos com características similares. "molde" de conceito do mundo real. Ex: Bola, carro, viagem, computador, venda, comprador* 

***Como criar/identificar classes:***

- substantivos; (do mundo real)
- nomes significativos; (Ex: nas escolas, pessoas são alunos)
- contextos devem ser considerados;

Código:

| Java             | C#              | Python            |
| ---------------- | --------------- | ----------------- |
| class Carro{...} | clas Carro{...} | class Carro: pass |

### Atributo

> Definição: *"É o elemento de uma classe responsável por definir sua estrutura de dados. O conjunto destes será responsável por representar suas características e fará parte dos objetos criados a partir da classe."*

Ex: bola = diâmetro, venda = valor, carro = cor, viagem = distancia, computador = quantidade de memoria.

- **Atributo x Variável**
  A: O que é próprio e peculiar a alguém ou a alguma coisa.
  V: Sujeito a variações ou mudanças; que pode variar; inconstante, instável.

***Como criar/identificar atributos:***

- substantivos e adjetivos;
- nomes significativos;
- contexto deve ser considerado;
- abstração;
- tipos adequados;

Código:

| Java                       | C#                       | Python                  |
| :------------------------- | ------------------------ | ----------------------- |
| class Carro{ int portas; } | clas Carro{int portas; } | class Carro: portas = 0 |



### Método 

> Definição: *"É uma porção de código (sub-rotina) que é disponibilizada por uma classe. Este é executado quando é feita uma requisição a ele. São responsáveis por definir e realizar um determinado comportamento."*



Criação Java e C#:

- Visibilidade;
- Retorno;
- Nome;
- Parâmetro;

Criação Python:

- def;
- Nome;
- Parâmetros;

***Como criar/identificar métodos:***

- Verbos;
- nomes significativos; 
- contextos devem ser considerados;

| Java                        | C#                         | Python                   |
| :-------------------------- | -------------------------- | ------------------------ |
| class Carro{ void frear() { | clas Carro{ void frear() { | class Carro: def frear() |
| ... } }                     | ... } }                    |                          |

### Métodos especiais

- Construtor - cria objetos a partir das classes
  - Constrói objetos a partir das classes. Obrigatório ter o mesmo nome da classe, prover caso necessário valores iniciais para os atributos
- Destrutor 
  - auxilia na destruição do objeto, libera possiveis recursos 

### Sobrecarga

Muda a assinatura de acordo com a necessidade (assinatura: nome + parâmetros)

### Objeto

> Definição: *"Um objeto é a representação de um conceito/entidade do mundo real, que pode ser física (bola, carro, árvore,...) ou conceitual (viagem, estoque, compra,...) e posuui um significado bem definido para um determinado software. Para esse conceito/entidade, deve ser definida inicialmente uma classe a partir da qual posteriormente serão instanciados objetos distintos."*

* As classes são moldes estáticos para a criação de um objeto, o objeto que executa e faz acontecer.

##### Criação:

| Java                       | C#                         | Python          |
| :------------------------- | -------------------------- | --------------- |
| Carro carro = new Carro(); | Carro carro = new Carro(); | carro = Carro() |

### Mensagem

> Definição: *"É o processo de ativação de um método de um objeto. Isto ocorre quando uma requisição (chamada) a esse método é realizada, assim disparando a execução de seu comportamento descrito por sua classe. Pode também ser direcionada diretamente à classe, caso a requisição seja a um método estático."*

##### Criação:

| Java                           | C#                             | Python          |
| :----------------------------- | ------------------------------ | --------------- |
| Carro carro = new Carro();     | Carro carro = new Carro();     | carro = Carro() |
| carro.<metodo>;carro.<metodo>; | carro.<metodo>;carro.<metodo>; | carro<metodo>   |
| carro.<metodo>;carro.<metodo>; | carro.<metodo>;carro.<metodo>; | Carro<metodo>   |

### Herança

> *Definição: "É o relacionamento entre classes em que uma classe chamada de subclasse (classe filha, classe derivada) é uma extensão, um subtipo, de outra classe chamada superclasse (classe pai, classe mãe, classe base). Devido a isto, a subclasse consegue reaproveitar os atributos e métodos dela. Além dos que venham a ser herdados, a subclasse pode definir seus próprios membros."*

#### Criação:

| Java                      | C#                  | Python          |
| :------------------------ | ------------------- | --------------- |
| class A extends B { ... } | class A : B { ... } | class A(B): ... |

### Tipos de Heranças

- Simples
  - A classe filha tem so uma classe mãe. Ex: gerente, vendedor e faxineiro -> funcionários
- Múltiplas
  - A classe filha tem uma ou mais classe mãe. Ex: um estagiário ele é o subtipo de um estudante e um funcionário

Linguagens com herança múltiplas: 

- Java 🚫
- C# 🚫
- Python
- C++

### Upcast e Downcast

#### Upcast

- Subir a hierarquia

- Podemos entender o upcasting como a **atribuição de objeto de uma classe filha para uma referência de uma classe base (classe mãe)** 

- Implícito

#### Criação:

| Java           | C#             | Python |
| :------------- | -------------- | ------ |
| A a = new B(); | A a = new B(); | 🚫      |

#### Downcast

- Descer a hierarquia
- explicito
- Aconselhado não utilizar

| Java               | C#                 | Python |
| :----------------- | ------------------ | ------ |
| B a = (B) new A(); | B a = (B) new A(); | 🚫      |

### Polimorfismo x Sobrescrita

- POLIMORFISMO - *"A mesma ação(metodo), se comportando diferente."*
  - Exemplo: um pagamento irá ser processador de formas diferentes se for por boleto, pix, credito e debito
- SOBRESCRITA - *"A mesma ação, podendo se comportar diferente"*
  - Exemplo: exibir salario de uma conta, a conta poupança será exibido o saldo + o rendimento

### Associação

> Definição: *"Possibilita um relacionamento entre classes/objetos, no qual estes possam pedir ajuda a outras classes/objetos e representar de forma completa o conceito ao qual se destinam. Neste tipo de relacionamento, as classes e os objetos interagem entre si para atingir seus objetivos."*

- Mais flexível que a Herança, permite alterações dentro do programa.

#### Tipos:

- Estrutural

  - Composição - "Com Parte Todo" (Pessoa e Endereço - o segundo depende do primeiro para existir)
  - Agregação - "Sem Parte Todo" (Disciplina e Aluno - um pode existir sem o outro)

- Comportamental

  - Dependência - "Depende de" (Método usa um objeto e este por si só depende do método)

  

### Interface

> Definição: *"Define um contrato que deve ser seguido pela classe que a implementa. Quando uma classe implementa uma interface, ela se compromete a realizar todos os comportamentos que a interface disponibiliza."*

Código:

| Java                        | C#                           | Python |
| :-------------------------- | ---------------------------- | ------ |
| interface A { ... }         | interface A {...}            | 🚫      |
| class B implements A{ ... } | class B implements A { ... } | 🚫      |

### Pacotes

> *Definição: "São uma organização física ou lógica criada para separar classes com responsabilidades distintas. Com isso, espera-se que a aplicação fique mais organizadae seja possível separar classes de finalidadese representatividades diferentes."*

Código:

| Java          | C#                | Python                |
| :------------ | ----------------- | --------------------- |
| package ... ; | namespace { ... } | __ _init_ __.py(2. x) |
| import ... ;  | using ... ;       | from ... import ...   |

### Visibilidades

> *Definição: "Um modificador de acesso tem como finalidade determinar atéque ponto uma classe, atributo ou método pode ser usado. Autilização de modificadores de acesso é fundamental para ouso efetivo da Orientação a Objetos. Algumas boas práticas econceitos só são atingidos com o uso corretos deles."*

- Tipos:

  - Private - Só dentro da classe

    Java:    																			c#:

    **private	**																	**private**
    **private int** i;**private void** Do();								**private int** i;**private void** do();

    <hr>

  - Protected - Dentro da classe, mesmo pacote e subclasses Java 

    Java:																				C#

    **protected**																	**protected**
    **protected int** i;**protected void** Do();					**protected int** i;**protected void** do();

    <hr>

  - Public - Em qualquer lugar

    Java:																				C#

    **public**																			**public**
    **public int** i;**public void** Do();									**public int** i;**public void** do();

- Python não têm 
