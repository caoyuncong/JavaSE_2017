package collection;

/**
 * Created by caoyuncong on
 * 2017/3/27 15:48
 * JavaSE_2017.
 */
public class ArrayTest {
    public static void main(String[] args) {
        String[] strings = new String[10];
        strings[0] = "test";
        System.out.println(strings[0]);

        boolean[] booleans = new boolean[100];
        System.out.println(booleans[99]);

        int[] ints = {1, 2, 3, 4, 5, 6, 777, 888};
        System.out.println(ints[6]);

        double[] doubles = new double[10000];
        System.out.println(ints[6]);

        ArrayTest[] arrayTest=new ArrayTest[3];

        System.out.println(arrayTest[0]);
        System.out.println(arrayTest[1]);
        System.out.println(arrayTest[2]);

//        itar+tab
        for (int i = 0; i < arrayTest.length; i++) {
            ArrayTest test = arrayTest[i];
            System.out.println(test);
        }

//        iter+tab
        for (ArrayTest test : arrayTest) {
            System.out.println(test);
        }
    }
}
