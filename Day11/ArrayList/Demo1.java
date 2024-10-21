package Day11.ArrayList;

import java.util.ArrayList;

public class Demo1 {
    public static void main(String[] args) {
        //1、创建集合对象
        //泛型：限定集合中存储的对象
        ArrayList<String> array = new ArrayList<>();

        //打印集合内所有的东西，并且使用[]包裹
        //2、添加元素
        array.add("Java");
        array.add("hello");
        array.add("world");
        System.out.println(array); // [Java, hello, world]

        //public boolean remove(Object o)：删除指定的元素，返回删除是否成功
        array.remove("world"); //true
        System.out.println(array);
        System.out.println("--------------");

        //public E remove(int index)：删除指定索引处的元素，返回被删除的元素
        String s = array.remove(1); //hello
        System.out.println(s);
        System.out.println(array);
        System.out.println("--------------");
        //System.out.println(array.remove(3)); IndexOutOfBoundsException

        array.add("Java");
        array.add("hello");
        array.add("world");     
        System.out.println(array);   
        //public E set(int index,E element)：修改指定索引处的元素，返回被修改的元素
        String s1 = array.set(1,"javaee"); //hello
        System.out.println(s1);
        System.out.println(array);
        System.out.println("-------------");
        //System.out.println(array.set(3,"javaee")); IndexOutOfBoundsException


        
        //public E get(int index)：返回指定索引处的元素
        System.out.println(array.get(0));
        System.out.println(array.get(1));
        System.out.println(array.get(2));
        System.out.println(array.get(3));
        //System.out.println(array.get(4)); IndexOutOfBoundsException

        //int size()：获取长度
        System.out.println(array.size());
        System.out.println("--------------");

        //遍历
        for (int i = 0; i < array.size(); i++) {
            System.out.println(array.get(i));
        }
    }
}
