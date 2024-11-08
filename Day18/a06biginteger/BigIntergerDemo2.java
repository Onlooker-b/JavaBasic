package Day18.a06biginteger;

import java.math.BigInteger;

public class BigIntergerDemo2 {
    public static void main(String[] args) {
        /*
         * public BigInteger add(BigInteger val) 加法
         * public BigInteger subtract(BigInteger val) 减法
         * public BigInteger multiply(BigInteger val) 乘法
         * public BigInteger divide(BigInteger val) 除法，获取商
         * public BigInteger[] divideAndRemainder(BigInteger val) 除法，获取商和余数
         * public boolean equals(Object x) 比较是否相同
         * public BigInteger pow(int exponent) 次幂
         * public BigInteger max/min(BigInteger val) 返回较大值/较小值
         * public int intValue(BigInteger val) 转为int类型整数，超出范围数据有误
         */

        // 1、创建两个对象
        BigInteger bd1 = BigInteger.valueOf(10);
        BigInteger bd2 = BigInteger.valueOf(3);

        // 2、加法
        System.out.println(bd1.add(bd2));
        System.out.println(bd1.subtract(bd2));
        
        // 3、除法，获取商和余数
        BigInteger[] arr = bd1.divideAndRemainder(bd2);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        // 4、比较是否相同，参数是object类型
        System.out.println(bd1.equals(bd2));

        // 5、次幂，参数是int类型
        System.out.println(bd1.pow(2));

        // 6、max
        System.out.println(bd1.max(bd2));

        // 7、转换为int
        System.out.println(bd1.intValue());
        System.out.println(bd1.doubleValue());

        BigInteger bd = new BigInteger("794543454351321154");
        System.out.println(bd);
    }
}
