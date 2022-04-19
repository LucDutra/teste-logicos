import java.util.Locale;
import java.util.Scanner;

public class Ex1044 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Digite o valor de A");
        int a = scanner.nextInt();
        System.out.println("Digite o valor de B");
        int b = scanner.nextInt();

        double c = b/a;
        double d = b%a;

        if (d == 0 ){
            System.out.println("Sao Multiplos");
        }else{
            System.out.println("Nao sao Multiplos");
        }
        scanner.close();
    }
}
