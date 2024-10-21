package Day22.a02mylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.Consumer;

public class A02_ListDemo2 {
    public static void main(String[] args) {
        /*
         * List系列集合的五种遍历方式：
         *   1.迭代器
         *   2.列表迭代器
         *   3.增强for
         *   4.匿名内部类
         *   5.Lambda表达式
         *   6.普通for循环
         */

        List<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");

        // 2、列表迭代器
        ListIterator<String> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            String s = listIterator.next();
            if (s.equals("aaa")) {
                // 不能用集合的方法
                listIterator.remove();
                listIterator.add("qqq");
            }
        }
        System.out.println("---2---");

        // 1、迭代器
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String s = it.next();
            System.out.println(s);
        }
        System.out.println("---1---");

        // 3、增强for
        // 下面的变量s，其实就是一个第三方的变量而已。
        // 在循环的过程中，依次表示集合中的每一个元素
        for(String s : list){
            System.out.println(s);
        }
        System.out.println("---3---");

        // 4、匿名内部类
        list.forEach(new Consumer<String>() {
            @Override
            // s表示集合中的数据
            public void accept(String s) {
                System.out.println(s);
            }
        });
        System.out.println("---4---");

        // 5、lambda
        list.forEach(s -> System.out.println(s));
        System.out.println("---5---");

        // 6、普通for循环
        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            System.out.println(s);
        }
        System.out.println("---6---");
    }
}
