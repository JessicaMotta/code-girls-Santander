package br.com.dio.metodos;

public class novoQuadrilatero {

    public static double area(double lado) {
        return lado*lado;
    }

    public static double area(double lado1, double lado2) {
        return lado1 * lado2;
    }

    public static double area(double baseMaior, double baseMenor, double altura) {

        return ((baseMaior+baseMenor)*altura)/2;

    }

    public static void xpto() {
        System.out.println("Antes");
        return;
    }

    /* erro de compilação: pois devia ser double
    public static long abc() {
        return 1.6;
    }*/

}
