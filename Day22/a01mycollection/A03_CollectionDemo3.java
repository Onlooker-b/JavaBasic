package Day22.a01mycollection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class A03_CollectionDemo3 {
    public static void main(String[] args) {
        /*
         * Collection系列集合三种通用的遍历方式：
         *    1.迭代器遍历：不依赖索引，靠指针移动
         *    2.增强for遍历
         *    3.lambda表达式遍历
         * 
         * 
         * 迭代器遍历相关的三个方法：
         *    Iterator<E> iterator() ：获取一个迭代器对象
         *    boolean hasNext() ：判断当前指向的位置是否有元素
         *    E next() ：获取当前指向的元素并移动指针
         */
        /*
         * 迭代器的细节注意点：
         * 1.报错NoSuchElementException
         * 2.迭代器遍历完毕，指针不会复位
         * 3.循环中只能用一次next方法
         * 4.迭代器遍历时，不能用集合的方法进行增加或者删除
         */
        
        // 1、创建集合，添加元素
        Collection<String> coll = new ArrayList<>();
        coll.add("aaa");
        coll.add("bbb");
        coll.add("ccc");

        // 2、获取迭代器对象，默认指向0索引
        Iterator<String> it = coll.iterator();

        // 3、利用循环不断去获取集合中的元素
        // 判断当前是否存在元素
        while (it.hasNext()) {
            // 当前元素存在，就获取当前元素并且后移一位
            String s = it.next();
            System.out.println(s);
        }
        // 遍历结束再调用next，指针再最后且不复位
        System.out.println(it.next()); // NoSuchElementException

        // 如果我们要继续第二次遍历集合，只能再次获取一个新的迭代器对象
        Iterator<String> it2 = coll.iterator();
        while (it2.hasNext()) {
            String str = it2.next();
            System.out.println(str);
        }
    }
}
