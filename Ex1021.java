/*
Leia um valor de ponto flutuante com duas casas decimais. Este valor representa um valor monetário.
A seguir, calcule o menor número de notas e moedas possíveis no qual o valor pode ser decomposto.
As notas consideradas são de 100, 50, 20, 10, 5, 2. As moedas possíveis são de 1, 0.50, 0.25, 0.10, 0.05 e 0.01.
A seguir mostre a relação de notas necessárias.

Entrada
O arquivo de entrada contém um valor de ponto flutuante N (0 ≤ N ≤ 1000000.00).

Saída
Imprima a quantidade mínima de notas e moedas necessárias para trocar o valor inicial, conforme exemplo fornecido.

Obs: Utilize ponto (.) para separar a parte decimal.

Exemplo de Entrada	                                        Exemplo de Saída
576.73                                                      NOTAS:
                                                            5 nota(s) de R$ 100.00
                                                            1 nota(s) de R$ 50.00
                                                            1 nota(s) de R$ 20.00
                                                            0 nota(s) de R$ 10.00
                                                            1 nota(s) de R$ 5.00
                                                            0 nota(s) de R$ 2.00
                                                            MOEDAS:
                                                            1 moeda(s) de R$ 1.00
                                                            1 moeda(s) de R$ 0.50
                                                            0 moeda(s) de R$ 0.25
                                                            2 moeda(s) de R$ 0.10
                                                            0 moeda(s) de R$ 0.05
                                                            3 moeda(s) de R$ 0.01



4.00                                                        NOTAS:
                                                            0 nota(s) de R$ 100.00
                                                            0 nota(s) de R$ 50.00
                                                            0 nota(s) de R$ 20.00
                                                            0 nota(s) de R$ 10.00
                                                            0 nota(s) de R$ 5.00
                                                            2 nota(s) de R$ 2.00
                                                            MOEDAS:
                                                            0 moeda(s) de R$ 1.00
                                                            0 moeda(s) de R$ 0.50
                                                            0 moeda(s) de R$ 0.25
                                                            0 moeda(s) de R$ 0.10
                                                            0 moeda(s) de R$ 0.05
                                                            0 moeda(s) de R$ 0.01



91.01                                                       NOTAS:
                                                            0 nota(s) de R$ 100.00
                                                            1 nota(s) de R$ 50.00
                                                            2 nota(s) de R$ 20.00
                                                            0 nota(s) de R$ 10.00
                                                            0 nota(s) de R$ 5.00
                                                            0 nota(s) de R$ 2.00
                                                            MOEDAS:
                                                            1 moeda(s) de R$ 1.00
                                                            0 moeda(s) de R$ 0.50
                                                            0 moeda(s) de R$ 0.25
                                                            0 moeda(s) de R$ 0.10
                                                            0 moeda(s) de R$ 0.05
                                                            1 moeda(s) de R$ 0.01


 */

import java.util.Locale;
import java.util.Scanner;

public class Ex1021 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor");
        double valor = scanner.nextDouble();

        double a = valor/100;
        double b = valor%100;
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
        double m = l ;
        double n = l%1.0;
        double o = n/0.50;
        double p = n%0.50;
        double q = p/0.25;
        double r = p%0.25;
        double s = r/0.10;
        double t = r%0.10;
        double u = t/0.05;
        double v = t%0.05;
        double w = v/0.01;
        double x = v%0.01;

        System.out.println("NOTAS:");
        System.out.printf("%.1s nota(s) de R$ 100.00%n", a);
        System.out.printf("%.1s nota(s) de R$ 50.00%n", c);
        System.out.printf("%.1s nota(s) de R$ 20.00%n", e);
        System.out.printf("%.1s nota(s) de R$ 10.00%n", g);
        System.out.printf("%.1s nota(s) de R$ 5.00%n", i);
        System.out.printf("%.1s nota(s) de R$ 2.00%n", k);
        System.out.println("MOEDAS:");
        System.out.printf("%.1s moeda(s) de R$ 1.00%n", m);
        System.out.printf("%.1s moedas(s) de R$ 0.50%n",o);
        System.out.printf("%.1s moeda(s) de R$ 0.25%n", q);
        System.out.printf("%.1s moeda(s) de R$ 0.10%n", s);
        System.out.printf("%.1s moeda(s) de R$ 0.05%n", u);
        System.out.printf("%.1s moeda(s) de R$ 0.01%n", w);

       scanner.close();
    }

}
