package Day13.a03extendsdemo1;

public class ChineseDog extends Dog{
    // 完全不需要父类中的吃狗粮
    @Override
    public void eat(){
        System.out.println("中华田园犬吃剩饭");
    }
}
