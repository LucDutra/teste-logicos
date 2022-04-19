import java.security.spec.RSAOtherPrimeInfo;
import java.util.Locale;
import java.util.Scanner;

public class Ex1038 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);


        double cachorroQuente = 4.00;
        double xSalada = 4.50;
        double xBacon = 5.00;
        double torradaSimples = 2.00;
        double refrigerante = 1.50;


        System.out.println("Digite o numero do seu pedido");

        int pedido = scanner.nextInt();

        System.out.println("Digite a quantidade");

        int quantidade = scanner.nextInt();

        double a = (cachorroQuente * quantidade);
        double b = (xSalada * quantidade);
        double c = (xBacon * quantidade);
        double d = (torradaSimples * quantidade);
        double e = (refrigerante * quantidade);


        if (pedido == 1) {
            System.out.printf("Total: R$ %.2f%n", a);
        } else if (pedido == 2) {
            System.out.printf("Total: R$ %.2f%n", b);
        } else if (pedido == 3) {
            System.out.printf("Total: R$ %.2f%n", c);
        } else if (pedido == 4) {
            System.out.printf("Total: R$ %.2f%n", d);
        } else if (pedido == 5) {
            System.out.printf("Total: R$ %.2f%n", e);
        }

        scanner.close();
    }
}
