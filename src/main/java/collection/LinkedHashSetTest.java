package collection;

import java.util.LinkedHashSet;

/**
 * Created by caoyuncong on
 * 2017/4/11 16:13
 * JavaSE_2017.
 */
public class LinkedHashSetTest {
    public static void main(String[] args) {
        LinkedHashSet<String> strings = new LinkedHashSet<>();
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
