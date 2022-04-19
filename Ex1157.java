import java.util.Scanner;

public class Ex1157 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        for (int i = n; i > 0; i--) {
            int divisao = n / i;
            if (n % i == 0) {
                System.out.println(divisao);

            }
        }
        scanner.close();
    }
}