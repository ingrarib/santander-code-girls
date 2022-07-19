# Programação Orientada a Objetos (POO)
## Definição 
*"A Orientação a Objetos é um paradigma de análise, projeto e programação de sistemas de software baseado na composição e interação entre diversas unidades de software chamadas de objetos."*

### FUNDAMENTOS
- **Abstração** - Processo pelo qual se isolam características de um objeto, considerando os que tenham em comum certos grupos de objetos.
- **Reuso** - Capacidade de criar novas unidades de código a partir de outras já existentes.
- **Encapsulamento** - Capacidade de esconder complexidades e proteger dados.

## PE vs POO
- Paradigma Estruturado 
	- Tem uma representação mais simplista
	- Foca em operações (funções) e dados
	- "Como fazer"
- Paradigma Orientado a Objeto 
	- Tem uma representação mais realista
	- Foca na modelagem de entidades e nas interações entre elas
	- "O que fazer"
	- Melhor coesão - responsabilidades bem definidas
	- Melhor acoplamento - flexíveis
	- Diminuição do Gap semântico 
	- Coletor de lixo - liberam espaço automaticamente

## A Estrutura
### Classe
*"É uma estrutura que abstrai um conjunto de objetos com características similares. Uma classe define o comportamento de seus objetos através de métodos e os estados possíveis destes objetos através de atributos. Em outros termos, uma classe descreve os serviços providos por seus objetos e quais informações eles podem armazenar."*

- Entidades do mundo real
- **Dicas** - substantivos, nomes significativos, contexto deve ser considerado

Códigos:
```Java
class Carro {
}
```
```C#
class Carro {
}
```
```Python
class Carro:
	pass
```
### Atributo
*"É o elemento de uma classe responsável por definir sua estrutura de dados. O conjunto destes será responsável por representar suas características e fará parte dos objetos criados a partir da classe."*

- **Atributo x Variável**  
A: O que é próprio e peculiar a alguém ou a alguma coisa.  
V: Sujeito a variações ou mudanças; que pode variar; inconstante, instável.

- **Dicas** - substantivos e adjetivos; nomes significativos; contexto deve ser considerado; abstração; tipos adequados.

Códigos:
```Java
class Carro {
	int portas;
}
```
```C#
class Carro {
	int portas;
}
```
```Python
class Carro:
	portas = 0
```

### Método
*"É uma porção de código (sub-rotina) que é disponibilizada por uma classe. Este é executado quando é feita uma requisição a ele. São responsáveis por definir e realizar um determinado comportamento."*

- **Dicas** - verbos; nomes significativos; contexto deve ser considerado.

- **Criação**  
Java e C#
- Visibilidade
- Retorno
- Nome
- Parâmetros

Python  
- *def*
- Nome
- Parâmetros

Códigos:
```Java
class Carro {
	void frear (){
	...
	}
}
```
```C#
class Carro {
	void frear (){
	...
	}
}
```
```Python
class Carro:
	def frear ()
```
#### Métodos especiais
- Construtor - cria objetos a partir das classes
- Destrutor - auxilia a destrução de um objeto (coletor de lixo)

[Mais sobre métodos Java](https://github.com/ingrarib/santander-code-girls/tree/main/Come%C3%A7ando%20a%20Programar%20em%20Java/2%20-%20Entendendo%20M%C3%A9todos%20Java)


### Objeto
*"Um objeto é a representação de um conceito/entidade do mundo real, que pode ser física (bola, carro, árvore,...) ou conceitual (viagem, estoque, compra,...) e posuui um significado bem definido para um determinado software. Para esse conceito/entidade, deve ser definida inicialmente uma classe a partir da qual posteriormente serão instanciados objetos distintos."*

- **Criação**   
Java `Carro carro = new Carro ();`  
C# `Carro carro = new Carro ();`  
Python `carro = Carro()`

### Mensagem
*"É o processo de ativação de um método de um objeto. Isto ocorre quando uma requisição (chamada) a esse método é realizada, assim disparando a execução de seu comportamento descrito por sua classe. Pode também ser direcionada diretamente à classe, caso a requisição seja a um método estático."*

Códigos:
```Java
Carro carro = new Carro ();
carro.<método>;

Carro.<método>;
```
```C#
Carro carro = new Carro ();
carro.<método>;

Carro.<método>;
```
```Python
carro = Carro ()
carro.<método>

Carro.<método>
```

# Agradecimentos

[Professor Thiago Leite](https://www.linkedin.com/in/thiago-leite-e-carvalho-1b337b127/)