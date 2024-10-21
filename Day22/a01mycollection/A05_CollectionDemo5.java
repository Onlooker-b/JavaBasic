package Day22.a01mycollection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Consumer;

public class A05_CollectionDemo5 {
    public static void main(String[] args) {
        /*
         * Collection系列集合三种通用的遍历方式：
         * 1.迭代器遍历
         * 2.增强for遍历
         * 3.lambda表达式遍历
         * 
         * 增强for格式：
         * for(数据类型 变量名: 集合/数组){
         * 
         * }
         * 
         * 快速生成方式：
         * 集合的名字 + for 回车
         * coll.for
         */

        /*
         * lambda表达式遍历：
         * default void forEach(Consumer<? super T> action):
         */

        // 1、创建集合并添加元素
        Collection<String> coll = new ArrayList<>();
        coll.add("zhangsan");
        coll.add("lisi");
        coll.add("wangwu");

        // 2、利用for进行增强遍历
        // s其实就是一个第三方变量，在循环的过程中依次表示集合中的每一个数据
        for(String s : coll){
            System.err.println(s);
        }

        // 匿名内部类
        /* 
        底层原理：
        其实也会自己遍历集合，依次得到每一个元素
        把得到的每一个元素，传递给下面的accept方法
        s依次表示集合中的每一个数据
        */
        coll.forEach(new Consumer<String>() {
            // 重写抽象方法
            @Override
            // s表示集合中的数据
            public void accept(String s){
                System.out.println(s);
            }
        });
        // 使用lambda表达式
        coll.forEach(s -> System.out.println(s));
    }
}