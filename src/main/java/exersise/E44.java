package exersise;

/**
 * Created by caoyuncong on
 * 2017/3/21 14:50
 * JavaSE_2017.
 */
// 一个偶数总能表示为两个素数之和
public class E44 {
    public static void main(String[] args) {
        int n = 20;
        for (int i = 2; i < n / 2; i++) {
            if ((n % i != 0) && ((n - i) % i != 0)) {
                System.out.println(n = i + (n - i));
                break;
            }
//            if (n % i == 0) {
//                break;
//            } else {
//                if ((n - i) % i == 0) {
//                    break;
//                } else {
//                    System.out.println(n = i + (n - i));
//                }
//            }
        }
    }
}
