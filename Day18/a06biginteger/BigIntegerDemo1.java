package Day18.a06biginteger;

import java.math.BigInteger;
import java.util.Random;

public class BigIntegerDemo1 {
    public static void main(String[] args) {
        /*
         * public BigInteger(int num, Random rnd) 获取随机大整数，范围:[0~ 2的num次方-1]
         * public BigInteger(String val) 获取指定的大整数
         * public BigInteger(String val, int radix) 获取指定进制的大整数
         * 
         * public static BigInteger valueOf(long val) 静态方法获取BigInteger的对象，内部有优化
         * 
         * 细节:
         * 对象一旦创建里面的数据不能发生改变。
         */

        // 1、获取一个随机的大整数
        BigInteger bd1 = new BigInteger(4, new Random()); // 0到2的4次方-1
        System.out.println(bd1);

        // 2、获取一个指定的大整数，必须是整数
        BigInteger bd2 = new BigInteger("1000000000000000000000000000000");
        System.out.println(bd2);

        // 3、获取指定进制的大整数，2进制下的100等于4
        BigInteger bd3 = new BigInteger("100", 2);
        System.out.println(bd3);

        // 4、静态方法获取BigInteger的对象，范围必须在long取值范围之内
        BigInteger bd4 = BigInteger.valueOf(100);
        System.out.println(bd4);
    }
}
