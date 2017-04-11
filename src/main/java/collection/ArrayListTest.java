package collection;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by caoyuncong on
 * 2017/4/10 10:05
 * JavaSE_2017.
 */
public class ArrayListTest<E> extends ArrayList<E>{
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        List<String> list = new ArrayList<>();
        list.add("hi");
        list.add("hello");

//        System.out.println(list.size());
//        System.out.println(list.get(1));
//        System.out.println(list.addAll(""));
//        System.out.println(list.toArray());


        ArrayListTest<Integer> integers = new ArrayListTest<>();
        integers.add(1);
        integers.add(1);
        integers.add(1);
        integers.add(1);
        integers.add(1);
        integers.add(1);
        integers.add(1);
        integers.add(1);
        integers.add(1);
        integers.add(1);
        integers.add(1);
        integers.add(1);
        integers.add(1);
        integers.add(1);
        integers.add(1);
        integers.add(1);
        integers.add(1);
        integers.add(1);
        integers.add(1);
        integers.add(1);
        integers.add(1);
        integers.add(1);
        integers.add(1);
        integers.add(1);
        integers.add(1);
        integers.add(1);
        integers.add(1);
        integers.add(1);
        integers.add(1);
        integers.add(1);
        integers.add(1);
        integers.add(1);
        integers.add(1);
        integers.add(1);
        Field field = ArrayList.class.getDeclaredField("elementData");
        field.setAccessible(true);
        System.out.println("capacity1:" + ((Object[]) field.get(integers)).length);
//        System.out.println();
    }
}
