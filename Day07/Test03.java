import java.util.Random;

public class Test03 {
    public static void main(String[] args) {
        /* 需求：
         * 定义方法实现随机产生一个5位的验证码
         * 验证码格式：
         * 长度为5
         * 前四位是大写字母或者小写字母
         * 最后一位是数字
        */

        /* 解决随机抽取的思路：
           1、如果我们想要进行随机抽取，可以把要被抽取的内容放到数组中
           2、再随机生成一个索引，就能把数组中的元素随机抽出来了
        */ 

        //1、先把a-z和A-Z放到数组中，使用ASCII码
        char[] chs = new char[52];
        for (int i = 0; i < chs.length; i++) {
            if (i <= 25) {
                //将a对应的97强转为char类型
                chs[i] = (char)(97+i);
            } else {
                //A对应为65，此时的i已经是26了
                chs[i] = (char)(65+i-26);
            }
        }
        //把数组输出看看
        for (int i = 0; i < chs.length; i++) {
            System.out.print(chs[i]+" ");
        }

        //2、从这个数组中随机抽取四次，利用循环
        String veri_code = "";
        Random r = new Random();
        for (int i = 0; i < 4; i++) {
            int randomIndex = r.nextInt(chs.length); // 抽取的数字范围是0-51
            veri_code = veri_code + chs[randomIndex];
        }

        //3、随机一个0-9的数字
        int number = r.nextInt(10);
        veri_code += number;
        System.out.println("\n"+veri_code);
    }
}
