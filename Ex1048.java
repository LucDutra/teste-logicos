import java.util.Locale;
import java.util.Scanner;

public class Ex1048 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu salario");
        double a = scanner.nextDouble();

        // 0 - 400.00
        double b = a * (15.0 / 100.0);
        double c = b + a;

        // 400.01 - 800.00
        double d = a * (12.0 / 100.0);
        double e = d + a;

        // 800.01 - 1200.00
        double f = a * (10.0 / 100.0);
        double g = f + a;

        // 1200.01 - 2000.00
        double h = a * (7.0 / 100.0);
        double i = h + a;

        // Acima de 2000.00
        double j = a * (4.0 / 100.0);
        double k = j + a;


        if (a >= 0.00 && a <= 400.00) {
            System.out.printf("Novo salario: %.2f%n", c);
            System.out.printf("Reajuste ganho: %.2f%n", b);
            System.out.println("Em percentual: 15 %");
        } else if (a >= 400.01 && a <= 800.00) {
            System.out.printf("Novo salario: %.2f%n", e);
            System.out.printf("Reajuste ganho: %.2f%n", d);
            System.out.println("Em percentual: 12 %");
        } else if (a >= 800.01 && a <= 1200.00) {
            System.out.printf("Novo salario: %.2f%n", g);
            System.out.printf("Reajuste ganho: %.2f%n", f);
            System.out.println("Em percentual: 10 %");
        } else if (a >= 1200.01 && a <= 2000.00) {
            System.out.printf("Novo salario: %.2f%n", i);
            System.out.printf("Reajuste ganho: %.2f%n", h);
            System.out.println("Em percentual: 7 %");
        } else {
            System.out.printf("Novo salario: %.2f%n", k);
            System.out.printf("Reajuste ganho: %.2f%n", j);
            System.out.println("Em percentual: 7 %");
        }

        scanner.close();
    }
}
