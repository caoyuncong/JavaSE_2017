package basic;

/**
 * Created by Administrator on 2017/3/7.
 */
public class RelationalOperators {
    public static void main(String[] args) {
        int x=1;
        int y=2;
        String s1 = "hi";
        String s2="hello";

        System.out.println(~x);
        // 00000...01  ->  11111...10==-2

        System.out.println(Integer.toBinaryString(-2));

        System.out.println(x>>y);
        System.out.println(x>>>y);
        int x1=-1;
        int y1=1;
        System.out.println(x1>>>y1); // 无符号右移 ，0填充
//        二进制正负转换： 取反加一
        // 先看1的二进制 ，后转换-1
        // 0000...01  1111...10  1111...11  0111...11
        System.out.println(x1>>y1); // 有符号右移
//        正数，0填充；负数，1填充

    }
}
