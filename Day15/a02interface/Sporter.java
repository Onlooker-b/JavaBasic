package Day15.a02interface;

public abstract class Sporter extends Person{

    public Sporter() {
    }
    public Sporter(String name, int age) {
        super(name, age);
    }
    // 因为两个不同的运动员学的不一样 所以写成抽象类
    public abstract void study();
}