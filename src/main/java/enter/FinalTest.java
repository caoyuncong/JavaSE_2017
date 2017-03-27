package enter;

/**
 * Created by caoyuncong on
 * 2017/3/21 15:29
 * JavaSE_2017.
 */
public class FinalTest {
//    final 最后的 最终的 终态
    private final int i;
//    终态的域
//    只能在声明时或构造方法中被初始化
//    初始化之后值不能再被修改

//    public FinalTest() {
//        i=0;
//    }

    public FinalTest(int i) {
        this.i = i;
    }
}

//class SubFinalTest extends FinalTest { // 终态的类不能再被子类化

//    public SubFinalTest(int i) {
//        super(i);
//    }
//}