package br.com.dio.exercitando;

public class Ex1_variaveis {
    public static void main(String[] args) {
        int i;
        //int i; duas variaveis iguais
        int I;
        //int 1a; não podem iniciar com números
        int _1a; //permitido, mas deve ser evitado
        int $aq;

        //definiciando valor incial para as váriaveis
        i = 5;
        I = 10;
        _1a = 20;
        $aq = 7;

        final int j = 10; // j sempre terá o valor de 10 pois é constante
        //j = 15;
        int asrn24678md;
        //int asrn246 78md; espaços não são validos
        int asrn2$4678_md = 10;
        //int asrn246%78_md = 10;

        asrn24678md = 100;
        asrn2$4678_md = 10;

        //expressividade:
        int quantidadeProduto = 50; // primeira letra deve ser em minusculo
        //int QuantidadeProduto;
        final int NUMERO_TENTATIVAS = 5; //final deve ser tudo em caps
        //final int numeroTentativas; = 5;
        int QUANTIDADE_OPCOES = 25;
        //int qtdProd; não está sendo bem expressado

        //IMPRIMINDO AS INFORMAÇÕES
        System.out.println(i);
        System.out.println(I);
        System.out.println(_1a);
        System.out.println($aq);

        System.out.println(j);
        System.out.println(asrn24678md);
        System.out.println(asrn2$4678_md);

        System.out.println(quantidadeProduto);
        System.out.println(NUMERO_TENTATIVAS);
        System.out.println(QUANTIDADE_OPCOES);
    }
}
