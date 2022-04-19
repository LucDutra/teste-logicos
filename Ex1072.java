/*
Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida.
Mostre quantos destes valores X estão dentro do intervalo [10,20]
e quantos estão fora do intervalo, mostrando essas informações.

Entrada
A primeira linha da entrada contém um valor inteiro N (N < 10000), que indica o número de casos de teste.
Cada caso de teste a seguir é um valor inteiro X (-107 < X <107).


Saída
Para cada caso, imprima quantos números estão dentro (in) e quantos valores estão fora (out) do intervalo.

Exemplo de Entrada	                        Exemplo de Saída
4                                           2 in
14                                          2 out
123
10
-25
 */

import java.util.Scanner;

public class Ex1072 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int quantidadeValor = scanner.nextInt();
        int in = 0;
        int out = 0;
        for (int i = 0; i<quantidadeValor; i++){
            int x = scanner.nextInt();
            if (x >= 10 && x<= 20){
                in++;
            }else{
                out++;
            }
        }
        System.out.printf("%d in %n", in);
        System.out.printf("%d out %n", out);
        scanner.close();
    }
}
