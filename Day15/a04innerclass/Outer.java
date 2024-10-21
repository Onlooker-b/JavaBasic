package Day15.a04innerclass;

public class Outer {
    
    // 静态内部类
    static class Inner{

        public void show1(){
            // 静态内部类可以直接访问外部类的静态成员
            System.out.println(b);

            // 外部类的非静态需要先创建对象
            Outer o = new Outer();
            System.out.println(o.a);
            System.out.println("非静态方法被调用了");
        }
        public static void show2(){
            Outer o = new Outer();
            System.out.println(b);
            System.out.println(o.a);
            System.out.println("静态方法被调用了");
        }
    }

    int a = 10;
    static int b = 20;

    public void show(){
        // 局部内部类
        class Inner1{
            String name;

            public void method1(){
                System.out.println("局部内部类的method1被调用了");
            }
            // public static void method2() {
            //     System.out.println("局部内部类的静态方法被调用了");
            // }
        }

        // 创建局部内部类对象
        Inner1 i = new Inner1();
        i.method1();
        //i.name;
    }
}
