/*
Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes. Escreva um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel 4.Fim). Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código (até que seja válido). O programa será encerrado quando o código informado for o número 4.

Entrada
A entrada contém apenas valores inteiros e positivos.

Saída
Deve ser escrito a mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combustível, conforme exemplo.

Exemplo de Entrada          	Exemplo de Saída
8                               MUITO OBRIGADO
1                               Alcool: 1
7                               Gasolina: 2
2                               Diesel: 0
2
4

 */

import java.util.Scanner;

public class Ex1134 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int Alcool = 0;
        int Gasolina = 0;
        int Diesel = 0;
        int Codigo = scanner.nextInt();





        while (Codigo != 4){
            if (Codigo == 1){
                Alcool++;
            }else if (Codigo == 2){
                Gasolina++;
            }else if (Codigo == 3){
                Diesel++;
            }else if (Codigo < 1){
                    System.out.println("Por favor digite um numero valido: ");
            }else if (Codigo > 4 ){
                    System.out.println("Por favor digite um numero valido: ");
            }
            Codigo = scanner.nextInt();
        }

        if (Codigo == 4 ){
            System.out.println("Muito obrigado");
            System.out.println("Alcool: " + Alcool);
            System.out.println("Gasolina: " + Gasolina);
            System.out.println("Diesel: " + Diesel);
        }


        scanner.close();
    }
}

