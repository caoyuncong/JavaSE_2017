package basic;

/**
 * Created by Administrator on 2017/3/7.
 */
public class PrimitiveDataType {
    public static void main(String[] args) {
        byte b = 1;
        char c = 2;
        short s = 3;
        int i = 4;
        long l = 5; // [-9223372036854775808,9223372036854775807]
        System.out.println(Long.MIN_VALUE +","+ Long.MAX_VALUE);
        System.out.println(Short.MIN_VALUE +","+ Short.MAX_VALUE);
        System.out.println((int)Character.MIN_VALUE +","+ (int)Character.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE +","+ Integer.MAX_VALUE);
        System.out.println(Byte.MIN_VALUE +","+ Byte.MAX_VALUE);
    }


}
