package Day09.Test06;

import java.util.Scanner;

public class StudentTest {
    public static void main(String[] args) {
        //1、创建一个学生数组存储学生对象
        Student[] arr = new Student[3];

        //2、创建学生对象添加到数组中
        Student stu1 = new Student(1, "zhangsan", 23);
        Student stu2 = new Student(2, "lisi", 24);
        Student stu3 = new Student(3, "Tom", 25);

        arr[0] = stu1;
        arr[1] = stu2;
        arr[2] = stu3;

        // 要求1：再次添加一个学生对象，并在添加的时候进行学号的唯一性判断。
        // 要求2：添加完毕之后，遍历所有学生信息。
        Student stu4 = new Student(4, "Jenn", 26);
        boolean flag = contains(arr, stu4.getId());
        // 已经存满，搞一个新数组长度等于老数组加一
        Student[] newArr = creatNewArr(arr);
        if (!flag) {
            //判断数组是否存满
            int count = getCount(arr);
            if (count == arr.length) {

                newArr[newArr.length-1] = stu4;
                printArr(newArr);
            }else{
                //没存满，直接添加
                arr[count] = stu4;
                printArr(arr);
            }
        }else{
            System.out.println("添加的学生id重复，请修改id后添加。");           
        }

        // 要求3：通过id删除学生信息。如果存在，则删除，如果不存在，则提示删除失败。
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入想要删除的学生的id:");
        int id = sc.nextInt();
        int index = getIndex(newArr, id);
        if (index >=0) {
            //直接把这个index对应的内容设置为null
            newArr[index] = null;
            printArr(newArr);
        }else{
            System.out.println("不存在该id对应的学生");
        }

        // 要求5：查询数组id为“2”的学生，如果存在，则将他的年龄+1岁
        int index_2 = getIndex(newArr, 2);
        if (index_2 >= 0) {
            //说明这个id=2的学生存在
            int age = newArr[index_2].getAge();
            newArr[index_2].setAge(age+1);
            printArr(newArr);
        }else{
            System.out.println("不存在该id对应的学生");
        }
    }

    //写一个判断学生编号是否存在的方法
    public static boolean contains(Student[] arr, int id){
        for (int i = 0; i < arr.length; i++) {
            //只拿对应index存在对象的情况去比较
            if (arr[i] != null) {
                if (id == arr[i].getId()) {
                    return true;
                }                
            }
        }return false;
    }
    //判断数组中已经存在了几个元素
    public static int getCount(Student[] arr){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                count++;
            }
        }return count;
    }
    //创建一个新数组长度是老数组加一
    public static Student[] creatNewArr(Student[] arr){
        Student[] newArr = new Student[arr.length+1];
        //把老数组的元素放到新数组
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }return newArr;
    }
    //写一个遍历数组的方法
    public static void printArr(Student[] arr){
        for (int i = 0; i < arr.length; i++) {
            //判断这个数组是否有内容
            if (arr[i] != null) {
                System.out.println("学生学号是："+arr[i].getId()+"，学生姓名是："+arr[i].getName()+"，学生年龄是："+arr[i].getAge());
            }else{
                System.out.println("索引值为"+i+"对应的学生对象为空。");
            }
        }
    }
    //写一个通过id能够找到该对象在数组中索引值的方法
    public static int getIndex(Student[] arr, int id){
        for (int i = 0; i < arr.length; i++) {
            Student stu = arr[i];
            //只需要判断存在对象的地方
            if (stu != null) {
                if (stu.getId() == id) {
                    return i;
                }
            }
        }
        // 当循环结束没找到
        return -1;
    }
}
