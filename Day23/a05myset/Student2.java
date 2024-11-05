package Day23.a05myset;

public class Student2 implements Comparable<Student2>{
    /*
        按照总分从高到低输出到控制台
        如果总分一样，按照语文成绩排
        如果语文一样，按照数学成绩排
        如果数学成绩一样，按照英语成绩排
        如果英文成绩一样，按照年龄排
        如果年龄一样，按照姓名的字母顺序排
        如果都一样，认为是同一个学生，不存。
     */
    @Override
    public int compareTo(Student2 o) {
        // 1、获取当前对象的总分
        int sum1 = this.getChinese() + this.getEnglish() + this.getMath();
        // 2、获取传入对象的总分
        int sum2 = o.getChinese() + o.getEnglish() + o.getMath();
        // 3、按照总分排
        int i = sum2 - sum1;
        // 4、如果总分同，比较语文
        i = i == 0 ? o.getChinese() - this.getChinese() : i;
        // 5、经过上面的比较，i还是0，就比较数学
        i = i == 0 ? o.getMath() - this.getMath() : i;
        // 6、经过上面的比较，i还是0，就比较英语
        i = i == 0 ? o.getEnglish() - this.getEnglish() : i;

        // 6、年龄
        i = i == 0 ? o.getAge() - this.getAge() : i;
        // 7、姓名首字母
        i = i == 0 ? this.getName().compareTo(o.getName()) : i;

        return i;
    }

    private String name;
    private int age;
    private int chinese;
    private int math;
    private int english;

    public Student2() {
    }

    public Student2(String name, int age, int chinese, int math, int english) {
        this.name = name;
        this.age = age;
        this.chinese = chinese;
        this.math = math;
        this.english = english;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * 获取
     * @return chinese
     */
    public int getChinese() {
        return chinese;
    }

    /**
     * 设置
     * @param chinese
     */
    public void setChinese(int chinese) {
        this.chinese = chinese;
    }

    /**
     * 获取
     * @return math
     */
    public int getMath() {
        return math;
    }

    /**
     * 设置
     * @param math
     */
    public void setMath(int math) {
        this.math = math;
    }

    /**
     * 获取
     * @return english
     */
    public int getEnglish() {
        return english;
    }

    /**
     * 设置
     * @param english
     */
    public void setEnglish(int english) {
        this.english = english;
    }

    public String toString() {
        return "Student2{name = " + name + ", age = " + age + ", total = " + this.allPoint() + ", chinese = " + chinese + ", math = " + math + ", english = " + english + "}";
    }

    public int allPoint(){
        return chinese+math+english;
    }
}
