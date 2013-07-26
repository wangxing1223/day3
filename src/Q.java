/**
 * Created by Administrator on 13-7-24.
 */
import java.text.DateFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Formatter;
//生成一个java.util.Date对象
//        编写程序转化为”2012-6-5 14:23:22”格式的字符串
//
//        提示：java.text.SimpleDateFormat类

public class Q {
    public static void main(String[] args) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat();
        Date newTime = new Date();
        System.out.print("original time format: ");
        System.out.println(newTime);
//        Formatter formatter = new Formatter();
        SimpleDateFormat time=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.print("new time format: ");
        System.out.println(time.format(newTime));
    }
}
