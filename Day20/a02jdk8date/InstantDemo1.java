package Day20.a02jdk8date;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class InstantDemo1 {
    public static void main(String[] args) {
        /*
         * static Instant now() 获取当前时间的Instant对象(标准时间)
         * static Instant ofXxxx(long epochMilli) 根据(秒/毫秒/纳秒)获取Instant对象
         * ZonedDateTime atZone(ZoneIdzone) 指定时区
         * boolean isxxx(Instant otherInstant) 判断系列的方法
         * Instant minusXxx(long millisToSubtract) 减少时间系列的方法
         * Instant plusXxx(long millisToSubtract) 增加时间系列的方法
         */

        // 1、获取当前时间的Instant对象
        Instant instant = Instant.now();
        System.out.println(instant);

        // 2、根据(秒/毫秒/纳秒)获取Instant对象
        Instant instant2 = Instant.ofEpochMilli(1L);
        System.out.println(instant2);  // 1970-01-01T00:00:00.001Z   时间原点+1毫秒

        Instant instant3 = Instant.ofEpochSecond(1L);
        System.out.println(instant3); // 1970-01-01T00:00:01Z 时间原点+1秒

        Instant instant4 = Instant.ofEpochSecond(1L, 1000000000l);
        System.out.println(instant4); // 1970-01-01T00:00:02Z 时间原点+2秒   1秒=1000000000纳秒

        // 3、指定时区，需要用Instant对象来调用atZone()方法
        ZonedDateTime zonedDateTime = Instant.now().atZone(ZoneId.of("Asia/Shanghai"));
        System.out.println(zonedDateTime);  // 2024-09-09T10:47:48.329867800+08:00[Asia/Shanghai]

        // 4、进行判断
        Instant instant5 = Instant.ofEpochMilli(0l);  // 时间原点
        Instant instant6 = Instant.ofEpochMilli(1000l);
        boolean result1 = instant5.isBefore(instant6);  // 判断两个Instant对象时间先后
        System.out.println(result1);
        boolean result2 = instant5.isAfter(instant6);
        System.out.println(result2);

        // 5、减少时间系列的方法
        Instant instant7 = Instant.ofEpochMilli(3000l);
        System.out.println(instant7); // 1970-01-01T00:00:03Z
        // 把这个时间往前减小
        Instant instant8 = instant7.minusSeconds(1);// 往前减1秒
        System.out.println(instant8); // 1970-01-01T00:00:02Z
    }
}
