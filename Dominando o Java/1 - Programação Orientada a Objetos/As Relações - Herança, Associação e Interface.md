# Programação Orientada a Objetos
## Herança
*"É o relacionamento entre classes em que uma classe chamada de subclasse (classe filha, classe derivada) é uma extensão, um subtipo, de outra classe chamada superclasse (classe pai, classe mãe, classe base). Devido a isto, a subclasse consegue reaproveitar os atributos e métodos dela. Além dos que venham a ser herdados, a subclasse pode definir seus próprios membros."*
  
- O reuso na herança é uma consequência de seu uso e não seu objetivo.

Códigos:  
- Java
```
class A extends B {
	...
}
```
- C#
```
class A : B {
	...
}
```
- Python
```
class A(B) :
	...
```

### Tipos de Herança
SIMPLES    
- A classe filha tem só uma classe mãe
MÚLTIPLAS  
- A classe filha tem uma ou mais classes mães
- Existe em Python e C++

### Upcast e Downcast
**Upcast**   
- Implícito 
- Java `A a = new B ();`
- C# `A a = new B ();`
- Python - não tem

**Downcast**  
- Explícito
- Java `B a = (B)new A ();`
- C# `B a = (B)new A ();`
- Python - não tem

### Polimorfismo x Sobrescrita

- POLIMORFISMO - *"A mesma ação, se comportando diferente."*
- SOBRESCRITA - *"A mesma ação, podendo se comportar diferente"*

## Associação
*"Possibilita um relacionamento entre classes/objetos, no qual estes possam pedir ajuda a outras classes/objetos e representar de forma completa o conceito ao qual se destinam. Neste tipo de relacionamento, as classes e os objetos interagem entre si para atingir seus objetivos."*  

- Mais flexível que a Herança, permite alterações dentro do programa.
### Tipos
- Estrutural
	- Composição - "Com Parte Todo" (Pessoa e Endereço - o segundo depende do primeiro para existir)
	- Agregação - "Sem Parte Todo" (Disciplina e Aluno - um pode existir sem o outro)
- Comportamental
	- Dependência - "Depende de" (Método usa um objeto e este por si só depende do método)

## Interface
*"Define um contrato que deve ser seguido pela classe que a implementa. Quando uma classe implementa uma interface, ela se compromete a realizar todos os comportamentos que a interface disponibiliza."*

Códigos:  
- Java
```
interface A {
	...
}

class B implements A {
	...
}
```
- C#
```
interface A {
	...
}

class B : A {
	...
}
```
- Python - não tem o conceito

# Agradecimentos

[Professor Thiago Leite](https://www.linkedin.com/in/thiago-leite-e-carvalho-1b337b127/)