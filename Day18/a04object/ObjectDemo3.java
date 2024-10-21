package Day18.a04object;

import com.google.gson.Gson;

public class ObjectDemo3 {
    public static void main(String[] args) throws CloneNotSupportedException {
        // protected Object clone(int a)

        // 1、创建对象
        // 数组表示他现在玩到几关了
        int[] data = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 0 };
        User u1 = new User(1, "zhangsan", "1234qwer", "girl11", data);
        
        // 2、克隆对象，浅克隆：克隆的是引用类型的地址值
        User u2 = (User)u1.clone();
        System.out.println(u1);
        System.out.println(u2);
        // 细节:
        // 方法在底层会帮我们创建一个对象,并把原对象中的数据拷贝过去。
        // 书写细节:
        // 1.重写Object中的clone方法
        // 2.让javabean类实现Cloneable接口
        // 3.创建原对象并调用clone就可以了


        User1 new_u1 = new User1(1, "zhangsan", "1234qwer", "girl11", data);
        User1 new_u2 = (User1) new_u1.clone();
        int[] arr = new_u1.getData();
        arr[0] = 100;
        System.out.println(new_u1);
        System.out.println(new_u2);

        System.out.println("----------------------");
        // 使用第三方工具
        Gson gson = new Gson();
        // 把对象变成字符串
        String s = gson.toJson(u1);
        System.out.println(s);
        // 把字符串变成一个新的对象
        User user = gson.fromJson(s, User.class);
        // 打印对象
        System.out.println(user);

    }
}
