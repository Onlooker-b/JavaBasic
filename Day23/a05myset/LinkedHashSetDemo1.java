package Day23.a05myset;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo1 {
    public static void main(String[] args) {
        // 1、创建四个学生对象
        Student s1 = new Student("zhangsan",29);
        Student s2 = new Student("lisi",31);
        Student s3 = new Student("wangwu",32);
        Student s4 = new Student("zhangsan",29);

        // 2、创建集合对象
        LinkedHashSet<Student> linkedHashSet = new LinkedHashSet<>();

        // 3、添加元素到集合中
        System.out.println(linkedHashSet.add(s1));
        System.out.println(linkedHashSet.add(s2));
        System.out.println(linkedHashSet.add(s3));
        System.out.println(linkedHashSet.add(s4)); // 添加失败

        // 4、打印集合
        /*  会按照添加顺序依次打印出来
            [Student{name = zhangsan, age = 29}, Student{name = lisi, age = 31}, Student{name = wangwu, age = 32}]
         */
        System.out.println(linkedHashSet);
    }
}
