package io;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * Created by caoyuncong on
 * 2017/4/21 20:34
 * JavaSE_2017.
 */
public class RandomAccessFileTest {
    public static void main(String[] args) {
        try (RandomAccessFile randomAccessFile = new RandomAccessFile("raf", "rw")) {
            for (int i = 0; i < 10; i++) {
                randomAccessFile.writeDouble(i * 0.5);
            }
            // EOFException -> End of File
            randomAccessFile.seek(32L);
            System.out.println(randomAccessFile.readDouble());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
