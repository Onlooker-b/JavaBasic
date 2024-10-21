package Day10.HomeWork;

import java.util.Scanner;

public class Test06 {
    /* 请定义一个方法用于判断一个字符串是否是对称的字符串，并在主方法中测试方法。
       例如："abcba"、"上海自来水来自海上"均为对称字符串。*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String s = sc.nextLine();
        if (s.equals(reverser(s))) {
            System.out.println("是对称字符串");
        }

    }
    public static String reverser(String str){
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }
}
