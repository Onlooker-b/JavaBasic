package Day08;

public class Student {
    // 成员变量
    private String name;
    private int age;
    private String gender;

    //存在默认的空参构造方法
    public Student() {
    }
    public Student(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        if (age >= 18 && age <= 50) {
            this.age = age;
        }else{
            System.out.println("年龄超出限制！");
        }
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    
    public void show() {
        System.out.println("名字是："+name + "," + "年龄为：" +age);
    }
}
