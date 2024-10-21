package Day15.a02interface;

public class BaskertballSport extends Sporter{
    public BaskertballSport(){}
    public BaskertballSport(String name, int age){
        super(name, age);
    }
    @Override
    public void study() {
        System.out.println("蓝球运动员练习蓝球");
    }
}
