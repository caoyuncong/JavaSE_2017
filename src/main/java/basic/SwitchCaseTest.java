package basic;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/3/10.
 */
public class SwitchCaseTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input: A B C D");
        String s = scanner.nextLine();

        switch (s) {
            case "A":
                System.out.println("[90,100]");
                break;
            case "B":
                System.out.println("[80,90)");
                break;
            case "C":
                System.out.println("[60,80)");
                break;
            case "D":
                System.out.println("[0,60)");
            default:
                System.out.println("输入错误。");
                break;
        }

        if (s.equals("A")) {
            System.out.println("[90,100]");
        } else if (s.equals("B")) {
            System.out.println("[80,90)");
        } else if (s.equals("C")) {
            System.out.println("[60,80)");
        } else {
            System.out.println("[0,60)");
        }
    }
}
