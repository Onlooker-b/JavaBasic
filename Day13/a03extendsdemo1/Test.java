package Day13.a03extendsdemo1;

public class Test {
    public static void main(String[] args) {
        // 子类只能访问父类非私有成员
        Ragdoll rd = new Ragdoll();
        rd.eat();
        rd.drink();
        rd.catchMouse();
        System.out.println("------------");

        Husky hs = new Husky();
        hs.breakHome();
        hs.lookHome();
        hs.drink();
        hs.eat();
        System.out.println("------------");

        Teddy td = new Teddy();
        td.touch();
        td.lookHome();
        td.drink();
        td.eat();        
        System.out.println("------------");

        ChineseDog cd = new ChineseDog();
        cd.lookHome();
        cd.drink();
        cd.eat();
    }
}
