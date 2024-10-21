package Day21.a06Lambda;

import java.util.Arrays;
import java.util.Comparator;

public class Demo2 {
    public static void main(String[] args) {
        /*
         * 定义数组并存储一些字符串，利用Arrays中的sort方法进行排序
         * 要求：
         *     按照字符串长度排序，短的在前，长的在后
         *     不比较字符串中的内容
         */

        String[] arr = {"a", "aaaa", "aa", "aaa"};
        String[] arr2 = { "a", "aaaa", "aa", "aaa" };

        // 如果以后我们需要把数组中的数据按照一定规则排序，就需要使用重写的sort方法
        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2){
                // 用字符串长度进行排序
                return s1.length() - s2.length();
            }
        });
        System.out.println(Arrays.toString(arr));

        // lambda
        Arrays.sort(arr2, (s1, s2) -> s1.length() - s2.length());
        System.out.println(Arrays.toString(arr2));
    }
}
