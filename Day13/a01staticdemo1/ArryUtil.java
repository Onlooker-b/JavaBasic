package Day13.a01staticdemo1;

public class ArryUtil {
    
    // 私有化构造方法，不让外界创建这个类的对象
    private ArryUtil(){};

    // 工具类中的方法要写成静态的方法，方便使用类名直接调用
    public static String printArr(int[] arr){
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length-1) {
                sb.append(arr[i]).append("]");
            }else{
                sb.append(arr[i]).append("，");
            }
        }
        return sb.toString();
    }

    // 返回小数类型的平均数
    public static double getAverage(double[] arr){
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];           
        }
        return sum/arr.length;
    }
}
