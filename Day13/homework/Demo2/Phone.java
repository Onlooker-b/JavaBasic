package Day13.homework.Demo2;

public class Phone {
    private String brand;
    private double price;
    public static int size = 6;

    public Phone() {
    }
    public Phone(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public static int getSize() {
        return size;
    }
    public static void setSize(int size) {
        Phone.size = size;
    }

    public void call(){
        System.out.println("打电话");
    }

}
