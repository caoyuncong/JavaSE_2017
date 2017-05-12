/**
 * Created by caoyuncong on
 * 2017/5/11 21:56
 * JavaSE_2017.
 */
public class T2 {
    public static void main(String[] args) {
        System.out.println(reverse("fkkfkflf"));
    }

    public static String reverse(String input) {
        int i, len = input.length();
        StringBuilder dest = new StringBuilder(len);
        for (int j = (len - 1); j >= 0; j--) {
            dest.append(input.charAt(j));
        }
        return dest.toString();
    }
}
