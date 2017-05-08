package reflect;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/**
 * Created by caoyuncong on
 * 2017/5/5 15:22
 * JavaSE_2017.
 */
public class Father<C> {

    public Father() {
//        System.out.println(
//                ((Class) (((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0])).getSimpleName()
//        );

        System.out.println(
                ((Class)(((ParameterizedType)getClass().getGenericSuperclass()).getActualTypeArguments()[0])).getSimpleName()
        );

    }
}

class SonA extends Father<Doctor>{}
class SonB extends Father<Programmer>{}
class SonC extends Father<Programmer>{}

class SonD extends Father<Lawyer>{}

class Doctor{}

class Lawyer{}

class Programmer{}

class SonTest {
    public static void main(String[] args) {
        SonA sonA = new SonA();
        SonB sonB = new SonB();
        SonC sonC = new SonC();
        SonD sonD = new SonD();

        //Doctor
        Class clazz = sonA.getClass();
        Type type = clazz.getGenericSuperclass();
        ParameterizedType parameterizedType = (ParameterizedType) type;
        Type[] types = parameterizedType.getActualTypeArguments();
        Type t = types[0];
        Class aClass = (Class) t;
//        System.out.println(aClass.getSimpleName());
    }
}