package exersise;

import java.util.Date;
import java.util.Hashtable;
import java.util.Random;

/**
 * Created by caoyuncong on
 * 2017/3/20 15:52
 * JavaSE_2017.
 */
// 随机生成[1， 20]数10000次，使用两种方法实现
// （java.lang.Math，java.util.Random），
// 并判断两种方法的效率和分布(hashtable)。
public class E34 {
    public static void main(String[] args) {
        Hashtable<Integer, Integer> hashtable = new Hashtable<>();
        for (int i = 0; i < 20; i++) {
            hashtable.put(i + 1, 0); // 控制
        }

        Random random = new Random();
        long start = System.nanoTime(); // 返回系统当前时间毫微秒数
        for (int i = 0; i < 10000; i++) {
            int r = (int) (Math.random() * 20) + 1;
//            int r = random.nextInt(20) + 1;
            hashtable.put(r, hashtable.get(r) + 1);
            System.out.println(r);
        }
        long end = System.nanoTime();
        System.out.println(end - start);

        System.out.println(System.currentTimeMillis());

        System.out.println((1500000000000L - System.currentTimeMillis()) / 1000 / 60 / 60 / 24);

        System.out.println(new Date(1500000000000L));


    }
}
