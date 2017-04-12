package collection;

import java.util.ArrayList;
import java.util.ListIterator;

/**
 * Created by caoyuncong on
 * 2017/4/12 11:33
 * JavaSE_2017.
 */
public class ListIteratorTest {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("a");
        strings.add("b");
        strings.add("c");
        strings.add("d");
        strings.add("e");

        ListIterator<String> listIterator = strings.listIterator();
        System.out.println(listIterator);
        //next
        while (listIterator.hasNext()) {
            listIterator.add("hjj");
            System.out.println(listIterator.next());
        }

        //prev
//        while (lis +tIterator.hasPrevious()) {
//            System.out.println(listIterator.previous());
//        }

        //add

        //index


    }
}
