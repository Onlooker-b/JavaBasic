package Day15.a03innerclass;

public class Test {
    public static void main(String[] args) {
        // 被private修饰的内部类不支持下面这种创建方式
        Outer.Inner oi = new Outer().new Inner();
        oi.show();

        // 被private修饰：通过创建外部类对象，然后调用获取内部类对象的方法
        Outer o = new Outer();
        Object inner = o.getInstance();
        System.out.println(o.getInstance());

        
    }
}
