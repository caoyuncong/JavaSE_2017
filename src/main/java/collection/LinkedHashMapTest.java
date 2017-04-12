package collection;

import java.util.LinkedHashMap;

/**
 * Created by caoyuncong on
 * 2017/4/12 9:37
 * JavaSE_2017.
 */
public class LinkedHashMapTest {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(1, "s");
        linkedHashMap.put(-1, "dh");
        linkedHashMap.put(100, "hgj");

        System.out.println(linkedHashMap.size());

        System.out.println(linkedHashMap.get(-1));

        for (Integer integer : linkedHashMap.keySet()) {
            System.out.println(integer);
        }
    }
}
