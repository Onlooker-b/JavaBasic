package Day16.Demo;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyJFrame2 extends JFrame implements MouseListener{
    
    // 创建一个按钮
    JButton jb1 = new JButton("按钮1");

    public MyJFrame2(){
        this.setSize(600,600);
        this.setTitle("鼠标监听按钮演示");
        this.setAlwaysOnTop(true);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(3);
        this.setLayout(null);

        jb1.setBounds(0, 0, 100, 50);
        // 给这个按钮设置鼠标监听
        // this表示执行本类中方法
        jb1.addMouseListener(this);


        this.getContentPane().add(jb1);
        this.setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("单击");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println("按下不松");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("按下松开");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println("鼠标滑入");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println("鼠标滑出");
    }
}
