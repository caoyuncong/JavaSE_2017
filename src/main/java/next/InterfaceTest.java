package next;

/**
 * Created by caoyuncong on
 * 2017/3/23 9:31
 * JavaSE_2017.
 */
public interface InterfaceTest {
    public static final int I=2;

    public abstract void m();
}

interface A {
    void a();
}
interface B {
    void b();
}
interface D {
    void d();
}
interface C {
    void c();
}

class InterfaceTestImpl implements InterfaceTest, A, B, C, D {

    @Override
    public void m() {

    }

    @Override
    public void a() {

    }

    @Override
    public void b() {

    }

    @Override
    public void d() {

    }

    @Override
    public void c() {

    }
}