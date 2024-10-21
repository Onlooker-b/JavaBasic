package Day09.Test05;

public class PhoneTest {
    public static void main(String[] args) {
        //1、创建一个手机数组
        Phone[] arr = new Phone[4];

        //2、创建手机对象
        Phone p1 = new Phone("小米", 1999, "白色");
        Phone p2 = new Phone("华为", 4999, "蓝色");
        Phone p3 = new Phone("魅族", 3999, "红色");
        Phone p4 = new Phone("苹果", 2999, "红色");

        //3、手机对象添加到手机数组中
        arr[0] = p1;
        arr[1] = p2;
        arr[2] = p3;
        arr[3] = p4;

        //4、从数组中循环取出价格
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            Phone p = arr[i];
            sum = sum + p.getPrice();
        }

        //5、求平均值
        double avg = (double)(sum) / arr.length;
        System.out.println("平均价格是："+avg);

        //6、找出价格高于平均值的手机个数
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getPrice() > avg) {
                count++;
                System.out.println(arr[i].getBrand()+arr[i].getColor()+arr[i].getPrice());
            }
        }
        System.out.printf("高于平均价格的手机有%s个",count);
    }

}
