package Day18.a04object;

public class Student {
    private String name;
    private int age;
    
    public Student() {
    }
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
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
        this.age = age;
    }
    
    // 重写toString方法
    @Override
    public String toString() {
        return name + ", " + age;
    }

    @Override
    public boolean equals(Object obj) {
        // 如果直接是地址值相等
        if (this == obj)
            return true;
        // 如果判断对象是空
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;

        // 把参数直接强转为Student类型，开始比较
        Student other = (Student) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (age != other.age)
            return false;
        return true;
    }
    
}
