package Day19.a03regex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReptileTest2 {
    public static void main(String[] args) throws IOException {
        /*
         * 扩展需求2:
         * 把连接:https://m.sengzan.com/jiaoyu/29104.html?ivk sa=1025883i
         * 中所有的身份证号码都爬取出来。
         */

        // 1、创建一个URL对象
        URL url= new URL("https://m.sengzan.com/jiaoyu/29104.html?ivk sa=1025883i");
        // 2、连接上这个URL
        URLConnection conn = url.openConnection();  // 创建一个对象去读取网络中的数据
        // 3、使用BufferedReader调整格式
        BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        String line;
        // 4、获取正则表达式的对象pattern
        String regex = "[1-9]\\d{17}";
        // 5、每次读取的读一整行
        Pattern p = Pattern.compile(regex);
        while ((line = br.readLine()) != null) { // 能读到东西
            // 6、在读取的一行中寻找身份证号
            Matcher m = p.matcher(line);
            while (m.find()) {
                System.out.println(m.group());
            }
        }
        br.close();
    }
}
