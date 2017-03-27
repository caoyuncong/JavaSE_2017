package exersise;

/**
 * Created by Administrator on 2017/3/16.
 */
public class E22 { // 5!=5*4!
    public int getValue(int n) {
        if (n == 1) {
            return 1;
        }
        return getValue(n-1)*n;
    }
    public static void main(String[] args) {
        E22 e22=new E22();
        System.out.println(e22.getValue(5));
    }
}
