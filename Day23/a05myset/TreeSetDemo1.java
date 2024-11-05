package Day23.a05myset;

import java.util.Iterator;
import java.util.TreeSet;
import java.util.function.Consumer;

public class TreeSetDemo1 {
    public static void main(String[] args) {
        /*
         *  需求：利用TreeSet存储整数并进行排序
         *  对于数值类型（Integer、Double）直接按照大小排序
         *  对于字符、字符串类型，按照ASCII码的数字升序排列
         */
        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(2);
        ts.add(3);
        ts.add(1);
        ts.add(4);
        ts.add(6);
        ts.add(5);

        // 打印结果：[1, 2, 3, 4, 5, 6]  已经排好序
        System.out.println(ts);

        // 1、迭代器遍历
        // 按照1 2 3 4 5 6的顺序遍历输出
        Iterator<Integer> it = ts.iterator();
        while (it.hasNext()) {
            Integer i = it.next();
            System.out.println(i);
        }
        System.out.println("--------");
        // 2、lambda
        ts.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(integer);
            }
        });
        System.out.println("--------");
        // 3、增强for
        for (Integer t : ts) {
            System.out.println(t);
        }

        System.out.println("-----字符类型------");
        TreeSet<String> ts1 = new TreeSet<>();
        ts1.add("afddsd");
        ts1.add("ddgsf");
        ts1.add("ef");
        ts1.add("b");
        // [afddsd, b, ddgsf, ef] 按照首字符
        System.out.println(ts1);
    }
}
