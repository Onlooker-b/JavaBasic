package Day10.StringDemo;

public class StringDemo1 {
    public static void main(String[] args) {
        //1、使用直接赋值的方式获取一个字符串对象
        String s1 = "hgjg";
        System.out.println(s1);

        //2、使用new的方式获取字符串，可以写一个空白
        String s2 = new String();
        System.out.println("@"+s2+"@");

        //3、有参构造，其实就是第一种的原始版本
        String s3 = new String("abc");
        System.out.println(s3);

        //4、传递一个字符数组
        char[] chs = {'a','b','c','d'};
        System.out.println(chs[2]);

        //5、传递一个字节数组
        byte[] bytes = {97,98,99,100};
        System.out.println("没有转成字符串，还是数字"+bytes[0]);
        String s4 = new String(bytes);
        System.out.println(s4);
    }
}
