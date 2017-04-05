package collection;

import java.util.Arrays;
import java.util.Vector;

/**
 * Created by caoyuncong on
 * 2017/3/31 9:50
 * JavaSE_2017.
 */
public class StringCopyTest {
    public static void main(String[] args) {
        int[] srcArray = {1, 2, 3, 4, 5, 6};
        int[] destArray = new int[10];

        // src - source 源\ [sɔːs]
        // dest - destination 目的地\ [,destɪ'neɪʃ\(ə\)n]
        System.out.println(Arrays.toString(destArray));
        System.arraycopy(srcArray, 1, destArray, 6, 4);
        System.out.println(Arrays.toString(destArray));

        String[] strings = {"a", "b", "c", "d", "e", null, null, null, null, null};
        // index = 2 size = 5
        // srcPos : index + 1
        // length : size - index -1
        // destPos : index

        System.arraycopy(strings, 2, strings, 2, 2);
        System.out.println(Arrays.toString(strings));
    }
}
