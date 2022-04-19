import java.util.Scanner;

public class Ex1065 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pares = 0;

        int num1 = scanner.nextInt();
        if (num1 % 2 == 0) {
            pares = pares + 1;
        }
        int num2 = scanner.nextInt();
        if (num2 % 2 == 0) {
            pares = pares + 1;
        }
        int num3 = scanner.nextInt();
        if (num3 % 2 == 0) {
            pares = pares + 1;
        }
        int num4 = scanner.nextInt();
        if (num4 % 2 == 0) {
            pares = pares + 1;
        }
        int num5 = scanner.nextInt();
        if (num5 % 2 == 0) {
            pares = pares + 1;
        }

        System.out.println(pares + " Valores pares");

        scanner.close();
    }
}