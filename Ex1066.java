import java.util.Scanner;

public class Ex1066 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pares = 0;
        int impares = 0;
        int positivo = 0;
        int negativos = 0;

        int num1 = scanner.nextInt();
        if(num1 %2 ==0){
            pares = pares + 1;
        }else if (num1 %2 != 0){
            impares = impares +1;
        }
        if (num1 > 0){
            positivo = positivo +1;
        }else if (num1 < 0){
            negativos = negativos +1;
        }
        int num2 = scanner.nextInt();
        if(num2 %2 ==0){
            pares = pares + 1;
        }else if (num2 %2 != 0){
            impares = impares +1;
        }
        if (num2 > 0){
            positivo = positivo +1;
        }else if (num2 < 0){
            negativos = negativos +1;
        }
        int num3 = scanner.nextInt();
        if(num3 %2 ==0){
            pares = pares + 1;
        }else if (num3 %2 != 0){
            impares = impares +1;
        }
        if (num3 > 0){
            positivo = positivo +1;
        }else if (num3 < 0){
            negativos = negativos +1;
        }
        int num4 = scanner.nextInt();
        if(num4 %2 ==0){
            pares = pares + 1;
        }else if (num4 %2 != 0){
            impares = impares +1;
        }
        if (num4 > 0){
            positivo = positivo +1;
        }else if (num4 < 0){
            negativos = negativos +1;
        }
        int num5 = scanner.nextInt();
        if(num5 %2 ==0){
            pares = pares + 1;
        }else if (num5 %2 != 0){
            impares = impares +1;
        }
        if (num5 > 0){
            positivo = positivo +1;
        }else if (num5 < 0){
            negativos = negativos +1;
        }

        System.out.println(pares + " Valor(es) par(es)");
        System.out.println(impares + " Valor(es) impar(es)");
        System.out.println(positivo + " Valor(es) positivo(s)");
        System.out.println(negativos + " Valor(es) negativo(s)");
    }
}
