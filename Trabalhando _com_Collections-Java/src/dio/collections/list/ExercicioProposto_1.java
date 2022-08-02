package dio.collections.list;

//bibliotecas
import java.util.List;
import java.util.Scanner;

/*Faça um programa que receba a temperatura média os 6 primeiros meses do ano e armazene-as em uma lista.

Após isto, calcule a média semestral das temperaturas e mostre todas as temperaturas acima desta média,
e em que mês elas ocorreram (mostrar o mês por extenso: 1 – Janeiro, 2 – Fevereiro e etc).
*/
public class ExercicioProposto_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Double> temperaturas = new ArraysList<>();

        //Adicionando as temperaturas
        int count =0;
        while(count != 6){
            System.out.println("=> Digite a temperatura °C: ");
            double temp = scan.nextDouble();
            temperaturas.add(temp);
            count++;
        }
        //exibindo
        System.out.println("====================");
    }
}
