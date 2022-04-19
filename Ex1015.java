/*
Leia os quatro valores correspondentes aos eixos x e y de dois pontos quaisquer no plano,
p1(x1,y1) e p2(x2,y2) e calcule a distância entre eles, mostrando 4 casas decimais após a vírgula, segundo a fórmula:

Entrada
O arquivo de entrada contém duas linhas de dados. A primeira linha contém dois valores de ponto flutuante:
x1 y1 e a segunda linha contém dois valores de ponto flutuante x2 y2.

Saída
Calcule e imprima o valor da distância segundo a fórmula fornecida, com 4 casas após o ponto decimal.

Exemplo de Entrada	                Exemplo de Saída
1.0 7.0                             4.4721
5.0 9.0



-2.5 0.4                            16.1484
12.1 7.3



2.5 -0.4                            16.4575
-12.2 7.0

 */

import java.util.Locale;
import java.util.Scanner;

public class Ex1015 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor de x1");
        double x1 = scanner.nextDouble();
        System.out.println("Digite o valor de y1");
        double y1 = scanner.nextDouble();
        System.out.println("Digite o valor de x2");
        double x2 = scanner.nextDouble();
        System.out.println("Digite o valor de y2");
        double y2 = scanner.nextDouble();

        double distanciaX = x2 - x1;
        double distanciaY = y2 - y1;
        double distanciaXY = Math.pow(distanciaX,2) + Math.pow(distanciaY,2);
        double distancia = Math.sqrt(distanciaXY);

        System.out.printf("%.4f%n",distancia);

        scanner.close();
    }
}
