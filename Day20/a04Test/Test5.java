package Day20.a04Test;

import java.time.LocalDate;
import java.util.Calendar;

public class Test5 {
    public static void main(String[] args) {
        /*
         * 判断一个年份是否是闰年
         */

        // JDK7
        // 简化版：找出这一年的3月1日，看它的前一天
        Calendar calendar = Calendar.getInstance();
        calendar.set(2000, 2, 1); // 月份范围0-11
        // 把日历往前减一天
        calendar.add(Calendar.DAY_OF_MONTH, -1);
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println(day);

        // JDK8
        // 月份范围1-12
        LocalDate localDate = LocalDate.of(2000, 3, 1);
        // 日期往前一天
        LocalDate localDate2 = localDate.minusDays(1); // 2000-02-29
        int day2 = localDate2.getDayOfMonth();
        System.out.println(day2);

        System.out.println(localDate.isLeapYear());
    }
}
