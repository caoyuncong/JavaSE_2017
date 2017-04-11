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

        Iterator<Map.Entry<String, Double>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Double> entry = iterator.next();
            System.out.println(iterator);
        }

    }
}


class Staff {
    private String name;
    private double salary;

    public Staff(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}