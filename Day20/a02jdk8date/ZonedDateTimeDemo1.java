package Day20.a02jdk8date;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedDateTimeDemo1 {
    public static void main(String[] args) {
        /*
            static ZonedDateTime now() 获取当前时间的ZonedDateTime对象
            static ZonedDateTime ofXxxx(。。。) 获取指定时间的ZonedDateTime对象
            ZonedDateTime withXxx(时间) 修改时间系列的方法
            ZonedDateTime minusXxx(时间) 减少时间系列的方法
            ZonedDateTime plusXxx(时间) 增加时间系列的方法
         */
        
        //1.获取当前时间对象(带时区)
        ZonedDateTime zonedDateTime1 = ZonedDateTime.now();
        System.out.println(zonedDateTime1);  // 当前：2024-09-10T18:04:45.569871100+08:00[Asia/Shanghai]

        //2.获取指定时间的ZonedDateTime对象
        ZonedDateTime zonedDateTime2 = ZonedDateTime.of(2001, 4, 2, 
                15, 40, 12, 0, ZoneId.of("Asia/Shanghai"));
        System.out.println(zonedDateTime2);
        
        //通过Instant + 时区的方式指定获取时间对象
        Instant instant = Instant.ofEpochMilli(0L);  // 原点
        ZoneId zoneId = ZoneId.of("Asia/Shanghai");
        ZonedDateTime time2 = ZonedDateTime.ofInstant(instant, zoneId);
        System.out.println(time2); // 1970-01-01T08:00+08:00[Asia/Shanghai]   在这个时区的时间原点

        //3.修改时间系列的方法
        ZonedDateTime zonedDateTime3 = zonedDateTime1.withYear(2000);
        System.out.println(zonedDateTime3); // 2000-09-10T18:12:54.997272900+08:00[Asia/Shanghai]

        // 4. 减少时间
        ZonedDateTime zonedDateTime4 = zonedDateTime3.minusYears(1);
        System.out.println(zonedDateTime4); // 1999-09-10T18:15:13.131142+08:00[Asia/Shanghai]

        // 5.增加时间
        ZonedDateTime zonedDateTime5 = zonedDateTime4.plusYears(1);
        System.out.println(zonedDateTime5); // 2000-09-10T18:15:13.131142+08:00[Asia/Shanghai]


    }
}
