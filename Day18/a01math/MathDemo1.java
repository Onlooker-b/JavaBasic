package Day18.a01math;

public class MathDemo1 {
    public static void main(String[] args) {
        
        // abs 获取参数绝对值
        System.out.println(Math.abs(-9));
        /*
         * bug:
         * int类型的取值范围是：-2147483648 ~ 2147483647
         * 取不了-2147483648的绝对值
         */

         // 向上取整，进一法；
        System.out.println(Math.ceil(12.34));
        System.out.println(Math.ceil(-12.54));

        // 向下取整，舍去
        System.out.println(Math.floor(12.34));
        System.out.println(Math.floor(-12.34));

        // 四舍五入
        System.out.println(Math.round(12.34));
        System.out.println(Math.round(12.54));

        // 返回较大值
        System.out.println(Math.max(20,30));
        // 返回较小值
        System.out.println(Math.min(20, 30));

        // 获取a的b次幂'
        System.out.println(Math.pow(2, 3));
        System.out.println(Math.pow(4, 0.5)); // 开方

        // 开平方根
        System.out.println(Math.sqrt(4));
        // 开立方根
        System.out.println(Math.cbrt(8));

        for (int i = 0; i <10; i++) {
            System.out.println(Math.floor(Math.random() * 100 +1));
        }
    }
}
