package br.com.dio.exercitando;

//criar duas variaveis para cada tipo de dado apresentado
public class Ex2_tiposDeDados {
    public static void main(String[] args) {
        byte b1 = 10;
        byte b2 = 20;

        short s1 = 20000;
        //short s2 = 40000;

        //int i1 = -1000000000;
        int i2 = 28500;

        long l1 = 100000000000000000l; //l no final para declarar um numero long
        long l2 = 2004005000550000l;

        //float f1 = 4.5; não está sendo colocado o f no final
        float f2 = 10.68f;

        double d1 = 85.69;
        double d2 = 99.84d;

        char c1 = 'W';
        //char c2 = 'Tw';
        char c3 = '\u0057';

        String st1 = "Fulano";
        String st2 = "Ciclano";
        String st3 = "ag knsia %¨$mapsnpámá";

        //String dt1 = "14/09/2001"; não é o tipo de dado adequado

        boolean bo1 = true;
        boolean bo2 = false;

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(s1);
        System.out.println(i2);
        System.out.println(b1);
        System.out.println(l1);
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
