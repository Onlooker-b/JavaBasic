package Day13.homework.Demo3;

public class Cat extends Animal{
    public void catchMouse(){
        System.out.println("猫抓老鼠");
    }
    public Cat(){
    }
    // 写一个有参构造，把参数传递到父类中
    public Cat(int age, String color){
        super(age, color);
    }
}
