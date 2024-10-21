package Day19.a02regex;

public class RegexTest1 {
    public static void main(String[] args) {
        /*
         * ​ 请编写正则表达式验证用户输入的手机号码是否满足要求。
         * ​ 请编写正则表达式验证用户输入的邮箱号是否满足要求。
         * ​ 请编写正则表达式验证用户输入的电话号码是否满足要求。
         * 
         * ​ 验证手机号码 13112345678 13712345667 13945679027 139456790271
         * ​ 验证座机电话号码 020-2324242 02122442 027-42424 0712-3242434
         * ​ 验证邮箱号码 3232323@qq.com        zhangsan@itcast.cnn          dlei0009@163.com        dlei0009@pci.com.cn
         */


        System.out.println("========验证手机号==========");
        // 手机号只能以1开头，第二位是3到9，剩余全是数字，只能剩余9个数字
        String regex1 = "[1][3-9]\\d{9}";
        System.out.println("13112345678".matches(regex1));
        System.out.println("13712345667".matches(regex1));
        System.out.println("13945679027".matches(regex1));
        System.out.println("139456790271".matches(regex1));

        System.out.println("========验证座机号==========");
        // 座机号以0开头，从第二位开始可以是任意数字，出现2到3次
        // 区号-出现0次或1次  -?
        // 后面的号码也不能以0开头，从第二位开始是任意数字，号码总长度5到10
        String regex2 = "0\\d{2,3}-?[1-9]\\d{4,9}";
        System.out.println("020-2324242".matches(regex2));
        System.out.println("02122442".matches(regex2));
        System.out.println("027-42424".matches(regex2));
        System.out.println("0712-3242434".matches(regex2));

        System.out.println("========验证邮箱号==========");
        // 1、@的左边  数字，字母，下划线都可以
        // \\w+：任意的数字，字母，下划线出现一次或多次
        // 2、@的右边：
        // .的左边[\\w&&[^_]]{2,6}
        //  任意的字母加数字，总共出现2-6次(此时不能出现下划线)
        // .的右边：大写字母，小写字母都可以，只能出现2-3次[a-zA-Z]{2,3}
        // .com或者.cn这个部分可以重复1次
        String regex3 = "\\w+@[\\w&&[^_]]{2,6}(\\.[a-zA-Z]{2,3}){1,2}";
        "3232323@qq.com".matches(regex3);
    }
}
