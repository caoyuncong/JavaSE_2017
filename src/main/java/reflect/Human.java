package reflect;

import java.lang.reflect.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

/**
 * Created by caoyuncong on
 * 2017/5/3 17:38
 * JavaSE_2017.
 */
class Animals {
    public int age;
    private double weight;

    public Animals() {
    }

    public Animals(int age, double weight) {
        this.age = age;
        this.weight = weight;
    }

    public int sleep(int hours) {
        return hours;
    }

    public void eat(String food) {
        System.out.println("eating"+food);
    }

    private void killHuman() {
        System.out.println("killed a poor guy...");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}

public class Human extends Animals {
    public String name;
    private boolean married;

    public Human() {
    }

    public Human(int age, double weight, String name, boolean married) {
        super(age, weight);
        this.name = name;
        this.married = married;
    }

    @Override
    public void eat(String food) {
        System.out.println(name+"is now eating "+food);
    }

    public void study(String animal) {
        System.out.println(name+"is now killing "+animal);
    }

    private void killAnimals(String animal) {
        System.out.println(name + "is now killing " + animal);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isMarried() {
        return married;
    }

    public void setMarried(boolean married) {
        this.married = married;
    }
}

class HumanTest {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class clazz = Human.class;

        Constructor[] constructors = clazz.getConstructors();
        System.out.println("---getConstructors()---");
        for (Constructor constructor : constructors) {
            System.out.println(constructor.getName());
            for (Parameter parameter : constructor.getParameters()) {
                System.out.println("\t"+parameter.getName());
            }
        }

        Constructor[] declaredConstructors = clazz.getDeclaredConstructors();
        System.out.println("---getDeclaredConstructors()---");
        for (Constructor constructor : declaredConstructors) {
            System.out.println(constructor.getName());
            for (Parameter parameter : constructor.getParameters()) {
                System.out.println("\t"+parameter.getName());
            }
        }

        Constructor constructor = clazz.getDeclaredConstructor(int.class, double.class, String.class, boolean.class);
        System.out.println(constructor.getName());
        for (Parameter parameter : constructor.getParameters()) {
            System.out.println(parameter);
        }
//        constructor-object
        Human human = (Human) constructor.newInstance(20, 30, "Tom", false);
        System.out.println(human.getAge());
    }


//    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
//        Class clazz = Human.class;
//
//        Method[] methods = clazz.getMethods();
//        for (Method method : methods) {
//            System.out.println(method);
//        }
//        System.out.println("-----");
//
//        Method[] declaredMethods = clazz.getDeclaredMethods();
//        for (Method declaredMethod : declaredMethods) {
//            System.out.println(declaredMethod);
//        }
//
//        Human human = new Human();
//        human.setName("Jerry");
//        Method method = clazz.getDeclaredMethod("killAnimals", String.class);
//        method.setAccessible(true);
//        method.invoke(human, "cat");
//    }


//    public static void main(String[] args) throws NoSuchFieldException {
//        Class clazz = Human.class;
//        Field field = clazz.getDeclaredField("married");
//        System.out.println(Modifier.toString(field.getModifiers()));
//    }














//    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
//        Human human = new Human();
//        Class clazz = human.getClass();
//        Field[] fields = clazz.getFields();
//        System.out.println("------getFields()----");
//        for (Field field : fields) {
//            System.out.println(field.getName());
//        }
//        Field[] declaredFields = clazz.getDeclaredFields();
//        System.out.println("------getDeclaredFields()----");
//        for (Field declaredField : declaredFields) {
//            System.out.println(declaredField.getName());
//        }
//
//        List<Integer> list = new ArrayList<>();
//        Field array = list.getClass().getDeclaredField("elementData");
//        array.setAccessible(true);
//        System.out.println("list capacity:" +((Object[])array.get(list)).length);
//    }


}