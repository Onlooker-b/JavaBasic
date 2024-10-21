package Day10.HomeWork;

public class Test08 {
    /* 现有如下文本：
       "Java语言是面向对象的，Java语言是健壮的，Java语言是安全的，Java是高性能的，Java语言是跨平台的"。请编写程序，
     * 统计该文本中"Java"一词出现的次数。 */
    public static void main(String[] args) {
        String s = "Java语言是面向对象的，Java语言是健壮的，Java语言是安全的，Java是高性能的，Java语言是跨平台的";
        /*
         * // 查找参数字符串str在调用方法的字符串中第一次出现的索引，如果不存在，返回-1
         * public int indexOf(String str)
         * 
         * // 截取字符串，从索引beginIndex（包含）开始到字符串的结尾
         * public String substring(int beginIndex)
         */
        System.out.println(search(s, "Java"));
    }

    public static int search(String str, String tar) {
        int count = 0;
        int index = -1;
        //只要返回的索引不是-1，就一直执行
        while ((index = str.indexOf(tar)) != -1) {
            //次数累计
            count++;
            //截取出现这个java的之后的字符串
            /* str.indexOf("Java")的返回值是0
             * Java的长度是4
             * 之后的检索应该从3（包含）开始 */
            int len = tar.length();
            str = str.substring(index+len); //-1+4
        }
        return count;
    }
}
