package Day23.a05Test;

public class LiHuaCat extends Cat {
    @Override
    public void eat() {
        // 一只叫做XXX的，X岁的狸花猫，正在吃鱼
        System.out.println("一只叫做" + getName() + "的，" + getAge() + "岁的狸花猫，正在吃鱼");
    }
}
