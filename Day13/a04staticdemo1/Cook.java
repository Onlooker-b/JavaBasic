package Day13.a04staticdemo1;

public class Cook extends Employee{
    // 厨师没有自己特有的成员变量
    public Cook(){
    }
    @Override
    public void work(){
        System.out.println("厨师在炒菜");
    }
}
