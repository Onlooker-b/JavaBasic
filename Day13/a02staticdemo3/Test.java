package Day13.a02staticdemo3;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        // 1、创建一个集合
        ArrayList<Student> list = new ArrayList<>();
        Student s1 = new Student("张三", 20, "男");
        Student s2 = new Student("李四", 19, "女");
        Student s3 = new Student("董政", 24, "男");
        list.add(s1);
        list.add(s2);
        list.add(s3);

        // 2、调用工具类，获取最大年龄
        int maxAge = StudentUtil.getMaxAge(list);
        System.out.println(maxAge);
    }
}
