package next;

import sun.text.resources.cldr.ia.FormatData_ia;

/**
 * Created by caoyuncong on
 * 2017/3/24 9:00
 * JavaSE_2017.
 */
public class ScopeTest {
    public void m() {
//        System.out.println(j);
//        int j = 0;
        for (int k = 0; k < 10; k++) {
            System.out.println(k);
        }
           int p=5;
        for (int k = 0; k < 10; k++) {
            if (p ==k) {
                break;
            }
            System.out.println(k+p);

        }
    }

    public static void main(String[] args) {
        ScopeTest scopeTest=new ScopeTest();
        scopeTest.m();
    }

    private int i;

    public void exceptionTest() {
        try {
            String s = "hello";
            s="hi";

        } catch (Exception e) {

        }finally {
        }
    }


}
