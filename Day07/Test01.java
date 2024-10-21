import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) {
        /*
         * 机票价格按照淡季旺季、头等舱和经济舱收费、输入机票原价、月份和头等舱或经济舱。
         * 按照如下规则计算机票价格：旺季（5-10月）头等舱9折，经济舱8.5折，淡季（11月到来年4月）头等舱7折，经济舱6.5折。
         */

        //1、键盘输入机票原价、月份、舱位
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入机票的原价： ");
        double ticket = sc.nextDouble();
        System.out.println("请输入当前的月份： ");
        int month = sc.nextInt();
        System.out.println("请输入机票的舱位： ");
        String seat = sc.next();
        //2、判断是淡旺季
        if(month>=5 && month<=10){
            ticket = get_Price(ticket, seat, 0.9, 0.85);
        }
        else if ((month>=11 && month<=12) || (month>=1 && month<=4)) {
            ticket = get_Price(ticket, seat, 0.7, 0.65);
        }
        else{
            System.out.println("你输入的月份有误！");
        }
        System.out.println("机票打折后的价格是： "+ticket);
    }
    public static double get_Price(double ticket,String seat,double v1,double v2){
        //v1是头等舱，v2是经济舱
        if(seat.equals("头等舱")){
            ticket = ticket * v1;
        }
        else if (seat.equals("经济舱")) {
            ticket = ticket * v2;
        }
        else{
            System.out.println("没有这个舱位！");
        }
        return ticket;
    }    
}
