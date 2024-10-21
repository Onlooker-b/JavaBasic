import java.util.Scanner;

public class Test05 {
    public static void main(String[] args) {
        // 在唱歌比赛中，有6名评委给选手打分，分数范围是[0 - 100]之间的整数。
        // 选手的最后得分为：去掉最高分、最低分后的4个评委的平均分，请完成上述过程并计算出选手的得分。

        //1、先获取6个评委的打分，用数组保存
        Scanner sc= new Scanner(System.in);
        int[] arr = new int[6];
        for (int i = 0; i < arr.length;) {
            System.out.println("请输入评委的打分：");
            int score = sc.nextInt();
            if (score >= 0 && score <= 100) {
                arr[i] = score;
                i++;
            } else {
                System.out.println("你输入的分数不合规，请重新输入第"+(i+1)+"个评委的分数：");
            }
        }
        //4、去掉最高分和最低分后求均值
        int max = get_Max(arr);
        int min = get_Min(arr);
        int sum = get_Sum(arr);
        int score = (sum-max-min)/4;
        System.out.println("最终得分为： "+score);
    }
    // 2、获取数组最大值的方法
    public static int get_Max(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    } 
    // 3、获取数组最小值的方法
    public static int get_Min(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }   
    // 4、获取数组和的方法
    public static int get_Sum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
}
