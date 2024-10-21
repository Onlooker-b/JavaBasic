package Day16.Demo;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

public class MyJFrame3 extends JFrame implements KeyListener{

    public MyJFrame3(){
        this.setSize(600, 600);
        this.setTitle("鼠标监听按钮演示");
        this.setAlwaysOnTop(true);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(3);
        this.setLayout(null);

        // 给整个窗体添加键盘监听
        this.addKeyListener(this);

        this.setVisible(true);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        
    }

    // 如果按下一个按键没有松开，会一直调用这个方法
    // 如果区分键盘里面的不同按键
    @Override
    public void keyPressed(KeyEvent e) {
        System.out.println("按下不松");
    }

    @Override
    public void keyReleased(KeyEvent e) {
        System.out.println("按下松开");
        // 编码和ASCII表没关系
        int code = e.getKeyCode();
        if (code == 65) {
            System.out.println("现在按的是A键");
        }else{
            System.out.println("不是A键");
        }
    }
}
