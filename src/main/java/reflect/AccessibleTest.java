package reflect;

import java.lang.reflect.Field;

/**
 * Created by caoyuncong on
 * 2017/5/4 9:05
 * JavaSE_2017.
 */
public class AccessibleTest {
    public static void main(String[] args) throws NoSuchFieldException, ClassNotFoundException, IllegalAccessException {
        Person person = new Person(29);

        Field age = Class.forName("reflect.Person").getDeclaredField("age");
        age.setAccessible(true);
        System.out.println(age.get(person));
    }
}

class Person {
    private int age;

    public Person(int age) {
        this.age = age;
    }
}