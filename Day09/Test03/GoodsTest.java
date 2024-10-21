package Day09.Test03;

public class GoodsTest {
    public static void main(String[] args) {
        //1、创建一个数组
        Goods[] arr = new Goods[3];
        //2、创建三个对象
        Goods g1 = new Goods("001", "华为", 5999.0, 100);
        Goods g2 = new Goods("002", "保温杯", 300.0, 50);
        Goods g3 = new Goods("003", "枸杞", 9.9, 70);
        //3、添加到数组
        arr[0] = g1;
        arr[1] = g2;
        arr[2] = g3;

        for (int i = 0; i < arr.length; i++) {
            Goods g = arr[i];
            System.out.printf("编号是：%s，名字是：%s，价格是：%s，库存还有：%s",g.getId(),g.getName(),g.getPrice(),g.getCount());
            System.out.println();
        }
    }
}
