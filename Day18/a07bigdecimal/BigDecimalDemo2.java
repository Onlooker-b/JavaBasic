package Day18.a07bigdecimal;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalDemo2 {
    public static void main(String[] args) {
        /*
         * public BigDecimal add(BigDecimal val) 加法
         * public BigDecimal subtract(BigDecimal val) 减法
         * public BigDecimal multiply(BigDecimal val) 乘法
         * public BigDecimal divide(BigDecimal val) 除法
         * public BigDecimal divide(BigDecimal val，精确几位，舍入模式)除法
         */
        
        BigDecimal bd1 = new BigDecimal("0.01");
        BigDecimal bd2 = new BigDecimal("0.08");
        System.out.println(bd1.add(bd2));
        System.out.println(bd1.subtract(bd2));
        System.out.println(bd2.divide(bd1));

        BigDecimal bd3 = new BigDecimal("10");
        BigDecimal bd4 = new BigDecimal("3");
        // 保留两位小数，四舍五入
        System.out.println(bd3.divide(bd4, 2, RoundingMode.HALF_UP));
    }
}
