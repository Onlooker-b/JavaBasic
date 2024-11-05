package Day23.a05Test;

import java.util.ArrayList;

public class Test1 {
    public static void main(String[] args) {
        /*
            需求：
                定义一个继承结构：
                                    动物
                         |                           |
                         猫                          狗
                      |      |                    |      |
                   波斯猫   狸花猫                泰迪   哈士奇


                 属性：名字，年龄
                 行为：吃东西
                       波斯猫方法体打印：一只叫做XXX的，X岁的波斯猫，正在吃小饼干
                       狸花猫方法体打印：一只叫做XXX的，X岁的狸花猫，正在吃鱼
                       泰迪方法体打印：一只叫做XXX的，X岁的泰迪，正在吃骨头，边吃边蹭
                       哈士奇方法体打印：一只叫做XXX的，X岁的哈士奇，正在吃骨头，边吃边拆家

            测试类中定义一个方法用于饲养动物
                public static void keepPet(ArrayList<???> list){
                    //遍历集合，调用动物的eat方法
                }
            要求1：该方法能养所有品种的猫，但是不能养狗
            要求2：该方法能养所有品种的狗，但是不能养猫
            要求3：该方法能养所有的动物，但是不能传递其他类型
         */
        ArrayList<PersianCat> list1 = new ArrayList<>();
        ArrayList<LiHuaCat> list2 = new ArrayList<>();
        ArrayList<TeddyDog> list3 = new ArrayList<>();
        ArrayList<HuskyDog> list4 = new ArrayList<>();

        PersianCat persianCat = new PersianCat();
        persianCat.setName("persian");
        persianCat.setAge(1);
        list1.add(persianCat);

        LiHuaCat liHuaCat = new LiHuaCat();
        liHuaCat.setName("liHua");
        liHuaCat.setAge(1);
        list2.add(liHuaCat);

        TeddyDog teddyDog = new TeddyDog();
        teddyDog.setName("teddy");
        teddyDog.setAge(1);
        list3.add(teddyDog);

        HuskyDog huskyDog = new HuskyDog();
        huskyDog.setName("husky");
        huskyDog.setAge(1);
        list4.add(huskyDog);

        keepPet1(list1);
        keepPet1(list2);
        System.out.println("--------------------------------");
        keepPet2(list3);
        keepPet2(list4);
        System.out.println("--------------------------------");
        keepPet3(list1);
        keepPet3(list2);
        keepPet3(list3);
        keepPet3(list4);
    }

    // 要求1：该方法能养所有品种的猫，但是不能养狗
    public static void keepPet1(ArrayList<? extends Cat> list){
        //遍历集合，调用猫的eat方法
        for (Cat cat : list) {
            cat.eat();
        }
    }
    // 要求2：该方法能养所有品种的狗，但是不能养猫
    public static void keepPet2(ArrayList<? extends Dog> list){
        //遍历集合，调用动物的eat方法
        for (Dog dog : list) {
            dog.eat();
        }
    }
    // 要求3：该方法能养所有的动物，但是不能传递其他类型
    public static void keepPet3(ArrayList<? extends Animal> list){
        //遍历集合，调用动物的eat方法
        for (Animal animal : list) {
            animal.eat();
        }
    }
}
