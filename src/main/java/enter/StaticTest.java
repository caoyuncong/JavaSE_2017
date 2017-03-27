package enter;

/**
 * Created by caoyuncong on
 * 2017/3/22 9:08
 * JavaSE_2017.
 */
public class StaticTest {
    public static void main(String[] args) {
        Mankind tom = new Mankind();
//        tom.age=18;
//        tom.name = "Tom";
//        tom.married=true;
        System.out.println(tom.age);
        System.out.println(tom.name);
        System.out.println(tom.married);

        Mankind jerry=new Mankind();
        jerry.name = "Jerry";
//        jerry.age=16;
        jerry.married=true;
        System.out.println(jerry.name);
        System.out.println(jerry.age);
        System.out.println(jerry.married);

    }
}

class Mankind {
    public String name;
    public int age;
    public static boolean married;
}