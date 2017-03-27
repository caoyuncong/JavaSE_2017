package next;

/**
 * Created by caoyuncong on
 * 2017/3/27 14:00
 * JavaSE_2017.
 */
public class CastTest {
    public static void main(String[] args) {
        // 1 int ->String
        int x=1;
        //a
        String s1=Integer.toString(x);
        System.out.println(s1);
        // b
        String s2 = String.valueOf(x);
        System.out.println(s2);
        // c
        String s3 = "" + x;
        System.out.println(s3);
        // d
        Integer integer = new Integer(x);
        String s4 = integer.toString();
        System.out.println(s4);

        // 2 String -> int
        String s = "123";
        //a
        int y1=Integer.valueOf(s);
        System.out.println(y1);
        // b
        int y2 = Integer.parseInt(s);
        System.out.println(y2);
        // c
        int y3 = new Integer(s);
        System.out.println(y3);


    }
}
