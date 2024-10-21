package Day21.a05MyArray;

import java.util.Arrays;
import java.util.Comparator;

public class Demo2 {
    public static void main(String[] args) {
        // 变成对应包装类
        Integer[] arr2 = { 10, 4, 2, 5, 0, 1, 7, 8, 6, 9 };

        // lambda表达式用于简化匿名内部类是书写
        // 只能简化函数式接口的匿名内部类的写法
        // 函数式接口：有且只有一个抽象方法的接口叫做函数式接口，可以用@FunctionalInterface注解验证
        Arrays.sort(arr2, (Integer o1, Integer o2) -> { 
                // o1-o2：升序
                // o2-o1：降序
                return o2-o1;
            }
        );
        System.out.println(Arrays.toString(arr2));


        // 省略版
        Arrays.sort(arr2, (o1, o2) -> o2-o1);
    }
}
