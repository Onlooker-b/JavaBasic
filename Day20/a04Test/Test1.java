package Day20.a04Test;

import java.util.ArrayList;
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        /*
         * 键盘录入一些1~100之间的整数，并添加到集合中。直到集合中所有数据和超过200为止。
         */

        // 1、创建一个集合用来添加整数
        ArrayList<Integer> arrayList1 = new ArrayList<>();
        // 2、键盘录入数据
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入1~100的整数：");
            String s = sc.nextLine();
            int i = Integer.parseInt(s);
            if (i > 100 || i < 1) {
                System.out.println("范围有误，请重新输入！");
                continue;
            }
            // 3、将符合条件的数放到集合
            // 把int放到Integer中，触发了自动装箱
            arrayList1.add(i);
            // 4、计算集合的和
            int sum = getSum(arrayList1);
            // 5、判断
            if (sum > 200) {
                System.out.println("集合中所有的数据和已经满足要求");
                break;
            }
        }
    }

    private static int getSum(ArrayList<Integer> arrayList) {
        int sum = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            int num = arrayList.get(i);
            sum = sum + num;
        }
        return sum;
    }
}