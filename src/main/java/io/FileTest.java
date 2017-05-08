package io;

import java.io.File;
import java.io.IOException;

/**
 * Created by caoyuncong on
 * 2017/4/21 11:38
 * JavaSE_2017.
 */
public class FileTest {
    public static void main(String[] args) {
        File file = new File("src/main/java");
//        System.out.println(file.canRead());
//        System.out.println(file.canWrite());
//        System.out.println(file.isFile());
//        try {
//            file.createNewFile();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        file.delete();
//        file.deleteOnExit();
//        System.out.println(file);
        System.out.println(file.getName());
        file.getAbsoluteFile();
        file.getAbsolutePath();


    }
}
