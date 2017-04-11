package collection;

import java.util.HashSet;

/**
 * Created by caoyuncong on
 * 2017/4/11 15:53
 * JavaSE_2017.
 */
public class HashSetTest {
    public static void main(String[] args) {
        HashSet<String> strings = new HashSet<>();
        strings.add("hi");
        strings.add("hello");
        strings.add("test");
        strings.add("how");

//        strings.clear();
        System.out.println(strings.size());

        for (String string : strings) {
            System.out.println(string);
        }

        System.out.println(strings.size());

    }

}
