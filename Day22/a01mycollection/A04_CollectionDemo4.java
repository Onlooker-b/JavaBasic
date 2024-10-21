package Day22.a01mycollection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class A04_CollectionDemo4 {
    /*
     * 迭代器的细节注意点：
     * 1.报错NoSuchElementException
     * 2.迭代器遍历完毕，指针不会复位
     * 3.循环中只能用一次next方法
     * 4.迭代器遍历时，不能用集合的方法进行增加或者删除
     */
    public static void main(String[] args) {
        // 1、创建集合，添加元素
        Collection<String> coll = new ArrayList<>();
        coll.add("aaa");
        coll.add("bbb");
        coll.add("ccc");
        coll.add("ddd");

        // 2、获取迭代器对象，默认指向0索引
        Iterator<String> it = coll.iterator();

        // 3、利用循环不断去获取集合中的元素
        // 判断当前是否存在元素
        while (it.hasNext()) {
            // 当前元素存在，就获取当前元素并且后移一位
            String s = it.next();
            // 4.迭代器遍历时，不能用集合的方法进行增加或者删除
            if ("bbb".equals(s)) {
                // coll.remove(s); ConcurrentModificationException
                // 只能使用迭代器的方法删除
                it.remove();
            }
            
        }
        System.out.println(coll);
    }
}