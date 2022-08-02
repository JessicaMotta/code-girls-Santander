package br.com.dio.loopsArrays;

import java.util.Scanner;

public class Ex4_ParEImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); //Abertura da entrada de fluxo de dados através do teclado

        //variaveis
        int quantNumeros;
        int numero;
        int quantPares = 0, quantImpares = 0; //variáveis para guardar a quantidade dos números pares e ímpares


        System.out.println("Quantidade de números: ");//Peça um número
        quantNumeros = scan.nextInt(); //Entrada de dados, neste caso de um int.

        int count = 0; //controla o loop

        //loop
        do{ //primeiro, independente do que tem no while, faça:
            System.out.println("Número: "); //Peça um número
            numero = scan.nextInt(); //Entrada de dados, neste caso de um int.

            //se o resto da divisão do número por 2 (numero/2) for 0,
            if(numero % 2 == 0) quantPares++;
                //caso contrário, o número digitado é ímpar
            else quantImpares++; //adicione o valor 1 a variável quantImpar.

            count++;  //some o valor 1 ao contador até que invalide a condição do loop. (count < quantidadeDeNumeros)

        // Faça o loop caso o valor do contador seja menor que a quantidade de número
        } while(count < quantNumeros);

        //imprimindo a quantidade de números pares digtados e números ímpares digitados
        System.out.println("==== Resposta =====");
        System.out.println("quantidade par: "+quantPares);
        System.out.println("quantidade ímpar: "+quantImpares);

    }
}
