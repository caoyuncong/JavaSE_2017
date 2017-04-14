package collection;

import java.util.LinkedList;

/**
 * Created by caoyuncong on
 * 2017/4/11 9:53
 * JavaSE_2017.
 */
public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList<String> strings = new LinkedList<>();
        strings.add("a");
        strings.add("b");

        strings.remove(0);
        System.out.println(strings.size());
        System.out.println(strings.get(0));

        for (String string : strings) {
            System.out.println(string);
        }

        System.out.println(strings.getFirst());
        System.out.println(strings.getLast());
    }
}
