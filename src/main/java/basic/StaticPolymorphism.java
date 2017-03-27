package basic;

/**
 * Created by Administrator on 2017/3/17.
 */
public class StaticPolymorphism {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.add(1, 2));
        System.out.println(calculator.add(1.0,2.0));
    }
}

class Calculator {
    public int add(int x, int y) {
        return x + y;
    }

    public double add(double a, double b) {
        return a + b;
    }

//    public int add(int a,int b) {
//        return a+b;
//    }

//    public double add(int a,int b) {
//        return 1d;
//    }

    public double add(int a,int b,int c) {
        return a+b+c;
    }

    public double add(int a, double b) {
        return 1d;
    }

    public double add(double a, int b) {
        return 1d;
    }
}