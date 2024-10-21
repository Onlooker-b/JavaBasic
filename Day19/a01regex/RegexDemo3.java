package Day19.a01regex;

public class RegexDemo3 {
    public static void main(String[] args) {
        /*
         * 1. "." ：匹配任何字符。
         * 2. "\d"：任何数字[0-9]的简写；
         * 3. "\D"：任何非数字\[^0-9\]的简写；
         * 4. "\s"：空白字符：[ \t\n\x0B\f\r] 的简写
         * 5. "\S"：非空白字符：\[^\s\] 的简写
         * 6. "\w"：单词字符：[a-zA-Z_0-9]的简写
         * 7. "\W"：非单词字符：\[^\w\]
         */

        // 转义字符\：改变后面字符原本的含义
        // 改变了"作为引用类型的含义，只是一个普通的双引号
        System.out.println("\"");  
        // 前一个转义字符改变了后一个转义字符的含义，后一个转移字符就是一个普通的\
        System.out.println("G:\\java从入门到起飞\\day19-API（正则表达式）\\笔记");

        // .表示任意一个字符
        System.out.println("--------1---------");
        System.out.println("你".matches("..")); // false
        System.out.println("你".matches(".")); // true
        System.out.println("你a".matches(".."));// true

        // \\d 表示任意的一个数字
        // 前一个\是转义字符，把后面的转义字符变成普通\
        // 简单来记:两个\表示一个\
        System.out.println("--------2---------");
        System.out.println("a".matches("\\d")); // false
        System.out.println("3".matches("\\d")); // true
        System.out.println("333".matches("\\d")); // false
        System.out.println("333".matches("\\d\\d\\d")); //true

        // \\w只能是一位单词字符[a-zA-Z_0-9]
        System.out.println("--------3---------");
        System.out.println("z".matches("\\w")); // true
        System.out.println("2".matches("\\w")); // true
        System.out.println("21".matches("\\w")); // false
        System.out.println("你".matches("\\w"));// false
        // 非单词字符，大写的W，小写w取反
        System.out.println("你".matches("\\W")); // true

        // 以上正则匹配只能校验单个字符。
        System.out.println("---------------------------------------------");

        /*
         * 1. X? : 0次或1次
         * 2. X* : 0次到多次
         * 3. X+ : 1次或多次
         * 4. X{n} : 恰好n次
         * 5. X{n,} : 至少n次
         * 6. X{n,m}: n到m次(n和m都是包含的)
         */
        // 必须是数字 字母 下划线 至少 6位
        System.out.println("2442fsfsf".matches("\\w{6,}"));// true
        System.out.println("244f".matches("\\w{6,}"));// false

        // 必须是数字和字符 必须是4位
        System.out.println("23dF".matches("[a-zA-Z0-9]{4}"));// true
        System.out.println("23 F".matches("[a-zA-Z0-9]{4}"));// false
        System.out.println("23dF".matches("[\\w&&[^_]]{4}"));// true
        System.out.println("23_F".matches("[\\w&&[^_]]{4}"));// false

    }
}