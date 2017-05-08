package exception;

/**
 * Created by caoyuncong on
 * 2017/4/17 9:46
 * JavaSE_2017.
 */
public class Test {
    public static void main(String[] args) {
        try {
            System.out.println("hello".charAt(5)); //java.lang.StringIndexOutOfBoundsException:
            System.out.println(new int[]{1, 2, 3}[3]);
            // Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException:
            System.out.println(1 / 0); // java.lang.ArithmeticException:

            String s = null;
            System.out.println(s.charAt(0)); // Exception in thread "main"
//             java.lang.NullPointerException
            System.out.println(Integer.valueOf("o12")); // java.lang.NumberFormatException:

        } catch (StringIndexOutOfBoundsException e) {
            e.printStackTrace();
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        } catch (ArithmeticException e) {
            e.printStackTrace();
        } catch (NullPointerException e) {
            e.printStackTrace();
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }


    }

}
