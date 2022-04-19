import java.util.Scanner;
import java.util.concurrent.SynchronousQueue;

public class Ex1070 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();



        int num1,num2,num3,num4,num5,num6;

        if(x %2 != 0){
            num1 = x;
            System.out.println(num1);
        } else if (x %2 == 0){
            num1 = x +1;
            System.out.println(num1);
        }
        if(x %2 != 0){
            num2 = x + 2;
            System.out.println(num2);
        } else if (x %2 == 0){
            num2 = x +3;
            System.out.println(num2);
        }
        if(x %2 != 0){
            num3 = x + 4;
            System.out.println(num3);
        } else if (x %2 == 0){
            num3 = x +5;
            System.out.println(num3);
        }
        if(x %2 != 0){
            num4 = x + 6;
            System.out.println(num4);
        } else if (x %2 == 0){
            num4 = x +7;
            System.out.println(num4);
        }
        if(x %2 != 0){
            num5 = x +8;
            System.out.println(num5);
        } else if (x %2 == 0){
            num5 = x +9;
            System.out.println(num5);
        }
        if(x %2 != 0){
            num6 = x +10;
            System.out.println(num6);
        } else if (x %2 == 0){
            num6 = x +11;
            System.out.println(num6);
        }


        scanner.close();




    }
}
