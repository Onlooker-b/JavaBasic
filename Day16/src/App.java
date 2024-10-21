package Day16.src;

import Day16.src.ui.GameJFrame;
import Day16.src.ui.LoginJFrame;
import Day16.src.ui.RegisterJFrame;

public class App {
    public static void main(String[] args) {
        // 表示程序启动入口
        // 如果我们想要开启一个界面，就创建谁的对象就可以了
        new GameJFrame();
        //new LoginJFrame();
        //new RegisterJFrame();
    }
}
