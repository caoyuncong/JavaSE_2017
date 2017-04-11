package next;

/**
 * Created by caoyuncong on
 * 2017/4/7 10:06
 * JavaSE_2017.
 */
public class Main {
    public static void main(String[] args) {
        Foo f = new Foo("f");
        System.out.println(f.getS()); // "f"
        changeReference(f);
//        modifyReference(f);
        System.out.println(f.getS()); // "f"
    }

    private static void changeReference(Foo a) {
        Foo b = new Foo("b");
        a = b;
    }

    private static void modifyReference(Foo c) {
        c.setAttribute("c");
    }
}

class Foo {
    private String s;

    public Foo(String s) {
        this.s = s;
    }

    public void setAttribute(String s) {
        this.s = s;
    }

    public String getS() {
        return s;
    }
}
//        System.out.println(a.getS()); // "f"
