package Day16.src.ui;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class LoginJFrame extends JFrame{
    // 创建一个登录的界面
    public LoginJFrame(){
        this.setSize(488, 430);
        this.setVisible(true);
        // 设置界面的标题
        this.setTitle("拼图登录界面");
        // 设置界面指定
        this.setAlwaysOnTop(true);
        // 设置界面居中
        this.setLocationRelativeTo(null);
        // 设置关闭模式，关闭窗口直接停止java虚拟机。或者写3
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
