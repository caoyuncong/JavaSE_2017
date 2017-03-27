package basic;

/**
 * Created by Administrator on 2017/3/15.
 */
public class Vehicle {
    double speed;
    String type;
    String color;
//    double weight;
//    double price;

    public Vehicle() {
        System.out.println("basic.Vehicle constructor");
    }

    public Vehicle(double speed, String type, String color) {
        this.speed = speed;
        this.type = type;
        this.color = color;
    }

    public void run() {

    }

    public void stop() {

    }

}

class Bicycle extends Vehicle{
    int pedal;

    public Bicycle() {
        System.out.println("basic.Bicycle constructor"); // 子类可以隐式调用父类的无参构造方法
    }


    public Bicycle(double speed, String type, String color, int pedal) {
        super(speed, type, color); // 调用超类的构造方法 this 指代当前类  super 指代超类
        System.out.println(super.color); // 加. 调用超类的成员方法
        this.pedal = pedal;
    }

    public void ride() {
        System.out.println("ride a bicycle");
    }
}

class Ship extends Vehicle{
    int anchor;

    public Ship(double speed, String type, String color) {
        super(speed, type, color);
    }

    public void floats(){
        System.out.println("ship is floating..");
    }
}

class Plane extends Vehicle{
    int cabin;

    public Plane(double speed, String type, String color) {
        super(speed, type, color);
    }

    public void fly() {
        System.out.println("plane is flying...");
    }
}

