package Day20.a01jdk7date;

import java.util.Calendar;

public class CalendarDemo2 {
    public static void main(String[] args) {
        //设置属性——set(int field,int value):
        // 1、获取当前时间
		Calendar calendar = Calendar.getInstance();
        // 2、修改日期
        calendar.set(Calendar.YEAR, 2001);
        calendar.set(Calendar.MONTH, 4-1); // 转换为Calendar内部的月份值
        calendar.set(Calendar.DAY_OF_MONTH, 2);

        int week = calendar.get(Calendar.DAY_OF_WEEK);

        System.out.println(calendar.getTime());
        System.out.println(getWeek(week));

        System.out.println("---------------------");
        // 3、增加月份
        calendar.add(Calendar.MONTH, 1);
        int week1 = calendar.get(Calendar.DAY_OF_WEEK);
        System.out.println(calendar.getTime());
        System.out.println(getWeek(week1));

        System.out.println("----------------------");
        getDate(200);
    }

    // 查表法，查询星期几
    public static String getWeek(int w) {// w = 1 --- 7
        // 做一个表(数组)
        String[] weekArray = { "星期日", "星期一", "星期二", "星期三", "星期四", "星期五", "星期六" };
        // 索引 [0] [1] [2] [3] [4] [5] [6]
        // 查表
        return weekArray[w - 1];
    }

    // 计算200天以后是哪年哪月哪日，星期几？
    public static void getDate(int num) {
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DAY_OF_MONTH, num);

        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH) + 1;
        int day = calendar.get(Calendar.DAY_OF_MONTH);

        String week = getWeek(calendar.get(Calendar.DAY_OF_WEEK));
        System.out.println(year + "年" + month + "月" + day + "日  " + week);
    }
}
