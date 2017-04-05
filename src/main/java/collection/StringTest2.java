package collection;

/**
 * Created by caoyuncong on
 * 2017/3/29 10:22
 * JavaSE_2017.
 */
public class StringTest2 {
    public static void main(String[] args) {
        String s = "hello world!";
        // match 匹配\ [mætʃ]
        System.out.println(s.matches("\\w+"));

        System.out.println(s.contains("he"));

        System.out.println(s.equals("hello"));
//        replace  取代\ [rɪ'pleɪs]

        System.out.println(s.replace("l", "a"));
        System.out.println(s.replaceAll("ll", "a"));
        System.out.println(s.replaceAll("[l]+","a"));

        System.out.println(s.replaceFirst("ll","a"));
        // split 分裂\ [splɪt]
        String[] strings = s.split("\\s+"); // space 空格
        System.out.println(strings.length);

        for (String string : strings) {
            System.out.println(string);
        }

//        System.out.println("boo:and:foo".split("o",4).);
    }
}
