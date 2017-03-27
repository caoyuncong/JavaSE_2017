package enter;

/**
 * Created by caoyuncong on
 * 2017/3/21 10:02
 * JavaSE_2017.
 */
// 抽象 abstract 的使用场景 对类进行抽象
public abstract class Shape {
    public abstract double getPerimeter();

    public abstract double getArea();

    public static void main(String[] args) {
        Circle circle = new Circle(6.0);
        System.out.println(circle.getPerimeter());
        System.out.println(circle.getArea());

        Triangle triangle = new Triangle(3, 4, 5);
        System.out.println(triangle.getPerimeter());
        System.out.println(triangle.getArea());

        Rectangle rectangle = new Rectangle(2, 3);
        System.out.println(rectangle.getPerimeter());
        System.out.println(rectangle.getArea());

        Square square = new Square(3);
        System.out.println(square.getArea());
        System.out.println(square.getPerimeter());
    }
}

class Circle extends Shape {
    //    private double x;
    //    private double y;
    private double pi = 3.14;
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * pi * radius;
    }

    @Override
    public double getArea() {
        return pi * Math.pow(radius, 2);
    }
}

class Triangle extends Shape {

    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c) {
        if ((a + b) > c || (a + c) > b || (c + b) > a) {
            this.a = a;
            this.b = b;
            this.c = c;
        } else {
            System.out.println("error.");
            System.exit(0);
        }
    }

    @Override
    public double getPerimeter() {
        return a + b + c;
    }

    @Override
    public double getArea() {
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
}

class Square extends Shape {
    private double a;

    public Square(double a) {
        this.a = a;
    }

    @Override
    public double getPerimeter() {
        return 4 * a;
    }

    @Override
    public double getArea() {
        return a * a;
    }
}

class Rectangle extends Shape {

    private double a;
    private double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double getPerimeter() {
        return (a + b) * 2;
    }

    @Override
    public double getArea() {
        return a * b;
    }
}

class Quadrangle extends Shape {

    private double a;
    private double b;
    private double c;
    private double d;

    public Quadrangle(double a, double b, double c, double d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    @Override
    public double getPerimeter() {
        return a + b + c + d;
    }

    @Override
    public double getArea() {
        return 0;
    }
}