package reflect.demo.b;

/**
 * Created by caoyuncong on
 * 2017/5/5 10:04
 * JavaSE_2017.
 */
public class Test {
    public static void main(String[] args) {
        Service service = new Service(new PortableHdWriter());
        service.write();
    }
}
