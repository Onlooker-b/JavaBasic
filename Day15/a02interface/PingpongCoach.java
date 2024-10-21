package Day15.a02interface;

public class PingpongCoach extends Coach implements English{
    
    public PingpongCoach(){}
    public PingpongCoach(String name, int age){
        super(name, age);
    }
    @Override
    public void teach() {
        System.out.println("乒乓球教练教授乒乓球");
    }
    @Override
    public void speakEnglish() {
        System.out.println("乒乓球教练说英语");
    }
}
