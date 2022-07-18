# Java Streams
## Classe Anônima
A classe anônima em Java é uma classe que não recebeu um nome e é tanto declarado como instanciado em uma única instrução. Você deve considerar o uso de uma classe anônima sempre que você precisa para criar uma classe que será instanciado apenas uma vez.

## Functional Interface
Qualquer interface com um **SAM** (Single Abstract Method) é uma interface funcional e sua implementação pode ser tratada como expressões lambda.
- Comparator
- Consumer
- Function
- Predicate

### Lambda
- Função sem declaração, não é necessário colocar um nome, um tipo de retorno e o modificador de acesso.
- Os métodos são declarados no mesmo lugar em que será usado.
- As funções lambda em Java tem a sintaxe definida como (argumento) -> (corpo).

## Reference Method
- Novo recurso do Java 8 que permite fazer refêrencia a um método ou construtor de uma classe (de forma funcional) e assim indicar que ele deve ser utilizado num ponto específico do código.
- Deixa o código mais simples e legível
- Para utilizá-lo, basta informar uma classe ou referência seguida do símbolo "::" e o nome do método sem os parênteses no final
- É uma forma de simplificar o Lambda que por sua vez é uma forma de simplificar uma Classe Anônima

## Stream API
- Segue os princípios da programação funcional
- Proporciona uma forma diferente de lidar com conjuntos de elementos, oferecendo ao desenvolvedor uma maneira simples e concisa de escrever códigos
- Maior facilidade de manutenção e paralelização sem efeitos indesejados em tempo de execução

## Agradecimentos

[Professora Camila Cavalcante](https://www.linkedin.com/in/cami-la/)