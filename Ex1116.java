import java.util.Locale;
import java.util.Scanner;

public class Ex1116 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        double x, y;
        int quantidade = scanner.nextInt();
        for (int i = 0; i < quantidade; i++) {
            x = scanner.nextInt();
            y = scanner.nextInt();
            if (x == 0) {
                System.out.println("0.0");
            } else if (y == 0) {
                System.out.println("divisao impossivel");
            } else {
                double divisao = x / y;
                System.out.printf("%.1f%n", divisao);
            }
        }
        scanner.close();
    }
}
