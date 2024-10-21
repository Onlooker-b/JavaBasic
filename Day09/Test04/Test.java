package Day09.Test04;

import java.util.Scanner;

public class Test {
    /*键盘录入：
      第一套体系：遇到空格、制表符、回车就停止接受，这些符号后的数据不会接收
      nextInt(); 接受整数
      nextDouble(); 接受小数
      next(); 接受字符串

      第二套体系：可以接收空格和制表符，只有遇到回车才停止
      nextLine(); 接受字符串
    */ 

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("请输入一个整数：");
        // int num = sc.nextInt();
        // System.out.println(num); //123
        // System.out.println("请输入第二个整数：");
        // int num2 = sc.nextInt();
        // System.out.println(num2); //123

        System.out.println("请输入第一个字符串：");
        String s1 = sc.nextLine();
        System.out.println(s1);
        System.out.println("请输入第二个字符串：");
        String s2 = sc.nextLine();
        System.out.println(s2);
    }
}
