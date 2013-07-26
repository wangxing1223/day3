import java.awt.image.DataBufferDouble;
import java.util.Scanner;

/**
 * Created by Administrator on 13-7-23.
 */
//设计一个长方体类Cuboid
//
//        可以求得它的表面积和体积
//
//        在测试类中验证
//
//        double length;
//double width;
//double height;
//
//(length*width + width*height + height*length)*2
//
//        length*width*height
class Cuboid{

    double width;
    double length;
    double height;
//
//    Cuboid (double width, double height, double length){
//        this.width = width;
//        this.height = height;
//         this.length = length;
//    }

    public void volume(){//体积
        double volume =length*width*height;
        System.out.println("长方体的体积是："+volume);
    }

    public void surfaceArea(){
        double surfacearea =(length*width + width*height + height*length)*2;
        System.out.println("长方体的表面积是：" +surfacearea);
    }

    public static void main(String[] args) {
        Cuboid cuboid = new Cuboid();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input length of cuboid:");
        cuboid.length = scanner.nextDouble();
        System.out.println("Please input width of cuboid:");
        cuboid.width = scanner.nextDouble();
        System.out.println("Please input height of cuboid:");
        cuboid.height = scanner.nextDouble();
        cuboid.surfaceArea();
        cuboid.volume();

    }
}

