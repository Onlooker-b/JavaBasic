package Day15.a04innerclass;

import Day15.a04innerclass.Outer.Inner;

public class Test {
    /*
     * 拓展1:静态内部类可以直接访问外部类的静态成员。
     * 拓展2:静态内部类不可以直接访问外部类的非静态成员，如果要访问需要创建外部类的对象。
     * 拓展3:静态内部类中没有银行的Outer.this。
     */
    public static void main(String[] args) {
        // 创建静态内部类的对象
        // 只要是静态的，就可以直接用类名进行调用
        Outer.Inner oi = new Outer.Inner();
        oi.show1();
        Inner.show2();

        // 外界无法直接使用局部内部类
        Outer o = new Outer();
        o.show();
    }
}
