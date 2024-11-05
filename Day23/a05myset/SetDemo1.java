package Day23.a05myset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.function.Consumer;

public class SetDemo1 {
    public static void main(String[] args) {
        /*
        利用Set系列的集合，添加字符串，并使用多种方式遍历。
            迭代器
            增强for
            Lambda表达式
        */

        // 1、set是接口，不能直接创建set对象，只能创建实现类对象Hashset
        Set<String> set = new HashSet<>();
        // 2、添加元素，set的唯一性，集合内的元素不能重复
        set.add("zhangsan");
        set.add("lisi");
        set.add("wangwu");
        set.add("zhaoliu");
        // 3、输出结果是无序的
        System.out.println(set);
        // 4、没有索引，只能直接删除指定元素
        set.remove("zhangsan");
        System.out.println(set);

        // 1、使用迭代器遍历
        Iterator<String> it = set.iterator();
        while (it.hasNext()){
            String next = it.next();
            System.out.println(next);
        }
        System.out.println("---------");
        // 2、增强for遍历
        for (String s : set){
            System.out.println(s);
        }
        System.out.println("---------");
        // 3、lambda表达式
        set.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });
        System.out.println("---------");
        // 3、lambda表达式简化
        set.forEach(s -> System.out.println(s));
    }
}
