package Day23.a04mygenerics;

import java.util.ArrayList;

public class GenericsDemo3 {
    /*
     * 定义一个工具类：ListUtil
     * 类中定义一个静态方法addAll，用来添加多个集合的元素。
     */
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        ListUtil.addAll(list1, "aaa", "bbb", "ccc");
        ListUtil.show();
        System.out.println(list1);

        ArrayList<Integer> list2 = new ArrayList<>();
        ListUtil.addAll(list2, 111, 222, 333);
        System.out.println(list2);
    }
}