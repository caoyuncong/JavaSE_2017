package exersise;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/3/14.
 */

public class E3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input n:");
        int n = scanner.nextInt();
        for (int i = n - 1; i == n ; i++) {
            int a = i / n;
            int b = i / (n-1) % 10;
//            int c = i % ;
            if (i == b * b * b ) {
                System.out.println(i);
            }
        }
    }
}
