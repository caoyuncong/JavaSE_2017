package reflect.demo.c;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

/**
 * Created by caoyuncong on
 * 2017/5/5 10:50
 * JavaSE_2017.
 */
public class PropertiesTest {
    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();
        properties.load(new FileReader("src/main/java/reflect/demo/c/config.properties"));
        System.out.println(properties.getProperty("key"));
        System.out.println(properties.getProperty("k"));
    }
}
