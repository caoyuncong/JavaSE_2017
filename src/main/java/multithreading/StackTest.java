package multithreading;

import java.util.Stack;

/**
 * Created by caoyuncong on
 * 2017/5/12 19:23
 * JavaSE_2017.
 */
public class StackTest {
    public static void main(String[] args) {
        // stack 堆栈\ [stæk] LIFO Last In First Out
        // queue 队列\ [kjuː] FIFO First In Fist Out
        Stack<String> strings = new Stack<>();
        strings.push("hello");// push 推\ [pʊʃ]
        strings.push("test");
        strings.push("hi");

        System.out.println(strings.pop());// pop 流行\ [pɒp] 弹出
        System.out.println(strings.pop());
        System.out.println(strings.pop());

    }
}
