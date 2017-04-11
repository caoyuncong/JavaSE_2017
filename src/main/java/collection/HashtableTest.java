package collection;

import java.util.Hashtable;
import java.util.Map;

/**
 * Created by caoyuncong on
 * 2017/3/29 15:33
 * JavaSE_2017.
 */
public class HashtableTest {
    public static void main(String[] args) {
        // K - key V - value
        Hashtable<Integer, String> hashtable = new Hashtable<>();
        hashtable.put(1, "hi");
        hashtable.put(2, "hello");
        hashtable.put(2, "test");
        hashtable.put(22, "hello");
//        hashtable.put(null, "test"); // java.lang.NullPointerException
//        hashtable.put(3, null); // java.lang.NullPointerException

        hashtable.remove(2);
//        hashtable.clear();
        System.out.println(hashtable.get(2));
        System.out.println("size:" + hashtable.size());
        System.out.println(hashtable.contains("hi"));

        System.out.println(hashtable.size());

        for (Integer integer : hashtable.keySet()) {
            System.out.println(integer + "->"+hashtable.get(integer));
        }

        for (String s : hashtable.values()) {
            System.out.println(s);
        }

        for (Map.Entry<Integer, String> integerStringEntry : hashtable.entrySet()) {
            
        }
    }
}
