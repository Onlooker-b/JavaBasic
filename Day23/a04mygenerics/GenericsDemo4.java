package Day23.a04mygenerics;

public class GenericsDemo4 {
    public static void main(String[] args) {
        /*
         * 泛型接口的两种使用方式：
         * 1.实现类给出具体的类型 public class MyArrayList2 implements List<String>
         *   创建实现类时无需<>
         * 2.实现类还是不知道具体的泛型，public class MyArrayList3<E> implements List<E>
         *   创建实现类对象时再确定类型 
         */

        // 因为MyArrayList2这个类已经规定了泛型是String，这里无需再写
        MyArrayList2 list = new MyArrayList2();
        list.add("123");

        MyArrayList3<Integer> list2 = new MyArrayList3<>();
        list2.add(123);
    }
}
