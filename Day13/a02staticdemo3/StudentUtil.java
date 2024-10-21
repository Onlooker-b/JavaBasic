package Day13.a02staticdemo3;

import java.util.ArrayList;

public class StudentUtil {

    // 私有化构造方法
    private StudentUtil(){}

    // 获取最大学生的年龄
    public static int getMaxAge(ArrayList<Student> list){
        // 1、定义一个参照物
        int max = list.get(0).getAge();
        // 2、循环比较年龄
        for (int i = 1; i < list.size(); i++) {
            int temp = list.get(i).getAge();
            if (temp > max) {
                max = temp;
            }
        }
        return max;
    }
}
