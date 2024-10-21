package Day10.HomeWork;

import java.util.Random;

public class Test03 {
    //键盘输入任意字符串，打乱里面的内容 
    public static void main(String[] args) {
        //1、键盘输入一个字符串
        String s = "abcd1234";

        //2、变成字符数组，然后随机排列数组元素
        char[] arr = s.toCharArray();

        //3、将随机索引与每一个位置进行交换
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            int index = r.nextInt(arr.length);
            char temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }
        //4、再把字符数组变成字符串
        String new_s = new String(arr);
        System.out.println(new_s);
    }
}
