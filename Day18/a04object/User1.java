package Day18.a04object;

import java.util.StringJoiner;

//Cloneable
//如果一个接口里面没有抽象方法
//表示当前的接口是一个标记性接口
//现在Cloneable表示一旦实现了，那么当前类的对象就可以被克降
//如果没有实现，当前类的对象就不能克隆

public class User1 implements Cloneable {
    private int id;
    private String username;
    private String password;
    private String path;
    private int[] data;

    public User1() {
    }

    public User1(int id, String username, String password, String path, int[] data) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.path = path;
        this.data = data;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public int[] getData() {
        return data;
    }

    public void setData(int[] data) {
        this.data = data;
    }

    public String toString() {
        return "角色编号为：" + id + "，用户名为：" + username + "密码为：" + password + ", 游戏图片为:" + path + ", 进度:" + arrToString();
    }

    public String arrToString() {
        StringJoiner sj = new StringJoiner(", ", "[", "]");

        for (int i = 0; i < data.length; i++) {
            sj.add(data[i] + "");
        }
        return sj.toString();
    }

    // 深克隆，重新写一个数组，把克隆后的结果放到新数组中
    @Override
    protected Object clone() throws CloneNotSupportedException {
        // 先获取被克隆对象的数组
        int[] data = this.data;
        // 创建新的数组
        int[] newdata = new int[data.length];
        // 把被克隆的数组放到新数组中
        for (int i = 0; i < newdata.length; i++) {
            newdata[i] = data[i];
        }
        // 调用父类中的方法克隆对象
        User1 u = (User1) super.clone();
        // 把克隆后产生的浅克隆的数组地址值换成新的
        u.setData(newdata);
        return u;
    }

}
