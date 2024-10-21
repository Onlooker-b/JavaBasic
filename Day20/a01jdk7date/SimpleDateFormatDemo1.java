package Day20.a01jdk7date;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class SimpleDateFormatDemo1 {
    public static void main(String[] args) throws ParseException {
        /*
         * 格式化：按照指定的格式，把Date对象转换为String对象。
         * 解析：按照指定的格式，把String对象转换为Date对象。
         * 
         * public String format(Date date)：将Date对象格式化为字符串。
         * public Date parse(String source)：将字符串解析为Date对象。
         */

        // 1、利用空参构造创建simpleDateFormat对象，默认格式
        Date d1 = new Date(0);
        String s1 = new SimpleDateFormat().format(d1);
        System.out.println(s1);

        // 2、定义一个字符串，通过SimpleDateFormat变为Date格式
        String str = "2023-11-11 11:11:11";
        SimpleDateFormat sd1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date d2 = sd1.parse(str);
        System.out.println(d2);

        // 3、利用空参构造创建simpleDateFormat对象，指定格式
        SimpleDateFormat sd2 = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        String s2 = sd2.format(d1);
        System.out.println(s2);

        // 课堂练习:yyyy年MM月dd日 时:分:秒 星期
        SimpleDateFormat sd3 = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss EE");
        String s3 = sd3.format(d1);
        System.out.println(s3);

        getFormat();
        getMiaosha();
    }

    private static void getFormat() throws ParseException {
        // 1.可以通过2000-11-11进行解析，解析成一个Date对象
        String str1 = "2000-11-11";
        SimpleDateFormat sd1 = new SimpleDateFormat("yyyy-MM-dd");
        // 2.解析
        Date d1 = sd1.parse(str1);
        // 3.格式化
        SimpleDateFormat sd2 = new SimpleDateFormat("yyyy年MM月dd日");
        String str2 = sd2.format(d1);
        System.out.println(str2);
    }

    private static void getMiaosha() throws ParseException {
        /*
         * 需求:
         * 秒杀活动开始时间:2023年11月11日 0:0:0(毫秒值)
         * 秒杀活动结束时间:2023年11月11日 0:10:0(毫秒值)
         * 
         * 小贾下单并付款的时间为:2023年11月11日 0:01:0
         * 小皮下单并付款的时间为:2023年11月11日 0:11:0
         * 用代码说明这两位同学有没有参加上秒杀活动?
         */

        // 1.定义字符串表示三个时间
        String startstr = "2023年11月11日 0:0:0";
        String endstr = "2023年11月11日 0:10:0";
        String orderstr = "2023年11月11日 0:01:00";

        // 2.通过SimpleDateFormat转变为Date
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        Date startDate = sdf.parse(startstr);
        Date endDate = sdf.parse(endstr);
        Date orderDate = sdf.parse(orderstr);

        // 3.得到三个时间的毫秒值
        long startTime = startDate.getTime();
        long endTime = endDate.getTime();
        long orderTime = orderDate.getTime();

        // 4.判断
        if (orderTime >= startTime && orderTime <= endTime) {
            System.out.println("参加秒杀活动成功");
        } else {
            System.out.println("参加秒杀活动失败");
        }
    }
}
