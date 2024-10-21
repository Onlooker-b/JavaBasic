package Day13.homework.Demo2;

public class Huawei extends Phone{
    private String color;

    public Huawei() {
    }
    public Huawei(String brand, double price, String color) {
        super(brand, price);
        this.color = color;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    } 
    @Override
    public void call(){
        System.out.println("华为打电话");
    }

}
