package br.com.dio.metodos;

public class Quadrilatero {

    public static void area(double lado) {
        System.out.println("-> Área do quadrado: " + lado * lado);
    }

    public static void area(double lado1, double lado2) {
        System.out.println("-> A área do retângulo: " + lado1 * lado2);
    }

    //mantendo o nome do metodo "area" e altera a lista de parametros ()
    public static void area(double baseMaior, double baseMenor, double altura) {
        System.out.println("-> Área do trapézio: " + ((baseMaior + baseMenor) * altura) / 2);
    }

    public static void area(float diagonal1, float diagonal2) {
        System.out.println("-> Área do losango: " +(diagonal1 * diagonal2) / 2);
    }
}
