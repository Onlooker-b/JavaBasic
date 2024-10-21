package Day18.a01math;

public class MathDemo2 {
    public static void main(String[] args) {
        // 判断一个数是否为质数

        int count = 0;
        long start = System.currentTimeMillis();
        for (int i = 1; i <= 100000; i++) {
            boolean b = isPrim2(i);
            if (b) {
                count++;
            }
        }
        long end = System.currentTimeMillis();
        System.out.println(count);
        System.out.println(end-start);
    }

    // 改进版
    public static boolean isPrim2(int number){
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    // 原始版
    public static boolean isPrim1(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
