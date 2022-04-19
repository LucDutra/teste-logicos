

/*
Pedrinho está organizando um evento em sua Universidade. O evento deverá ser no mês de Abril,
iniciando e terminando dentro do mês. O problema é que Pedrinho quer calcular o tempo que o evento vai durar,
uma vez que ele sabe quando inicia e quando termina o evento.

Sabendo que o evento pode durar de poucos segundos a vários dias, você deverá ajudar Pedrinho a calcular
a duração deste evento.

Entrada
Como entrada, na primeira linha vai haver a descrição “Dia”, seguido de um espaço e o dia do mês no qual o evento
vai começar. Na linha seguinte, será informado o momento no qual o evento vai iniciar,
 no formato hh : mm : ss. Na terceira e quarta linha de entrada haverá outra informação no mesmo formato das duas
 primeiras linhas, indicando o término do evento.

Saída
Na saída, deve ser apresentada a duração do evento, no seguinte formato:

W dia(s)
X hora(s)
Y minuto(s)
Z segundo(s)

Obs: Considere que o evento do caso de teste para o problema tem duração mínima de 1 minuto.

Exemplo de Entrada	                    Exemplo de Saída
Dia 5                                   3 dia(s)
08 : 12 : 23                            22 hora(s)
                                        1 minuto(s)
Dia 9                                   0 segundo(s)
06 : 13 : 23

 */

import java.util.Locale;
import java.util.Scanner;

public class Ex1061 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Locale.setDefault(Locale.US);


        System.out.print("Dia ");
        int d1 = scanner.nextInt();
        int h1 = scanner.nextInt();
        String espaco = scanner.next();
        int m1 = scanner.nextInt();
        String espaco1 = scanner.next();
        int s1 = scanner.nextInt();
        System.out.print("Dia ");
        int d2 = scanner.nextInt();
        int h2 = scanner.nextInt();
        String espaco2 = scanner.next();
        int m2 = scanner.nextInt();
        String espaco3 = scanner.next();
        int s2 = scanner.nextInt();
        System.out.println();



       int q1 = s1 + m1*60 + h1*60*60 + d1*60*60*24;
       int q2 = s2 + m2*60 + h2*60*60 + d2*60*60*24;
       int tempo = q2 - q1;


        System.out.printf("%d dia(s)\n", tempo/ (60*60*24)); tempo = tempo%(60*60*24);
        System.out.printf("%d hora(s)\n", tempo/ (60*60)); tempo = tempo%(60*60);
        System.out.printf("%d minuto(s)\n", tempo/ (60)); tempo = tempo%(60);
        System.out.printf("%d segundo(s)\n", tempo);








        scanner.close();

    }

}
