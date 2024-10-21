package Day21.a05MyArray;

import java.util.Arrays;
import java.util.Comparator;

public class Demo1 {
    public static void main(String[] args) {
        /*
         * publish static void sort(数组，排序规则)   按照指定规则排序
         * 参数一：要排序的数组
         * 参数二：排序的规则
         * 
         * 细节：
         *    只能给引用类型的数组进行排序
         *    如果数组是基本数据类型的，需要变成其对应的包装类
         */
        
        // 只能进行升序排序，底层是快速排序逻辑
        int[] arr = { 10, 4, 2, 5, 0, 1, 7, 8, 6, 9 };
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("--------------------");

        // 变成对应包装类
        Integer[] arr2 = { 10, 4, 2, 5, 0, 1, 7, 8, 6, 9 };

        // 第二个参数是一个接口，需要传递实现类对象，作为排序的规则
        // 但是这个实现类只用一次，所以没必要单独写一个，直接采取匿名内部类

        // 底层原理：
        // 利用插入排序 + 二分查找的方式进行排序
        // 默认把0索引的数据当作是有序的序列，索引到最后认为是无序的序列
        // 遍历无序的序列里面的每一个元素，假设当前遍历得到的元素是A元素
        // 把A往有序序列中插入时，利用二分查找确定A元素的插入点
        // 拿着A元素，跟插入点的元素进行比较，比较的规则就是compare方法的方法体
        // 如果是负数，拿着A与前面的数据比较
        // 如果是正数，拿着A与后面的数据比较
        // 如果是0，也与后面的比较
        // 最终确定A的位置

        // compare方法的形参：
        // o1:表示在无序序列中，遍历到的每一个元素
        // o2:有序序列的元素

        // 返回值：
        // 负数，表示当前插入的元素是小的，放前面
        // 正数，当前插入的元素大，放后面
        // 0，当前要插入的元素与现在的比是一样的，也放在后面
        Arrays.sort(arr2, new Comparator<Integer>() {
            // 实现Comparator接口，在内部重写所以抽象方法
            @Override
            public int compare(Integer o1, Integer o2) {
                // o1-o2：升序
                // o2-o1：降序
                return o2-o1;
            }
            
        });
        System.out.println(Arrays.toString(arr2));
    }
}
