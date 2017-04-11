package collection;

import java.io.File;
import java.lang.reflect.Field;
import java.util.ArrayList;

/**
 * Created by caoyuncong on
 * 2017/4/10 17:00
 * JavaSE_2017.
 */
public class EnsureCapacityTest {
    private static final int N = 10000000;

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        ArrayList<String> strings = new ArrayList<>();
        System.out.println("c1: " + getCapacity(strings));
        strings.ensureCapacity(N);
        System.out.println("c2: " + getCapacity(strings));
        long start = System.currentTimeMillis();
        for (int i = 0; i < N; i++) {
            strings.add("hello");
        }
        System.out.println(System.currentTimeMillis() - start);
    }

    private static int getCapacity(ArrayList<String> strings) throws NoSuchFieldException, IllegalAccessException {
        Field field = ArrayList.class.getDeclaredField("elementData");
        field.setAccessible(true);
        return ((Object[]) field.get(strings)).length;
    }
}
