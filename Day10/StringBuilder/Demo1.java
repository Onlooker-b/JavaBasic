package Day10.StringBuilder;

import java.util.Scanner;

public class Demo1 {
    /*
     * 使用StringBuilder的场景：
     * 1、字符串反转
     * 2、字符串拼接
     */
    public static void main(String[] args) {
        // 键盘接受一个字符串，程序判断出该字符串是否是对称字符串，并在控制台打印是或不是
        Scanner sc = new Scanner(System.in);
        System.out.println("输入一个字符串：");
        String s = sc.nextLine();
        StringBuilder sb = new StringBuilder(s);
        String s1 = sb.reverse().toString();
        if (s.equals(s1)) {
            System.out.println("是对称字符串");
        }else{
            System.out.println("不是对称字符串");
        }
    }
}
