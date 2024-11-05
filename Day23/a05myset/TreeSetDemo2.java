package Day23.a05myset;

import java.util.TreeSet;

public class TreeSetDemo2 {
    public static void main(String[] args) {
        /*
            需求：创建TreeSet集合，并添加3个学生对象
            学生对象属性：
                姓名，年龄。
                要求按照学生的年龄进行排序
                同年龄按照姓名字母排列（暂不考虑中文）
                同姓名，同年龄认为是同一个人

            方式一：
                默认的排序规则/自然排序
                Student实现Comparable接口，重写里面的抽象方法，再指定比较规则

            TreeSet已经通过Comparable接口来进行比较了，不需要重写hashCode和equals方法
            TreeSet 底层是红黑树
            重写hashCode和equals方法：HashSet和LinkedHashSet
         */
        // 1.创建三个学生对象
        Student s1 = new Student("zhangsan",23);
        Student s2 = new Student("lisi",24);
        Student s3 = new Student("wangwu",25);
        Student s4 = new Student("zhaoliu",26);
        // 2.创建集合对象
        TreeSet<Student> ts = new TreeSet<>();

        // 3.添加元素
        // 没有指定比较规则的情况下无法添加元素，因为TreeSet不知道要怎么排序
        ts.add(s2);
        ts.add(s4);
        ts.add(s3);
        ts.add(s1);
        //4.打印集合
        //[Student{name = zhangsan, age = 23}, Student{name = lisi, age = 24}, Student{name = wangwu, age = 25}, Student{name = zhaoliu, age = 26}]
        System.out.println(ts);
    }
}
