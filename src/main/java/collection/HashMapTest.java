package collection;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by caoyuncong on
 * 2017/4/12 9:01
 * JavaSE_2017.
 */
public class HashMapTest {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "a");
        hashMap.put(2, "bh");
        hashMap.put(100, "hfjj");
        hashMap.put(3, "fhfj");

        System.out.println(hashMap.size());
        System.out.println(hashMap.get(2));

        for (Integer integer : hashMap.keySet()) {
            System.out.println(integer);
        }

        for (String s : hashMap.values()) {
            System.out.println(s);
        }

        for (Map.Entry<Integer, String> integerStringEntry : hashMap.entrySet()) {
            System.out.println(integerStringEntry);
        }

    }
}
