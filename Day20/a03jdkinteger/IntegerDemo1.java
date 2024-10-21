package Day20.a03jdkinteger;

public class IntegerDemo1 {
    public static void main(String[] args) {
        // 1、利用构造方法获取Integer对象
        Integer i1 = new Integer(100); // 根据int值创建Integer对象(过时)
        Integer i2 = new Integer("100"); // 根据String值创建Integer对象(过时)
        System.out.println(i1);
        System.out.println(i2);
        System.out.println("--------");

        // 2、利用静态方法获取Integer对象
        Integer i3 = Integer.valueOf(100); // 返回表示指定的int值的Integer实例
        Integer i4 = Integer.valueOf("100"); // 返回保存指定String值的Integer对象
        Integer i5 = Integer.valueOf("123", 8);
        System.out.println(i3);
        System.out.println(i4);
        System.out.println(i5); // 83  8进制下的123 = 10进制的83
        System.out.println("---------");

        // 3、两种获取对象的区别
        // 现在数组中寻找有没有这个整数，有就直接把地址值拿过来，没有再创建新的
        // 范围是：-128~+127
        Integer i6 = Integer.valueOf(127);
        Integer i7 = Integer.valueOf(127);
        System.out.println(i6 == i7);  // true

        Integer i8 = Integer.valueOf(128);
        Integer i9 = Integer.valueOf(128);
        System.out.println(i8 == i9);  // false

        // new出来的对象，每一次都是创建了新对象，地址值完全不同
        Integer i10 = new Integer(127);
        Integer i11 = new Integer(127);
        System.out.println(i10 == i11); // false

        Integer i12 = new Integer(128);
        Integer i13 = new Integer(128);
        System.out.println(i12 == i13); // false

        System.out.println("---包装类如何计算---");
        int result = i12.intValue() + i13.intValue();
        Integer i14 = Integer.valueOf(result);
        System.out.println(i14);
    }
}
