package Day09.Test04;

import java.util.Scanner;

public class CarTest {
    public static void main(String[] args) {
        //1、创建一个数组来存汽车对象
        Car[] arr = new Car[3];

        //2、创建汽车对象，数据来自键盘录入
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            //创建汽车对象
            Car c = new Car();
            System.out.println("请输入汽车的品牌：");
            String brand = sc.next();
            c.setBrand(brand);
            System.out.println("请输入汽车的价格：");
            int price = sc.nextInt();
            c.setPrice(price);
            System.out.println("请输入汽车的颜色：");
            String color = sc.next();
            c.setColor(color);
            arr[i] = c;
        }

        //3、遍历汽车数组，输出汽车信息
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("这辆车是%s牌，花费了%s元，是%s的。",arr[i].getBrand(),arr[i].getPrice(),arr[i].getColor());
            System.out.println();
        }
    }
}
