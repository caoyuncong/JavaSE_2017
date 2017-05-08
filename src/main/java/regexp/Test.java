package regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by caoyuncong on
 * 2017/4/27 8:59
 * JavaSE_2017.
 */
public class Test {
    public static void main(String[] args) {

//        Pattern pattern = Pattern.compile("(?i)l");
        Pattern pattern = Pattern.compile("\\p{Lower}");
//        Pattern pattern = Pattern.compile("l",Pattern.CASE_INSENSITIVE);

        Matcher matcher = pattern.matcher("heLlo");

//        System.out.println(matcher.find());

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
