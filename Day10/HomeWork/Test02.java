package Day10.HomeWork;

public class Test02 {
    public static void main(String[] args) {
        /* 给定两个字符串，A和B
         * 将A最左边的字符移动到最右边，若干次操作后，A=B，返回True
         */

        //1、定义两个字符串
        String strA = "abcde";
        String strB = "cdeab";
        String strC = "dhshj";

        //2、将A最左边的字符移动到最右边
        System.out.println(check(strA, strB));
        System.out.println(check(strA, strC));

    }

    public static String rotate(String str){
        /*要修改字符串的内容，有以下两个方法：
          1、通过subString进行截取，将第一个字符截取出来放到最右边
          2、将字符串变为字符数组，然后调整字符数组里面的数据，最后把字符数组恢复为字符串
        */

        // //方法一：
        // //获取最左侧
        // String first = str.substring(0,1);
        // //获取剩余的字符串
        // String end = str.substring(1,str.length());
        // return end+ first;

        //方法二：
        //将字符串变成数组
        char[] arr = str.toCharArray();
        //获取第一个字符
        char first = arr[0];
        //将剩余的字符以此向前挪移一位
        for (int i = 1; i < arr.length; i++) {
            arr[i-1] = arr[i];
        }
        //把0索引位置的值放到最后一位
        arr[arr.length-1] = first;
        //用字符数组创建字符串对象
        String s = new String(arr);
        return s;
    }

    public static boolean check(String strA, String StrB){
        //旋转的次数应该等于strA的长度，超过的话就又变回最开始的strA了
        for (int i = 0; i < strA.length(); i++) {
            //每次旋转之后的值都应该重新赋给strA
            strA = rotate(strA);
            if (strA.equals(StrB)) {
                return true;
            }
        }
        return false;
    }
}

