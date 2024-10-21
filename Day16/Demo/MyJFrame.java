package Day16.Demo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyJFrame extends JFrame implements ActionListener{
    
    JButton jb1 = new JButton("按钮1");
    JButton jb2 = new JButton("按钮2");

    public MyJFrame(){
        this.setSize(600,680);
        this.setTitle("动作监听按钮演示窗口");
        this.setAlwaysOnTop(true);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(3);
        this.setLayout(null);

        // 创建一个按钮对象
        jb1.setBounds(0, 0, 100, 50);
        jb1.addActionListener(this);

        // 创建第二个按钮对象
        jb2.setBounds(100, 0, 100, 50);     
        jb2.addActionListener(this);
        
        this.add(jb1);
        this.add(jb2);
        this.setVisible(true);
    }
    // 编写按钮点击之后的效果
    @Override
    public void actionPerformed(ActionEvent e) {
        // 对当前按钮进行判断
        Object ob = e.getSource();
        if (ob == jb1) {
            jb1.setSize(200,200);
        }else{
            Random r = new Random();
            jb2.setLocation(r.nextInt(500),r.nextInt(500));
        }
    }
    
}
