package next;

/**
 * Created by caoyuncong on
 * 2017/3/27 9:06
 * JavaSE_2017.
 */
public class PrimitiveTest2 {
    private String s;
    private static void method(PrimitiveTest2 primitiveTest2) {
        System.out.println("b: " + primitiveTest2.s);
        primitiveTest2.s = "hi";
        System.out.println("c: " + primitiveTest2.s);
    }

    public static void main(String[] args) {
        PrimitiveTest2 primitiveTest2 = new PrimitiveTest2();
        primitiveTest2.s = "hello";
        System.out.println("a: " + primitiveTest2.s);
        method(primitiveTest2);
        System.out.println("d: " + primitiveTest2.s);
    }
}

