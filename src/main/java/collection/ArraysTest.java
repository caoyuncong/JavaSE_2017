package collection;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;

/**
 * Created by caoyuncong on
 * 2017/4/12 15:02
 * JavaSE_2017.
 */
public class ArraysTest {
    public static void main(String[] args) {
//        String[] strings = {"a", "b", "c", "d", "e"};
//        System.out.println(Arrays.toString(strings));
//        System.out.println(Arrays.binarySearch(strings, "c"));
//        String[] strings1 = Arrays.copyOf(strings, 3);
//        System.out.println(Arrays.toString(strings1));
//        System.out.println(Arrays.toString(Arrays.copyOfRange(strings, 1, 5)));
//        Arrays.sort(strings);
//        System.out.println(Arrays.toString(strings));

        LinkedHashSet<String> strings = new LinkedHashSet<>();
        strings.add("a");
        strings.add("1");
        strings.add("c");

        Iterator<String> iterator = strings.iterator();
        while (iterator.hasNext()) {
            String next = iterator.next();

        }
    }
}
