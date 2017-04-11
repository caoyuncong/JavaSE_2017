package collection;

import java.util.TreeSet;

/**
 * Created by caoyuncong on
 * 2017/4/11 16:16
 * JavaSE_2017.
 */
public class TreeSetTest {
    public static void main(String[] args) {
        TreeSet<String> strings = new TreeSet<>();
        strings.add("a");
        strings.add("b");
        strings.add("c");
        strings.add("d");
        System.out.println(strings.size());

        for (String string : strings) {
            System.out.println(string);
        }
    }
}
