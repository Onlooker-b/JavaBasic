package Day14.a02polymophism;

public class Person {
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void keepPet(Animal a, String someting){
        if (a instanceof Dog) {
            Dog d = (Dog) a;
            System.out.printf("年龄为%d岁的%s养了一只%s颜色的%d岁的狗",this.age,this.name,d.getColor(),d.getAge());
            System.out.println();
            d.eat(someting);
        }else if (a instanceof Cat) {
            Cat c = (Cat) a;
            System.out.printf("年龄为%d岁的%s养了一只%s颜色的%d岁的猫", this.age,this.name,c.getColor(),c.getAge());
            System.out.println();
            c.eat(someting);
        } else {
            System.out.println("没有这种动物");
        }
    }
}
