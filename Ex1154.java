import java.util.Locale;
import java.util.Scanner;

public class Ex1154 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        int idade = scanner.nextInt();
        int soma = 0;
        int quantidade = 0;


        while (idade >= 0){
            soma += idade;
            quantidade++;
            idade = scanner.nextInt();
        }

        if (idade < 0){
            double media = (double) soma / quantidade;
            System.out.printf("%.2f%n", media);
        }
        scanner.close();
    }
}
