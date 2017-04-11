package next;

/**
 * Created by caoyuncong on
 * 2017/3/24 11:28
 * JavaSE_2017.
 */
public class PrimitiveTest {
    private static void method(boolean i) {
        System.out.println("b:" + i); // 0
        i=false;
        System.out.println("c:" + i); // 1
    }

    public static void main(String[] args) {
        boolean i=true;
        System.out.println("a:" + i); // 0
        method(i);
        System.out.println("d:" + i); // 0
    }
}
