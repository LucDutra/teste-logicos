/*
Fazer um programa para ler o nome (apenas uma palavra) e idade de duas pessoas.
Ao final mostrar uma mensagem com os nomes e a idade média entre essas pessoas,
com uma casa decimal, conforme exemplo.

 Entrada:                   Saída:
Maria 19
Joaquim 20                  A idade média de Maria e Joaquim é de 19.5 anos

 */

import javax.sound.midi.Soundbank;
import java.util.Locale;
import java.util.Scanner;

public class MariaJoaquim {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);


        String x = scanner.next();
        double idade = scanner.nextDouble();
        String y = scanner.next();
        double idade2 = scanner.nextDouble();

        double resolucao = (idade + idade2) / 2;

        System.out.println("A idade média de " + x + " e " + y + " é de " + resolucao + " Anos ");

        scanner.close();
    }
}
