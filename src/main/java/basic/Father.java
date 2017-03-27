package basic;

/**
 * Created by Administrator on 2017/3/16.
 */
public class Father {
    int money;

    public void coding() {
        System.out.println("father is coding ");
    }
}

class Son extends Father {

}

class ExtendsTest {
    public static void main(String[] args) {
        Father father=new Father();
        System.out.println(father.money);
        father.coding();

        Son son=new Son();
        System.out.println(son.money);
        son.coding();
    }

}