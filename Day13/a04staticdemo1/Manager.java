package Day13.a04staticdemo1;

public class Manager extends Employee{
    private double bonus;

    public Manager() {
    }

    // 带全部参数的构造方法需要加入父类中的成员变量
    public Manager(String id, String name, double salary, double bonus) {
        // 传递到父类的有参构造
        super(id, name, salary);
        this.bonus = bonus;
    }

    // 父类中的get set 方法直接可以用，不用重写
    public double getBonus() {
        return bonus;
    }
    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
    @Override
    public void work(){
        System.out.println("管理他人");
    }
    // 吃饭这个方法不需要重写，因为经理也吃米饭
}
