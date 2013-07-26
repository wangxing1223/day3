import java.util.Scanner;

/**
 * Created by Administrator on 13-7-24.
 */
//输出如下图形：
//
//        *
//       ***
//      *****
//     *******
//      *****
//       ***
//        *
//
//        要求：只能使用以下3种输出语句：
//        System.out.print(" ");
//System.out.print("*");
//System.out.println("*");
//
//n(奇数)行的同样的图形？
public class R {
    public static void main(String[] args) {

        boolean b = false;
        Scanner scanner = new Scanner( System.in );
        System.out.print("要绘制图形的行数为: ");
        int n = scanner.nextInt();

        while(b == false){
            if((n <= 0)||(n%2 == 0)){
                System.out.print("Error！Please re-enter：");
                n = scanner.nextInt();
            } else {
                b = true;
                System.out.println( n );
            }
        }

        for (int i = 1; i <= (n+1)/2; i++) {
            for (int j = (n-(2*i-1))/2; j > 0; j--) {
                System.out.print(" ");
            }

            for (int k = 1; k <= 2*i-1 ; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = (n+1)/2 + 1; i <= n ; i++) {

            for (int k = 1; k <= i-((n+1)/2) ; k++) {
                System.out.print(" ");
            }

            for (int j = 2*( n-i ); j >= 0; j--) {
                System.out.print("*");
            }

            System.out.println();

        }

//        System.out.print(" ");
//        System.out.print(" ");
//        System.out.print(" ");
//        System.out.println("*");
//
//        System.out.print(" ");
//        System.out.print(" ");
//        System.out.print("*");
//        System.out.print("*");
//        System.out.println("*");
//
//        System.out.print(" ");
//        System.out.print("*");
//        System.out.print("*");
//        System.out.print("*");
//        System.out.print("*");
//        System.out.println("*");
//
//        System.out.print("*");
//        System.out.print("*");
//        System.out.print("*");
//        System.out.print("*");
//        System.out.print("*");
//        System.out.print("*");
//        System.out.println("*");
//
//        System.out.print(" ");
//        System.out.print("*");
//        System.out.print("*");
//        System.out.print("*");
//        System.out.print("*");
//        System.out.println("*");
//
//        System.out.print(" ");
//        System.out.print(" ");
//        System.out.print("*");
//        System.out.print("*");
//        System.out.println("*");
//
//        System.out.print(" ");
//        System.out.print(" ");
//        System.out.print(" ");
//        System.out.println("*");

    }
}
