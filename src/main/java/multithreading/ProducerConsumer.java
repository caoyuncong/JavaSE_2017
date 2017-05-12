package multithreading;

import java.util.Stack;

/**
 * Created by caoyuncong on
 * 2017/5/12 19:28
 * JavaSE_2017.
 */
public class ProducerConsumer {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Thread producer1 = new Thread(new Producer(stack), "p1");
        Thread producer2 = new Thread(new Producer(stack), "p2");
        Thread consumer1 = new Thread(new Consumer(stack), "c1");
        Thread consumer2 = new Thread(new Consumer(stack), "c2");

        producer1.start();
        producer2.start();
        consumer1.start();
        consumer2.start();
    }
}

class Producer implements Runnable {
    private static final int MAX = 3;
    private Stack<Integer> stack;
    private static int data;

    public Producer(Stack<Integer> stack) {
        this.stack = stack;
    }

    @Override
    public void run() {
        synchronized (stack) {
            while (true) {
                if (stack.size() == MAX) {
                    try {
                        stack.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                } else {
                    System.out.println(Thread.currentThread().getName() + "produce" + stack.push(data++));
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                stack.notifyAll();
            }
        }
    }
}

class Consumer implements Runnable {
    private Stack<Integer> stack;

    public Consumer(Stack<Integer> stack) {
        this.stack = stack;
    }

    @Override
    public void run() {
        synchronized (stack) {
            while (true) {
                if (stack.isEmpty()) {
                    try {
                        stack.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                } else {
                    System.out.println(Thread.currentThread().getName() + "consume" + stack.pop());
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                stack.notifyAll();
            }
        }
    }
}