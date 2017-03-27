package exersise;

/**
 * Created by caoyuncong on
 * 2017/3/21 14:51
 * JavaSE_2017.
 */
// 输出9*9口诀。
public class E16 {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                if (i >= j) {
                    System.out.print(i * j + "\t");
                }
            }
            System.out.println();
        }
    }
}
