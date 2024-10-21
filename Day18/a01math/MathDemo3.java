package Day18.a01math;

public class MathDemo3 {
    public static void main(String[] args) {
        // 1、水仙花数
        // 100~999

        // 获取每一个三位数对其进行判断
        int count = 0;
        for (int i = 100; i < 1000; i++) {
            int ge = i % 10;
            int shi = i / 10 % 10;
            int bai = i / 100 % 10;  

            // 把每一位的三次方之和与本身进行比较
            double sum = Math.pow(ge, 3) + Math.pow(shi, 3) + Math.pow(bai, 3);
            if (sum == i) {
                count++;
                System.out.println(i);
            }
        }
        System.out.println("共有" + count + "个");
        System.out.println("=================");

        // 获取每一个四位数对其进行判断
        int count1 = 0;
        for (int i = 1000; i < 10000; i++) {
            int ge = i % 10;
            int shi = i / 10 % 10;
            int bai = i / 100 % 10;
            int qian = i / 1000 % 10;

            // 把每一位的三次方之和与本身进行比较
            double sum = Math.pow(ge, 4) + Math.pow(shi, 4) + Math.pow(bai, 4) + Math.pow(qian, 4);
            if (sum == i) {
                count1++;
                System.out.println(i);
            }
        }
        System.out.println("共有" + count1 + "个");
    }
}
