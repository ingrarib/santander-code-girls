package com.dio;

/* Exercício AULA 1 de Variáveis, Tipo de Dado e Operadores aritméticos */

public class Variáveis {

    public static void main(String[] args) {

        int i;
        // int i; erro: já foi definida uma variável com mesmo nome
        int I;
       // int 1a; erro: não pode começar com números
        int _1a; // não é erro, mas não é uma boa prática
        int $aq; // mesmo caso do anterior

        i = 5;
        I = 10;
        _1a = 20;
        $aq = 7;

        final int j = 10; // j sempre valerá 10, é constante (final)
        // j = 15; erro: já foi atribuído um valor constante a j, não pode alterar.
        int asrn24678md; // válido, mas não usual
        // int asrn246 78md; erro: não é permitido espaço
        int asrn2$4678_md = 10; // válido, mas não usual
        // int asrn2$46%78_md = 10; erro: % é proibido

        asrn24678md = 100;
        asrn2$4678_md = 10;

        int quantidadeProduto = 50; // notação camelo, está correto, boas práticas
        int QuantidadeProduto; // não é um erro, mas não usual
        final int NUMERO_TENTATIVAS = 5; // exceção do underline, está correto, notação para constantes
        final int numeroTentativas = 5; // não é um erro, porém não é uma boa prática
        int QUANTIDADE_OPCOES = 25; // mesmo caso de cima
        int qtdProd; // pouca expressividade

        System.out.println(i);
        System.out.println(I);
        System.out.println(_1a);
        System.out.println($aq);

        System.out.println(j);
        System.out.println(asrn24678md);
        System.out.println(asrn2$4678_md);

        System.out.println(quantidadeProduto);
        System.out.println(NUMERO_TENTATIVAS);
        System.out.println(QUANTIDADE_OPCOES);



    }

}
