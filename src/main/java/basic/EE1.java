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

    public static void main(String[] args) {
        int counter = 0;

        Random random = new Random();
        int x = random.nextInt();
        System.out.println(x);

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入整数：");
        int y = scanner.nextInt();

        if (x > y) {
            System.out.println("小了！");
            counter++;
            System.out.println("请输入整数：");
            y = scanner.nextInt();
        } else if (x < y) {
            System.out.println("大了！");
            counter++;
            System.out.println("请输入整数：");
            y = scanner.nextInt();
        } else {
            System.out.println("对了！");
            counter++;
        }
    }
}
