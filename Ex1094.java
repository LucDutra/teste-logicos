import java.util.Locale;
import java.util.Scanner;

public class Ex1094 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int Qntsapos = 0;
        int Qntratos = 0;
        int Qntcoelho = 0;
        int quantidade;

        char opcao;



        for (int i = 1; i <= N; i++) {
            quantidade = scanner.nextInt();
            opcao = scanner.nextLine().charAt(1);

            if (opcao == 'R') {
                Qntratos += quantidade;
            } else if (opcao == 'S') {
                Qntsapos += quantidade;
            } else if (opcao == 'C') {
                Qntcoelho += quantidade;
            }
        }

        int total =  Qntcoelho + Qntratos + Qntsapos;
        double percentSapos = (double) Qntsapos / total * 100;
        double percentRatos = (double)Qntratos / total * 100;
        double percentCoelho = (double) Qntcoelho/total  * 100;



        System.out.println("Total: " + total +" cobaias");
        System.out.println("Total de coelhos: " + Qntcoelho);
        System.out.println("Total de ratos: " + Qntratos);
        System.out.println("Total de sapos: " + Qntsapos);
        System.out.printf("Percentual de coelhos: %.2f %%%n" , percentCoelho);
        System.out.printf("Percentual de ratos: %.2f %%%n" , percentRatos);
        System.out.printf("Percentual de sapos : %.2f %%%n" , percentSapos );


        scanner.close();
    }
}
