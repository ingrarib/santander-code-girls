package com.dio;

/* Exercício AULA 4 de Variáveis, Tipo de Dado e Operadores aritméticos */

public class Casting {

    public static void main(String[] args) {

        byte b1;
        short s1 = 1000;
        b1 = (byte) s1; // DOWNCAST, ocasionará perda de dados

        long l1;
        int i1 = 10;
        l1 = i1; // UPCAST

        int i2;
        long l2 = 1000000000000000000L;
        i2 = (int) l2; // DOWNCAST, ocasionará perda de dados

        int i3;
        long l3 = 10000L;
        i3 = (int) l3; // DOWNCAST, NÃO ocasionará perda de dados

        double d1;
        float f1 = 10.5f;
        d1 = f1; // UPCAST

        float f2;
        float f3;
        double d2 = 10000.58d;
        f2 = (float) d2; // DOWNCAST, NÃO ocasionará perda de dados
        double d3 = 10000.58888888888888888888888888888888888888888888888888888888888888888888888d;
        f3 = (float) d3; // DOWNCAST, ocasionará perda de dados

        int i4;
        float f4 = 11.5697f;
        i4 = (int) f4; // DOWNCAST, ocasionará perda de dados, perda da parte fracionada

        System.out.println("b1: " + b1);
        System.out.println("l1: " + l1);
        System.out.println("i2: " + i2);
        System.out.println("i3: " + i3);
        System.out.println("d1: " + d1);
        System.out.println("f2: " + f2);
        System.out.println("f3: " + f3);
        System.out.println("i4: " + i4);

        b1 = (byte) d3; // Valor de variável de maior armazenamento para o menor de todos, ainda é possível, com perda de dados

        System.out.println("b1: " + b1);



    }

}
