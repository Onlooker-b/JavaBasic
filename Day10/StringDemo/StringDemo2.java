package Day10.StringDemo;

import java.util.Scanner;

public class StringDemo2 {
    public static void main(String[] args) {
        /*
        已知用户名和密码，请用程序实现模拟用户登录。
        总共给三次机会，登录之后，给出相应的提示
        */
        //1、定义两个变量记录正确的用户名和密码
        String username = "YuanJia";
        String password = "Yi";

        //2、让用户输入
        for (int i = 0; i < 3; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入用户名：");
            String uname = sc.nextLine();
            System.out.println("请输入密码：");
            String pword = sc.nextLine();

            // 3、比较
            if (username.equals(uname) && password.equals(pword)) {
                System.out.println("用户登录成功！");
                break;
            } else {
                if (i==0 || i==1) {
                    System.out.println("用户登录失败，用户名或者密码错误！");
                    System.out.println("你还有"+(2-i)+"次机会");
                } else {
                    System.out.println("用户登录失败，用户名或者密码错误！");
                    System.out.println("三次机会已经全部用完！");
                }
            }            
        }
    }
}
