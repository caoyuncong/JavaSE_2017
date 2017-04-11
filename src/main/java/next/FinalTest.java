package next;

/**
 * Created by caoyuncong on
 * 2017/4/6 10:47
 * JavaSE_2017.
 */
public final class FinalTest {
    private int i;



    public final void m() {
        i = 0;
    }

    public static void main(String[] args) {
        FinalTest finalTest = new FinalTest();
        System.out.println(finalTest.i);
    }

}

//class SubFinalTest extends FinalTest{
//    @Override
//    public void m() {
//        super.m();
//    }
//}
