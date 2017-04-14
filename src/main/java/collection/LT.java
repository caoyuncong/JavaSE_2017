package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by caoyuncong on
 * 2017/4/12 20:38
 * JavaSE_2017.
 */
public class LT {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("a");
        strings.add("b");
        strings.add("c");
        System.out.println(strings);
        Collections.reverse(strings);
        System.out.println(strings);
        Collections.sort(strings);
        System.out.println(strings);

        System.out.println(Collections.binarySearch(strings, "c"));

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "a");
        map.put(2, "b");
        map.put(3, "c");
        System.out.println(map);
        System.out.println(Collections.singletonList(map));
    }
}
