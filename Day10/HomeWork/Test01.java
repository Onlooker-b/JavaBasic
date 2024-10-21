package Day10.HomeWork;

import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) {
        /*
         * 录入一个长度小于等于9的纯数字字符串，将数字变位罗马数字
         * 罗马数字中没有0，0变为""
         */
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder("");
        while (true) {
            System.out.println("请输入一个字符串：");
            String number = sc.next();
            if (checkStr(number)) {
                for (int i = 0; i < number.length(); i++) {
                    char c = number.charAt(i);
                    //字符转变为int类型
                    int ge = c -48;
                    //System.out.println(ge);
                    String RomanNum = toRomanNumber(ge);
                    sb.append(RomanNum).append(" ");
                }
                break;
            } else {
                System.out.println("你输入的字符串不符合规则");
                continue;
            }
        }
        System.out.println(sb);
    }
    public static String toRomanNumber(int number){
        String[] roman_number = {"","Ⅰ","Ⅱ","Ⅲ","Ⅳ","Ⅴ","Ⅵ","Ⅶ","Ⅷ","Ⅸ"};
        return roman_number[number];
    }
    //判断是否合法
    public static boolean checkStr(String str){
        //要求1：长度小于等于9
        if (str.length() > 9) {
            return false;
        }
        //要求2：全是数字
        for (int i = 0; i < str.length(); i++) {
            // 获取字符串中的每一个字符
            char c = str.charAt(i);
            if (c<'0' || c>'9') {
                return false;
            }
        }
        //必须要每个字符都判断完成之后才能返回true
        return true;
    }
}
