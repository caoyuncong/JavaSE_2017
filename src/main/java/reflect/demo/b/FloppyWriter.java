package reflect.demo.b;

/**
 * Created by caoyuncong on
 * 2017/5/5 9:59
 * JavaSE_2017.
 */
public class FloppyWriter implements DeviceWriter {

    @Override
    public void writeToDevice() {
        System.out.println("write to floppy...");
    }
}
