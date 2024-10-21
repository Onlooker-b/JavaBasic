package Day15.a01interface;

public class Test {
    public static void main(String[] args) {
        Frog f = new Frog("小青", 1);
        f.eat();
        f.swim();
        System.out.println("----------");

        Rabbit r = new Rabbit("小白", 2);
        r.eat();
        // r.swim() 没有这个方法
    }
}
