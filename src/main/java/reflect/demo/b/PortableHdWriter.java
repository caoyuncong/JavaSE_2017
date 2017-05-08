package reflect.demo.b;

/**
 * Created by caoyuncong on
 * 2017/5/5 10:00
 * JavaSE_2017.
 */
public class PortableHdWriter implements DeviceWriter{

    @Override
    public void writeToDevice() {
        System.out.println("write to portable HD...");
    }
}
