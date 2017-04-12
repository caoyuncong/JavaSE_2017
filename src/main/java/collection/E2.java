package collection;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by caoyuncong on
 * 2017/4/11 19:01
 * JavaSE_2017.
 */
public class E2 {
    public static void main(String[] args) {
        Map<String, Double> map = new Hashtable<>();
        map.put("Tom", 2000.0);
        map.put("Jack", 2000.0);
        map.put("Jerry", 3000.0);
        map.put("Kim", 5000.0);

        Iterator<String> iterator = map.keySet().iterator();
        while (iterator.hasNext()) {
            String next = iterator.next();
            System.out.println(next);
            System.out.println(next + ">" + map.get(next));
        }
            System.out.println(map.get("Jack"));

        map.remove("Tom");
        System.out.println(map);

    }
}
