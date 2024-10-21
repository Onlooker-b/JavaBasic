package Day11.Demo2;

import java.util.ArrayList;

public class Test2 {
    public static void main(String[] args) {

        ArrayList<Phone> list = new ArrayList<>();
        Phone p1 = new Phone("xiaomi", 1000);
        Phone p2 = new Phone("apple", 8000);
        Phone p3 = new Phone("chuizi", 2999);
        list.add(p1);
        list.add(p2);
        list.add(p3);

        ArrayList<Phone> resultList = getPhone(list);
        for (int i = 0; i < resultList.size(); i++) {
            Phone resultP = resultList.get(i);
            System.out.println(resultP.getBrand()+","+resultP.getPrice());
        }

    }
    //返回价格低于3000的手机信息
    //如果要返回多个数据，可以把这些数据放到集合或者数组中
    public static ArrayList<Phone> getPhone(ArrayList<Phone> list){
        ArrayList<Phone> resutList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            Phone p = list.get(i);
            int price = p.getPrice();
            if (price < 3000) {
                //如果价格低于3000，把这个手机对象放到集合中
                resutList.add(p);
            }
        }
        //直接返回集合
        return resutList;
    } 
}
