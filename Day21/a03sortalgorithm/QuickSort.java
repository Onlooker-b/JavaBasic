package Day21.a03sortalgorithm;

public class QuickSort {
    public static void main(String[] args) {
        /* 快速排序：
         * 1. 从数列中挑出一个元素，一般都是左边第一个数字，称为 "基准数";
         * 2. 创建两个指针，一个从前往后走，一个从后往前走。
         * 3. 先执行后面的指针，找出第一个比基准数小的数字
         * 4. 再执行前面的指针，找出第一个比基准数大的数字
         * 5. 交换两个指针指向的数字
         * 6. 直到两个指针相遇
         * 7. 将基准数跟指针指向位置的数字交换位置，称之为：基准数归位。
         * 8. 第一轮结束之后，基准数左边的数字都是比基准数小的，基准数右边的数字都是比基准数大的。
         * 9. 把基准数左边看做一个序列，把基准数右边看做一个序列，按照刚刚的规则递归排序
         */

        /*
        快速排序：
            第一轮：以0索引的数字为基准数，确定基准数在数组中正确的位置。
            比基准数小的全部在左边，比基准数大的全部在右边。
            后面以此类推。
        */
        int[] arr = { 6, 1, 2, 7, 9, 3, 4, 5, 1, 10, 8 };
        quickSort(arr, 0, arr.length - 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    // 参数一：需要排序的数组
    // 参数二：从起始位置开始的指针
    // 参数三：从结束位置开始的指针
    public static void quickSort(int[] arr, int i, int j){
        // 记录两个指针的位置
        int start = i;
        int end = j;
        if (start > end) {
            return;
        }

        // 记录基准数
        int baseNumber = arr[i];

        // 利用循环找到需要交换的数字
        while (start != end) {
            // 利用end从后向前找，当end和start相遇的时候，或者是指向数字小于基准数时
            while (true) {
                if (end <= start || arr[end] < baseNumber) {
                    break; // 需要把这个数进行交换
                }
                end--;
            }
            // 利用start从前向后找，当end和start相遇的时候，或者是指向数字大于基准数时
            while (true) {
                if (end <= start || arr[start] > baseNumber) {
                    break; // 需要把这个数进行交换
                }
                start++;
            }
            // 交换end和start
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
        }

        // 当start和end指向了同一个元素的时候，那么上面的循环就会结束
        // 说明基准数的位置找到了，基准数两边的位置交换也已经完成
        // 就是拿着这个范围中的第一个数字，跟start指向的元素进行交换
        int temp = arr[i];
        arr[i] = arr[start]; // start=end
        arr[start] = temp;

        // 确定6左边的范围，重复左边取基准数，继续重复
        quickSort(arr, i, start-1);
        // 确定6右边的范围，重复右边取基准数，继续重复
        quickSort(arr, start+1, j);
    }
}
