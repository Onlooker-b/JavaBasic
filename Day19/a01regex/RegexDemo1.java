package Day19.a01regex;

public class RegexDemo1 {
    public static void main(String[] args) {
        String qq = "1n234567890";
        System.out.println(checkQQ(qq));

        // 正则表达式
        System.out.println(qq.matches("[1-9]\\d{5,19}"));

    }

    public static boolean checkQQ(String qq){
        // 6到20位的纯数字，0不在开头
        int len = qq.length();
        if (len < 6 || len > 20) {
            return false;
        }
        char c = qq.charAt(0);
        if (c == '0') {
            return false;
        }
        for (int i = 0; i < len; i++) {
            char c1 = qq.charAt(i);
            if (c1 < '0' || c1 > '9') {
                return false;
            }
        }
        return true;
    }
}
