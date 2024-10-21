package Day16.Demo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Test02 {
    public static void main(String[] args) {
        JFrame jf = new JFrame();
        jf.setSize(600,680);
        jf.setTitle("事件演示窗口");
        jf.setAlwaysOnTop(true);
        jf.setLocationRelativeTo(null);
        jf.setDefaultCloseOperation(3);
        jf.setLayout(null);

        // 创建一个按钮对象
        JButton jb = new JButton("点击");
        jb.setBounds(0, 0, 100, 50);
        // 给按钮添加监听对象，鼠标点击或空格
        // 空格传入的参数是ActionListener对象，代表点击这个按钮会发生的事件
        // MyActionListener a = new MyActionListener();
        // jb.addActionListener(a);

        // 因为这个MyActionListener只会被用一次，所以使用匿名内部类
        jb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("按钮被点击了");
            }           
        });
        // 把按钮放到jf上
        jf.getContentPane().add(jb);

        jf.setVisible(true);
    }
}
