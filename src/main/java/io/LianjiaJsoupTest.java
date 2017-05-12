package io;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

/**
 * Created by caoyuncong on
 * 2017/5/10 9:38
 * JavaSE_2017.
 */
public class LianjiaJsoupTest {
    public static void main(String[] args) throws IOException {
        Document document = Jsoup.connect("http://bj.lianjia.com/ershoufang/dongcheng/").cookie("lianjia_uuid","8bcf7ea9-9b97-4c87-900f-fd94fe33aaee").get();
//        System.out.println(document); // 整个html文档
        Elements elements = document.select("li[class=clear]");
        for (Element element : elements) {
            String region=element.select("a[data-el=region]").first().text();
            String totalPrice=element.select("div[class=totalPrice]").first().child(0).text();
            String houseInfoElement=element.select("div[class=houseInfo]").first().childNode(2).toString();
            String unitPrice=element.select("div[class=unitPrice]").first().attr("data-price");
            System.out.println(region+" @"+houseInfoElement+" @"+totalPrice+" @"+unitPrice);
        }

//        for (Element element : elements) {
//            System.out.println(element.select("div[class=houseInfo]").text());
//        }
    }



}
