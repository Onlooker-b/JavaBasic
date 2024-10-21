package Day21.a01searchingalgorithm;

import java.util.ArrayList;

public class BasicSearch {
    public static void main(String[] args) {
        // 基本查找/顺序查找
        // 核心：
        // 从0索引开始挨个往后查找

        // 需求：定义一个方法利用基本查找，查询某个元素是否存在
        // 数据如下：{131, 127, 147, 81, 103, 23, 7, 79}

        int[] arr = {131, 79, 147, 81, 103, 23, 7, 79};
        System.out.println(basicSearch1(arr,81));
        System.out.println(basicSearch2(arr, 79));
    }

    // 定义一个返回索引值的方法
    public static int basicSearch1(int[] arr, int value){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                return i;
            }
        }
        return -1;
    }

    // 考虑存在两个相同的值，返回这个集合
    public static ArrayList<Integer> basicSearch2(int[] arr, int value){
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                list.add(i);
            }
        }
        return list;
    }
}
