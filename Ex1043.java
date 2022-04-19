import java.util.Locale;
import java.util.Scanner;

public class Ex1043 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        double x = scanner.nextDouble();
        double y = scanner.nextDouble();
        double z = scanner.nextDouble();

        double perimetroTriangulo = x + y + z;
        double areaTrapezio = ((x+y)*z) / 2;

        if (x > y - z && x < y + z){
            System.out.printf("Perimetro = %.1f",perimetroTriangulo);
        }else
            System.out.printf("Area = %.1f", areaTrapezio);

        scanner.close();
   }
}
