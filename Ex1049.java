import java.util.Locale;
import java.util.Scanner;

public class Ex1049 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        String x = scanner.next();
        String y = scanner.next();
        String z = scanner.next();

        if (x.equals("vertebrado") && y.equals("ave") && z.equals("carnivoro")) {
            System.out.print("aguia");
        }else if (x.equals("vertebrado") && y.equals("ave") && z.equals("onivoro")){
            System.out.println("pomba");
        }else if (x.equals("vertebrado") && y.equals("mamifero") && z.equals("onivoro")){
            System.out.println("homem");
        }else if (x.equals("vertebrado") && y.equals("mamifero") && z.equals("herbivoro")) {
            System.out.println("vaca");
        }else if (x.equals("invertebrado") && y.equals("inseto") && z.equals("hematofago")){
            System.out.println("pulga");
        }else if (x.equals("invertebrado") && y.equals("inseto") && z.equals("herbivoro")){
            System.out.println("lagarta");
        }else if (x.equals("invertebrado") && y.equals("anelideo") && z.equals("hematofago")){
            System.out.println("sanguessuga");
        }else if (x.equals("invertebrado") && y.equals("anelideo") && z.equals("onivoro")) {
            System.out.println("minhoca");
        }
        scanner.close();;
    }
}
