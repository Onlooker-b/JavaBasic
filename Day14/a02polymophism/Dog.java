package Day14.a02polymophism;

public class Dog extends Animal{
    public Dog(){
    }
    public Dog(int age, String color) {
        super(age, color);
    }
    @Override
    public void eat(String something){
        System.out.printf("%d岁的%s颜色的狗两只前腿死死的抱住%s猛吃",getAge(),getColor(),something);
        System.out.println();
    }
    public void lookHome(){
        System.out.println("狗看家");
    }
}
