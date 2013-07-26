import java.util.Scanner;

/**
 * Created by Administrator on 13-7-23.
 */
//用户输入一组double直接量
//
//        求这一组数的平均数
public class N {
    double average;

    public static void main(String[] args) {

        N m = new N();
        Scanner scanner = new Scanner( System.in );
        System.out.println("Please input a number:");
        int n = scanner.nextInt();
        double sum = 0;
        System.out.println("Please input "+ n + " number:");

        for (int i = 0; i < n ; i++) {
            double number = scanner.nextDouble();
            sum +=number;
        }

        m.average = sum/n;
        System.out.print("The average is :");
        System.out.println(m.average);

    }
}
