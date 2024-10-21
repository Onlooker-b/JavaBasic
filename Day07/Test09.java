import java.util.Random;
import java.util.Scanner;

public class Test09 {
    public static void main(String[] args) {
        //1、生成中奖号码
        int[] arr = createNumber();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"  ");
        }
        System.out.println("======================");
        //2、让用户输入他的彩票号码
        int[] userArr = userNumber();

        //3、判断中奖情况
        int redCount = 0;
        int blueCount = 0;

        //判断红球情况，只有前6个
        for (int i = 0; i < userArr.length-1; i++) {
            //号码只要存在于中奖号码中就算中奖，不需要位置相同
            int redNum = userArr[i];
            for (int j = 0; j < arr.length; j++) {
                if (redNum == arr[j]) {
                    //一旦能匹配上，中奖个数加1
                    redCount++;
                    //找到了，没必要继续比较了
                    break;
                }
            }
        }
        //判断蓝球
        int blueNum = userArr[userArr.length-1];
        if (blueNum == arr[arr.length-1]) {
            blueCount++;
        }
        System.out.println("红球中奖个数是： "+redCount);
        System.out.println("蓝球中奖个数是： "+blueCount);

        //4、根据数量判断中奖情况
        if (redCount==6 && blueCount==1) {
            System.out.println("一等奖");
        }else if(redCount==6 && blueCount==0){
            System.out.println("二等奖");
        }else if(redCount==5 && blueCount==1){
            System.out.println("三等奖");
        }else if((redCount==5 && blueCount==0) || (redCount==4 && blueCount==1)){
            System.out.println("四等奖");
        }else if((redCount==4 && blueCount==0) || (redCount==3 && blueCount==1)){
            System.out.println("五等奖");
        }else if((redCount==2 && blueCount==1) || (redCount==1 && blueCount==1) || (redCount==0 && blueCount==1)){
            System.out.println("六等奖");
        }else{
            System.out.println("未中奖");
        }
    }

    //写一个生成中奖号码的方法
    public static int[] createNumber(){
        //1、创建数组：6个红球，1个蓝球
        int[] arr = new int[7];
        //2、随机生成号码
        //红球号码不能重复（1-33），蓝球可以和红球的号码重复（1-16）
        Random r = new Random();
        for (int i = 0; i < 6;) {
            //随机从1-33里面抽一个数出来，放到数组中
            int redNum = r.nextInt(33) + 1;
            //要判断这个数是不是已经存在了
            if (contains(arr, redNum) == false) {
                //不存在，就把这个数添加到数组中
                arr[i] = redNum;
                //只有成功添加，才往后走
                i++;
            }
        }
        //蓝球号码直接添加
        int blueNum = r.nextInt(16) + 1;
        arr[6] = blueNum;
        
        return arr;
    }
    public static boolean contains(int[] arr, int redNum){
        for (int i = 0; i < arr.length; i++) {
            if (redNum == arr[i]) {
                return true;
            }
        }
        return false;
    }

    //写一个方法让用户输入自己购买的彩票号码
    public static int[] userNumber(){
        //也是6红1蓝
        int[] arr = new int[7];
        //用户输入
        Scanner sc = new Scanner(System.in);
        //用户输入6个红球的数字
        for (int i = 0; i < 6;) {
            System.out.println("请输入第"+(i+1)+"个红球的号码：");
            int redNum = sc.nextInt();
            //要判断红球数字的范围
            if (redNum >=1 && redNum<=33) {
                //判断有没有重复输入
                if (contains(arr, redNum) == false) {
                    arr[i] = redNum;
                    i++;
                }else{
                    System.out.println("当前红球号码已存在，请重新输入");
                }
            } else {
                System.out.println("你输入的红球号码超出了范围！");
            }
        }
        //用户输入蓝球数字
        System.out.println("请输入蓝球的号码");
        int blueNum = sc.nextInt();
        //判断范围
        if (blueNum >=1 && blueNum <=16) {
            arr[6] = blueNum;
        } else {
            System.out.println("你输入的蓝球号码超出了范围");
        }

        return arr;
    }
}
