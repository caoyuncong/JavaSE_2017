package collection;

import java.util.Map;
import java.util.TreeMap;

/**
 * Created by caoyuncong on
 * 2017/4/12 10:03
 * JavaSE_2017.
 */
public class TreeMapTest {
    public static void main(String[] args) {
        TreeMap<String, Integer> map = new TreeMap<>();
        map.put("a", 1);
        map.put("bh", 1);
        map.put("bhj", 1);

        System.out.println(map.size());
        System.out.println(map.get("e"));

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ">" + entry.getValue());
        }
    }
}
