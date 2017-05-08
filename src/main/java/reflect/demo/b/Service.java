package reflect.demo.b;

/**
 * Created by caoyuncong on
 * 2017/5/5 10:02
 * JavaSE_2017.
 */
public class Service {
    private DeviceWriter deviceWriter;

    public Service(DeviceWriter deviceWriter) {
        this.deviceWriter = deviceWriter;
    }

    public void setDeviceWriter(DeviceWriter deviceWriter) {
        this.deviceWriter = deviceWriter;
    }

    public void write() {
        deviceWriter.writeToDevice();
    }
}
