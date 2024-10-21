package Day15.a01interface;

public class Dog extends Animal implements Swim{
    public Dog(){}

    public Dog(String name, int age){
        super(name, age);
    }

    @Override
    public void swim() {
        System.out.println("狗会游泳");
    }

    @Override
    public void eat() {
        System.out.println("狗吃骨头");
    }
}
