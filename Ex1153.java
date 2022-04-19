import java.util.Scanner;

public class Ex1153 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int aux = 1;

        for (int i = 1; i <= n; i++) {
            aux *= i;

        }
        System.out.println(aux);
        scanner.close();
    }
}

