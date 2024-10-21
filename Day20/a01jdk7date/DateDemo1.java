package Day20.a01jdk7date;

import java.util.Date;

public class DateDemo1 {
    public static void main(String[] args) {
        
        // 1、创建一个时间对象
        Date d1 = new Date();
        // 输出当前时间
        System.out.println(d1);

        // 2、创建对象表示指定时间
        Date d2 = new Date(0);
        // 输出时间原点
        System.out.println(d2); // Thu Jan 01 08:00:00 CST 1970

        // 3、修改时间
        d2.setTime(1000l); // 1000毫秒等于1秒
        System.out.println(d2); // Thu Jan 01 08:00:01 CST 1970

        // 4、获取当前时间的毫秒值
        long time = d1.getTime();
        System.out.println(time);
    }
}
