package Day15.a05innerclass;

public class Test {
    public static void main(String[] args) {
        
        // 编写匿名内部类的代码
        // 与接口Swim是实现关系
        Swim s = new Swim() {
            // 重写Swim接口中的所有方法
            @Override
            public void Swim() {
                System.out.println("重写了游泳方法");
            }
        };
        s.Swim();

        // 与抽象类Animal是继承关系
        new Animal() {
            @Override
            public void eat() {
                System.out.println("重写了eat方法");
            }
        };

        // method(Animal a)，相当于把这个匿名类作为对象传递过去了
        method(
            new Animal() {
                @Override
                public void eat() {
                    System.out.println("狗吃骨头");
                }
            }
        );
    }

    public static void method(Animal a){
        a.eat();
    }
}
