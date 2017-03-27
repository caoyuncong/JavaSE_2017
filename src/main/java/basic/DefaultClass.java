package basic;

/**
 * Created by caoyuncong on
 * 2017/3/20 14:41
 * JavaSE_2017.
 */
public class DefaultClass {
    private int i;

    private void method() {
        System.out.println(i);
    }

    public static void main(String[] args) {
        DefaultClass defaultClass=new DefaultClass();
        System.out.println(defaultClass.i);
    }
}

class DefaultClassTest {
    public boolean b;

    public static void main(String[] args) {
        DefaultClass defaultClass=new DefaultClass();
    }
}