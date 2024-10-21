package Day13.homework.Demo1;

public class Student extends Person{
    private String banji;

    public Student() {
    }
    public Student(String name, int age, String banji) {
        super(name, age);
        this.banji = banji;
    }
    public String getBanji() {
        return banji;
    }
    public void setBanji(String banji) {
        this.banji = banji;
    }

    @Override
    public void work(){
        System.out.println(this.banji+"的"+super.getName()+"学生查看课表");
    }
    
    public void fillFrom(){
        System.out.println("学生"+super.getName()+"填写听课反馈");
    }
}
