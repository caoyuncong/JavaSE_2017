package collection;

/**
 * Created by caoyuncong on
 * 2017/3/29 20:19
 * JavaSE_2017.
 */
public class T {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = new String(s1);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s1.equals(s2)); // true
        System.out.println(s1 == s2); // false
        String s3 = "hello";
        System.out.println(s1 == s3); // true

        /*
        String pool 池  \ [puːl] 字符串池
        s1-----
              |
        -----------------------------
        | "hello" "hello"           |
        | "test..." "test" "hi"     |
        -------------------------------
            C语言 1.memory leak 内存泄露  pointer 指针
            Java gc garbage collection 垃圾回收机制

         */
        String s = "test...";
        System.out.println(s); // test...
        s = "hi";
        System.out.println(s); // hi

    }
}
