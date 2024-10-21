package Day19.a04string;

public class StringRegexDemo1 {
    public static void main(String[] args) {
        /*
         * 有一段字符串:小诗诗dqwefqwfqwfwq12312小丹丹dqwefqwfqwfwq12312小惠惠
         * 要求1:把字符串中三个姓名之间的字母替换为vs
         * 要求2:把字符串中的三个姓名切割出来
         */

        String s = "小诗诗dqwefqwfqwfwq12312小丹丹dqwefqwfqwfwq12312小惠惠";
        // 字母，数字，去除下划线，出现一次或多次
        String regex = "[\\w&&[^_]]+";
        String result1 = s.replaceAll(regex, "vs");
        System.out.println(result1);

        String[] arr = s.split(regex);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
