package Day14.a01polymophism;

public class Test {
    public static void main(String[] args) {
        // 向上转型  
        Animal a = new Cat();  
        // 成员方法：编译看左边，运行看右边
        a.eat(); 				// 调用的是 Cat 的 吃鱼
        // a.catchMouse(); 编译报错，编译看左边，Animal没有这个方法
        // 成员变量：编译看左边，运行看左边
        System.out.println(a.name); // 动物

        // 向下转型  
        Cat c = (Cat)a;       
        c.catchMouse(); 		// 调用的是 Cat 的 catchMouse
        System.out.println("---------");

        // 向下转型要转对，不能转到Dog里面  Dog d = (Dog) a;
        // 向下转型时，最好是做个判断
        if (a instanceof Cat) {
            Cat c1 = (Cat) a;
            c1.catchMouse(); // 调用的是 Cat 的 catchMouse
        } else if (a instanceof Dog) {
            Dog d1 = (Dog) a;
            d1.watchHouse(); // 调用的是 Dog 的 watchHouse
        }
        System.out.println("---------");

    }
}
