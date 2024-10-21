package Day21.a01searchingalgorithm;

public class BinarySearch {
    /* 二分查找：
     * 元素必须是有序的，从小到大，或者从大到小都是可以的。
     * 如果是无序的，也可以先进行排序。但是排序之后，会改变原有数据的顺序，查找出来元素位置跟原来的元素可能是不一样的，
     * 所以排序之后再查找只能判断当前数据是否在容器当中，返回的索引无实际的意义。
     * 
     * 1、min和max表示当前需要查找的范围
     * 2、mid在两者中间
     * 3、如果查找的元素在mid左边，缩小范围时，min不变，max = mid-1
     * 4、如果查找的元素在mid右边，缩小范围时，max不变，min = mid+1
     */
    public static void main(String[] args) {
        int[] arr = { 7, 23, 79, 81, 103, 127, 131, 147 };
        System.out.println(binarySearch(arr, 150));
    }
    
    public static int binarySearch(int[] arr, int value){
        // 1、定义两个变量记录要查找的范围
        int min = 0;
        int max = arr.length - 1;
        // 2、利用循环不断查找数据
        while (true) {
            if (min > max) {
                return -1;
            }
            // 3、定义一个mid辅助
            int mid = (max+min)/2;
            // (max + min) / 2 可能会在数组很大时导致溢出。可以改成 min + (max - min) / 2 以避免溢出问题。
            // 4、使用mid和value进行比较
            if (arr[mid] < value) { // 在右半部分
                min = mid + 1;
            }else if (arr[mid] > value) { // 在左半部分
                max = mid - 1;
            }else{
                return mid;
            }
        }
    }
}
