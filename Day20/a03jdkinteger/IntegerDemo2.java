package Day20.a03jdkinteger;

import javax.swing.event.InternalFrameAdapter;

public class IntegerDemo2 {
    public static void main(String[] args) {
        // 自动装箱，自动拆箱
        // 在底层，自动调用静态方法valueof得到一个Integer对象
        Integer i1 = 10;
        Integer i2 = 4;
        // 自动拆箱
        int result = i1 + i2;
        System.out.println(result);
        
        /*
         * public static string tobinarystring(int i) 得到二进制
         * public static string tooctalstring(int i) 得到八进制
         * public static string toHexstring(int i) 得到十六进制
         * public static int parseInt(string s) 将字符串类型的整数转成int类型的整数
         */

        // 1、把整数转成二进制
        String s1 = Integer.toBinaryString(100);
        System.out.println(s1); // 1100100

        // 2、把整数转成八进制
        String s2 = Integer.toOctalString(100);
        System.out.println(s2); // 144

        // 3、把整数转成十六进制
        String s3 = Integer.toHexString(100);
        System.out.println(s3); // 64

        // 4、将字符串类型的整数转成int类型的整数
        int i3 = Integer.parseInt("123");
        System.out.println(i3 + 1);
        // 细节1:
        // 在类型转换的时候，括号中的参数只能是数字不能是其他，否则代码会报错
        // 细节2:
        // 8种包装类当中，除了Character都有对应的parseXxx的方法，进行类型转换
        String str = "true";
        boolean b = Boolean.parseBoolean(str);
        System.out.println(b);
    }
}
