package Day15.a03innerclass;

public class Outer {
    private int a = 10;

    // 内部类被private修饰，就只能在外部类中创建对象了
    class Inner{
        // JDK16之前不能定义静态变量，JDK16开始才可以定义静态变量。
        // static int a = 10;
        private int a = 20;
        
        public void show() {
            int a = 30;
            System.out.println(a); // 30
            System.out.println(this.a); // 20
            System.out.println(Outer.this.a); // 10
        }
    }

    // 在外部类中定义一个方法提供内部类的对象
    public Inner getInstance(){
        return new Inner();
    }

}
