package Day18.a03runtime;

import java.io.IOException;

public class RuntimeDemo1 {
    public static void main(String[] args) {
        /*
         * public static Runtime getRuntime() 当前系统的运行环境对象
         * public void exit(int status) 停止虚拟机
         * public int availableProcessors() 获得CPU的线程数
         * public long maxMemory() JVM能从系统中获取总内存大小(单位byte)
         * public long totalMemory() JVM已经从系统中获取总内存大小(单位byte)
         * public long freeMemory() JVM剩余内存大小(单位byte)
         * public Process exec(string command) 运行cmd命令
         */

        // 1、获取Runtime的对象
        Runtime r1 = Runtime.getRuntime();
        Runtime r2 = Runtime.getRuntime();
        System.out.println(r1 == r2); // 只有一个运行环境对象

        // 2、停止虚拟机
        //Runtime.getRuntime().exit(0);
        System.out.println("看看我执行了吗");

        // 3、获取CPU的线程数
        System.out.println(Runtime.getRuntime().availableProcessors());

        // 4、JVM能从系统中获取总内存大小(单位byte)
        System.out.println(Runtime.getRuntime().maxMemory() /1024 /1024);

        // 5、JVM已经从系统中获取总内存大小(单位byte)
        System.out.println(Runtime.getRuntime().totalMemory() /1024 /1024);

        // 6、JVM剩余内存大小(单位byte)
        System.out.println(Runtime.getRuntime().freeMemory() / 1024 / 1024);

        // 7、运行cmd命令
            //Runtime.getRuntime().exec("notepad");

        /*
         * shutdown：关机
         * 加上参数才能执行
         * -s: 默认一分钟之后关机
         * -s -t: 指定时间关机，单位是秒
         * -a: 取消关机操作
         * -r: 关机并重启
         */
        try {
            Runtime.getRuntime().exec("cmd /c shutdown -s -f ");
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println("hfkjsdf");
    }
}
