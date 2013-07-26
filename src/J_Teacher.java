/**
 * Created by Administrator on 13-7-23.
 */
 class J_Employee {

    public int m_workYear;

    public J_Employee(){
        m_workYear = 1;
    }

    public void mb_printfInfo(){
        System.out.println("该职工的工作年限是："+m_workYear);
    }
}
public class J_Teacher extends J_Employee {
    public int m_classHour;

    public J_Teacher(){
        m_classHour = 96;
    }

    public void mb_printfInfo(){
        System.out.println("该教师的工作年限为：" + m_workYear);
        System.out.println("该教师授课的课时为：" + m_classHour);
    }

    public static void main(String[] args) {
        J_Employee a = new  J_Employee();
        a.mb_printfInfo();
        a = new J_Teacher();
        a.mb_printfInfo();
    }

}
