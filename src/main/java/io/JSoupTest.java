package io;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

/**
 * Created by caoyuncong on
 * 2017/5/8 19:15
 * JavaSE_2017.
 */
public class JSoupTest {
    public static void main(String[] args) throws IOException {
        Document document = Jsoup.connect("http://jandan.net/tag/nasa").get();
        Elements elements = document.select("img[class=lazy]");
        for (Element element : elements) {
            System.out.println("http:" + element.attr("data-original"));
        }
    }
}
