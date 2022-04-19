import java.util.Locale;
import java.util.Scanner;

public class Ex1040 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        double n1 = scanner.nextDouble();
        double n2 = scanner.nextDouble();
        double n3 = scanner.nextDouble();
        double n4 = scanner.nextDouble();

        double media = ((n1 * 2) + (n2 * 3) + (n3 * 4) + (n4 * 1)) / 10;

        if (media >= 7) {
            System.out.println("Media: " + media);
            System.out.println("Aluno aprovado.");
        } else if (media < 7 && media >= 5) {
            System.out.println("Media: " + media);
            System.out.println("Aluno em exame.");
            System.out.print("Nota do exame: ");  double notaExame = scanner.nextDouble();
            media = (media + notaExame) / 2;
            if (media >= 5) {
                System.out.println("Aluno aprovado.");
            } else {
                System.out.println("Media: " + media);
                System.out.println("Aluno reprovado.");
            }
            System.out.println("Media final: " + media);
        } else {
            System.out.println("Aluno reprovado.");
        }
        scanner.close();
    }
}



