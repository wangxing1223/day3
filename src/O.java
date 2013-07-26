/**
 * Created by Administrator on 13-7-24.
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

//参考JDK API文档的java.util.ArrayList类
//
//        编写程序
//
//        在ArrayList的一个实例中保存十二个月份：
//        January February March April May June July August September October November December
//
//        用户输入他的姓名后，根据他姓名的字符个数n返回arraylist中的第n个月份元素值
//
//        String
public class O {
    public static void main(String[] args) {

        String mouth[] = {"January", "February", "March" ,"April", "May", "June", "July", "August" ,"September" ,"October", "November", "December"};
        Scanner scanner = new Scanner(System.in);
//        ArrayList<String> arraylist = new ArrayList<String>(Arrays.asList(mouth));
//        for (int i = 0; i < arraylist.size(); i++) {
//            System.out.println(arraylist.get(i));
//        }
        ArrayList arraylist = new ArrayList();
//        arraylist.add("    ");
        arraylist.addAll(0,Arrays.asList(mouth));
        System.out.println(arraylist);
        System.out.print("Please input your name:");
        String name = scanner.next();
        boolean b = false;
        while(b == false){
            if (name.length()> 12){
                System.out.println("Error!input:");
                name = scanner.next();
            }else {
                b = true;
            }
        }
        System.out.print("The month is :");
        System.out.println(arraylist.get(name.length()-1));
        System.out.println(arraylist.size());
    }

}
