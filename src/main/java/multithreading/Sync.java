package multithreading;

/**
 * Created by caoyuncong on
 * 2017/5/10 17:20
 * JavaSE_2017.
 */
public class Sync {
    public synchronized void waitTest() {
        System.out.println(Thread.currentThread().getName() + "wait start...");
        try {
//            Thread.sleep(1000);
            this.wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + "wait end...");
    }

    public synchronized void notifyTest() {
        System.out.println(Thread.currentThread().getName() + "notify start...");
        this.notify();
        System.out.println(Thread.currentThread().getName() + "notify end...");
    }

}

class SyncTest implements Runnable {
    private static Sync sync = new Sync();

    @Override
    public void run() {
//        sync = new Sync();
        if (Thread.currentThread().getName().endsWith("9")) {
            sync.notifyTest();
            return;
        }
        sync.waitTest();
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            Thread thread = new Thread(new SyncTest(), "thread " + i);
            thread.start();
        }
    }
}