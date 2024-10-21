package Day11.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Demo3 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        
        //键盘输入学生对象
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("请输入学生姓名：");
            String name = sc.next();
            System.out.println("请输入学生年龄：");
            int age = sc.nextInt();
            Student s = new Student(name,age);
            list.add(s);
        }
        for (int i = 0; i < list.size(); i++) {
            Student s = list.get(i);
            System.out.println("我的名字是" + s.getName() + "，我今年" + s.getAge());
        }        
    }
}
