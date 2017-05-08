package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by caoyuncong on
 * 2017/4/18 10:38
 * JavaSE_2017.
 */
public class InputStreamTest {
    public static void main(String[] args) {
        InputStream inputStream=null;
        try {
            inputStream = new FileInputStream("");
            int i;
            while ((i = inputStream.read()) != -1) {
                System.out.println((char) i);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        }
    }
}
