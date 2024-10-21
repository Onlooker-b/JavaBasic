package Day13.a04staticdemo1;

public class Test {
    public static void main(String[] args) {
        Manager m = new Manager("heima001","zhangsan",15000,8000);
        System.out.println(m.getId()+", "+m.getName()+", "+m.getSalary()+", "+m.getBonus());
        m.eat();
        m.work();
        System.out.println("==============");

        Cook c = new Cook();
        c.setId("heima002");
        c.setName("lisi");
        c.setSalary(10000);
        System.out.println(c.getId() + ", " + c.getName() + ", " + c.getSalary());
        c.eat();
        c.work();
    }
}
