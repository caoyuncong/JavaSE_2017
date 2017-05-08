package multithreading;

/**
 * Created by caoyuncong on
 * 2017/5/8 10:12
 * JavaSE_2017.
 */
public class SubThread extends Thread {
    public static void main(String[] args) {
        SubThread subThread = new SubThread();
        subThread.start();
        System.out.println("test...");
    }

    @Override
    public void run() {
        for (int i = 0; i <10; i++) {
            System.out.println(i);
        }
    }
}
