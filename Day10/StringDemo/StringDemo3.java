package Day10.StringDemo;

import java.util.Scanner;

public class StringDemo3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String s = sc.next();
        
        int bigcount = 0;
        int smallcount = 0;
        int numbercount = 0;
        int othercount = 0;
        for (int i = 0; i < s.length(); i++) {
            //获取字符串中的每一个字符
            char c = s.charAt(i);
            if (c >= 'a' && c <= 'z') {
                smallcount++;
            } else if (c >= 'A' && c <= 'Z') {
                bigcount++;
            }else if (c >= '0' && c <= '9') {
                numbercount++;
            }else{
                othercount++;
            }
        }
        System.out.println("大写字母有"+bigcount+"个");
        System.out.println("小写字母有" + smallcount + "个");
        System.out.println("数字有" + numbercount + "个");
        System.out.println("其他字符有" + othercount + "个");
    }
}