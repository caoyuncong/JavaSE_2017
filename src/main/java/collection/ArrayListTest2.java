package collection;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by caoyuncong on
 * 2017/4/11 9:02
 * JavaSE_2017.
 */
public class ArrayListTest2 {
    public static void main(String[] args) {
        List<String> strings1 = new ArrayList<>();
        strings1.add("d");
        strings1.add("b");
        List<String> strings2 = new ArrayList<>();
        strings2.add("a");
        strings2.add("b");
        strings2.add("c");

        System.out.println(strings1.equals(strings2));

        List<String> strings3 = new ArrayList<>(strings2.subList(1, 3));
        System.out.println(strings3);

        System.out.println(strings2.containsAll(strings1));
//
        strings2.removeAll(strings3);
        System.out.println(strings2);
//
        strings3.retainAll(strings2); // 保留strings2的元素，去除string3的元素
        System.out.println(strings3);

    }
}
