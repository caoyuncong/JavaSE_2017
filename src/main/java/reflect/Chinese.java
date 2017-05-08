package reflect;

/**
 * Created by caoyuncong on
 * 2017/5/3 16:58
 * JavaSE_2017.
 */
public class Chinese {
    private int i;

    public Chinese(int i) {
        this.i = i;
    }

    public void m(String s) {
        System.out.println(s);
    }

}

class ChineseTest {
    public static void main(String[] args) throws ClassNotFoundException {
        Chinese chinese = new Chinese(10);
        Class<Chinese> chineseClass1 = Chinese.class;
        Class chineseClass2 = chinese.getClass();
        Class chineseClass3 = Class.forName("reflect.Chinese");

    }
}
