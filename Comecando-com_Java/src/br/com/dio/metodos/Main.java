package br.com.dio.metodos;

public class Main {

    public static void main(String[] args) {

        //Calculadora
        System.out.println("Exericio Calculadora");
        Calculadora.soma(3,6); //chamando o metodo a partir de uma classe exercicio1
        Calculadora.subtracao(9, 1.8);
        Calculadora.multiplicacao(7,8);
        Calculadora.divisao(5,2.5);

        //Mensagem
        System.out.println("\nExercicío Saudações");
        Mensagem.obterMensagem(9);
        Mensagem.obterMensagem(14);
        Mensagem.obterMensagem(1);

        //Emprestimo
        System.out.println("\nExercicío emprestimo");
        Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(1000, Emprestimo.getTresParcelas());
        Emprestimo.calcular(1000, 5);

    }
}
