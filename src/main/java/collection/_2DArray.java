package collection;

/**
 * Created by caoyuncong on
 * 2017/3/28 9:16
 * JavaSE_2017.
 */
public class _2DArray {
    public static void main(String[] args) {
        int[][] ints = new int[3][5];
        for (int i = 0; i < ints.length; i++) {
            for (int j = 0; j < ints[i].length; j++) {
                System.out.print(ints[i][j] + "\t");
            }
            System.out.println();
        }
        /*
        1,2,3,4,5
        1
        1,2,3
        1,2,3,4
         */
        String[][] strings=new String[4][];
        strings[0] = new String[5];
        strings[1] = new String[1];
        strings[2] = new String[3];
        strings[3] = new String[4];

        double[][] doubles=
                {

                };

    }
}
