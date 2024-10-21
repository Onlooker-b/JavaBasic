package Day10.StringJoiner;

import java.util.StringJoiner;

public class Demo1 {
    public static void main(String[] args) {
        // 间隔符号，开始符号，结束符号
        StringJoiner sj = new StringJoiner(",", "[", "]");
        sj.add("aaa").add("bbb").add("ccc");
        System.out.println(sj.length());
        System.out.println(sj);

        // 间隔符号
        StringJoiner sj2 = new StringJoiner("---");
        sj2.add("aaa").add("bbb").add("ccc");
        System.out.println(sj2.length());
        System.out.println(sj2);

    }
}
