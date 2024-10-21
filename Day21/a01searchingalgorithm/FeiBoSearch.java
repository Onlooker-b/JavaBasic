package Day21.a01searchingalgorithm;

import java.util.Arrays;

public class FeiBoSearch {
    public static void main(String[] args) {
        int[] arr = { 7, 23, 79, 81, 103, 127, 131, 147 };
        System.out.println(fibonacciSearch(arr, 150));
    }

    // 1、获取斐波那契数列，该数列中的最大值要大于或等于数组的长度。
    public static int[] fibonacci(int size) {
        int[] f = new int[size];
        f[0] = 0;
        f[1] = 1;
        for (int i = 2; i < f.length; i++) {
            f[i] = f[i-1] + f[i-2];
        }
        return f;
    }
    private static int fibonacciSearch(int[] arr, int value) {
        int n = arr.length;
        // 构建斐波那契数列
        int[] fib = fibonacci(20); // 假设数组的长度不会超过20

        // 找到斐波那契数列中大于或等于n的最小值
        int k = 0;
        while (fib[k] < n) {
            k++;
        }
        // 为了避免数组下标越界，扩展数组至fib[k]大小
        int[] temp = Arrays.copyOf(arr, fib[k]);
        for (int i = n; i < fib[k]; i++) {
            temp[i] = arr[n - 1]; // 填充最后的值
        }

        int low = 0;
        int high = n - 1;
        while (low <= high) {
            int mid = low + fib[k - 1] - 1;

            if (temp[mid] < value) {
                low = mid + 1;
                k -= 2;  // 移动斐波那契数列指针
            } else if (temp[mid] > value) {
                high = mid - 1;
                k -= 1;  // 移动斐波那契数列指针
            } else {
                // 如果mid超过原数组范围，则返回最后一个有效元素下标
                return Math.min(mid, high);
            }
        }

        return -1;  // 未找到
    }
}
