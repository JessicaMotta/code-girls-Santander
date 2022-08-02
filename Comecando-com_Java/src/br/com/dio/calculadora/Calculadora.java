package br.com.dio.calculadora;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        //entrada pelo teclado
        Scanner scanner = new Scanner(System.in);

        //declarando as variaveis
        int a, b;

        //chamando entrada as váriaveis
        System.out.println("Digite o primeiro valor: ");
        a = scanner.nextInt();

        System.out.println("Digite o segunda valor: ");
        b = scanner.nextInt();

        int somar = somar(a, b);
        int subtrair = subtrair(a, b);
        int multiplicar = multiplicar(a, b);
        double dividir = dividir(a, b);

        System.out.println("=====* Resultado *=====");
        System.out.println("-> Soma: "+somar);
        System.out.println("-> Subtração: "+subtrair);
        System.out.println("-> Multiplicação: "+multiplicar);
        System.out.println("-> Divisão: "+dividir);

    }
    public static int somar(int a, int b){
        return a+b;
    }
    public static int subtrair(int a, int b){
        return a-b;
    }
    public static int multiplicar(int a, int b){
        return a*b;
    }
    public static double dividir(double a, double b){
        return a/b;
    }
}
