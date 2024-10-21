package Day20.a04Test;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Test4 {
    public static void main(String[] args) throws ParseException {
        // 计算自己活了多少天

        // JDK7
        // 只要是针对时间的计算或者判断，都需要先把时间转变为毫秒值
        // 1、计算出生年月日的毫秒值
        String birthday = "2001年4月2日";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日");
        Date date = simpleDateFormat.parse(birthday); // Mon Apr 02 00:00:00 CST 2001
        Long time = date.getTime(); // 986140800000
        // 说明在计算机时间原点之后的这么多毫秒后

        // 2、获取当下的时间
        Date date2 = new Date();
        Long time2 = date2.getTime(); // 当下的毫秒
        // Long time2 = System.currentTimeMillis();

        // 3、计算过了多少天
        Long result = time2 - time;
        System.out.println(result/1000/60/60/24);

        // JDK8
        LocalDate ld1 = LocalDate.of(2001, 4, 2);
        LocalDate ld2 = LocalDate.now();
        Long day = ChronoUnit.DAYS.between(ld1, ld2);  // 第2个参数-第1个参数
        System.out.println(day);
    }
}
