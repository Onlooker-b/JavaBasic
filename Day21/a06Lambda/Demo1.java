package Day21.a06Lambda;

public class Demo1 {
    public static void main(String[] args) {
        // lambda表达式用于简化匿名内部类是书写
        // 只能简化函数式接口的匿名内部类的写法
        // 函数式接口：有且只有一个抽象方法的接口叫做函数式接口，可以用@FunctionalInterface注解验证

        // 1、利用匿名内部类的形式取调用下面的方法
        // 调用一个方法的时候，如果方法的形参是一个接口，就需要写一个接口的实现类对象
        // 如果这个对象只用一次，就可以写一个匿名内部类
        method(new Swim() {
            // 创建匿名内部类需要重写抽象方法
            @Override
            public void swimming(){
                System.out.println("游泳！");
            }
        });

        // 2、利用lambda方式改写
        // (参数) -> {方法体}
        method(() -> {
            System.out.println("我要游泳");
        });

        /* lambda的省略规则：
           1、参数类型可以省略不写
           2、如果只有一个参数，参数类型可以省略，()也可以省略
           3、方法体只有一行，{}也可省略
        */ 
        method(() -> System.out.println("游泳！"));


}   
    public static void method(Swim s){
        s.swimming();
    }
}

