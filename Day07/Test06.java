import java.util.Scanner;

public class Test06 {
    public static void main(String[] args) {
        /*
         * 某系统的数字密码（大于0）。比如1983，采用加密方式进行传输，
         * 规则如下：
         * 每位数加上5
         * 再对10求余，
         * 最后将所有数字反转，
         * 得到一串新数。
         */

        //1、输入一串数字
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一串数字：");
        int number = sc.nextInt();

        //2、要把这一串数字存到数组中
        //2.1 要先获取这串数字的长度
        int temp = number;
        int count = 0;
        while (temp != 0) {
            temp = (int)(temp/10); //每次往前挪移一位
            count++;
        }

        //2.2 一个一个存在数组中
        int[] arr = new int[count];
        int index = arr.length-1;
        while (number != 0) {
            //获取number的个位
            int ge = number % 10;
            //再去掉个位
            number = (int)(number/10);
            //把当前的数字放到数组中。第一个被取出来的个位应该是数组的最后一位
            arr[index] = ge;
            index--;
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] + 5;
            arr[i] = arr[i] % 10;
        }

        //3、将数组反转
        for (int i = 0, j = arr.length-1; i < j ; i++, j--) {
            int tem = arr[i];
            arr[i] = arr[j];
            arr[j] = tem;
        }

        //4、将数组又连成数字
        int new_number = 0;
        for (int i = 0; i < arr.length; i++) {
            new_number = new_number*10 +arr[i];
        }
        System.out.println("加密后的数字是： "+new_number);
    }
}
