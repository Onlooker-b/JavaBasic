package Day12;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        ArrayList<User> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        loop: while (true) {
            System.out.println("欢迎来到学生管理系统");
            System.out.println("请选择操作：1登录 2注册 3忘记密码 4退出");
            String choose = sc.next();
            switch (choose) {
                case "1":
                    login(list);
                    break;         
                case "2":
                    register(list);
                    break;
                case "3":
                    forgetPassword(list);
                    break;
                case "4":{
                    System.out.println("感谢使用，已退出");
                    break loop;
                }
                default:
                    System.out.println("没有这个选项");
                    break;
            }
        }
    }

    private static void forgetPassword(ArrayList<User> list) {
        //1、先输入用户名，存在才能修改密码
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名：");
        String username = sc.next();
        if (!contain(list, username)) {
            //不存在, 直接返回菜单
            System.out.println("用户名不存在，请先注册！");
            return;
        }
        //2、输入身份证和电话号验证身份信息
        System.out.println("请输入身份证号码");
        String id_number = sc.next();
        System.out.println("请输入手机号码");
        String phone_number = sc.next();

        //3、获取用户对象，得先知道这个对象对应的索引值
        int index = findIndex(list,username);
        User u = list.get(index);
        //4、比较身份证和手机号
        if (!(u.getPersonID().equalsIgnoreCase(id_number) && u.getPhoneNumber().equals(phone_number))) {
            System.out.println("身份证号码或手机号输入有误，无法修改密码！");
            return;
        }
        // 执行到这里，身份验证成功了
        String password1;
        while (true) {
            System.out.println("请输入新的密码：");
            password1 = sc.next();
            System.out.println("请再次输入新的密码：");
            String password2 = sc.next();
            if (!password1.equals(password2)) {
                System.out.println("两次密码不一致，请再次输入！");
                continue;
            }else{
                System.out.println("两次密码输入一致");
                break;
            }
        }

        //5、把密码改了
        u.setPassword(password1);
        System.out.println("密码修改成功！");
    }

    private static int findIndex(ArrayList<User> list, String username) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getUsername().equals(username)) {
                return i;
            }
        }
        return -1;
    }

    private static void register(ArrayList<User> list) {
        //1、用户键盘录入用户名
        Scanner sc = new Scanner(System.in);
        String username;
        String password1;
        String id_number;
        String phone_number;
        while (true) {
            System.out.println("请输入用户名：");
            username = sc.next();
            /* 要求
             * 用户名唯一
             * 用户名长度必须在3~15位之间
             * 只能是字母加数字的组合，但是不能是纯数字
             */
            //先验证用户名的格式
            boolean flag1 = checkUsername(username);
            if (!flag1) {
                System.out.println("用户名格式不正确，需要重新输入！");
                continue;
            }
            //再验证用户名唯一
            boolean flag2 = contain(list,username);
            if (flag2) {
                System.out.println("当前用户名"+username+"已存在，需要重新输入");
                continue;
            }else{
                System.out.println("当前用户名"+username+"可用");
                break;
            }
        }
        //2、用户键盘录入密码
        while (true) {
            System.out.println("请输入要注册的密码：");
            password1 = sc.next();
            System.out.println("请再次输入要注册的密码：");
            String password2 = sc.next();
            /*
             * 要求
             * 两次输入的密码相同
             */
            if (password1.equals(password2)) {
                System.out.println("两次密码相同，密码设置成功！");
                break;
            }else{
                System.out.println("两次密码不同，请重新设置密码！");
                continue;
            }
        }
        //3、验证身份证号码
        while(true){
            System.out.println("请输入您的身份证号码：");
            id_number = sc.next();
            boolean flag3 = checkID(id_number);
            if (flag3) {
                System.out.println("身份证号码符合要求！");
                break;
            }else{
                System.out.println("身份证号码有误，重新输入！");
                continue;
            }
        }
        //4、验证手机号码
        while (true) {
            System.out.println("请输入您的手机号码：");
            phone_number = sc.next();
            boolean flag4 = checkPhone(phone_number);
            if (flag4) {
                System.out.println("手机号码符合要求！");
                break;
            } else {
                System.out.println("手机号码有误，重新输入！");
                continue;
            }
        }
        //把用户名、密码、身份证号、手机号放到集合中
        User u = new User(username, password1, id_number, phone_number);
        list.add(u);
        System.out.println("注册成功！");

        //遍历集合
        printList(list);
    }

    private static void printList(ArrayList<User> list) {
        for (int i = 0; i < list.size(); i++) {
            // i 索引
            User user = list.get(i);
            System.out.println(user.getUsername() + ", " + user.getPassword() + ", "
                    + user.getPersonID() + ", " + user.getPhoneNumber());
        }
    }

    private static boolean checkPhone(String phone_number) {
        //1、长度为11位
        if (phone_number.length() != 11) {
            return false;
        }
        //2、不能以0开头
        if (phone_number.startsWith("0")) {
            return false;
        }
        //3、必须都是数字
        for (int i = 0; i < phone_number.length(); i++) {
            char c = phone_number.charAt(i);
            // 只要出现一个字符不在0-9之间
            if (!(c >= '0' && c <= '9')) {
                return false;
            }
        }        
        return true;
    }

    private static boolean checkID(String id_number) {
        //1、长度为18
        if (id_number.length() != 18) {
            System.out.println("身份证号码长度有误，重新输入！");
            return false;
        }
        //2、0不在开头
        if (id_number.startsWith("0")) {
            return false;
        }
        //3、前17位为数字
        for (int i = 0; i < id_number.length()-1; i++) {
            char c = id_number.charAt(i);
            //只要出现一个字符不在0-9之间
            if (!(c >= '0' && c <= '9')) {
                return false;
            }
        }
        //4、最后一位数字或者x/X
        char last = id_number.charAt(id_number.length() - 1);
        if (!((last>='0' && last<='9') || last=='x' || last=='X')) {
            return false;
        }
        return true;
    }

    private static boolean contain(ArrayList<User> list, String username) {
        for (int i = 0; i < list.size(); i++) {
            User u = list.get(i);
            String exsiting_username = u.getUsername();
            if (exsiting_username.equals(username)) {
                return true;
            }
        }
        return false;
    }

    //验证用户名格式
    private static boolean checkUsername(String username){
        //1、长度3到15
        int len = username.length();
        if (len<3 || len>16) {
            return false;
        }
        //2、数字＋字母
        for (int i = 0; i < len; i++) {
            //获取每一个字符
            char c = username.charAt(i);
            //不在（小写字母或者大写字母或者数字）
            if (!((c>='a'&&c<='z') || (c>='A'&&c<='Z') || (c>='0'&&c<='9'))) {
                return false;
            }
        }
        //3、不能是纯数字 == 数字的个数不等于username的长度
        int count = 0;
        for (int i = 0; i < len; i++) {
            //获取每一个字符
            char c = username.charAt(i);
            //计算数字的个数
            if (c >= '0' && c <= '9') {
                count++;
            }
        }    
        if (count == len) {
            return false;
        }  
        return true; 
    }

    private static void login(ArrayList<User> list) {
        Scanner sc = new Scanner(System.in);

        //只给3次输入用户名和密码的机会
        for (int i = 0; i < 3; i++) {
            System.out.println("请输入用户名：");
            String username = sc.next();
            //判断用户名是否在集合中存在，存在才能登录
            if (!contain(list, username)) {
                System.out.println("用户名"+ username +"不存在，请先注册！");
                //返回到最开始的菜单
                return;
            }
            System.out.println("请输入密码：");
            String password = sc.next();
            //1、先给出验证码
            while (true) {
                String code = getCode();
                System.out.println("请输入验证码" + code);
                String code2 = sc.next();
                if (!(code2.equalsIgnoreCase(code))) {
                    System.out.println("你输入的验证码有误，请重新输入：");
                    continue;
                }else{
                    break;
                }
            }
            //2、验证用户名和密码是否匹配
            boolean flag = checkUserInfo_1(list, username, password);
            /* 封装思想的应用：
             * 可以把零散数据，封装成一个对象
             * 以后传递参数时，只需要传递一个整体，不需要管零散的数据
             */
            User userInfo = new User(username, password, null, null);
            boolean result = checkUserInfo(list, userInfo);
            if (result) {
                System.out.println("登录成功，可以开始使用学生管理系统！");
                break;
            }else{
                System.out.println("登录失败，用户名或密码错误！");
                if (i == 2) {
                    System.out.println("三次机会已用完，当前账号已锁定，请联系管理员！");
                    //当前账号被锁定，直接结束login方法
                    return;
                } else {
                    System.out.println("还剩"+(2-i)+"次机会");
                }
            }
        }
    }
    
    //验证用户名和密码
    private static boolean checkUserInfo(ArrayList<User> list, User userInfo) {
        for (int i = 0; i < list.size(); i++) {
            User u = list.get(i);
            // 获取username
            if (u.getUsername().equals(userInfo.getUsername()) && u.getPassword().equals(userInfo.getPassword())) {
                return true;
            }
        }
        return false;
    }
    private static boolean checkUserInfo_1(ArrayList<User> list, String username, String password) {
        for (int i = 0; i < list.size(); i++) {
            User u = list.get(i);
            //获取username
            if (u.getUsername().equals(username) && u.getPassword().equals(password)) {
                return true;
            }
        }
        return false;
    }

    //生成验证码
    private static String getCode(){
        //1、创建一个有大小写字母的集合
        ArrayList<Character> list = new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            list.add((char) ('a' + i)); // 小写
            list.add((char) ('A' + i)); // 大写
        }
        //2、随机从中抽取四个字符
        StringBuilder sb = new StringBuilder();
        Random r = new Random();
        for (int i = 0; i < 4; i++) {
            int index = r.nextInt(list.size());
            char c = list.get(index);
            sb.append(c);
        }
        //3、把随机生成的数字放到末尾
        int number = r.nextInt(10);
        sb.append(number);
        //4、把字符串变为字符数组，再使用随机索引改变顺序
        char[] arr = sb.toString().toCharArray();
        int ram_index = r.nextInt(arr.length);
        char temp = arr[ram_index];
        arr[ram_index] = arr[arr.length-1];
        arr[arr.length-1] = temp;
        //5、字符数组变字符串
        String s = new String(arr);
        return s;
    }
}
