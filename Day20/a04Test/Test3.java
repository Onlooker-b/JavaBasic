package Day20.a04Test;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        // 定义一个方法自己实现toBinaryString方法的效果，将一个十进制整数转成字符串表示的二进制
        Scanner sc = new Scanner(System.in);
        System.out.println("输入一个十进制整数");
        String s = sc.nextLine();
        int number = Integer.parseInt(s);
        String bi_num = tobinarystring(number);
        System.out.println(bi_num);
    }
    
    public static String tobinarystring(int number) {//6
        //核心逻辑:
        //不断的去除以2，得到余数，一直到商为0就结束。
        //还需要把余数倒着拼接起来
        // 定义一个StringBuilder用来拼接余数
        StringBuilder sb = new StringBuilder();

        // 利用循环不断除以2取余数
        while (true) {
            if (number == 0) {
                break;
            }
            // 获取余数
            int remainder = number % 2;
            // 倒着拼接，每次都在0的位置插入
            sb.insert(0, remainder);
            // sb.append(remainder).reverse();
            number = number / 2;
        }
        return sb.toString();
    }
}
