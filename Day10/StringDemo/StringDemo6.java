package Day10.StringDemo;

import java.util.Scanner;

public class StringDemo6 {
    public static void main(String[] args) {
        /*
         * 需求：以字符串的形式从键盘接受一个手机号，将中间四位号码屏蔽
         * 最终效果为：`131****9468`
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("输入一个手机号：");
        String phone = sc.next();
        //截取前三位
        String p1 = phone.substring(0, 3);
        //截取后四位
        String p2 = phone.substring(7, 11);
        //拼接
        String new_phone = p1 + "****" + p2;
        System.out.println("加密后的手机号码是："+new_phone);

        /*
         * 需求1：键盘录入一个 字符串，如果字符串中包含（TMD），则使用***替换
         * String[] arr = {"TMD","GDX","ctmd","ZZ","lj","FW","nt"};
         */
        System.out.println("请输入一段话：");
        String sentense = sc.next();
        //定义一个数组来存敏感词
        String[] arr = { "TMD", "GDX", "ctmd", "ZZ", "lj", "FW", "nt" };
        for (int i = 0; i < arr.length; i++) {
            //将sentence中的脏话替换掉
            sentense = sentense.replace(arr[i], "***");
        }
        System.out.println("文明化后："+sentense);
    }
}
