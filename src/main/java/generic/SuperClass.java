package generic;

/**
 * Created by caoyuncong on
 * 2017/4/13 11:37
 * JavaSE_2017.
 */
public class SuperClass<T> {
    public static void main(String[] args) {
//        SuperClass<> superClass = new SuperClass<>();
//        System.out.println(superClass);
    }
}

class SubClass<T extends SuperClass>  {
    public static void main(String[] args) {
//        SubClass<Double> subClass = new SubClass<>();
//        System.out.println(subClass);
    }

}
