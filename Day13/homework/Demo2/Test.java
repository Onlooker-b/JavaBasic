package Day13.homework.Demo2;

public class Test {
    public static void main(String[] args) {
        Phone p = new Phone("Huawei", 3000);
        System.out.println(p.getBrand() + ", " + p.getPrice() + ", " + Phone.size);

        Huawei h = new Huawei("Huawei", 2000, "blue");
        System.out.println(h.getBrand() + ", " + h.getPrice() + ", " + h.getColor() + ", " + Huawei.size);
        //System.out.println(h.size +" "+ h.getSize());
        
        /*
         * 关于父类中的静态成员变量可以用：
         * 1、父类类名直接调用：Phone.size
         * 2、父类对象直接调用：p.size 或者 p.getSize()。因为我写了size的set/get方法
         * 3、子类类名直接调用：Huawei.size。子类直接继承了父类的静态成员变量
         * 4、子类对象直接调用：h.size 或者 h.getSize()。
         */
    }
}
