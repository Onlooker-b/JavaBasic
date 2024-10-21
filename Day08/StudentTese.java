package Day08;

public class StudentTese {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setAge(20);
        s1.setGender("女");
        s1.setName("Tom");
        s1.show();

        Student s2 = new Student("Jenn",30,"男");
        s2.show();
    }
}
