package Day18.a04object;

public class ObjectDemo2 {
    public static void main(String[] args) {
        // public boolean equals(Object obj) 比较两个对象是否相等
        Student s1 = new Student("zhangsan", 23);
        Student s2 = new Student("zhangsan", 23);

        boolean result1 = s1.equals(s2);
        System.out.println(result1);// true

        // 结论:
        // 1.如果没有重写equals方法，那么默认使用Object中的方法进行比较，比较的是地址值是否相等
        // 2.一般来讲地址值对于我们意义不大，所以我们会重写，重写之后比较的就是对象内部的属性值了。
        
        String s = "abc";
        StringBuilder sb = new StringBuilder("abc");
        /* 
        因为equals方法是被s调用的，而s是字符串
        所以equals要看string类中的
        字符串中的equals方法，先判断参数是否为字符串
        如果是字符串，再比较内部的属性
        但是如果参数不是字符串，直接返回false
         */
        System.out.println(s.equals(sb));// false

        /*
        因为equals方法是被sb调用的，而sb是StringBuilder
        所以这里的equals方法要看StringBuilder中的equals方法
        那么在StringBuilder当中，没有重写equals方法
        使用的是Object中的
        在Object当中默认是使用==号比较两个对象的地址值
        而这里的s和sb记录的地址值是不一样的，所以结果返回false
        */
        System.out.println(sb.equals(s));// false
    }
}
