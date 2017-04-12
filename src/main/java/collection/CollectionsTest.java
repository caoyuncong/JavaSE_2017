package collection;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by caoyuncong on
 * 2017/4/12 14:00
 * JavaSE_2017.
 */
public class CollectionsTest {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("a");
        strings.add("b");
        strings.add("c");
        strings.add("d");
        strings.add("e");

        Collections.reverse(strings);
        System.out.println(strings);

    }
}
