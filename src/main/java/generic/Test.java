package generic;

import java.util.Date;

/**
 * Created by caoyuncong on
 * 2017/4/13 8:56
 * JavaSE_2017.
 */
public class Test<T extends CharSequence> {
    public static void main(String[] args) {
        Test<String> test = new Test<>();
        System.out.println();
    }


    private int concat(T x, T y) {
        return x.length() + y.length();
    }
}
