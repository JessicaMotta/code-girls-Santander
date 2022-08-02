package br.com.dio.metodos;

public class Main3 {

    public static void main(String[] args) {

        //retornos

        double areaQuadrado = novoQuadrilatero.area(3);
        System.out.println("-> Área do quadrado: "+areaQuadrado);

        double areaRetangulo= novoQuadrilatero.area(5,5);
        System.out.println("-> Área do Retângulo: "+areaRetangulo);

        double areaTrapezio = novoQuadrilatero.area(7,8,9);
        System.out.println("-> Área do Trapezio: "+areaTrapezio);

    }
}
