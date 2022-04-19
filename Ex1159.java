import java.util.Scanner;

public class Ex1159 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int valor = scanner.nextInt();
        int somaPar = 0;
        int somaImpar = 0;

        while(valor > 0){
            if (valor % 2  == 0){
                somaPar = valor + valor  + 2 + valor + 4 + valor + 6 + valor + 8;
            }else if (valor % 2 != 0){
                somaImpar = valor + 1 + valor + 3 + valor + 5 + valor + 7 + valor + 9;
            }
            valor = scanner.nextInt();
        }

        if(valor ==0){
            System.out.println(somaPar);
            System.out.println(somaImpar);
        }

        scanner.close();
    }
}
