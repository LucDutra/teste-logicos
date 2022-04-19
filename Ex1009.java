/*
Faça um programa que leia o nome de um vendedor, o seu salário fixo e o total de vendas efetuadas por ele no mês (em dinheiro). Sabendo que este vendedor ganha 15% de comissão sobre suas vendas efetuadas, informar o total a receber no final do mês, com duas casas decimais.

Entrada
O arquivo de entrada contém um texto (primeiro nome do vendedor) e 2 valores de dupla precisão (double)
com duas casas decimais, representando o salário fixo do vendedor
e montante total das vendas efetuadas por este vendedor, respectivamente.

Saída
Imprima o total que o funcionário deverá receber, conforme exemplo fornecido.

Exemplos de Entrada	                    Exemplos de Saída
JOAO                                    TOTAL = R$ 684.54
500.00
1230.30

TOTAL = R$ 684.54

PEDRO                                   TOTAL = R$ 700.00
700.00
0.00



MANGOJATA                               TOTAL = R$ 1884.58
1700.00
1230.50
 */

import java.util.Locale;
import java.util.Scanner;

public class Ex1009 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        int porcentagem = 15;

        System.out.println("Digite seu nome");
        String nome = scanner.nextLine();
        System.out.println("Digite seu salario");
        double salarioFixo = scanner.nextDouble();
        System.out.println("Digite o total de vendas que voce fez");
        double totalVenda = scanner.nextDouble();

        double comissao = (totalVenda * porcentagem/100 + salarioFixo);

        System.out.printf("TOTAL = R $ %.2f%n", comissao);

        scanner.close();
    }
}
