package Day11.Demo2;

import java.util.ArrayList;

public class Test1 {
    public static void main(String[] args) {
        /*
         * 需求：
         * 1，main方法中定义一个集合，存入三个用户对象。
         * 用户属性为：id，username，password
         * 2，要求：定义一个方法，根据id查找对应的学生信息。
         * 如果存在，返回索引
         * 如果不存在，返回-1
         */
        ArrayList<User> list = new ArrayList<>();
        User u1 = new User(001, "zhangsan", "123456");
        User u2 = new User(002, "lisi", "1234");
        User u3 = new User(003, "wangwu", "1234qwer");
        list.add(u1);
        list.add(u2);
        list.add(u3);

        //根据id获取该学生在list中的索引
        int index = getIndex(list, 002);
        User u = list.get(index);
        System.out.println("学生id是"+u.getId()+"，学生的名字是"+u.getUsername());

    }
    // 定义一个方法，根据id查找对应的学生信息
    public static int getIndex(ArrayList<User> list, int id){
        //遍历
        for (int i = 0; i < list.size(); i++) {
            User u = list.get(i);
            if (u.getId() == id) {
                return i;
            }
        }
        return -1;
    }
    public static boolean contains(ArrayList<User> list, int id){
        return getIndex(list, id) >= 0;
    }
}
