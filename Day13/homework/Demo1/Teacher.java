package Day13.homework.Demo1;

public class Teacher extends Person{
    private String bumen;

    public Teacher() {
    }
    public Teacher(String name, int age, String bumen) {
        super(name, age);
        this.bumen = bumen;
    }
    public String getBumen() {
        return bumen;
    }
    public void setBumen(String bumen) {
        this.bumen = bumen;
    }

    @Override
    public void work(){
        System.out.println(this.getBumen()+"部门的"+super.getName()+"老师查看课表");
    }

    public void publishForm(){
        System.out.println(super.getName()+"老师发布问题");
    }

}
