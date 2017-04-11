package test;

/**
 * Created by caoyuncong on
 * 2017/4/7 14:57
 * JavaSE_2017.
 */
public class StringTest2 {
    public static void main(String[] args) {
        String string = "helllo";
        System.out.println(string.charAt(3));
        /*
charAt
concat
contains
endsWith
equals
indexOf
lastIndexOf
length
replace
split
startWith
subString
toCharArray
toLowerCase
toUpperCase
trim
valueOf
 */
        System.out.println(string.concat("you"));
        System.out.println(string.contains("h"));
        System.out.println(string.endsWith("o"));
        System.out.println(string.equals("helllo"));
        System.out.println(string.indexOf('l'));
        System.out.println(string.lastIndexOf('l'));
        System.out.println(string.length());
        System.out.println(string.replace('l', 'a'));
        System.out.println(string.split("lll"));
        System.out.println("---------->"+string.startsWith("h"));
        System.out.println(string.substring(2));
        System.out.println(string.toCharArray());
        System.out.println("ffFFFFFF".toLowerCase());
        System.out.println(string.toUpperCase());
        System.out.println("    jjjjjjjj    ".trim());
        System.out.println(String.valueOf(string.toCharArray()));
        System.out.println(string.codePointAt(2));
        System.out.println(string.codePointBefore(2));
        System.out.println(string.toString());
    }
}
