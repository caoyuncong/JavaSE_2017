package next;


/**
 * Created by caoyuncong on
 * 2017/4/6 11:56
 * JavaSE_2017.
 */
public class Mankind {
    int anInt;
    static int j;
}

class NewTest {
    public static void main(String[] args) {
        Mankind mankind = new Mankind();
//        System.out.println(mankind.anInt);
        mankind.j = 1;

        Mankind mankind1 = new Mankind();
//        System.out.println(mankind1.anInt);
        mankind1.j = 2;
        System.out.println(mankind.j);
        System.out.println(mankind1.j);
    }
}