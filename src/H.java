/**
 * Created by Administrator on 13-7-23.
 */
//输出n!
//
//        n为用户输入的一个正整数
//        n! = n*(n-1)*(n-2)*...*16

//        5! = 5*4*3*2*1 = 12022
import java.util.Scanner;
public class H {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input a number:");
        n = scanner.nextInt();
        int product = 1;
        for (int i = 1;i <= n;i++){
            product = product * i;
        }
        System.out.print(n +"  factorial is：");
        System.out.println( product );

    }
}
