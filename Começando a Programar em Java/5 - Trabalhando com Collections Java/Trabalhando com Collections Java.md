# Trabalhando com Collections Java
### DEFINIÇÃO

- É um objeto que agrupa múltiplos elementos (variáveis primitivas ou objetos) dentro de uma única unidade.
- Serve para armazenar e processar conjuntos de dados de forma eficiente.
- Antes do Java 2 (JDK 1.2), a implementação de coleções na linguagem Java incluía poucas classes e não tinha a organização de um framework.

### COMPOSIÇÃO

- **Interfaces:** É um contrato que quando assumido por uma classe deve ser implementado.
- **Implementações ou Classes:** São as materializações, a codificação das interfaces.
- **Algoritmos:** É uma sequência lógica, finita e definida de instruções que devem ser seguidas para resolver um problema.

## Coleções com Iterações Ordenadas: Listas
### java.util.List
- Permite elementos duplicados e garante ordem de inserção
- ArrayList deve ser usado onde mais operações de pesquisa são necessárias, e LinkedList deve ser usado onde mais operações de inserção e exclusão são necessárias

## Coleções Singulares: Set
### java.util.Set
- Não permite elementos duplicados
- Não possui índice

### HashSet
- Utiliza a implementação HashMap para armazenar os elementos
- Não mantêm a ordem dos elementos
- Melhor performance dos três
- Permite no máximo um elemnto null

### LinkedHashSet
- Utiliza a implementação LinkedHashMap para armazenar os elementos
- Mantêm a ordem de inserção dos elementos
- Performance mediana
- - Permite no máximo um elemnto null

### TreeSet
- Utiliza a implementação TreeMap para armazenar os elementos
- Mantêm por default a ordem natural dos elementos (numérica, alfabética)
- Pior performance dos três
- Não permite nenhum elemento null

## Coleções de Pares: Map
### java.util.Map
- O map não se estende da interface Collections, porém faz parte do framework Collections.
- O map é um objeto que nos permite armazenar múltiplos elementos (variáveis primitivas ou outros objetos).
- Cada elemento armazenado no map tem uma *key* e um *value* (chave e valor).
- As chaves devem ter valores únicos, não pode haver repetições de chaves, os valores podem se repetir.

### HashMap
- Big O notation: O(1)
- Itera os elementos aleatoriamente
- Permite chaves nulas 
- Implementa a interface **Map**
- Não tem sincronização, use ` Collections.synchronizedMap() `

### LinkedHashMap
- Big O notation: O(1)
- Itera os elementos de acordo com a ordem de inserção
- Permite chaves nulas
- Implementa a interface **Map**
- Não tem sincronização, use ` Collections.synchronizedMap() `

### TreeMap
- Big O notation: O(log n) - performance um pouco mais lenta
- Itera os elementos de acordo com a ordem natural das chaves
- Não permite chaves nulas
- Implementa as interface **Map**, **SortedMap** e **NavigableMap**
- Não tem sincronização, use ` Collections.synchronizedMap() `

## Referências

[Repositório no GitHub da Aula](https://github.com/cami-la/curso-dio-intro-collections)

[Slides Introdução](https://drive.google.com/file/d/1orwSu9ravNsw_SAHRaCMtd8Fvc3Qrsof/view)

[Slides Collections](https://drive.google.com/file/d/1kaAIEkaTt3q1rof6OFOb5XVgf25IDXf7/view)

[Slides List](https://drive.google.com/file/d/1tFsgADr5gYFEa4fQS0XzpK8i4ADqt95W/view)

[Slides Set](https://drive.google.com/file/d/1tS3Np0gVTBbfr9CyOjgevsjjNd083peY/view)

## Agradecimentos

[Professora Camila Cavalcante](https://www.linkedin.com/in/cami-la/)