package multithreading;

/**
 * Created by caoyuncong on
 * 2017/5/8 9:22
 * JavaSE_2017.
 */
public class Test implements Runnable{
    public static void main(String[] args) {
        // process 进程
        // thread 线程
//        run();
        Test test = new Test();
        Thread thread = new Thread(test);
        thread.start();
        System.out.println("test...");
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }

//    private static void run() {
//        for (int i = 0; i < 10; i++) {
//            System.out.println(i);
//        }
//    }
}
