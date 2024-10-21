package Day13.a03extendsdemo1;

public class Dog extends Animal{
    @Override
    public void eat(){
        System.out.println("狗吃狗粮");
    }
    @Override
    public void drink(){
        System.out.println("狗喝水");
    }

    public void lookHome(){
        System.out.println("狗看家");
    }
}
