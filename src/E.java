import java.util.Random;

/**
 * Created by Administrator on 13-7-23.
 */
//输出[1, 20]随机正整数100000次
//
//        1，2，。。。，20
//
//        java.util.Random
//        java.lang.Math
//
//        比较两种方法的效率和随机分布情况[Hashtable]
public class E {
    public static void main(String[] args) {
        java.util.Random m = new java.util.Random();
        for(int i = 1;i <= 3; i++ ){
            int number = 1+m.nextInt(20);
            System.out.println(number);
        }
    }

}


