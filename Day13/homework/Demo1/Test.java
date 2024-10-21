package Day13.homework.Demo1;

public class Test {
    public static void main(String[] args) {
        Teacher t = new Teacher();
        t.setName("sisi");
        t.setAge(40);
        t.setBumen("Java");
        t.work();
        t.publishForm();
        System.out.println("-----------------");

        Student s = new Student("zhangsan", 20, "一年级一班");
        s.work();
        s.fillFrom();
    }
}
