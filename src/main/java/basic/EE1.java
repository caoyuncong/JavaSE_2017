package basic;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by caoyuncong on
 * 2017/3/21 16:44
 * JavaSE_2017.
 */
// 猜数字
//    生成一个随机整数，
public class EE1 {

    private static int x;
    private static int counter;
    private static String result;

    public static void main(String[] args) {
        Random random = new Random();
        x = random.nextInt();
        System.out.println(x);
        guess();
    }

    private static void guess() {
        System.out.println("请输入一个数：");
        Scanner scanner = new Scanner(System.in);
        int y = scanner.nextInt();

        if (y > x) {
            System.out.println("大了");
            counter++;
            result = "大了";
            guess();
        } else if (y < x) {
            System.out.println("小了");
            result = "小了";
            counter++;
            guess();
        } else {
            System.out.println("猜对了！");
            counter++;
            System.out.println(counter);
        }
    }
}
