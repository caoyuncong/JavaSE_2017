package io;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Created by caoyuncong on
 * 2017/4/28 15:54
 * JavaSE_2017.
 */
public class UserAgentTest {
    private static final String USER_AGENT = "test"; // server; if (user_agent == null) return 403...
    public static void main(String[] args) throws IOException {
        URL url = new URL("https://wallpapers.wallhaven.cc/wallpapers/thumb/small/th-509708.jpg");
        System.setProperty("http.agent",USER_AGENT);
        HttpURLConnection httpURLConnection= (HttpURLConnection) url.openConnection();
        try (
                InputStream inputStream = httpURLConnection.getInputStream();
                BufferedOutputStream outputStream = new BufferedOutputStream(new FileOutputStream("aa.jpg"))
        ) {
            int i;
            while ((i = inputStream.read()) != -1) {
                outputStream.write(i);
            }

        }
    }
}
