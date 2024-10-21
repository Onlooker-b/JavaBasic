package Day21.a03sortalgorithm;

public class SelectionSort {
    public static void main(String[] args) {
        /* 选择排序：
         * 1. 从0索引开始，跟后面的元素一一比较
         * 2. 小的放前面，大的放后面
         * 3. 第一次循环结束后，最小的数据已经确定
         * 4. 第二次循环从1索引开始以此类推
         * 5. 第三轮循环从2索引开始以此类推
         * 6. 第四轮循环从3索引开始以此类推。
         */

        // 1、定义数组
        int[] arr = { 2, 4, 5, 3, 1 };

        // 2、选择排序
        // 外循环：n-1轮
        for (int j = 0; j < arr.length -1; j++) {
            for (int i = j + 1; i < arr.length; i++) {
                // 第一轮：把0索引的值与后面的元素进行比较
                if (arr[j] > arr[i]) {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                } 
            }
        }
       
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
