package Day23.a05myset;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemo3 {
    public static void main(String[] args) {
        /*
            需求：请自行选择比较器排序和自然排序两种方式；
            要求：存入四个字符串， “c”, “ab”, “df”, “qwer”
            按照长度排序，如果一样长则按照首字母排序

            采取第二种排序方式：比较器排序

        返回值：
        负数：表示当前要添加的元素是小的，存左边
        正数：表示当前要添加的元素是大的，存右边
        0 :表示当前要添加的元素已经存在，舍弃
        */
        TreeSet<String> ts = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                // 按照长度排序
                int i = o1.length() - o2.length();
                // 如果是一样长，按照首字母排序
                if (i == 0){
                    // 比较器排序，按照ASCII码顺序
                    return o1.compareTo(o2);
                }
                // i = i == 0 ? o1.compareTo(o2) : i;
                return i;
            }
        });
        ts.add("c");
        ts.add("ab");
        ts.add("df");
        ts.add("qwer");

        // [c, ab, df, qwer]
        System.out.println(ts);
    }
}
