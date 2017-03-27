package exersise;

/**
 * Created by caoyuncong on
 * 2017/3/16 9:59.
 */
public class E21 {
    public int getValue(int n) {
        if (n == 1) {
            return 1;
        }
        return getValue(n-1)*n+getValue(n-2)*n-1;
    }
    public static void main(String[] args) {
        E22 e22=new E22();
        System.out.println(e22.getValue(5));
    }

}
