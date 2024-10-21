package Day16.Demo;

import java.util.Random;

public class Test01 {
    public static void main(String[] args) {
        /* 需求：
         * 把一个一维数组中的数据打乱顺序
         * 然后四个为一组，建立二维数组
         */

        // 1、定义一个一维数组
        int[] arr = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        // 2、打乱内部顺利
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            int ram_index = r.nextInt(arr.length);
            int temp = arr[i];
            arr[i] = arr[ram_index];
            arr[ram_index] = temp;
        }
        // 3、遍历数组
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }

        // 关于二维数组有两种解决方案

        // 一、把找到二维数组索引与原数组索引的关系
        // 4、创建一个二维数组
        int[][] new_arr = new int[4][4];

        // 5、给二维数组添加数据
        for (int i = 0; i < arr.length; i++) {
            new_arr[i / 4][i % 4] = arr[i];
        }
        for (int i = 0; i < new_arr.length; i++) {
            // new_arr[i]是一维数组
            for (int j = 0; j < new_arr[i].length; j++) {
                System.out.print(new_arr[i][j] + " ");
            }
            System.out.println();
        }


        // 二、遍历二维数组，给每一个索引对应的位置赋值
        // 4、创建一个二维数组
        int[][] new_arr2 = new int[4][4];
        // index表示原数组的索引
        int index = 0;
        for (int i = 0; i < new_arr2.length; i++) {
            for (int j = 0; j < new_arr2[i].length; j++) {
                new_arr2[i][j] = arr[index];
                // 把原数组的值赋给二维数组后，自增
                index++;
                System.out.print(new_arr2[i][j] + " ");
            }
            System.out.println();
        }
    }
}
