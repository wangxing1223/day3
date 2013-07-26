/**
 * Created by Administrator on 13-7-23.
 */
public class Plane extends Vehicle {
    double flyingspeed;
    double flyingheight;
    int passengernumber;

    public Plane(){
        super("飞机",60,"blue");
    }

    void passengerNumber(){
        System.out.println("The number of passengers is :"+passengernumber);
    }
    public static void main(String[] args) {
        Plane plane = new Plane();
        System.out.println(plane.flyingheight);
        System.out.println(plane.flyingspeed);
        plane.passengerNumber();
    }

}
