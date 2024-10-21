package Day08;

public class PhoneTest {
    public static void main(String[] args) {
        Phone p1 = new Phone();
        p1.brand = "小米";
        p1.price = 3000.00;
        p1.call();
        p1.playGame();

        Phone p2 = new Phone();
        p2.brand = "华为";
        p2.price = 39990.00;
        p2.call();
        p2.playGame();
    }
}
