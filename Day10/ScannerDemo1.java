package Day10;

import java.util.Scanner;

public class ScannerDemo1 {
    public static void main(String[] args) {
        //1、创建对象
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个小数");
        //2、接受一个小数
        double result = sc.nextDouble();
        //3、输出打印
        System.out.println("你输入的小数是："+result);
    }
}
