public class Test02 {
    public static void main(String[] args) {
        // 判断 101 ~ 200 之间有多少个素数，并打印所有素数
        int count = 0;
        for (int i = 101; i <= 200; i++) {
            boolean flag = true;
            // 第一个循环遍历101-200，第二个循环用来把i除以所有小于它的数，判断是否为素数
            for (int j = 2; j < i; j++) {
                if (i%j == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.println("当前数字" + i + "是素数");
                count++;
            }
        }
        System.out.println("101到200共有"+count+"个素数");
    }
}
