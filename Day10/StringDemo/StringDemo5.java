package Day10.StringDemo;

import java.util.Scanner;

public class StringDemo5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int money;
        while (true) {
            System.out.println("请输入金额：");
            money = sc.nextInt();
            if (money >= 0 && money <= 9999999) {
                break;
            } else {
                System.out.println("金额无效！");
            }
        }
        //1、获取整数中的每一位
        String moneyStr = "";
        while (true) { //1234
            //获取最右边的一位
            int ge = money % 10; 
            String capticalNum = getCapital(ge); //3
            //将转变为大写的汉字倒序放到字符串中
            moneyStr = capticalNum + moneyStr; //3+4
            //删除最右边的一位
            money = money / 10;
            //知道money等于0时，数字已经全部取出，循环结束
            if (money == 0) {
                break;
            }
        }
        System.out.println(moneyStr);

        //2、补齐7位
        int count = 7 - moneyStr.length();
        for (int i = 0; i < count; i++) {
            moneyStr = "零" + moneyStr;
        }
        System.out.println(moneyStr);

        //3、每一位后插入单位
        String result = "";
        String[] arr = { "佰", "拾", "万", "仟", "佰", "拾", "元" };
        for (int i = 0; i < moneyStr.length(); i++) {
            char c = moneyStr.charAt(i);
            //大写数字与单位拼在一起
            result = result + c + arr[i];
        }
        System.out.println(result);
    }
    public static String getCapital(int number){
        String[] arr = {"零","壹","贰","叁","肆","伍","陆","柒","捌","玖"};
        return arr[number];
    }
}
