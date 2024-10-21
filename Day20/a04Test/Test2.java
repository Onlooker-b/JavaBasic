package Day20.a04Test;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        /*
         * 自己实现parseInt方法的效果，将字符串形式的数据转成整数。要求:
         * 字符串中只能是数字不能有其他字符最少一位，最多10位0不能开头
         */
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("输入字符串类型：");
            String s = sc.nextLine();
            // 1、校验
            if (!s.matches("[1-9]\\d{0,9}")) {
                System.out.println("输入格式错误");
                continue;
            }
            // 2、剩下就是正常的数字了
            Integer i = Integer.parseInt(s);
            int num = i.intValue();
            // int num = stringToInt(s);
            System.out.println(num + 1);
            break;
        }
    }

    private static int stringToInt(String s) {
        int number = 0;
        for (int i = 0; i < s.length(); i++) {
            // 获取字符
            char c = s.charAt(i);
            // 变成数字
            int n = (int)c - '0';
            number = number * 10 + n;
        }
        return number;
    }

}
