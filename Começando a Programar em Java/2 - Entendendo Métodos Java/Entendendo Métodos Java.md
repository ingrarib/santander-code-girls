# Métodos

*"É uma porção de código (sub-rotina) que é disponibilizada por uma classe. Este é executado quando é feita uma requisição a ele. São responsáveis por definir e realizar um determinado comportamento."*

## Criação

Padrão de definição:

> <visibilidade?><tipo?><modificador?> retorno nome (<parâmetros?>) <excecões?> corpo

- Retorno, nome , () e corpo são sempre obrigatórios

V: "public", "protected" ou "private"  
T: concreto ou abstrato  
M: "static" ou "final"  
R: tipo de dado ou "void"  
N: nome que é fornecido ao método  
P: parâmetros que pode receber  
E: exceções que pode lançar  
C: código que possui ou vazio  


>> Um método deve ser declarado dentro de uma classe. Ele é definido com o nome do método, seguido de parênteses (). Java fornece alguns métodos pré-definidos, como ***System.out.println()*** , mas você também pode criar seus próprios métodos para realizar determinadas ações.

### Exemplo

```
public class Main
	static void myMethod () {
		// code to be executed
}
```
- **myMethod()** é o nome do método.
- **static** significa que o método pertence à classe Main e não um objeto da classe Main.
- **void** significa que este método não tem um valor de retorno.

## Utilização

Passa-se uma mensagem através de uma classe ou objeto.

`nome_da_classe.nome_do_metodo()`  
`nome_do_objeto.nome_do_metodo()`

## Particularidades
- **Assinatura:** é a forma de identificar unicamente o método 
    - Ass = nome + parâmetros
- **Construtor e Destrutor:** são métodos especiais usados na Orientação a Objetos.
- **Mensagem:** é o ato de solicitar ao método que o mesmo execute. Esta pode ser direcionada a um objeto ou uma classe.
- **Passagem de parâmetros:**
    - Por valor (cópia)
    - Por referência (endereço)

## Boas Práticas

- Nomes devem ser descritivos, mas curtos.
- Notação camelo
- Deve possui entre 80 e 120 linhas
- Evite lista de parâmetros longas
- Visibilidades adequadas

## Agradecimentos

[Professor Thiago Leite](https://www.linkedin.com/in/thiago-leite-e-carvalho-1b337b127/)

## Referências

[Métodos Java - w3schools](https://www.w3schools.com/java/java_methods.asp)