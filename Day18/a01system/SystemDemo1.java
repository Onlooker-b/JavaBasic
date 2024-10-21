package Day18.a01system;

public class SystemDemo1 {
    public static void main(String[] args) {
        /*
         * public static void exit(int status) 终止当前运行的Java 虚拟机
         * public static long currentTimeMillis() 返回当前系统的时间毫秒值形式
         * public static void arraycopy( 数据源数组，起始索引，目的地数组，起始索引，拷贝个数) 数组拷贝
         */

        // 方法的形参: 状态码
        // 0:表示当前虚拟机是正常停止
        // 非0:表示当前虚拟机异常停止
        // System.exit(0);
        System.out.println("看看我执行了吗? ");
        // 以拼图小游戏为例:
        // 当我们需要把整个程序就结束的时候，就可以调用这个方法.

        long l = System.currentTimeMillis();
        System.out.println(l);

        // 拷贝数组
        int[] arr1 = {1,2,3,4,5,6,7,8,9,10};
        int[] arr2 = new int[10];
        System.arraycopy(arr1, 0, arr2, 0, 10);
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + "  ");
        }

        System.out.println();
        int[] arr3 = new int[10];
        System.arraycopy(arr1, 6, arr3, 3, 3);
        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i] + "  ");
        }
    }
}
