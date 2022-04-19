/*Faça um programa que leia três valores e apresente o maior dos três valores lidos seguido da
 mensagem “eh o maior”. Utilize a fórmula:

MaiorAB = (a+b+abs(a-b))/2

Obs.: a fórmula apenas calcula o maior entre os dois primeiros (a e b). Um segundo passo, portanto
é necessário para chegar no resultado esperado.

Entrada
O arquivo de entrada contém três valores inteiros.

Saída
Imprima o maior dos três valores seguido por um espaço e a mensagem "eh o maior".

 */

import java.util.Locale;
import java.util.Scanner;

public class Ex1013 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();

        int MAIORAB = (A+ B+(Math.abs(A - B))) / 2;
        int maior = (C + MAIORAB+(Math.abs(C - MAIORAB))) / 2;




        System.out.println( maior + " eh o maior");



        scanner.close();



    }








}
