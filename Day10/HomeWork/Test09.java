package Day10.HomeWork;

public class Test09 {
    // 两个字符串相乘，结果转变为字符串
    public static void main(String[] args) {
        String strA = "250";
        String StrB = "4";

        //int number = Integer.parseInt(str);
        int numberA = arrToInt(strA);
        int numberB = arrToInt(StrB);
        int result = numberA*numberB;
        System.out.println(result);

        //将int转变为String
        //String s = Integer.toString(result);
        //String s = String.valueOf(result);
        String r1 = intToString(result);
        String r2 = intToString2(result);
        System.out.println(r1.equals(r2));
    }

    //写一个字符串变int的方法
    public static int arrToInt(String str){
        char[] arr = str.toCharArray();
        //遍历获得字符
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            //'0'对应48
            char c = arr[i];
            result = result*10 + (int)(c-48);
        }
        return result;
    }
    //int变String
    public static String intToString(int number){       
        String s = "";
        while (number != 0) {
            //获取个位
            int ge = number % 10;
            //倒序放到s中
            s = ge + s;
            // 删除最右边的一位
            number = number / 10; 
        }
        return s;
    }
    
    public static String intToString2(int number) {
        // 处理负数
        boolean isNegative = false;
        if (number < 0) {
            isNegative = true;
            number = -number;
        }

        // 使用StringBuilder来构建字符串
        StringBuilder sb = new StringBuilder();
        do {
            int digit = number % 10;
            sb.append((char) ('0' + digit));
            number /= 10;
        } while (number > 0);

        // 如果是负数，添加负号
        if (isNegative) {
            sb.append('-');
        }

        // 反转StringBuilder得到正确的顺序
        sb.reverse();

        // 将StringBuilder转换为String并返回
        return sb.toString();
    }
}
