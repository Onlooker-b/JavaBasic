package Day13.a01staticdemo1;

public class Test {
    public static void main(String[] args) {
        // 测试工具类中的方法
        int[] arr1 = {1,2,3,4,5};
        String s1 = ArryUtil.printArr(arr1);
        System.out.println(s1);

        double[] arr2 = {1.1, 2.2, 3.3, 4.4, 5.5};
        double s2 = ArryUtil.getAverage(arr2);
        System.out.println(s2);
    }
}
