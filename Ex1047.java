import java.util.Locale;
import java.util.Scanner;

public class Ex1047 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);


       ;
        int hInicial = scanner.nextInt();
        int mInicial = scanner.nextInt();
        int hFinal = scanner.nextInt();
        int mFinal = scanner.nextInt();
        int mt1 = (hInicial*60) + mInicial;
        int mt2 = (hFinal*60) + mFinal;
        int h24 = (24*60);
        int resultado = 0;

        if(mt2>mt1){
            resultado = mt2-mt1;
            System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n",(resultado/60), (resultado%60));
        }else if(mt1>mt2){
            resultado = (h24-mt1)+(mt2);
            System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n",(resultado/60), (resultado%60));
        }else if(mt2==mt1){
            System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n",24, 0);
        }

        scanner.close();
    }
}

