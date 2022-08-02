package br.com.dio.loopsArrays;
/*
Crie um vetor de 6 números inteiros
e mostre-os na ordem inversa.
*/
public class Ex1array_Ordeminversa {
    public static void main(String[] args) {

        //declarando o tipo de dados, nome e valores do vetor
        int[] vetor = {-5, -6, 15, 50, 8, 4};


//       System.out.println(vetor.length);

        System.out.print("Vetor Original: ");
        int count =0;
        while(count < (vetor.length )){
            System.out.print(vetor[count] + " "); //imprima o valor do elemento do vetor na posição indicada pelo contador.
            count++; //diminua o valor 1 do contador a cada loop
        }

        System.out.println("\n--------------"); //separar os vetores

        System.out.print("Vetor Ordem inversa: "); //Frase ilustrativa

        //loop for-each
        for (int i = (vetor.length-1); i >= 0; i--){ //para cada elemento dentro do vetor
            System.out.print(vetor[i] + " "); //imprima o elemento
        }
    }
}
