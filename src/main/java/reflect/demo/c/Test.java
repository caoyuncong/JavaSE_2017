package reflect.demo.c;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

/**
 * Created by caoyuncong on
 * 2017/5/5 10:52
 * JavaSE_2017.
 */
public class Test {
    public static void main(String[] args) throws NoSuchMethodException, IOException, NoSuchFieldException, InstantiationException, IllegalAccessException, InvocationTargetException, ClassNotFoundException {
        Service service = new Service();
        service.write();

    }
}
