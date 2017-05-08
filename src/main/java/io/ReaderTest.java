package io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

/**
 * Created by caoyuncong on
 * 2017/4/20 9:25
 * JavaSE_2017.
 */
public class ReaderTest extends FileReader{

    public ReaderTest(String fileName) throws FileNotFoundException {
        super(fileName);
    }

    public static void main(String[] args) {

        try (Reader reader = new FileReader("test")) {

            int i;
            while ((i = reader.read()) != -1) {
                System.out.println((char) i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void close() throws IOException {
        super.close();
        System.out.println("closed.");
    }
}
