/*
Faça um programa que leia as notas referentes às duas avaliações de um aluno. Calcule e imprima a média semestral.
Faça com que o algoritmo só aceite notas válidas (uma nota válida deve pertencer ao intervalo [0,10]).
Cada nota deve ser validada separadamente.

Entrada
A entrada contém vários valores reais, positivos ou negativos.
O programa deve ser encerrado quando forem lidas duas notas válidas.

Saída
Se uma nota inválida  for lida, deve ser impressa a mensagem "nota invalida".
Quando duas notas válidas forem lidas, deve ser impressa a mensagem "media = " seguido do valor do cálculo.
O valor deve ser apresentado com duas casas após o ponto decimal.

Exemplo de Entrada	                                Exemplo de Saída
-3.5                                                nota invalida
3.5                                                 nota invalida
11.0                                                media = 6.75
10.0


 */
import javax.swing.plaf.IconUIResource;
import java.util.Locale;
import java.util.Scanner;

public class Ex1117 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        double nota = 0;
        double aux = 0;
        double cont = 0;

        while (cont != 2) {
            nota = scanner.nextDouble();
            if (nota >=0.0 && nota <= 10.0) {
                aux += nota;
                cont += 1;
            }else {
                System.out.printf("nota invalida %n");
            }
        }
        double media = aux / cont;
        System.out.printf("media = %.2f%n",media);

        scanner.close();
        }

    }


