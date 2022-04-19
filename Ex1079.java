/*
Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir. Cada caso de teste consiste de 3
valores reais, cada um deles com uma casa decimal.
Apresente a média ponderada para cada um destes conjuntos de 3 valores, sendo que o primeiro valor tem peso 2,
 o segundo valor tem peso 3 e o terceiro valor tem peso 5.

Entrada
O arquivo de entrada contém um valor inteiro N na primeira linha. Cada N linha a seguir contém um caso de teste
com três valores com uma casa decimal cada valor.

Saída
Para cada caso de teste, imprima a média ponderada dos 3 valores, conforme exemplo abaixo.

Exemplo de Entrada	            Exemplo de Saída
3
6.5 4.3 6.2                     5.7
5.1 4.2 8.1                     6.3
8.0 9.0 10.0                    9.3




 */

import java.util.Locale;
import java.util.Scanner;

public class Ex1079 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();


        for (int i = 0; i < n; i++){
            double  nota1 = scanner.nextDouble();
            double  nota2 = scanner.nextDouble();
            double  nota3 = scanner.nextDouble();
            double media = ((2*nota1) + (3*nota2) + (5*nota3)) / 10;
            System.out.printf("%.1f%n",media);
        }

        scanner.close();
    }
}
