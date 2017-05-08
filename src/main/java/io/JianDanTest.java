package io;

import java.io.*;
import java.net.ConnectException;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by caoyuncong on
 * 2017/4/21 9:53
 * JavaSE_2017.
 */
public class JianDanTest implements Runnable {
    private static final String PAGE_URL = "http://jandan.net/tag/%E5%A4%A9%E6%96%87/page/";
    private int page;

    public JianDanTest(int page) {
        this.page = page;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 18; i++) {
            Thread thread = new Thread(new JianDanTest(i + 1));
            thread.start();
            System.out.println("page: " + (i + 1));
        }
    }

    @Override
    public void run() {
        int counter = 0;
        try {
            URL url = new URL(PAGE_URL + page);
            try (BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    if (line.contains("data-original")) {
                        String imageUrl = line.substring(line.indexOf("data-original=\"") + "data-original=\"".length(), line.indexOf("\" width"));
                        if (!imageUrl.startsWith("http")) {
                            imageUrl = "http:" + imageUrl;
                        }
                        String extension = imageUrl.substring(imageUrl.lastIndexOf("."));
                        download(imageUrl, extension, page, ++counter);
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

    private static void download(String imageUrl, String extension, int page, int counter) {
        try {
            URL url = new URL(imageUrl);
            try (
                    BufferedInputStream in = new BufferedInputStream(url.openStream());
                    BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream("images/" + page + "-" + counter + extension))
            ) {
                int i;
                while ((i = in.read()) != -1) {
                    out.write(i);
                }
                System.out.println("\t" + page + "-" + counter);
            } catch (ConnectException e) {
                System.out.println("timeout...");
                System.out.println(imageUrl);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
}
