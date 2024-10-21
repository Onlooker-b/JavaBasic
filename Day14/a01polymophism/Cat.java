package Day14.a01polymophism;

class Cat extends Animal {
    static String name = "猫";
    
    public void eat() {
        System.out.println("吃鱼");
    }

    public void catchMouse() {
        System.out.println("抓老鼠");
    }
}
