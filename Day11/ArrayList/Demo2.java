package Day11.ArrayList;

import java.util.ArrayList;

public class Demo2 {
    // 创建一个存储学生对象的集合，存储3个学生对象，使用程序实现在控制台遍历该集合
    public static void main(String[] args) {
        //1、创建集合
        ArrayList<Student> list = new ArrayList<>();

        //2、创建学生对象
        Student s1 = new Student("zhangsan", 16);
        Student s2 = new Student("lisi", 15);
        Student s3 = new Student("wangwu", 18);

        //3、把对象添加集合中
        list.add(s1);
        list.add(s2);
        list.add(s3);

        //4、遍历
        for (int i = 0; i < list.size(); i++) {
            Student s = list.get(i);
            System.out.println("我的名字是"+s.getName()+"，我今年"+s.getAge());
        }
    }
}
