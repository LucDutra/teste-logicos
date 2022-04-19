import java.util.Locale;
import java.util.Scanner;

public class Ex1118 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        double nota = 0;
        double aux = 0;
        double cont = 0;

        while (cont != 2) {
            nota = scanner.nextDouble();
            if (nota >= 0.0 && nota <= 10.0) {
                aux += nota;
                cont += 1;
            } else {
                System.out.printf("nota invalida %n");
            }

        }
        double media = aux / cont;
        System.out.printf("media = %.2f%n", media);

        System.out.println("novo calculo (1-sim 2-nao)");
        double novoCalculo = scanner.nextDouble();
        while (novoCalculo != 1 && novoCalculo != 2) {
            System.out.println("novo calculo (1-sim 2-nao)");
            novoCalculo = scanner.nextDouble();
        }
        double nota2 = 0;
        double aux2 = 0;
        double cont2 = 0;
        while (novoCalculo == 1 && cont2 != 2) {
            nota2 = scanner.nextDouble();
            if (nota2 >= 0.0 && nota2 <= 10.0) {
                aux2 += nota2;
                cont2 += 1;
            }

        }
        double media2 = aux2 / cont2;
        System.out.printf("media = %.2f%n", media2);
        System.out.println("novo calculo (1-sim 2-nao)");
        double novocalculo2 = scanner.nextDouble();
        if (novocalculo2 == 2) {
            System.out.println();
        }

        scanner.close();

    }
}

