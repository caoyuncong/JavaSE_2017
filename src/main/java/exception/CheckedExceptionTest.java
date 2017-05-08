package exception;

import java.io.FileNotFoundException;
import java.io.RandomAccessFile;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by caoyuncong on
 * 2017/4/18 9:13
 * JavaSE_2017.
 */
public class CheckedExceptionTest {
    public static void main(String[] args) {
        test();
    }

    private static void test() {
        // extract method Ctrl+Alt+m
        System.out.println("input a file name: ");
        Scanner scanner = new Scanner(System.in);
        String fileName = scanner.nextLine();
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile("","");
        } catch (FileNotFoundException e) {
            System.err.println("file not found.");
            test();
        }
    }


}
