package basic;

import java.math.BigDecimal;

/**
 * Created by caoyuncong on
 * 2017/3/21 16:17
 * JavaSE_2017.
 */
public class DoubleTest {
    public static void main(String[] args) {
        BigDecimal bigDecimal1 = new BigDecimal("1.0");
        BigDecimal bigDecimal2 = new BigDecimal("0.9");
        System.out.println(bigDecimal1.subtract(bigDecimal2));
    }
}
