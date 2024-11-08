package Day21.a04recursionalgorithm;

public class Demo1 {
    public static void main(String[] args) {
        // 需求：利用递归求1-100之间的和

        // 1-100之间的和 = 100 + (1-99之间的和)
        // 1-99之间的和 = 99 + (1-99之间的和)
        // 1-98之间的和 = 98 + (1-97之间的和)
        // ...
        // 1-2之间的和 = 2 + (1-1之间的和)
        // 1-1之间的和 = 1 （递归的出口）
        System.out.println(getSum(100));
    }

    public static int getSum(int number){
        if (number == 1) {
            return 1;
        }

        // 如果number不是1
        return number + getSum(number - 1);
    }
}
