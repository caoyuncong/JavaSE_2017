package basic;

/**
 * Created by Administrator on 2017/3/15.
 */
public class Human {
    private char gender;
    private String name;
    private int age;

    public void sing() {
        name="cao";
        gender='女';
        age=22;
        System.out.println(name);
    }

    public void work() {

    }

    public static void main(String[] args) {
        Human human=new Human();
        human.sing();
    }
}
