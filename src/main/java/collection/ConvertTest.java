package collection;

import java.util.Arrays;

/**
 * Created by caoyuncong on
 * 2017/4/28 17:17
 * JavaSE_2017.
 */
public class ConvertTest {
    public static void main(String[] args) {
        String s = "1,2,3";
        String[] strings = s.split(",");
//        int[] ints = new int[strings.length];
//        for (int i = 0; i < strings.length; i++) {
//            String string = strings[i];
//            ints[i] = Integer.parseInt(string);
//        }

        // Lambda Expressions JDK8
//        int[] ints = Arrays.stream(strings).mapToInt(Integer::parseInt).toArray();
//        System.out.println(Arrays.toString(strings));
//        System.out.println(Arrays.toString(ints));
    }
}
