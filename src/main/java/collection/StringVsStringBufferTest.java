package collection;

/**
 * Created by caoyuncong on
 * 2017/3/29 10:55
 * JavaSE_2017.
 */

/*
 ""  "a-z" "a-za-z"
 "a-za-z"
 */
public class StringVsStringBufferTest {
    private static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz"; // alphabet 字母\ ['ælfəbet]

    public static void main(String[] args) {
//        String s = "";
        StringBuffer stringBuffer = new StringBuffer("");
        long start = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
//            s += ALPHABET;
            stringBuffer.append(ALPHABET);
        }

        System.out.println("time: " + (System.currentTimeMillis() - start));
//        System.out.println(s.length());
        System.out.println(stringBuffer.length());
    }
}
