package generic;

import java.util.Vector;

/**
 * Created by caoyuncong on
 * 2017/4/13 10:05
 * JavaSE_2017.
 */
public class VectorTest {
    public static void main(String[] args) {
        Vector vector = new Vector();
        vector.add("test...");
        vector.add("123");
        vector.add("true");
        vector.add("345");

//        String s = (String) vector.get(3);
        // java.lang.ClassCastException: java.lang.Integer
        // cannot be cast to java.lang.String
        System.out.println(vector.get(3));

    }
}
