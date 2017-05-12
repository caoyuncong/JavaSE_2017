package multithreading;

/**
 * Created by caoyuncong on
 * 2017/5/9 10:22
 * JavaSE_2017.
 */
public class PriorityTest implements Runnable{
    public static void main(String[] args) {
        Thread thread1 = new Thread(new PriorityTest(), "thread 1");
        Thread thread2 = new Thread(new PriorityTest(), "thread 2");
        Thread thread3 = new Thread(new PriorityTest(), "thread 3");

        thread1.setPriority(1);
        thread2.setPriority(5);
        thread3.setPriority(10);

        thread1.start();
        thread2.start();
        thread3.start();
    }

    @Override
    public void run() {
        Thread currThread = Thread.currentThread();
        for (int i = 0; i < 10; i++) {
            System.out.println(currThread.getName()+":"+currThread.getPriority());
        }
    }
}
