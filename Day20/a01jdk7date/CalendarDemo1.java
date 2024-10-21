package Day20.a01jdk7date;

import java.util.Calendar;
import java.util.Date;

public class CalendarDemo1 {
    public static void main(String[] args) {
        /*
         * java.util.Calendar类表示一个“日历类”，可以进行日期运算。
         * 它是一个抽象类，不能创建对象，
         * 使用它的子类：java.util.GregorianCalendar类
         * 
         * 有两种方式可以获取GregorianCalendar对象：
         * 直接创建GregorianCalendar对象，
         * 通过Calendar的静态方法getInstance()方法获取GregorianCalendar对象【本次课使用】
         */

        // 1、创建一个GregorianCalendar对象
        // 会把时间中的纪元、年、月、日、时、分、秒、星期等放到一个数组
        // 月份是0到11，真实月份需要加一
        // 星期1其实是星期日，2是星期一
        Calendar calendar = Calendar.getInstance();
        // 2、输出数组
        System.out.println(calendar);
        // 3、修改时间为原点
        Date d = new Date(0);
        calendar.setTime(d);
        System.out.println(calendar.getTime());
        System.out.println("--------------------");

        // 3.获取属性，将他们都定义为常量，可以直接用类名调用
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH) + 1;// Calendar的月份值是0-11
        int day = calendar.get(Calendar.DAY_OF_MONTH);

        int hour = calendar.get(Calendar.HOUR);
        int minute = calendar.get(Calendar.MINUTE);
        int second = calendar.get(Calendar.SECOND);

        int week = calendar.get(Calendar.DAY_OF_WEEK_IN_MONTH); // //返回值范围：1--7，分别表示："星期日","星期一","星期二",...,"星期六"
        
        System.out.println(year + "年" + month + "月" + day + "日 " + hour + ":" + minute + ":" + second);
        System.out.println(getWeek(week));
    }

    private static String getWeek(int week) {
        // 做一个数组，直接week-1作为索引
        String[] weekArr = {"星期日", "星期一", "星期二", "星期三", "星期四", "星期五", "星期六"};
        return weekArr[week-1];
    }
}
