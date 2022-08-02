package br.dio.tratandoexceptions;

import javax.swing.*;

//fazer a divisão de dois valores inteiros
public class UncheckedException {
    public static void main(String[] args) {
        //criando um laço para se caso ocorra uma exception, solicite o numero novamente
        boolean continueLooping = true;
        do{
            String a = JOptionPane.showInputDialog("Numerador: ");
            String b = JOptionPane.showInputDialog("Denominador: ");

            //bloco try
            try{
                int resultado = dividir(Integer.parseInt(a), Integer.parseInt(b));
                System.out.println("Resultado: "+resultado);
                continueLooping = false;

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null,"Entrada Inválida, informe um numero inteiro" + e.getMessage());
                //e.printStackTrace();
            } catch (ArithmeticException e){
                JOptionPane.showMessageDialog(null,"Entrada inválida, informe um número maior que 0(zero) "+e.getMessage());
            }
            finally{
                System.out.println("Chegou no finally!");
            }

        }while(continueLooping);

        System.out.println("O código continua...");
    }

    public static int dividir (int a, int b) {return  a/b;}
}
