/**
 * Created by Administrator on 13-7-23.
 */
public class Vehicle {

    String type;
    double speed;
    String color;

    Vehicle( String type, double speed, String color){
        this.type = type;
        this.speed = speed;
        this.color = color;
    }

    void start(){
        System.out.println("starting....");
    }

    void stop(){
        System.out.println("stoped.");
    }
//    public static void main(String[] args) {
//        Vehicle vehicle = new Vehicle("汽车",60,"red");
//        System.out.println(vehicle.type);
//        System.out.println(vehicle.speed);
//        System.out.println(vehicle.color);
//        vehicle.start();
//        vehicle.stop();
//    }
}
