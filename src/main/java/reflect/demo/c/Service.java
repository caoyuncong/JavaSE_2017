package reflect.demo.c;

import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * Created by caoyuncong on
 * 2017/5/5 10:51
 * JavaSE_2017.
 */
public class Service {

    public void write()  {
        Properties properties = new Properties();
        try {
            properties.load(new FileReader("src/main/java/reflect/demo/c/config.properties"));
            String className = properties.getProperty("className");
            String methodName = properties.getProperty("methodName");

            Class clazz = Class.forName(className);
            Method method = clazz.getDeclaredMethod(methodName);
            Constructor constructor = clazz.getDeclaredConstructor();
            method.invoke(constructor.newInstance());
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException | IOException e) {
            e.printStackTrace();
        }
    }
}
