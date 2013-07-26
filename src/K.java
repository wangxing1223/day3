import java.util.Random;

/**
 * Created by Administrator on 13-7-23.
 */
//随机输出[1000,3000]内的年份
//        并判定其是否为闰年(leap year)
//
//        闰年：	西元年份除以400余数为0的，或者除以4为余数0且除以100不为余数0的，为闰年。
//
//        提示：
//        1.java.lang.Math
//        2.java.util.Random
public class K {
    public static void main(String[] args) {
        Random n = new Random();
        int year = 1000 + n.nextInt(3000);
        if ((year%400 == 0)||((year%4 == 0)&&(year%100 != 0))){
                System.out.println(year + " is leap year!");
        } else{
            System.out.println(year + " is not leap year!");
        }
    }
}
