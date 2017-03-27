package basic;

/**
 * Created by caoyuncong on
 * 2017/3/20 14:26
 * JavaSE_2017.
 */
public class PrivateField {
    private int x;
    private int y;

    public int divide() { // 除法
        return x / y;
    }

    public int add() {
        return x+y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        if (y == 0) {
            System.out.println("y can not be zero!");
            return;
        }
        this.y = y;
    }
}

class PrivateFieldTest {
    public static void main(String[] args) {
        PrivateField privateField =new PrivateField();

        privateField.setX(1);
        privateField.setY(0);

        System.out.println(privateField.divide());
        System.out.println(privateField.add());

    }
}
