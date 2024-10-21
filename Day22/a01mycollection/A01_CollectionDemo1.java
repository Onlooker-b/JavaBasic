package Day22.a01mycollection;

import java.util.ArrayList;
import java.util.Collection;

public class A01_CollectionDemo1 {
    public static void main(String[] args) {
        /*
         * public boolean add(E e) 添加
         * public void clear() 清空
         * public boolean remove(E e) 删除
         * public boolean contains(Object obj) 判断是否包含
         * public boolean isEmpty() 判断是否为空
         * public int size() 集合长度
         * 
         * 
         * 注意点：
         * Collection是一个接口,我们不能直接创建他的对象。
         * 所以，现在我们学习他的方法时，只能创建他实现类的对象。
         * 实现类：ArrayList
         */

        // 采用多态的创建对象的方式，学习Collection接口
        Collection<String> coll = new ArrayList<>();
        ArrayList<String> array = new ArrayList<>();
        
        // 细节1：往List系列集合中添加数据，那么方法永远返回true，因为List系列的是允许元素重复的。
        // 细节2：往Set系列集合中添加数据，如果当前要添加元素不存在，方法返回true，表示添加成功。
        //        如果当前要添加的元素已经存在，方法返回false，表示添加失败。

        // 1、添加
        coll.add("aaa");
        coll.add("bbb");
        coll.add("ccc");
        System.out.println(coll);
        // 2、清空
        //coll.clear();

        // 3、删除       
        array.add("123");
        array.add("dada");
        array.remove(0);
        System.out.println(array);
        // 因为这里采用的是共性的方法，所以不能通过索引进行删除，只能直接通过元素的对象进行删除
        // 删除成功ture，删除失败返回false
        coll.remove("aaa");
        System.out.println(coll);

        // 4.判断元素是否包含
        // 细节：底层是依赖equals方法进行判断是否存在的。
        // 所以，如果集合中存储的是自定义对象，也想通过contains方法来判断是否包含，那么在javabean类中，一定要重写equals方法。
        boolean result1 = coll.contains("bbb");
        System.out.println(result1);

        // 5.判断集合是否为空
        boolean result2 = coll.isEmpty();
        System.out.println(result2);// false

        // 6.获取集合的长度
        coll.add("ddd");
        int size = coll.size();
        System.out.println(size);// 3
    }
}
