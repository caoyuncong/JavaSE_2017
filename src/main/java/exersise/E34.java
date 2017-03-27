package exersise;

import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Created by caoyuncong on
 * 2017/3/20 15:52
 * JavaSE_2017.
 */
// 随机生成[1， 20]数10000次，使用两种方法实现
// （java.lang.Math，java.util.Random），
// 并判断两种方法的效率和分布。
public class E34 {
    public static void main(String[] args) {
        long start=System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            int n=(int)(Math.random()*20+1);

        }
        long end=System.currentTimeMillis();
        System.out.println();
    }
}
