import java.util.Random;
import java.util.Scanner;

public class Ex1080 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int maiorNumero = 0;
        int posicao = 1;
        int x;
        for (int i = 0; i < 100; i++) {
            x = leitor.nextInt();
            if (i == 1) {
                maiorNumero = x;
                posicao = 1;
            } else if (x > maiorNumero) {
                maiorNumero = x;
                posicao = i;
            }
        }
        System.out.println(maiorNumero);
        System.out.println(posicao);

    }
}
