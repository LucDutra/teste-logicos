import java.util.Scanner;

public class Ex1142 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int quantidade = scanner.nextInt();
        int cont = 1;
        for (int i = 0; i<quantidade; i++){
            for (int x = 0; x<3; x++){
                System.out.print(cont + " ");
                cont++;

            }
            System.out.println("PUM");
            cont++;
        }
        scanner.close();
    }
}
