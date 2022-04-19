import java.util.Scanner;

public class Ex1143 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int quantidade = scanner.nextInt();

        for (int i = 1; i<=quantidade; i++){
            int potencia = i*i;
            int potencia2 = i*potencia;
            System.out.println(i + " " + potencia + " " + potencia2);
        }
        scanner.close();
    }
}