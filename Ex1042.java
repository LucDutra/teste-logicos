import java.util.Locale;
import java.util.Scanner;

public class Ex1042 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();

        if (x<y && x<z){
            System.out.println(x);
            if (y<z){
                System.out.println(y);
                System.out.println(z);
            }else if (y>z){
                System.out.println(z);
                System.out.println(y);
            }
;        } else if (y<z){
            System.out.println(y);
            if (x<z) {
                System.out.println(x);
                System.out.println(z);
            }else {
                System.out.println(z);
                System.out.println(x);
            }
        } else if (z<x) {
            System.out.println(z);
            if (x < y) {
                System.out.println(x);
                System.out.println(y);
            } else if (x > y){
                System.out.println(y);
                System.out.println(x);

            }
        }
        System.out.println();

        System.out.println(x);
        System.out.println(y);
        System.out.println(z);

        scanner.close();
    }
}
