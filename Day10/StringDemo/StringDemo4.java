package Day10.StringDemo;

import java.util.Scanner;

public class StringDemo4 {
    public static void main(String[] args) {
        /*
         * ​定义一个方法，把int数组中的数据按照指定的格式拼接成一个字符串返回，调用该方法，
         *​ 并在控制台输出结果。例如，数组为 int[] arr = {1,2,3}; ，执行方法后的输出结果为：[1, 2, 3]
         */
        int[] arr = new int[3];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("请输入一个数:");
            int number = sc.nextInt();
            // 将这个数添加到数组
            arr[i] = number;
        }
        String s = arrToString(arr);
        System.err.println("转变为字符串："+s);
        System.out.println("反转后的字符串："+reverser(s));
        
    }
    public static String arrToString(int[] arr){
        if (arr == null) {
            return "";
        }
        if (arr.length == 0) {
            return "[]";
        }
        // 有正经内容且不为空
        String s = "[";
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length-1) {
                //如果是最后一个数，加上括号
                s = s + arr[i] + "]";
            } else {
                s = s + arr[i] + "，";
            }
        }
        return s;
    }
    // 定义一个反转字符串的方法
    public static String reverser(String s){
        //倒着遍历字符串
        String new_s = "";
        for (int i = s.length()-1; i >= 0; i--) {
            //获取每一个字符
            char c = s.charAt(i);
            new_s = new_s + c;
        }
        return new_s;
    }
}
