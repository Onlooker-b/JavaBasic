package Day13.homework.Demo3;

public class Animal {
    private int age;
    private String color;

    public Animal() {
    }
    public Animal(int age, String color) {
        this.age = age;
        this.color = color;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String eat(String something){
        String s = "吃"+something;
        return s;
    }
}
