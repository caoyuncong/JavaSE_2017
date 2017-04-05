package collection;

import java.util.HashSet;
import java.util.Set;
import java.util.Vector;

/**
 * Created by caoyuncong on
 * 2017/3/29 14:00
 * JavaSE_2017.
 */
public class VectorTest {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();

        vector.add("hi");
        vector.add("hello");
        vector.add("test");
        vector.add("hi");

        System.out.println(vector.get(0)); // hi 返回向量中指定位置的元素。

        System.out.println(vector.size());

        for (int i = 0; i < vector.size(); i++) {
            System.out.println(vector.get(i));
        }

//        vector.clear();
//        System.out.println(vector);
//        vector.insertElementAt("true",2);
        vector.remove(0);
        System.out.println(vector);
        System.out.println(vector.capacity());
        //  capacity 容量,\ 能力,\ 容积

        Set<String> strings = new HashSet<>();
        strings.add("a");
        strings.add("aa");
        strings.add("aaa");
        strings.add("aaa");
        System.out.println(strings.size());
        for (String string : strings) {
            System.out.println(string);
        }

        Vector<Integer> integers = new Vector<>();
        integers.add(1);
        integers.add(10);
        integers.add(100);

        System.out.println(integers.size());
        System.out.println(integers.capacity());

        integers.setElementAt(9, 0);
        integers.setElementAt(99, 1);

        System.out.println("->" + integers.set(2, 999));

        integers.remove(0);
        integers.clear();
        for (Integer integer : integers) {
            System.out.println(integer);
        }
    }
}
