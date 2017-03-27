package exersise;

/**
 * Created by Administrator on 2017/3/17.
 */
// 求解汉诺塔 n 圆盘移动步骤
public class E52 {
    private int counter;
    public void hanoi(int n, String src, String use, String dest) {
        if (n == 1) {
            System.out.println(src + "-" + dest);
            counter++;
        } else {

        }
    }

    public static void main(String[] args) {
        E52 e52 = new E52();
        e52.hanoi(20,"A","B","C");

    }
}
