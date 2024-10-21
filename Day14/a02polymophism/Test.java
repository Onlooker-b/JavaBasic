package Day14.a02polymophism;

public class Test {
    public static void main(String[] args) {
        Dog d = new Dog(2, "黑");
        Cat c = new Cat(3, "灰");
        Person p = new Person("老王",30);
        p.keepPet(d, "骨头");

        Person p2 = new Person("老李", 25);
        p2.keepPet(c, "鱼");
    }
}
