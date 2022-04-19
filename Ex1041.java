import java.util.Locale;
import java.util.Scanner;

public class Ex1041 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor de X");
        double x = scanner.nextDouble();
        System.out.println("Digite o valor de Y");
        double y = scanner.nextDouble();

        if (x>0 && y>0){
            System.out.println("Q1");
        }else if (x>0 && y<0){
            System.out.println("Q4");
        }else if (x<0 && y>0){
            System.out.println("Q2");
        }else if (x<0 && y<0) {
            System.out.println("Q3");
        }else if (x == 0 && y == 0){
            System.out.println("Origem");
        }else if (x == 0){
            System.out.println("Eixo X");
        }else if (y == 0){
            System.out.println("Eixo Y");
        }

        scanner.close();
    }
}
