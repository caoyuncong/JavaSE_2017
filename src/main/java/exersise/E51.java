package exersise;

/**
 * Created by Administrator on 2017/3/15..0
 */
// 斐波那契数列
// 1,1,2,3,5,8,13,21,34,... f(n)
public class E51 {

    /**
     *求fibonacci 数列的第n 项
     * f(n)=1(n=1,n=2)
     * f(n)=f(n-2)+f(n-1)(n>2)
     *   recursive call 递归调用
     * @param n 数列的第n 项
     * @return fibonacci(n)
     */
    public int fibonacci(int n) {
        if (n == 1 || n == 2) {
            return 1;
        } else {
            return fibonacci(n - 2) + fibonacci(n - 1);
        }
    }
    public static void main(String[] args) {
        E51 e51=new E51();
        System.out.println(e51.fibonacci(5));

    }
}
