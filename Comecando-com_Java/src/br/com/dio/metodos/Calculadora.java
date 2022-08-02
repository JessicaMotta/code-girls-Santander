package br.com.dio.metodos;

//Exercitado:
//1.calcular as 4 operações básicas. sempre dois valores devem ser passados.
public class Calculadora {

    //SOMANDO
    public static void soma(double numero1, double numero2) {

        double resultado = numero1 + numero2;

        System.out.println("A soma de "+numero1+ " + "+numero2+ " = "+resultado);
    }
    //SUBTRAINDO
    public static void subtracao(double numero1, double numero2) {

        double resultado = numero1 - numero2;

        System.out.println("A subtração de "+numero1+ " + "+numero2+ " = "+resultado);
    }
    //MULTIPLICANDO
    public static void multiplicacao(double numero1, double numero2) {

        double resultado = numero1 * numero2;

        System.out.println("A multiplicação de "+numero1+ " + "+numero2+ " = "+resultado);
    }
    //DIVIDINDO
    public static void divisao(double numero1, double numero2) {

        double resultado = numero1 / numero2;

        System.out.println("A divisão de "+numero1+ " + "+numero2+ " = "+resultado);
    }
}
