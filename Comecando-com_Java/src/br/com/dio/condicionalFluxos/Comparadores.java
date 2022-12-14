package br.com.dio.condicionalFluxos;

/* Exercício de exemplo da Aula 2 de Operadores Lógicos e Relacionais,
 Controle de Fluxos e Blocos.*/

public class Comparadores {
    public static void main(String[] args) {

        int i1 =10;
        int i2 = 20;
        float f1 = 4.5f;
        float f2 = 3.5f;
        double d1 = 59.6d;
        char c1 = 'x';
        char c2 = 'y';
        String s1 = "Fulano";
        String s2 ="Fulano";
        String s3 = "Cicrano";
        boolean b1 = true;
        boolean b2 = false;

        long l1 = 1597l;
        long l2 = 7876l;
        byte y1 = 1;
        short h1 =25;

        System.out.println("i1 == i2 "+(i1==i2));
        System.out.println("i1 != i2"+(i1!=i2));
        System.out.println("i1 > i2"+(i1 > i2));
        System.out.println("i1 <= i2"+(i1 <= i2));

        System.out.println("\nf1 == f2 "+(f1 == f2));
        System.out.println("f1 != f2 "+(f1 != f2));
        System.out.println("f1 >= f2 "+(f1 >= f2));
        System.out.println("f1 < f2"+(f1 < f2));

        System.out.println("\nc1 == c2"+(c1 == c2));
        System.out.println("c1 != c2"+(c1 != c2));
        System.out.println("c1 > c2"+(c1 > c2));//com char é possível comparar tamanhos, com String não
        System.out.println("c1 <= c2"+(c1 <= c2));

        System.out.println("\nb1 ==b2"+(b1 ==b2) );
        System.out.println("b1 != b2 "+(b1 != b2));
        /* não é uma operação válida para o tipo de dado booleano
        System.out.println(b1 > b2 );
        System.out.println(b1 <= i1 );*/

        System.out.println("\ni2 > f1 "+(i2 > f1));
        System.out.println("d1 == h1"+(d1 == h1));
        /* não é uma operação válida para o tipo de dado String
        System.out.println(s2 != c1);
        System.out.println(s3 != i1");*/

        System.out.println("\nl1 == i2"+(l1 == i2));
        System.out.println("l2 >= i2"+(l2 >= i2));
        System.out.println("y1 != h1 "+(y1 != h1));
    }
}
