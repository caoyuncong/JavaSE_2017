package next;

import basic.PrivateField;

import java.util.Calendar;

/**
 * Created by caoyuncong on
 * 2017/3/23 11:44
 * JavaSE_2017.
 */
//输出某年每月的日历
//    patience
//    courage
//    confidence
//    discipline
//    compassion
public class CalendarTest {
    private static final int YEAR = 2017;

    public static void printMonth(int month) {
        System.out.println("\n\n\t\t" + YEAR + "年" + (month + 1) + "月");
        System.out.println("一\t" + "二\t" + "三\t" + "四\t" + "五\t" + "六\t" + "日\t");
        Calendar calendar = Calendar.getInstance();
        calendar.set(2017, 0, 8);
        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
        for (int i = 0; i < (5 + dayOfWeek) % 7; i++) {
            System.out.println("\t");
        }
        int dayOfMonth = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
        for (int i = 0; i < dayOfMonth; i++) {
            System.out.printf("%2d", i + 1);
            System.out.print("\t");
            if ((i + 1 + (5 + dayOfWeek) % 7) % 7 == 0) {
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 12; i++) {
            printMonth(i);
        }

    }
}
