package Day10.HomeWork;

import java.util.Scanner;

public class Test07 {
    /*
     * 我国的居民身份证号码，由由十七位数字本体码和一位数字校验码组成。
     * 请定义方法判断用户输入的身份证号码是否合法，并在主方法中调用方法测试结果。
     * 规则为：号码为18位，不能以数字0开头，前17位只可以是数字，最后一位可以是数字或者大写字母X。
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入身份证号：");
        String s = sc.nextLine();     
        System.out.println(check(s));   
    }
    public static boolean check(String str){
        if (str == null) {
            return false;
        }
        //1、号码18位
        if (str.length() != 18) {
            return false;
        }
        //2、不能以0开头
        char[] arr = str.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == '0') {
                return false;
            }
            //3、最后一位是数字或者X
            if (i == arr.length-1) {
                if (arr[i] != '0' || arr[i] != 'X') {
                    return false;
                }
            //4、前18位是数字
            }else{
                if (arr[i] < '0' || arr[i] > 9) {
                    return false;
                }
            }
        }
        return true;
    }
}
