package Day20.a01jdk7date;

import java.util.Date;
import java.util.Random;

public class DateDemo2 {
    public static void main(String[] args) {
        // 需求1：打印一个时间原点一年之后的时间
        // 需求2：定义任意两个Date对象，比较先后

        // 1、创建时间原点的对象
        Date d = new Date(0);
        // 2、获取d1时间的毫秒值
        long time = d.getTime();
        // 3、在毫秒值上添加一年
        time = time + 1000l * 60 * 60 * 24 * 365;
        // 4、把计算结果设置回d1
        d.setTime(time);
        System.out.println(d);  // Fri Jan 01 08:00:00 CST 1971

        // 1、创建随机的对象
        Random r = new Random();
        // 2、获取两个随机的时间
        Date d1 = new Date(Math.abs(r.nextInt()));
        Date d2 = new Date(Math.abs(r.nextInt()));
        // 3、把两个时间都转换为毫秒值，便于计算
        long time1 = d1.getTime();
        long time2 = d2.getTime();
        if (time1 > time2) {
            System.out.println("第一个时间在前，第二个时间在后");
        }else if (time1 < time2) {
            System.out.println("第一个时间在后，第二个时间在前");
        }else{
            System.out.println("两个时间相同");
        }
    }
}
