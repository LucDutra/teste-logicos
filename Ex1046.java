import java.util.Scanner;

public class Ex1046 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int hIncial = scanner.nextInt();
        int hFinal = scanner.nextInt();


        if (hIncial > hFinal) {
            System.out.println("O JOGO DUROU " + (24 - (hIncial - hFinal)) + " HORA(S)");
        } else if (hFinal > hIncial) {
            System.out.println("O JOGO DUROU " + (hFinal - hIncial) + " HORA(S)");
        } else {
            System.out.println("O JOGO DUROU 24 HORA(S)");
        }

        scanner.close();
    }
}
