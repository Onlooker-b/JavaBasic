package Day23.a04mygenerics;

public class GenericsDemo2 {
    public static void main(String[] args) {
        MyArrayList<String> list = new MyArrayList<>();
        list.add("111");
        list.add("222");
        list.add("333");
        System.out.println(list.toString());

        MyArrayList<Integer> list2 = new MyArrayList<>();
        list2.add(111);
        list2.add(222);
        list2.add(333);
        System.out.println(list.get(0));
        System.out.println(list2.toString());
    }
}
