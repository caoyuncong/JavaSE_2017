package io;

import javax.imageio.ImageIO;
import java.awt.image.RenderedImage;
import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by caoyuncong on
 * 2017/4/18 11:58
 * JavaSE_2017.
 */
public class DownLoad {
    private static final String IMAGE_URL = "http://s.cn.bing.net/th?id=OJ.58V1JdyCq3tEwg&pid=MSNJVFeeds/1.2.tif";
    public static void main(String[] args) {
        try {
            URL url = new URL(IMAGE_URL);
            try (
                    InputStream inputStream = url.openStream();
                    OutputStream outputStream=new FileOutputStream("test.png")
            ) {
                System.out.println(inputStream.available());
                int i;
                while ((i = inputStream.read()) != -1) {
                    outputStream.write(i);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
//
}
