/*
Leia um valor inteiro. A seguir, calcule o menor número de notas possíveis (cédulas)
no qual o valor pode ser decomposto. As notas consideradas são de 100, 50, 20, 10, 5, 2 e 1.
A seguir mostre o valor lido e a relação de notas necessárias.

Entrada
O arquivo de entrada contém um valor inteiro N (0 < N < 1000000).

Saída
Imprima o valor lido e, em seguida, a quantidade mínima de notas de cada tipo necessárias, conforme o exemplo fornecido.
 Não esqueça de imprimir o fim de linha após cada linha,
 caso contrário seu programa apresentará a mensagem: “Presentation Error”.

Exemplo de Entrada	                                   Exemplo de Saída
576                                                    576
                                                       5 nota(s) de R$ 100,00
                                                       1 nota(s) de R$ 50,00
                                                       1 nota(s) de R$ 20,00
                                                       0 nota(s) de R$ 10,00
                                                       1 nota(s) de R$ 5,00
                                                       0 nota(s) de R$ 2,00
                                                       1 nota(s) de R$ 1,00



11257                                                  11257
                                                       112 nota(s) de R$ 100,00
                                                       1 nota(s) de R$ 50,00
                                                       0 nota(s) de R$ 20,00
                                                       0 nota(s) de R$ 10,00
                                                       1 nota(s) de R$ 5,00
                                                       1 nota(s) de R$ 2,00
                                                       0 nota(s) de R$ 1,00



503                                                    503
                                                       5 nota(s) de R$ 100,00
                                                       0 nota(s) de R$ 50,00
                                                       0 nota(s) de R$ 20,00
                                                       0 nota(s) de R$ 10,00
                                                       0 nota(s) de R$ 5,00
                                                       1 nota(s) de R$ 2,00
                                                       1 nota(s) de R$ 1,00


 */

import java.util.Locale;
import java.util.Scanner;

public class Ex1018 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        double X = scanner.nextInt();

        double a = X/100;
        double b = X%100;
        double c = b/50;
        double d = b%50;
        double e = d/20;
        double f = d%20;
        double g = f/10;
        double h = f%10;
        double i = h/5;
        double j = h%5;
        double k = j/2;
        double l = j%2;

        System.out.printf("%.0f%n", X);
        System.out.printf("%.3s nota(s) de R$ 100,00%n", a);
        System.out.printf("%.0f nota(s) de R$ 50,00%n", c);
        System.out.printf("%.0f nota(s) de R$ 20,00%n", e);
        System.out.printf("%.0f nota(s) de R$ 10,00%n", g);
        System.out.printf("%.0f nota(s) de R$ 5,00%n", i);
        System.out.printf("%.0f nota(s) de R$ 2,00%n", k);
        System.out.printf("%.0f nota(s) de R$ 1,00%n", l);

        scanner.close();





    }
}
