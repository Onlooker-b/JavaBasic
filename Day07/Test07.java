import java.util.Scanner;

public class Test07 {
    public static void main(String[] args) {
        //1、输入一串被加密数字
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一串数字：");
        int number = sc.nextInt();

        //2、把这串数字放到数组中
        int temp = number;
        //先求数组长度
        int count = 0;
        while (temp != 0) {
            temp = temp/10;
            count++;
        }
        int[] arr = new int[count];
        int index = arr.length-1;
        while (number != 0) {
            int ge = number % 10;
            arr[index] = ge;
            number = (int)(number/10);
            index--;
        }
        
        //3、数组反转
        for (int i = 0, j = arr.length-1; i < j; j--, i++) {
            int t = arr[i];
            arr[i] = arr[j];
            arr[j] = t;
        }

        //4、如果原数据是0-4，则结果是+10；如果是5-9，则数字不变
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>=0 && arr[i]<=4) {
                arr[i] += 10;
            } else {
                //不变
            }
        }
        //5、每一位减5
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] - 5;
        }
        //6、连起来
        int yuan_number = 0;
        for (int i = 0; i < arr.length; i++) {
            yuan_number = yuan_number*10 + arr[i];
        }
        System.out.println("初始的数字是："+yuan_number);
    }
}
