package Day14.a01polymophism;

class Dog extends Animal {
    static String name = "狗";

    public void eat() {
        System.out.println("吃骨头");
    }

    public void watchHouse() {
        System.out.println("看家");
    }
}
