package dio.collections.list;

import java.util.*;

public class Exemplo_List {
    public static void main(String[] args) {
// Dada uma lista com 7 notas de um aluno [7, 8.5, 9.3, 5, 7, 0, 3.6], faça:

//      List notas = new ArrayList(); //antes do java 5
//      ArrayList<Double> notas = new ArrayList<>();
//      List<Double> notas = new ArrayList<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));

/*      List<Double> notas = Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6);
        notas.add(10d);
        System.out.println(notas);
*/
 /*     List<Double> notas = List.of(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6);
        notas.add(1d);
        notas.remove(5d);
        System.out.println(notas);
 */
        System.out.println("Crie uma lista e adicione as sete notas: ");

        List <Double> notas = new ArrayList<Double>(); //Generics(jdk 5) - Diamond Operator(jdk 7)
        notas.add(7.0);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5.0);
        notas.add(7.0);
        notas.add(0.0);
        notas.add(3.6);
        System.out.println(notas);

        System.out.println("Exiba a posição da nota 5.0: " + notas.indexOf(5d));

        System.out.println("Adicione na lista a nota 8.0 na posição 4: ");
        notas.add(4, 8d); //adicionando um novo valor
        System.out.println(notas);

        System.out.println("Substitua a nota 5.0 pela nota 6.0: ");
        notas.set(notas.indexOf(5d), 6.0); //substituindo
        System.out.println(notas);

        //verifica se há o objeto nota 5 (notas.contains)
        System.out.println("Confira se a nota 5.0 está na lista: " + notas.contains(5d));

        /*System.out.println("Exiba todas as notas na ordem em que foram informados: ");
        for (Double nota : notas) System.out.println(nota);*/

        // notas.get(2) = retorna a terceira nota (0, 1, 2 =>  3)
        System.out.println("Exiba a terceira nota adicionada: " + notas.get(2));
        System.out.println(notas.toString());

        // Collections.min = mostra o menor valor
        System.out.println("Exiba a menor nota: " + Collections.min(notas));

        // Collections.min = mostra o maior valor
        System.out.println("Exiba a maior nota: " + Collections.max(notas));

        //metodo interator interando os valores para realizar a soma dos mesmos
        Iterator <Double> iterator = notas.iterator();
        Double soma = 0d;
        while(iterator.hasNext()){ //verifica se apos o falor possui outro valor
            Double next = iterator.next();
            soma += next;
        }
        System.out.println("Exiba a soma dos valores: " + soma);

        //notas.size = calcula a quantidade de elementos dentro da lista
        System.out.println("Exiba a média das notas: " + (soma/notas.size()));

        System.out.println("Remova a nota 0: ");
        notas.remove(0d); //colocando: i :0  será removido a posição 0 e não o numero
        System.out.println(notas);

        System.out.println("Remova a nota da posição 0");
        notas.remove(0);
        System.out.println(notas);

        System.out.println("Remova as notas menores que 7 e exiba a lista: ");
        Iterator<Double> iterator1 = notas.iterator();
        //laço que verifica se há um proximo elemento, se houver e for menor que sete, remove
        while(iterator1.hasNext()) {
            Double next = iterator1.next();
            if(next < 7) iterator1.remove();
        }
        System.out.println(notas);

        /*System.out.println("Apague toda a lista");
        notas.clear();
        System.out.println(notas);
        */
        //notas.isEmpty: metodo boolen para verificar se há elemento ou não na lista
        System.out.println("Confira se a lista está vazia: " + notas.isEmpty());


    }
}
