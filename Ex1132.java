import java.util.Scanner;

public class Ex1132 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        int y = scanner.nextInt();

        int menor,maior;

        if (x < y){
            menor = x;
            maior = y;
        }else {
            menor = y;
            maior = x;
        }

        int soma = 0;
        for (int i = menor ; i <= maior; i++){
            if (i % 13 != 0){
                soma += i;
                }
            }

        System.out.println(soma);

        scanner.close();
        }


    }

