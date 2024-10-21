package Day10.HomeWork;

import java.util.Scanner;

public class Test05 {
    // 统计字符串中英文字母和数字分别有多少个。比如：Hello12345World中字母：10个，数字：5个。
    public static void main(String[] args) {
        //String s = "Hello12345World";
        //为了方便计算字母个数，全部转换成小写
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String s = sc.nextLine();
        s = s.toLowerCase();
        char[] arr = s.toCharArray();
        int character_count = 0;
        int number_count = 0;
        int other_count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 'a' && arr[i] <= 'z') {
                character_count++;
            }else if (arr[i] >= '0' && arr[i] <= '9') {
                number_count++;
            }else{
                other_count++;
            }
        }
        System.out.println(character_count);
        System.out.println(number_count);
        System.out.println(other_count);
    }
}
