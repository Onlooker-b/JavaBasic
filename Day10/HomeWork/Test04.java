package Day10.HomeWork;

import java.util.Random;

public class Test04 {
    /*
     * 验证码内容：可以是小写字母，也可以是大写字母，还可以是数字
     * 长度为5，四位字母，1位数字。
     * 其中数字只有1位，但是可以出现在任意的位置。
     */
    public static void main(String[] args) {
        //1、先把小写字母和大写字母都放到一个字符数组里面
        char[] arr = new char[52];
        for (int i = 0; i < arr.length; i++) {
            if (i <= 25) { //26个小写字母 a-97
                arr[i] = (char)(i+97);
            } else { //A-65
                arr[i] = (char)(i-26+65);
            }
        }

        //2、从字母数组中随机抽取四个
        Random r = new Random();
        String code = "";
        for (int i = 0; i < 4; i++) {
            int index = r.nextInt(arr.length);
            code = code + arr[index];
        }

        //3、生成随机的数字
        int number = r.nextInt(10);
        code = code + number;

        //4、把这个code再次打乱，数字就能随机出现了
        char[] arr1 = code.toCharArray();
        for (int i = 0; i < arr1.length; i++) {
            int index = r.nextInt(arr1.length);
            char temp = arr1[i];
            arr1[i] = arr1[index];
            arr1[index] = temp;
        }
        String last_code = new String(arr1);
        System.out.println(last_code);
    }
}
