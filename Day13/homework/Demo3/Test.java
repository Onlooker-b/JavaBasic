package Day13.homework.Demo3;

public class Test {
    public static void main(String[] args) {
        // 因为狗在继承动物类的时候没有重写构造方法，所以只有默认无参构造
        Dog d = new Dog();
        d.setAge(2);
        d.setColor("黑色");
        
        // 猫写了自己的无参和有参构造方法
        Cat c = new Cat(3, "白色");

        Person p = new Person("zhangsan", 20);
        p.keepPet(d, "骨头");
        System.out.println(p.keepPet(c, "小鱼干"));

    }
}
