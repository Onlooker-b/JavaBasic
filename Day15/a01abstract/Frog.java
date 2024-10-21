package Day15.a01abstract;

public class Frog extends Animal{
    public Frog(){
    }
    public Frog(String name, int age){
        super(name, age);
    }
    
    @Override
    public void eat() {
        System.out.println("青蛙吃虫子");
    }
    
}
