package Day15.a02interface;

public class PingpongSport extends Sporter implements English{

    public PingpongSport(){}
    public PingpongSport(String name, int age){
        super(name, age);
    }
    @Override
    public void speakEnglish() {
        System.out.println("乒乓球运动员学英语");
    }

    @Override
    public void study() {
        System.out.println("乒乓球运动员练习乒乓球");
    }
    
}
