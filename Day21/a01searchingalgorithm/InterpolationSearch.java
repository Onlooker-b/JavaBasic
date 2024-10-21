package Day21.a01searchingalgorithm;

public class InterpolationSearch {
    public static void main(String[] args) {
        /*
         * 插值查找：
         * 可以将查找的点改进为如下：
         * mid=low+(key-a[low])/(a[high]-a[low])*(high-low)
         * 这样，让mid值的变化更靠近关键字key，这样也就间接地减少了比较次数。
         * 基本思想：基于二分查找算法，将查找点的选择改进为自适应选择，可以提高查找效率。当然，差值查找也属于有序查找。
         */
        int[] arr = { 7, 23, 79, 81, 103, 127, 131, 147 };
        System.out.println(interpolationSearch(arr, 150));
    }

    private static int interpolationSearch(int[] arr, int value) {
        // 1、定义两个变量记录要查找的范围
        int min = 0;
        int max = arr.length - 1;
        // 2、利用循环不断查找数据
        while (min <= max && value >= arr[min] && value <= arr[max]) {
            // 避免除数为0的情况
            if (arr[min] == arr[max]) {
                if (arr[min] == value) {
                    return min;
                }else{
                    return -1;
                }
            }
            int mid = min + (max - min) * (value - arr[min]) / (arr[max] - arr[min]);
            if (arr[mid] < value) {
                min = mid + 1;
            }else if (arr[mid] > value) {
                max = mid - 1;
            }else{
                return mid;
            }
        }
        return -1; // 遍历之后找不到
    }
}
