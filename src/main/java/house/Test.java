package house;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by caoyuncong on
 * 2017/5/5 17:50
 * JavaSE_2017.
 */
public class Test {
    private static final String DONGCHENG_URL = "http://bj.lianjia.com/ershoufang/dongcheng/";
    private static final String IMAGE_REGEXP = "http://[a-z0-9./:-]+232x174\\.jpg";
    public static void main(String[] args) throws MalformedURLException {
        URL url = new URL(DONGCHENG_URL);
        try (BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(url.openStream()))){
            String line;
            int counter = 0;
            Pattern pattern = Pattern.compile(IMAGE_REGEXP);
            Matcher matcher = null;
            while ((line = bufferedReader.readLine()) != null) {
                if (line.contains("data-original")) {
                    matcher = pattern.matcher(line);
                    while (matcher.find()) {
                        System.out.println(matcher.group());
                        counter++;
                    }
                }
            }
            System.out.println(counter);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
