import java.util.Random;

public class Test08 {
    public static void main(String[] args) {
        /*
         * 需求：
         * 一个大V直播抽奖，奖品是现金红包，分别有{2, 588 , 888, 1000, 10000}五个奖金。
         * 请使用代码模拟抽奖，打印出每个奖项，奖项的出现顺序要随机且不重复。
         * 打印效果如下：（随机顺序，不一定是下面的顺序）
         * 888元的奖金被抽出
         * 588元的奖金被抽出
         * 10000元的奖金被抽出
         * 1000元的奖金被抽出
         * 2元的奖金被抽出
         */

        //1、写一个奖池的数组，用来存这些奖金
        int[] arr = {2,588,888,1000,10000};
        //2、写一个新的数组，存放被抽出的奖金
        int[] new_arr = new int[arr.length];
        //3、写一个循环进行抽取
        Random r = new Random();
        for (int i = 0; i < 5;) {
            int index = r.nextInt(arr.length);
            int price = arr[index];
            //要判断这个抽出来的奖没被抽出来过
            if (contains(new_arr, price) == false) {
                //把新抽出来的放到新数组
                new_arr[i] = price;
                i++;
            }
        }

        for (int i = 0; i < new_arr.length; i++) {
            System.out.print(new_arr[i]+"  ");
        }
    }
    //写一个方法判断抽没抽过
    public static boolean contains(int[] arr,int prize){
        boolean flag = false;
        for (int i = 0; i < arr.length; i++) {
            if (prize == arr[i]) {
                //存在是真
                flag = true;
            }
            else{
                //没有是false
                flag = false;
            }
        }
        return flag;
    }
}
