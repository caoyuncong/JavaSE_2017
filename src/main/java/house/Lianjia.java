package house;

import sun.net.ConnectionResetException;

import java.io.*;
import java.net.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static javafx.scene.input.ScrollEvent.VerticalTextScrollUnits.PAGES;

/**
 * Created by caoyuncong on
 * 2017/5/6 10:44
 * JavaSE_2017.
 */
public class Lianjia {
    private static final String[] AREA = {
            "dongcheng",
            "xicheng",
            "chaoyang",
            "haidian",
            "fengtai",
            "shijingshan",
            "tongzhou",
            "changping",
            "daxing",
            "yizhuangkaifaqu",
            "shunyi",
            "fangshan",
            "mentougou",
            "pinggu",
            "huairou",
            "miyun",
            "yanqing",
            "yanjiao"
    };

    private static final int[] PAGES = {
            35,
            35,
            100,
            100,
            67,
            21,
            46,
            94,
            42,
            6,
            29,
            17,
            14,
            1,
//            0,
            1,
            1,
            100
    };


    private static final String proxy_ip = "52.58.249.129";
    private static final int proxy_port = 8083;
    private static final String LIANJIA_URL = "http://bj.lianjia.com/ershoufang/";
    private static final String REGEXP = "region\">([\u4e00-\u9fbb]+) </a> ([0-9\u4e00-\u9fbb|\\s.]+)</div>[a-zA-Z0-9\u4e00-\u9fbb\\s=\"<>/_:().-]+totalPrice\"><span>(\\d+)[a-zA-Z0-9\u4e07\\s=\"<>/-]+data-price=\"(\\d+)";
    private static final String UA = "Mozilla/5.0 (Windows NT 6.1; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/54.0.2840.99 Safari/537.36";
    private static final String COOKIE = "lianjia_uuid=8bcf7ea9-9b97-4c87-900f-fd94fe33aaee; select_city=110000; _jzqckmp=1; UM_distinctid=15befff61aa99-0fd9e24970b3ad-59123916-100200-15befff61ab7a; all-lj=492291e11daf53bf34d39f84cc442d11; _jzqx=1.1494380142.1494423095.3.jzqsr=captcha%2Elianjia%2Ecom|jzqct=/.jzqsr=google%2Eco%2Ejp|jzqct=/; _smt_uid=59126e6c.1acbc877; CNZZDATA1253477573=1889750554-1494377549-http%253A%252F%252Fcaptcha.lianjia.com%252F%7C1494420749; CNZZDATA1254525948=1458916394-1494378671-http%253A%252F%252Fcaptcha.lianjia.com%252F%7C1494421871; CNZZDATA1255633284=1204130181-1494375143-http%253A%252F%252Fcaptcha.lianjia.com%252F%7C1494418343; CNZZDATA1255604082=822573889-1494375355-http%253A%252F%252Fcaptcha.lianjia.com%252F%7C1494418555; _qzja=1.723610331.1494380142299.1494382011431.1494423094848.1494423102820.1494423109963.0.0.0.13.3; _qzjb=1.1494423094848.3.0.0.0; _qzjc=1; _qzjto=13.3.0; _jzqa=1.1996995045354536700.1494380142.1494382011.1494423095.3; _jzqc=1; _jzqb=1.3.10.1494423095.1; _ga=GA1.2.567278055.1494380148; _gid=GA1.2.837339408.1494423114; lianjia_ssid=b4b06071-b54b-4a58-bb7e-232369f67bc4";
    private static int counter;

    public static void main(String[] args) {
        for (int i = 0; i < AREA.length; i++) {
            counter = 0;
            System.out.println("area:" + AREA[i]);
            for (int j = 0; j < PAGES[i]; j++) {
                System.out.println("\t page: " + (j + 1));
                try {
                    getPage(j+1, AREA[i]);
                    Thread.sleep((int) (Math.random() * 5000));
                } catch (InterruptedException | IOException e) {
                    e.printStackTrace();
                }
            }
            try {
                Thread.sleep(3000 * 60);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void getPage(int page, String area) throws IOException {
        URL url = new URL(LIANJIA_URL + area + "/pg" + page);
        // proxy begin
//        InetSocketAddress inetSocketAddress = new InetSocketAddress(proxy_ip, proxy_port);
//        Proxy proxy = new Proxy(Proxy.Type.HTTP, inetSocketAddress);
        // proxy end
//        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection(proxy);
        System.setProperty("http.agent", UA);
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setRequestProperty("Cookie", COOKIE);
        try (
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
                BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("data/" + area, true))
        ) {

            String line;
            Pattern pattern = Pattern.compile(REGEXP);
            Matcher matcher;
            while ((line = bufferedReader.readLine()) != null) {
                matcher = pattern.matcher(line);
                while (matcher.find()) {
                    bufferedWriter.write(matcher.group(1) +"@"+matcher.group(2) +"@"+matcher.group(3) +"@"+matcher.group(4) +"\n");
                    System.out.println("\t\t counter: " + (++counter));
                }
            }
        } catch (ConnectionResetException e) {
            System.out.println("connection reset...");
            getPage(page, area);
        } catch (ConnectException e) {
            System.out.println("time out...");
            getPage(page, area);
        } catch (IOException e) {
//            e.printStackTrace();
            System.out.println("io...");
            getPage(page, area);
        }
    }
}
