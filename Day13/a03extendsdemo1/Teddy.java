package Day13.a03extendsdemo1;

public class Teddy extends Dog{
    public void touch(){
        System.out.println("泰迪蹭蹭");
    }

    @Override
    public void eat(){
        super.eat();
        System.out.println("泰迪吃骨头");
    }
}
