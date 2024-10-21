package Day11.StudentManager;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentTest {
    // 使用静态代码块，可以初始化值
    // 把这个列表也静态化，相当于固定了内存地址
    static ArrayList<Student> list = new ArrayList<>();
    static{
        // 预先添加一些用户信息
        Student s1 = new Student("heima001", "zhangsan", 20, "hudjabui");
        list.add(s1);
    }
    private static final String ADD_STUDENT = "1";
    private static final String DELET_STUDENT = "2";
    private static final String UPDATE_STUDENT = "3";
    private static final String QUERY_STUDENT = "4";
    private static final String EXIT = "5";
    public static void main(String[] args) {
        //将外面这个while循环命名为loop，这样可以指定跳出这个loop循环
        loop: while (true) {
            System.out.println("-----------------欢迎来到黑马学生管理系统-------------------");
            System.out.println("1:添加学生");
            System.out.println("2:删除学生");
            System.out.println("3:修改学生");
            System.out.println("4:查询学生");
            System.out.println("5:退出");
            System.out.println("请输入您的选择：");
            Scanner sc = new Scanner(System.in);
            String choose = sc.next();
            switch (choose) {
                case ADD_STUDENT:
                    addStudent(list);
                    break;
                case DELET_STUDENT:
                    deletStudent(list);
                    break;
                case UPDATE_STUDENT:
                    updateStudent(list);
                    break;
                case QUERY_STUDENT:
                    queryStudent(list);
                    break;
                case EXIT:{
                    System.out.println("退出黑马学生管理系统");
                    break loop;
                    //System.exit(0);// 停止虚拟机运行
                }
                default:
                    System.out.println("没有这个选项");
            }
        }
    }
    // 添加学生
    public static void addStudent(ArrayList<Student> list) {
        Student s = new Student();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入学生的id：");
            String id = sc.next();
            //如果该id已经存在
            if (contains(list, id)) {
                System.out.println("该id已经存在，请重新输入！");
                continue;
            } else {
                s.setSid(id);
                break;
            }
        }
        System.out.println("请输入学生的姓名：");
        String name = sc.next();
        s.setName(name);
        System.out.println("请输入学生的年龄：");
        int age = sc.nextInt();
        s.setAge(age);  
        System.out.println("请输入学生的地址：");
        String address = sc.next();
        s.setAddress(address);     
        
        list.add(s);
        System.out.println("学生信息添加成功！");
    }
    //根据输入的id判断是否存在这个对象
    public static boolean contains(ArrayList<Student> list, String id){
        for (int i = 0; i < list.size(); i++) {
            Student s = list.get(i);
            if (s.getSid().equals(id)) {
                return true;
            }
        }
        return false;
        //return getIndex(list, id) >= 0;
    }
    //根据id找到对应的索引
    public static int getIndex(ArrayList<Student> list, String id){
        for (int i = 0; i < list.size(); i++) {
            Student s = list.get(i);
            if (s.getSid().equals(id)) {
                return i;
            }
        }        
        return -1;
    }
    // 删除学生
    public static void deletStudent(ArrayList<Student> list){
        //通过键盘输入的id确定要删除的学生
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你想删除的学生的id：");
        String id = sc.next();
        //存在这个id
        if (contains(list, id)) {
            //找到这个id对应的索引
            int index = getIndex(list, id);
            //根据id进行删除
            list.remove(index);
            System.out.println("id为" + id + "的学生删除成功");
        //不存在这个id
        } else {
            System.out.println("id不存在，删除失败");
        }
    }
    // 修改学生
    public static void updateStudent(ArrayList<Student> list){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你想修改的学生的id：");
        String id = sc.next();
        // 不存在这个id
        if (!contains(list, id)) {
            System.out.println("id不存在，修改失败");
            return;
        }    
        // 程序执行到这个地方，说明这个学生对象是存在的
        int index = getIndex(list, id);
        Student stu = list.get(index);
        // 输入需要修改的信息
        System.out.println("请输入要修改的学生姓名：");
        String newName = sc.next();
        stu.setName(newName);

        System.out.println("请输入要修改的学生年龄");
        int newAge = sc.nextInt();
        stu.setAge(newAge);

        System.out.println("请输入要修改的学生家庭住址");
        String newAddress = sc.next();
        stu.setAddress(newAddress);

        System.out.println("学生信息修改成功");
    }
    
    // 查询学生
    public static void queryStudent(ArrayList<Student> list) {
        //若集合为空
        if (list.size() == 0) {
            System.out.println("当前无学生信息，请添加后再查询");
            // 结束方法
            return;            
        }
        //执行到这，说明不为空
        //打印表头
        System.out.println("id\t\t姓名\t年龄\t家庭住址");
        for (int i = 0; i < list.size(); i++) {
            Student s = list.get(i);
            System.out.println(s.getSid()+"\t"+s.getName()+"\t"+s.getAge()+"\t"+s.getAddress());
        }
    }
}
