package Day23.a04mygenerics;

import java.util.ArrayList;

public class GenericsDemo5 {
    public static void main(String[] args) {
        /*
         *   需求：
         *       定义一个方法，形参是一个集合，但是集合中的数据类型不确定。
         */

        // 创建集合对象
        ArrayList<Ye> list1 = new ArrayList<>();
        ArrayList<Fu> list2 = new ArrayList<>();
        ArrayList<Zi> list3 = new ArrayList<>();
        method(list1);
        method(list2);
        method(list3);
        ArrayList<Student2> list4 = new ArrayList<>();
        // method(list4);因为Student2没有继承于Fu

        method2(list1);
        method2(list2);
        method2(list3);
    }
    /*
     * 此时，泛型里面写的是什么类型，那么只能传递什么类型的数据。
     * 弊端：
     *      利用泛型方法有一个小弊端，此时他可以接受任意的数据类型
     *      Ye  Fu   Zi    Student
     *
     * 希望：本方法虽然不确定类型，但是以后我希望只能传递Ye Fu Zi
     *
     * 此时我们就可以使用泛型的通配符：
     *      ?也表示不确定的类型
     *      他可以进行类型的限定
     *      ? extends E: 表示可以传递E或者E所有的子类类型
     *      ? super E:表示可以传递E或者E所有的父类类型
     *
     * 应用场景：
     *      1.如果我们在定义类、方法、接口的时候，如果类型不确定，就可以定义泛型类、泛型方法、泛型接口。
     *      2.如果类型不确定，但是能知道以后只能传递某个继承体系中的，就可以泛型的通配符
     * 泛型的通配符：
     *      关键点：可以限定类型的范围。
     *
     */

    // <? extends Ye>表示传入的这个参数，只能是Ye或者继承于Ye
    public static void method(ArrayList<? extends Ye> list) {
        System.out.println("Ye or extends Ye");
    }
    // <? super Zi>表示传入的这个参数，只能是Zi和Zi的所有父类
    public static void method2(ArrayList<? super Zi> list) {
        System.out.println("Zi or super Zi");
    }
}

class Ye {
}

class Fu extends Ye {
}

class Zi extends Fu {
}

class Student2{}