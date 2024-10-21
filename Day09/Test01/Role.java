package Day09.Test01;

import java.util.Random;

public class Role {
    private String name;
    private int blood;

    public Role() {
    }
    public Role(String name, int blood) {
        this.name = name;
        this.blood = blood;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getBlood() {
        return blood;
    }
    public void setBlood(int blood) {
        this.blood = blood;
    }

    //定义一个攻击的方法：方法的调用者攻击参数
    public void attack(Role role){
        Random r = new Random();
        //伤害值
        int hurt = r.nextInt(20)+1;

        //剩余血量
        int remian_boold = role.getBlood() - hurt;
        //如果剩余血量为负数，修改为0
        remian_boold = remian_boold < 0 ? 0 : remian_boold;
        //修改挨揍的人的血量
        role.setBlood(remian_boold);

        System.out.println(this.getName()+"举起拳头，打了"+role.getName()+"一下,"+
        "造成了"+hurt+"伤害，"+role.getName()+"还剩"+ remian_boold+"点血");
    }

}
