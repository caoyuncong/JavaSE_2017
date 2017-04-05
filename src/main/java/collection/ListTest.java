package collection;

import java.util.ArrayList;

/**
 * Created by caoyuncong on
 * 2017/3/31 11:46
 * JavaSE_2017.
 */
public class ListTest extends ArrayList{
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("hi");
        arrayList.add("hello");
        arrayList.add("dudu");

        System.out.println(arrayList.get(0)); // 返回此列表中指定位置上的元素。
        System.out.println(arrayList.size());
        System.out.println(arrayList.contains("hello"));
        System.out.println(arrayList.indexOf("hello"));
        System.out.println(arrayList.lastIndexOf("hello"));
        System.out.println(arrayList.remove(0));
        System.out.println(arrayList.get(1));
        System.out.println("-------------------------");
        System.out.println(arrayList.set(1, "test"));
        System.out.println(arrayList.get(1));
        System.out.println(arrayList.isEmpty());
        System.out.println(arrayList.size());
        for (String s : arrayList) {
            System.out.println(s);
        }

        System.out.println();

//        Object[] objects = arrayList.toArray();

//        ListTest listTest = new ListTest();
//        for (int i = 0; i < 10; i++) {
//            listTest.add("" + i);
//        }
//        listTest.removeRange(3, 5); // 移除列表中索引在 fromIndex（包括）和
//                                    // toIndex（不包括）之间的所有元素。
//        for (Object o : listTest) {
//            System.out.println(o);
//        }
    }
}
