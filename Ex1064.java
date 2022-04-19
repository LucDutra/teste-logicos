import java.util.Locale;
import java.util.Scanner;

public class Ex1064 {
    public static void main(String[] args) {

     Locale.setDefault(Locale.US);
    Scanner scanner = new Scanner(System.in);

    int qntdPositivos = 0;
    double totalPositivos = 0;
    double num1 = scanner.nextDouble();
        if (num1 > 0) {
        qntdPositivos = qntdPositivos + 1;
        totalPositivos = totalPositivos + num1;

    }
    double num2 = scanner.nextDouble();
        if (num2 > 0) {
        qntdPositivos = qntdPositivos + 1;
        totalPositivos = totalPositivos + num2;
    }
    double num3 = scanner.nextDouble();
        if (num3 > 0) {
        qntdPositivos = qntdPositivos + 1;
        totalPositivos = totalPositivos + num3;
    }
    double num4 = scanner.nextDouble();
        if (num4 > 0) {
        qntdPositivos = qntdPositivos + 1;
        totalPositivos = totalPositivos + num4;
    }
    double num5 = scanner.nextDouble();
        if (num5 > 0) {
        qntdPositivos = qntdPositivos + 1;
        totalPositivos = totalPositivos + num5;
    }
    double num6 = scanner.nextDouble();
        if (num6 > 0) {
        qntdPositivos = qntdPositivos + 1;
        totalPositivos = totalPositivos + num6;
    }

        System.out.println(qntdPositivos + " Valores positivos");
        System.out.println(totalPositivos/qntdPositivos);


        scanner.close();
}
}

