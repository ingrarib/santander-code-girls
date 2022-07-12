package com.dio;

/* Exercício AULA 2 de Variáveis, Tipo de Dado e Operadores aritméticos */

public class TipodeDados {

    public static void main(String[] args) {

/* diferença por capacidade de armazenamento, do menor pro maior, todos números inteiros!! */

        byte b1 = 10;
        byte b2 = 20;

        short s1 = 20000;
        // short s2 = 40000; // Ultrapassa o limite máx que um short suporta

        // int i1 = -10000000000; // Ultrapassa o limite mín que um int suporta
        int i2 = 28500;

       // long l1 = 10000000000000000000L; // Ultrapassa o limite máx que um long suporta
        long l2 = 2004005000500055000L;

        // float f1 = 4.5; // float necessita de um F, senão será considerado um double
        float f2 = 10.68F;

        double d1 = 85.69; // ok
        double d2 = 99.04D;

        char c1 = 'W';
        // char c2 = 'Tw'; // char recebe somente um caractere
        char c3 = '\u0057'; // roda pois é um código de um caractere


        String st1 = "Fulano";
        String st2 = "Ciclano";
        String st3 = "ag dgk lad adm KADJDK &% 246215";

        String dt1 = "06/06/1994"; // não é uma boa prática

        boolean bo1 = true;
        boolean bo2 = false;

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(s1);
        System.out.println(i2);
        System.out.println(b1);
        System.out.println(l2);
        System.out.println(f2);
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(c1);
        System.out.println(c3);
        System.out.println(st1);
        System.out.println(st2);
        System.out.println(st3);
        System.out.println(bo1);
        System.out.println(bo2);





    }

}
