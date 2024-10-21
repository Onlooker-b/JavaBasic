package Day21.a03sortalgorithm;

public class BubbleSort {
    public static void main(String[] args) {
        /* 冒泡排序：
         * 1. 相邻的元素两两比较，大的放右边，小的放左边
         * 2. 第一轮比较完毕之后，最大值就已经确定，第二轮可以少循环一次，后面以此类推
         * 3. 如果数组中有n个数据，总共我们只要执行n-1轮的代码就可以
         */

        // 1、定义数组
        int[] arr = { 2, 4, 5, 3, 1 };

        // 2、利用冒泡排序
        // 第一轮之后，最大值在最右边
        // 第二轮之后，最大值是最右边-1
        // 一共多少轮：n个数据需要执行n-1轮
        for (int j = 0; j < arr.length - 1; j++) {
            // -1防止越界 -j是因为最右边已经排序好的数据不需要再参与
            for (int i = 0; i < arr.length - 1 - j; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
