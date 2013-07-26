/**
 * Created by Administrator on 13-7-23.
 */
//设计一个形状父类Shape，定义求面积Area和周长Perimeter的方法
//        chap3 PPT
//        设计Shape的子类：
//        Circle
//        Square
//        Rectangle
//        Triangle a b c
//        以上类中自定义域，并实现Shape中的方法
//
//        创建Test类，生成以上实现类的实例，并求
class Shape{

    double area;
    double perimeter;

//    public Shape(double area,double perimeter){
//        this.area = area;
//        this.perimeter = perimeter;
//    }

    void Area(){

    }

    void Perimeter(){

    }
}
class Circle extends Shape{//圆

    double radius;

    void Area(){
        area = radius * radius * Math.PI;
        System.out.println(area);
    }

    void Perimeter(){
        perimeter = 2* Math.PI* radius;
        System.out.println(perimeter);
    }

class  Square extends Shape{//正方形
    double sideLengtn = 2;

    void Area(){
        area = sideLengtn*sideLengtn;
        System.out.println(area);
    }

    void Perimeter(){
        perimeter = 4*sideLengtn;
        System.out.println(perimeter);
    }
}

class Rectangle extends Shape{//长方形
    double length;
    double width;

    void area(){
        area = length*width;
        System.out.println(area);
    }

    void perimeter(){
        perimeter = 2*(length + width);
        System.out.println(perimeter);
    }
}

class Triangle extends Shape{//三角形
    double a,b,c;//    令p=(a+b+c)/2
    double p =(a + b + c)*1/2;//    就得到海伦公式：s=[p(p-a)*(p-b)*(p-c)]^1/2

    void area(){
        area =Math.pow(p*(p-a)*(p-b)*(p-c),0.5) ;
        System.out.println(area);
    }

    void perimeter(){
        perimeter = a + b + c;
        System.out.println(perimeter);
    }
}
//public class L {
//    public static void main(String[] args) {
//        Square square = new Square();
//        square.Area();
//
//    }
//}
}

