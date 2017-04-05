package test;

/**
 * Created by caoyuncong on
 * 2017/4/1 8:22
 * JavaSE_2017.
 */
public class StringTest {
    public static void main(String[] args) {
        String s = "hello";
        String s1 = "asdf";

        char[] chars = {'H', 'e', 'l', 'l', 'o'};
        String s2 = new String(chars);

        System.out.println(s2);
        for (char c : s2.toCharArray()) {
            System.out.println(c);
        }

        String s3 = "Hello";
        System.out.println(s3.toLowerCase()); //

    }
}
