import java.util.Locale;
import java.util.Scanner;

public class Ex1037 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        double valor = scanner.nextDouble();

        if (valor >= 0 && valor <= 25.0000){
            System.out.println("Intervalo (0,25]");
        }else if (valor >= 25.0001 && valor <= 50.0000){
            System.out.println("Intervalo (25,50]");
        }else if (valor >= 50.0001 && valor <= 75.0000){
            System.out.println("Intervalo (50,75]");
        }else if (valor >= 75.0001 && valor <= 100.0000){
            System.out.println("Intervalo (75,100]");
        }else{
            System.out.println("Fora de intervalo");
        }
        scanner.close();
    }

}
