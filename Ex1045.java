import java.util.Locale;
import java.util.Scanner;

public class Ex1045 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro valor");
        double a = scanner.nextDouble();
        System.out.println("Digite o segundo valor");
        double b = scanner.nextDouble();
        System.out.println("Digite o terceiro valor");
        double c = scanner.nextDouble();

        double aux;

        if (b > a && b > c) {
            aux = a;
            a = b;
            b = aux;
        } else if (c > a) {
            aux = a;
            a = c;
            c = aux;
        }

        if (a >= (b + c)) {
            System.out.println("NAO FORMA TRIANGULO");
        } else {
            if (a * a == (b * b) + (c * c)) System.out.println("TRIANGULO RETANGULO");
            if (a * a > (b * b) + (c * c)) System.out.println("TRIANGULO OBTUSANGULO");
            if (a * a < (b * b) + (c * c)) System.out.println("TRIANGULO ACUTANGULO");
            if (a == b && a == c) System.out.println("TRIANGULO EQUILATERO");
            if ((a == b && a != c) || (a == c && a != b) || (b == c && b != a))
                System.out.println("TRIANGULO ISOSCELES");
        }

        scanner.close();
    }
}
