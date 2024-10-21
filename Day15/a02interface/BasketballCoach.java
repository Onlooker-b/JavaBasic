package Day15.a02interface;

public class BasketballCoach extends Coach{
    public BasketballCoach(){}
    public BasketballCoach(String name, int age){
        super(name, age);
    }

    @Override
    public void teach() {
        System.out.println("篮球教练教授蓝球");
    }
}
