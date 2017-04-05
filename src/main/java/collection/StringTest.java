package collection;

/**
 * Created by caoyuncong on
 * 2017/3/28 10:59
 * JavaSE_2017.
 */
public class StringTest {
    public static void main(String[] args) {
        char[] chars = {'H', 'e', 'l', 'l', 'o'};
        String s = String.valueOf(chars); // valueOf 是静态方法 类名直接调用
        System.out.println(s);
        String s1 = String.copyValueOf(chars); // copyValueOf 是静态方法 类名直接调用
        System.out.println(s1);
        String s2 = new String(chars);
        System.out.println(s2);

        for (char c : s2.toCharArray()) {
            System.out.println(c);
        }

        String s3 = "Hello";
        String s4 = s3.toLowerCase(); // toLowerCase
        String s5 = s3.toUpperCase();
        System.out.println(s4);
        System.out.println(s5);

        String s6 = "How";
        String s7 = "are";
        String s8 = "you";
        System.out.println(s6.concat(s7).concat(s8));

        System.out.println(s6.contains("o"));

        System.out.println(s6.endsWith("w"));

        System.out.println(s6.equals("how"));

        System.out.println(s6.equalsIgnoreCase("how"));

        String s9 = "heplslll2o";
        for (byte b : s9.getBytes()) {
            System.out.println(b);
        }

        System.out.println(s9.indexOf('l', 3));
        System.out.println(s9.indexOf('l'));
        System.out.println(s9.lastIndexOf('l', 5));
        s5 = "";
        System.out.println(s5.isEmpty());

        String str = "Hello\n"+"Batman,\n" + "Joker\n" + "here\n";
        System.out.println(str.matches("(?s).*\\bJoker\\b.*"));

        String s10 = "Pattern";
        System.out.println(s10.replace('t','l'));
        System.out.println(s10.split(""));
        System.out.println(s10.length());

        System.out.println(s10.replaceAll("t","a"));

        System.out.println(s10.startsWith("Patt"));
        System.out.println(s10.startsWith("Patt",1));
        System.out.println(s10.substring(4));
        System.out.println(s10.substring(4,6));
        s10 = "    immutable    ";
        System.out.println(s10.trim()); // 返回字符串的副本，忽略前导空白和尾部空白

        System.out.println(String.valueOf(chars));
        System.out.println(String.valueOf(chars,1,3));
    }

    private static String toLowerCase(String origin) {
        char[] chars = origin.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char aChar = chars[i];
            if (aChar >= 'A' && aChar <= 'Z') {
                chars[i] += 32; // a-A=32;
            }
        }
        return new String(chars);
    }

    private static String toUpperCase(String origin) {
        char[] chars = origin.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char aChar = chars[i];
            if (aChar >= 'a' && aChar <= 'z') {
                chars[i] -= 32; // a-A=32;
            }
        }
        return new String(chars);
    }
}
