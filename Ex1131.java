import java.util.Scanner;

public class Ex1131 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int inter = scanner.nextInt();
        int gremio = scanner.nextInt();
        int repeticao = 0;

        int nJogos = 0;
        int vInter = 0;
        int vGremio = 0;
        int empate = 0;

        while(gremio >= 0 && inter >=0 && repeticao != 2){
            nJogos++;
            if (gremio > inter){
                vGremio++;
            }else if (inter > gremio){
                vInter++;
            }else if (gremio == inter){
                empate++;
            }
            System.out.println("Novo grenal (1-sim 2-nao)");
            repeticao = scanner.nextInt();
            if (repeticao != 2){
                inter = scanner.nextInt();
                gremio = scanner.nextInt();
            }
        }


        System.out.println(nJogos + " Grenais");
        System.out.println(vInter + " Inter");
        System.out.println(vGremio + " Gremio");
        System.out.println(empate + " Empates");
        if (vInter > vGremio){
            System.out.println("Inter venceu mais");
        }else if (vGremio > vInter){
            System.out.println("Gremio venceu mais");
        }


        scanner.close();
    }
}
