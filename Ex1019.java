/* Leia um valor inteiro, que é o tempo de duração em segundos de um determinado evento em uma fábrica,
e informe-o expresso no formato horas:minutos:segundos.

Entrada
O arquivo de entrada contém um valor inteiro N.

Saída
Imprima o tempo lido no arquivo de entrada (segundos), convertido para horas:minutos:segundos, conforme exemplo
fornecido.

Exemplo de Entrada	            Exemplo de Saída
556                               0:9:16

1                                 0:0:1

140153                            38:55:53



 */

import java.util.Locale;
import java.util.Scanner;

public class Ex1019 {

    public static void main(String[] args) {


    Scanner scanner = new Scanner(System.in);
     Locale.setDefault(Locale.US);

     int segundos = scanner.nextInt();
     int horas = segundos / 3600;
        segundos %=3600;
     int minutos = segundos /60;
        segundos %=60;

        System.out.println(horas + ":" + minutos + ":" + segundos);


        scanner.close();


    }
}
