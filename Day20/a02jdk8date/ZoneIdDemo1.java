package Day20.a02jdk8date;

import java.time.ZoneId;
import java.util.Set;

public class ZoneIdDemo1 {
    public static void main(String[] args) {
        /*
         * static Set<string> getAvailableZoneIds() 获取Java中支持的所有时区
         * static ZoneId systemDefault() 获取系统默认时区
         * static Zoneld of(string zoneld) 获取一个指定时区
         */

        // 1、获取所有的时区名称
        Set<String> zonelds =  ZoneId.getAvailableZoneIds();
        System.out.println(zonelds);  // 一个类似于Asia/Shanghai的集合
        System.out.println(zonelds.size()); // 一个600个时区

        // 2、获取当前系统的默认时区
        ZoneId zoneId = ZoneId.systemDefault();
        System.out.println(zoneId);  // 系统默认时区Asia/Shanghai

        // 3、获取一个指定时区
        ZoneId zoneId2 = ZoneId.of("Asia/Tokyo");
        System.out.println(zoneId2);
    }
}
