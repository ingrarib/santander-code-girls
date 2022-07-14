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

#### Exemplo

```
public class Main
	static void myMethod () {
		// code to be executed
}
```
- **myMethod()** é o nome do método.
- **static** significa que o método pertence à classe Main e não um objeto da classe Main.
- **void** significa que este método não tem um valor de retorno.

### Utilização

Passa-se uma mensagem através de uma classe ou objeto.

`nome_da_classe.nome_do_metodo()`  
`nome_do_objeto.nome_do_metodo()`

### Particularidades
- **Assinatura:** é a forma de identificar unicamente o método 
    - Ass = nome + parâmetros
- **Construtor e Destrutor:** são métodos especiais usados na Orientação a Objetos.
- **Mensagem:** é o ato de solicitar ao método que o mesmo execute. Esta pode ser direcionada a um objeto ou uma classe.
- **Passagem de parâmetros:**
    - Por valor (cópia)
    - Por referência (endereço)

### Boas Práticas

- Nomes devem ser descritivos, mas curtos.
- Notação camelo
- Deve possui entre 80 e 120 linhas
- Evite lista de parâmetros longas
- Visibilidades adequadas

## Sobrecargas

*"É a capacidade de definir métodos para diferentes contextos, mas preservando seu nome"*

### Criação

- Alterar a assinatura do método
    - Ass = nome + parâmetros

**Mudou a lista de parâmetros e manteve-se o nome do Método, foi criado uma Sobrecarga!!**

#### Exemplos    
```
converterParaInteiro(float f);
converterParaInteiro(double d);
converterParaInteiro(String s);
converterParaInteiro(float f, RoundType rd);
converterParaInteiro();
```

### Sobrecarga x Sobrescrita
 
A sobrecarga é criada quando se mantém o nome de um método e muda-se seus parâmetros.  

Já a sobrescrita está relacionada a **Programação Orientada à Objetos**, para podermos sobrescrever o método precisamos também ter o conhecimento sobre herança que também está relacionada a **Programação Orientada à Objetos**.

## Retornos (_return_)

"Retorno é uma instrução de interrupção, assim como o _break_ e o _continue_, porém estes estão mais ligados a estruturas de laços de repetição e o _return_ está muito atrelado à um método!"*

### Funcionamento

O método executa seu retorno quando:
- Completa todas as instruções internas
- Chega a uma declaração explicita de retorno (_return_)
- Lança uma exceção

### Considerações

- O tipo de retorno do método é definido na sua criação e pode ser um tipo primitivo ou objeto;
- O tipo de dado do _return_ deve ser compatível com o do método;
- Se o método for sem retorno (void), pode ou não ter um "return" para encerrar sua execução.

#### Exemplos
```
public String getMensagem(){
    return "Olá!"
}

public double getJuros(){
    return 2.36;
} 

public int getParcelas(){
    return 1.36f;
} // erro de compilação: está retornando um float(f) quando a variável declarada é um inteiro(int).

public void setIdade(){
    return 10;
} // erro: void não pode retornar nenhum valor.

public void executar(){
    ...
    return;
    ...
}
```

# Agradecimentos

[Professor Thiago Leite](https://www.linkedin.com/in/thiago-leite-e-carvalho-1b337b127/)

# Referências

[Métodos Java - w3schools](https://www.w3schools.com/java/java_methods.asp)

# Links Úteis

[Class PrintStream](https://docs.oracle.com/javase/7/docs/api/java/io/PrintStream.html)