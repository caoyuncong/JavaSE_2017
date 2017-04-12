package collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeSet;

/**
 * Created by caoyuncong on
 * 2017/4/12 10:49
 * JavaSE_2017.
 */
public class IteratorTest {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        TreeSet<String> set = new TreeSet<>();
        set.add("a");
        set.add("b");

        Iterator<String> iterator1 = set.iterator();
        while (iterator1.hasNext()) {
            System.out.println(iterator1.next());
        }

        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "a");
        map.put(2, "b");

        Iterator<Integer> iterator2 = map.keySet().iterator();
        while (iterator2.hasNext()) {
            int key = iterator2.next();
            System.out.println(key+map.get(key));
        }

        Iterator<String> iterator3 = map.values().iterator();
        while (iterator3.hasNext()) {
            System.out.println(iterator3.next());
        }

        Iterator iterator4 = map.entrySet().iterator();
        while (iterator4.hasNext()) {
            System.out.println(iterator4.next());
        }
    }
}
