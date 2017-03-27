package enter;

/**
 * Created by caoyuncong on
 * 2017/3/21 8:58
 * JavaSE_2017.
 */
// 抽象：抽取“像”的部分
//可以修饰类和方法
public abstract class AbstractTest {
    private int i; // modifier 修饰符

    public abstract void method();

    public void method1() {

    }
    public static void main(String[] args) {
        SubAbstractTest subAbstractTest=new SubAbstractTest();
        System.out.println(subAbstractTest);
        subAbstractTest.method();
    }
}

class SubAbstractTest extends AbstractTest {
    @Override
    public void method() {
        System.out.println("in SubAbstractTest...");
    }

    @Override
    public void method1() {
        super.method1();
    }
}