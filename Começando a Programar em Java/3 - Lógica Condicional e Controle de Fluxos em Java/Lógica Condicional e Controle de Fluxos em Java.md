# Lógica Condicional e Controle de Fluxos em Java
## Operadores Relacionais

*"São símbolos especiais quais são capazes de realizar comparações entre determinados operandos e, em seguida, retornar um resultado"*

Tipos:

- Similidaridade: igual, diferente
- Tamanho: maior, maior igual, menor, menor igual

#### UTILIZAÇÃO

Similaridade

- **Igualdade:** determina se um operando é igual ao outro
    - **Simbologia:** ==
    
- **Diferença:** determina se um operando não é igual ao outro
    - **Simbologia:** !=

Tamanho (grandezas):

- **Maior:** determina se um operando é maior do que o outro
    - **Simbologia:** >
    
- **Maior igual:** determina se um operando é maior ou igual a outro
    - **Simbologia:**>=
    
- **Menor:** determina se um operando é menor do que o outro
    - **Simbologia:** <
    
- **Menor igual:** determina se um operando é menor ou igual a outro
    - **Simbologia:** <=

## Operadores Lógicos

*"São símbolos especiais quais são capazes de realizar comparações lógicas entre operadores lógicos ou expressões e, em seguida, retornar um resultado."*

Tipos:

- **Conjunção:** Operação lógica que só é verdadeira quando ambos os operandos ou expressões envolvidas são verdade.
    - **Simbologia:** &&
    - **Terminologia:** and/e
    
- **Disjunção:** Operação que só é falsa quando ambos os operandos ou expressões envolvidas são falsos.
    - **Simbologia:** | |
    - **Terminologia:** or/ou
    
- **Disjunção exclusiva:** Operação que só é verdade quando ambos os operandos ou expressões são opstos
    - **Simbologia:** ^
    - **Terminologia:** xor
    
- **Negação:** Operação que inverte o valor lógico de um operando ou expressão
    - **Simbologia:** !
    - **Terminologia:** inversão

##### Curiosidades
- Operadores bitwise: & e | 
    - bits
- Operadores shift: ~, >>, >>>, <<
    - inverte os bits do número ou mexe com os zeros a esquerda ou a direita do número
    
### Boas Práticas

- Crie variáveis auxiliares para guardar resultados intermediários

## Controle de Fluxo

*"São estruturas que tem a capacidade de direcionar o fluxo de execução do código"*    

Tipos:

- **Decisão: if, if-else, if-else-if, switch e operador ternário**
- Repetição: for, while, do while
- Interrupção: break, continue e return

### Decisão

*"Estrutura que avalia uma condição booleana ou variável para direcionar o fluxo da execução."*

- if = se
- switch = escolha
- operador ternário (evitar o uso)

```java
if (condição){
}

if (condição){
} else {
}

if (condição){
} else if (condição) {
} else {
}
```
```java
condição ? true : false; 

condição ? true : null;

ligado ? desligar : ligar;

emMovimento ? freia : null;

```
```java
switch (variável){
    case 1:
        break;
    case ...:
        break;
    default:
        break;
} // opções de variáveis: byte short, char
 // mais comuns de serem utilizados: int, Enum, String
```
### Boas Práticas

- Switch é para valores exatos e if para expressões booleanas
- Evitar usar o default do switch para "cases genéricos"
- Evitar o efeito "flecha" dos if's (visualmente ruim)
- Evitar muitos if's aninhados
- Usar a "Boa prática" da aula 2 para diminuir o tamanho do if


# Agradecimentos

[Professor Thiago Leite](https://www.linkedin.com/in/thiago-leite-e-carvalho-1b337b127/)