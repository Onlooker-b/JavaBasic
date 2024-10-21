package Day18.a07bigdecimal;

import java.math.BigDecimal;

public class BigDecimalDemo1 {
    public static void main(String[] args) {
        /*
         * 构造方法获取BigDecimal对象
         * public BigDecimal(double val) public BigDecimal(string val)
         * 
         * 静态方法获取BigDecimal对象
         * public static BigDecimal valuef(double val)
         */

        // 1、通过传递double类型小数创建BigDecimal对象
        BigDecimal bd1 = new BigDecimal(12.12); // 12.1199999999999992184029906638897955417633056640625
        BigDecimal bd2 = new BigDecimal(0.09);  // 0.0899999999999999966693309261245303787291049957275390625
        // 会导致小数结果不精确，不建议使用这种方法

        // 2、通过传递字符串
        BigDecimal bd3 = new BigDecimal("0.09");
        BigDecimal bd4 = new BigDecimal("0.01");
        System.out.println(bd3); // 0.09，准确
        System.out.println(bd3.add(bd4));

        // 3、通过静态方法获取对象
        BigDecimal bd5 = BigDecimal.valueOf(0.04);
        System.out.println(bd5);
        // 细节:
        // 1.如果要表示的数字不大，没有超出double的取值范围，建议使用静态方法
        // 2.如果要表示的数字比较大，超出了double的取值范围，建议使用构造方法
        // 3.如果我们传递的是0~10之间的整数，包含0，包含10，那么方法会返回已经创建好的对象，不会重新new
        BigDecimal bd6 = BigDecimal.valueOf(10);
        BigDecimal bd7 = BigDecimal.valueOf(10);
        System.out.println(bd6 == bd7);
    }
}
