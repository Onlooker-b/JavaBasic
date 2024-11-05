package Day23.a05myset;

import java.util.HashSet;

public class HashSetDemo1 {
    public static void main(String[] args) {
        /*
            哈希值：
                对象的整数表现形式
                1. 如果没有重写hashCode方法，不同对象计算出的哈希值是不同的
                2. 如果已经重写hashcode方法，不同的对象只要属性值相同，计算出的哈希值就是一样的
                3. 但是在小部分情况下，不同的属性值或者不同的地址值计算出来的哈希值也有可能一样。（哈希碰撞）

           如果是我们自己定义的对象，例如Student类，需要我们自己在JavaBean里面重写equals和hashcode方法
           而String和Integer类型在Java底层就已经是编写完成的
         */
        Student s1 = new Student("张三", 14);
        Student s2 = new Student("张三", 14);
        Student s3 = new Student("李四",13);
        Student s4 = new Student("王五",16);

        // 1、如果没有重写hashCode方法，不同对象计算出的哈希值是不同的，现在已经重写了
        System.out.println("s1.hashCode() = " + s1.hashCode());
        System.out.println("s2.hashCode() = " + s2.hashCode());

        // 2、HashSet只能存储成员变量不同的对象
        HashSet<Student> hs = new HashSet<>();
        System.out.println(hs.add(s1)); // ture
        System.out.println(hs.add(s2)); // false
        System.out.println(hs.add(s3));
        System.out.println(hs.add(s4));

        // 3、打印集合
        System.out.println(hs);
    }
}
