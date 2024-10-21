package Day20.a03jdkinteger;

import java.util.Scanner;

public class IntegerDemo3 {
    public static void main(String[] args) {
        // 键盘录入
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        // int i = sc.nextInt();
        // System.out.println(i);

        // 键盘录入统一使用nextLine()，遇到回车才停止
        System.out.println("请输入一个字符串：");
        String s = sc.nextLine();
        System.out.println(s);

        // 如果想到整数或者小数，先拿到输入再进行类型转换
        int i2 = Integer.parseInt(s);
        System.out.println(i2 + 1);
    }
}
